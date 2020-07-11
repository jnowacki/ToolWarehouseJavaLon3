<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Expression language jest włączony--%>
<%@ page isELIgnored="false" %>
<%--JSTL jest włączony--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<style>
    table, td, th{
        border: solid 1px black;
    }
</style>

<head>
    <title>Tools</title>
</head>
<body>

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
            <td>
                <form method="post">
                    <input type="submit" value="Toggle">
                </form>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
