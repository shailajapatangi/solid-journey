<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Contact</title>

<style type="text/css">
table.gridtable {
	font-family: verdana,arial,sans-serif;
	font-size:11px;
	color:#333333;
	border-width: 1px;
	border-color: #666666;
	border-collapse: collapse;
}
table.gridtable th {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #dedede;
}
table.gridtable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #ffffff;
}
</style>


</head>

<%


String cid =(String) request.getParameter("id");
String fname="";
String mname="";
String lname="";

String zip="";
String state="";
String city="";
String address="";
String phone="";
String date="";
String addressType="";
String phoneType="";
String dateType="";

    try{
        Class.forName("com.mysql.jdbc.Driver");
        String url     = "jdbc:mysql://localhost:3306/temp";
        String user    = "root";
        String pass    = "password";
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement stmt = con.createStatement();
        String sql     = "select * FROM contact WHERE contact_id = "+cid;
        ResultSet rs   = stmt.executeQuery(sql);

        while(rs.next()){
             cid     = rs.getString("contact_id");	
             fname    = rs.getString("first_name");
             mname   = rs.getString("middle_name");
             lname =  rs.getString("last_name");
             
        }
	
        con.close();
	
  } catch(Exception e){
      System.out.println(e);
  }

%>	
<body>
<form action="DeleteAction.jsp">
<input type="hidden" name="cid" value="<%=cid%>">
<table class="gridtable">
    <tr>
     <td></td>  <td><a href="index.jsp">Back to contact List</a></td>
    </tr>
	
    <tr>
     <th>ID</th>  <td><%=cid%></td>
    </tr>
    <tr>
     <th>First Name</th> <td><%=fname%></td>
    </tr>
    <tr>
     <th>Middle Name</th>  <td><%=mname%></td>
    </tr>
    <tr>
     <th>Last Name</th>  <td><%=lname%></td>
    </tr>
     
     
     <td>&nbsp;</td> <td><input type="submit" value="delete"></td>
    </tr>
	
	
</table>
</form>
</body>
</html>