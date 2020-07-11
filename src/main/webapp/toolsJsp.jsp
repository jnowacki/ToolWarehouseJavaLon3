<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Expression language jest włączony--%>
<%@ page isELIgnored="false" %>
<%--JSTL jest włączony--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<style>

    table {
        border-collapse: collapse;
    }

    table, td, th{
        border: solid 1px black;
    }

    form {
        margin: 0;
    }

    .container {

        height: 50px;
        width: 100px;

        display: flex;
        align-items: center;
        justify-content: center;
    }

    .available {
        background-color: green;
    }

    .unavailable {
        background-color: red;
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
            <td class="${tool.available ? "available" : "unavailable"}">
                <div class="container">
                    <form method="post">
                        <input type="submit" value="Toggle">
                    </form>
                </div>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
