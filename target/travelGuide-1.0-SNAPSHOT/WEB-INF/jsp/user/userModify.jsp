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
    <title>修改用户资料</title>
</head>
<body>
<div class="user" id="userModify">
    <form  name="form_userModify" action="userModifyProcess" class="userModifyForm" method="post">
        账号：<input type="text" id="input_userId" name="input_userId"/>
        <input type="submit" value="修改"/>
    </form>
</div>
</main>
</body>
</html>
