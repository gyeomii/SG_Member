<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 String id = request.getParameter("id"); 
 String name = request.getParameter("name"); 
 String pwd = request.getParameter("pwd"); 
 String email = request.getParameter("email"); 
 String phone = request.getParameter("phone"); 
 String address = request.getParameter("address"); 
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>회원가입 결과</title>
<script>
function goMain(){
	location.href="index"
}
</script>
</head>
<body>
<h1><%= name %>님 회원가입을 축하드립니다.</h1>
<div class="col-md-6">
	<table class="table table-bordered col-md-6">
		<tr>
			<th>ID</th>
			<td><%= id %></td>
		</tr>
		<tr>
			<th>이메일</th>
			<td><%= email %></td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td><%= phone %></td>
		</tr>
		<tr>
			<th>주소</th>
			<td><%= address %></td>
		</tr>
	</table>
	${msg}
	<input type="button" value="메인화면" class="btn btn-primary" onclick="goMain()"/>
</div>

</body>
</html>