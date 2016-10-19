<html>
<body>
<h2>Hello World!</h2>
	<a href="${pageContext.request.contextPath}/userdata/1.xhtml">go</a>
	
	<a href="javascript:void(0)" onclick="goPost()">post</a>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/jquery.js"></script>
<script type="text/javascript">
	/* jQuery(function($) {  
		$.ajax({  
		    type : "post", 
		    dataType:'json',
		     url : "${pageContext.request.contextPath}/userdata/2.xhtml",  
		     async : true,  
		     success : function(data){  
		    	 alert("dd");
		     }  
		});
	});  */
</script>

</html>
