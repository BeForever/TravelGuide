<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
                + path + "/";
    %>
    <base href="<%=basePath%>">
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <link rel="stylesheet" type="text/css" href="css/guidestyle.css"/>
    <link rel="stylesheet" type="text/css" href="css/pagination.css"/>
    <link rel="stylesheet" type="text/css" href="css/colorbox.css"/>
    <link rel="stylesheet" type="text/css" href="css/logincolorbox.css"/>
    <link rel="stylesheet" type="text/css" href="css/page-core.css"/>
</head>
<body style="background-color: #fff">

<jsp:include page="../header.jsp"/>

<div style="background-color: #fff">
    <div class="g-doc" style="border-bottom:1px solid #c0ecf4">
        <div class="img">
            <img src="${guide.pictures}" alt="" height="250" width="100%">
        </div>
        <div class="n-show f-cb" id="showContent">
            <div class="cnt" style="margin-left: 10px">
                <span style="font-size: xx-large;font-weight: bolder;margin-top: 10px;margin-bottom: 50px">${guide.name}</span>
                <span style="color: #6d757a;font-size: large"><img src="images/pageviews.png"/>(${guide.hit})</span>
                <br/>
                <p><br/></p>
                <span style="font-weight: bold;margin-top: 10px;margin-bottom: 50px;font-size: larger">概述</span>
                <div align=""
                     style="margin-left: 40px; margin-right: 40px; margin-top: 40px; margin-bottom: 30px">
                    <p style="color: #505050">${guide.outline}</p>
                </div>
            </div>
        </div>
        <div class="cnt" style="margin-left: 10px">
            <span style="font-weight: bold;margin-top: 10px;margin-bottom: 50px;font-size: larger">详细信息</span>
            <div
                    style="margin-left: 40px; margin-right: 40px; margin-top: 40px; margin-bottom: 30px">
                <ul style="color: #505050">
                    <li><font size="3" face="微软雅黑">地址：</font>${guide.address} <br/>
                        <br/> <font size="3" face="微软雅黑">电话：</font>${guide.tel} <br/>
                        <br/> <font size="3" face="微软雅黑">开放时间：</font>${guide.openTime} - - ${guide.closeTime}</li>
                </ul>
            </div>
        </div>
        <div class="cnt" style="margin-left: 10px">
            <div class="n-detail">
                <span style="font-weight: bold;margin-top: 10px;margin-bottom: 50px;font-size: larger">历史</span>
                <br/>
                <div
                        style="margin-left: 40px; margin-right: 40px; margin-top: 40px; margin-bottom: 30px">
                    <p style="color: #505050;">${guide.history}</p>
                </div>
            </div>
            <div class="n-detail">
                <span style="font-weight: bold;margin-top: 10px;margin-bottom: 50px;font-size: larger">特色</span>
                <br/>
                <div
                        style="margin-left: 40px; margin-right: 40px; margin-top: 40px; margin-bottom: 30px">
                    <p style="color: #505050">${guide.features}</p>
                </div>
            </div>
        </div>
    </div>
    <div class="g-doc">
        <div class="n-show f-cb" id="info-panel">
            <br/>
            <span style="font-weight: bold;margin-top: 10px;margin-bottom: 50px;font-size: larger">景点资讯</span>
        </div>
        <div class="cnt" style="margin-left: 10px">
            <ul id="info">

            </ul>
        </div>
        <div id="page" class="M-box3" style="margin: 0 auto; width: 100%">
        </div>
    </div>

    <div class="g-doc">
        <div class="n-show f-cb" id="comment-panel">
            <br/>
            <span style="font-weight: bold;margin-top: 10px;margin-bottom: 50px;font-size: larger">用户评论</span>
        </div>
        <div class="cnt" style="margin-left: 10px">
            <div id="comment" class="common">
                <div class="comm">
                    <div class="bilibili-comment">
                        <div class="comm_send">
                            <div class="tg_send_post">
                                <div class="dcmp_content">
                                    <div class="user_face">
                                        <img src="images/photo.jpg">
                                    </div>
                                    <div id="dcmp_textarea_container"
                                         class="dcmp-textarea-container focus">
                                        <div class="login-link-wrp">
                                            请先 <a href="#inline-content"  class="login_button" id="innerlogin">点击登录</a>后发表评论
                                            (?ω?)
                                        </div>
                                        <i class="b-icon b-icon-triangle-gray-left"></i>
                                        <textarea cols="80" name="msg" rows="5" id="comment_text"
                                                  placeholder="请自觉遵守互联网相关的政策法规，严禁发布色情、暴力、反动的言论。"
                                                  class="b-input ipt-txt"></textarea>
                                        <button type="submit" class="b-btn submit-comment disabled">发表评论</button>
                                        <div id="textarea_size_tester"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <ul id="comment_info" class="comm_list">
                        </ul>
                    </div>
                </div>

            </div>
        </div>
        <div id="comemntpage" class="M-box3" style="margin: 0 auto; width: 100%">
        </div>
    </div>
