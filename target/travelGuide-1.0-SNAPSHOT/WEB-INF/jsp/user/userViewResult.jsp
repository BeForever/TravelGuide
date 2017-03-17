<%--
  Created by IntelliJ IDEA.
  User: Jarst
  Date: 16/12/09
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看用户资料</title>
</head>
<body>
<div id="container" align="center">
    <header class="header" id="header">
        <p>
            此处显示  class "header" id "header" 的内容
        </p>
    </header>
    <main class="main" id="main">
        <div class="user" id="userViewResult">
            <p>
            <h6>&nbsp;账　　号:&nbsp;</h6>${userViewID}
            <h6>&nbsp;昵　　称:&nbsp;</h6>${userViewUSERNAME}
            <h6>&nbsp;真实姓名:&nbsp;</h6>${userViewNAME}
            <h6>&nbsp;性　　别:&nbsp;</h6>${userViewGENDER}
            <h6>&nbsp;出生日期:&nbsp;</h6>${userViewBIRTHDATE}
            <h6>&nbsp;所在城市:&nbsp;</h6>${userViewCITY}
            <h6>&nbsp;联系电话:&nbsp;</h6>${userViewTEL}
            </p>
        </div>
        <section class="section" id="section">
            section
        </section>
    </main>

</div>
</body>
</html>
