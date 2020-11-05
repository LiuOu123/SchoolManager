<%--
  Created by IntelliJ IDEA.
  User: 86185
  Date: 2020.10.16
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.2</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="/static/css/font.css">
    <link rel="stylesheet" href="/static/css/xadmin.css">
    <script src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/static/js/xadmin.js"></script>
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="x-nav">
          <span class="layui-breadcrumb">
            <a href="">首页</a>
            <a href="">演示</a>
            <a>
              <cite>导航元素</cite></a>
          </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"
       onclick="location.reload()" title="刷新">
        <i class="layui-icon layui-icon-refresh" style="line-height:30px"></i></a>
</div>
<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-body ">
                </div>
                <div class="layui-card-header">
                </div>
                <form action="/tijiaozuoye" method="post" enctype="multipart/form-data">
                    <div class="layui-card-body layui-table-body layui-table-main">
                        <table class="layui-table layui-form">
                            <thead>
                            <tr>
                                <th>作业标题</th>
                                <th>作业内容</th>
                                <th>完成状态</th>
                                <th></th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td><input type="text" name="worktitle"/></td>
                                <td><input name="worimg1" type="file"></td>
                                <td>
                                    <select name="wornei" style="display: block">
                                        <option value="已完成">已完成</option>
                                        <option value="未完成">未完成</option>
                                        <option value="有异常">有异常</option>
                                    </select>
                                </td>
                                <td><input type="submit" value="提交"/></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </form>
                <div class="layui-card-body ">
                    <div class="page">
                        <div>
                            <a class="prev" href="">&lt;&lt;</a>
                            <a class="num" href="">1</a>
                            <span class="current">2</span>
                            <a class="num" href="">3</a>
                            <a class="num" href="">489</a>
                            <a class="next" href="">&gt;&gt;</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script>

</script>
</html>
