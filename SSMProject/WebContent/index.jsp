<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
			<a href="controller/queryStudentByNo/1">查询1号学生</a><br>
		<a href="controller/deleteStudentByStuno/1">删除1号</a><br>
		<a href="controller/updateStudentByStuno/1">修改1号</a>
		<a href="controller/updateStudentByStuno1/1">修改1号</a>
		<a href="controller/queryStudents">查询全部学生</a>
		
		<form action="controller/addStudent">
				<input name="stuNo" />
				<input name="stuName" />
				<input name="stuAge" />
				<input type="submit" value="增加"/>
		
		</form>
		
		
</body>
</html>