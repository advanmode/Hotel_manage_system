<%-- 
    Document   : room_show
    Created on : 2021-12-8, 20:18:22
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
            <h5></h5>八方快捷酒店前台管理系统<span>---客房记录界面</span>
        </header>
        <div class="left"></div>
        <div class="right">
             <button class="back">返回</button>
            <table border="1">
                <thead>
                    <tr>
                       <th>客房编号</th>
                        <th>客房号</th>
                        <th>客房类型</th>
                        <th>客房价格</th>
                         <th>客房状态</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${room_list}" var="list">
                        <tr>
                            <td>${list.room_id}</td>
                            <td>${list.room}</td>
                            <td>${list.room_type}</td>
                            <td>${list.room_price}</td>
                            <td>${list.state}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>

