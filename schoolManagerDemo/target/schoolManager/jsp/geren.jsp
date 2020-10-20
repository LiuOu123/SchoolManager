<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="x-admin-sm">
    <head>
        <meta charset="UTF-8">
        <title>欢迎页面-X-admin2.2</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <link rel="stylesheet" href="/static/css/font.css">
        <link rel="stylesheet" href="/static/css/xadmin.css">
        <script src="/static/js/jquery.min.js"></script>
        <script type="text/javascript" src="/static/lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="/static/js/xadmin.js"></script>

        <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
        <!--[if lt IE 9]>
            <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
            <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>

        <![endif]--></head>
    <body>
        <div class="layui-fluid">
            <div class="layui-row">
                <form class="layui-form" action="/hshdoupdate" method="post" enctype="multipart/form-data">
                    <input hidden value="${hshselect.accid}" name="accid">
                    <input hidden value="${hshselect.uid}" name="uid">
                    <div class="layui-form-item">
                        <label for="username" class="layui-form-label">
                            <span class="x-red">*</span>用户名</label>
                        <div class="layui-input-inline">
                            <input type="text" id="username" name="nikename" required="" lay-verify="required" autocomplete="off" class="layui-input" value="${hshselect.nickname}"></div>
                        </div>
					  <label for="username" class="layui-form-label">
					    <span class="x-red">*</span>上传头像</label>
						<input type="file" name="touxiang" id="filetou"/>
                    <div id="img">

                    </div>
                    <div class="layui-form-item">
                        <label for="username" class="layui-form-label">
                            <span class="x-red">*</span>年龄</label>
                        <div class="layui-input-inline">
                            <input type="text" id="age" name="age" required="" lay-verify="required" autocomplete="off" class="layui-input" value="${hshselect.age}"></div>
                    </div>
                    <div class="layui-form-item">
                        <label for="phone" class="layui-form-label">
                            <span class="x-red">*</span>手机号</label>
                        <div class="layui-input-inline">
                            <input type="text" id="phone" name="phone" required="" lay-verify="phone" autocomplete="off" class="layui-input" value="${hshselect.phone}"></div>
                    </div>
                    <div class="layui-form-item">
                        <label for="username" class="layui-form-label">
                            <span class="x-red">*</span>性别</label>

                        <div class="layui-input-inline">
                            <c:if test="${hshselect.sex=='男'}">
                                <input type="radio" name="sex"  checked="checked" value="男" style="display:inline-block"/>男
                                <input type="radio"name="sex"  value="女"  style="display: inline-block"/>女
                            </c:if>
                            <c:if test="${hshselect.sex=='女'}">
                                <input type="radio"name="sex"  value="男"  style="display: inline-block"/>男
                                <input type="radio" name="sex" checked="checked" value="女"  style="display: inline-block"/>女
                            </c:if>

                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label for="username" class="layui-form-label">
                            <span class="x-red">*</span>地址</label>
                        <div class="layui-input-inline">
                        <input type="text"  name="address" required="" lay-verify="address" autocomplete="off" class="layui-input" value="${hshselect.address}"></div>
                        </div>
                    </div>

                    <div class="layui-form-item">
                        <label for="username" class="layui-form-label">
                            <span class="x-red">*</span>邮箱</label>
                        <div class="layui-input-inline">
                          <input type="text"  name="email" required="" lay-verify="email" autocomplete="off" class="layui-input" value="${hshselect.eamil}"></div>
                        </div>
                    </div>
                    <div class="layui-form-item">
                      <label for="username" class="layui-form-label">
                          <span class="x-red">*</span>个性签名</label>
                      <div class="layui-input-inline">
                        <textarea name="qianming" placeholder="编辑个人签名..."  cols="40"   rows="4"   style="OVERFLOW:   hidden" >${hshselect.qianming}</textarea></div>
                      </div>
                  </div>
        <div class="layui-form-item">
            <button class="layui-btn shangchuan" lay-filter="add" lay-submit="">保存</button>
			 <button class="layui-btn" lay-filter="add" lay-submit="">关闭</button></div>
         <input type="submit" value="提交">

        </form>
        </div>
        </div>
        <script type="text/javascript">

  // $(document).ready(function () {
  //     $(".shangchuan").click(function () {
  //         var fromDate=new fromDate();
  //         fromDate.append("file",document.getElementById("filetou").files[0]);
  //         $.ajax({
  //             url: "/hshtouxiang",
  //             type: "POST",
  //             data: fromDate,
  //             dataType:"json",
  //             // 设置同步请求，应为必须等待图片上传完成才能显示图片
  //             async: false,
  //             // contentType 文件上传的数据为 multipart/form-data，设置为 false 是为了避免 JQuery 对其操作，保证能正确解析
  //             contentType: false,
  //             //默认情况下，processData 的值是 true，其代表以对象的形式上传的数据都会被转换为字符串的形式上传。而当上传文件的时候，则不需要把其转换为字符串，因此要改成false
  //             processData: false,
  //             success:function (result) {
  //                 if(result.status=="success1"){;
  //                     $("#img").html("<img src='/static/images/uploadfile/"+result.filename+"'>")
  //                 }else {
  //                     alert(result.msg)
  //                 }
  //             }
  //         });
  //     })
  // });



            <%--layui.use(['form', 'layer'],--%>
            <%--function() {--%>
                <%--$ = layui.jquery;--%>
                <%--var form = layui.form,--%>
                <%--layer = layui.layer;--%>

                <%--//自定义验证规则--%>
                <%--form.verify({--%>
                    <%--nikename: function(value) {--%>
                        <%--if (value.length < 5) {--%>
                            <%--return '昵称至少得5个字符啊';--%>
                        <%--}--%>
                    <%--},--%>
                    <%--pass: [/(.+){6,12}$/, '密码必须6到12位'],--%>
                    <%--repass: function(value) {--%>
                        <%--if ($('#L_pass').val() != $('#L_repass').val()) {--%>
                            <%--return '两次密码不一致';--%>
                        <%--}--%>
                    <%--}--%>
                <%--});--%>

                <%--//监听提交--%>
                <%--form.on('submit(add)',--%>
                <%--function(data) {--%>
                    <%--console.log(data);--%>
                    <%--//发异步，把数据提交给php--%>
                    <%--layer.alert("增加成功", {--%>
                        <%--icon: 6--%>
                    <%--},--%>
                    <%--function() {--%>
                        <%--// 获得frame索引--%>
                        <%--var index = parent.layer.getFrameIndex(window.name);--%>
                        <%--//关闭当前frame--%>
                        <%--parent.layer.close(index);--%>
                    <%--});--%>
                    <%--return false;--%>
                <%--});--%>

            <%--});--%>
            </script>
        <script>var _hmt = _hmt || []; (function() {
                var hm = document.createElement("script");
                hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
                var s = document.getElementsByTagName("script")[0];
                s.parentNode.insertBefore(hm, s);
            })();</script>
    </body>

</html>