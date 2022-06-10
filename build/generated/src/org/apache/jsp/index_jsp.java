package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>八方快捷酒店前台管理系统-登录主页</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"./favicon.ico\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/index.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"head\">\n");
      out.write("            <h5></h5>八方快捷酒店前台管理系统<span>---登录界面</span>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"left\"></div>\n");
      out.write("        <div class=\"right\">\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <h5>登录</h5>\n");
      out.write("                <form action=\"\">\n");
      out.write("                    <div class=\"username\">\n");
      out.write("                        <input type=\"text\" placeholder=\"请输入账号\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"password\">\n");
      out.write("                        <input type=\"text\" placeholder=\"请输入密码\">\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"reset\" class=\"reset\" value=\"重置\">\n");
      out.write("                    <input type=\"submit\" class=\"login\" value=\"登录\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
}
