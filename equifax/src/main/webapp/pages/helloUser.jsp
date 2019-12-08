<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<header>
    <img src="images/Andiel-A.png" alt="Andiel">
</header>

<article>
    <h1>  Hello <s:property value="username" />, nice to meet you!</h1>
</article>
<footer><a href="<s:url action='index'/>">Back to login.</a></footer>
</body>
</html>
