<%@ page language="java"  pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>My JSP 'MyJsp.jsp' starting page</title>
</head>

<body>
<h1>登录页面----</h1>
<%--<form:form action="/login" commandName="user" method="post">
    用户名：<form:input path="username"/> <form:errors path="username" cssClass="error"/> <br/>
    密 &nbsp;&nbsp;码：<form:password path="password"/> <form:errors path="password" cssClass="error"/> <br/>
    <form:button name="button">submit</form:button>
</form:form>--%>

<form action="/login" method="post">
    用户名：<input name="userName"/> <br/>
    密 &nbsp;&nbsp;码：<input type="password" name="password"/> <br/>
    <button name="button" type="submit">submit</button>
</form>
</body>
</html>