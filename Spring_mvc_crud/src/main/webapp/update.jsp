<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
  <input type="number" name="id" value="<%=request.getParameter("id")%>"><br>
   <input type="text" name="name" value="<%=request.getParameter("name")%>"><br>
   <button>Submit</button>
</form>
</body>
</html>