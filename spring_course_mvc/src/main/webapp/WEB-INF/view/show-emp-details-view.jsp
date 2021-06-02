<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mi Book
  Date: 6/1/2021
  Time: 5:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Dear employee, you are welcome</h2>

<%--Your name: ${param.employeeName}--%>

    Your name: ${employee.name}
    <br><br>
    Your Surname: ${employee.surname}
    <br><br>
    Your Salary: ${employee.salary}
    <br><br>
    Your Department: ${employee.department}
    <br><br>
    Your car: ${employee.carBrand}
    <br><br>
    Language(s):
    <ul>
        <c:forEach var="lang" items="${employee.languages}">
            <li>   ${lang}   </li>
        </c:forEach>
    </ul>
    <br><br>
    Phone number: ${employee.phoneNumber}
    <br><br>
    Email: ${employee.email}
</body>
</html>
