<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script language=javascript>
function ConfirmDel(){
var a=window.confirm("您确定要删除记录吗？");
if(a){
return true;
}else{
return false;
}
}
</script>
</head>
<body>

		<table border="1">
<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>操作</th>
				<th>修改</th>
				
			</tr>
			
			<c:forEach items="${students}" var="student" varStatus="st">
				<tr>
					<td>${student.stuNo}</td>
					<td>${student.stuName}</td>
					<td>${student.stuAge}</td>
					<td><a href="deleteStudentByStuno/${student.stuNo}" onclick="return confirm('请确认删除');">删除</a><br></td>
					<td><a href="updateStudentByStuno1/${student.stuNo}" onclick="return confirm('请确认修改');">修改</a></td>
				
				</tr>
</c:forEach>

		</table>

</body>
</html>