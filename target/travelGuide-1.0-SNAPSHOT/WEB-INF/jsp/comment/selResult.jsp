<%@ page contentType="text/html;charset=UTF-8" language="java" import="me.luajk.comment.model.Comment"%>
<html>
<head>
<title>评论</title>
</head>
<div class="comment" id="commentid">
<body>
<h1 align="center">评论</h1>
<jsp:useBean id="commentItems"
	type="me.luajk.comment.controller.CommentItemsbean" scope="session"></jsp:useBean>
	<%  for (Comment i : commentItems.getComments()) {
		pageContext.setAttribute("item", i);
	%>
	<jsp:useBean id="item" type="me.luajk.comment.model.Comment" scope="page"></jsp:useBean>
	<jsp:getProperty property="id" name="item"/><br>
	<jsp:getProperty property="date" name="item"/><br>
	<jsp:getProperty property="content" name="item"/><br><br>
	<% }%>
</body>
</div>
</html>