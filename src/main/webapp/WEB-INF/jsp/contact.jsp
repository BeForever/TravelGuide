<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    %>
    <base href="<%=basePath%>">

    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="content">
    <div class="wrap">
        <div class="section group">
            <div class="col span_1_of_3">
                <div class="contact_info">
                    <h3>我们在这儿</h3>
                    <div class="map">
                        <jsp:include page="map.jsp"/>
                    </div>
                </div>
                <!--div class="company_address" style="margin-top: 70px">
                    <h3>我们的信息</h3>
                    <p>Tel.15754308796</p>
                    <p>QQ.584366829</p>
                    <p>邮箱. <span>luajk@qq.com</span></p>
                </div-->
            </div>
            <div class="col span_2_of_3">
                <div class="contact-form">
                    <h3>联系我们</h3>
                    <form id="fm">
                        <div>
                            <span><label>姓名</label></span>
                            <span><input name="userName" type="text" class="textbox"></span>
                        </div>
                        <div>
                            <span><label>邮箱</label></span>
                            <span><input name="userEmail" type="text" class="textbox"></span>
                        </div>
                        <div>
                            <span><label>手机</label></span>
                            <span><input name="userPhone" type="text" class="textbox"></span>
                        </div>
                        <div>
                            <span><label>您的建议</label></span>
                            <span><textarea name="userMsg"> </textarea></span>
                        </div>
                        <div>
                            <span><input type="button" class="mybutton" onclick="Submit()" value="提交"></span>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="clear"></div>
</div>
<div class="clear"></div>

<jsp:include page="footer.jsp"/>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
    function Submit() {
        $('#fm').ajaxSubmit({
            url: 'contactResult.do',
            type: 'post',
            dataType: 'json',
            success: function (data) {
                alert(data.msg);
                $('#fm')[0].reset();
            }
        })
    }
</script>
</body>
</html>


