<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lyf
  Date: 2020/7/28
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fileupload</title>
</head>
<body>
  <form action="${pageContext.request.contextPath}/fileUp/method.action"
        method="post"
        enctype="multipart/form-data">
 图片:<input type="file" id="image"/>
    <input type="submit" value="提交">
</form>
</body>
</html>
