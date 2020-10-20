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
                    <%--<form class="layui-form layui-col-space5">
                        <div class="layui-inline layui-show-xs-block">
                        <input class="layui-input" autocomplete="off" placeholder="开始日" name="start" id="start">
                    </div>
                        <div class="layui-inline layui-show-xs-block">
                        <input class="layui-input" autocomplete="off" placeholder="截止日" name="end" id="end">
                    </div>
                        <div class="layui-inline layui-show-xs-block">
                            <input type="text" name="username" placeholder="请输入用户名" autocomplete="off"
                                   class="layui-input">
                        </div>
                        <div class="layui-inline layui-show-xs-block">
                            <button class="layui-btn" lay-submit="" lay-filter="sreach"><i
                                    class="layui-icon">&#xe615;</i></button>
                        </div>
                    </form>--%>
                </div>
                <div class="layui-card-header">
                    <%--<button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除
                    </button>
                    <button class="layui-btn" onclick="xadmin.open('添加用户','./member-add.html',600,400)"><i
                            class="layui-icon"></i>添加
                    </button>--%>
                </div>
                <form action="/tijiaozuoye" method="post">
                    <div class="layui-card-body layui-table-body layui-table-main">
                        <table class="layui-table layui-form">
                            <thead>
                            <tr>
                                <%--<th><input type="checkbox" lay-filter="checkall" name="" lay-skin="primary"></th>--%>
                                <th>作业标题</th>
                                <th>作业内容</th>
                                <th>提交时间</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td><input type="text" disabled="disabled" name="wortitle" value="${worktitle}"/></td>
                                <td><input name="wornei" type="file"></td>
                                <td><input type="text" name="wordate"/></td>
                                <td><input type="submit" value="提交"/></td>
                            </tr>
                            <%--<tr>
                                <td>
                                    <input type="checkbox" name="id" value="1" lay-skin="primary">
                                </td>
                                <td>1</td>
                                <td>小明</td>
                                <td>男</td>
                                <td>13000000000</td>
                                <td>北京市 海淀区</td>
                                <td class="td-status">
                                    <span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span></td>
                                <td class="td-manage">
                                    <a onclick="member_stop(this,'10001')" href="javascript:;" title="启用">
                                        <i class="layui-icon">&#xe601;</i>
                                    </a>
                                    <a title="编辑" onclick="xadmin.open('编辑','member-edit.html',600,400)"
                                       href="javascript:;">
                                        <i class="layui-icon">&#xe642;</i>
                                    </a>
                                    <a onclick="xadmin.open('修改密码','member-password.html',600,400)" title="修改密码"
                                       href="javascript:;">
                                        <i class="layui-icon">&#xe631;</i>
                                    </a>
                                    <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                                        <i class="layui-icon">&#xe640;</i>
                                    </a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="checkbox" name="id" value="2" lay-skin="primary">
                                </td>
                                <td>1</td>
                                <td>小明</td>
                                <td>男</td>
                                <td>13000000000</td>
                                <td>北京市 海淀区</td>
                                <td class="td-status">
                                    <span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span></td>
                                <td class="td-manage">
                                    <a onclick="member_stop(this,'10001')" href="javascript:;" title="启用">
                                        <i class="layui-icon">&#xe601;</i>
                                    </a>
                                    <a title="编辑" onclick="xadmin.open('编辑','member-edit.html',600,400)"
                                       href="javascript:;">
                                        <i class="layui-icon">&#xe642;</i>
                                    </a>
                                    <a onclick="xadmin.open('修改密码','member-password.html',600,400)" title="修改密码"
                                       href="javascript:;">
                                        <i class="layui-icon">&#xe631;</i>
                                    </a>
                                    <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                                        <i class="layui-icon">&#xe640;</i>
                                    </a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="checkbox" name="id" value="3" lay-skin="primary">
                                </td>
                                <td>1</td>
                                <td>小明</td>
                                <td>男</td>
                                <td>13000000000</td>
                                <td>北京市 海淀区</td>
                                <td class="td-status">
                                    <span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span></td>
                                <td class="td-manage">
                                    <a onclick="member_stop(this,'10001')" href="javascript:;" title="启用">
                                        <i class="layui-icon">&#xe601;</i>
                                    </a>
                                    <a title="编辑" onclick="xadmin.open('编辑','member-edit.html',600,400)"
                                       href="javascript:;">
                                        <i class="layui-icon">&#xe642;</i>
                                    </a>
                                    <a onclick="xadmin.open('修改密码','member-password.html',600,400)" title="修改密码"
                                       href="javascript:;">
                                        <i class="layui-icon">&#xe631;</i>
                                    </a>
                                    <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                                        <i class="layui-icon">&#xe640;</i>
                                    </a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="checkbox" name="id" value="4" lay-skin="primary">
                                </td>
                                <td>1</td>
                                <td>小明</td>
                                <td>男</td>
                                <td>13000000000</td>
                                <td>北京市 海淀区</td>
                                <td class="td-status">
                                    <span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span></td>
                                <td class="td-manage">
                                    <a onclick="member_stop(this,'10001')" href="javascript:;" title="启用">
                                        <i class="layui-icon">&#xe601;</i>
                                    </a>
                                    <a title="编辑" onclick="xadmin.open('编辑','member-edit.html',600,400)"
                                       href="javascript:;">
                                        <i class="layui-icon">&#xe642;</i>
                                    </a>
                                    <a onclick="xadmin.open('修改密码','member-password.html',600,400)" title="修改密码"
                                       href="javascript:;">
                                        <i class="layui-icon">&#xe631;</i>
                                    </a>
                                    <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                                        <i class="layui-icon">&#xe640;</i>
                                    </a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="checkbox" name="id" value="5" lay-skin="primary">
                                </td>
                                <td>1</td>
                                <td>小明</td>
                                <td>男</td>
                                <td>13000000000</td>
                                <td>北京市 海淀区</td>
                                <td class="td-status">
                                    <span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span></td>
                                <td class="td-manage">
                                    <a onclick="member_stop(this,'10001')" href="javascript:;" title="启用">
                                        <i class="layui-icon">&#xe601;</i>
                                    </a>
                                    <a title="编辑" onclick="xadmin.open('编辑','member-edit.html',600,400)"
                                       href="javascript:;">
                                        <i class="layui-icon">&#xe642;</i>
                                    </a>
                                    <a onclick="xadmin.open('修改密码','member-password.html',600,400)" title="修改密码"
                                       href="javascript:;">
                                        <i class="layui-icon">&#xe631;</i>
                                    </a>
                                    <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                                        <i class="layui-icon">&#xe640;</i>
                                    </a>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="checkbox" name="id" value="6" lay-skin="primary">
                                </td>
                                <td>1</td>
                                <td>小明</td>
                                <td>男</td>
                                <td>13000000000</td>
                                <td>北京市 海淀区</td>
                                <td class="td-status">
                                    <span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span></td>
                                <td class="td-manage">
                                    <a onclick="member_stop(this,'10001')" href="javascript:;" title="启用">
                                        <i class="layui-icon">&#xe601;</i>
                                    </a>
                                    <a title="编辑" onclick="xadmin.open('编辑','member-edit.html',600,400)"
                                       href="javascript:;">
                                        <i class="layui-icon">&#xe642;</i>
                                    </a>
                                    <a onclick="xadmin.open('修改密码','member-password.html',600,400)" title="修改密码"
                                       href="javascript:;">
                                        <i class="layui-icon">&#xe631;</i>
                                    </a>
                                    <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                                        <i class="layui-icon">&#xe640;</i>
                                    </a>
                                </td>
                            </tr>--%>
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
