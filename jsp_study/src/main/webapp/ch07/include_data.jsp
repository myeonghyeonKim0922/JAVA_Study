<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int a = Integer.parseInt(request.getParameter("data"));
for(int i = 1; i<=9; i++){
	out.print("5 * " + i +"= "+a * i +"<br>");
}
%>
</body>
</html>