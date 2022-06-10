<%-- 
    Document   : live_in_query_show
    Created on : 2021-12-8, 12:03:55
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
            <h5></h5>八方快捷酒店前台管理系统<span>---入住记录界面</span>
        </header>
        <div class="left"></div>
        <div class="right">
             <button class="back">返回</button>
            <table border="1">
                <thead>
                    <tr>
                        <th>入住编号</th>
                        <th>顾客姓名</th>
                        <th>顾客身份证号码</th>
                        <th>顾客电话号码</th>
                        <th>入住客房号</th>
                        <th>入住客房类型</th>
                        <th>客房价格</th>
                        <th>入住时间</th>
                        <th>预计退房时间</th>
                        <th>总预计入住天数</th>          
                        <th>总收金额</th>
                        <th>押金</th>
                        <th>操作人</th>
                        <th>操作人电话号码</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${live_in_list}" var="list">
                        <tr>
                            <td>${list.live_in_id}</td>
                            <td>${list.custom_name}</td>
                            <td>${list.custom_identify}</td>
                            <td>${list.custom_tel}</td>
                            <td>${list.live_in_room}</td>
                            <td>${list.live_in_room_type}</td>
                            <td>${list.room_price}</td>
                            <td>${list.live_in_time}</td>
                            <td>${list.plan_leave_time}</td>
                            <td>${list.total_live_time}</td>
                            <td>${list.total_price}</td>
                            <td>${list.deposit}</td>
                            <td>${list.run_staff_name}</td>
                            <td>${list.run_staff_tel}</td>         
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>

              
