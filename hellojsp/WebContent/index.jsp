<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
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
    try{
        Class.forName("com.mysql.jdbc.Driver");
        String url     = "jdbc:mysql://localhost:3306/temp";
        String user    = "root";
        String pass    = "password";
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement stmt = con.createStatement();
        
        
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
        		+ "left join (select * from date where date_type='Birth Date') G on A.contact_id=G.contact_id;";
        ResultSet rs   = stmt.executeQuery(varname1);
      
%>

<%
String create = "AddPage.jsp?";
  
String createUrl = "<a href="+create+">"+"Create"+"</a>"; 
String search = "search.jsp?";

String searchUrl = "<a href="+search+">"+"Search"+"</a>"; 
%>

<body>


   <tr>
   <td><%=createUrl%></td>
   
    <td><%=searchUrl%>></td>
    </tr>


        <table class="gridtable">
          <tr>
	        <th>Contact ID</th>  
			<th>First Name</th>  
			<th>Middle Name</th>  
			<th>Last Name</th>
			<th>Home Address</th>
			<th>Work Address</th>
			<th>Work Phone</th>
			<th>Cell Phone</th>
			<th>Home Phone</th>
			<th>Birthday</th>
			<th></th>
			<th></th>
          </tr>


<%

int count=0;
        while(rs.next()){
        	count++;
            int cid = rs.getInt(1);//.getString(1);
            String editurl = "editPage.jsp?id="+cid;
            String linkstr = "<a href="+editurl+">"+cid+"</a>";  
            String updateUrl = "<a href="+editurl+">"+"Update"+"</a>";  
            String delete = "deletePage.jsp?id="+cid;
            String deleteUrl = "<a href="+delete+">"+"Delete"+"</a>"; 
	    
%>
          	<tr>
	      
	        <td><%=linkstr%></td>  
			<td><%=rs.getString(2)%></td>  
			<td><%=rs.getString(3)%></td>  
			<td><%=rs.getString(4)%></td>
		
			<td><%=rs.getString(5)%></td>
			<td><%=rs.getString(6)%></td>
			<td><%=rs.getString(7)%></td>
			<td><%=rs.getString(8)%></td>
			<td><%=rs.getString(9)%></td>
			<td><%=rs.getString(10)%></td>
			
			<td><%=updateUrl%></td>
			<td><%=deleteUrl%></td>
			
          </tr>

<%
            
    }
	
    con.close();
	
  } catch(Exception e){
      System.out.println(e);
  }

%>	


</table>

</body>
</html>