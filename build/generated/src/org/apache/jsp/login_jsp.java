package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Structure/header.jsp");
    _jspx_dependants.add("/Structure/footer.jsp");
  }

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("        <link rel=\"manifest\" href=\"%PUBLIC_URL%/manifest.json\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"%PUBLIC_URL%/reset.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\" integrity=\"sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"./Style/NavBar.css\" type=\"text/css\" rel=\"stylesheet\" /><!--\r\n");
      out.write("-->     <link href=\"./Style/HeaderImg.css\" type=\"text/css\" rel=\"stylesheet\" /><!--\r\n");
      out.write("-->     <link href=\"./Style/TopHeader.css\" type=\"text/css\" rel=\"stylesheet\" /><!--\r\n");
      out.write("-->     <link href=\"./Style/App.css\" type=\"text/css\" rel=\"stylesheet\" /><!--\r\n");
      out.write("-->     <link href=\"./Style/BottomFooter.css\" type=\"text/css\" rel=\"stylesheet\" /><!--<!--\r\n");
      out.write("-->     <link href=\"./Style/TopFooter.css\" type=\"text/css\" rel=\"stylesheet\" /><!--\r\n");
      out.write("                                                                         \r\n");
      out.write("-->\r\n");
      out.write("    \r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("        <link rel=\"manifest\" href=\"%PUBLIC_URL%/manifest.json\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"%PUBLIC_URL%/reset.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\" integrity=\"sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"./Style/App.css\" type=\"text/css\" rel=\"stylesheet\" />    \r\n");
      out.write("        <link href=\"./Style/NavBar.css\" type=\"text/css\" rel=\"stylesheet\" /><!--\r\n");
      out.write("-->     <link href=\"./Style/HeaderImg.css\" type=\"text/css\" rel=\"stylesheet\" /><!--\r\n");
      out.write("-->     <link href=\"./Style/TopHeader.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"TopHeader\">\r\n");
      out.write("                    <div class=\"TopHeader-inner\">\r\n");
      out.write("                        <span>Open time 8:00 -18:00 Monday - Sunday</span>\r\n");
      out.write("                        <span> </span>\r\n");
      out.write("                        <i class=\"fab fa-facebook-f\" > </i>\r\n");
      out.write("                         <i class=\"fab fa-twitter\" > </i>\r\n");
      out.write("                         <i class=\"fab fa-linkedin-in\" > </i>\r\n");
      out.write("                         <i class=\"fab fa-instagram\" > </i>\r\n");
      out.write("                        <div class=\"TopHeader-login\"></i>\r\n");
      out.write("                        <i class=\"fas fa-user\"> </i><a href=\"login.jsp\">Đăng nhập</a>\r\n");
      out.write("                        <i class=\"fas fa-user-plus\"></i><a href=\"register.jsp\">Đăng kí</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"HeaderImg\">\r\n");
      out.write("                    <div class=\"HeaderImg-wrap\">\r\n");
      out.write("                        <img src=\"./Images/image.png\" alt=\"dfsf\" />\r\n");
      out.write("                        <img src=\"./Images/image2.png\" alt=\"dfd \" />\r\n");
      out.write("                        <div class=\"HeaderImg-wrapInner\">\r\n");
      out.write("                            <div class=\"HeaderImg-inner\">\r\n");
      out.write("                                <span> <i class=\"fas fa-phone\"> </i> HỖ TRỢ : 091270929 -091270929 </span>\r\n");
      out.write("                                <form action=\"/action_page.php\">\r\n");
      out.write("                                    <input  type=\"text\" placeholder=\"  Tìm kiếm..\" name=\"search\" /> \r\n");
      out.write("                                    <button>\r\n");
      out.write("                                        <i class=\"fa fa-search\" ></i></button>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"HeaderImg-cart\">\r\n");
      out.write("                                 <i class=\"fas fa-shopping-basket\">  <p> Giỏ hàng <span class=\"number\">3</span></p> </i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>         \r\n");
      out.write("                 <div class=\"NavBar\">\r\n");
      out.write("                    <ul >\r\n");
      out.write("                        <li>\r\n");
      out.write("                        <i  class=\"fas fa-bars\"></i>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                           TRANG CHỦ\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            GIỚI THIỆU\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"productPage\">\r\n");
      out.write("                           SẢN PHẨM\r\n");
      out.write("                           </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                           SẢN PHẨM MỚI\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            LIÊN HỆ\r\n");
      out.write("                        </li>\r\n");
      out.write("                       \r\n");
      out.write("                        <li class=\"search--sm\">\r\n");
      out.write("                            <input type=\"text\" placeholder=\"  Tìm kiếm..\" name=\"search\"  />\r\n");
      out.write("                            <button >\r\n");
      out.write("                                    </button>\r\n");
      out.write("                        </li>                        \r\n");
      out.write("                        <li class=\"search__icon\" >\r\n");
      out.write("                            <i  class=\"fa fa-search\"></i>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <i class=\"fas fa-shopping-basket\"> <span class=\"number--sm\">3</span> </i>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"NavBar--sm\">\r\n");
      out.write("                    <ul >\r\n");
      out.write("                        <li>\r\n");
      out.write("                            TRANG CHỦ\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            GIỚI THIỆU\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            SẢN PHẨM\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            SẢN PHẨM MỚI\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            LIÊN HỆ\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("           \r\n");
      out.write("                <button class=\"toTop_btn\" title=\"Lên đầu trang\"> <i class=\"fas fa-arrow-up\"></i> </button>\r\n");
      out.write("        </body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");

            Cookie[] cookies=request.getCookies();
            String email = "", password = "",rememberVal="";
            if (cookies != null) {
                 for (Cookie cookie : cookies) {
                   if(cookie.getName().equals("cEmail")) {
                     email = cookie.getValue();
                   }
                   if(cookie.getName().equals("cPass")){
                     password = cookie.getValue();
                   }
                   if(cookie.getName().equals("cRemember")){
                     rememberVal = cookie.getValue();
                   }
                }
            }
        
      out.write("\r\n");
      out.write("        <form action=\"LoginServlet\" method=\"post\">  \r\n");
      out.write("        Email:<input type=\"text\" name=\"email\"><br>  \r\n");
      out.write("        Password:<input type=\"password\" name=\"password\"> <br>\r\n");
      out.write("        <label>Remember</label> <input type=\"checkbox\" name=\"remember\" value=\"1\"\r\n");
      out.write("        />\r\n");
      out.write("        <input type=\"submit\" value=\"login\" >  \r\n");
      out.write("        </form>\r\n");
      out.write("         ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("        <link rel=\"manifest\" href=\"%PUBLIC_URL%/manifest.json\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"%PUBLIC_URL%/reset.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\" integrity=\"sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"./Style/App.css\" type=\"text/css\" rel=\"stylesheet\" />    \r\n");
      out.write("         <link href=\"./Style/BottomFooter.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("         <link href=\"./Style/TopFooter.css\" type=\"text/css\" rel=\"stylesheet\" /><\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div style=\"background:#313131\">\r\n");
      out.write("             <div class=\"TopFooter\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h6>KÊNH THÔNG TIN TỪ CHÚNG TÔI\r\n");
      out.write("            <br></br>\r\n");
      out.write("                        <span>\r\n");
      out.write("                                <i class=\"fab fa-facebook-f\" ></i>\r\n");
      out.write("                                <i class=\"fab fa-twitter\" ></i>\r\n");
      out.write("                                <i class=\"fab fa-linkedin-in\"></i>\r\n");
      out.write("                                <i class=\"fab fa-instagram\"></i>\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </h6>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div  >\r\n");
      out.write("                    <h6>ĐĂNG KÍ NHẬN EMAIL</h6>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div>\r\n");
      out.write("                    <form>\r\n");
      out.write("                        <input\r\n");
      out.write("                            type=\"text\"\r\n");
      out.write("                            placeholder=\"  Tìm kiếm..\"\r\n");
      out.write("                            name=\"search\"\r\n");
      out.write("                        />\r\n");
      out.write("                        <button type=\"button\">\r\n");
      out.write("                            <i class=\"fas fa-paper-plane\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("             <div style=\"width:100%; background:gray;color:transparent;max-height:0.8px;margin-bottom:40px;\">a</div>\r\n");
      out.write("            <div class=\"BottomFooter\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <div class=\"imageWrap\" >\r\n");
      out.write("                    <img src=\"./Images/image3.png\" alt=\"alt\"></img>\r\n");
      out.write("                    <span>Green Shop được thành lập từ 2019 và nhận được nhiều sự tin tưởng và nhận được \r\n");
      out.write("                    nhiều sự tin tưởng và nhận được nhiều sự tin tưởng</span>\r\n");
      out.write("                    <p><i class=\"fas fa-mobile-alt\"></i> Điện thoại : 0910212585</p>\r\n");
      out.write("                    <p><i class=\"fas fa-envelope\"></i> Email : linh@gmail.com</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><h5>THÔNG TIN KHÁCH HÀNG </h5></li>\r\n");
      out.write("                    <li>> Tài khoản của tôi</li>\r\n");
      out.write("                    <li>> Tài khoản của tôi</li>\r\n");
      out.write("                    <li>> Tài khoản của tôi</li>\r\n");
      out.write("                    <li>> Tài khoản của tôi</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            <div>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><h5>HỖ TRỢ DỊCH VỤ </h5></li>\r\n");
      out.write("                    <li>> Tài khoản của tôi</li>\r\n");
      out.write("                    <li>> Tài khoản của tôi</li>\r\n");
      out.write("                    <li>> Tài khoản của tôi</li>\r\n");
      out.write("                    <li>> Tài khoản của tôi</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><h5>CHÍNH SÁCH ƯU ĐÃI </h5></li>\r\n");
      out.write("                    <li>> Giảm 10% cho khách hàng </li>\r\n");
      out.write("                    <li>> Giảm 10% cho khách hàng </li>\r\n");
      out.write("                    <li>>Giảm 10% cho khách hàng </li>\r\n");
      out.write("                    <li>> Giảm 10% cho khách hàng </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><h5>TIN TỨC </h5></li>\r\n");
      out.write("                    <li>> Tin hot</li>\r\n");
      out.write("                    <li>> Tin mới</li>\r\n");
      out.write("                    <li>> Tin hôm qua</li>\r\n");
      out.write("                    <li>> Tin sắp tới</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div> \r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
