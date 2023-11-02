/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controllers;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import sample.user.UserDAO;
import sample.user.UserDTO;
import sample.user.UserError;

/**
 *
 *
 */
@WebServlet(name = "CreateController", urlPatterns = {"/CreateController"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024,
        maxFileSize = 1024 * 1024 * 5,
        maxRequestSize = 1024 * 1024 * 5 * 5)
public class CreateController extends HttpServlet {

    private final String DEFAULT_FILENAME = "default.file";
    private static final String ERROR = "create.html";
    private static final String SUCCESS = "SearchController";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        UserError userError = new UserError();

        try {
            UserDAO dao = new UserDAO();
            boolean checkValidation = true;
            String fullName = request.getParameter("fullName");
            String Phone = request.getParameter("Phone");
            String Email = request.getParameter("Email");
            String Gender = request.getParameter("Gender");
            String Dependent = request.getParameter("Dependent");
            String roleID = request.getParameter("roleID");
            String password = request.getParameter("password");
            String confirm = request.getParameter("confirm");
            if (fullName.length() < 5 || fullName.length() > 25) {
                userError.setUserIDError("Full Name must be in [5,25]");
                checkValidation = false;
            }
            if (!password.equals(confirm)) {
                userError.setConfirmError("Those password does not match");
                checkValidation = false;
            }
            String photo = uploadFile(request);
            if (checkValidation) {
                String employeeID = dao.getNewID();
                UserDTO user = new UserDTO(employeeID, password, fullName, Phone, Email, Gender, Dependent, roleID);
                user.setPhoto(photo);
                //boolean checkInsert = dao.insert(user);
                boolean checkInsert = dao.insertv2(user);

                if (checkInsert) {
                    url = SUCCESS;
                    request.setAttribute("ERROR", "Create Acount Successfull");
                } else {
                    userError.setError("Unknow error");
                    request.setAttribute("USER_ERROR", userError);
                    request.setAttribute("ERROR", "Create Acount Fail");
                }
            } else {
                request.setAttribute("USER_ERROR", userError);
                request.setAttribute("ERROR", "Create Acount Fail");
            }
        } catch (Exception e) {
            log("Error at CreateController: " + e.toString());
            if (e.toString().contains("duplicate")) {
                userError.setUserIDError("trung khoa chinh r");
                request.setAttribute("USER_ERROR", userError);

                //cái naỳ chưa xử lý nè
            }
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
        }
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
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
