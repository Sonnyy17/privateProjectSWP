package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class managerfeedback_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("        <!-- Tailwind -->\n");
      out.write("        <script src=\"https://cdn-tailwindcss.vercel.app/\"></script>\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/flowbite/1.8.1/flowbite.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            />\n");
      out.write("        <link href=\"./css/tailwind.css\" rel=\"stylesheet\" />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css\"\n");
      out.write("            />\n");
      out.write("        <script\n");
      out.write("            src=\"https://cdn.jsdelivr.net/gh/alpinejs/alpine@v2.x.x/dist/alpine.js\"\n");
      out.write("            defer\n");
      out.write("        ></script>\n");
      out.write("        <script\n");
      out.write("            src=\"https://kit.fontawesome.com/5b0b34b925.js\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("        ></script>\n");
      out.write("        <title>View</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <style>\n");
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
      out.write("    </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body class=\"w-[1500px] block overflow-x-hidden mx-auto\">\n");
      out.write("        <nav class=\"z-20 flex shrink-0 grow-0 justify-around gap-4 border-t border-gray-200 bg-white/50 p-2.5 shadow-lg backdrop-blur-lg dark:border-slate-600/60 dark:bg-slate-800/50 fixed top-2/4 -translate-y-2/4 left-6 min-h-[auto] min-w-[64px] flex-col rounded-lg border\">\n");
      out.write("            <a href=\"managercontroller\" class=\"flex aspect-square min-h-[32px] w-16 flex-col items-center justify-center gap-1 rounded-md p-1.5 text-gray-700 hover:bg-gray-100 dark:text-gray-400 dark:hover:bg-slate-800\">\n");
      out.write("                <!-- HeroIcon - User -->\n");
      out.write("                <i class=\"fa-regular fa-folder-open\"></i>\n");
      out.write("                <small class=\"text-center text-xs font-medium\"> Area </small>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <a href=\"#analytics\"class=\"flex aspect-square min-h-[32px] w-16 flex-col items-center justify-center gap-1 rounded-md p-1.5 bg-indigo-50 text-indigo-600 dark:bg-sky-900 dark:text-sky-50\">\n");
      out.write("                <!-- HeroIcon - Chart Bar -->\n");
      out.write("                <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\" stroke=\"currentColor\" class=\"w-6 h-6\">\n");
      out.write("                <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M21 7.5l-9-5.25L3 7.5m18 0l-9 5.25m9-5.25v9l-9 5.25M3 7.5l9 5.25M3 7.5v9l9 5.25m0-9v9\" />\n");
      out.write("                </svg>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <small class=\"text-center text-xs font-medium\"> Feedback </small>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <a\n");
      out.write("                href=\"/NewsControl\"\n");
      out.write("                class=\"flex aspect-square min-h-[32px] w-16 flex-col items-center justify-center gap-1 rounded-md p-1.5 text-gray-700 hover:bg-gray-100 dark:text-gray-400 dark:hover:bg-slate-800\"\n");
      out.write("                >\n");
      out.write("                <!-- HeroIcon - Cog-6-tooth -->\n");
      out.write("                <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\" stroke=\"currentColor\" class=\"w-6 h-6\">\n");
      out.write("                <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M15 19.128a9.38 9.38 0 002.625.372 9.337 9.337 0 004.121-.952 4.125 4.125 0 00-7.533-2.493M15 19.128v-.003c0-1.113-.285-2.16-.786-3.07M15 19.128v.106A12.318 12.318 0 018.624 21c-2.331 0-4.512-.645-6.374-1.766l-.001-.109a6.375 6.375 0 0111.964-3.07M12 6.375a3.375 3.375 0 11-6.75 0 3.375 3.375 0 016.75 0zm8.25 2.25a2.625 2.625 0 11-5.25 0 2.625 2.625 0 015.25 0z\" />\n");
      out.write("                </svg>\n");
      out.write("\n");
      out.write("                <small class=\"text-center text-xs font-medium\"> News</small>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <hr class=\"dark:border-gray-700/60\" />\n");
      out.write("\n");
      out.write("            <a\n");
      out.write("                href=\"/\"\n");
      out.write("                class=\"flex h-16 w-16 flex-col items-center justify-center gap-1 text-fuchsia-900 dark:text-gray-400\"\n");
      out.write("                >\n");
      out.write("                <!-- HeroIcon - Home Modern -->\n");
      out.write("                <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 24 24\" stroke-width=\"1.5\" stroke=\"currentColor\" class=\"w-6 h-6\">\n");
      out.write("                <path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M15 9h3.75M15 12h3.75M15 15h3.75M4.5 19.5h15a2.25 2.25 0 002.25-2.25V6.75A2.25 2.25 0 0019.5 4.5h-15a2.25 2.25 0 00-2.25 2.25v10.5A2.25 2.25 0 004.5 19.5zm6-10.125a1.875 1.875 0 11-3.75 0 1.875 1.875 0 013.75 0zm1.294 6.336a6.721 6.721 0 01-3.17.789 6.721 6.721 0 01-3.168-.789 3.376 3.376 0 016.338 0z\" />\n");
      out.write("                </svg>\n");
      out.write("                <small className=\"text-xs font-medium\">Profile</small>\n");
      out.write("            </a>\n");
      out.write("        </nav>\n");
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
      out.write("                            <a\n");
      out.write("                                href=\"manager.jsp\"\n");
      out.write("                                class=\"navbar-text block py-4 pl-4 text-2xl text-gray-900 rounded before:ease relative h-18 w-24 overflow-hidden text-white transition-all before:absolute before:right-0 before:top-0 before:h-16 before:w-6 before:translate-x-8 before:fa-rotate-2 before:bg-green-300 before:opacity-4 before:duration-700 hover:shadow-xl hover:before:-translate-x-40 hover:bg-green-700\"\n");
      out.write("                                aria-current=\"page\"\n");
      out.write("                                >HOME</a\n");
      out.write("                            >\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a\n");
      out.write("                                href=\"About.jsp\"\n");
      out.write("                                class=\"navbar-text block py-4 pl-3 text-2xl text-gray-900 rounded before:ease relative h-18 w-24 overflow-hidden text-white transition-all before:absolute before:right-0 before:top-0 before:h-16 before:w-6 before:translate-x-8 before:fa-rotate-2 before:bg-green-300 before:opacity-4 before:duration-700 hover:shadow-xl hover:before:-translate-x-40 hover:bg-green-700\"\n");
      out.write("                                >ABOUT</a\n");
      out.write("                            >\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a\n");
      out.write("                                href=\"animal.jsp\"\n");
      out.write("                                class=\"navbar-text block py-4 pr-4 pl-2 text-2xl text-gray-900 rounded before:ease relative h-18 w-24 overflow-hidden text-white transition-all before:absolute before:right-0 before:top-0 before:h-16 before:w-6 before:translate-x-8 before:fa-rotate-2 before:bg-green-300 before:opacity-4 before:duration-700 hover:shadow-xl hover:before:-translate-x-40 hover:bg-green-700\"\n");
      out.write("                                >ANIMAL</a\n");
      out.write("                            >\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a\n");
      out.write("                                href=\"news.jsp\"\n");
      out.write("                                class=\"navbar-text block py-4 pl-4 text-2xl text-gray-900 rounded before:ease relative h-18 w-24 overflow-hidden text-white transition-all before:absolute before:right-0 before:top-0 before:h-16 before:w-6 before:translate-x-8 before:fa-rotate-2 before:bg-green-300 before:opacity-4 before:duration-700 hover:shadow-xl hover:before:-translate-x-40 hover:bg-green-700\"\n");
      out.write("                                >NEWS</a\n");
      out.write("                            >\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a\n");
      out.write("                                href=\"Map.jsp\"\n");
      out.write("                                class=\"navbar-text block py-4 pl-6 text-2xl text-gray-900 rounded before:ease relative h-18 w-24 overflow-hidden text-white transition-all before:absolute before:right-0 before:top-0 before:h-16 before:w-6 before:translate-x-8 before:fa-rotate-2 before:bg-green-300 before:opacity-4 before:duration-700 hover:shadow-xl hover:before:-translate-x-40 hover:bg-green-700\"\n");
      out.write("                                >MAP</a\n");
      out.write("                            >\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- end navbar -->\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- end header -->\n");
      out.write("        <!-- Breadcrumb -->\n");
      out.write("        <nav\n");
      out.write("            class=\"flex bg-gray-50 text-gray-700 py-3 px-5 dark:bg-gray-800 dark:border-gray-700\"\n");
      out.write("            aria-label=\"Breadcrumb\"\n");
      out.write("            >\n");
      out.write("            <ol class=\"inline-flex items-center space-x-1 md:space-x-3\">\n");
      out.write("                <li class=\"inline-flex items-center\">\n");
      out.write("                    <a\n");
      out.write("                        href=\"Homepage.html\"\n");
      out.write("                        class=\"text-sm text-gray-700 hover:text-gray-900 inline-flex items-center dark:text-gray-400 dark:hover:text-white\"\n");
      out.write("                        >\n");
      out.write("                        <svg\n");
      out.write("                            class=\"w-4 h-4 mr-2\"\n");
      out.write("                            fill=\"currentColor\"\n");
      out.write("                            viewBox=\"0 0 20 20\"\n");
      out.write("                            xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                            >\n");
      out.write("                        <path\n");
      out.write("                            d=\"M10.707 2.293a1 1 0 00-1.414 0l-7 7a1 1 0 001.414 1.414L4 10.414V17a1 1 0 001 1h2a1 1 0 001-1v-2a1 1 0 011-1h2a1 1 0 011 1v2a1 1 0 001 1h2a1 1 0 001-1v-6.586l.293.293a1 1 0 001.414-1.414l-7-7z\"\n");
      out.write("                            ></path>\n");
      out.write("                        </svg>\n");
      out.write("                        Home\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li aria-current=\"page\">\n");
      out.write("                    <div class=\"flex items-center\">\n");
      out.write("                        <svg\n");
      out.write("                            class=\"w-6 h-6 text-gray-400\"\n");
      out.write("                            fill=\"currentColor\"\n");
      out.write("                            viewBox=\"0 0 20 20\"\n");
      out.write("                            xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                            >\n");
      out.write("                        <path\n");
      out.write("                            fill-rule=\"evenodd\"\n");
      out.write("                            d=\"M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z\"\n");
      out.write("                            clip-rule=\"evenodd\"\n");
      out.write("                            ></path>\n");
      out.write("                        </svg>\n");
      out.write("                        <span\n");
      out.write("                            class=\"text-gray-400 ml-1 md:ml-2 text-sm font-medium dark:text-gray-500\"\n");
      out.write("                            >FeedBack View</span\n");
      out.write("                        >\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ol>\n");
      out.write("        </nav>\n");
      out.write("        <!-- end breadcrumb -->\n");
      out.write("        <div class=\"flex justify-center mt-5 \">\n");
      out.write("            <h1 class=\"text-3xl\">FeedBack Information</h1>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- component -->\n");
      out.write("    <body class=\" antialiased font-sans bg-gray-200\">\n");
      out.write("        <div class=\"container mx-auto px-4 sm:px-8\">\n");
      out.write("            <div class=\"py-8 ml-20\">\n");
      out.write("                <div></div>\n");
      out.write("                <div class=\"my-2 flex sm:flex-row flex-col\">\n");
      out.write("                    <div class=\"flex flex-row mb-1 sm:mb-0\">\n");
      out.write("                        <div class=\"relative\">\n");
      out.write("                            <div class=\"pointer-events-none absolute inset-y-0 right-0 flex items-center px-2 text-gray-700\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"relative\">\n");
      out.write("                            <form action=\"ListFeedback\">\n");
      out.write("                                <select onchange=\"this.form.submit()\" name=\"status\" class=\"appearance-none h-full rounded-r border-t sm:rounded-r-none sm:border-r-0 border-r border-b block appearance-none w-full bg-white border-gray-400 text-gray-700 py-2 px-4 pr-8 leading-tight focus:outline-none focus:border-l focus:border-r focus:bg-white focus:border-gray-500\">\n");
      out.write("                                    <option value=\"0\">All</option>\n");
      out.write("                                    <option value=\"Processing\">Processing</option>\n");
      out.write("                                    <option value=\"Approved\">Approved</option>\n");
      out.write("                                    <option value=\"Rejected\">Rejected</option>\n");
      out.write("                                </select>\n");
      out.write("                            </form>\n");
      out.write("                            <div class=\"pointer-events-none absolute inset-y-0 right-0 flex items-center px-2 text-gray-700\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"-mx-4 sm:-mx-8 px-4 sm:px-8 py-4 overflow-x-auto\">\n");
      out.write("                    <div\n");
      out.write("                        class=\"inline-block min-w-full shadow rounded-lg overflow-hidden\"\n");
      out.write("                        >\n");
      out.write("                        <!-- table -->\n");
      out.write("\n");
      out.write("                        <table class=\"min-w-full\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("\n");
      out.write("                                    <th\n");
      out.write("                                        class=\"px-6 py-3 text-xs font-medium leading-4 tracking-wider text-left text-gray-500 uppercase border-b border-gray-200 bg-gray-50 border-r\"\n");
      out.write("                                        >\n");
      out.write("                                        Tiltle\n");
      out.write("                                    </th>\n");
      out.write("                                    <th\n");
      out.write("                                        class=\"break-all px-6 py-3 text-xs font-medium leading-4  text-left text-gray-500 uppercase border-b border-gray-200 bg-gray-50 border-r\"\n");
      out.write("                                        >\n");
      out.write("                                        Purpose\n");
      out.write("                                    </th>\n");
      out.write("                                    <th\n");
      out.write("                                        class=\"px-6 py-3 text-xs font-medium leading-4 tracking-wider text-left text-gray-500 uppercase border-b border-gray-200 bg-gray-50 border-r\"\n");
      out.write("                                        >\n");
      out.write("                                        Date\n");
      out.write("                                    </th>\n");
      out.write("                                    <th\n");
      out.write("                                        class=\"break-all px-6 py-3 text-xs font-medium leading-4  text-left text-gray-500 uppercase border-b border-gray-200 bg-gray-50 border-r\"\n");
      out.write("                                        >\n");
      out.write("                                        ProcessNote\n");
      out.write("                                    </th>\n");
      out.write("                                    <th\n");
      out.write("                                        class=\"px-6 py-3 text-xs font-medium leading-4 tracking-wider text-left text-gray-500 uppercase border-b border-gray-200 bg-gray-50 border-r\"\n");
      out.write("                                        >\n");
      out.write("                                        Employee_ID\n");
      out.write("                                    </th>\n");
      out.write("                                    <th\n");
      out.write("                                        class=\"px-6 py-3 text-xs font-medium leading-4 tracking-wider text-left text-gray-500 uppercase border-b border-gray-200 bg-gray-50\"\n");
      out.write("                                        >\n");
      out.write("                                        Status\n");
      out.write("                                    </th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- component -->\n");
      out.write("\n");
      out.write("                        <div class=\"grid min-h-[140px] w-full place-items-center overflow-x-scroll rounded-lg p-6 lg:overflow-visible\">\n");
      out.write("                            <nav>\n");
      out.write("                                <ul class=\"flex\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("f");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ListA}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tbody class=\"bg-white\">\n");
          out.write("                                    <tr>\n");
          out.write("\n");
          out.write("                                        <td class=\"break-all text-xs px-6 py-4  border-b border-gray-200 border-r\">\n");
          out.write("                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                        </td>\n");
          out.write("                                        <td class=\"  break-words text-xs px-6 py-4 border-b border-gray-200 border-r\">\n");
          out.write("                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.purpose}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                        </td>\n");
          out.write("                                        <td class=\"break-all px-6 py-4 text-sm leading-5 text-gray-500 whitespace-no-wrap border-b border-gray-200 border-r\">\n");
          out.write("                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                        </td>\n");
          out.write("                                        <td class=\" break-all text-xs px-6 py-4 border-b border-gray-200 border-r\">\n");
          out.write("                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.processnote}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                        </td>\n");
          out.write("                                        <td class=\"px-6 py-4 font-bold text-center leading-5 text-black  border-b border-gray-200 border-r\">\n");
          out.write("                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.employee_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                        </td>\n");
          out.write("                                        ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                        ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                            \n");
          out.write("                                            ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\n");
          out.write("                                        <td>\n");
          out.write("\n");
          out.write("                                        </td>\n");
          out.write("                                    </tr>\n");
          out.write("                                </tbody>\n");
          out.write("                            ");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.status eq 'APPROVED'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <td class=\"px-6 py-4 font-bold leading-5 text-green-500 border-b border-gray-200 border-r\">\n");
        out.write("                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("\n");
        out.write("                                                <button class=\"btn group flex  bg-transparent  text-xl  tracking-widest text-white\">\n");
        out.write("                                                    <span class=\"relative pr-4 pb-1 text-white after:transition-transform after:duration-500 after:ease-out after:absolute after:bottom-0 after:left-0 after:block after:h-[2px] after:w-full after:origin-bottom-right after:scale-x-0 after:bg-blue-500 after:content-[''] after:group-hover:origin-bottom-left after:group-hover:scale-x-100\"><a href=\"update?fid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.feedback_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"text-blue-500 \"> CHECK</a></span>\n");
        out.write("                                                    <svg viewBox=\"0 0 46 16\" height=\"10\" width=\"30\" xmlns=\"http://www.w3.org/2000/svg\" id=\"arrow-horizontal\" class=\"-translate-x-2 fill-slate-700 transition-all duration-300 ease-out group-hover:translate-x-1 group-hover:scale-x-105 group-hover:fill-white\">     \n");
        out.write("                                                    </svg>\n");
        out.write("                                                </button>\n");
        out.write("\n");
        out.write("                                            </td>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.status eq 'REJECTED'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <td class=\"px-6 py-4 font-bold leading-5 text-red-500 border-b border-gray-200 border-r\">\n");
        out.write("                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("\n");
        out.write("                                                <button class=\"btn group flex  bg-transparent  text-xl  tracking-widest text-white\">\n");
        out.write("                                                    <span class=\"relative pr-4 pb-1 text-white after:transition-transform after:duration-500 after:ease-out after:absolute after:bottom-0 after:left-0 after:block after:h-[2px] after:w-full after:origin-bottom-right after:scale-x-0 after:bg-blue-500 after:content-[''] after:group-hover:origin-bottom-left after:group-hover:scale-x-100\"><a href=\"update?fid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.feedback_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"text-blue-500 \"> CHECK</a></span>\n");
        out.write("                                                    <svg viewBox=\"0 0 46 16\" height=\"10\" width=\"30\" xmlns=\"http://www.w3.org/2000/svg\" id=\"arrow-horizontal\" class=\"-translate-x-2 fill-slate-700 transition-all duration-300 ease-out group-hover:translate-x-1 group-hover:scale-x-105 group-hover:fill-white\">     \n");
        out.write("                                                    </svg>\n");
        out.write("                                                </button>\n");
        out.write("\n");
        out.write("                                            </td>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.status eq 'Processing'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <td class=\"px-6 py-4 font-bold leading-5 text-grey-500 border-b border-gray-200 border-r\">\n");
        out.write("                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("\n");
        out.write("                                                <button class=\"btn group flex  bg-transparent  text-xl  tracking-widest text-white\">\n");
        out.write("                                                    <span class=\"relative pr-4 pb-1 text-white after:transition-transform after:duration-500 after:ease-out after:absolute after:bottom-0 after:left-0 after:block after:h-[2px] after:w-full after:origin-bottom-right after:scale-x-0 after:bg-blue-500 after:content-[''] after:group-hover:origin-bottom-left after:group-hover:scale-x-100\"><a href=\"update?fid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.feedback_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"text-blue-500 \"> CHECK</a></span>\n");
        out.write("                                                    <svg viewBox=\"0 0 46 16\" height=\"10\" width=\"30\" xmlns=\"http://www.w3.org/2000/svg\" id=\"arrow-horizontal\" class=\"-translate-x-2 fill-slate-700 transition-all duration-300 ease-out group-hover:translate-x-1 group-hover:scale-x-105 group-hover:fill-white\">     \n");
        out.write("                                                    </svg>\n");
        out.write("                                                </button>\n");
        out.write("\n");
        out.write("                                            </td>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endP}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <li>\n");
          out.write("                                            <a class=\"mx-1 flex h-9 w-9 items-center justify-center rounded-full border border-blue-gray-100 bg-transparent p-0 text-sm text-blue-gray-500 transition duration-150 ease-in-out hover:bg-light-300\" \n");
          out.write("                                               href=\"ListFeedback?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" aria-label=\"Previous\">\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                            </a>\n");
          out.write("                                        </li>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
