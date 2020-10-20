$(function () {
    var aid = $("input[name=aid]").val();
    var json = {
        "aid": aid
    }
    //根据登陆的账号id获取他的好友
    var $li;
    $.post("/lvSelectHao", json, function (reslut) {
        $(".user_list li").remove();
        //判断是否有好友
        if (reslut.status == "true") {
            $.each(reslut.data, function (i, v) {
                var beizhu = "";
                if (typeof(v.beizhu) === "undefined") {
                    beizhu = "";
                } else {
                    beizhu = v.beizhu;
                }
                var jsonhao = {
                    "aid": aid,
                    "haoid": v.haoid
                }
                $.ajax({
                    "url": "/lvSelectHaoXinXi",
                    "type": "POST",
                    "data": jsonhao,
                    "dataType": "json",
                    "async": false,
                    success: function (reslutHao) {
                        var xingQi;
                        var neiro = "";
                        var createdate;
                        if (typeof(reslutHao.data2.xiaoXis[0].createdate) === "undefined") {
                            xingQi = "未联系";
                        } else {
                            neiro = reslutHao.data2.xiaoXis[0].neirong;
                            createdate = reslutHao.data2.xiaoXis[0].createdate;
                            xingQi = date(createdate);
                        }
                        var $li;
                        if (dianClass == reslutHao.data2.haoid) {
                            if (typeof(reslutHao.data2.beizhu) == "undefined") {
                                $li = $('<li class="user_active" ><div class="user_head"><input hidden value=' + reslutHao.data2.haoid + '><img src="/static/images/head/15.jpg"/></div><div class="user_text"> <p class="user_name">' + reslutHao.data.nickname + '</p> <p class="user_message">' + neiro + '</p></div> <div class="user_time">' + xingQi + '</div> </li>');
                            } else {
                                $li = $('<li class="user_active"><div class="user_head"><input hidden value=' + reslutHao.data2.haoid + '><img src="/static/images/head/15.jpg"/></div><div class="user_text"> <p class="user_name">' + reslutHao.data2.beizhu + '</p> <p class="user_message">' + neiro + '</p> </div> <div class="user_time">' + xingQi + '</div> </li>');
                            }
                        } else {
                            if (typeof(reslutHao.data2.beizhu) == "undefined") {
                                $li = $('<li class="user_li" ><div class="user_head"><input hidden value=' + reslutHao.data2.haoid + '><img src="/static/images/head/15.jpg"/></div><div class="user_text"> <p class="user_name">' + reslutHao.data.nickname + '</p> <p class="user_message">' + neiro + '</p></div> <div class="user_time">' + xingQi + '</div> </li>');
                            } else {
                                $li = $('<li class="user_li"><div class="user_head"><input hidden value=' + reslutHao.data2.haoid + '><img src="/static/images/head/15.jpg"/></div><div class="user_text"> <p class="user_name">' + reslutHao.data2.beizhu + '</p> <p class="user_message">' + neiro + '</p> </div> <div class="user_time">' + xingQi + '</div> </li>');
                            }
                        }
                        $(".user_list").append($li);
                    }
                })

            })
            $(".user_li").click(function () {
                $("#chatbox li").remove();
                $(this).attr("class", "user_active");
                $(this).siblings().attr("class", "user_li")
                var name = $(this).children(".user_text").children(".user_name").text();
                var haoid = $(this).children(".user_head").children("input").val();
                var haoimg = $(this).children(".user_head").children("img").attr("src");
                dianClass = haoid;
                liaoTian(haoid, haoimg, name)
            })
            //没有好友
        } else {
        }//判断是否有好友else
    }, "json")//根据登陆的账号id获取他的好友post
    b();
    //搜索框查询好友
    $(".chahy").blur(function () {
        var chahy=$(".chahy").val();
        var jsonmo={
            "aid":aid,
            "nickname":chahy
        }
        $.post("/moHuCha",jsonmo,function (data) {
            $(".user_list li").remove();
            $.each(data.data,function (i,v) {
                var beizhu = "";
                if (typeof(v.beizhu) === "undefined") {
                    beizhu = "";
                } else {
                    beizhu = v.beizhu;
                }
                var jsonhao = {
                    "aid": aid,
                    "haoid": v.haoid
                }

                $.ajax({
                    "url": "/lvSelectHaoXinXi",
                    "type": "POST",
                    "data": jsonhao,
                    "dataType": "json",
                    "async": false,
                    success: function (reslutHao) {
                        var xingQi;
                        var neiro = "";
                        var createdate;
                        if (typeof(reslutHao.data2.xiaoXis[0].createdate) === "undefined") {
                            xingQi = "未联系";
                        } else {
                            neiro = reslutHao.data2.xiaoXis[0].neirong;
                            createdate = reslutHao.data2.xiaoXis[0].createdate;
                            xingQi = date(createdate);
                        }
                        var $li;
                        if (dianClass == reslutHao.data2.haoid) {
                            if (typeof(reslutHao.data2.beizhu) == "undefined") {
                                $li = $('<li class="user_active" ><div class="user_head"><input hidden value=' + reslutHao.data2.haoid + '><img src="/static/images/head/15.jpg"/></div><div class="user_text"> <p class="user_name">' + reslutHao.data.nickname + '</p> <p class="user_message">' + neiro + '</p></div> <div class="user_time">' + xingQi + '</div> </li>');
                            } else {
                                $li = $('<li class="user_active"><div class="user_head"><input hidden value=' + reslutHao.data2.haoid + '><img src="/static/images/head/15.jpg"/></div><div class="user_text"> <p class="user_name">' + reslutHao.data2.beizhu + '</p> <p class="user_message">' + neiro + '</p> </div> <div class="user_time">' + xingQi + '</div> </li>');
                            }
                        } else {
                            if (typeof(reslutHao.data2.beizhu) == "undefined") {
                                $li = $('<li class="user_li" ><div class="user_head"><input hidden value=' + reslutHao.data2.haoid + '><img src="/static/images/head/15.jpg"/></div><div class="user_text"> <p class="user_name">' + reslutHao.data.nickname + '</p> <p class="user_message">' + neiro + '</p></div> <div class="user_time">' + xingQi + '</div> </li>');
                            } else {
                                $li = $('<li class="user_li"><div class="user_head"><input hidden value=' + reslutHao.data2.haoid + '><img src="/static/images/head/15.jpg"/></div><div class="user_text"> <p class="user_name">' + reslutHao.data2.beizhu + '</p> <p class="user_message">' + neiro + '</p> </div> <div class="user_time">' + xingQi + '</div> </li>');
                            }
                        }
                        $(".user_list").append($li);
                    }
                })
            })
        },"json")
    })
    //模糊查询结束
    $(".addhao").click(function () {
        layer.open({
            type: 2,
            area: ['700px', '450px'],
            fixed: false, //不固定
            maxmin: true,
            content: '/jsp/addHao.jsp'
        });
    })
    //添加好友
    var jsonF={id:aid}
    $.post("/lvSelectFriends",jsonF,function (data1) {
        $.each(data1.data,function (i,v) {
            var backid=v.backid;
            $.post("lvSelectFriendsInfo",{id:v.aid},function (data) {
                var $div=$(" <div class=\"friends_box\">\n" +
                    "                    <div class=\"user_head\"><img src=\"/static/images/head/1.jpg\"/></div>\n" +
                    "                    <div class=\"friends_text\">\n" +
                    "                    <span class=\"user_name\">"+data.data.nickname+"</span>\n" +
                    "                    <span hidden>"+data.data.accid+"</span><span style=\"margin-left:27px \"><button class='tong'>同意</button></span>\n" +
                    "                <span><button class='ju'>拒绝</button></span>\n" +
                    "                </div>\n" +
                    "                </div>");
                $(".xinHaoYou").append($div)
                $(".tong").click(function () {
                    var accid= $(this).parent().prev().text();
                    var th=$(this).parent().parent().parent();
                    $.post("/lvAddFriends",{accid:accid,aid:aid,backid:backid},function (result) {
                            if(result.success=="true"){
                                th.remove();
                                alert("已同意");
                            }
                    },"json")
                })
                $(".ju").click(function () {
                    var th=$(this).parent().parent().parent();
                    $.post("/lvDelFriends",{backid:backid},function (result) {
                        if(result.success=="true"){
                            th.remove();
                            alert("已拒绝");
                        }
                    },"json")
                })
            },"json")
        })
    },"json")

})//jquery工厂函数
var dianClass;

