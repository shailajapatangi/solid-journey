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
      
%>



<body>


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
            int cid1 = rs.getInt(1);//.getString(1);
            String editurl = "editPage.jsp?id="+cid1;
            String linkstr = "<a href="+editurl+">"+cid1+"</a>";  
            String updateUrl = "<a href="+editurl+">"+"Update"+"</a>";  
            String delete = "deletePage.jsp?id="+cid1;
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