<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> 
<title>회원가입 페이지</title>
<script>
function goMain(){
	location.href="index"
}
</script>
</head>
<body>
<h1>회원가입</h1>
	<form method="post">
		<div class="form-group col-md-6">
			<table class="table table-bordered">
				<tr>
					<th>ID</th>
					<td><input type="text" class="form-control" name="id"/></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" class="form-control" name="name"/></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="text" class="form-control" name="pwd"/></td>
				</tr>
				<tr>
					<th>비밀번호 재확인</th>
					<td><input type="text" class="form-control" name="pwdchk"/></td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input type="text" class="form-control" name="phone"/></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input type="text" class="form-control" name="email"/></td>
				</tr>
				<tr>
					<th>주소</th>
					<td><input type="text" class="form-control" name="address"/></td>
				</tr>
			</table>
				<input type="submit" class="btn btn-primary" value="회원가입"/>
				<input type="button" value="메인화면" class="btn btn-primary" onclick="goMain()"/>
		</div>
	</form>
</body>
</html>