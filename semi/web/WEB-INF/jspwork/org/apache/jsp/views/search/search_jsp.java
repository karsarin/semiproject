/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.46
 * Generated at: 2017-10-16 03:23:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.search;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import search.model.vo.Notice;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("search.model.vo.Notice");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
 
	
	ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>noticeListView</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction insertPage()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tlocation.href=\"views/notice/noticeWriteForm.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write(" <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/templatemo_misc.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/templatemo_style.css\">\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/vendor/modernizr-2.6.1-respond-1.1.0.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(" ul#navi {\r\n");
      out.write("        width: 200px;\r\n");
      out.write("        text-indent: 10px;\r\n");
      out.write("}\r\n");
      out.write("    ul#navi, ul#navi ul {\r\n");
      out.write("        margin:0;\r\n");
      out.write("        padding:0;\r\n");
      out.write("        list-style:none;\r\n");
      out.write("}\r\n");
      out.write("    li.group {\r\n");
      out.write("        margin-bottom: 3px;\r\n");
      out.write("}\r\n");
      out.write("    li.group div.title {\r\n");
      out.write("        height: 35px;\r\n");
      out.write("        line-height: 35px;\r\n");
      out.write("        background:lightgray;\r\n");
      out.write("        cursor:pointer;\r\n");
      out.write("}\r\n");
      out.write("    ul.sub li {\r\n");
      out.write("        margin-bottom: 2px;\r\n");
      out.write("        height:35px;\r\n");
      out.write("        line-height:35px;\r\n");
      out.write("        background:#f4f4f4;\r\n");
      out.write("        cursor:pointer;\r\n");
      out.write("}\r\n");
      out.write("    ul.sub li a {\r\n");
      out.write("        display: block;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height:100%;\r\n");
      out.write("        text-decoration:none;\r\n");
      out.write("        color:#000;\r\n");
      out.write("}\r\n");
      out.write("    ul.sub li:hover {\r\n");
      out.write("        background:gray;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <div class=\"main-header\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div id=\"menu-wrapper\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"logo-wrapper col-md-2 col-sm-2\">\r\n");
      out.write("                                    <h1>\r\n");
      out.write("                                        <a href=\"#\">Han</a>\r\n");
      out.write("                                    </h1>\r\n");
      out.write("                                </div> <!-- /.logo-wrapper -->\r\n");
      out.write("                                <div class=\"col-md-10 col-sm-10 main-menu text-right\">\r\n");
      out.write("                                    <div class=\"toggle-menu visible-sm visible-xs\"><i class=\"fa fa-bars\"></i></div>\r\n");
      out.write("                                    <ul class=\"menu-first\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form action=\"/semi/tsearch\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"search\" name = \"keyword\" autocomplete>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"제목검색\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("                                        <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("                                        <li><a href=\"ar.html\">카테고리</a></li>\r\n");
      out.write("                                        <li><a href=\"#portfolio\">공지사항</a></li>\r\n");
      out.write("                                        <li><a href=\"#our-team\">게시판</a></li>                                       \r\n");
      out.write("                                        <li><a href=\"#contact\">마이페이지</a></li>                                 \r\n");
      out.write("                                    </ul>                                    \r\n");
      out.write("                                </div> <!-- /.main-menu -->\r\n");
      out.write("                            </div> <!-- /.row -->\r\n");
      out.write("                        </div> <!-- /#menu-wrapper -->                        \r\n");
      out.write("                    </div> <!-- /.container -->\r\n");
      out.write("                </div> <!-- /.main-header -->\r\n");
      out.write("            </div> <!-- /.site-header -->\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"width:300px; height:500px; float:left;\">\r\n");
      out.write("\t\r\n");
      out.write("<ul id=\"navi\">\r\n");
      out.write("        <li class=\"group\">\r\n");
      out.write("            <div class=\"title\">카테고리</div>\r\n");
      out.write("            <ul class=\"sub\">\r\n");
      out.write("                <li><a href=\"#\">IT 재능</a></li>\r\n");
      out.write("                <li><a href=\"#\">집안일</a></li>\r\n");
      out.write("                <li><a href=\"#\">마케팅</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">홍보</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">문학</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">수작업</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">한수빈</a></li>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("       \r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h2 align=\"center\">공지사항</h2>\r\n");
      out.write("<br><br>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("\t<button onclick=\"insertPage();\">글쓰기</button>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("\t<form action = \"/first/nsearch\" method = \"post\">\r\n");
      out.write("\t\t<input type = \"search\" autocomplete name=\"keyword\" length=\"50\">&nbsp;\r\n");
      out.write("\t\t<input type=\"submit\" value=\"제목검색\">\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("<table align=\"center\" width=\"600\" border=\"1\" cellspacing=\"0\">\r\n");
      out.write("<th>번호</th><th>제목</th><th>작성자</th><th>날짜</th><th>첨부파일</th><th>조회수</th>\r\n");
 
	/* while(iter.hasNext()){
		Map.Entry<Integer, Notice> entry = iter.next();
		Integer key = entry.getKey();
		Notice notice = entry.getValue(); */
		for(Notice notice : list){		

      out.write("\r\n");
      out.write("\t<tr height=\"30\">\r\n");
      out.write("\t<td>");
      out.print( notice.getNoticeNo() );
      out.write("</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t\r\n");
      out.write("\t\t");
      out.print( notice.getNoticeTitle() );
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td>");
      out.print( notice.getNoticeWriter() );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print( notice.getNoticeDate() );
      out.write("</td>\r\n");
      out.write("\t<td align=\"center\">\r\n");
      out.write("\t");
if(notice.getOriginalFileName() != null){
      out.write(" \r\n");
      out.write("\t\t●\r\n");
      out.write("\t");
}else {
      out.write("\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t ");
} 
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td>");
      out.print( notice.getReadCount() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
} 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<br><br>\r\n");
      out.write("<div align=\"center\" style=\"clear:both;\">\r\n");
      out.write("\t<a href=\"/first/index.jsp\">시작 페이지로 이동</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
