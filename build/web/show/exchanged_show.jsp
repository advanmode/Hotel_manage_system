<%-- 
    Document   : exchanged_show
    Created on : 2021-12-8, 15:30:58
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
            <h5></h5>八方快捷酒店前台管理系统<span>---换房记录界面</span>
        </header>
        <div class="left"></div>
        <div class="right">
             <button class="back">返回</button>
            <table border="1">
                <thead>
                    <tr>
                        <th>换房编号</th>
                        <th>顾客姓名</th>
                        <th>顾客电话号码</th>
                        <th>原客房号</th>
                        <th>原客房类型</th>
                        <th>原客房价格</th>
                        <th>现客房号</th>
                        <th>现客房类型</th>
                        <th>现客房价格</th>
                        <th>换房时间</th>
                        <th>操作人</th>
                        <th>操作人电话号码</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${exchanged_list}" var="list">
                        <tr>
                            <td>${list.exchanged_id}</td>
                            <td>${list.custom_name}</td>                       
                            <td>${list.custom_tel}</td>
                            <td>${list.before_room}</td>
                            <td>${list.before_room_type}</td>
                            <td>${list.before_room_price}</td>
                            <td>${list.after_room}</td>
                            <td>${list.after_room_type}</td>
                            <td>${list.after_room_price}</td>
                            <td>${list.exchanged_time}</td>                          
                            <td>${list.run_staff_name}</td>
                            <td>${list.run_staff_tel}</td>         
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>

