<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dolteng Auto Generated</title>
</head>
<body>
<s:form method="POST">
<table border="1">
<tr><th>name</th><th>mail</th></tr>
<c:forEach items="${rows}" varStatus="s">
<tr>
<td><html:text property="rows[${s.index}].name" size="20"/></td>
<td><html:text property="rows[${s.index}].mail"/></td>
</tr>
</c:forEach>
</table>
<s:submit property="send" value="send"/>
</s:form>
</body>
</html>