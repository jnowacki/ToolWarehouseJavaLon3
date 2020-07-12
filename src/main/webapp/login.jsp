<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Expression language jest włączony--%>
<%@ page isELIgnored="false" %>
<%--JSTL jest włączony--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
</head>
<body>

<c:if test="${requestScope.hasError}">
    <div class="error">
        Dane niepoprawne!
    </div>
</c:if>

<form method="post">
    <label for="username" class="label">Login:</label>
    <input type="text" id="username" name="username"><br/>

    <label for="password" class="label">Password:</label>
    <input type="text" id="password" name="password"><br/>

    <input type="hidden" name="action" value="login">
    <input type="submit" value="Log in">
</form>

</body>
</html>
