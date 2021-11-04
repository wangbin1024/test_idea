<%--
  Created by IntelliJ IDEA.
  User: wangbin
  Date: 2021/11/2
  Time: 下午9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/users/updateUsers" method="post">
        <input type="hidden" name="userid" value="${users.userid}"/>
        用户名：<input type="text" name="username" value="${users.username}"/><br/>
        用户性别：<input type="text" name="usersex" value="${users.usersex}"/><br/>
        <input type="submit" value="OK">
    </form>
</body>
</html>
