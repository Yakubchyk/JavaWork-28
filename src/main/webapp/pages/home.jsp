<%@ page import="java.util.List" %>

<%--
  Created by IntelliJ IDEA.
  User: simonpirko
  Date: 16.07.24
  Time: 7:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <core:if test="${sessionScope.user != null}">
        <title>Calculator</title>

    </core:if>
    <core:if test="${sessionScope.user == null}">
        <title>Home Page</title>
    </core:if>

</head>
<body>

<jsp:include page="_bootstrap.jsp"/>
<jsp:include page="_header.jsp"/>

<core:if test="${sessionScope.user != null}">
    <jsp:include page="_calc.jsp"/>
</core:if>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>
