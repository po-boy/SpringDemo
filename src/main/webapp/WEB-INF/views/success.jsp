<%--
  Created by IntelliJ IDEA.
  User: 炜
  Date: 2017/12/27
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>success</title>
</head>
<body>
    <h1><a href="/index.jsp">go index</a></h1>
    school: ${requestScope.address.name}
    <br>
    names: ${requestScope.names}
    <br>
    sessionattribute: ${sessionScope.user}
    <br>
    modelAttribute: ${requestScope.user}
    <br>
    jstl: <fmt:message key="i18n.username"></fmt:message>
    <br>
    <fmt:message key="i18n.password"></fmt:message>
</body>
</html>
