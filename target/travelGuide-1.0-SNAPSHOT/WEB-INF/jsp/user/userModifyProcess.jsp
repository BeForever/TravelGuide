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
<main class="main" id="main">
    <div class="user" id="userModify">
        <form  name="form_userModify" action="userModifyResult" class="userModifyForm" method="post">
            <p>
            <h6>&nbsp;账　　号:&nbsp;</h6><input type="hidden" id="input_userId" name="input_userId" value="${userModifyID}" />${userModifyID}
            <h6>&nbsp;密　　码:&nbsp;</h6><input type="hidden" id="input_userPassword" name="input_userPassword" value="${userModifyPASSWORD}" />${userModifyPASSWORD}
            <h6>&nbsp;昵　　称:&nbsp;</h6><input type="text" id="input_userUsername" name="input_userUsername" value="${userModifyUSERNAME}"/>
            <h6>&nbsp;真实姓名:&nbsp;</h6><input type="text" id="input_userName" name="input_userName" value="${userModifyNAME}"/>
            <h6>&nbsp;性　　别:&nbsp;</h6><input type="text" id="input_userGender" name="input_userGender" value="${userModifyGENDER}"/>
            <h6>&nbsp;出生日期:&nbsp;</h6><input type="text" id="input_userBirthdate" name="input_userBirthdate" value="${userModifyBIRTHDATE}"/>
            <h6>&nbsp;所在城市:&nbsp;</h6><input type="text" id="input_userCity" name="input_userCity" value="${userModifyCITY}"/>
            <h6>&nbsp;联系电话:&nbsp;</h6><input type="text" id="input_userTel" name="input_userTel" value="${userModifyTEL}"/>
            <input type="submit" value="确认修改"/>
            </p>
        </form>
    </div>
    <section class="section" id="section">
        section
    </section>
</main>
</body>
</html>
