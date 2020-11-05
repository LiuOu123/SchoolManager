<%--
  Created by IntelliJ IDEA.
  User:吕东
  Date: 2020/11/4
  Time: 15:28
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
    <link rel="stylesheet" href="../static/css/font.css">
    <link rel="stylesheet" href="../static/css/xadmin.css">
    <script src="../static/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../static/js/xadmin.js"></script>
    <script type="text/javascript" src="../static/js/jquery.min.js"></script>
</head>

<body>

<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-body " style="padding: 10px 35px;">
                    <form class="layui-form layui-col-space5" method="get" action="/jsp/lvkaoshi.jsp">
                        试题名称:
                        <div class="layui-input-inline layui-show-xs-block">
                            <input class="layui-input" placeholder="试题名称" name="papername">
                        </div>
                        试题类型:
                        <div class="layui-input-inline layui-show-xs-block">
                            <select name="papertype">
                                <option value="Java">Java</option>
                                <option value="Linux">Linux</option>
                                <option value="SpringBoot">SpringBoot</option>
                            </select>
                        </div>
                        阅卷类型:
                        <div class="layui-input-inline layui-show-xs-block">
                            <select name="method">
                                <option value="自动阅卷">自动阅卷</option>
                                <option value="手动阅卷">手动阅卷</option>
                            </select>
                        </div>
                        <p></p>
                        <p></p>
                        <p></p>
                        试题数量:
                        <div class="layui-input-inline layui-show-xs-block">
                            <input class="layui-input num " placeholder="试题数量">
                        </div>
                        试题分数:
                        <div class="layui-input-inline layui-show-xs-block">
                            <input class="layui-input escore" placeholder="试题分数">
                        </div>
                        试题类型:
                        <div class="layui-input-inline layui-show-xs-block">
                            <select name="etype" class="type">
                                <option value="1">选择题</option>
                                <option value="2">判断题</option>
                            </select>
                        </div>
                        <button class="layui-btn shen" type="button">
                            生成
                        </button>
                        <ul class="ti">

                        </ul>

                        试题总分:
                        <div class="layui-input-inline layui-show-xs-block">
                            <input class="layui-input number" placeholder="试题总分" name="remarks">
                        </div>
                        开始考试日期:
                        <div class="layui-input-inline layui-show-xs-block">
                            <input class="layui-input" placeholder="开始考试日期" name="start_time" type="datetime-local">
                        </div>
                        结束考试日期:
                        <div class="layui-input-inline layui-show-xs-block">
                            <input class="layui-input" placeholder="结束考试日期" name="stop_time" type="datetime-local" >
                        </div>

                        <div class="layui-card-header">
                            <button class="layui-btn" type="submit">
                                <i class="layui-icon"></i>添加
                            </button>
                        </div>
                    </form>
                </div>

            </div>
        </div>
    </div>
