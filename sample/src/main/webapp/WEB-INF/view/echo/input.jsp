<%@page pageEncoding="UTF-8"%>
<html>
<head>
<html:javascript formName="echoActionForm_complete"/>
</head>
<body>
<html:errors/>
<s:form method="POST">
お名前をどうぞ！
<html:text property="name2"/>
<s:submit property="complete" value="送信" clientValidate="true"/>
</s:form>
</body>
</html>