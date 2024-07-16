<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: yakubchyk
  Date: 16.07.24
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<jsp:include page="_header.jsp"/>


<ul>
    <%
        for (String s : (List<String>) request.getAttribute("list")) {
            out.print("<li>" + s + "</li>");

        }
    %>

</ul>


<h1>Hello ${myName}!</h1>

<if condition="${flag}">
    <h1>is Enabled</h1>
</if>

<%= request.getAttribute("myName")%>

<%! int age = 22; %>


</body>
</html>
