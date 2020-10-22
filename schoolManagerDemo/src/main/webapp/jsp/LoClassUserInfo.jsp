<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/10/19
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>查询学生</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="/static/css/font.css">
    <link rel="stylesheet" href="/static/css/xadmin.css">
    <script src="/static/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/static/js/xadmin.js"></script>
    <script type="text/javascript" src="/static/js/jquery-3.4.1.min.js"></script>
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
                    <form class="layui-form layui-col-space5">
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
                    </form>
                </div>
                <div class="layui-card-header">
                    <%--<button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除
                    </button>--%>
                    <button class="layui-btn" onclick="xadmin.open('发布作业','/jsp/LoAddHomeWork.jsp',600,400)"><i
                            class="layui-icon"></i>发布作业
                    </button>
                </div>
                <div class="layui-card-body ">
                    <table class="layui-table layui-form" id="mytable">
                        <thead>
                        <tr>
                            <%--<th>
                                <input type="checkbox" name="" lay-skin="primary">
                            </th>--%>
                            <th>班级</th>
                            <th>标题</th>
                            <th>作业内容</th>
                            <th>发布时间</th>
                            <th>操作</th>
                            <%--<th>加入时间</th>
                            <th>状态</th>
                            <th>操作</th>--%>
                        </thead>
                        <tbody>
                        <%-- <tr>
                             <td>
                                 <input type="checkbox" name="" lay-skin="primary">
                             </td>
                             <td>1</td>
                             <td>admin</td>
                             <td>18925139194</td>
                             <td>113664000@qq.com</td>
                             &lt;%&ndash;<td>超级管理员</td>
                             <td>2017-01-01 11:11:42</td>&ndash;%&gt;
                             <td class="td-status">
                                 <span class="layui-btn layui-btn-danger layui-btn-mini">删除</span></td>
                             &lt;%&ndash;<td class="td-manage">
                                 <a onclick="member_stop(this,'10001')" href="javascript:;"  title="启用">
                                     <i class="layui-icon">&#xe601;</i>
                                 </a>
                                 <a title="编辑"  onclick="xadmin.open('编辑','admin-edit.html')" href="javascript:;">
                                     <i class="layui-icon">&#xe642;</i>
                                 </a>
                                 <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                                     <i class="layui-icon">&#xe640;</i>
                                 </a>
                             </td>&ndash;%&gt;
                         </tr>--%>
                        </tbody>
                    </table>
                </div>
                <%-- <div class="layui-card-body ">
                     <div class="page">
                         <div>
                             <a class="prev" href="javascript:void(0)" onclick="shang()">&lt;&lt;</a>
                             <a class="num" href="">首页</a>
                             <a class="num" href="">尾页</a>
                             <a class="next" href="javascript:void(0)" onclick="wei()">&gt;&gt;</a>
                         </div>
                     </div>
                 </div>--%>
                <center>
                    <%--<table class="table" width="300" border="1" align="center">
                        <tr align="center">
                            <td>
                                <a href="javascript:void(0)" onclick="shou()">首页</a>
                            </td>
                            <td><a href="javascript:void(0)" onclick="shang()">上一页</a></td>
                            <td class="ye">1/1</td>
                            <td><a href="javascript:void(0)" onclick="xia()">下一页</a></td>
                            <td><a href="javascript:void(0)" onclick="wei()">尾页</a></td>
                        </tr>
                    </table>--%>
                    <div class="layui-card-body ">
                        <div class="page">
                            <div>
                                <a class="prev current" href="javascript:void(0)" onclick="shang()">&lt;&lt;</a>
                                <a class="num" href="javascript:void(0)" onclick="shou()">首页</a>
                                <span class="ye current">1/1</span>
                                <a class="num" href="javascript:void(0)" onclick="wei()">尾页</a>
                                <a class="next current" href="javascript:void(0)" onclick="xia()">&gt;&gt;</a>
                            </div>
                        </div>
                    </div>
                </center>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    var pageInfo;
    var pageNum = 1;
    var pageSize = 6;

    function shou() {
        if (pageInfo.isFirstPage == false) {
            pageNum = 1;
            aj();
        }
    }

    function shang() {
        if (pageInfo.hasPreviousPage) {
            pageNum = pageInfo.prePage;
            aj();
        }
    }

    function xia() {
        if (pageInfo.hasNextPage) {
            pageNum = pageInfo.nextPage;
            aj();
        }
    }

    function wei() {
        if (pageInfo.isLastPage == false) {
            pageNum = pageInfo.lastPage;
            aj();
        }
    }

    function aj() {
        $(".bian").remove();
        mo = $(".title").val();
        var json = {
            pageNum: pageNum,
            pageSize: pageSize,
        }
        $.ajax({
            url: "/teacherChaHomeWork",
            type: "POST",
            data: json,
            dataType: "json",
            success: function (result) {
                $(".bian").remove();
                $(".ye").text(result.data.pageNum + "/" + result.data.pages);
                pageInfo = result.data;
                $.each(result.data.list, function (index, z) {
                    var tr = $("<tr class='bian'>\n" +
                        "                            <td onclick=\"xadmin.open('查看作业提交情况','/jsp/LoTeacherChaHomeWork.jsp',800,600)\">" + z.grade.gname + "</td>\n" +
                        "                            <td>" + z.reltitle + "</td>\n" +
                        "                            <td>" + z.relnei + "</td>\n" +
                        "                            <td>" + date(z.reldate) + "</td>\n" +
                        "                            <%--<td>超级管理员</td>\n"+
"                            <td>2017-01-01 11:11:42</td>--%>\n" +
                        "                            <td class=\"td-status\">\n" +
                        "                                <span onclick='tiao(" + z.rid + ")' class=\"layui-btn layui-btn-container layui-btn-mini\">查询</span>" +
                        "<span class=\"layui-btn layui-btn-danger layui-btn-mini\">删除</span>" +
                        "</td>\n" +

                        "                            <%--<td class=\"td-manage\">\n"+
"                                <a onclick=\"member_stop(this,'10001')\" href=\"javascript:;\"  title=\"启用\">\n"+
"                                    <i class=\"layui-icon\">&#xe601;</i>\n"+
"                                </a>\n"+
"                                <a title=\"编辑\"  onclick=\"xadmin.open('编辑','admin-edit.html')\" href=\"javascript:;\">\n"+
"                                    <i class=\"layui-icon\">&#xe642;</i>\n"+
"                                </a>\n"+
"                                <a title=\"删除\" onclick=\"member_del(this,'要删除的id')\" href=\"javascript:;\">\n"+
"                                    <i class=\"layui-icon\">&#xe640;</i>\n"+
"                                </a>\n"+
"                            </td>--%>\n" +
                        "                        </tr>")
                    $("#mytable").append(tr)
                })
            }
        })
    }

    function tiao(id) {
        //alert(id)
        $.post("/chuanRelid", {relid: id}, function (result) {
            xadmin.open('查看作业提交情况', '/jsp/LoTeacherChaHomeWork.jsp', 1000, 600)
        })

    }

    $(function () {
        aj()
    })

    function date(timei) {
        var weekDay = ["周日", "周一", "周二", "周三", "周四", "周五", "周六"];
        var myDate = new Date(Date.parse(timei));
        var myDay = new Date().getDay();
        var times = timei.substring(0, 10);
        var bo = false;
        for (var i = myDay - 1; i >= 0; i--) {
            var day1 = new Date();
            day1.setTime(day1.getTime() - 24 * 60 * 60 * 1000 * i);
            var s1 = day1.getFullYear() + "-" + (day1.getMonth() + 1) + "-" + day1.getDate();
            if (s1 == times) {
                bo = true;
                break;
            }
        }
        var xingQi;
        if (bo == false) {
            xingQi = timei.substring(0, 10);
        } else if (new Date().getDate() == new Date(timei).getDate()) {
            var hours = parseInt(new Date(timei).getHours()) + 1;
            if (hours > 0 && hours <= 6) {
                xingQi = "凌晨" + timei.substring(11, 16);
                ;
            } else if (hours > 6 && hours <= 10) {
                xingQi = "早上" + timei.substring(11, 16);
                ;
            } else if (hours > 10 && hours <= 14) {
                xingQi = "中午" + timei.substring(11, 16);
                ;
            } else if (hours > 14 && hours <= 19) {
                xingQi = "下午" + timei.substring(11, 16);
                ;
            } else if (hours > 19 && hours <= 23) {
                xingQi = "晚上" + timei.substring(11, 16);
                ;
            }
        } else if (parseInt(new Date().getDate()) - 1 == new Date(timei).getDate()) {
            xingQi = "昨天";
        } else if (bo) {
            xingQi = weekDay[myDate.getDay()];
        }
        return xingQi;
    }
