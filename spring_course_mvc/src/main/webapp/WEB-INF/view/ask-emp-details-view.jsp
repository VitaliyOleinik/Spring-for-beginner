<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Please enter your details</h2>
<br>
<br>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
<%--    Department <form:input path="department"/>--%>
<%--    <br><br>--%>
    Salary <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    <input type="submit" value="ok">

</form:form>
</body>
</html>