//局部刷新
function xun() {
    time = setInterval(function getoList() {

    }, 3000);
}

function liaoTian(haoid, haoimg, name) {

    var aid = $("input[name=aid]").val();
    var jsonxiao = {
        "aid": aid,
        "haoid": haoid
    }
    var aidimg = $(".aidimg").attr("src");
    var aname = $(".own_name").text();
    $(".haoname").text(name);
    $(".haoid").text(haoid);
    $.post("lvSelectHaoXiaoXi", jsonxiao, function (result1) {
        $(".content li").remove();
        $.each(result1.data, function (i, v) {
            $.each(v.xiaoXis, function (i1, v1) {

                if (typeof(v1.createdate) == "undefined") {
                } else {
                    var $lis;
                    if (v1.zhu == aid) {

                        $lis = $('<li class="me"><img src=' + aidimg + ' title=' + aname + '><span>' + v1.neirong + '</span></li>');
                    }
                    if (v1.zhu == haoid) {

                        $lis = $('<li class="other"><img class="haoimg" src=' + haoimg + ' title=' + name + '><span>' + v1.neirong + '</span></li>');
                    }
                    var $da = $('<li style="margin: 0px 200px;"><span>' + v1.createdate + '</span></li>')
                    $("#chatbox").append($da);
                    $("#chatbox").append($lis);
                }

            })
        })
    }, "json")
}

