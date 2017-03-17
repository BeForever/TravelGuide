<%--
  Created by IntelliJ IDEA.
  User: BeForever
  Date: 16/12/9
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>informationQueryResult</title>
</head>
<body>

<div class="information" id="informationQueryResult">
    <p>
    <h6>&nbsp;资讯编号:&nbsp;</h6>${informationQueryId}
    <h6>&nbsp;景点编号:&nbsp;</h6>${informationQueryVpid}
    <h6>&nbsp;咨询标题:&nbsp;</h6>${informationQueryViewTitle}
    <h6>&nbsp;咨询内容:&nbsp;</h6>${informationQueryViewContent}
    <h6>&nbsp;来源:&nbsp;</h6>${informationQueryViewSource}
    <h6>&nbsp;时间:&nbsp;</h6>${informationQueryViewTime}
    </p>
</div>
</body>
</html>
