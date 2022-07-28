<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${member.name}님의 마이페이지</h1>
<form method="post" action="update">
		<div class="form-group col-md-6">
			<table class="table table-bordered">
				<tr>
					<th>ID</th>
					<td><input type="text" class="form-control" name="id" value="${member.id }"/></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" class="form-control" name="name" value="${member.name }"/></td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input type="text" class="form-control" name="phone" value="${member.phone }"/></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input type="text" class="form-control" name="email" value="${member.email }"/></td>
				</tr>
				<tr>
					<th>주소</th>
					<td><input type="text" class="form-control" name="address" value="${member.address }"/></td>
				</tr>
			</table>
				<input type="submit" class="btn btn-primary" value="회원정보 수정"/>
		</div>
	</form>
</body>
</html>