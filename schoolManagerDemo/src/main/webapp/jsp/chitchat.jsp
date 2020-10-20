<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 27895
  Date: 2020/9/8
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>学生聊天界面代码</title>
    <link rel="stylesheet" href="../static/css/amazeui.min.css"/>
    <link rel="stylesheet" href="../static/css/main.css"/>
</head>
<body>
<div class="box">
    <div class="wechat">
        <div class="sidestrip">
            <div class="am-dropdown" data-am-dropdown>
                <!--头像插件-->
                <div class="own_head am-dropdown-toggle"></div>
                <div class="am-dropdown-content">
                    <div class="own_head_top">
                        <div class="own_head_top_text">
                            <input hidden name="aid" value="${aid}">
                            <p class="own_name">彭于晏丶plus<img src="/static/images/icon/head.png" alt=""/></p>
                            <p class="own_numb">微信号：123456</p>
                        </div>
                        <img src="/static/images/own_head.jpg" alt="" class="aidimg"/>
                    </div>
                    <div class="own_head_bottom">
                        <p><span>地区</span>江西 九江</p>
                        <div class="own_head_bottom_img">
                            <a href=""><img src="/static/images/icon/head_1.png"/></a>
                            <a href=""><img src="/static/images/icon/head_2.png"/></a>
                        </div>
                    </div>
                </div>
            </div>
            <!--三图标-->
            <div class="sidestrip_icon">
                <a id="si_1" style="background: url(/static/images/icon/head_2_1.png) no-repeat;"></a>
                <a id="si_2"></a>
                <a id="si_3"></a>
            </div>

            <!--底部扩展键-->
            <div id="doc-dropdown-justify-js">
                <div class="am-dropdown" id="doc-dropdown-js" style="position: initial;">
                    <div class="sidestrip_bc am-dropdown-toggle"></div>
                    <ul class="am-dropdown-content" style="">
                        <li>
                            <a href="#"
                               data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0, width: 400, height: 225}">意见反馈</a>
                            <div class="am-modal am-modal-no-btn" tabindex="-1" id="doc-modal-1">
                                <div class="am-modal-dialog">
                                    <div class="am-modal-hd">Modal 标题
                                        <a href="javascript: void(0)" class="am-close am-close-spin"
                                           data-am-modal-close>&times;</a>
                                    </div>
                                    <div class="am-modal-bd">
                                        Modal 内容。本 Modal 无法通过遮罩层关闭。
                                    </div>
                                </div>
                            </div>
                        </li>

                        <li><a href="#">备份与恢复</a></li>
                        <li><a href="#">设置</a></li>
                    </ul>
                </div>
            </div>
        </div>

        <!--聊天列表-->
        <div class="middle on">
            <div class="wx_search">
                <input type="text" class="chahy" placeholder="搜索"/>
                <button class="addhao">+</button>
            </div>
            <div class="office_text">
                <ul class="user_list">

                </ul>
            </div>
        </div>

        <!--好友列表-->
        <div class="middle">
            <div class="wx_search">
                <input type="text" placeholder="搜索"/>
                <button>+</button>
            </div>
            <div class="office_text">
                <ul class="friends_list">
                    <li class="xinHaoYou">
                        <p>新的朋友</p>
                    </li>
                    <li>
                        <p>公众号</p>
                        <div class="friends_box">
                            <div class="user_head"><img src="/static/images/head/2.jpg"/></div>
                            <div class="friends_text">
                                <p class="user_name">公众号</p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <p>A</p>
                        <div class="friends_box">
                            <div class="user_head"><img src="/static/images/head/3.jpg"/></div>
                            <div class="friends_text">
                                <p class="user_name">彭于晏丶plus</p>
                            </div>
                        </div>
                        <div class="friends_box">
                            <div class="user_head"><img src="/static/images/head/4.jpg"/></div>
                            <div class="friends_text">
                                <p class="user_name">陈依依</p>
                            </div>
                        </div>
                        <div class="friends_box">
                            <div class="user_head"><img src="/static/images/head/5.jpg"/></div>
                            <div class="friends_text">
                                <p class="user_name">毛毛</p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <p>B</p>
                        <div class="friends_box">
                            <div class="user_head"><img src="/static/images/head/6.jpg"/></div>
                            <div class="friends_text">
                                <p class="user_name">苏笑言</p>
                            </div>
                        </div>
                        <div class="friends_box">
                            <div class="user_head"><img src="/static/images/head/7.jpg"/></div>
                            <div class="friends_text">
                                <p class="user_name">往事不再提</p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <p>C</p>
                        <div class="friends_box">
                            <div class="user_head"><img src="/static/images/head/8.jpg"/></div>
                            <div class="friends_text">
                                <p class="user_name">夏继涛</p>
                            </div>
                        </div>
                        <div class="friends_box">
                            <div class="user_head"><img src="/static/images/head/9.jpg"/></div>
                            <div class="friends_text">
                                <p class="user_name">早安无恙</p>
                            </div>
                        </div>
                        <div class="friends_box">
                            <div class="user_head"><img src="/static/images/head/10.jpg"/></div>
                            <div class="friends_text">
                                <p class="user_name">王鹏</p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <p>D</p>
                        <div class="friends_box">
                            <div class="user_head"><img src="/static/images/head/11.jpg"/></div>
                            <div class="friends_text">
                                <p class="user_name">涨了潮了</p>
                            </div>
                        </div>
                        <div class="friends_box">
                            <div class="user_head"><img src="/static/images/head/12.jpg"/></div>
                            <div class="friends_text">
                                <p class="user_name">Ktz丶中融资</p>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </div>

        <!--程序列表-->
        <div class="middle">
            <div class="wx_search">
                <input type="text" placeholder="搜索收藏内容"/>
                <button>+</button>
            </div>
            <div class="office_text">
                <ul class="icon_list">
                    <li class="icon_active">
                        <div class="icon"><img src="/static/images/icon/icon.png" alt=""/></div>
                        <span>全部收藏</span>
                    </li>
                    <li>
                        <div class="icon"><img src="/static/images/icon/icon1.png" alt=""/></div>
                        <span>链接</span>
                    </li>
                    <li>
                        <div class="icon"><img src="/static/images/icon/icon2.png" alt=""/></div>
                        <span>相册</span>
                    </li>
                    <li>
                        <div class="icon"><img src="/static/images/icon/icon3.png" alt=""/></div>
                        <span>笔记</span>
                    </li>
                    <li>
                        <div class="icon"><img src="/static/images/icon/icon4.png" alt=""/></div>
                        <span>文件</span>
                    </li>
                    <li>
                        <div class="icon"><img src="/static/images/icon/icon5.png" alt=""/></div>
                        <span>音乐</span>
                    </li>
                    <li>
                        <div class="icon"><img src="/static/images/icon/icon6.png" alt=""/></div>
                        <span>标签</span>
                    </li>
                </ul>
            </div>
        </div>

        <!--聊天窗口-->
        <div class="talk_window">
            <div class="windows_top">
                <div class="windows_top_box">
                    <span class="haoname"></span>
                    <input hidden class="haoid">
                    <ul class="window_icon">
                        <li><a href=""><img src="/static/images/icon/icon7.png"/></a></li>
                        <li><a href=""><img src="/static/images/icon/icon8.png"/></a></li>
                        <li><a href=""><img src="/static/images/icon/icon9.png"/></a></li>
                        <li><a href=""><img src="/static/images/icon/icon10.png"/></a></li>
                    </ul>
                    <div class="extend" class="am-btn am-btn-success"
                         data-am-offcanvas="{target: '#doc-oc-demo3'}"></div>
                    <!-- 侧边栏内容 -->
                    <div id="doc-oc-demo3" class="am-offcanvas">
                        <div class="am-offcanvas-bar am-offcanvas-bar-flip">
                            <div class="am-offcanvas-content">
                                <p><a href="http://music.163.com/#/song?id=385554" target="_blank">网易音乐</a></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!--聊天内容-->
            <div class="windows_body">
                <div class="office_text" style="height: 100%;">
                    <ul class="content" id="chatbox">

                    </ul>
                </div>
            </div>

            <div class="windows_input" id="talkbox">
                <div class="input_icon">
                    <a href="javascript:;"></a>
                    <a href="javascript:;"></a>
                    <a href="javascript:;"></a>
                    <a href="javascript:;"></a>
                    <a href="javascript:;"></a>
                    <a href="javascript:;"></a>
                </div>
                <div class="input_box">
                    <input hidden class="haoid">
                    <textarea name="" rows="" cols="" id="input_box"></textarea>
                    <button id="send" class="liaotian">发送（S）</button>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="../static/js/jquery.min.js"></script>
