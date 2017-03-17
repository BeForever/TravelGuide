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
    <title>查询景点指南</title>
    <link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>

<div id="container" align="center">
    <header class="header" id="header">
        <p>
            此处显示  class "header" id "header" 的内容
        </p>
    </header>
    <main class="main" id="main">

        <div class="guide" id="guideSearch">
            <form  name="guideIDSearchForm" action="guideQueryResult" class="guideSearchForm" method="post">
                编号：<input type="text" id="guideIDinput" name="guideIDinput" autofocus/>
                <input type="submit"/>
            </form>
        </div>
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