</script>
<script>
    layui.use(['laydate', 'form'], function () {
        var laydate = layui.laydate;
        var form = layui.form;

        //执行一个laydate实例
        laydate.render({
            elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
            elem: '#end' //指定元素
        });
    });

    /*用户-停用*/
    function member_stop(obj, id) {
        layer.confirm('确认要停用吗？', function (index) {

            if ($(obj).attr('title') == '启用') {

                //发异步把用户状态进行更改
                $(obj).attr('title', '停用')
                $(obj).find('i').html('&#xe62f;');

                $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
                layer.msg('已停用!', {icon: 5, time: 1000});

            } else {
                $(obj).attr('title', '启用')
                $(obj).find('i').html('&#xe601;');

                $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
                layer.msg('已启用!', {icon: 5, time: 1000});
            }

        });
    }

    /*用户-删除*/
    function member_del(obj, id) {
        layer.confirm('确认要删除吗？', function (index) {
            //发异步删除数据
            $(obj).parents("tr").remove();
            layer.msg('已删除!', {icon: 1, time: 1000});
        });
    }


    function delAll(argument) {

        var data = tableCheck.getData();

        layer.confirm('确认要删除吗？' + data, function (index) {
            //捉到所有被选中的，发异步进行删除
            layer.msg('删除成功', {icon: 1});
            $(".layui-form-checked").not('.header').parents('tr').remove();
        });
    }
</script>
<script>var _hmt = _hmt || [];
(function () {
    var hm = document.createElement("script");
    hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();</script>
</html>