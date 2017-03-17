<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>查找评论</title>
</head>
<div class="comment" id="commentid">
  <form  name="selComment" action="selResult" class="guideModifyForm" method="post">
		评论id：<input type="text" id="ID_Comment_ID" name="ID_Comment_ID" autofocus/><br>
        <br></br>
        用户id：<input type="text" id="ID_Comment_UserID" name="ID_Comment_UserID" autofocus/><br>
        景点id：<input type="text" id="ID_Comment_ViewID" name="ID_Comment_ViewID" autofocus/> <br>   
	<input type="submit"/>
  </form>
</div>
</html>