<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@page import="com.mysql.jdbc.StringUtils"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%


String cid   = request.getParameter("cid");
String fname = request.getParameter("fname");
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

String wphone_areacode=request.getParameter("wphone_areacode");
String cphone_areacode=request.getParameter("cphone_areacode");
String hphone_areacode=request.getParameter("hphone_areacode");

String home_add_id=request.getParameter("home_add_id");
String work_add_id=request.getParameter("work_add_id");
String Cell_phone_id=request.getParameter("Cell_phone_id");
String home_phone_id=request.getParameter("home_phone_id");
String work_phone_id=request.getParameter("work_phone_id");
String birthday_id=request.getParameter("birthday_id");
int  num1=Integer.parseInt(cid);
try{
    Class.forName("com.mysql.jdbc.Driver");
    String url     = "jdbc:mysql://localhost:3306/temp";
    String user    = "root";
    String pass    = "password";
    Connection con = DriverManager.getConnection(url, user, pass);
    Statement stmt = con.createStatement();
    String sql     = "UPDATE contact SET "+
	                 "  first_name = '"+fname +"', "+
                     "  middle_name = '"+mname+"', "+
                    		 "  last_name = '"+lname+"'"+
                     " WHERE contact_id = "+cid;
    	stmt.executeUpdate(sql);
    	
    	try{
    	if(home_add_id.equals(null)   || home_add_id.equals("null")){
    		   sql     = "INSERT INTO address (contact_id,address_type, address, city, state, zip)  values ( "+
    		            +num1 +", "+
    		            "'"+"Home address"+"', "+
    		            "'"+home_address+"  "+"',"+
    		            "'"+home_city+"  "+"',"+
    		            "'"+home_state+"  "+"',"+
    		            "'"+home_zip+"  "+"'"+
    		            ")";
    		stmt.executeUpdate(sql);
    	}else{
    		int num=Integer.parseInt(home_add_id);
    sql     = "UPDATE address SET "+
                "  address = '"+home_address+"', "+
               	"  city = '"+home_city+"',"+
             	 "  state = '"+home_state+"',"+
               	 "  zip = '"+home_zip+"'"+
                "   WHERE address_id ="+num;
		stmt.executeUpdate(sql);
    	}
    	}catch(Exception e){
    		
    	}
    	
    	try{
        	if(work_add_id.equals(null)   || work_add_id.equals("null")){
    		 sql     = "INSERT INTO address (contact_id,address_type, address, city, state, zip) values ( "+
    	               +num1 +", "+
    	               "'"+"Work address"+"', "+
    	               "'"+work_address+"  "+"',"+
    	               "'"+work_city+"  "+"',"+
    	               "'"+work_state+"  "+"',"+
    	               "'"+work_zip+"  "+"'"+
    	               ")";
    	   stmt.executeUpdate(sql);
    	}else{
    		 int  num=Integer.parseInt(work_add_id);
		sql     = "UPDATE address SET "+
                "  address = '"+work_address+"', "+
               	"  city = '"+work_city+"',"+
             	 "  state = '"+work_state+"',"+
               	 "  zip = '"+work_zip+"'"+
                "   WHERE address_id ="+num;
		stmt.executeUpdate(sql);
    	}
    	}catch(Exception e){
    		
    	}
    	
    	try{
    	if(Cell_phone_id.equals(null)   || Cell_phone_id.equals("null")){
    		sql     = "INSERT INTO phone (contact_id,phone_type, area_code, number) values ( "+
                    "'"+cid +"', "+
                    "'"+"Cell phone"+"', "+
                    "'"+cphone_areacode+"',"+
                    "'"+cell_phone+"'"+
                    ")";
        stmt.executeUpdate(sql);
    	}else{
    		 int  num=Integer.parseInt(Cell_phone_id);
		 if(!StringUtils.isNullOrEmpty(work_phone)){
		sql     = "UPDATE phone SET "+
				  "  area_code = '"+cphone_areacode+"', "+
	               	"  number = '"+cell_phone+"'"+
                "  WHERE phone_id = "+num;
		stmt.executeUpdate(sql);
		 }
		 
    	}}catch(Exception e){
    		
    	}

	try{
    	if(work_phone_id.equals(null)   || work_phone_id.equals("null")){
    		 sql     = "INSERT INTO phone (contact_id,phone_type, area_code, number) values ( "+
                     "'"+cid +"', "+
                     "'"+"Work phone"+"', "+
                     "'"+wphone_areacode+"',"+
                     "'"+work_phone+"'"+
                     ")";
         stmt.executeUpdate(sql);
    	}else{
   		 int  num=Integer.parseInt(work_phone_id);
    		 if(!StringUtils.isNullOrEmpty(work_phone)){
    				sql     = "UPDATE phone SET "+
    		                "  area_code = '"+wphone_areacode+"', "+
    		               	"  number = '"+work_phone+"'"+
    		                "  WHERE phone_id = "+num;
    				stmt.executeUpdate(sql);
    				 }
    	}}catch(Exception e){
    		
    	}
	try{
 	if(home_phone_id.equals(null)   || home_phone_id.equals("null")){
		sql     = "INSERT INTO phone (contact_id,phone_type, area_code, number) values ( "+
                "'"+cid +"', "+
                "'"+"Home phone"+"', "+
                "'"+hphone_areacode+"',"+
                "'"+home_phone+"'"+
                ")";
    stmt.executeUpdate(sql);
    	}else{ 
    		if(!home_phone_id.equals("null")) {
    		  int  num=Integer.parseInt(home_phone_id);
		  if(!StringUtils.isNullOrEmpty(home_phone_id)){
			
		sql     = "UPDATE phone SET "+
                "  area_code = '"+hphone_areacode+"', "+
               	"  number = '"+home_phone+"'"+
                "  WHERE phone_id = "+num;
		stmt.executeUpdate(sql);
		  }
    		}
   	}} catch(Exception e){
		
	}	
	try{
		  if(birthday_id.equals(null)   || birthday_id.equals("null")){
			  sql     = "INSERT INTO date (contact_id,date, date_type) values ( "+
		                 "'"+cid +"', "+
		                 "'"+birthday+"', "+
		                 "'"+"Birth Date"+"'"+
		                 ")";
		     stmt.executeUpdate(sql);
		  }else{
			  int  num=Integer.parseInt(birthday_id);
		sql     = "UPDATE date SET "+
                "  date = '"+birthday+"'"+
                "  WHERE date_id = "+num;
		stmt.executeUpdate(sql);
		  }}catch(Exception e){
	    		
	    	}
		
	con.close();
	
  } catch(Exception e){
      //System.out.println(e);
  }

%>	

<jsp:forward page="index.jsp" />
</body>
</html>