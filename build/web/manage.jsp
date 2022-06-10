<%-- 
    Document   : manage
    Created on : 2021-12-3, 19:44:34
    Author     : 钟镇斌
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>八方快捷酒店管理系统-管理员登录</title>
    <link rel="shortcut icon" href="./favicon.ico" />
    <link rel="stylesheet" href="./css/common.css">
    <script src="./js/manage.js"></script>
    <script src="./js/common.js"></script>
</head>

<body>
    <header class="head">
        <h5></h5>八方快捷酒店前台管理系统
    </header>
    <div class="left"></div>
    <div class="right">
        <div class="hd clearfix">
            <div class="function_list">
                <ul>
                    <li>为管理员所提供功能</li>
                    <li>预定记录</li>
                    <li>入住记录</li>
                    <li>换房记录</li>
                    <li>续住记录</li>
                    <li>退房记录</li>
                    <li>客房管理</li>
                    <li>员工管理</li>
                    <li class="out">退出系统</li>
                </ul>
            </div>
            <div class="main clearfix">
                <div class="bar">
                    <div class="animate">
                        <span>←使用需知</span>
                        <div class="tan" style="height: 531px">当前为管理员使用，此系统为管理员提供了七大功能：预定记录、入住记录、换房记录、续住记录、退房记录、员工管理、客房管理，其中前五个功能只有显示记录一项子功能，员工管理包括：增加、删除、显示三个子功能，客房价格包括：显示客房记录、调整客房价格两个子功能，使用者需点击相应功能按钮，或者根据提示输入正确格式的数据信息，完成相应功能实现，祝您使用愉快！</div>
                    </div>
                </div>
                <div class="blank"></div>
                <div class="function">
                    <div class="tab_list">
                        <ul>
                            <li>预定记录</li>
                        </ul>
                    </div>
                    <div class="content">
                        <div class="block1 group1">
                            <form method="post" action="ScheduledShowServlet">
                                <input type="submit" value="显示" class="show">
                            </form>
                        </div>
                        <div class="block1 group2">
                            <form method="post" action="LiveInShowServlet">
                                <input type="submit" value="显示" class="show">
                            </form>
                        </div>
                        <div class="block1 group3">
                            <form method="post" action="ExchangedShowServlet">
                                <input type="submit" value="显示" class="show">
                            </form>
                        </div>
                        <div class="block1 group4">
                            <form method="post" action="ContinuteShowServlet">
                                <input type="submit" value="显示" class="show">
                            </form>
                        </div>
                        <div class="block1 group5">
                            <form method="post" action="LiveOutShowServlet">
                                <input type="submit" value="显示" class="show">
                            </form>
                        </div>
                        <div class="block1 group6">
                            <form method="post" action="RoomShowServlet">
                                <input type="submit" value="显示" class="show">
                            </form>
                        </div>
                        <div class="block2 group6">
                            <h5>请输入客房类型以及预调整价格</h5>
                            <form method="post" action="RoomPriceAdjustServlet">
                                <ul>
                                    <li><label for="custom_tel">客房类型：</label><input type="text" id="custom_tel" name="room_type" class="scheduled_room_type"><span></span></li>
                                    <li><label for="scheduled_room">调整价格：</label><input type="text" id="scheduled_room" name="room_price" class="scheduled_price"><span></span></li>
                                </ul>
                                <input type="reset" value="清空"><input type="submit" value="调整">
                            </form>
                        </div>
                        <div class="block1 group7">
                            <form method="post" action="UserShowServlet">
                                <input type="submit" value="显示" class="show">
                            </form>
                        </div>
                        <div class="block2 group7">
                            <form method="post" action="UserAddServlet">
                                <ul>
                                    <li><label for="custom_tel">账号：</label><input type="text" id="custom_tel" name="id" class="custom_tel"><span></span></li>
                                    <li><label for="scheduled_room">姓名：</label><input type="text" id="scheduled_room" name="name" class="custom_name"><span></span></li>
                                    <li><label for="custom_tel">密码：</label><input type="text" id="custom_tel" name="password" class="password"><span></span></li>
                                    <li><label for="scheduled_room">邮箱：</label><input type="text" id="scheduled_room" name="email" class="email"><span></span></li>
                                    <li><label for="custom_tel">权限：</label><input type="text" id="custom_tel" name="authority" class="authority"><span></span></li>
                                </ul>
                                <input type="reset" value="清空"><input type="submit" value="添加">
                            </form>
                        </div>
                        <div class="block3 group7">
                            <h5>请输入员工账号或者员工姓名</h5>
                            <form method="post" action="UserDeleteServlet">
                                <ul>
                                    <li><label for="custom_tel">员工账号：</label><input type="text" id="custom_tel" name="id" class="custom_tel"><span></span></li>
                                    <li><label for="scheduled_room">员工姓名：</label><input type="text" id="scheduled_room" name="name" class="custom_name"><span></span></li>
                                </ul>
                                <input type="reset" value="清空"><input type="submit" value="删除">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="ft">
            <% String name;
                    name = (String) session.getAttribute("name");
                %>
                <span class="user">当前用户：<%=name%></span>
                <span class="time"></span>
        </div>
    </div>
</body>

</html>