<%--
  Created by IntelliJ IDEA.
  User: wangbin
  Date: 2021/11/2
  Time: 下午8:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/users/addUsers" method="post">
        用户名：<input type="text" name="username"/><br/>
        用户性别：<input type="text" name="usersex"/><br/>
        <input type="submit" value="OK">
    </form>
</body>
</html>
