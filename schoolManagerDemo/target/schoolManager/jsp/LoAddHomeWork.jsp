<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/10/19
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html class="x-admin-sm">

<head>
    <meta charset="UTF-8">
    <title>发布作业</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="/static/css/font.css">
    <link rel="stylesheet" href="/static/css/xadmin.css">
    <link rel="stylesheet" href="/static/css/bootstrap.css">
    <script type="text/javascript" src="/static/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/static/js/xadmin.js"></script>
    <script type="text/javascript" src="/static/js/jquery-3.4.1.min.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="layui-fluid">
    <div class="layui-row">
            <div class="">
                <label  class="layui-form-label">
                    <span class="x-red">*</span>
                    班级
                </label>
                <div class="layui-input-inline">
                    <%--<input type="text" id="username" name="username" required="" lay-verify="required"
                           autocomplete="off" class="layui-input">--%>
                        <select class="form-control"  id="banji" name="banji">
                            <option id="username" value="0">---请选择班级---</option>
                        </select>
                </div>
                <%--<div class="layui-form-mid layui-word-aux">
                    <span class="x-red">*</span>将会成为您唯一的登入名
                </div>--%>
            </div>
            <div class="layui-form-item">
                <label for="biaoti" class="layui-form-label">
                    <span class="x-red">*</span>标题
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="biaoti" name="biaoti" required="" lay-verify="phone"
                           autocomplete="off" class="layui-input">
                </div>
                <%--<div class="layui-form-mid layui-word-aux">
                    <span class="x-red">*</span>将会成为您唯一的登入名
                </div>--%>
            </div>
            <div class="layui-form-item">
                <label for="neirong" class="layui-form-label">
                    <span class="x-red">*</span>内容
                </label>
                <div class="layui-input-inline">
                    <%--<input type="text" id="L_email" name="email" required="" lay-verify="email"
                           autocomplete="off" class="layui-input">--%>
                    <textarea name="neirong" id="neirong" cols="70" rows="10"></textarea>
                </div>
                <%--<div class="layui-form-mid layui-word-aux">
                    <span class="x-red">*</span>
                </div>--%>
            </div>
           <%-- <div class="layui-form-item">
                <label class="layui-form-label"><span class="x-red">*</span>角色</label>
                <div class="layui-input-block">
                    <input type="checkbox" name="like1[write]" lay-skin="primary" title="超级管理员" checked="">
                    <input type="checkbox" name="like1[read]" lay-skin="primary" title="编辑人员">
                    <input type="checkbox" name="like1[write]" lay-skin="primary" title="宣传人员" checked="">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="L_pass" class="layui-form-label">
                    <span class="x-red">*</span>密码
                </label>
                <div class="layui-input-inline">
                    <input type="password" id="L_pass" name="pass" required="" lay-verify="pass"
                           autocomplete="off" class="layui-input">
                </div>
                <div class="layui-form-mid layui-word-aux">
                    6到16个字符
                </div>
            </div>
            <div class="layui-form-item">
                <label for="L_repass" class="layui-form-label">
                    <span class="x-red">*</span>确认密码
                </label>
                <div class="layui-input-inline">
                    <input type="password" id="L_repass" name="repass" required="" lay-verify="repass"
                           autocomplete="off" class="layui-input">
                </div>
            </div>--%>
            <div class="layui-form-item">
                <label for="<%--L_repass--%>" class="layui-form-label">
                </label>
                <button  class="layui-btn" id="add" onclick="add()">
                    增加
                </button>
            </div>

    </div>
</div>
<script type="text/javascript">
    $(function () {
        xiala();
    })
    function xiala(){
            $.post("/addHomeWork",function (result) {
                $.each(result.data,function (index,z) {
                    console.log(z)
                    var xuanxiang=$("<option value='"+z.gid+"'>"+z.gname+"</option>");
                    $("#banji").append(xuanxiang);
                })
            },"json")
    }
    function add() {
         var banji=$("#banji").val();
         var biaoti=$("#biaoti").val();
         var neirong=$("#neirong").val();
         /*alert(banji)
        alert(biaoti)
        alert(neirong)*/
        var json={
            gradeid:banji,
            reltitle:biaoti,
            relnei:neirong
        }
        $.post("/addHomeWorkOver",json,function (result) {
            if(result.status=="true"){
                alert("添加成功")
            }else{
                alert("添加失败")
            }
        },"json")
    }
</script>
<script>layui.use(['form', 'layer'],
    function() {
        $ = layui.jquery;
        var form = layui.form,
            layer = layui.layer;

        //自定义验证规则
        form.verify({
            nikename: function(value) {
                if (value.length < 5) {
                    return '昵称至少得5个字符啊';
                }
            },
            pass: [/(.+){6,12}$/, '密码必须6到12位'],
            repass: function(value) {
                if ($('#L_pass').val() != $('#L_repass').val()) {
                    return '两次密码不一致';
                }
            }
        });

        //监听提交
        form.on('submit(add)',
            function(data) {
                console.log(data);
                //发异步，把数据提交给php
                layer.alert("增加成功", {
                        icon: 6
                    },
                    function() {
                        //关闭当前frame
                        xadmin.close();

                        // 可以对父窗口进行刷新 
                        xadmin.father_reload();
                    });
                return false;
            });

    });</script>
<script>var _hmt = _hmt || []; (function() {
    var hm = document.createElement("script");
    hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();</script>
</body>

</html>
