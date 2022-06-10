<%-- 
    Document   : scheduled_show
    Created on : 2021-12-7, 11:41:50
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
            <h5></h5>八方快捷酒店前台管理系统<span>---预定记录界面</span>
        </header>
        <div class="left"></div>
        <div class="right">
            <button class="back">返回</button>
            <table border="1">
                <thead>
                    <tr>
                        <th>预定编号</th>
                        <th>顾客姓名</th>
                        <th>顾客身份证号码</th>
                        <th>顾客电话号码</th>
                        <th>预定房间号</th>
                        <th>预定房间类型</th>
                        <th>预定时间</th>
                        <th>预定入住</th>
                        <th>预定退房</th>
                        <th>预定天数</th>
                        <th>预定价格</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${scheduled_list}" var="list">
                        <tr>
                            <td>${list.scheduled_id}</td>
                            <td>${list.custom_name}</td>
                            <td>${list.custom_identify}</td>
                            <td>${list.custom_tel}</td>
                            <td>${list.scheduled_room}</td>
                            <td>${list.scheduled_room_type}</td>
                            <td>${list.scheduled_time}</td>
                            <td>${list.scheduled_begin_live}</td>
                            <td>${list.scheduled_end_leave}</td>
                            <td>${list.scheduled_total_time}</td>
                            <td>${list.scheduled_price}</td>                       
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