</div>

<div id="infoDetail"></div>

<div style="display: none">
    <div id="inline-content">
        <div class="form">
            <div id="landing">登录</div>
            <div id="registered">注册</div>
            <div class="fix"></div>
            <div id="landing-content">
                <form id="login">
                    <div id="photo">
                        <img src="images/photo.jpg"/>
                    </div>
                    <div class="inp">
                        <input type="text" name="username" placeholder="账号"/>
                    </div>
                    <div class="inp">
                        <input type="password" name="password" placeholder="密码"/>
                    </div>
                    <button class="login_button" type="button" onclick="Login()">登录</button>
                </form>
            </div>
            <div id="registered-content">
                <div class="inp">
                    <input type="text" id="rusername" name="rusername"
                           placeholder="请输入账号"/>
                </div>
                <div class="inp">
                    <input type="text" id="rnickName" name="rnickName"
                           placeholder="请输入昵称"/>
                </div>
                <div class="inp">
                    <input type="password" id="rpassword" name="rpassword"
                           placeholder="请输入密码"/>
                </div>
                <div class="inp">
                    <input type="password" id="rrpassword" name="rrpassword"
                           placeholder="请重复密码"/>
                </div>
                <div class="login_button" type="button" onclick="Register()">注册</div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../footer.jsp"/>

