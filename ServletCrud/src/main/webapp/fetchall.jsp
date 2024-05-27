<%@page import="crud.dto.StudentDto"%>
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
<%List<StudentDto> l=(List<StudentDto>)request.getAttribute("data");%>
<table border=" ">
<tr>
<th>Id</th>
<th>Name</th>
<th>Delete</th>
<th>Update</th>
</tr>
<%for(StudentDto a:l){%>
<tr>
<td><%=a.getId()%></td>
<td><%=a.getName()%></td>
<td><a href='did?pk=<%=a.getId()%>'>remove</a></td>
<td><a href='update.jsp?id=<%=a.getId()%>&&name=<%=a.getName()%>'>edit</a></td>
</tr>
<%}%>
</table>
</body>
</html>