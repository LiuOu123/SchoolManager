<%--
  Created by IntelliJ IDEA.
  User:吕东
  Date: 2020/11/4
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.2</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="../static/css/font.css">
    <link rel="stylesheet" href="../static/css/xadmin.css">
    <script src="../static/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../static/js/xadmin.js"></script>
    <script type="text/javascript" src="../static/js/jquery.min.js"></script>
</head>

<body>
<div class="x-nav">
            <span class="layui-breadcrumb">
                <a href="">首页</a>
                <a href="">演示</a>
                <a>
                    <cite>导航元素</cite></a>
            </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" onclick="location.reload()" title="刷新">
        <i class="layui-icon layui-icon-refresh" style="line-height:30px"></i>
    </a>
</div>
<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-body ">
                    <form class="layui-form layui-col-space5">

                        <div class="layui-input-inline layui-show-xs-block">
                        </div>
                        <div class="layui-input-inline layui-show-xs-block">
                            <button class="layui-btn" lay-submit="" lay-filter="sreach">
                                <i class="layui-icon">&#xe615;</i></button>
                        </div>
                    </form>
                </div>
                <div class="layui-card-header">
                    <button class="layui-btn" onclick="xadmin.open('添加试题','/jsp/lvaddkaoshi.jsp',1000,600)">
                        <i class="layui-icon"></i>添加</button></div>
                <div class="layui-card-body ">
                    <table class="layui-table layui-form">
                        <thead>
                        <tr>
                            <th>试题编号</th>
                            <th>试题名称</th>
                            <th>试题类型</th>
                            <th>阅卷类型</th>
                            <th>试题总分</th>
                            <th>创建时间</th>
                            <th>开始答题时间</th>
                            <th>结束答题时间</th>
                            <th>操作</th></tr>
                        </thead>
                        <tbody class="shiti">

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script>
    $(function () {
        fenye();
    })
    var pageIndex=1;
    var pageSize=5;

    function fenye() {
        var json={
            pageIndex:pageIndex,
            pageSize:pageSize
        }
        $.post("/lvSelectPaper",json,function (data) {
            console.log(data.data.list)
            $.each(data.data.list,function (i,v) {
                var tr=$(" <tr>\n" +
                    "                            <td>"+v.paperid+"</td>\n" +
                    "                            <td>"+v.papername+"</td>\n" +
                    "                            <td>"+v.papertype+"</td>\n" +
                    "                            <td>"+v.method+"</td>\n" +
                    "                            <td>"+v.remarks+"</td>\n" +
                    "                            <td>"+v.createTime.substring(0,10)+"</td>\n" +
                    "                            <td>"+v.startTime+"</td>\n" +
                    "                            <td>"+v.stopTime+"</td>\n" +
                    "                            <td class=\"td-manage\">\n" +
                    "                                <a title=\"查看\" onclick=\"xadmin.open('编辑','order-view.html')\" href=\"javascript:;\">\n" +
                    "                                    <i class=\"layui-icon\">&#xe63c;</i></a>\n" +
                    "                            </td>\n" +
                    "                        </tr>\n")
                $(".shiti").append(tr);

            })
        },"json")
    }










    layui.use(['laydate', 'form'],
    function() {
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
            elem: '#end' //指定元素
        });
    });


</script>

</html>
