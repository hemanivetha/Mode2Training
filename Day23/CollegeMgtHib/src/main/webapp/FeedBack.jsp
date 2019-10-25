<%@page import="com.hcl.college.CollegeCrud"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
CollegeCrud c=new CollegeCrud();
String fid=c.generateFeedbackId();
session.setAttribute("fid", fid);
%>
<form method="get" name="frmFeedback" action="FeedBack.jsp">
<center>
FeedBack Id:
<input type="text" name="fid" value=<%=fid %> readonly="readonly"/><br/><br/>
Student Name:
<input type="text" name="studentName"/><br/><br/>
Instructor:
<select name="instructor" onchange="change()"><br/><br/>
<option value="dropdown">Please Select One</option><br/><br/>
<%
List<String> lst=new CollegeCrud().instructorList();
for(String s : lst){
%>
<option value="<%=s %>"> <%=s %></option>
<%
}%>
</select>
<br/><br/>
<%
		session.setAttribute("studentName",request.getParameter("studentName"));
		  
  	    session.setAttribute("instructor",request.getParameter("instructor"));

		%>

</form>
<b>Please Give Your FeedBack</b>
<form method="get" action="Confirmation.jsp">
<br/><br/>
		
Select Subject:
<select name="subject">
<option value="dropdown"></option>
<%
String ins=request.getParameter("instructor");
List<String> lst1=new CollegeCrud().subjectList(ins);
for(String s:lst1){
%>
<option value=<%=s%>> <%=s%></option>
<%
}
%>
</select>
<br/><br/>
<input type="radio" id="Type1" name="feedBack" value="Excellent">
    <label for="Type1">Excellent</label>

    <input type="radio" id="Type2" name="feedBack" value="Good">
    <label for="Type2">Good</label>

    <input type="radio" id="Type3"  name="feedBack" value="Adequate">
    <label for="Type3">Adequate</label>

    <input type="radio" id="Type4" name="feedBack" value="Inadequate">
    <label for="Type4">Inadequate</label><br/><br/>
	<input type="submit" value="Show" />
</center>
</form>

<script>
function change(){
	document.frmFeedback.submit();
}

</script>
</body>
</html>