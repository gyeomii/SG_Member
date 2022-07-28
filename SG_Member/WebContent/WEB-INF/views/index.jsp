<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Index</title>
<script>
function goJoin(){
	location.href="insertmember"
}
</script>
</head>
<body>
<h1><a href="index">메인페이지</a></h1>
<form class="form-horizontal" method="post" action="index">
  <div class="form-group">
    <label for="inputId3" class="col-sm-2 control-label">ID</label>
    <div class="col-sm-5">
      <input type="text" class="form-control" name="id" id="inputEmail3" placeholder="ID">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">P/W</label>
    <div class="col-sm-5">
      <input type="password" class="form-control" name="pwd" id="inputPassword3" placeholder="Password">
	  <h3>${ msg }</h3>
    </div>
  </div>
  <div class="form-group">
  	<div class="col-sm-5">
      <label for="inputPassword3" class="col-sm-2 control-label"></label>
	  <input type="button" class="btn btn-primary" value="회원가입" onclick="goJoin()"/>
	  <input type="submit" class="btn btn-primary" value="로그인" />
  	</div>
  </div>
</form>
</body>
</html>