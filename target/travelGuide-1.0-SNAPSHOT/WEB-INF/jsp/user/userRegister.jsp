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
    <title>注册用户账号</title>
</head>
<body>
<main class="main" id="main">
    <div class="user" id="userRegister">
        <form  name="form_userRegister" action="userRegisterResult" class="userRegisterForm" method="post">
            <p>
            <h6>&nbsp;账　　号:&nbsp;</h6><input type="text" id="input_userId" name="input_userId" />
            <h6>&nbsp;密　　码:&nbsp;</h6><input type="text" id="input_userPassword" name="input_userPassword" />
            <!--<h6>&nbsp;确认密码:&nbsp;</h6><input type="text" id="input_checkPassword" name="input_checkPassword" />-->
            <h6>&nbsp;昵　　称:&nbsp;</h6><input type="text" id="input_userUsername" name="input_userUsername" />
            <h6>&nbsp;真实姓名:&nbsp;</h6><input type="text" id="input_userName" name="input_userName"/>
            <h6>&nbsp;性　　别:&nbsp;</h6><input type="text" id="input_userGender" name="input_userGender"  />
            <h6>&nbsp;出生日期:&nbsp;</h6><input type="text"  id="input_userBirthdate" name="input_userBirthdate"/>
            <h6>&nbsp;所在城市:&nbsp;</h6><input type="text" id="input_userCity" name="input_userCity" />
            <h6>&nbsp;联系电话:&nbsp;</h6><input type="text" id="input_userTel" name="input_userTel"  />
            <input type="submit" value="确认注册"/>
            </p>
        </form>
    </div>
</main>
</body>
</html>
