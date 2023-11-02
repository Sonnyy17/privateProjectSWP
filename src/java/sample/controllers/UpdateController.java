package sample.controllers;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import sample.user.UserDAO;
import sample.user.UserDTO;

@WebServlet(name = "UpdateController", urlPatterns = {"/UpdateController"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024,
        maxFileSize = 1024 * 1024 * 5,
        maxRequestSize = 1024 * 1024 * 5 * 5)
public class UpdateController extends HttpServlet {

    private final String DEFAULT_FILENAME = "default.file";
    private static final String ERROR = "SearchController";
    private static final String SUCCESS = "SearchController";
    private static final String SUCCESS0 = "update.jsp";

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String Employee_ID = request.getParameter("userID");
            UserDAO dao = new UserDAO();
            UserDTO Eployee = dao.getEmployee(Employee_ID);
            if (Eployee != null) {
                request.setAttribute("user", Eployee);
                request.getRequestDispatcher(SUCCESS0).forward(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String userID = request.getParameter("userID");
            String fullName = request.getParameter("FullName");

            String phone = request.getParameter("Phone");
            String email = request.getParameter("Email");
            String gender = request.getParameter("Gender");
            String photo = uploadFile(request);
            if (photo == null || photo.equals(DEFAULT_FILENAME)) {
                photo = request.getParameter("photo");
            }

            String roleID = request.getParameter("roleID");
            UserDTO loginUser = (UserDTO) request.getSession().getAttribute("LOGIN_USER");
            UserDAO dao = new UserDAO();
            UserDTO user = new UserDTO(userID, photo, fullName, phone, email, gender, photo, roleID);
            boolean checkUpdate = dao.update(user);

//             HttpSession session = request.getSession();
//            UserDTO loginUser = (UserDTO) session.getAttribute("LOGIN_USER");
            if (checkUpdate) {
                request.setAttribute("ERROR", "Update Acount Successfull");
                if (loginUser != null) {

                    if (loginUser.getEmployee_id().equals(userID)) {
                        request.setAttribute("ERROR", "Update Your Acount Successfull");
                        loginUser.setFullname(fullName);
                        loginUser.setPhone(phone);
                        loginUser.setEmail(email);
                        loginUser.setGender(gender);
                        loginUser.setPhoto(photo);
                        loginUser.setRoleID(roleID);

                    }
                }

            } else {
                request.setAttribute("ERROR", "Update Acount Fail");
            }

//            if (checkUpdate) {
//                if (userID.equals(loginUser.getUserID())) {
//                    loginUser.setFullName(fullName);
//                    loginUser.setRoleID(roleID);
//                    session.setAttribute("LOGIN_USER", loginUser);
//                } else {
//                    url = SUCCESS;
//                }
//            }
        } catch (Exception e) {
            log("Error at DeleteController: " + e.toString());
        } finally {
            request.getRequestDispatcher(SUCCESS).forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String getFileName(Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf("=") + 2, content.length() - 1);
            }
        }
        return DEFAULT_FILENAME;
    }

    private String uploadFile(HttpServletRequest request) {
        try {
            int length = getServletContext().getRealPath("/").length();
            String uploadPath = new StringBuilder(getServletContext().getRealPath("/")).delete(length - 10, length - 4).toString() + File.separator + "img";
            File uploadDir = new File(uploadPath);
            if (!uploadDir.exists()) {
                uploadDir.mkdir();
            }
            String fileName = "";
            for (Part part : request.getParts()) {
                fileName = getFileName(part);
                if (!fileName.equals(DEFAULT_FILENAME)) {
                    part.write(uploadPath + File.separator + fileName);
                    return fileName;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(UpdateController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
