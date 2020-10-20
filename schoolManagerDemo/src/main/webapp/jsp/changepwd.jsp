<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/9/6
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html  class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>学生管理系统-修改密码</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="stylesheet" href="../static/css/font.css">
    <link rel="stylesheet" href="../static/css/login.css">
    <link rel="stylesheet" href="../static/css/xadmin.css">
    <link rel="stylesheet" href="../static/css/bootstrap.css"/>
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="../static/lib/layui/layui.js" charset="utf-8"></script>
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="login-bg">

<div class="login layui-anim layui-anim-up">
    <div class="message">学生管理系统</div>
    <div id="darkbannerwrap"></div>
    <ul class="nav nav-tabs">
        <li class="active"><a href="#name1" data-toggle="tab">电子邮箱</a></li>
        <li><a href="#name2" data-toggle="tab">电话号</a></li>
    </ul>
    <!--选项卡面板-->
    <div class="tab-content">
        <div class="tab-pane fade in active" id="name1">
            <!-- fade有淡入淡出的效果-->
            <p></p>
            <div class="youxiang">
                <input name="username" placeholder="Email"  type="text" lay-verify="required" class="layui-input email" >
                <hr class="hr15">
                <input value="发送" class="faEmail"  style="width:100%;display: none;" type="button"  >
                <hr class="hr15">
                <input name="password" lay-verify="required" placeholder="验证码"  type="password" class="layui-input">
                <hr class="hr15">
                <input value="验证" lay-submit lay-filter="login" style="width:100%;" type="button">
                <hr class="hr20" >
            </div>
            <form method="post" class="layui-form" action="" hidden>
                <input name="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input">
                <hr class="hr15">
                <input name="password2" lay-verify="required" placeholder="确认密码"  type="password" class="layui-input">
                <hr class="hr15">
                <input value="修改" lay-submit lay-filter="login" style="width:100%;" type="submit">
                <hr class="hr20" >
                <span style="color: red">${msg}</span>
            </form>
        </div>
        <div class="tab-pane fade " id="name2">
            <p></p>
            <form method="post" class="layui-form" action="">
                <input name="username" placeholder="用户名"  type="text" lay-verify="required" class="layui-input" >
                <hr class="hr15">
                <input name="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input" >
                <hr class="hr15">
                <input value="修改" lay-submit lay-filter="login" style="width:100%;" type="submit">
                <hr class="hr20" >
                <span style="color: red">${msg}</span>
            </form>
        </div>
    </div>
</div>
<!-- 底部结束 -->
</body>
<script src="/static/js/jquery-3.4.1.min.js"></script>
<script src='/static/js/bootstrap.min.js'></script>
<script>
    $('a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
    })

    $(function () {
        $(".email").blur(function () {
            var reg = new RegExp("^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$");
            var email = $.trim($('.email').val());
            if (email == "") {
                alert("请填写邮箱");
                $(".faEmail").hide();
                $('#J_release').removeClass('btn_disabled').prop('disabled', 0);
                return;
            } else if(!reg.test(email)) {
                alert("邮箱格式不正确，请重新输入！");
                $(".faEmail").hide();
                return;
            }else{
                $(".faEmail").fadeIn(500);
            }
        })
        $(".faEmail").click(function () {
            $(".faEmail").css("background-color","grey");
            $(".faEmail").attr("readonly","readonly");
            var sum=60;
            time = setInterval(function dao() {
                sum--;
                $(".faEmail").val(sum);
                if (sum==0){

                }
            }, 1000);
        })
    })
</script>
</html>