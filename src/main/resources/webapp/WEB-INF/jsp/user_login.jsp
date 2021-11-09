<%@ include file="header.jsp" %>
	
	<form:form modelAttribute="user" method="post">
	
		<form:input path="username" type='text'/>
		<form:input path="password" type='password'/>
	</form:form>
</body>
</html>