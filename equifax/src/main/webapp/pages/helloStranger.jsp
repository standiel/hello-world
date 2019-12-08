<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Stranger</title>
</head>
<body>
<header>
    <img src="images/Andiel-A.png" alt="Andiel">
</header>

<article>
    <h1> Hello <s:property value="username"/> with password <s:property value="password"/>. Who are you</h1>
</article>

</body>
<footer><a href="<s:url action='index'/>">Back to login.</a></footer>
</html>
