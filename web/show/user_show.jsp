<%-- 
    Document   : user_show.jsp
    Created on : 2021-12-10, 22:53:16
    Author     : 钟镇斌
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="./favicon.ico" />
        <link rel="stylesheet" href="./css/show_query.css">
        <script src="./js/show_query.js"></script>
    </head>
    <body>
        <header class="head">
            <h5></h5>八方快捷酒店前台管理系统<span>---员工记录界面</span>
        </header>
        <div class="left"></div>
        <div class="right">
            <button class="back">返回</button>
            <table border="1">
                <thead>
                    <tr>
                        <th>账号</th>
                        <th>姓名</th>
                        <th>密码</th>
                        <th>邮箱</th>
                        <th>权限</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${user_list}" var="list">
                        <tr>
                            <td>${list.id}</td>
                            <td>${list.name}</td>
                            <td>${list.password}</td>
                            <td>${list.email}</td>
                            <td>${list.authority}</td>

                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
