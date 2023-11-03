package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class animalcage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
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
      out.write("        <!-- loading -->\n");
      out.write("    <iframe\n");
      out.write("        id=\"loading-iframe\"\n");
      out.write("        src=\"components/loading.html\"\n");
      out.write("        frameborder=\"0\"\n");
      out.write("        style=\"\n");
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
      out.write("        \"\n");
      out.write("        ></iframe>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        window.addEventListener(\"load\", function () {\n");
      out.write("            // Code xử lý sau khi trang đã nạp hoàn toàn ở đây\n");
      out.write("            var iframe = document.getElementById(\"loading-iframe\");\n");
      out.write("            if (iframe) {\n");
      out.write("                iframe.style.zIndex = 0;\n");
      out.write("                iframe.classList.add(\"hidden-iframe\");\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("        .hidden-iframe {\n");
      out.write("            opacity: 0;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <!-- end loading -->\n");
      out.write("    <style>\n");
      out.write("        /* Image Popup */\n");
      out.write("        .image-popup {\n");
      out.write("            display: none;\n");
      out.write("            position: fixed;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            background-color: rgba(0, 0, 0, 0.7);\n");
      out.write("            z-index: 999;\n");
      out.write("            overflow: auto;\n");
      out.write("        }\n");
      out.write("        .image-popup-content {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            height: 100%;\n");
      out.write("        }\n");
      out.write("        .enlarged-image {\n");
      out.write("            max-width: 80%;\n");
      out.write("            max-height: 80%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <title>Animal Cage List</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"w-[1500px] block overflow-x-hidden mx-auto bg-green-500\">\n");
      out.write("    <main class=\"antialiased font-sans bg-white\">\n");
      out.write("        <div class=\"container mx-auto px-4 sm:px-8\">\n");
      out.write("            <div class=\"flex justify-center\">\n");
      out.write("                <h1 class=\"text-6xl mt-10 font-bold\">Animal Cage List</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"py-8 ml-20\">\n");
      out.write("                <div class=\"my-2 flex sm:flex-row\">\n");
      out.write("                    <!-- Search -->\n");
      out.write("                    <form action=\"animalcagesearch\" method=\"get\">\n");
      out.write("                        <div class=\"block relative\">\n");
      out.write("                            <span\n");
      out.write("                                class=\"h-full absolute inset-y-0 left-0 flex items-center pl-4 cursor-pointer\"\n");
      out.write("                                >\n");
      out.write("                                <svg\n");
      out.write("                                    viewBox=\"0 0 24 24\"\n");
      out.write("                                    class=\"h-6 w-6 fill-current text-gray-500\"\n");
      out.write("                                    >\n");
      out.write("                                <path\n");
      out.write("                                    d=\"M10 4a6 6 0 100 12 6 6 0 000-12zm-8 6a8 8 0 1114.32 4.906l5.387 5.387a1 1 0 01-1.414 1.414l-5.387-5.387A8 8 0 012 10z\"\n");
      out.write("                                    ></path>\n");
      out.write("                                </svg>\n");
      out.write("                            </span>\n");
      out.write("                            <input type=\"hidden\" name=\"areaid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.areaid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <input\n");
      out.write("                                type=\"text\"\n");
      out.write("                                id=\"animalcageID\"\n");
      out.write("                                name=\"animalcageID\"\n");
      out.write("                                placeholder=\"Search\"\n");
      out.write("                                class=\"text-2xl pl-12 rounded-3xl border border-gray-400 bg-white placeholder-gray-400 text-gray-700 focus:bg-white focus:placeholder-gray-600 focus:text-gray-700 focus:outline-none\"\n");
      out.write("                                value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${search}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                />\n");
      out.write("                            <input\n");
      out.write("                                class=\"text-2xl pl-2 cursor-pointer hover:text-blue-500 transition-colors duration-300\"\n");
      out.write("                                type=\"submit\"\n");
      out.write("                                value=\"Search\"\n");
      out.write("                                placeholder=\"Search Animal by ID\"\n");
      out.write("                                />\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <!-- end Search -->\n");
      out.write("                    <!-- Create  -->\n");
      out.write("                    <form class=\"ml-auto\" action=\"createanimalcage\" method=\"get\">\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${areaid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <button\n");
      out.write("                            type=\"submit\"\n");
      out.write("                            class=\"flex animate-bounce items-center px-12 py-3 leading-5 text-white transition-colors duration-300 transform bg-gray-700 rounded-md hover:bg-green-400 focus:outline-none focus:bg-green-100hover:transform hover:scale-105\"\n");
      out.write("                            >\n");
      out.write("                            <svg\n");
      out.write("                                xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                fill=\"none\"\n");
      out.write("                                viewBox=\"0 0 24 24\"\n");
      out.write("                                stroke-width=\"1.5\"\n");
      out.write("                                stroke=\"currentColor\"\n");
      out.write("                                class=\"w-5 h-5\"\n");
      out.write("                                >\n");
      out.write("                            <path\n");
      out.write("                                stroke-linecap=\"round\"\n");
      out.write("                                stroke-linejoin=\"round\"\n");
      out.write("                                d=\"M12 9v6m3-3H9m12 0a9 9 0 11-18 0 9 9 0 0118 0z\"\n");
      out.write("                                ></path>\n");
      out.write("                            </svg>\n");
      out.write("                            <span class=\"ml-1 text-2xl\">Add</span>\n");
      out.write("                        </button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <!-- end Create -->\n");
      out.write("\n");
      out.write("                <!-- Error message -->\n");
      out.write("                <p style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                <!-- end message -->\n");
      out.write("\n");
      out.write("                <!-- main -->\n");
      out.write("                <div class=\"-mx-4 sm:-mx-8 px-4 sm:px-8 py-4 overflow-x-hidden p-10\">\n");
      out.write("                    <!-- table -->\n");
      out.write("                    ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    <!-- end -->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"flex ml-0\">\n");
      out.write("                    <a\n");
      out.write("                        href=\"managercontroller\"\n");
      out.write("                        class=\"group flex items-center bg-transparent text-2xl font-thin tracking-widest text-white back-button\"\n");
      out.write("                        >\n");
      out.write("                        <svg\n");
      out.write("                            viewBox=\"0 0 46 16\"\n");
      out.write("                            height=\"15\"\n");
      out.write("                            width=\"35\"\n");
      out.write("                            xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                            id=\"arrow-horizontal\"\n");
      out.write("                            class=\"fill-slate-700 transition-all duration-300 ease-out group-hover:-translate-x-full group-hover:scale-x-105 group-hover:fill-white\"\n");
      out.write("                            >\n");
      out.write("                        <path\n");
      out.write("                            transform=\"scale(-1, 1) translate(-30)\"\n");
      out.write("                            d=\"M8,0,6.545,1.455l5.506,5.506H-30V9.039H12.052L6.545,14.545,8,16l8-8Z\"\n");
      out.write("                            data-name=\"Path 10\"\n");
      out.write("                            id=\"Path_10\"\n");
      out.write("                            ></path>\n");
      out.write("                        </svg>\n");
      out.write("                        <span\n");
      out.write("                            class=\"ml-2 text-black after:transition-transform after:duration-500 after:ease-out after:absolute after:bottom-0 after:left-0 after:block after:h-[2px] after:w-full after:origin-bottom-right after:scale-x-0 after:bg-blue-500 after:content-[''] after:group-hover:origin-bottom-left after:group-hover:scale-x-100\"\n");
      out.write("                            >Back</span\n");
      out.write("                        >\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(animalcagelist) > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <table\n");
        out.write("                                class=\"min-w-full border-collapse border border-blue-500\"\n");
        out.write("                                >\n");
        out.write("                                <thead class=\"bg-neutral-100\">\n");
        out.write("                                    <tr class=\"bg-blue-500 text-white\">\n");
        out.write("                                        <th\n");
        out.write("                                            class=\"px-10 py-6 border-b-2 border-r text-2xl border-gray-300 text-left leading-4 tracking-wider\"\n");
        out.write("                                            style=\"width: 100px\"\n");
        out.write("                                            >\n");
        out.write("                                            AnimalCage_ID\n");
        out.write("                                        </th>\n");
        out.write("                                        <th\n");
        out.write("                                            class=\"px-6 py-3 border-b border-r text-2xl border-gray-300 text-left leading-4 tracking-wider\"\n");
        out.write("                                            >\n");
        out.write("                                            Area_ID\n");
        out.write("                                        </th>\n");
        out.write("                                        <th\n");
        out.write("                                            class=\"px-10 pl-8 py-6 border-b border-r text-2xl border-gray-300 text-left leading-4 tracking-wider\"\n");
        out.write("                                            style=\"width: 100px\"\n");
        out.write("                                            >\n");
        out.write("                                            Employee_ID\n");
        out.write("                                        </th>\n");
        out.write("                                        <th\n");
        out.write("                                            class=\"px-6 py-3 border-b border-r text-2xl border-gray-300 text-left leading-4 tracking-wider\"\n");
        out.write("                                            >\n");
        out.write("                                            Name\n");
        out.write("                                        </th>\n");
        out.write("                                        <th\n");
        out.write("                                            class=\"px-6 py-3 border-b border-r text-2xl border-gray-300 text-left leading-4 tracking-wider\"\n");
        out.write("                                            >\n");
        out.write("                                            Photo\n");
        out.write("                                        </th>\n");
        out.write("                                        <th\n");
        out.write("                                            class=\"px-6 py-3 border-b text-2xl text-center border-gray-300 text-left leading-4 tracking-wider\"\n");
        out.write("                                            >\n");
        out.write("                                            Action\n");
        out.write("                                        </th>\n");
        out.write("                                    </tr>\n");
        out.write("                                </thead>\n");
        out.write("                                ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </table>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_forEach_0.setVar("animalcage");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${animalcagelist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tbody\n");
          out.write("                                        class=\"bg-white cursor-pointer hover:shadow-xl hover:transform hover:scale-105 hover:rounded-2xl duration-300 hover:bg-gray-100\"\n");
          out.write("                                        >\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td\n");
          out.write("                                                class=\"pl-10 py-4 text-2xl px-6 py-4 border-b border-gray-200 border-r\"\n");
          out.write("                                                >\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${animalcage.animalcage_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                            </td>\n");
          out.write("\n");
          out.write("                                            <td\n");
          out.write("                                                class=\"px-6 py-4 text-2xl leading-5 text-gray-500 whitespace-no-wrap border-b border-gray-200 border-r\"\n");
          out.write("                                                >\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${animalcage.area_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                            </td>\n");
          out.write("                                            <td\n");
          out.write("                                                class=\"px-8 py-10 text-2xl leading-5 text-gray-500 border-b border-gray-200 border-r\"\n");
          out.write("                                                >\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${animalcage.employee_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                            </td>\n");
          out.write("                                            <td\n");
          out.write("                                                class=\"py-4 text-2xl px-6 py-4 border-b border-gray-200 border-r\"\n");
          out.write("                                                >\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${animalcage.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                            </td>\n");
          out.write("                                            <td\n");
          out.write("                                                class=\"py-4 text-2xl px-6 py-4 border-b border-gray-200 border-r\"\n");
          out.write("                                                >\n");
          out.write("                                                <img\n");
          out.write("                                                    src=\"./animalcage_picture/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${animalcage.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                                    width=\"150\"\n");
          out.write("                                                    height=\"140\"\n");
          out.write("                                                    />\n");
          out.write("                                            </td>\n");
          out.write("                                            <td\n");
          out.write("                                                class=\"py-2 text-sm font-medium leading-5 whitespace-no-wrap border-b border-gray-200\"\n");
          out.write("                                                >\n");
          out.write("                                                <div class=\"flex justify-center items-center\">\n");
          out.write("                                                    <!-- edit --><a\n");
          out.write("                                                        href=\"updateanimalcage?animalcageID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${animalcage.animalcage_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                                        >\n");
          out.write("                                                        <button\n");
          out.write("                                                            class=\"flex p-2.5 bg-gray-400 rounded-xl hover:rounded-3xl hover:bg-green-500 transition-all duration-300 text-white\"\n");
          out.write("                                                            >\n");
          out.write("                                                            <svg\n");
          out.write("                                                                xmlns=\"http://www.w3.org/2000/svg\"\n");
          out.write("                                                                class=\"h-5 w-5\"\n");
          out.write("                                                                fill=\"none\"\n");
          out.write("                                                                viewBox=\"0 0 24 24\"\n");
          out.write("                                                                stroke=\"currentColor\"\n");
          out.write("                                                                stroke-width=\"2\"\n");
          out.write("                                                                >\n");
          out.write("                                                            <path\n");
          out.write("                                                                stroke-linecap=\"round\"\n");
          out.write("                                                                stroke-linejoin=\"round\"\n");
          out.write("                                                                d=\"M11 5H6a2 2 0 00-2 2v11a2 2 0 002 2h11a2 2 0 002-2v-5m-1.414-9.414a2 2 0 112.828 2.828L11.828 15H9v-2.828l8.586-8.586z\"\n");
          out.write("                                                                />\n");
          out.write("                                                            </svg></button\n");
          out.write("                                                        ></a>\n");
          out.write("                                                    <!-- delete -->\n");
          out.write("                                                    <div class=\"pl-2\">\n");
          out.write("                                                        <a\n");
          out.write("                                                            href=\"deleteanimalcage?animalcageID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${animalcage.animalcage_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                                            class=\"\"\n");
          out.write("                                                            onclick=\"return confirmDelete();\"\n");
          out.write("                                                            onclick=\"saveScrollPosition();\n");
          out.write("                                                                    return confirmDelete();\"\n");
          out.write("                                                            >\n");
          out.write("                                                            <button\n");
          out.write("                                                                class=\"flex p-2.5 bg-gray-400 rounded-xl hover:rounded-3xl hover:bg-red-500 transition-all duration-300 text-white\"\n");
          out.write("                                                                >\n");
          out.write("                                                                <i\n");
          out.write("                                                                    fill=\"none\"\n");
          out.write("                                                                    viewBox=\"0 0 24 24\"\n");
          out.write("                                                                    stroke=\"currentColor\"\n");
          out.write("                                                                    stroke-width=\"2\"\n");
          out.write("                                                                    class=\"h-4 w-4 fas fa-trash-alt\"\n");
          out.write("                                                                    ></i></button\n");
          out.write("                                                            ></a>\n");
          out.write("                                                    </div>\n");
          out.write("\n");
          out.write("                                                    <script src=\"js/possitionload.js\"></script>\n");
          out.write("                                                    <!-- end delete -->\n");
          out.write("                                                </div>\n");
          out.write("                                            </td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    </tbody>\n");
          out.write("                                ");
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

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <table\n");
        out.write("                                class=\"min-w-full border-collapse border border-blue-500\"\n");
        out.write("                                >\n");
        out.write("                                <thead class=\"bg-neutral-50\">\n");
        out.write("                                    <tr class=\"bg-blue-500 text-white\">\n");
        out.write("                                        <th\n");
        out.write("                                            class=\"px-10 py-6 border-b border-r text-2xl border-gray-300 text-left leading-4 tracking-wider\"\n");
        out.write("                                            style=\"width: 100px\"\n");
        out.write("                                            >\n");
        out.write("                                            AnimalCage_ID\n");
        out.write("                                        </th>\n");
        out.write("                                        <th\n");
        out.write("                                            class=\"px-6 py-3 border-b border-r text-2xl border-gray-300 text-left leading-4 tracking-wider\"\n");
        out.write("                                            >\n");
        out.write("                                            Area_ID\n");
        out.write("                                        </th>\n");
        out.write("                                        <th\n");
        out.write("                                            class=\"px-10 py-6 border-b border-r text-2xl border-gray-300 text-left leading-4 tracking-wider\"\n");
        out.write("                                            style=\"width: 100px\"\n");
        out.write("                                            >\n");
        out.write("                                            Employee_ID\n");
        out.write("                                        </th>\n");
        out.write("                                        <th\n");
        out.write("                                            class=\"px-6 py-3 border-b border-r text-2xl border-gray-300 text-left leading-4 tracking-wider\"\n");
        out.write("                                            >\n");
        out.write("                                            Name\n");
        out.write("                                        </th>\n");
        out.write("                                        <th\n");
        out.write("                                            class=\"px-6 py-3 border-b border-r text-2xl text-center border-gray-300 text-left leading-4 tracking-wider\"\n");
        out.write("                                            >\n");
        out.write("                                            Photo\n");
        out.write("                                        </th>\n");
        out.write("                                        <th\n");
        out.write("                                            class=\"px-6 py-3 border-b border-r text-2xl text-center border-gray-300 text-left leading-4 tracking-wider\"\n");
        out.write("                                            >\n");
        out.write("                                            Action\n");
        out.write("                                        </th>\n");
        out.write("                                    </tr>\n");
        out.write("                                </thead>\n");
        out.write("                                ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </table>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_forEach_1.setVar("animalcage");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${animalcage}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tbody\n");
          out.write("                                        class=\"bg-white cursor-pointer hover:shadow-xl hover:transform hover:scale-105 hover:rounded-2xl duration-300 hover:bg-gray-100\"\n");
          out.write("                                        >\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td\n");
          out.write("                                                class=\"pl-10 py-4 text-2xl px-6 py-4 border-b border-gray-200 border-r\"\n");
          out.write("                                                >\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${animalcage.animalcage_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                            </td>\n");
          out.write("                                            <td\n");
          out.write("                                                class=\"px-6 py-4 text-2xl leading-5 text-gray-500 whitespace-no-wrap border-b border-gray-200 border-r\"\n");
          out.write("                                                >\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${animalcage.area_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                            </td>\n");
          out.write("                                            <td\n");
          out.write("                                                class=\"px-8 py-10 text-2xl leading-5 text-gray-500 border-b border-gray-200 border-r\"\n");
          out.write("                                                >\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${animalcage.employee_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                            </td>\n");
          out.write("\n");
          out.write("                                            <td\n");
          out.write("                                                class=\"py-4 text-2xl px-6 py-4 border-b border-gray-200 border-r\"\n");
          out.write("                                                >\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${animalcage.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                            </td>\n");
          out.write("                                            <td\n");
          out.write("                                                class=\"py-4 text-2xl px-6 py-4 border-b border-gray-200 border-r\"\n");
          out.write("                                                >\n");
          out.write("                                                <img\n");
          out.write("                                                    src=\"./animalcage_picture/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${animalcage.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                                    width=\"150\"\n");
          out.write("                                                    height=\"140\"\n");
          out.write("                                                    />\n");
          out.write("                                            </td>\n");
          out.write("                                            <td\n");
          out.write("                                                class=\"py-2 text-sm font-medium leading-5 whitespace-no-wrap border-b border-gray-200\"\n");
          out.write("                                                >\n");
          out.write("                                                <div class=\"flex justify-center items-center\">\n");
          out.write("                                                    <!-- edit -->\n");
          out.write("                                                    <a\n");
          out.write("                                                        href=\"updateanimalcage?animalcageID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${animalcage.animalcage_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                                        >\n");
          out.write("                                                        <button\n");
          out.write("                                                            class=\"flex p-2.5 bg-gray-400 rounded-xl hover:rounded-3xl hover:bg-green-500 transition-all duration-300 text-white\"\n");
          out.write("                                                            >\n");
          out.write("                                                            <svg\n");
          out.write("                                                                xmlns=\"http://www.w3.org/2000/svg\"\n");
          out.write("                                                                class=\"h-5 w-5\"\n");
          out.write("                                                                fill=\"none\"\n");
          out.write("                                                                viewBox=\"0 0 24 24\"\n");
          out.write("                                                                stroke=\"currentColor\"\n");
          out.write("                                                                stroke-width=\"2\"\n");
          out.write("                                                                >\n");
          out.write("                                                            <path\n");
          out.write("                                                                stroke-linecap=\"round\"\n");
          out.write("                                                                stroke-linejoin=\"round\"\n");
          out.write("                                                                d=\"M11 5H6a2 2 0 00-2 2v11a2 2 0 002 2h11a2 2 0 002-2v-5m-1.414-9.414a2 2 0 112.828 2.828L11.828 15H9v-2.828l8.586-8.586z\"\n");
          out.write("                                                                />\n");
          out.write("                                                            </svg>\n");
          out.write("                                                        </button>\n");
          out.write("                                                    </a>\n");
          out.write("                                                    <!-- delete -->\n");
          out.write("                                                    <div class=\"pl-2\">\n");
          out.write("                                                        <a\n");
          out.write("                                                            href=\"deleteanimalcage?animalcageID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${animalcage.animalcage_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                                            class=\"\"\n");
          out.write("                                                            onclick=\"saveScrollPosition();\n");
          out.write("                                                                    return confirmDelete();\"\n");
          out.write("                                                            >\n");
          out.write("                                                            <button\n");
          out.write("                                                                class=\"flex p-2.5 bg-gray-400 rounded-xl hover:rounded-3xl hover:bg-red-500 transition-all duration-300 text-white\"\n");
          out.write("                                                                >\n");
          out.write("                                                                <i\n");
          out.write("                                                                    fill=\"none\"\n");
          out.write("                                                                    viewBox=\"0 0 24 24\"\n");
          out.write("                                                                    stroke=\"currentColor\"\n");
          out.write("                                                                    stroke-width=\"2\"\n");
          out.write("                                                                    class=\"h-4 w-4 fas fa-trash-alt\"\n");
          out.write("                                                                    ></i></button\n");
          out.write("                                                            ></a>\n");
          out.write("                                                    </div>\n");
          out.write("\n");
          out.write("                                                    <script src=\"js/possitionload.js\"></script>\n");
          out.write("                                                    <!-- end delete -->\n");
          out.write("                                                </div>\n");
          out.write("                                            </td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    </tbody>\n");
          out.write("                                ");
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
