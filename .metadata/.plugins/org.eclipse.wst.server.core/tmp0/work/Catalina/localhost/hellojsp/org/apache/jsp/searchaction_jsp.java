/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.12
 * Generated at: 2018-12-10 06:54:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class searchaction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
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

String cid     = request.getParameter("cid");
String fname   = request.getParameter("fname");
String mname = request.getParameter("mname");
String lname = request.getParameter("lname");
String work_zip=request.getParameter("work_zip");
String work_state=request.getParameter("work_state");
String work_city=request.getParameter("work_city");
String work_address=request.getParameter("work_address");
String work_phone=request.getParameter("work_phone");
String home_zip=request.getParameter("home_zip");
String home_state=request.getParameter("home_state");
String home_city=request.getParameter("home_city");
String home_address=request.getParameter("home_address");
String home_phone=request.getParameter("home_phone");
String birthday=request.getParameter("birthday");
String cell_phone=request.getParameter("cell_phone");

String home_add_id=request.getParameter("home_add_id");
String work_add_id=request.getParameter("work_add_id");
String Cell_phone_id=request.getParameter("Cell_phone_id");
String home_phone_id=request.getParameter("home_phone_id");
String work_phone_id=request.getParameter("work_phone_id");
String birthday_id=request.getParameter("birthday_id");

    try{
        Class.forName("com.mysql.jdbc.Driver");
        String url     = "jdbc:mysql://localhost:3306/temp";
        String user    = "root";
        String pass    = "password";
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement stmt = con.createStatement();
        
        String whereCondition="";
        if(  cid != null){
        	cid=cid.trim();
        	whereCondition +=" AND A.contact_id LIKE '%"+cid+"%'";
        }
    if(  fname != null){
    	fname=fname.trim();
    	whereCondition +=" AND A.first_name LIKE '%"+fname+"%'";
    }
    if(lname != null){
    	lname=lname.trim();
    	whereCondition +=" AND A.last_name LIKE '%"+lname+"%'";
    } 
    if(mname != null){
    	mname=mname.trim();
    	whereCondition +=" AND A.middle_name LIKE '%"+mname+"%'";
    } 
    if(home_address != null){
    	home_address=home_address.trim();
    	whereCondition +=" AND B.address LIKE '%"+home_address+"%'";
    }
    if(home_city != null){
    	home_city=home_city.trim();
    	whereCondition +=" AND B.city LIKE '%"+home_city+"%'";
    }
    if(home_state != null){
    	home_state=home_state.trim();
    	whereCondition +=" AND B.state LIKE '%"+home_state+"%'";
    }
    if(home_zip != null){
    	home_zip=home_zip.trim();
    	whereCondition +=" AND B.zip LIKE '%"+home_zip+"%'";
    }
    if(work_address != null){
    	work_address=work_address.trim();
    	whereCondition +=" AND C.address LIKE '%"+work_address+"%'";
    }
    if(work_city != null){
    	work_city=work_city.trim();
    	whereCondition +=" AND C.city LIKE '%"+work_city+"%'";
    }
    if(work_state != null){
    	work_state=work_state.trim();
    	whereCondition +=" AND C.state LIKE '%"+work_state+"%'";
    }
    if(work_zip != null){
    	work_zip=work_zip.trim();
    	whereCondition +=" AND C.zip LIKE '%"+work_zip+"%'";
    }
    if(home_phone != null){
    	home_phone=home_phone.trim();
    	whereCondition +=" AND F.number LIKE '%"+home_phone+"%'";
    }
    if(work_phone != null){
    	work_phone=work_phone.trim();
    	whereCondition +=" AND D.number LIKE '%"+work_phone+"%'";
    }
    if(cell_phone != null){
    	cell_phone=cell_phone.trim();
    	whereCondition +=" AND E.number LIKE '%"+cell_phone+"%'";
    }
    if(birthday != null){
    	birthday=birthday.trim();
    	whereCondition +=" AND G.date LIKE '%"+birthday+"%'";
    }
        String varname1 = ""
        		+ "select A.*, "
        		+ "concat(B.address,'  ', B.city,'  ',  B.state,'  ',  B.zip) as work_address, "
        		+ "concat(C.address,'  ',  C.city,'  ',  C.state,'  ',  C.zip) as home_address, "
        		+ "concat(D.area_code, D.number) as work_phone, "
        		+ "concat(E.area_code, E.number) as cell_phone, "
        		+ "concat(F.area_code, F.number) as home_phone, "
        		+ "G.date as birthday "
        		+ "from "
        		+ "contact A "
        		+ "left join (select * from address where address_type='Home address') B on A.contact_id=B.contact_id "
        		+ "left join (select * from address where address_type='Work address') C on A.contact_id=C.contact_id "
        		+ "left join (select * from phone where phone_type='Work phone') D on A.contact_id=D.contact_id "
        		+ "left join (select * from phone where phone_type='Cell phone') E on A.contact_id=E.contact_id "
        		+ "left join (select * from phone where phone_type='Home phone') F on A.contact_id=F.contact_id "
        		+ "left join (select * from date where date_type='Birth Date') G on A.contact_id=G.contact_id "
        		+ "where 1=1 "+whereCondition;
        ResultSet rs   = stmt.executeQuery(varname1);
      

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <table class=\"gridtable\">\r\n");
      out.write("          <tr>\r\n");
      out.write("\t        <th>Contact ID</th>  \r\n");
      out.write("\t\t\t<th>First Name</th>  \r\n");
      out.write("\t\t\t<th>Middle Name</th>  \r\n");
      out.write("\t\t\t<th>Last Name</th>\r\n");
      out.write("\t\t\t<th>Home Address</th>\r\n");
      out.write("\t\t\t<th>Work Address</th>\r\n");
      out.write("\t\t\t<th>Work Phone</th>\r\n");
      out.write("\t\t\t\t<th>Cell Phone</th>\r\n");
      out.write("\t\t\t\t<th>Home Phone</th>\r\n");
      out.write("\t\t\t<th>Birthday</th>\r\n");
      out.write("\t\t\t<th></th>\r\n");
      out.write("\t\t\t<th></th>\r\n");
      out.write("          </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");


int count=0;
        while(rs.next()){
        	count++;
            int cid1 = rs.getInt(1);//.getString(1);
            String editurl = "editPage.jsp?id="+cid1;
            String linkstr = "<a href="+editurl+">"+cid1+"</a>";  
            String updateUrl = "<a href="+editurl+">"+"Update"+"</a>";  
            String delete = "deletePage.jsp?id="+cid1;
            String deleteUrl = "<a href="+delete+">"+"Delete"+"</a>"; 
	    

      out.write("\r\n");
      out.write("          \t<tr>\r\n");
      out.write("\t      \r\n");
      out.write("\t        <td>");
      out.print(linkstr);
      out.write("</td>  \r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getString(2));
      out.write("</td>  \r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getString(3));
      out.write("</td>  \r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getString(4));
      out.write("</td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getString(5));
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getString(6));
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getString(7));
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getString(8));
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getString(9));
      out.write("</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getString(10));
      out.write("</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td>");
      out.print(updateUrl);
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(deleteUrl);
      out.write("</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("          </tr>\r\n");
      out.write("\r\n");

            
    }
	
    con.close();
	
  } catch(Exception e){
      System.out.println(e);
  }


      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
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
