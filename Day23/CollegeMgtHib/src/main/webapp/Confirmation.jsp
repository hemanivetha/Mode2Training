<%@page import="com.hcl.college.CollegeCrud"%>
<%@page import="com.hcl.college.FeedBack"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Confirmation.jsp" method="get">
	<%
	String id=(String)session.getAttribute("fid");
	String name=(String)session.getAttribute("studentName");
	String ins=(String)session.getAttribute("instructor");
	String sub=request.getParameter("subject");
	String fb=request.getParameter("feedBack");
	%>
	
	FeedbackId:
	<input type="text" name="fid" readonly="readonly" value="<%=id %>" /><br/><br/>
	Student Name:
	<input type="text" name="studentName" readonly="readonly" value="<%=name %>"/><br/><br/>
	Instructor:
	<input type="text" name="instructor" readonly="readonly" value="<%=ins %>"/><br/><br/>
	Subject:
	<input type="text" name="subject" readonly="readonly" value="<%=sub %>"/><br/><br/>
	Feedback:
	<input type="text" name="fbvalue" readonly="readonly" value="<%=fb %>"/><br/><br/>
	<input type="submit" value="Confirm Please" />	
	
	 <%
		if(request.getParameter("fid")!= null && 
		request.getParameter("instructor")!= null && 
		request.getParameter("studentName")!= null && 
		request.getParameter("subject")!= null &&  
		request.getParameter("fbvalue")!= null){
			 FeedBack e=new FeedBack();  
			CollegeCrud i=new CollegeCrud();
			/* String id1=i.generateFeedbackId(); */
			e.setFid(request.getParameter("fid"));
			e.setInstructor(request.getParameter("instructor"));
			e.setStudentName(request.getParameter("studentName"));
			e.setSubject(request.getParameter("subject"));
			e.setFbvalue(request.getParameter("fbvalue"));
			
			out.println(i.insertFeedBack(e));
		}
	%>
	
</form>
</body>
</html>