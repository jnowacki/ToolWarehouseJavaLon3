<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Expression language jest włączony--%>
<%@ page isELIgnored="false" %>
<%--JSTL jest włączony--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Tools</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
</head>
<body>

<c:if test="${sessionScope.username != null}">
    <h2>Witaj ${sessionScope.username}</h2>

    <form action="${pageContext.request.contextPath}/login" method="post">
        <input type="hidden" name="action" value="logout">
        <input type="submit" value="Log out">
    </form>
</c:if>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Type</th>
        <th>Available</th>
    </tr>

    <c:forEach items="${requestScope.tools}" var="tool" varStatus="status">
        <tr>
            <td>${tool.id}</td>
            <td>${tool.name}</td>
            <td>${tool.type}</td>
            <td class="${tool.available ? "available" : "unavailable"}">
                <div class="container">
                    <form method="post">
                        <input type="hidden" value="${tool.id}" name="id">
                        <input type="hidden" value="${!tool.available}" name="isAvailable">
                        <input type="submit" value="${tool.available ? "Take" : "Return"}">
                    </form>
                </div>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
