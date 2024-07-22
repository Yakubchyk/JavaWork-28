<%--
  Created by IntelliJ IDEA.
  User: yakubchyk
  Date: 21.07.24
  Time: 07:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Calculator</title>
</head>
<body>
<jsp:include page="_bootstrap.jsp"/>

<div class="container text-center">
    <div class="row align-items-start">
        <div class="col"></div>
        <div class="col-4 mt-5 ">
            <form action="/calc" method="post">
                <div class="mb-3">
                    <input type="text" name="num1" class="form-control" placeholder="Num1">
                </div>
                <div class="mb-3">
                    <input type="text" name="num2" class="form-control" placeholder="Num2">
                </div>
                <div class="mb-3">
                    <select id="type" name="type" action="/calc" method="post">
                        <option value="sum">Summa</option>
                        <option value="sub">Subtract</option>
                        <option value="mul">Multiply</option>
                        <option value="div">Divide</option>
                    </select>
                </div>

                <div class="alert alert-info mt-3" role="alert">
                    Result: ${result}
                </div>

                <button type="submit" class="btn btn-primary" method="post" action="/calc">Submit</button>
            </form>
        </div>
        <div class="col"></div>
    </div>
</div>

</body>
</html>
