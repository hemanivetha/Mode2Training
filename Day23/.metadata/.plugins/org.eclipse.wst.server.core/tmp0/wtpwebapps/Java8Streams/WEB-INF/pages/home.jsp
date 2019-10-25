<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Employee List</h1>
		<form:form action="Search" modelAttribute="searchEmployee">
		EmpName:
	    <form:input path="empName"/></br></br>
	    Band:
	     <tr>
                <td><form:label path="band">Band</form:label></td>
                <td>
                <form:select path="band">
                <form:option value='0' label="Select"></form:option>
               <form:options items="${bandList}"/>
                </form:select>
                </td>
            </tr></br></br>
        <center>
	    AND
	    </center></br>
        Salary Greater than:
         <form:input path="salary"/>
	    <input type="submit" value="Search"/>
	    </form:form>
		<h2>No of Employees:${listEmployee.size()}</h2>
		
		<table border="1">

			<th>EmpName</th>
			<th>Salary</th>
			<th>Band</th>
			<th>Date Of Join</th>
			<!-- <th>Action</th> -->

			<c:forEach var="employee" items="${listEmployee}">
				<tr>

					<td>${employee.empName}</td>
					<td>${employee.salary}</td>
					<td>${employee.band}</td>
					<td>${employee.dateOfJoin}</td>
					<%-- <td><a href="editEmployee?empNo=${employee.empNo}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteEmployee?empNo=${employee.empNo}">Delete</a></td>
 --%>
				</tr>
			</c:forEach>
		</table>
<!-- 		<h4>
			New Employee Register <a href="newEmployee">here</a>
		</h4> -->
	</div>
</body>
</html>