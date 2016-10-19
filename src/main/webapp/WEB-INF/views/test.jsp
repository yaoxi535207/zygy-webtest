<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
 	var CONTEXT_PATH='${ctx}';
</script>
<body>
	登录
	<form id="loginForm" action="javascript:void(0)">
		姓名:<input type="text" name="username"><br/>
		秘密:<input type="text" name="password"><br/>
		<input type="button" value="login" onclick="login()">
	</form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/jquery.js"></script>
<script type="text/javascript">
	function login(){
		$.ajax({  
		    type : "post", 
		    dataType:'text',
		     url : CONTEXT_PATH+"/userlogin.xhtml",
		     data:$('#loginForm').serialize(),// 要提交的表单 
		     async : true,  
		     success : function(data){  
		    	 alert(data);
		     }  
		});
	}
</script>
</html>