function date(timei) {
    var weekDay = ["周日", "周一", "周二", "周三", "周四", "周五", "周六"];
    var myDate = new Date(Date.parse(timei));
    var myDay=new Date().getDay();
    var times=timei.substring(0,10);
    var bo=false;
    for (var i=myDay-1;i>=0;i--){
        var day1 = new Date();
        day1.setTime(day1.getTime()-24*60*60*1000*i);
        var s1 = day1.getFullYear()+"-" + (day1.getMonth()+1)+"-" + day1.getDate();
        if (s1==times){
            bo=true;
            break;
        }
    }
    var xingQi;
    if (bo==false){
        xingQi=timei.substring(0,10);
    }else if(new Date().getDate()==new Date(timei).getDate()){
        var hours=parseInt(new Date(timei).getHours())+1;
        if (hours>0&&hours<=6){
            xingQi="凌晨"+timei.substring(11,16);;
        }else if(hours>6&&hours<=10){
            xingQi="早上"+timei.substring(11,16);;
        }else if(hours>10&&hours<=14){
            xingQi="中午"+timei.substring(11,16);;
        }else if(hours>14&&hours<=19){
            xingQi="下午"+timei.substring(11,16);;
        }else if(hours>19&&hours<=23){
            xingQi="晚上"+timei.substring(11,16);;
        }
    }else if(parseInt(new Date().getDate())-1==new Date(timei).getDate()){
        xingQi="昨天";
    } else if(bo){

        xingQi=weekDay[myDate.getDay()];
    }
    return xingQi;
}

function b() {
    var text = document.getElementById('input_box');
    var chat = document.getElementById('chatbox');
    var btn = document.getElementById('send');
    var talk = document.getElementById('talkbox');
    btn.onclick = function () {
        if (typeof ($(".user_active").html()) == "undefined") {
            layer.msg('选择好友', function () {
            });
            return;
        }
        if (text.value == '') {
            layer.msg('不能发送空消息', function () {
            });
        } else {
            var aidimg = $(".aidimg").attr('src');
            var haoname = $(".haoname").text();
            var haoid = $(".haoid").text().substring(1)
            var aid = $("input[name=aid]").val();
            var haoimg = $(".haoimg").attr("src");
            console.log(haoid);
            var json = {
                "aid": aid,
                "haoid": haoid,
                "neirong": text.value
            }
            $.post("/addXiaoXi", json, function (data) {
                if (data.success == "true") {
                    liaoTian(haoid, haoimg, haoname)
                } else {
                    layer.msg('发送失败', function () {
                    });
                }
            }, "json")
            text.value = '';
            chat.scrollTop = chat.scrollHeight;
            talk.style.background = "#fff";
            text.style.background = "#fff";
        }
    }
}


