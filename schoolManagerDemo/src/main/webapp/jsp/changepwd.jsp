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
    <a style="margin-left: 360px;margin-top: -30px"  href="javascript:history.back()" >X</a>
    <div class="message">找回密码</div>

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
                <input name="yan" lay-verify="required" placeholder="验证码"  type="text" class="layui-input yan">
                <hr class="hr15">
                <input value="验证" class="yanzheng"  lay-submit lay-filter="login" style="width:100%;" type="button">
                <hr class="hr20" >
            </div>
            <div class="mi" hidden>
                <input name="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input pwd">
                <hr class="hr15">
                <input name="password2" lay-verify="required" placeholder="确认密码"  type="password" class="layui-input pwd2">
                <hr class="hr15">
                <input value="修改" lay-submit lay-filter="login" style="width:100%;" type="button" class="emailXiu">
                <hr class="hr20" >
                <span style="color: red">${msg}</span>
            </div>
        </div>
        <div class="tab-pane fade " id="name2">
            <p></p>
            <div class="shouji">
                <input name="username" placeholder="手机号"  type="text" lay-verify="required" class="layui-input phone" >
                <hr class="hr15">
                <input value="发送" class="faPhone"  style="width:100%;display: none;" type="button"  >
                <hr class="hr15">
                <input name="yanp" lay-verify="required" placeholder="验证码"  type="text" class="layui-input yanp">
                <hr class="hr15">
                <input value="验证" class="yanzhengp"  lay-submit lay-filter="login" style="width:100%;" type="button">
                <hr class="hr20" >
            </div>
            <div class="mima" hidden>
                <input name="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input pwdp">
                <hr class="hr15">
                <input name="password2" lay-verify="required" placeholder="确认密码"  type="password" class="layui-input pwddp">
                <hr class="hr15">
                <input value="修改" lay-submit lay-filter="login" style="width:100%;" type="button" class="phoneXiu">
                <hr class="hr20" >
                <span style="color: red">${msg}</span>
            </div>
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
        var yanzheng="";
        $(".faEmail").click(function () {
            $(".faEmail").css("background-color","grey");
            $(".faEmail").attr("readonly","readonly");
            var sum=60;
            var e=$(".email").val();
            $.post("/toEamil",{emails:e},function (data) {
                console.log(data)
                yanzheng=data.yan;
            },"json")
            time = setInterval(function dao() {
                sum--;
                $(".faEmail").val(sum);
                if (sum==0){
                    yanzheng="已过期";
                    clearTimeout(time);
                    $(".faEmail").css("background-color","#189F92");
                    $(".faEmail").removeAttr("readonly");
                    $(".faEmail").val("发送");
                }
            }, 1000);
        })
        $(".yanzheng").click(function () {
            var e=$(".email").val();
            var yan=$(".yan").val();
            if (e==""){
                alert("请填写邮箱");
                return;
            }
            if (yan==""){
                alert("请填写验证码");
                return;
            }
            if (yanzheng==""){
                alert("请验证邮箱");
                return;
            }
            if(yanzheng=="已过期"){
                alert("验证码已过期请重新验证");
                return;
            }
            if (yanzheng!=yan){
                alert("请填写正确的验证码");
                return;
            }
            $(".youxiang").hide();
            $(".mi").show();
            alert("验证通过");
        })
        $(".emailXiu").click(function () {
            var e=$(".email").val();
            var pwd=$(".pwd").val();
            var pwd2=$(".pwd2").val();
            if (pwd==""){
                alert("密码不能为空");
                return;
            }
            if (pwd2==""){
                alert("确认密码不能为空");
                return;
            }
            if (pwd2!=pwd){
                alert("两次密码不一致");
                return;
            }
            $.post("/lvSelectByEamilAid",{e:e,pwd:pwd},function (data) {
                if (data.success=="true"){
                    alert("修改密码成功");
                    location.href="/";
                }else{
                    alert("修改密码失败");
                }
            },"json")
        })
        ///手机
        $(".phone").blur(function () {
            var reg = new RegExp("^1[3|4|5|7|8][0-9]{9}$");
            var phone = $.trim($('.phone').val());
            if (phone == "") {
                alert("请填写手机号");
                $(".faPhone").hide();
                $('#J_release').removeClass('btn_disabled').prop('disabled', 0);
                return;
            } else if(!reg.test(phone)) {
                alert("手机号格式不正确，请重新输入！");
                $(".faPhone").hide();
                return;
            }else{
                $(".faPhone").fadeIn(500);
            }
        })
        var yanzhengp="";
        $(".faPhone").click(function () {
            $(".faPhone").css("background-color","grey");
            $(".faPhone").attr("readonly","readonly");
            var sum=30;
            var e=$(".phone").val();
            $.post("/toPhone",{emails:e},function (data) {
                console.log(data)
                yanzhengp=data.yan;
            },"json")
            time = setInterval(function dao() {
                sum--;
                $(".faPhone").val(sum);
                if (sum==0){
                    yanzhengp="已过期";
                    clearTimeout(time);
                    $(".faPhone").css("background-color","#189F92");
                    $(".faPhone").removeAttr("readonly");
                    $(".faPhone").val("发送");
                }
            }, 1000);
        })
        $(".yanzhengp").click(function () {
            var e=$(".phone").val();
            var yan=$(".yanp").val();
            if (e==""){
                alert("请填写手机号");
                return;
            }
            if (yan==""){
                alert("请填写验证码");
                return;
            }
            if (yanzhengp==""){
                alert("请验证手机号");
                return;
            }
            if(yanzheng=="已过期"){
                alert("验证码已过期请重新验证");
                return;
            }
            if (yanzhengp!=yan){
                alert("请填写正确的验证码");
                return;
            }
            $(".shouji").hide();
            $(".mima").show();
            alert("验证通过");
        })
        $(".phoneXiu").click(function () {
            var e=$(".phone").val();
            var pwd=$(".pwdp").val();
            var pwd2=$(".pwddp").val();
            if (pwd==""){
                alert("密码不能为空");
                return;
            }
            if (pwd2==""){
                alert("确认密码不能为空");
                return;
            }
            if (pwd2!=pwd){
                alert("两次密码不一致");
                return;
            }
            $.post("/lvSelectByPhoneAid",{e:e,pwd:pwd},function (data) {
                if (data.success=="true"){
                    alert("修改密码成功");
                    location.href="/";
                }else{
                    alert("修改密码失败");
                }
            },"json")
        })
    })
</script>
</html>