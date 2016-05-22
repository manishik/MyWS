<html>
<head>
<title>Adding Employee</title>
</head>

<body onLoad="document.loginForm.emp_id.focus()">

<table width="500" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td>
		<table width="500" border="0" cellspacing="0" cellpadding="0">
			<form name="LoginForm" method="post" action="Login.do">
				<tr>
					<td width="401">
					<div align="right">User Name :</div>
					</td>
					<td width="399"><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td width="401">
					<div align="right">Password :</div>
					</td>
					<td width="399"><input type="password" name="pwd"></td>
				</tr>
				<tr>
					<td width="401"></td>
					<td width="399"><br>
					<input type="Submit" value="Login"></td>
				</tr>
			</form>
		</table>
		</td>
	</tr>
</table>
</body>
</html>
