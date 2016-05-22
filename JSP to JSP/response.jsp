<jsp:useBean id="mybean" scope="session" class="com.hcl.NameHandler" />
<jsp:setProperty name="mybean" property="*" />

<html>
<body>
<table border="0" width="700">
	<tr>
		<td width="150">&nbsp;</td>
		<td width="550">
		<%
		if (request.getParameter("username") != null) {
		%> 
		<%} %>
		<h1>Welcome back : <jsp:getProperty name="mybean"
			property="username" />!</h1>
		</td>
	</tr>
</table>
</body>
</html>
