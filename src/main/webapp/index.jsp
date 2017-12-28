<%--
  Created by IntelliJ IDEA.
  User: 炜
  Date: 2017/12/27
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>helloworld</title>
</head>
<body>
    <form action="/mapping/operation/3527" method="get">
        <input type="submit" value="GET==>"/>
    </form>
    <br><br>
    <form action="/mapping/operation/3527" method="post">
        <input type="submit" value="POST==>"/>
    </form>
    <br><br>
    <form action="/mapping/operation/3527" method="post">
        <input type="hidden" name="_method" value="DELETE">
        <input type="submit" value="DELETE==>"/>
    </form>
    <br><br>
    <form action="/mapping/operation/3527" method="post">
        <input type="hidden" name="_method" value="PUT">
        <input type="submit" value="PUT==>"/>
    </form>
    <br><br>
    <h3>RequestParam</h3>
    <a href="/requestparam/doget?age=10">age</a>
</body>
</html>
