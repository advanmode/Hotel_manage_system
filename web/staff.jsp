<%-- 
    Document   : staff
    Created on : 2021-12-3, 19:44:13
    Author     : 钟镇斌
--%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>八方快捷酒店管理系统-员工登录</title>
        <link rel="shortcut icon" href="./favicon.ico" />
        <link rel="stylesheet" href="./css/common.css">
        <script src="./js/staff.js"></script>
        <script src="./js/common.js"></script>
    </head>

    <body>
        <header class="head">
            <h5></h5>八方快捷酒店前台管理系统
        </header>
        <div class="box">
             <div class="left"></div>
        <div class="right">
            <div class="hd clearfix">
                <div class="function_list">
                    <ul>
                        <li>为员工所提供功能</li>
                        <li>预定管理</li>
                        <li>入住管理</li>
                        <li>换房管理</li>
                        <li>续住管理</li>
                        <li>退房管理</li>
                        <li>客房管理</li>
                        <li class="out">退出系统</li>
                    </ul>
                </div>
                <div class="main clearfix">
                    <div class="bar">
                        <div class="animate">
                            <span>←使用需知</span>
                            <div class="tan">当前为前台员工使用，此系统为前台员工提供了六大功能：预定管理、入住管理、换房管理、续住管理、退房管理、客房管理，每一个管理功能包括：增加、修改、查询、删除，以及显示记录的五个子功能，使用者需点击相应功能按钮，或者根据提示输入正确格式的数据信息，完成相应功能实现，祝您使用愉快！</div>
                        </div>
                    </div>
                    <div class="blank"></div>
                    <div class="function">
                        <div class="tab_list">
                            <ul>
                                <li>预定查询</li>
                                <li>预定添加</li>
                                <li>预定修改</li>
                                <li>预定查询</li>
                                <li>预定删除</li>
                            </ul>
                        </div>
                     <div class="content">
                            <div class="block1 group1">
                                <form method="post" action="ScheduledShowServlet">
                                    <input type="submit" value="显示" class="show">
                                </form>
                            </div>
                            <div class="block2 group1">
                                <form method="post" action="ScheduledServlet">
                                    <ul>
                                        <li><label for="scheduled_id">预定编号：</label><input type="text" id="scheduled_id" name="scheduled_id" class="scheduled_id"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                        <li><label for="custom_identify">客户身份证号码：</label><input type="text" id="custom_identify" name="custom_identify" class="custom_identify"><span></span></li>
                                        <li><label for="custom_tel">客户手机号码：</label><input type="text" id="custom_tel" name="custom_tel" class="custom_tel"><span></span></li>
                                        <li><label for="scheduled_room">预定客房号：</label><input type="text" id="scheduled_room" name="scheduled_room" class="scheduled_room"><span></span></li>
                                        <li><label for="scheduled_room_type">预定客房类型：</label><input type="text" id='scheduled_room_type' name="scheduled_room_type" class="scheduled_room_type"><span></span></li>
                                        <li><label for="scheduled_time">预定时间：</label><input type="text" id="scheduled_time" name="scheduled_time" class="scheduled_time"><span></span></li>
                                        <li><label for="scheduled_begin_live">预计入住时间：</label><input type="text" id="scheduled_begin_live" name="scheduled_begin_live" class="scheduled_begin_live"><span></span></li>
                                        <li><label for="scheduled_end_leave">预计退房时间：</label><input type="text" id="scheduled_end_leave" name="scheduled_end_leave" class="scheduled_end_leave"><span></span></li>
                                        <li><label for="scheduled_total_time">预定天数：</label><input type="text" id="scheduled_total_time" name="scheduled_total_time" class="scheduled_total_time"><span></span></li>
                                        <li><label for="scheduled_price">预定金额：</label><input type="text" id="scheduled_price" name="scheduled_price" class="scheduled_price"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="添加">

                                </form>
                            </div>
                            <div class="block3 group1">
                                <h5>修改前先输入原预定客房号或原顾客姓名</h5>
                                <form method="post" action="ScheduledUpdateServlet">
                                    <ul>
                                        <li><label for="scheduled_id">原预定客房号：</label><input type="text" id="scheduled_id" name="kefang" class="scheduled_id"><span></span></li>
                                        <li><label for="custom_name">原客户姓名：</label><input type="text" id="custom_name" name="guke" class="custom_name"><span></span></li>
                                        <li><label for="scheduled_id">预定编号：</label><input type="text" id="scheduled_id" name="scheduled_id" class="scheduled_id"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                        <li><label for="custom_identify">客户身份证号码：</label><input type="text" id="custom_identify" name="custom_identify" class="custom_identify"><span></span></li>
                                        <li><label for="custom_tel">客户手机号码：</label><input type="text" id="custom_tel" name="custom_tel" class="custom_tel"><span></span></li>
                                        <li><label for="scheduled_room">预定客房号：</label><input type="text" id="scheduled_room" name="scheduled_room" class="scheduled_room"><span></span></li>
                                        <li><label for="scheduled_room_type">预定客房类型：</label><input type="text" id='scheduled_room_type' name="scheduled_room_type" class="scheduled_room_type"><span></span></li>
                                        <li><label for="scheduled_time">预定时间：</label><input type="text" id="scheduled_time" name="scheduled_time" class="scheduled_time"><span></span></li>
                                        <li><label for="scheduled_begin_live">预计入住时间：</label><input type="text" id="scheduled_begin_live" name="scheduled_begin_live" class="scheduled_begin_live"><span></span></li>
                                        <li><label for="scheduled_end_leave">预计退房时间：</label><input type="text" id="scheduled_end_leave" name="scheduled_end_leave" class="scheduled_end_leave"><span></span></li>
                                        <li><label for="scheduled_total_time">预定天数：</label><input type="text" id="scheduled_total_time" name="scheduled_total_time" class="scheduled_total_time"><span></span></li>
                                        <li><label for="scheduled_price">预定金额：</label><input type="text" id="scheduled_price" name="scheduled_price" class="scheduled_price"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="修改">
                                </form>
                            </div>
                            <div class="block4 group1">
                                <h5>请输入要查询预定信息的客房号或客户姓名</h5>
                                <form method="post" action="ScheduledQueryServlet">
                                    <ul>
                                        <li><label for="scheduled_id">预定客房号：</label><input type="text" id="scheduled_room" name="scheduled_room" class="scheduled_room"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="查询">
                                </form>
                            </div>
                            <div class="block5 group1">
                                <h5>请输入要删除预定信息的客房号或客户姓名</h5>
                                <form method="post" action="ScheduledDeleteServlet">
                                    <ul>
                                        <li><label for="scheduled_id">预定客房号：</label><input type="text" id="scheduled_id" name="scheduled_room" class="scheduled_room"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="删除">

                                </form>
                            </div>

                            <div class="block1 group2">
                                <form method="post" action="LiveInShowServlet">
                                    <input type="submit" value="显示" class="show">
                                </form>
                            </div>
                            <div class="block2 group2">
                                <form method="post" action="LiveInAddServlet">
                                    <ul>
                                        <li><label for="scheduled_id">入住编号：</label><input type="text" id="scheduled_id" name="live_in_id" class="scheduled_id"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                        <li><label for="custom_identify">客户身份证号码：</label><input type="text" id="custom_identify" name="custom_identify" class="custom_identify"><span></span></li>
                                        <li><label for="custom_tel">客户手机号码：</label><input type="text" id="custom_tel" name="custom_tel" class="custom_tel"><span></span></li>
                                        <li><label for="scheduled_room">客房号：</label><input type="text" id="scheduled_room" name="live_in_room" class="scheduled_room"><span></span></li>
                                        <li><label for="scheduled_room_type">客房类型：</label><input type="text" id='scheduled_room_type' name="live_in_room_type" class="scheduled_room_type"><span></span></li>
                                        <li><label for="scheduled_time">客房价格：</label><input type="text" id="scheduled_time" name="room_price" class="scheduled_price"><span></span></li>
                                        <li><label for="scheduled_begin_live">入住时间：</label><input type="text" id="scheduled_begin_live" name="live_in_time" class="scheduled_end_leave"><span></span></li>
                                        <li><label for="scheduled_end_leave">预计退房时间：</label><input type="text" id="scheduled_end_leave" name="plan_leave_time" class="scheduled_end_leave"><span></span></li>
                                        <li><label for="scheduled_total_time">预计入住天数：</label><input type="text" id="scheduled_total_time" name="total_live_time" class="scheduled_total_time"><span></span></li>
                                        <li><label for="total_price">总入住价格：</label><input type="text" id="total_price" name="total_price" class="scheduled_price "><span></span></li>
                                        <li><label for="scheduled_price">押金：</label><input type="text" id="scheduled_price" name="deposit" class="scheduled_price "><span></span></li>
                                        <li><label for="run_staff_name">操作人姓名：</label><input type="text" id="run_staff_name" name="run_staff_name" class="custom_name"><span></span></li>
                                        <li><label for="run_staff_tel">操作人电话：</label><input type="text" id="run_staff_tel" name="run_staff_tel" class="custom_tel"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="添加">
                                </form>
                            </div>
                            <div class="block3 group2 overf_block">
                                <h5>修改前先输入原入住客房号或原顾客姓名</h5>
                                <form method="post" action="LiveInUpdateServlet">
                                    <ul>
                                        <div class="li_left">
                                            <li><label for="scheduled_id">原入住客房号：</label><input type="text" id="scheduled_id" name="kefang" class="scheduled_room"><span></span></li>
                                            <li><label for="custom_name">原客户姓名：</label><input type="text" id="custom_name" name="guke" class="custom_name"><span></span></li>
                                            <li><label for="scheduled_id">入住编号：</label><input type="text" id="scheduled_id" name="live_in_id" class="scheduled_id"><span></span></li>
                                            <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                            <li><label for="custom_identify">客户身份证号码：</label><input type="text" id="custom_identify" name="custom_identify" class="custom_identify"><span></span></li>
                                            <li><label for="custom_tel">客户手机号码：</label><input type="text" id="custom_tel" name="custom_tel" class="custom_tel"><span></span></li>
                                            <li><label for="scheduled_room">客房号：</label><input type="text" id="scheduled_room" name="live_in_room" class="scheduled_room"><span></span></li>
                                            <li><label for="scheduled_room_type">客房类型：</label><input type="text" id='scheduled_room_type' name="live_in_room_type" class="scheduled_room_type"><span></span></li>
                                            <li><label for="scheduled_time">客房价格：</label><input type="text" id="scheduled_time" name="room_price" class="scheduled_price"><span></span></li>
                                            <li><label for="scheduled_begin_live">入住时间：</label><input type="text" id="scheduled_begin_live" name="live_in_time" class="scheduled_end_leave"><span></span></li>
                                            <li><label for="scheduled_end_leave">预计退房时间：</label><input type="text" id="scheduled_end_leave" name="plan_leave_time" class="scheduled_end_leave"><span></span></li>
                                            <li><label for="scheduled_total_time">预计入住天数：</label><input type="text" id="scheduled_total_time" name="total_live_time" class="scheduled_total_time"><span></span></li>
                                            <li><label for="total_price">总入住价格：</label><input type="text" id="total_price" name="total_price" class="scheduled_price "><span></span></li>
                                        </div>
                                        <div class="li_right">
                                            <li><label for="scheduled_price">押金：</label><input type="text" id="scheduled_price" name="deposit" class="scheduled_price "><span></span></li>
                                            <li><label for="run_staff_name">操作人姓名：</label><input type="text" id="run_staff_name" name="run_staff_name" class="custom_name"><span></span></li>
                                            <li><label for="run_staff_tel">操作人电话：</label><input type="text" id="run_staff_tel" name="run_staff_tel" class="custom_tel"><span></span></li>
                                        </div>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="修改">
                                </form>
                            </div>
                            <div class="block4 group2">
                                <h5>请输入要查询入住信息的预计最短住宿时长或客户姓名</h5>
                                <form method="post" action="LiveInQueryServlet">
                                    <ul>
                                        <li><label for="scheduled_id">预计最短住宿天数：</label><input type="text" id="scheduled_id" name="total_live_time" class="scheduled_total_time"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="查询">
                                </form>
                            </div>
                            <div class="block5 group2">
                                <h5>请输入要删除入住信息的客房号或客户姓名</h5>
                                <form method="post" action="LiveInDeleteServlet">
                                    <ul>
                                        <li><label for="scheduled_id">客房号：</label><input type="text" id="scheduled_id" name="live_in_room" class="scheduled_room"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="删除">
                                </form>
                            </div>

                            <div class="block1 group3">
                                <form method="post" action=" ExchangedShowServlet">
                                    <input type="submit" value="显示" class="show">
                                </form>

                            </div>
                            <div class="block2 group3">
                                <form method="post" action="ExchangedAddServlet">
                                    <ul>
                                        <li><label for="scheduled_id">换房编号：</label><input type="text" id="scheduled_id" name="exchanged_id" class="scheduled_id"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                        <li><label for="custom_tel">客户手机号码：</label><input type="text" id="custom_tel" name="custom_tel" class="custom_tel"><span></span></li>
                                        <li><label for="scheduled_room">原客房号：</label><input type="text" id="scheduled_room" name="before_room" class="scheduled_room"><span></span></li>
                                        <li><label for="scheduled_room_type">原客房类型：</label><input type="text" id="scheduled_room_type" name="before_room_type" class="scheduled_room_type"><span></span></li>
                                        <li><label for="scheduled_time">原客房价格：</label><input type="text" id="scheduled_time" name="before_room_price" class="scheduled_price"><span></span></li>
                                        <li><label for="scheduled_begin_live">换客房号：</label><input type="text" id="scheduled_begin_live" name="after_room" class="scheduled_room"><span></span></li>
                                        <li><label for="scheduled_end_leave">换客房类型：</label><input type="text" id="scheduled_end_leave" name="after_room_type" class="scheduled_room_type"><span></span></li>
                                        <li><label for="scheduled_total_time">换客房价格：</label><input type="text" id="scheduled_total_time" name="after_room_price" class="scheduled_price"><span></span></li>
                                        <li><label for="total_price">换房时间：</label><input type="text" id="total_price" name="exchanged_time" class="scheduled_end_leave"><span></span></li>
                                        <li><label for="run_staff_name">操作人姓名：</label><input type="text" id="run_staff_name" name="run_staff_name" class="custom_name"><span></span></li>
                                        <li><label for="run_staff_tel">操作人电话：</label><input type="text" id="run_staff_tel" name="run_staff_tel" class="custom_tel"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="添加">
                                </form>
                            </div>
                            <div class="block3 group3 overf_block">
                                <h5>修改前先输入原客房号或原顾客姓名</h5>
                                <form method="post" action="ExchangedUpdateServlet">
                                    <ul>
                                        <div class="li_left">
                                            <li><label for="scheduled_id">原客房号：</label><input type="text" id="scheduled_id" name="kefang" class="scheduled_id"><span></span></li>
                                            <li><label for="custom_name">原客户姓名：</label><input type="text" id="custom_name" name="guke" class="custom_name"><span></span></li>
                                            <li><label for="scheduled_id">换房编号：</label><input type="text" id="scheduled_id" name="exchanged_id" class="scheduled_id"><span></span></li>
                                            <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                            <li><label for="custom_tel">客户手机号码：</label><input type="text" id="custom_tel" name="custom_tel" class="custom_tel"><span></span></li>
                                            <li><label for="scheduled_room">原客房号：</label><input type="text" id="scheduled_room" name="before_room" class="scheduled_room"><span></span></li>
                                            <li><label for="scheduled_room_type">原客房类型：</label><input type="text" id="scheduled_room_type" name="before_room_type" class="scheduled_room_type"><span></span></li>
                                            <li><label for="scheduled_time">原客房价格：</label><input type="text" id="scheduled_time" name="before_room_price" class="scheduled_price"><span></span></li>
                                            <li><label for="scheduled_begin_live">换客房号：</label><input type="text" id="scheduled_begin_live" name="after_room" class="scheduled_room"><span></span></li>
                                            <li><label for="scheduled_end_leave">换客房类型：</label><input type="text" id="scheduled_end_leave" name="after_room_type" class="scheduled_room_type"><span></span></li>
                                            <li><label for="scheduled_total_time">换客房价格：</label><input type="text" id="scheduled_total_time" name="after_room_price" class="scheduled_price"><span></span></li>
                                            <li><label for="total_price">换房时间：</label><input type="text" id="total_price" name="exchanged_time" class="scheduled_end_leave"><span></span></li>
                                            <li><label for="run_staff_name">操作人姓名：</label><input type="text" id="run_staff_name" name="run_staff_name" class="custom_name"><span></span></li>

                                        </div>
                                        <div class="li_right">
                                            <li><label for="run_staff_tel">操作人电话：</label><input type="text" id="run_staff_tel" name="run_staff_tel" class="custom_tel"><span></span></li>
                                        </div>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="修改">
                                </form>
                            </div>
                            <div class="block4 group3">
                                <h5>请输入要查询换房信息的原客房号或客户姓名</h5>
                                <form method="post" action="ExchangedQueryServlet">
                                    <ul>
                                        <li><label for="scheduled_id">原客房号：</label><input type="text" id="scheduled_id" name="before_room" class="scheduled_room"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="查询">
                                </form>
                            </div>
                            <div class="block5 group3">
                                <h5>请输入要删除换房信息的换后客房号或客户姓名</h5>
                                <form method="post" action="ExchangedDeleteServlet">
                                    <ul>
                                        <li><label for="scheduled_id">换后客房号：</label><input type="text" id="scheduled_id" name="after_room" class="scheduled_room"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="删除">
                                </form>
                            </div>

                            <div class="block1 group4">
                                <form method="post" action="ContinuteShowServlet">
                                    <input type="submit" value="显示" class="show">
                                </form>

                            </div>
                            <div class="block2 group4">
                                <form method="post" action="ContinuteAddServlet">
                                    <ul>
                                        <li><label for="scheduled_id">续住编号：</label><input type="text" id="scheduled_id" name="continute_id" class="scheduled_id"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                        <li><label for="custom_tel">客户手机号码：</label><input type="text" id="custom_tel" name="custom_tel" class="custom_tel"><span></span></li>
                                        <li><label for="scheduled_room">续住客房号：</label><input type="text" id="scheduled_room" name="continute_room" class="scheduled_room"><span></span></li>
                                        <li><label for="scheduled_room_type">续住客房类型：</label><input type="text" id='scheduled_room_type' name="continute_room_type" class="scheduled_room_type"><span></span></li>
                                        <li><label for="scheduled_time">入住时间：</label><input type="text" id="scheduled_time" name="live_begin_time" class="scheduled_time"><span></span></li>
                                        <li><label for="scheduled_begin_live">已住时间：</label><input type="text" id="scheduled_begin_live" name="aleady_live_time" class="scheduled_total_time"><span></span></li>
                                        <li><label for="scheduled_end_leave">续住开始时间：</label><input type="text" id="scheduled_end_leave" name="continute_begin_time" class="scheduled_time"><span></span></li>
                                        <li><label for="scheduled_total_time">预计续住结束时间：</label><input type="text" id="scheduled_total_time" name="continute_end_time" class="scheduled_time"><span></span></li>
                                        <li><label for="total_price">续住总天数：</label><input type="text" id="total_price" name="continute_total_time" class="scheduled_total_time"><span></span></li>
                                        <li><label for="scheduled_price">续住总价格：</label><input type="text" id="scheduled_price" name="continute_price" class="scheduled_price"><span></span></li>
                                        <li><label for="run_staff_name">操作人姓名：</label><input type="text" id="run_staff_name" name="run_staff_name" class="custom_name"><span></span></li>
                                        <li><label for="run_staff_tel">操作人电话：</label><input type="text" id="run_staff_tel" name="run_staff_tel" class="custom_tel"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="添加">
                                </form>
                            </div>
                            <div class="block3 group4 overf_block">
                                <h5>修改前先输入原客房号或原顾客姓名</h5>
                                <form method="post" action="ContinuteUpdateServlet">
                                    <ul>
                                        <div class="li_left">
                                            <li><label for="scheduled_id">原客房号：</label><input type="text" id="scheduled_id" name="kefang" class="scheduled_room"><span></span></li>
                                            <li><label for="custom_name">原客户姓名：</label><input type="text" id="custom_name" name="guke" class="custom_name"><span></span></li>
                                            <li><label for="scheduled_id">续住编号：</label><input type="text" id="scheduled_id" name="continute_id" class="scheduled_id"><span></span></li>
                                            <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                            <li><label for="custom_tel">客户手机号码：</label><input type="text" id="custom_tel" name="custom_tel" class="custom_tel"><span></span></li>
                                            <li><label for="scheduled_room">续住客房号：</label><input type="text" id="scheduled_room" name="continute_room" class="scheduled_room"><span></span></li>
                                            <li><label for="scheduled_room_type">续住客房类型：</label><input type="text" id='scheduled_room_type' name="continute_room_type" class="scheduled_room_type"><span></span></li>
                                            <li><label for="scheduled_time">入住时间：</label><input type="text" id="scheduled_time" name="live_begin_time" class="scheduled_time"><span></span></li>
                                            <li><label for="scheduled_begin_live">已住时间：</label><input type="text" id="scheduled_begin_live" name="aleady_live_time" class="scheduled_total_time"><span></span></li>
                                            <li><label for="scheduled_end_leave">续住开始时间：</label><input type="text" id="scheduled_end_leave" name="continute_begin_time" class="scheduled_time"><span></span></li>
                                            <li><label for="scheduled_total_time">预计续住结束时间：</label><input type="text" id="scheduled_total_time" name="continute_end_time" class="scheduled_time"><span></span></li>
                                            <li><label for="total_price">续住总天数：</label><input type="text" id="total_price" name="continute_total_time" class="scheduled_total_time"><span></span></li>
                                            <li><label for="scheduled_price">续住总价格：</label><input type="text" id="scheduled_price" name="continute_price" class="scheduled_price"><span></span></li>

                                        </div>
                                        <div class="li_right">
                                            <li><label for="run_staff_name">操作人姓名：</label><input type="text" id="run_staff_name" name="run_staff_name" class="custom_name"><span></span></li>
                                            <li><label for="run_staff_tel">操作人电话：</label><input type="text" id="run_staff_tel" name="run_staff_tel" class="custom_tel"><span></span></li>
                                        </div>

                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="修改">
                                </form>
                            </div>
                            <div class="block4 group4">
                                <h5>请输入要查询续住信息的最短已住天数或客户姓名</h5>
                                <form method="post" action="ContinuteQueryServlet">
                                    <ul>
                                        <li><label for="scheduled_begin_live">最短已住天数：</label><input type="text" id="scheduled_begin_live" name="aleady_live_time" class="scheduled_total_time"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="查询">
                                </form>
                            </div>
                            <div class="block5 group4">
                                <h5>请输入要删除续住信息的客房号或客户姓名</h5>
                                <form method="post" action="ContinuteDeleteServlet">
                                    <ul>
                                        <li><label for="scheduled_id">客房号：</label><input type="text" id="scheduled_id" name="continute_room" class="scheduled_room"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="删除">
                                </form>
                            </div>

                            <div class="block1 group5">
                                <form method="post" action="LiveOutShowServlet">
                                    <input type="submit" value="显示" class="show">
                                </form>

                            </div>
                            <div class="block2 group5">
                                <form method="LiveOutAddServlet" action="LiveOutAddServlet">
                                    <ul>
                                        <li><label for="scheduled_id">退房编号：</label><input type="text" id="scheduled_id" name="live_out_id" class="scheduled_id"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                        <li><label for="custom_tel">客户手机号码：</label><input type="text" id="custom_tel" name="custom_tel" class="custom_tel"><span></span></li>
                                        <li><label for="scheduled_room">客房号：</label><input type="text" id="scheduled_room" name="live_out_room" class="scheduled_room"><span></span></li>
                                        <li><label for="scheduled_room_type">客房类型：</label><input type="text" id='scheduled_room_type' name="live_out_room_type" class="scheduled_room_type"><span></span></li>
                                        <li><label for="scheduled_begin_live">入住时间：</label><input type="text" id="scheduled_begin_live" name="live_in_time" class="scheduled_end_leave"><span></span></li>
                                        <li><label for="scheduled_end_leave">退房时间：</label><input type="text" id="scheduled_end_leave" name="live_out_time" class="scheduled_end_leave"><span></span></li>
                                        <li><label for="scheduled_total_time">总住天数：</label><input type="text" id="scheduled_total_time" name="total_live_time" class="scheduled_total_time"><span></span></li>
                                        <li><label for="total_price">总住价格：</label><input type="text" id="total_price" name="total_price" class="scheduled_price"><span></span></li>
                                        <li><label for="run_staff_name">操作人姓名：</label><input type="text" id="run_staff_name" name="run_staff_name" class="custom_name"><span></span></li>
                                        <li><label for="run_staff_tel">操作人电话：</label><input type="text" id="run_staff_tel" name="run_staff_tel" class="custom_tel"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="添加">
                                </form>
                            </div>
                            <div class="block3 group5">
                                <h5>修改前先输入原客房号或原顾客姓名</h5>
                                <form method="post" action="LiveOutUpdateServelt">
                                    <ul>
                                        <li><label for="scheduled_id">原客房号：</label><input type="text" id="scheduled_id" name="kefang" class="scheduled_room"><span></span></li>
                                        <li><label for="custom_name">原客户姓名：</label><input type="text" id="custom_name" name="guke" class="custom_name"><span></span></li>
                                        <li><label for="scheduled_id">退房编号：</label><input type="text" id="scheduled_id" name="live_out_id" class="scheduled_id"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                        <li><label for="custom_tel">客户手机号码：</label><input type="text" id="custom_tel" name="custom_tel" class="custom_tel"><span></span></li>
                                        <li><label for="scheduled_room">客房号：</label><input type="text" id="scheduled_room" name="live_out_room" class="scheduled_room"><span></span></li>
                                        <li><label for="scheduled_room_type">客房类型：</label><input type="text" id='scheduled_room_type' name="live_out_room_type" class="scheduled_room_type"><span></span></li>
                                        <li><label for="scheduled_begin_live">入住时间：</label><input type="text" id="scheduled_begin_live" name="live_in_time" class="scheduled_end_leave"><span></span></li>
                                        <li><label for="scheduled_end_leave">退房时间：</label><input type="text" id="scheduled_end_leave" name="live_out_time" class="scheduled_end_leave"><span></span></li>
                                        <li><label for="scheduled_total_time">总住天数：</label><input type="text" id="scheduled_total_time" name="total_live_time" class="scheduled_total_time"><span></span></li>
                                        <li><label for="total_price">总住价格：</label><input type="text" id="total_price" name="total_price" class="scheduled_price"><span></span></li>
                                        <li><label for="run_staff_name">操作人姓名：</label><input type="text" id="run_staff_name" name="run_staff_name" class="custom_name"><span></span></li>
                                        <li><label for="run_staff_tel">操作人电话：</label><input type="text" id="run_staff_tel" name="run_staff_tel" class="custom_tel"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="修改">
                                </form>
                            </div>
                            <div class="block4 group5">
                                <h5>请输入要查询退房信息的客房号或客户姓名</h5>
                                <form method="post" action="LiveOutQueryServelt">
                                    <ul>
                                        <li><label for="scheduled_id">客房号：</label><input type="text" id="scheduled_id" name="live_out_room" class="scheduled_room"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="查询">
                                </form>
                            </div>
                            <div class="block5 group5">
                                <h5>请输入要删除退房信息的客房号或客户姓名</h5>
                                <form method="post" action="LiveOutDeleteServlet">
                                    <ul>
                                        <li><label for="scheduled_id">客房号：</label><input type="text" id="scheduled_id" name="live_out_room" class="scheduled_room"><span></span></li>
                                        <li><label for="custom_name">客户姓名：</label><input type="text" id="custom_name" name="custom_name" class="custom_name"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="删除">
                                </form>
                            </div>

                            <div class="block1 group6">
                                <form method="post" action="RoomShowServlet">
                                    <input type="submit" value="显示" class="show">
                                </form>

                            </div>
                            <div class="block2 group6">
                                <form method="post" action="RoomAddServlet">
                                    <ul>
                                        <li><label for="scheduled_id">客房编号：</label><input type="text" id="scheduled_id" name="room_id" class="scheduled_id"><span></span></li>
                                        <li><label for="custom_name">客房号：</label><input type="text" id="custom_name" name="room" class="scheduled_room"><span></span></li>
                                        <li><label for="custom_tel">客房类型：</label><input type="text" id="custom_tel" name="room_type" class="scheduled_room_type"><span></span></li>
                                        <li><label for="scheduled_room">客房价格：</label><input type="text" id="scheduled_room" name="room_price" class="scheduled_price"><span></span></li>
                                        <li><label for="scheduled_room">客房状态：</label><input type="text" id="scheduled_room" name="state" class="scheduled_room_type"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="添加">
                                </form>
                            </div>
                            <div class="block3 group6">
                                <h5>修改前先输入原客房编号或原客房号</h5>
                                <form method="post" action="RoomUpdateServlet">
                                    <ul>
                                        <li><label for="scheduled_id">原客房编号：</label><input type="text" id="scheduled_id" name="id" class="scheduled_id"><span></span></li>
                                        <li><label for="scheduled_id">原客房号：</label><input type="text" id="scheduled_id" name="kefang" class="scheduled_room"><span></span></li>
                                        <li><label for="scheduled_id">客房编号：</label><input type="text" id="scheduled_id" name="room_id" class="scheduled_id"><span></span></li>
                                        <li><label for="custom_name">客房号：</label><input type="text" id="custom_name" name="room" class="scheduled_room"><span></span></li>
                                        <li><label for="custom_tel">客房类型：</label><input type="text" id="custom_tel" name="room_type" class="scheduled_room_type"><span></span></li>
                                        <li><label for="scheduled_room">客房价格：</label><input type="text" id="scheduled_room" name="room_price" class="scheduled_price"><span></span></li>
                                         <li><label for="scheduled_room">客房状态：</label><input type="text" id="scheduled_room" name="state" class="scheduled_room_type"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="修改">
                                </form>
                            </div>
                            <div class="block4 group6">
                                <h5>请输入要查询客房信息的客房状态或客房号</h5>
                                <form method="post" action="RoomQueryServlet">
                                    <ul>
                                        <li><label for="scheduled_room">客房状态：</label><input type="text" id="scheduled_room" name="state" class="scheduled_room_type"><span></span></li>
                                        <li><label for="custom_name">客房号：</label><input type="text" id="custom_name" name="room" class="scheduled_room"><span></span></li>
                                    </ul>
                                    <input type="reset" value="清空"><input type="submit" value="查询">
                                </form>
                            </div>
                            <div class="block5 group6">
                                <h5>请输入要删除客房信息的客房编号或客房号</h5>
                                <form method="post" action="RoomDeleteServlet">
                                    <ul>
                                        <li><label for="scheduled_id">客房编号：</label><input type="text" id="scheduled_id" name="room_id" class="scheduled_id"><span></span></li>
                                        <li><label for="scheduled_id">客房号：</label><input type="text" id="scheduled_id" name="room" class="scheduled_room"><span></span></li>
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
                    name = (String)session.getAttribute("name");
                %>
                <span class="user">当前用户：<%=name%></span>
                <span class="time"></span>
            </div>
        </div>
        </div>
       
    </body>
</html>
