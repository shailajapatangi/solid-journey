<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>



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

%>	

<body>
<form action="AddAction.jsp">
<input type="hidden" name="cid" value="<%=cid%>">
<input type="hidden" name=home_add_id value="<%=home_add_id%>">
<input type="hidden" name=work_add_id value="<%=work_add_id%>">
<input type="hidden" name=Cell_phone_id value="<%=Cell_phone_id%>">
<input type="hidden" name=home_phone_id value="<%=home_phone_id%>">
<input type="hidden" name=work_phone_id value="<%=work_phone_id%>">
<input type="hidden" name=birthday_id value="<%=birthday_id%>">
<table class="gridtable">
    <tr>
     <td></td>  <td><a href="index.jsp">Back to contact List</a></td>
    </tr>
	
    <tr>
     <th>ID</th>  <td><%=cid%></td>
    </tr>
    <tr>
     <th>First Name</th> <td><input type="text" name="fname" value="<%=fname%>"></td>
    </tr>
    <tr>
     <th>Middle Name</th>  <td><input type="text" name="mname" value="<%=mname%>"></td>
    </tr>
    <tr>
     <th>Last Name</th>  <td><input type="text" name="lname" value="<%=lname%>"></td>
    </tr>
 <tr>
     <th>Home Address</th>  <td><input type="text" name=home_address value="<%=home_address%>"></td>
    </tr>
     <tr>
     <th>Home City</th>  <td><input type="text" name=home_city value="<%=home_city%>"></td>
    </tr>
     <tr>
     <th>Home State</th>  <td><input type="text" name=home_state value="<%=home_state%>"></td>
    </tr>
     <tr>
     <th>Home Zip</th>  <td><input type="text" name=home_zip value="<%=home_zip%>"></td>
    </tr>
     <tr>
     <th>Work Address</th>  <td><input type="text" name=work_address value="<%=work_address%>"></td>
    </tr>
     <tr>
     <th>Work City</th>  <td><input type="text" name=work_city value="<%=work_city%>"></td>
    </tr>
     <tr>
     <th>Work State</th>  <td><input type="text" name=work_state value="<%=work_state%>"></td>
    </tr>
     <tr>
     <th>Work Zip</th>  <td><input type="text" name=work_zip value="<%=work_zip%>"></td>
    </tr>
    <tr>
     <th>Work Phone</th>  <td><input type="text" name=work_phone value="<%=work_phone%>"></td>
    </tr>
    <tr>
     <th>Cell Phone</th>  <td><input type="text" name=cell_phone value="<%=cell_phone%>"></td>
    </tr>
    <tr>
     <th>Home Phone</th>  <td><input type="text" name=home_phone value="<%=home_phone%>"></td>
    </tr>
    <tr>
     <th>Birthday</th>  <td><input type="text" name=birthday value="<%=birthday%>"></td>
    </tr>

	<tr>
     <td>&nbsp;</td> <td><input type="submit" value="Add"></td>
    </tr>
	
	
</table>
</form>
</body>
</html>