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

        <div class="user" id="form_userView">
            <form  name="form_userView" action="userViewResult" class="userSearchForm" method="post">
                账号：<input type="text" id="input_userId" name="input_userId" autofocus/>
                <input type="submit" value="查看"/>
            </form>
        </div>
    </main>
</div>
</body>
</html>
