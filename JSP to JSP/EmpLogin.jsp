<%@ page import="com.hcl.NameHandler"%>

<jsp:useBean id="mybean" scope="session" class="com.hcl.NameHandler" />
<jsp:setProperty name="mybean" property="*" />

<html>
<head>
<title>Hello, Employee</title>
</head>
<table border="0" width="700">
	<tr>
		<td width="150">&nbsp;</td>
		<td width="550"></td>
	</tr>
	<tr>
		<td width="550">Employee Name :
		<form method="post" action="response.jsp">
		<input type="text" name="username" size="25"> <br>
		<input type="submit" value="Submit">
		<input type="reset" value="Reset">
		</td>
	</tr>
	</form>
</table>
</body>
</html>
