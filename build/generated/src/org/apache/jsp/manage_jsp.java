package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>八方快捷酒店管理系统-管理员登录</title>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"./favicon.ico\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/common.css\">\n");
      out.write("    <script src=\"./js/manage.js\"></script>\n");
      out.write("    <script src=\"./js/common.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header class=\"head\">\n");
      out.write("        <h5></h5>八方快捷酒店前台管理系统\n");
      out.write("    </header>\n");
      out.write("    <div class=\"left\"></div>\n");
      out.write("    <div class=\"right\">\n");
      out.write("        <div class=\"hd clearfix\">\n");
      out.write("            <div class=\"function_list\">\n");
      out.write("                <ul>\n");
      out.write("                    <li>为管理员所提供功能</li>\n");
      out.write("                    <li>预定记录</li>\n");
      out.write("                    <li>入住记录</li>\n");
      out.write("                    <li>换房记录</li>\n");
      out.write("                    <li>续住记录</li>\n");
      out.write("                    <li>退房记录</li>\n");
      out.write("                    <li>客房管理</li>\n");
      out.write("                    <li>员工管理</li>\n");
      out.write("                    <li class=\"out\">退出系统</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main clearfix\">\n");
      out.write("                <div class=\"bar\">\n");
      out.write("                    <div class=\"animate\">\n");
      out.write("                        <span>←使用需知</span>\n");
      out.write("                        <div class=\"tan\" style=\"height: 531px\">当前为管理员使用，此系统为管理员提供了七大功能：预定记录、入住记录、换房记录、续住记录、退房记录、员工管理、客房管理，其中前五个功能只有显示记录一项子功能，员工管理包括：增加、删除、显示三个子功能，客房价格包括：显示客房记录、调整客房价格两个子功能，使用者需点击相应功能按钮，或者根据提示输入正确格式的数据信息，完成相应功能实现，祝您使用愉快！</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"blank\"></div>\n");
      out.write("                <div class=\"function\">\n");
      out.write("                    <div class=\"tab_list\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>预定记录</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"block1 group1\">\n");
      out.write("                            <form method=\"post\" action=\"ScheduledShowServlet\">\n");
      out.write("                                <input type=\"submit\" value=\"显示\" class=\"show\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"block1 group2\">\n");
      out.write("                            <form method=\"post\" action=\"LiveInShowServlet\">\n");
      out.write("                                <input type=\"submit\" value=\"显示\" class=\"show\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"block1 group3\">\n");
      out.write("                            <form method=\"post\" action=\"ExchangedShowServlet\">\n");
      out.write("                                <input type=\"submit\" value=\"显示\" class=\"show\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"block1 group4\">\n");
      out.write("                            <form method=\"post\" action=\"ContinuteShowServlet\">\n");
      out.write("                                <input type=\"submit\" value=\"显示\" class=\"show\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"block1 group5\">\n");
      out.write("                            <form method=\"post\" action=\"LiveOutShowServlet\">\n");
      out.write("                                <input type=\"submit\" value=\"显示\" class=\"show\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"block1 group6\">\n");
      out.write("                            <form method=\"post\" action=\"RoomShowServlet\">\n");
      out.write("                                <input type=\"submit\" value=\"显示\" class=\"show\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"block2 group6\">\n");
      out.write("                            <h5>请输入客房类型以及预调整价格</h5>\n");
      out.write("                            <form method=\"post\" action=\"RoomPriceAdjustServlet\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><label for=\"custom_tel\">客房类型：</label><input type=\"text\" id=\"custom_tel\" name=\"room_type\" class=\"scheduled_room_type\"><span></span></li>\n");
      out.write("                                    <li><label for=\"scheduled_room\">调整价格：</label><input type=\"text\" id=\"scheduled_room\" name=\"room_price\" class=\"scheduled_price\"><span></span></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <input type=\"reset\" value=\"清空\"><input type=\"submit\" value=\"调整\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"block1 group7\">\n");
      out.write("                            <form method=\"post\" action=\"UserShowServlet\">\n");
      out.write("                                <input type=\"submit\" value=\"显示\" class=\"show\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"block2 group7\">\n");
      out.write("                            <form method=\"post\" action=\"UserAddServlet\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><label for=\"custom_tel\">账号：</label><input type=\"text\" id=\"custom_tel\" name=\"id\" class=\"custom_tel\"><span></span></li>\n");
      out.write("                                    <li><label for=\"scheduled_room\">姓名：</label><input type=\"text\" id=\"scheduled_room\" name=\"name\" class=\"custom_name\"><span></span></li>\n");
      out.write("                                    <li><label for=\"custom_tel\">密码：</label><input type=\"text\" id=\"custom_tel\" name=\"password\" class=\"password\"><span></span></li>\n");
      out.write("                                    <li><label for=\"scheduled_room\">邮箱：</label><input type=\"text\" id=\"scheduled_room\" name=\"email\" class=\"email\"><span></span></li>\n");
      out.write("                                    <li><label for=\"custom_tel\">权限：</label><input type=\"text\" id=\"custom_tel\" name=\"authority\" class=\"authority\"><span></span></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <input type=\"reset\" value=\"清空\"><input type=\"submit\" value=\"添加\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"block3 group7\">\n");
      out.write("                            <h5>请输入员工账号或者员工姓名</h5>\n");
      out.write("                            <form method=\"post\" action=\"UserDeleteServlet\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><label for=\"custom_tel\">员工账号：</label><input type=\"text\" id=\"custom_tel\" name=\"id\" class=\"custom_tel\"><span></span></li>\n");
      out.write("                                    <li><label for=\"scheduled_room\">员工姓名：</label><input type=\"text\" id=\"scheduled_room\" name=\"name\" class=\"custom_name\"><span></span></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <input type=\"reset\" value=\"清空\"><input type=\"submit\" value=\"删除\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"ft\">\n");
      out.write("            ");
 String name;
                    name = (String) session.getAttribute("name");
                
      out.write("\n");
      out.write("                <span class=\"user\">当前用户：");
      out.print(name);
      out.write("</span>\n");
      out.write("                <span class=\"time\"></span>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
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
}
