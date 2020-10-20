<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86131
  Date: 2020/9/11
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="/static/css/font.css">
    <link rel="stylesheet" href="/static/css/xadmin.css">
    <script src="/static/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/static/js/xadmin.js"></script>
    <script type="text/javascript" src="/static/js/jquery.min.js"></script>
</head>
<body>
<div class="layui-card-body ">
    <table class="layui-table layui-form table-a">
        <tr>
            <th>ID</th>
            <th>班级名称</th>
            <th>总人数</th>
            <th>操作</th>
    </table>
</div>
</body>
</html>
<script>
    $(document).ready(function () {
        $.ajax({
            type:"GET",
            url:"/hshsel2",
            dataType:"json",
            success:function (data) {
                $.each(data.selsum,function (i,v) {
                    console.log(v)
                      var $tr=$("<tr><td>"+(i+1)+"</td><td hidden>"+v.gradeid+"</td><td>"+v.gname+"</td><td>"+v.personsum+"</td><td><button class='layui-btn layui-btn-normal layui-btn-mini cha '>查询</button></td></tr>");
                      $(".table-a").append($tr);
                })
                $(".cha").click(function () {
                    var id = $(this).parent().prev().prev().prev().text();
                    alert(id)
                    location.href="/chuangid?id="+id+"";
                })
            }
        })
    })
</script>