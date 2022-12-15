<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>고객정보 조회</h2>
	<hr>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>고객등급</th>
		</tr>
	
		<c:forEach var="r" varStatus="i" items="${regists}" >
		<tr>
			<td>${i.count}</td>
			<td><a href="/jsp_study/rcontrol?action=info&id=${r.id}">${r.name}</a></td>
			<td>${r.phone}</td>
			<td>${r.grade}<%if(r.grade == "silver"){ 
			out.print("(일반)");
			}else if(r.grade == "gold"){ 
				out.print("(중간)");
			}else{
				out.print("(최상)");
			}
			%></td>
		</tr>
		</c:forEach>
		
	</table>
	<a href="/jsp_study/src/main/webapp/ch08/registgrade">등급확인</a>
</body>
</html>