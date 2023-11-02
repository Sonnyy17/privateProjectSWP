package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class My_005fcart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/components/header.html");
    _jspx_dependants.add("/components/breadcrumb.html");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_pattern_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.release();
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
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("    <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/flowbite/1.8.1/flowbite.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("    <link href=\"./css/tailwind.css\" rel=\"stylesheet\" />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css\"\n");
      out.write("    />\n");
      out.write("    <script\n");
      out.write("      src=\"https://cdn.jsdelivr.net/gh/alpinejs/alpine@v2.x.x/dist/alpine.js\"\n");
      out.write("      defer\n");
      out.write("    ></script>\n");
      out.write("    <script\n");
      out.write("      src=\"https://kit.fontawesome.com/5b0b34b925.js\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("    <title>Choose ticket</title>\n");
      out.write("    <style>\n");
      out.write("      [x-cloak] {\n");
      out.write("        display: none;\n");
      out.write("      }\n");
      out.write("      /* Styling for the confirmation popup */\n");
      out.write("      .popup-container {\n");
      out.write("        display: none;\n");
      out.write("        position: fixed;\n");
      out.write("        top: 0;\n");
      out.write("        left: 0;\n");
      out.write("        width: 100%;\n");
      out.write("        height: 100%;\n");
      out.write("        background-color: rgba(0, 0, 0, 0.5);\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("        z-index: 2;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .popup-box {\n");
      out.write("        background-color: white;\n");
      out.write("        padding: 20px;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);\n");
      out.write("        text-align: center;\n");
      out.write("      }\n");
      out.write("      .custom-bg {\n");
      out.write("        /* Đường dẫn của hình ảnh nền */\n");
      out.write("        background-image: url(\"img/checkoutbg.png\");\n");
      out.write("        background-size: cover;\n");
      out.write("        background-repeat: no-repeat;\n");
      out.write("        background-color: green;\n");
      out.write("      }\n");
      out.write("      body {\n");
      out.write("        overflow: hidden;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("    <!-- loading -->\n");
      out.write("    <iframe\n");
      out.write("      id=\"loading-iframe\"\n");
      out.write("      src=\"components/loading.html\"\n");
      out.write("      frameborder=\"0\"\n");
      out.write("      style=\"\n");
      out.write("        border: none;\n");
      out.write("        position: fixed;\n");
      out.write("        width: 100%;\n");
      out.write("        height: 100%;\n");
      out.write("        top: 0;\n");
      out.write("        left: 0;\n");
      out.write("        z-index: 999;\n");
      out.write("        background: transparent; /* Make the iframe background transparent */\n");
      out.write("        pointer-events: none; /* Allow interaction with elements behind the iframe */\n");
      out.write("        transition: opacity 1s;\n");
      out.write("      \"\n");
      out.write("    ></iframe>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("      window.addEventListener(\"load\", function () {\n");
      out.write("        // Code xử lý sau khi trang đã nạp hoàn toàn ở đây\n");
      out.write("        var iframe = document.getElementById(\"loading-iframe\");\n");
      out.write("        if (iframe) {\n");
      out.write("          iframe.style.zIndex = 0;\n");
      out.write("          iframe.classList.add(\"hidden-iframe\");\n");
      out.write("        }\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("      .hidden-iframe {\n");
      out.write("        opacity: 0;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("    <!-- end loading -->\n");
      out.write("    ");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <!-- Gá»i tá»p head.html -->\n");
      out.write("    <link rel=\"import\" href=\"components/header.html\" />\n");
      out.write("    <!-- Tailwind -->\n");
      out.write("    <script src=\"https://cdn-tailwindcss.vercel.app/\"></script>\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/flowbite/1.8.1/flowbite.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("    <link href=\"./css/tailwind.css\" rel=\"stylesheet\" />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css\"\n");
      out.write("    />\n");
      out.write("    <script\n");
      out.write("      src=\"https://cdn.jsdelivr.net/gh/alpinejs/alpine@v2.x.x/dist/alpine.js\"\n");
      out.write("      defer\n");
      out.write("    ></script>\n");
      out.write("    <script\n");
      out.write("      src=\"https://kit.fontawesome.com/5b0b34b925.js\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("    <style>\n");
      out.write("      .header {\n");
      out.write("        background-image: url(\"../img/header.gif\");\n");
      out.write("        background-repeat: no-repeat;\n");
      out.write("        background-size: cover;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      /* Äá»i mÃ u chá»¯ thÃ nh tráº¯ng */\n");
      out.write("      .navbar-text {\n");
      out.write("        color: white;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      /* Add any additional styles as needed */\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body class=\"w-[1500] block overflow-x-hidden mx-auto\">\n");
      out.write("    <!-- header -->\n");
      out.write("    <nav class=\"header leading-6 h-24\">\n");
      out.write("      <div class=\"flex p-1\">\n");
      out.write("        <!-- logo -->\n");
      out.write("        <a href=\"homepage.jsp\" class=\"flex items-center justify-center w-1/2\">\n");
      out.write("          <div class=\"\">\n");
      out.write("            <img src=\"img/logo2.png\" class=\"h-20 text-xl\" alt=\"Logo\" />\n");
      out.write("          </div>\n");
      out.write("          <span\n");
      out.write("            class=\"self-center text-4xl font-extralight whitespace-nowrap dark:text-white\"\n");
      out.write("            >Wild World Zoo</span\n");
      out.write("          >\n");
      out.write("        </a>\n");
      out.write("        <!-- end logo -->\n");
      out.write("        <!-- navbar -->\n");
      out.write("        <div\n");
      out.write("          class=\"items-center justify-between hidden w-full md:flex md:w-auto md:order-1 w-full\"\n");
      out.write("          id=\"navbar-user\"\n");
      out.write("        >\n");
      out.write("          <ul\n");
      out.write("            class=\"flex flex-col md:p-0 mt-4 borderrounded-lg md:flex-row md:space-x-8 md:mt-0 md:border-0\"\n");
      out.write("          >\n");
      out.write("            <li>\n");
      out.write("              <a\n");
      out.write("                href=\"homepage.jsp\"\n");
      out.write("                class=\"navbar-text block py-4 pl-4 text-3xl text-gray-900 rounded before:ease relative h-18 w-28 overflow-hidden text-white transition-all before:absolute before:right-0 before:top-0 before:h-16 before:w-6 before:translate-x-8 before:fa-rotate-2 before:bg-green-300 before:opacity-4 before:duration-700 hover:shadow-xl hover:before:-translate-x-40 hover:bg-green-700\"\n");
      out.write("                aria-current=\"page\"\n");
      out.write("                >HOME</a\n");
      out.write("              >\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a\n");
      out.write("                href=\"About.jsp\"\n");
      out.write("                class=\"navbar-text block py-4 pl-2 text-3xl text-gray-900 rounded before:ease relative h-18 w-28 overflow-hidden text-white transition-all before:absolute before:right-0 before:top-0 before:h-16 before:w-6 before:translate-x-8 before:fa-rotate-2 before:bg-green-300 before:opacity-4 before:duration-700 hover:shadow-xl hover:before:-translate-x-40 hover:bg-green-700\"\n");
      out.write("                >ABOUT</a\n");
      out.write("              >\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a\n");
      out.write("                href=\"animalcontroller\"\n");
      out.write("                class=\"navbar-text block py-4 pr-2 pl-2 text-3xl text-gray-900 rounded before:ease relative h-18 w-30 overflow-hidden text-white transition-all before:absolute before:right-0 before:top-0 before:h-16 before:w-10 before:translate-x-12 before:fa-rotate-2 before:bg-green-300 before:opacity-4 before:duration-700 hover:shadow-xl hover:before:-translate-x-40 hover:bg-green-700\"\n");
      out.write("                >ANIMAL</a\n");
      out.write("              >\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a\n");
      out.write("                href=\"news.jsp\"\n");
      out.write("                class=\"navbar-text block py-4 pl-4 text-3xl text-gray-900 rounded before:ease relative h-18 w-28 overflow-hidden text-white transition-all before:absolute before:right-0 before:top-0 before:h-16 before:w-6 before:translate-x-8 before:fa-rotate-2 before:bg-green-300 before:opacity-4 before:duration-700 hover:shadow-xl hover:before:-translate-x-40 hover:bg-green-700\"\n");
      out.write("                >NEWS</a\n");
      out.write("              >\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a\n");
      out.write("                href=\"Map.jsp\"\n");
      out.write("                class=\"navbar-text block py-4 pl-6 text-3xl text-gray-900 rounded before:ease relative h-18 w-28 overflow-hidden text-white transition-all before:absolute before:right-0 before:top-0 before:h-16 before:w-6 before:translate-x-8 before:fa-rotate-2 before:bg-green-300 before:opacity-4 before:duration-700 hover:shadow-xl hover:before:-translate-x-40 hover:bg-green-700\"\n");
      out.write("                >MAP</a\n");
      out.write("              >\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <!-- end navbar -->\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    <!-- end header -->\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write(' ');
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <!-- Gá»i tá»p head.html -->\n");
      out.write("    <link rel=\"import\" href=\"components/breadcrumb.html\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <!-- Breadcrumb -->\n");
      out.write("    <nav\n");
      out.write("      class=\"flex bg-gray-50 text-gray-700 py-3 px-5 dark:bg-gray-800 dark:border-gray-700\"\n");
      out.write("      aria-label=\"Breadcrumb\"\n");
      out.write("    >\n");
      out.write("      <ol class=\"inline-flex items-center space-x-1 md:space-x-3\">\n");
      out.write("        <li class=\"inline-flex items-center\">\n");
      out.write("          <a\n");
      out.write("              href=\"../homepage.jsp\"\n");
      out.write("            class=\"text-sm text-gray-700 hover:text-gray-900 inline-flex items-center dark:text-gray-400 dark:hover:text-white\"\n");
      out.write("          >\n");
      out.write("            <svg\n");
      out.write("              class=\"w-4 h-4 mr-2\"\n");
      out.write("              fill=\"currentColor\"\n");
      out.write("              viewBox=\"0 0 20 20\"\n");
      out.write("              xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("            >\n");
      out.write("              <path\n");
      out.write("                d=\"M10.707 2.293a1 1 0 00-1.414 0l-7 7a1 1 0 001.414 1.414L4 10.414V17a1 1 0 001 1h2a1 1 0 001-1v-2a1 1 0 011-1h2a1 1 0 011 1v2a1 1 0 001 1h2a1 1 0 001-1v-6.586l.293.293a1 1 0 001.414-1.414l-7-7z\"\n");
      out.write("              ></path>\n");
      out.write("            </svg>\n");
      out.write("            Home\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li aria-current=\"page\">\n");
      out.write("          <div class=\"flex items-center\">\n");
      out.write("            <svg\n");
      out.write("              class=\"w-6 h-6 text-gray-400\"\n");
      out.write("              fill=\"currentColor\"\n");
      out.write("              viewBox=\"0 0 20 20\"\n");
      out.write("              xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("            >\n");
      out.write("              <path\n");
      out.write("                fill-rule=\"evenodd\"\n");
      out.write("                d=\"M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z\"\n");
      out.write("                clip-rule=\"evenodd\"\n");
      out.write("              ></path>\n");
      out.write("            </svg>\n");
      out.write("            <span\n");
      out.write("              id=\"pageName\"\n");
      out.write("              class=\"text-gray-400 ml-1 md:ml-2 text-sm font-medium dark:text-gray-500\"\n");
      out.write("              >News</span\n");
      out.write("            >\n");
      out.write("            <script>\n");
      out.write("              // Láº¥y tÃªn trang tá»« URL\n");
      out.write("              var currentPage = window.location.pathname\n");
      out.write("                .split(\"/\")\n");
      out.write("                .pop()\n");
      out.write("                .split(\".\")\n");
      out.write("                .shift();\n");
      out.write("\n");
      out.write("              // GÃ¡n tÃªn trang vÃ o pháº§n tá»­ cÃ³ id \"pageName\"\n");
      out.write("              document.getElementById(\"pageName\").innerHTML = currentPage;\n");
      out.write("            </script>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("      </ol>\n");
      out.write("    </nav>\n");
      out.write("    <!-- end breadcrumb -->\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <div class=\"w-[1500] h-screen mx-auto bg-green-100 custom-bg\">\n");
      out.write("      <!-- Progress Steps -->\n");
      out.write("      <div class=\"w-full\">\n");
      out.write("        <div class=\"flex justify-center py-4 bg-gray-50 rounded-b-lg\">\n");
      out.write("          <!-- Bước 1 -->\n");
      out.write("          <div class=\"w-1/6\">\n");
      out.write("            <div class=\"relative mb-2\">\n");
      out.write("              <div\n");
      out.write("                class=\"w-10 h-10 mx-auto bg-green-500 rounded-full text-lg text-white flex items-center\"\n");
      out.write("              >\n");
      out.write("                <span class=\"text-center text-white w-full\">\n");
      out.write("                  <i class=\"fa-solid fa-ticket\"></i>\n");
      out.write("                </span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-xs text-center md:text-base\">Choose ticket</div>\n");
      out.write("          </div>\n");
      out.write("          <!-- Bước 2 -->\n");
      out.write("          <div class=\"w-1/6\">\n");
      out.write("            <div class=\"relative mb-2\">\n");
      out.write("              <div\n");
      out.write("                class=\"absolute flex align-center items-center align-middle content-center\"\n");
      out.write("                style=\"\n");
      out.write("                  width: calc(100% - 2.5rem - 1rem);\n");
      out.write("                  top: 50%;\n");
      out.write("                  transform: translate(-50%, -50%);\n");
      out.write("                \"\n");
      out.write("              >\n");
      out.write("                <div\n");
      out.write("                  class=\"w-full bg-green-500 rounded items-center align-middle align-center flex-1\"\n");
      out.write("                >\n");
      out.write("                  <div\n");
      out.write("                    class=\"w-0 bg-green-500 py-1 rounded\"\n");
      out.write("                    style=\"width: 100%\"\n");
      out.write("                  ></div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div\n");
      out.write("                class=\"w-10 h-10 mx-auto bg-gray-300 rounded-full text-lg text-white flex items-center\"\n");
      out.write("              >\n");
      out.write("                <span class=\"text-center text-white w-full\">\n");
      out.write("                  <svg\n");
      out.write("                    class=\"w-full fill-current\"\n");
      out.write("                    xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                    viewBox=\"0 0 24 24\"\n");
      out.write("                    width=\"24\"\n");
      out.write("                    height=\"24\"\n");
      out.write("                  >\n");
      out.write("                    <path\n");
      out.write("                      class=\"heroicon-ui\"\n");
      out.write("                      d=\"M19 10h2a1 1 0 0 1 0 2h-2v2a1 1 0 0 1-2 0v-2h-2a1 1 0 0 1 0-2h2V8a1 1 0 0 1 2 0v2zM9 12A5 5 0 1 1 9 2a5 5 0 0 1 0 10zm0-2a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm8 11a1 1 0 0 1-2 0v-2a3 3 0 0 0-3-3H7a3 3 0 0 0-3 3v2a1 1 0 0 1-2 0v-2a5 5 0 0 1 5-5h5a5 5 0 0 1 5 5v2z\"\n");
      out.write("                    ></path>\n");
      out.write("                  </svg>\n");
      out.write("                </span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-xs text-center md:text-base\">Payment</div>\n");
      out.write("          </div>\n");
      out.write("          <!-- Bước 3 -->\n");
      out.write("          <div class=\"w-1/6\">\n");
      out.write("            <div class=\"relative mb-2\">\n");
      out.write("              <div\n");
      out.write("                class=\"absolute flex align-center items-center align-middle content-center\"\n");
      out.write("                style=\"\n");
      out.write("                  width: calc(100% - 2.5rem - 1rem);\n");
      out.write("                  top: 50%;\n");
      out.write("                  transform: translate(-50%, -50%);\n");
      out.write("                \"\n");
      out.write("              >\n");
      out.write("                <div\n");
      out.write("                  class=\"w-full bg-gray-200 rounded items-center align-middle align-center flex-1\"\n");
      out.write("                >\n");
      out.write("                  <div\n");
      out.write("                    class=\"w-0 bg-green-300 py-1 rounded\"\n");
      out.write("                    style=\"width: 0%\"\n");
      out.write("                  ></div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div\n");
      out.write("                class=\"w-10 h-10 mx-auto bg-white border-2 border-gray-200 rounded-full text-lg text-white flex items-center\"\n");
      out.write("              >\n");
      out.write("                <span class=\"text-center text-gray-600 w-full\">\n");
      out.write("                  <svg\n");
      out.write("                    class=\"w-full fill-current\"\n");
      out.write("                    xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                    viewBox=\"0 0 24 24\"\n");
      out.write("                    width=\"24\"\n");
      out.write("                    height=\"24\"\n");
      out.write("                  >\n");
      out.write("                    <path\n");
      out.write("                      class=\"heroicon-ui\"\n");
      out.write("                      d=\"M12 22a10 10 0 1 1 0-20 10 10 0 0 1 0 20zm0-2a8 8 0 1 0 0-16 8 8 0 0 0 0 16zm-2.3-8.7l1.3 1.29 3.3-3.3a1 1 0 0 1 1.4 1.42l-4 4a1 1 0 0 1-1.4 0l-2-2a1 1 0 0 1 1.4-1.42z\"\n");
      out.write("                    ></path>\n");
      out.write("                  </svg>\n");
      out.write("                </span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-xs text-center md:text-base\">Finished</div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- end Progress Steps -->\n");
      out.write("\n");
      out.write("      <!-- manage cart -->\n");
      out.write("      <section class=\"w-2/3 text-gray-600 antialiased mx-auto\" x-data=\"app\">\n");
      out.write("        <div class=\"flex flex-col\">\n");
      out.write("          <!-- Table -->\n");
      out.write("          <div\n");
      out.write("            class=\"border border-gray-200 rounded-md bg-white shadow-sm mt-14\"\n");
      out.write("          >\n");
      out.write("            <header\n");
      out.write("              class=\"border-b border-gray-100 px-10 py-4 flex items-center\"\n");
      out.write("            >\n");
      out.write("              <!-- back button -->\n");
      out.write("              <div>\n");
      out.write("                <a\n");
      out.write("                  href=\"shop\"\n");
      out.write("                  class=\"btn group flex items-center bg-transparent text-xl font-thin tracking-widest text-white back-button\"\n");
      out.write("                >\n");
      out.write("                  <svg\n");
      out.write("                    viewBox=\"0 0 46 16\"\n");
      out.write("                    height=\"15\"\n");
      out.write("                    width=\"35\"\n");
      out.write("                    xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                    id=\"arrow-horizontal\"\n");
      out.write("                    class=\"-translate-x-2 fill-slate-700 transition-all duration-300 ease-out group-hover:-translate-x-full group-hover:scale-x-105 group-hover:fill-white\"\n");
      out.write("                  >\n");
      out.write("                    <path\n");
      out.write("                      transform=\"scale(-1, 1) translate(-30)\"\n");
      out.write("                      d=\"M8,0,6.545,1.455l5.506,5.506H-30V9.039H12.052L6.545,14.545,8,16l8-8Z\"\n");
      out.write("                      data-name=\"Path 10\"\n");
      out.write("                      id=\"Path_10\"\n");
      out.write("                    ></path>\n");
      out.write("                  </svg>\n");
      out.write("                  <span\n");
      out.write("                    class=\"relative pb-1 text-black after:transition-transform after:duration-500 after:ease-out after:absolute after:bottom-0 after:left-0 after:block after:h-[2px] after:w-full after:origin-bottom-right after:scale-x-0 after:bg-blue-500 after:content-[''] after:group-hover:origin-bottom-left after:group-hover:scale-x-100\"\n");
      out.write("                    >Back</span\n");
      out.write("                  >\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("              <!-- end back -->\n");
      out.write("              <div class=\"font-semibold text-4xl text-gray-800 mx-auto pr-20\">\n");
      out.write("                <h1>Manage Carts</h1>\n");
      out.write("              </div>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <div class=\"overflow-x-auto p-3\">\n");
      out.write("              <table class=\"w-full table-auto\">\n");
      out.write("                <thead\n");
      out.write("                  class=\"bg-gray-50 text-xl font-semibold uppercase text-gray-400\"\n");
      out.write("                >\n");
      out.write("                  <tr>\n");
      out.write("                    <th class=\"p-2\">\n");
      out.write("                      <div class=\"text-left font-semibold\">Product Name</div>\n");
      out.write("                    </th>\n");
      out.write("\n");
      out.write("                    <th class=\"p-2\">\n");
      out.write("                      <div class=\"text-left font-semibold\">Quantity</div>\n");
      out.write("                    </th>\n");
      out.write("                    <th class=\"p-2\">\n");
      out.write("                      <div class=\"text-left font-semibold\">Sub Total</div>\n");
      out.write("                    </th>\n");
      out.write("                    <th class=\"p-2\">\n");
      out.write("                      <div class=\"text-left font-semibold\">Total</div>\n");
      out.write("                    </th>\n");
      out.write("                    <th class=\"p-2\">\n");
      out.write("                      <div class=\"text-center font-semibold\">Action</div>\n");
      out.write("                    </th>\n");
      out.write("                  </tr>\n");
      out.write("                </thead>\n");
      out.write("\n");
      out.write("                <tbody class=\"divide-y divide-gray-100 text-3xl\">\n");
      out.write("                  ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                  ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                  ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- total amount -->\n");
      out.write("            <div\n");
      out.write("              class=\"flex justify-end space-x-4 border-t border-gray-100 px-5 pt-4 pb-2 text-2xl font-bold\"\n");
      out.write("            >\n");
      out.write("              <div>Total</div>\n");
      out.write("              <div class=\"text-blue-600\">$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.totalMoney}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("            </div>\n");
      out.write("            <!-- end total -->\n");
      out.write("\n");
      out.write("            <!-- Confirm -->\n");
      out.write("            <div\n");
      out.write("              class=\"flex justify-center pt-4 mb-4 mr-4 border-t border-gray-100\"\n");
      out.write("            >\n");
      out.write("              <form action=\"checkout\" >\n");
      out.write("                <input\n");
      out.write("                  type=\"submit\"\n");
      out.write("                  value=\"Checkout\"\n");
      out.write("                  class=\"cursor-pointer bg-neutral-200 rounded-md px-12 py-4 text-2xl border-none text-neutral-600 hover:text-white hover:shadow-[inset_16rem_0_0_0] hover:shadow-blue-500 duration-[400ms,700ms] transition-[color,box-shadow]\"\n");
      out.write("                />\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("            <!-- end confim -->\n");
      out.write("            <div class=\"flex justify-end\">\n");
      out.write("              <!-- send this data to backend (note: use class 'hidden' to hide this input) -->\n");
      out.write("              <input\n");
      out.write("                type=\"hidden\"\n");
      out.write("                class=\"border border-black bg-gray-50\"\n");
      out.write("                x-model=\"selected\"\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("o");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("tt");
    _jspx_th_c_set_1.setValue(new String("0"));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.items}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("                      <td class=\"p-2\">\n");
          out.write("                        <div>\n");
          out.write("                          <div class=\"font-medium text-gray-800\">\n");
          out.write("                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                          </div>\n");
          out.write("                        </div>\n");
          out.write("                      </td>\n");
          out.write("                      <td class=\"p-2\">\n");
          out.write("                        <div class=\"text-left\">\n");
          out.write("                          <button>\n");
          out.write("                            <a href=\"process?num=-1&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.tid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">-</a>\n");
          out.write("                          </button>\n");
          out.write("                          ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                          <button>\n");
          out.write("                            <a href=\"process?num=1&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.tid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">+</a>\n");
          out.write("                          </button>\n");
          out.write("                        </div>\n");
          out.write("                      </td>\n");
          out.write("                      <td class=\"p-2\">\n");
          out.write("                        <div class=\"text-left font-medium text-green-500\">\n");
          out.write("                          $");
          if (_jspx_meth_fmt_formatNumber_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                      </td>\n");
          out.write("                      <td class=\"p-2\">\n");
          out.write("                        <div class=\"text-left font-medium text-green-500\">\n");
          out.write("                          $");
          if (_jspx_meth_fmt_formatNumber_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                      </td>\n");
          out.write("                      <td class=\"p-2\">\n");
          out.write("                        <div class=\"flex justify-center items-center\">\n");
          out.write("                          <form action=\"process\" method=\"post\">\n");
          out.write("                            <input\n");
          out.write("                              type=\"hidden\"\n");
          out.write("                              name=\"id\"\n");
          out.write("                              value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.tid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                            />\n");
          out.write("                            <button\n");
          out.write("                              class=\"flex p-3 bg-red-600 rounded-xl hover:rounded-3xl hover:bg-red-300 transition-all duration-300 text-white\"\n");
          out.write("                              onclick=\"return confirmDelete();\"\n");
          out.write("                            >\n");
          out.write("                              <i\n");
          out.write("                                fill=\"none\"\n");
          out.write("                                viewBox=\"0 0 24 24\"\n");
          out.write("                                stroke=\"currentColor\"\n");
          out.write("                                stroke-width=\"2\"\n");
          out.write("                                class=\"fas fa-trash-alt\"\n");
          out.write("                              ></i>\n");
          out.write("                            </button>\n");
          out.write("                          </form>\n");
          out.write("                        </div>\n");
          out.write("\n");
          out.write("                        <script>\n");
          out.write("                          function confirmDelete() {\n");
          out.write("                            var result = confirm(\"Do you want to delete this?\");\n");
          out.write("                            return result;\n");
          out.write("                          }\n");
          out.write("                        </script>\n");
          out.write("                      </td>\n");
          out.write("                    </tr>\n");
          out.write("                  ");
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

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_2.setVar("tt");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tt+1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatNumber_0.setPattern("##.#");
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatNumber_1.setPattern("##.#");
    _jspx_th_fmt_formatNumber_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(i.price*i.quantity)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }
}
