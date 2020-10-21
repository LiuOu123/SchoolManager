$(document).ready(function () {
    fenye();
    $(".dianji").click(function () {
        var name=$(".nickname").val();
        fenye();
    })
})
var pageSize = 3;
var pageIndex = 1;
var data1;
var gid=$(".gradeid").val();

function fenye() {
    var gid=$(".gradeid").val();
    var name=$(".nickname").val();
    $.ajax({
        type:"GET",
        url:"/selgbyu",
        data:{gid:gid},
        dataType:"json",
        success:function (data) {
            $.each(data.hshselg,function (i,v) {
                $.ajax({
                    type:"GET",
                    url:"/selinfo",
                    data:{gid:v.userid,name:name, pageindex: pageIndex,
                        pagesize: pageSize,utype:1},
                    dataType:"json",
                    success:function (data2) {
                        data1 = data2;
                        $.each(data2.selfenye.list,function (i2,v2) {
                            var $tr = $("<tr><td> <input type='checkbox' name='id' value='1'   lay-skin='primary'></td><td>" + v2.accid + "</td><td>"
                                + v2.nickname + "</td><td>" + v2.age
                                + "</td><td>"+v2.sex+"</td><td>" + v2.address
                                + "</td><td>" + v2.eamil + "</td><td>" + v2.phone + "</td><td>" + v2.score + "</td><td><a title='删除' onclick='member_del(this,'要删除的id')' href='javascript:;'> <i class='layui-icon'>&#xe640;</i></a><a title='编辑'  onclick='xadmin.open('编辑','member-edit.html',600,400)' href='javascript:;'><i class='layui-icon'>&#xe642;</i> </a></td></tr>");
                            $(".table-b").append($tr);
                        })
                    }
                })
            })
        }
    })
}