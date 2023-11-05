package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sample.user.UserDTO;

public final class manager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("        <script defer src=\"https://cdn.jsdelivr.net/npm/alpinejs@3.x.x/dist/cdn.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\n");
      out.write("        <script>document.documentElement.classList.add('js')</script>\n");
      out.write("        <script src=\"https://unpkg.com/taos@1.0.5/dist/taos.js\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/936766a5f7.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"area.css\">\n");
      out.write("        <title>Area</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("        .h-60{\n");
      out.write("            height: 14rem;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .w-128{\n");
      out.write("            width: 32rem;\n");
      out.write("        }\n");
      out.write("        button {\n");
      out.write("            z-index: 1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button::after {\n");
      out.write("            content: '';\n");
      out.write("            z-index: -1;\n");
      out.write("            position: absolute;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            right: 0;\n");
      out.write("            bottom: 0;\n");
      out.write("            transform: translateX(-100%);\n");
      out.write("            transition: transform 600ms cubic-bezier(0, .70, .60, 1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:hover::after {\n");
      out.write("            transform: translateX(0);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .fade-in {\n");
      out.write("            opacity: 1;\n");
      out.write("            animation-name: fadeInOpacity;\n");
      out.write("            animation-iteration-count: 1;\n");
      out.write("            animation-timing-function: ease-in;\n");
      out.write("            animation-duration: 2s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @keyframes fadeInOpacity {\n");
      out.write("            0% {\n");
      out.write("                opacity: 0;\n");
      out.write("            }\n");
      out.write("            100% {\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Define the initial state of the element */\n");
      out.write("        .fade-in {\n");
      out.write("            opacity: 0;\n");
      out.write("            transform: translateY(10px); /* Optional: Add a slight vertical translation */\n");
      out.write("            transition: opacity 0.5s ease, transform 0.5s ease; /* Add the transition */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Define the state when the element is visible */\n");
      out.write("        .fade-in.active {\n");
      out.write("            opacity: 1;\n");
      out.write("            transform: translateY(0); /* Reset the vertical translation */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    ");

        UserDTO loginUser = (UserDTO) session.getAttribute("LOGIN_USER");
        if (loginUser == null || !"MANAGER".equals(loginUser.getRoleID())) {
            response.sendRedirect("login.html");
            return;
        }
        String search = request.getParameter("search");
        if (search == null) {
            search = "";
        }
    
      out.write("\n");
      out.write("    <body class=\"bg-[url('img/grassy-field-with-trees-giraffes-walking-around-with-light-blue-sky-background.jpg')]\" style=\"width: 100%;\" >\n");
      out.write("        <!-- header -->\n");
      out.write("        <nav class=\"border-gray-200 bg-green-600\">\n");
      out.write("            <div class=\"flex p-1\">\n");
      out.write("                <!-- logo -->\n");
      out.write("                <a href=\"homepage.jsp\" class=\"flex items-center justify-center w-1/2\">\n");
      out.write("                    <div class=\"\">\n");
      out.write("                        <img src=\"img/logo2.png\" class=\"h-20 text-xl\" alt=\"Logo\" />\n");
      out.write("                    </div>\n");
      out.write("                    <span\n");
      out.write("                        class=\"self-center text-4xl font-extralight whitespace-nowrap dark:text-white\"\n");
      out.write("                        >Wild World Zoo</span\n");
      out.write("                    >\n");
      out.write("                </a>\n");
      out.write("                <!-- end logo -->\n");
      out.write("                <!-- navbar -->\n");
      out.write("                <div\n");
      out.write("                    class=\"items-center justify-between hidden w-full md:flex md:w-auto md:order-1 w-full\"\n");
      out.write("                    id=\"navbar-user\"\n");
      out.write("                    >\n");
      out.write("                    <ul\n");
      out.write("                        class=\"flex flex-col md:p-0 mt-4 borderrounded-lg md:flex-row md:space-x-8 md:mt-0 md:border-0\"\n");
      out.write("                        >\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"class=\"navbar-text block py-4 pl-4 text-2xl text-gray-900 rounded before:ease relative h-18 w-full overflow-hidden text-white transition-all before:absolute before:right-0 before:top-0 before:h-16 before:w-6 before:translate-x-8 before:fa-rotate-2 before:bg-green-300 before:opacity-4 before:duration-700 hover:shadow-xl hover:before:-translate-x-40 hover:bg-green-700\" aria-current=\"page\"\n");
      out.write("                               >ZOO MANAGER  </a\n");
      out.write("                            >\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a\n");
      out.write("                                href=\"#\"\n");
      out.write("                                class=\"navbar-text block py-4 pl-4 ml-52 text-2xl text-gray-900 rounded before:ease relative h-18 w-full overflow-hidden text-white transition-all before:absolute before:right-0 before:top-0 before:h-16 before:w-6 before:translate-x-8 before:fa-rotate-2 before:bg-green-300 before:opacity-4 before:duration-700 hover:shadow-xl hover:before:-translate-x-40 hover:bg-green-700\"\n");
      out.write("                                aria-current=\"page\"\n");
      out.write("                                >Login as: ");
      out.print(loginUser.getFullname());
      out.write("  </a\n");
      out.write("                            >\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- end navbar -->\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- end header --> \n");
      out.write("\n");
      out.write("        <!--SIDE BAR HERE-->\n");
      out.write("        <nav class=\"z-20 flex shrink-0 grow-0 justify-around gap-4 border-t border-gray-200 bg-white/50 p-2.5 shadow-lg backdrop-blur-lg dark:border-slate-600/60 dark:bg-slate-800/50 fixed top-2/4 -translate-y-2/4 left-6 min-h-[auto] min-w-[64px] flex-col rounded-lg border\">\n");
      out.write("            <b href=\"#area\" class=\"flex aspect-square min-h-[32px] w-16 flex-col items-center justify-center gap-1 rounded-md p-1.5 bg-indigo-50 text-indigo-600 dark:bg-sky-900 dark:text-sky-50\">\n");
      out.write("                <!-- HeroIcon - User -->\n");
      out.write("                <i class=\"fa-regular fa-folder-open\"></i>\n");
      out.write("                <small class=\"text-center text-xs font-medium\"> Area </small>\n");
      out.write("            </b>\n");
      out.write("\n");
      out.write("            <a href=\"/ListFeedback\"class=\"flex aspect-square min-h-[32px] w-16 flex-col items-center justify-center gap-1 rounded-md p-1.5 text-gray-700 hover:bg-gray-100 dark:text-gray-400 dark:hover:bg-slate-800\">\n");
      out.write("                <!-- HeroIcon - Chart Bar -->\n");
      out.write("                <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\" stroke=\"currentColor\" class=\"w-6 h-6\">\n");
      out.write("                <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M21 7.5l-9-5.25L3 7.5m18 0l-9 5.25m9-5.25v9l-9 5.25M3 7.5l9 5.25M3 7.5v9l9 5.25m0-9v9\" />\n");
      out.write("                </svg>\n");
      out.write("                <small class=\"text-center text-xs font-medium\"> Feedback </small>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <a href=\"/NewsControl\" class=\"flex aspect-square min-h-[32px] w-16 flex-col items-center justify-center gap-1 rounded-md p-1.5 text-gray-700 hover:bg-gray-100 dark:text-gray-400 dark:hover:bg-slate-800\">\n");
      out.write("                <!-- HeroIcon - Cog-6-tooth -->\n");
      out.write("                <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\" stroke=\"currentColor\" class=\"w-6 h-6\">\n");
      out.write("                <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M15 19.128a9.38 9.38 0 002.625.372 9.337 9.337 0 004.121-.952 4.125 4.125 0 00-7.533-2.493M15 19.128v-.003c0-1.113-.285-2.16-.786-3.07M15 19.128v.106A12.318 12.318 0 018.624 21c-2.331 0-4.512-.645-6.374-1.766l-.001-.109a6.375 6.375 0 0111.964-3.07M12 6.375a3.375 3.375 0 11-6.75 0 3.375 3.375 0 016.75 0zm8.25 2.25a2.625 2.625 0 11-5.25 0 2.625 2.625 0 015.25 0z\" />\n");
      out.write("                </svg>     \n");
      out.write("                <small class=\"text-center text-xs font-medium\"> News</small>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <hr class=\"dark:border-gray-700/60\" />\n");
      out.write("\n");
      out.write("            <a href=\"MainController?action=logout\" class=\"flex h-16 w-16 flex-col items-center justify-center gap-1 text-fuchsia-900 dark:text-gray-400\" >\n");
      out.write("                <!-- HeroIcon - Home Modern -->\n");
      out.write("                <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\" stroke=\"currentColor\" class=\"w-6 h-6\">\n");
      out.write("                <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M15 9h3.75M15 12h3.75M15 15h3.75M4.5 19.5h15a2.25 2.25 0 002.25-2.25V6.75A2.25 2.25 0 0019.5 4.5h-15a2.25 2.25 0 00-2.25 2.25v10.5A2.25 2.25 0 004.5 19.5zm6-10.125a1.875 1.875 0 11-3.75 0 1.875 1.875 0 013.75 0zm1.294 6.336a6.721 6.721 0 01-3.17.789 6.721 6.721 0 01-3.168-.789 3.376 3.376 0 016.338 0z\" />\n");
      out.write("                </svg>\n");
      out.write("                <small className=\"text-xs font-medium\">Log out</small>\n");
      out.write("            </a>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Area List here-->\n");
      out.write("        <!--area A B-->\n");
      out.write("\n");
      out.write("        <div class=\"fade-in flex justify-center\">\n");
      out.write("            <div class=\"max-w-screen-md\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                    $(\".fade-in\").addClass(\"active\");\n");
      out.write("                });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"mt-10 fade-in\">\n");
          out.write("                        <div id=\"app\" class=\"fade-in bg-white h-60 rounded shadow-md flex card text-grey-darkest\">\n");
          out.write("                            <img class=\"w-1/2 h-full rounded-l-sm\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.getPhoto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Room Image\" style=\"width : 200px\">\n");
          out.write("                            <div class=\"w-full flex flex-col\">\n");
          out.write("                                <div class=\"p-4 pb-0 flex-1\">\n");
          out.write("                                    <h3 class=\"font-normal mb-7 text-grey-darkest\">Location ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.arealocation}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("                                    <span class=\"text-5xl text-grey-darkest\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.genre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                                <button class=\"relative overflow-hidden rounded shadow-inner px-2 py-3 font-sans uppercase ring-sky-500 transition-all after:bg-green-400 active:shadow-md active:ring-2\">\n");
          out.write("                                    <p class=\"transition-all group-active:scale-90\"><a href=\"/animalcagesearch?areaid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.area_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">View <i class=\"ml-36 fas fa-chevron-right\"></i> </a> </p>\n");
          out.write("                                </button>\n");
          out.write("                                <button class=\"relative overflow-hidden rounded shadow-inner px-2 py-3 font-sans uppercase ring-sky-500 transition-all after:bg-yellow-400 active:shadow-md active:ring-2\">\n");
          out.write("                                    <p class=\"transition-all group-active:scale-90\">Manage <i class=\"ml-28 fas fa-chevron-right\"></i></p>\n");
          out.write("                                </button>\n");
          out.write("                            </div>    \n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