<script type="text/javascript" src="../static/js/amazeui.min.js"></script>
<script type="text/javascript" src="../static/js/zUI.js"></script>
<script type="text/javascript" src="../static/js/wechat.js"></script>
<script type="text/javascript" src="../static/layer/layer.js"></script>
<script type="text/javascript" src="../static/js/chitchatnew.js"></script>
<%--<script type="text/javascript" src="../static/js/chitchat.js"></script>--%>
<script type="text/javascript">
    //三图标
    window.onload = function () {
        //导航栏切换
        function a() {
            var si1 = document.getElementById('si_1');
            var si2 = document.getElementById('si_2');
            var si3 = document.getElementById('si_3');
            si1.onclick = function () {
                si1.style.background = "url(../static/images/icon/head_2_1.png) no-repeat"
                si2.style.background = "";
                si3.style.background = "";
            };
            si2.onclick = function () {
                si2.style.background = "url(../static/images/icon/head_3_1.png) no-repeat"
                si1.style.background = "";
                si3.style.background = "";
            };
            si3.onclick = function () {
                si3.style.background = "url(../static/images/icon/head_4_1.png) no-repeat"
                si1.style.background = "";
                si2.style.background = "";
            };
        };
        //发送消息
        a();
    };
</script>
</body>
</html>
