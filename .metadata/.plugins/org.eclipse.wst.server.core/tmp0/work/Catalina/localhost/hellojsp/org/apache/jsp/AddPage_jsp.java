/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.12
 * Generated at: 2018-12-10 07:24:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class AddPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("table.gridtable {\r\n");
      out.write("\tfont-family: verdana,arial,sans-serif;\r\n");
      out.write("\tfont-size:11px;\r\n");
      out.write("\tcolor:#333333;\r\n");
      out.write("\tborder-width: 1px;\r\n");
      out.write("\tborder-color: #666666;\r\n");
      out.write("\tborder-collapse: collapse;\r\n");
      out.write("}\r\n");
      out.write("table.gridtable th {\r\n");
      out.write("\tborder-width: 1px;\r\n");
      out.write("\tpadding: 8px;\r\n");
      out.write("\tborder-style: solid;\r\n");
      out.write("\tborder-color: #666666;\r\n");
      out.write("\tbackground-color: #dedede;\r\n");
      out.write("}\r\n");
      out.write("table.gridtable td {\r\n");
      out.write("\tborder-width: 1px;\r\n");
      out.write("\tpadding: 8px;\r\n");
      out.write("\tborder-style: solid;\r\n");
      out.write("\tborder-color: #666666;\r\n");
      out.write("\tbackground-color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");



String cid ="";
String fname="";
String mname="";
String lname="";
String work_zip="";
String work_state="";
String work_city="";
String work_address="";
String work_phone="";
String home_zip="";
String home_state="";
String home_city="";
String home_address="";
String home_phone="";
String birthday="";
String cell_phone="";

String home_add_id="";
String work_add_id="";
String Cell_phone_id="";
String home_phone_id="";
String work_phone_id="";
String birthday_id="";


    try{
        Class.forName("com.mysql.jdbc.Driver");
        String url     = "jdbc:mysql://localhost:3306/temp";
        String user    = "root";
        String pass    = "password";
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement stmt = con.createStatement();
       String maxidquery="select Max(contact_id) from contact";
       ResultSet rs   = stmt.executeQuery(maxidquery);

         while(rs.next()){
             cid     = rs.getString("Max(contact_id)");	
      int  num=Integer.parseInt(cid)+1;
           cid=Integer.toString(num);
     	
        }  
	
        con.close();
	
  } catch(Exception e){
      System.out.println(e);
  }


      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"AddAction.jsp\">\r\n");
      out.write("<input type=\"hidden\" name=\"cid\" value=\"");
      out.print(cid);
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=home_add_id value=\"");
      out.print(home_add_id);
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=work_add_id value=\"");
      out.print(work_add_id);
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=Cell_phone_id value=\"");
      out.print(Cell_phone_id);
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=home_phone_id value=\"");
      out.print(home_phone_id);
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=work_phone_id value=\"");
      out.print(work_phone_id);
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=birthday_id value=\"");
      out.print(birthday_id);
      out.write("\">\r\n");
      out.write("<table class=\"gridtable\">\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td></td>  <td><a href=\"index.jsp\">Back to contact List</a></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t\r\n");
      out.write("    <tr>\r\n");
      out.write("     <th>ID</th>  <td>");
      out.print(cid);
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <th>First Name</th> <td><input type=\"text\" name=\"fname\" value=\"");
      out.print(fname);
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <th>Middle Name</th>  <td><input type=\"text\" name=\"mname\" value=\"");
      out.print(mname);
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <th>Last Name</th>  <td><input type=\"text\" name=\"lname\" value=\"");
      out.print(lname);
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("     <th>Home Address</th>  <td><input type=\"text\" name=home_address value=\"");
      out.print(home_address);
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("     <th>Home City</th>  <td><input type=\"text\" name=home_city value=\"");
      out.print(home_city);
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("     <th>Home State</th>  <td><input type=\"text\" name=home_state value=\"");
      out.print(home_state);
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("     <th>Home Zip</th>  <td><input type=\"text\" name=home_zip value=\"");
      out.print(home_zip);
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("     <th>Work Address</th>  <td><input type=\"text\" name=work_address value=\"");
      out.print(work_address);
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("     <th>Work City</th>  <td><input type=\"text\" name=work_city value=\"");
      out.print(work_city);
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("     <th>Work State</th>  <td><input type=\"text\" name=work_state value=\"");
      out.print(work_state);
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("     <th>Work Zip</th>  <td><input type=\"text\" name=work_zip value=\"");
      out.print(work_zip);
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <th>Work Phone</th>  <td><input type=\"text\" name=work_phone value=\"");
      out.print(work_phone);
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <th>Cell Phone</th>  <td><input type=\"text\" name=cell_phone value=\"");
      out.print(cell_phone);
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <th>Home Phone</th>  <td><input type=\"text\" name=home_phone value=\"");
      out.print(home_phone);
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <th>Birthday</th>  <td><input type=\"text\" name=birthday value=\"");
      out.print(birthday);
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("     <td>&nbsp;</td> <td><input type=\"submit\" value=\"Add\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
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
