<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateStudent" >
				<input name="stuNo" value=" ${requestScope.student.stuNo }" readonly="readonly"/>
				<input name="stuName"value="${requestScope.student.stuName }" />
				<input name="stuAge" value=" ${requestScope.student.stuAge }"/>
				<input type="submit" value="修改"/>
		
		</form>

         
</body>
</html>