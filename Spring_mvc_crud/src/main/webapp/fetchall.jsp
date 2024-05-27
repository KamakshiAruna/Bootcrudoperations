<%@page import="Spring_mvc_crud.dto.EmployeeDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<EmployeeDto> l=(List<EmployeeDto>)request.getAttribute("data");%>
<table border=" ">
<tr>
<th>Id</th>
<th>Name</th>
<th>Delete</th>
<th>Update</th>
</tr>
<%for(EmployeeDto a:l){%>
<tr>
<td><%=a.getId()%></td>
<td><%=a.getName()%></td>
<td><a href='deletebyid?id=<%=a.getId()%>'>remove</a></td>
<td><a href='update.jsp?id=<%=a.getId()%>&&name=<%=a.getName()%>'>Edit</a></td>
</tr>
<%}%>
</table>
</body>
</html>