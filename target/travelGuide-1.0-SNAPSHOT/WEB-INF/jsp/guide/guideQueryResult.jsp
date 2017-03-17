<%--
  Created by IntelliJ IDEA.
  User: 35413
  Date: 2016/12/9
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>景点指南</title>
</head>
<body>
<div id="container" align="center">
    <header class="header" id="header">
        <p>
            此处显示  class "header" id "header" 的内容
        </p>
    </header>
    <main class="main" id="main">
        <div class="guide" id="guideQueryResult">
            <p>
            <h6>&nbsp;编号:&nbsp;</h6>${guideQueryID}
            <h6>&nbsp;景区名称:&nbsp;</h6>${guideQueryNAME}
            <h6>&nbsp;地址:&nbsp;</h6>${guideQueryADDRESS}
            <h6>&nbsp;概述:&nbsp;</h6>${guideQueryOUTLINE}
            <h6>&nbsp;电话:&nbsp;</h6>${guideQueryTEL}
            <h6>&nbsp;开放时间:&nbsp;</h6>${guideQueryOPENTIME}
            <h6>&nbsp;历史文化:&nbsp;</h6>${guideQueryHISTORY}
            <h6>&nbsp;特色:&nbsp;</h6>${guideQueryFEATURES}
            <h6>&nbsp;图片:&nbsp;</h6>${guideQueryPICTURES}
            </p>
        </div>
        <section class="section" id="section">
            section
        </section>
    </main>

    <footer class="footer" id="footer">
        <ul>
            <li><a href="#">免费声明</a></li>
            <li>|</li>
            <li><a href="#">友情链接</a></li>
            <li>|</li>
            <li><a href="#">联系我们</a></li>
            <li>|</li>
            <li><a href="#">版权所有</a></li>
        </ul>
        <p>经营许可证编号：吉ICP证070888号 吉ICP备09000888号</p>
    </footer>
</div>
</body>
</html>

