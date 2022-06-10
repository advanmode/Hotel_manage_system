<%-- 
    Document   : scheduled_query_show
    Created on : 2021-12-7, 16:36:42
    Author     : 钟镇斌
--%>

<%@page import="com.dao.Scheduled"%>
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
            <h5></h5>八方快捷酒店前台管理系统<span>---预定查询界面</span>
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
                    <% Scheduled scheduled = new Scheduled();
                        scheduled = (Scheduled) request.getAttribute("scheduled");
                    %>
                    <tr>
                        <td><%=scheduled.getScheduled_id()%></td>
                        <td><%=scheduled.getCustom_name()%></td>
                        <td><%=scheduled.getCustom_identify()%></td> 
                        <td><%=scheduled.getCustom_tel()%></td>   
                        <td><%=scheduled.getScheduled_room()%></td>
                        <td><%=scheduled.getScheduled_room_type()%></td> 
                        <td><%=scheduled.getScheduled_time()%></td>   
                        <td><%=scheduled.getScheduled_begin_live()%></td>   
                        <td><%=scheduled.getScheduled_end_leave()%></td>  
                        <td><%=scheduled.getScheduled_total_time()%></td>
                        <td><%=scheduled.getScheduled_price()%></td>   
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>