</div>
</body>
<script>
    $(function () {
        var tihao = 1;
        var numscoer = 0;
        $(".shen").click(function () {
            var num = $(".num").val();
            var ty = $(".type").val();
            var score = $(".escore").val();
            numscoer = numscoer+num * score;
            $(".number").val(numscoer);
            if (ty == 1) {
                for (var i = 0; i < num; i++) {
                    var li = $("    <li style=\"background-color:gainsboro; padding: 20px;margin-bottom: 20px\">\n" +
                        "                                <div class=\"xuanf\">\n" +
                        "                                    题号:" + tihao + "\n" +
                        "                                    <div class=\"layui-input-inline layui-show-xs-block\">\n" +
                        "                                        <input class=\"layui-input\" placeholder=\"题目\" name=\"ename\">\n" +
                        "                                    </div>\n" +
                        "\n" + "                                    题分:\n" +
                        "                                    <div class=\"layui-input-inline layui-show-xs-block\">\n" +
                        "                                        <input class=\"layui-input\" placeholder=\"题分\" name=\"escore\" value='" + score + "' readonly>\n" +
                        "                                    </div>\n" +
                        "\n" +
                        "                                    <div style=\"margin-top: 10px;margin-left: 50px\">\n" +
                        "                                        A选项:\n" +
                        "                                        <div class=\"layui-input-inline layui-show-xs-block\">\n" +
                        "                                            <input class=\"layui-input\" placeholder=\"A选项\" name=\"ea\">\n" +
                        "                                        </div>\n" +
                        "                                    </div>\n" +
                        "                                    <div style=\"margin-top: 10px;margin-left: 50px\">\n" +
                        "                                        B选项:\n" +
                        "                                        <div class=\"layui-input-inline layui-show-xs-block\">\n" +
                        "                                            <input class=\"layui-input\" placeholder=\"B选项\" name=\"eb\">\n" +
                        "                                        </div>\n" +
                        "                                    </div>\n" +
                        "                                    <div style=\"margin-top: 10px;margin-left: 50px\">\n" +
                        "                                        C选项:\n" +
                        "                                        <div class=\"layui-input-inline layui-show-xs-block\">\n" +
                        "                                            <input class=\"layui-input\" placeholder=\"C选项\" name=\"ec\">\n" +
                        "                                        </div>\n" +
                        "                                    </div>\n" +
                        "                                    <div style=\"margin-top: 10px;margin-left: 50px\">\n" +
                        "                                        D选项:\n" +
                        "                                        <div class=\"layui-input-inline layui-show-xs-block\">\n" +
                        "                                            <input class=\"layui-input\" placeholder=\"D选项\" name=\"ed\">\n" +
                        "                                        </div>\n" +
                        "                                    </div>\n" +
                        "                                </div>\n" +
                        "                                <div  style=\"margin-top: 10px;\">\n" +
                        "                                    答案:\n" +
                        "                                    <div class=\"layui-input-inline layui-show-xs-block\">\n" +
                        "                                        <input class=\"layui-input\" placeholder=\"答案\" name=\"ekeys\">\n" +
                        "                                    </div>\n" +
                        "                                    解析:\n" +
                        "                                    <div class=\"layui-input-inline layui-show-xs-block\">\n" +
                        "                                        <input class=\"layui-input\" placeholder=\"解析\" name=\"ehints\">\n" +
                        "                                    </div>\n" +
                        "                                </div>\n" +
                        "                                </table>\n" +
                        "                            </li>");
                    $(".ti").append(li);
                    tihao += 1;
                }
            } else {
                for (var i = 0; i < num; i++) {
                    var li = $("    <li style=\"background-color:gainsboro; padding: 20px;margin-bottom: 20px\">\n" +
                        "                                <div class=\"xuanf\">\n" +
                        "                                    题号:" + tihao + "\n" +
                        "                                    <div class=\"layui-input-inline layui-show-xs-block\">\n" +
                        "                                        <input class=\"layui-input\" placeholder=\"题目\" name=\"ename\">\n" +
                        "                                    </div>\n" +
                        "\n" + "                                    题分:\n" +
                        "                                    <div class=\"layui-input-inline layui-show-xs-block\">\n" +
                        "                                        <input class=\"layui-input\" placeholder=\"题分\" name=\"escore\" value='" + score + "' readonly>\n" +
                        "                                    </div>\n" +
                        "\n" +
                        "                                    <div hidden style=\"margin-top: 10px;margin-left: 50px\">\n" +
                        "                                        正确:\n" +
                        "                                        <div class=\"layui-input-inline layui-show-xs-block\">\n" +
                        "                                            <input class=\"layui-input\" value='正确' name=\"ea\">\n" +
                        "                                        </div>\n" +
                        "                                    </div>\n" +
                        "                                    <div hidden style=\"margin-top: 10px;margin-left: 50px\">\n" +
                        "                                        x:\n" +
                        "                                        <div class=\"layui-input-inline layui-show-xs-block\">\n" +
                        "                                            <input class=\"layui-input\" value='错误' name=\"eb\">\n" +
                        "                                        </div>\n" +
                        "                                    </div>\n" +
                        "                                <div  style=\"margin-top: 10px;\">\n" +
                        "                                    答案&nbsp&nbsp:\n" +
                        "                                    <div class=\"layui-input-inline layui-show-xs-block\">\n" +
                        "                                        <input class=\"layui-input\" placeholder=\"答案\" name=\"ekeys\">\n" +
                        "                                    </div>\n" +
                        "                                    解析:\n" +
                        "                                    <div class=\"layui-input-inline layui-show-xs-block\">\n" +
                        "                                        <input class=\"layui-input\" placeholder=\"解析\" name=\"ehints\">\n" +
                        "                                    </div>\n" +
                        "                                </div>\n" +
                        "                                </table>\n" +
                        "                            </li>");
                    $(".ti").append(li);
                    tihao += 1;
                }
            }


        })
    })
    layui.use(['laydate', 'form'],
        function () {
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
