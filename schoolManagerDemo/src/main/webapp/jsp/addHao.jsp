<%--
  Created by IntelliJ IDEA.
  User: 27895
  Date: 2020/9/16
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../static/css/amazeui.min.css"/>
    <link rel="stylesheet" href="../static/css/main.css"/>
</head>
<body>
<center>
    <div class="" style="margin-top: 70px">
        <input hidden class="aid" value="${aid}">
        <input type="text" class="chahy" placeholder="输入添加账号"/>&nbsp&nbsp&nbsp&nbsp&nbsp
        <button class="addhao">确定</button>
    </div>
    <div style="margin-top: 20px">
        <table width="400px" class="tablehao" >


        </table>
    </div>
</center>
</body>
<script src="/static/js/jquery.min.js"></script>
<script>
    $(function () {
        $(".addhao").click(function () {
                var accountname=$(".chahy").val();
                var json={acc:accountname}
                $(".tablehao tr").remove()
                $.post("/toSelectAcc",json,function (data) {
                    if (data.success=="此账号没有注册"){
                        $(".tablehao").append("<tr align='center'><td>"+data.success+"</td></tr>")
                    }else{
                        console.log(data.success)
                        $(".tablehao").append("<tr>\n" +
                            "                <td>\n" +
                            "                    <div class=\"user_head\"><input hidden value=' + reslutHao.data2.haoid + '>\n" +
                            "                        <img src=\"/static/touxiang/"+data.success.touxiang+"\"/></div>\n" +
                            "                    <div class=\"user_text\"><p class=\"user_name\">" + data.success.nickname + "</p>\n" +
                            "                        <p class=\"user_message\">"+ data.success.qianming+ "</p></div>\n" +
                            "                    <div class=\"user_time\"><span hidden>"+$(".aid").val()+"</span><span hidden>"+data.success.accid+"</span><button class='tianjia'>添加</button></div>\n" +
                            "                </td>\n" +
                            "            </tr>")
                    }
                    var bo=true;
                    $(".tianjia").click(function () {
                      var userid=$(this).prev().text();
                      var id=$(this).prev().prev().text();
                      //对现在有的好友进行一个查询
                        if (userid==id){
                            alert("已有该好友不能重复添加");
                            return;
                        }
                      $.post("/lvSelectHao",{aid:id},function (data) {
                          if (data.status=="false"){

                          }else{
                              $.each(data.data,function (i,v) {
                                  if (userid==v.haoid){
                                      bo=false;
                                      alert("已有该好友不能重复添加");
                                      return;
                                  }
                              })
                          }
                          if (bo){
                              var json={
                                  haoid:userid,
                                  id:id
                              }
                              $.post("/addChitchat",json,function (data) {
                                  if (data.success=="true"){
                                      alert("发送添加好友成功")
                                  }else{
                                      alert("发送添加好友失败")
                                  }

                              },"json")
                          }

                      },"json")

                    })
                },"json")
        })
    })
</script>
</html>
