<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    %>
    <base href="<%=basePath%>">
</head>
<body>

<form action="login" method="post" >

    <input type="text" name="username">
    <input type="password" name="password">
    <button type="submit">提交</button>

</form>
</body>
</html>
