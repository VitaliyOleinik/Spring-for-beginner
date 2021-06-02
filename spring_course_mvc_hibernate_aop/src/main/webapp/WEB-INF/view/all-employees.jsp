<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<%--
  Created by IntelliJ IDEA.
  User: Mi Book
  Date: 6/2/2021
  Time: 5:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <H1>All Employees</H1>
    <br>
    <table>
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Department</th>
            <th>Salary</th>
            <th>Operations</th>
        </tr>
        <c:forEach var="emp" items="${allEmps}">
            <c:url var="updateButton" value="/updateInfo">
                <c:param name="empId" value="${emp.id}"/>
            </c:url>

            <tr>
                <td>${emp.name}</td>
                <td>${emp.surname}</td>
                <td>${emp.department}</td>
                <td>${emp.salary}</td>
                <td>
                    <input type="button" value="Update"
            onclick="window.location.href = '${updateButton}'"/>
            </td>
            </tr>
        </c:forEach>
    </table>
    <input type="button" value="ADD"
        onclick="window.location.href = 'addNewEmployee'"/>
</body>
</html>