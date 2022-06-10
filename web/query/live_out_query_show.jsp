<%-- 
    Document   : live_out_show
    Created on : 2021-12-8, 18:41:27
    Author     : 钟镇斌
--%>

<%@page import="com.dao.Live_out"%>
<%@page import="com.dao.Live_in"%>
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
            <h5></h5>八方快捷酒店前台管理系统<span>---退房查询界面</span>
        </header>
        <div class="left"></div>
        <div class="right">
             <button class="back">返回</button>
            <table border="1">
                <thead>
                    <tr>
                        <th>退房编号</th>
                        <th>顾客姓名</th>
                        <th>顾客电话号码</th>
                        <th>退房房号</th>
                        <th>退房类型</th>
                        <th>入住时间</th>
                        <th>退房时间</th>
                        <th>总住天数</th>
                        <th>总收金额</th>
                        <th>操作人</th>
                        <th>操作人电话号码</th>
                    </tr>
                </thead>
                <tbody>
                    <% Live_out live = new Live_out();
                        live = (Live_out) request.getAttribute("live_out");
                    %>
                    <tr>
                        <td><%=live.getLive_out_id()%></td>
                        <td><%=live.getCustom_name()%></td>                  
                        <td><%=live.getCustom_tel()%></td>
                        <td><%=live.getLive_out_room()%></td>
                        <td><%=live.getLive_out_room_type()%></td>                    
                        <td><%=live.getLive_in_time()%></td>
                        <td><%=live.getLive_out_time()%></td>
                        <td><%=live.getTotal_live_time()%></td> 
                        <td><%=live.getTotal_price()%></td>                       
                        <td><%=live.getRun_staff_name()%></td>
                        <td><%=live.getRun_staff_tel()%></td> 
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>

