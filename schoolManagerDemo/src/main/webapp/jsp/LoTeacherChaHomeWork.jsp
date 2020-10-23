<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/10/21
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="x-admin-sm">

<head>
    <meta charset="UTF-8">
    <title>老师查询作业</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="/static/css/font.css">
    <link rel="stylesheet" href="/static/css/xadmin.css">
    <script type="text/javascript" src="/static/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/static/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="/static/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]--></head>

<body>
<table class="layui-table" id="mytable">
    <tr style='text-align: center'>
        <td>班级</td>
        <td>用户</td>
        <td>标题</td>
        <td>内容</td>
        <td>提交时间</td>
        <td>审核状态</td>
        <td>操作</td>
    </tr>
</table>
<script type="text/javascript">
    $(function () {
        chushi();
    })

    function shenhe(id) {
        var flag = confirm("确定要审核该作业吗？")
        if (flag) {
            $.post("/teacherShenChaHomeWork", {id: id}, function (result) {
                if (result.status == "true") {
                    alert("审核成功")
                    chushi()
                } else {
                    alert("审核失败")
                }
            }, "json")
        }
    }

    function chushi() {
        $.post("/chaHomeWorkXiang", function (result) {
            $(".xun").remove()
            $.each(result.data, function (index, z) {
                var tr = $("<tr class='xun' style='text-align: center'>\n" +
                    "        <td>" + z.grade.gname + "</td>\n" +
                    "        <td>" + z.userInfo.nickname + "</td>\n" +
                    "        <td>" + z.wortitle + "</td>\n" +
                    "        <td>" + z.wornei + "</td>\n" +
                    "        <td>" + date(z.wordate) + "</td>\n" +
                    "        <td id='" + z.wid + "'>" + z.isverify + "</td>\n" +
                    "        <td><span onclick='shenhe(" + z.wid + ")' class=\"layui-btn layui-btn-container layui-btn-mini\">审核</span>\n" +
                    "        <span onclick='tiao(" + z.wid + ")' class=\"layui-btn layui-btn-primary layui-btn-mini\">回复</span></td>\n" +
                    "    </tr>");
                $("#mytable").append(tr);
                if (z.isverify == 0) {
                    $("#" + z.wid + "").text("未审核")
                } else {
                    $("#" + z.wid + "").text("已审核")
                }
            })
        }, "json")
    }

    function tiao(wid) {
        $.post("/chuanWid", {wid: wid}, function (result) {
            xadmin.open('发送回复', '/jsp/LoTeacherAddHuiFU.jsp', 600, 400)
        })
    }

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

<script>var _hmt = _hmt || [];
(function () {
    var hm = document.createElement("script");
    hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();</script>
</body>

</html>