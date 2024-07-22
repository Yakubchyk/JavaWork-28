<%--
  Created by IntelliJ IDEA.
  User: simonpirko
  Date: 16.07.24
  Time: 9:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<jsp:include page="_bootstrap.jsp"/>
<jsp:include page="_header.jsp"/>

<div class="container">
    <div class="container text-center">
        <div class="row align-items-start">
            <div class="col">


            </div>
            <div class="col-4 mt-5 ">
                <form action="/login" method="post">
                    <div class="mb-3">
                        <input type="text" name="username" class="form-control" placeholder="Name" value="${username}">
                    </div>
                    <div class="mb-3">
                        <input type="text" name="password" class="form-control" placeholder="Password">
                    </div>

                    <button type="submit" class="btn btn-primary" method="post" action="/calc">Submit</button>
                </form>

            </div>
            <div class="col">



            </div>
        </div>
    </div>
</div>

<p>${message}</p>
</body>
</html>
