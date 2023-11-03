package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import sample.feedback.FeedbackDTO;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
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
      out.write("    <title>Feedback List</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <h1>Feedback List</h1>\n");
      out.write("    <table border=\"1\">\n");
      out.write("      <tr>\n");
      out.write("        <th>Feedback ID</th>\n");
      out.write("        <th>Title</th>\n");
      out.write("        <th>Purpose</th>\n");
      out.write("        <th>Date</th>\n");
      out.write("        <th>Process Note</th>\n");
      out.write("        <th>Employee ID</th>\n");
      out.write("        <th>Status</th>\n");
      out.write("        <!-- Add more columns for other animal attributes -->\n");
      out.write("      </tr>\n");
      out.write("      ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </table>\n");
      out.write("    <form action=\"SearchFeedbackController\" method=\"get\">\n");
      out.write("      <label for=\"feedback_id\">Search Feedback by ID:</label>\n");
      out.write("      <input type=\"text\" id=\"feedback_id\" name=\"feedback_id\" />\n");
      out.write("      <input type=\"submit\" value=\"Search\" />\n");
      out.write("    </form>\n");
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
    _jspx_th_c_forEach_0.setVar("feedback");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${feedback}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        <tr>\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${feedback.feedback_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${feedback.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${feedback.purpose}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${feedback.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${feedback.processnote}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${feedback.employee_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("          <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${feedback.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\n");
          out.write("          <td>\n");
          out.write("            <a\n");
          out.write("              href=\"DeleteFeedbackController?feedback_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${feedback.feedback_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("              >Delete</a\n");
          out.write("            >\n");
          out.write("          </td>\n");
          out.write("          <td>\n");
          out.write("            <a\n");
          out.write("              href=\"UpdateFeedbackController?feedback_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${feedback.feedback_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("              >Update</a\n");
          out.write("            >\n");
          out.write("          </td>\n");
          out.write("          <!-- Add more columns for other animal attributes -->\n");
          out.write("        </tr>\n");
          out.write("      ");
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
