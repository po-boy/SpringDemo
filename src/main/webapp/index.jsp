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

    <form action="/mapping/operation/3527" method="post">
        <input type="submit" value="POST==>"/>
    </form>

    <form action="/mapping/operation/3527" method="post">
        <input type="hidden" name="_method" value="DELETE">
        <input type="submit" value="DELETE==>"/>
    </form>

    <form action="/mapping/operation/3527" method="post">
        <input type="hidden" name="_method" value="PUT">
        <input type="submit" value="PUT==>"/>
    </form>

    <h3>RequestParam</h3>
    <a href="/requestparam/doget?age=10">age</a>
    <br>
    <h3>POJO</h3>
    <form action="/pojo/user">
        username:<input type="text" name="name">
        age:<input type="text" name="age">
        school_name:<input type="text" name="school.name">
        school_adress:<input type="text" name="school.address">
        <input type="submit" value="提交">
    </form>
    <h3>ModelAndView</h3>
    <a href="/springmvc/modelview">let's go</a>
    <h3>Map</h3>
    <a href="/springmvc/testMap">Map</a>
</body>
</html>
