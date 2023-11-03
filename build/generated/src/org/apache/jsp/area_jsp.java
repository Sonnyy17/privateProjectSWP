package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class area_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
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
      out.write("    <title>Area</title>\n");
      out.write("  </head>\n");
      out.write("  <body class=\"w-[1500px] block overflow-x-hidden mx-auto bg-green-500\">\n");
      out.write("    <main class=\"antialiased font-sans bg-white\">\n");
      out.write("      <div class=\"container mx-auto px-4 sm:px-8\">\n");
      out.write("        <div class=\"flex justify-center\">\n");
      out.write("          <h1 class=\"text-6xl mt-10 font-bold\">Location Area</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"py-8 ml-20\">\n");
      out.write("          <!-- main -->\n");
      out.write("          <div class=\"-mx-4 sm:-mx-8 px-4 sm:px-8 py-3 overflow-x-hidden\">\n");
      out.write("            <table class=\"min-w-full border-collapse border border-blue-500\">\n");
      out.write("              <thead class=\"bg-neutral-100\">\n");
      out.write("                <tr class=\"bg-blue-500 text-white\">\n");
      out.write("                  <th\n");
      out.write("                    class=\"w-1/4 px-10 py-6 border-b-2 border-r text-2xl border-gray-300 text-left leading-4 tracking-wider\"\n");
      out.write("                  >\n");
      out.write("                    Animal Cage ID\n");
      out.write("                  </th>\n");
      out.write("                  <th\n");
      out.write("                    class=\"px-10 py-6 border-b-2 border-r text-2xl border-gray-300 text-left leading-4 tracking-wider\"\n");
      out.write("                    style=\"width: 100px\"\n");
      out.write("                  >\n");
      out.write("                    Employee_ID\n");
      out.write("                  </th>\n");
      out.write("                  <th\n");
      out.write("                    class=\"px-10 py-6 border-b-2 border-r text-2xl border-gray-300 text-left leading-4 tracking-wider\"\n");
      out.write("                    style=\"width: 100px\"\n");
      out.write("                  >\n");
      out.write("                    Location\n");
      out.write("                  </th>\n");
      out.write("                  <th\n");
      out.write("                    class=\"px-6 py-3 border-b border-r text-2xl border-gray-300 text-left leading-4 tracking-wider\"\n");
      out.write("                  >\n");
      out.write("                    Name\n");
      out.write("                  </th>\n");
      out.write("                </tr>\n");
      out.write("              </thead>\n");
      out.write("              ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </table>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </main>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <tbody\n");
          out.write("                  class=\"bg-white cursor-pointer hover:shadow-xl hover:transform hover:scale-105 hover:rounded-2xl duration-300 hover:bg-gray-100 hover:bg-gray-100 hover:border-gray-100\"\n");
          out.write("                >\n");
          out.write("                  <tr>\n");
          out.write("                    <td\n");
          out.write("                      class=\"text-blue-500 py-3 text-2xl px-6 py-3 border-b border-gray-200 border-r\"\n");
          out.write("                    >\n");
          out.write("                      <a href=\"animalcagesearch?animalcageID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.animalcage_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                        >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.animalcage_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a\n");
          out.write("                      >\n");
          out.write("                    </td>\n");
          out.write("                    <td\n");
          out.write("                      class=\"pl-10 py-3 text-2xl px-6 py-3 border-b border-gray-200 border-r\"\n");
          out.write("                    >\n");
          out.write("                      ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.employee_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                    </td>\n");
          out.write("\n");
          out.write("                    <td\n");
          out.write("                      class=\"pl-10 py-3 text-2xl px-6 py-3 border-b border-gray-200 border-r\"\n");
          out.write("                    >\n");
          out.write("                      ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.area_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                    </td>\n");
          out.write("\n");
          out.write("                    <td\n");
          out.write("                      class=\"py-3 text-2xl px-6 py-3 border-b border-gray-200 border-r\"\n");
          out.write("                    >\n");
          out.write("                      <a\n");
          out.write("                        class=\"cursor-pointer duration-300 hover:text-blue-600\"\n");
          out.write("                        href=\"animalsearch?animalID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.animalcage_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                        >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a\n");
          out.write("                      >\n");
          out.write("                    </td>\n");
          out.write("                  </tr>\n");
          out.write("                </tbody>");
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
