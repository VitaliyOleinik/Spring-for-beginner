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
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
<%--    Department <form:input path="department"/>--%>
<%--    <br><br>--%>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    Which car do you want?<br>

    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>

    <%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
    <%--    Audi <form:radiobutton path="carBrand" value="Audi"/>--%>
    <%--    Cadillac <form:radiobutton path="carBrand" value="Cadillac"/>--%>

    Foreign language: <br>
    <form:checkboxes path="languages" items="${employee.languageMap}"/>


    <br><br>

    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>

    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>

    <input type="submit" value="ok">

</form:form>
</body>
</html>
