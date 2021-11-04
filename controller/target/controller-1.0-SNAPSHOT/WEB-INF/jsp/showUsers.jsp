<%--
  Created by IntelliJ IDEA.
  User: wangbin
  Date: 2021/11/2
  Time: 下午8:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1" align="center">
        <tr>
            <th>用户名</th>
            <th>性别</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${list}" var="users">
            <tr>
                <td>${users.username}</td>
                <td>${users.usersex}</td>
                <td>
                    <a href="/users/preUpdateUser?userid=${users.userid}">更新</a>
                    <a href="/users/deleteUsers?userid=${users.userid}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
