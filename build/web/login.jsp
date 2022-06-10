<%-- 
    Document   : index
    Created on : 2021-12-3, 19:43:36
    Author     : 钟镇斌
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>八方快捷酒店前台管理系统-登录主页</title>
        <link rel="shortcut icon" href="./favicon.ico" />   
        <link rel="stylesheet" href="./css/common.css">
        <link rel="stylesheet" href="./css/login.css">
        <script src="./js/login.js"></script>
    </head>
    <body>
        <header class="head">
            <h5></h5>八方快捷酒店前台管理系统<span>---登录界面</span>
        </header>
        <div class="left"></div>
        <div class="right">
            <div class="box">
                <h5>登录</h5>
                <form method="post" action="LoginServlet">
                    <div>
                        <input type="text" name="id" placeholder="请输入账号" class="id">
                        <span> </span>
                    </div>
                    <div>
                        <input type="password" name="password" placeholder="请输入密码" class="password">
                        <span> </span>
                    </div>
                    <input type="reset" class="reset" value="重置">
                    <input type="submit" class="login" value="登录">
                </form>
            </div>
        </div>
    </body>
</html>
