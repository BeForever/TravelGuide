<%--
  Created by IntelliJ IDEA.
  User: bgJar
  Date: 16/12/11
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<main class="main" id="main">
    <div class="user" id="userLogin">
        <form  name="form_userLogin" action="userLoginResult" class="userLoginFrom" method="post">
            <p>
            <h6>&nbsp;账号:&nbsp;</h6><input type="text" id="input_userId" name="input_userId" autofocus/>
            <h6>&nbsp;密码:&nbsp;</h6><input type="password" id="input_userPassword" name="input_userPassword"/>
            <input type="submit" value="登录"/>
            </p>
        </form>
    </div>
</main>
</body>
</html>

