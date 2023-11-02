package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createanimalcage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!-- prettier-ignore -->\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("    <link\n");
      out.write("      href=\"https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;1,100;1,200&display=swap\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
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
      out.write("    <title>Create Page</title>\n");
      out.write("  </head>\n");
      out.write("  <body class=\"bg-green-400\">\n");
      out.write("    <!-- MAIN CONTENT -->\n");
      out.write("    <div class=\"flex justify-center items-center w-full h-full\">\n");
      out.write("      <section class=\"p-10 pt-4 bg-white rounded-md shadow-md mt-20 w-1/2\">\n");
      out.write("        <!-- back button -->\n");
      out.write("        <div class=\"flex ml-0\">\n");
      out.write("          <a\n");
      out.write("              href=\"animalcagesearch?areaid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.areaid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("            class=\"group flex items-center bg-transparent text-2xl font-thin tracking-widest text-white back-button\"\n");
      out.write("          >\n");
      out.write("            <svg\n");
      out.write("              viewBox=\"0 0 46 16\"\n");
      out.write("              height=\"15\"\n");
      out.write("              width=\"35\"\n");
      out.write("              xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("              id=\"arrow-horizontal\"\n");
      out.write("              class=\"fill-slate-700 transition-all duration-300 ease-out group-hover:-translate-x-full group-hover:scale-x-105 group-hover:fill-white\"\n");
      out.write("            >\n");
      out.write("              <path\n");
      out.write("                transform=\"scale(-1, 1) translate(-30)\"\n");
      out.write("                d=\"M8,0,6.545,1.455l5.506,5.506H-30V9.039H12.052L6.545,14.545,8,16l8-8Z\"\n");
      out.write("                data-name=\"Path 10\"\n");
      out.write("                id=\"Path_10\"\n");
      out.write("              ></path>\n");
      out.write("            </svg>\n");
      out.write("            <span\n");
      out.write("              class=\"ml-2 text-black after:transition-transform after:duration-500 after:ease-out after:absolute after:bottom-0 after:left-0 after:block after:h-[2px] after:w-full after:origin-bottom-right after:scale-x-0 after:bg-blue-500 after:content-[''] after:group-hover:origin-bottom-left after:group-hover:scale-x-100\"\n");
      out.write("              >Back</span\n");
      out.write("            >\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("        <!-- end back -->\n");
      out.write("        <header class=\"border-b border-gray-100 px-10 flex items-center\">\n");
      out.write("          <div class=\"text-gray-800 mx-auto pb-4\">\n");
      out.write("            <h1 class=\"font-semibold text-5xl\">Add Animal Cage</h1>\n");
      out.write("          </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"mx-auto w-full max-w-8xl\">\n");
      out.write("          <form\n");
      out.write("            action=\"createanimalcage\"\n");
      out.write("            method=\"POST\"\n");
      out.write("            enctype=\"multipart/form-data\"\n");
      out.write("          >\n");
      out.write("            <!-- Submit -->\n");
      out.write("            <div class=\"flex justify-end\">\n");
      out.write("              <button\n");
      out.write("                type=\"submit\"\n");
      out.write("                class=\"px-8 py-3 leading-5 ml-auto relative overflow-hidden bg-gray-300 text-white rounded-md shadow-2xl transition-all duration-200 before:absolute before:bottom-0 before:left-0 before:right-0 before:top-0 before:m-auto before:h-0 before:w-0 before:rounded-sm before:bg-green-600 before:duration-300 before:ease-out hover:text-white hover:shadow-bg-green-500 hover:before:h-40 hover:before:w-40 hover:before:opacity-80\"\n");
      out.write("              >\n");
      out.write("                <p class=\"relative z-10 font-extralight text-2xl\">Save</p>\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("            <!-- end submit -->\n");
      out.write("            <!-- Name-->\n");
      out.write("            <div class=\"mb-5\">\n");
      out.write("              <label for=\"name\" class=\"mb-3 block text-2xl font-medium\">\n");
      out.write("                Name\n");
      out.write("              </label>\n");
      out.write("              <input\n");
      out.write("                type=\"text\"\n");
      out.write("                name=\"name\"\n");
      out.write("                placeholder=\"Enter Cage name\"\n");
      out.write("                min=\"0\"\n");
      out.write("                class=\"w-full font-extralight appearance-none rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-xl font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md\"\n");
      out.write("              />\n");
      out.write("\n");
      out.write("              <p class=\"mt-3 text-xs text-red-400\"></p>\n");
      out.write("            </div>\n");
      out.write("            <!-- end name -->\n");
      out.write("\n");
      out.write("            <!-- ID DIV -->\n");
      out.write("            <div class=\"-mx-3 flex flex-wrap\">\n");
      out.write("              <!-- Area_ID -->\n");
      out.write("              <div class=\"w-full px-3 sm:w-1/2\">\n");
      out.write("                <label\n");
      out.write("                  for=\"area_id\"\n");
      out.write("                  class=\"mb-3 block text-2xl font-medium text-[#07074D]\"\n");
      out.write("                  >Area_ID</label\n");
      out.write("                >\n");
      out.write("                <select\n");
      out.write("                  name=\"area_id\"\n");
      out.write("                  class=\"w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-2xl font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md\"\n");
      out.write("                >\n");
      out.write("                  ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("              <!-- end area -->\n");
      out.write("              <!-- Employee ID -->\n");
      out.write("              <div class=\"w-full px-3 sm:w-1/2\">\n");
      out.write("                <div class=\"mb-5\">\n");
      out.write("                  <label\n");
      out.write("                    for=\"employee_id\"\n");
      out.write("                    class=\"mb-3 block text-2xl font-medium text-[#07074D]\"\n");
      out.write("                    >Employee_ID</label\n");
      out.write("                  >\n");
      out.write("                  <select\n");
      out.write("                    name=\"employee_id\"\n");
      out.write("                    class=\"w-full rounded-md border border-[#e0e0e0] bg-white py-3 px-6 text-2xl font-medium text-[#6B7280] outline-none focus:border-[#6A64F1] focus:shadow-md\"\n");
      out.write("                  >\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                  </select>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <!-- end employee  -->\n");
      out.write("            </div>\n");
      out.write("            <!-- end ID -->\n");
      out.write("\n");
      out.write("            <!-- photo -->\n");
      out.write("            <div class=\"w-full bg-white\">\n");
      out.write("              <div\n");
      out.write("                class=\"container mx-auto h-full flex flex-col justify-center items-center\"\n");
      out.write("              >\n");
      out.write("                <div id=\"images-container\"></div>\n");
      out.write("                <div class=\"flex w-full justify-center\">\n");
      out.write("                  <div\n");
      out.write("                    id=\"multi-upload-button\"\n");
      out.write("                    class=\"cursor-pointer bg-neutral-200 rounded-md px-12 py-4 text-2xl border-none text-neutral-600 hover:text-white hover:shadow-[inset_16rem_0_0_0] hover:shadow-blue-500 duration-[400ms,700ms] transition-[color,box-shadow]\"\n");
      out.write("                  >\n");
      out.write("                    Upload Photo\n");
      out.write("                  </div>\n");
      out.write("                  <div\n");
      out.write("                    class=\"border-gray-300 rounded-r-md flex items-center justify-between\"\n");
      out.write("                  >\n");
      out.write("                    <span id=\"multi-upload-text\" class=\"p-2 text-xl\"></span>\n");
      out.write("                    <button\n");
      out.write("                      id=\"multi-upload-delete\"\n");
      out.write("                      class=\"hidden\"\n");
      out.write("                      onclick=\"removeMultiUpload()\"\n");
      out.write("                    >\n");
      out.write("                      <svg\n");
      out.write("                        xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                        class=\"fill-current text-red-700 w-3 h-3\"\n");
      out.write("                        viewBox=\"0 0 320 512\"\n");
      out.write("                      >\n");
      out.write("                        <path\n");
      out.write("                          d=\"M310.6 361.4c12.5 12.5 12.5 32.75 0 45.25C304.4 412.9 296.2 416 288 416s-16.38-3.125-22.62-9.375L160 301.3L54.63 406.6C48.38 412.9 40.19 416 32 416S15.63 412.9 9.375 406.6c-12.5-12.5-12.5-32.75 0-45.25l105.4-105.4L9.375 150.6c-12.5-12.5-12.5-32.75 0-45.25s32.75-12.5 45.25 0L160 210.8l105.4-105.4c12.5-12.5 32.75-12.5 45.25 0s12.5 32.75 0 45.25l-105.4 105.4L310.6 361.4z\"\n");
      out.write("                        />\n");
      out.write("                      </svg>\n");
      out.write("                    </button>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <input\n");
      out.write("                  type=\"file\"\n");
      out.write("                  id=\"multi-upload-input\"\n");
      out.write("                  class=\"hidden\"\n");
      out.write("                  name=\"photo\"\n");
      out.write("                  multiple\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <script src=\"js/createphoto.js\"></script>\n");
      out.write("            <!-- end photo -->\n");
      out.write("          </form>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("a");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listarea}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <option>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.area_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("o");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listuser}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                      <option>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.employee_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                    ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