<script src="js/jquery.min.js" type="text/javascript"></script>
<script src="js/jquery.form.js" type="text/javascript"></script>
<script src="js/jquery.pagination.js" type="text/javascript"></script>
<script src="js/jquery.colorbox.js" type="text/javascript"></script>
<script type="text/javascript">
    $(function () {
        $("#innerlogin").colorbox({
            inline: true,
            width: "350px"
        });
        $("#landing").addClass("border-btn").click(function () {
            $("#registered").removeClass("border-btn");
            $(this).addClass("border-btn");
            $("#landing-content").show(500);
            $("#registered-content").hide(500);
        });
        $("#registered").click(function () {
            $("#landing").removeClass("border-btn");
            $("#landing-content").hide(500);
            $(this).addClass("border-btn");
            $("#registered-content").show(500);
        });
        Query(1);
        QueryComment(1);
    });
    function Query(page) {
        $.ajax({
            url: 'informationQueryResult.do',
            type: 'post',
            data: {
                page: page,
                rows: 10,
                guide: '${guide.id}'
            },
            dataType: 'json',
            success: function (data) {
                var currentPage = data.currentPage;
                var totalPage = data.totalPage;
                var totalCount = data.totalCount;
                $('#info').html('');
                $('#infoDetail').html('');
                if (data.list == null || data.list.length == 0) {
                    $('#page').hide();
                    $('#info').append('暂无资讯');
                    return;
                }
                $.each(data.list, function () {
                    $('#info')
                            .append(
                                    '<li><div style="margin-left:40px;margin-right: 40px; margin-top: 40px; margin-bottom: 30px"> <a class="inline" href="#' + this.id + '"><font size="2" face="微软雅黑"> '
                                    + this.title
                                    + '</font></a></div></li>');
                    $('#infoDetail')
                            .append(
                                    ' <div style="display:none" >'
                                    + '<div style="background-color:#fff; margin:20px"  id="' + this.id + '">' +
                                    '<div style=" background-color: inherit"><div style="text-align: center;margin-bottom: 10px" ><span style="font-weight:bold;">' + this.title + '</span><br><span style="font-size: small;font-weight: lighter;text-align: center">' + this.time + '</span></div><hr><br/><div>' + this.content + '</div><br><div style="text-align: right"><span style="font-style: italic">' + this.source +
                                    '</span></div></div></div>');
                });
                $(".inline").colorbox({
                    inline: true,
                    width: "50%",
                    opacity: 0.4
                });
                $("#page").pagination({
                    pageCount: totalPage,
                    totalData: totalCount,
                    showData: 2,
                    current: currentPage,
                    count: 5,
                    homePage: '首页',
                    endPage: '末页',
                    prevContent: '上页',
                    nextContent: '下页',
                    jump: true,
                    coping: true,
                    callback: function (index) {
                        Query(index.getCurrent());
                    }
                });
            }
        });
    }
    function Login() {
        $('#login').ajaxSubmit({
            url: 'login',
            type: 'post',
            dataType: 'json',
            success: function (data) {
                if (data.success) {
                    location.reload();
                } else {
                    alert(data.msg);
                }
            }
        })
    }
    function Register() {
        if ($('#rusername').val() == '') {
            alert("账号不能为空");
            return;
        }
        if ($('#rnickName').val() == '') {
            alert("昵称不能为空");
            return;
        }
        if ($('#rpassword').val() != $('#rrpassword').val()) {
            alert("前后密码不一致");
            return;
        }
        $('#register').ajaxSubmit({
            url: 'userInsertResult.do',
            type: 'post',
            dataType: 'json',
            success: function (data) {
                if (data.success) {
                    location.reload();
                } else {
                    alert(data.msg);
                }
            }
        })
    }
    function QueryComment(page) {
        $.ajax({
            url: 'commentQueryResult.do',
            type: 'post',
            data: {
                page: page,
                rows: 5,
                guide: '${guide.id}'
            },
            dataType: 'json',
            success: function (data) {
                var currentPage = data.currentPage;
                var totalPage = data.totalPage;
                var totalCount = data.totalCount;
                var html = '';
                var com = '';
                if ('${sessionScope.user}' != null
                        && '${sessionScope.user}' != '') {
                    $('.user_face').children().attr("src",
                            "${sessionScope.user.photo}");
                    $('.login-link-wrp').remove();
                    $('.b-btn').attr("class",
                            "b-btn submit-comment");
                    $('.b-btn').bind("click", insertComment);
                }
                if (data.list == null || data.list.length == 0) {
                    $('#comment').html('暂无评论');
                    return;
                }
                $.each(data.list, function () {
                    $.each(this.comments, function () {
                        com += '<li style="margin-left:80px;height: 55px" class="re_ul"><div style="margin-left:80px" class="facebox"><img src="' + this.user.photo + '"></div><div class="w"><span style="width:100%;margin-right:18px" class="name">'
                                + this.user.nickName
                                + " :  "
                                + '</span><span class="content">'
                                + this.content
                                + '</span></div></li>'
                    });
                    html += '<li class="main-floor"><div class="facebox"><a target="_blank"><img src="' + this.user.photo + '" class="face"></a></div><div class="t"><a>'
                            + this.user.nickName
                            + '</a></div><div class="content">'
                            + this.content
                            + '</div><button onclick="reply('
                            + "'"
                            + this.id
                            + "',event"
                            + ')">回复</button><div style="width : 100%;height:30px" id=' + this.id + '></div><div class="reply"><ul class="re_ul"> ';
                    if (com != '') {
                        html += com;
                    }
                    html += '<ul></div></li>';
                    com = '';
                });
                $('#comment_info').html('').append(html);
                $('#comment_counts').text(totalCount);
                $('#comment').bind("click", function () {
                    $('#replyDIV').remove();
                });
                $("#comemntpage").pagination({
                    pageCount: totalPage,
                    totalData: totalCount,
                    current: currentPage,
                    homePage: '首页',
                    endPage: '末页',
                    prevContent: '上页',
                    nextContent: '下页',
                    jump: true,
                    callback: function (index) {
                        QueryComment(index.getCurrent());
                    }
                });
            }
        });
    }

    function reply(replyid,event) {
        if ('${sessionScope.user}' == null || '${sessionScope.user}' == '') {
            $('#inpuntID').remove();
            alert('请先登录');
            $('#innerlogin').click();
            return;
        }
        $('#replyDIV').remove();
        var html = '';
        html += '<div id="replyDIV"><input id="replyText"  style="width : 100%;text-align:left" type="text"><button style="float:right" onclick="insertReply('
                + "'" + replyid + "'" + ')">确定</button></div>';
        $('#' + replyid + '').html('').append(html);
        $('#replyDIV').bind("click", function () {
            stopPropagation(event);
        });
        event.stopPropagation();
    }
    function stopPropagation(e){
        e=window.event||e;
        if(document.all){  //只有ie识别
            e.cancelBubble=true;
        }else{
            e.stopPropagation();
        }
    }
    function insertComment() {
        if ($('#comment_text').val() == null
                || $('#comment_text').val() == '') {
            alert("评论不能为空");
            return;
        }
        $.ajax({
            url: 'commentInsertResult.do',
            type: 'post',
            data: {
                content: $('#comment_text').val(),
                type: 2,
                parent: '${guide.id}'
            },
            success: function (data) {
                $('#comment_text').val('');
                QueryComment(1);
            }
        });
    }
    function insertReply(replyid) {
        if ($('#replyText').val() == null || $('#replyText').val() == '') {
            alert("评论不能为空");
            return;
        }
        $.ajax({
            url: 'commentInsertResult.do',
            type: 'post',
            data: {
                content: $('#replyText').val(),
                type: 1,
                parent: replyid
            },
            success: function (data) {
                $('#inpuntID').remove();
                QueryComment(1);
            }
        });
    }

</script>
</body>
</html>
