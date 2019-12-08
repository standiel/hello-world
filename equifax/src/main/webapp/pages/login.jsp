<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login Page</title>
</head>

<body>
<header>
    <img src="images/Andiel-A.png" alt="Andiel">
</header>
<article>
    <h1>Login </h1>

    <s:form action="login">
        <s:textfield name="username" label="Username"/>
        <s:password name="password" label="Password"/>
        <s:submit/>
    </s:form>
</article>
<footer><a href="<s:url action='index'/>">Back to login.</a></footer>
</body>
</html>
