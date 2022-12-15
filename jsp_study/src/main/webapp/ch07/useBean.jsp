<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="gugudan" class="ch07.com.dao.GuGuDan" />
<jsp:setProperty name="gugudan" property="*"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>구구단 출력하기</h4>
<% 
gugudan.setN1(5);
int[] temp = gugudan.process();
for(int i=0; i<temp.length; i++){
	out.print("<br/>"+"5 * "+i+"= "+temp[i]);
}
%>
</body>
</html>