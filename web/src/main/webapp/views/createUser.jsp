<%--
  Created by IntelliJ IDEA.
  User: hgwang
  Date: 7/8/15
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <form name="new_user" method="POST" action="create">
    <p>姓名：
      <input type="text" name="name"></p>
    <p>性别:
      <input type="radio" name="gender" value=男> 男
      <input type="radio" name="gender" value=女> 女</p>
    <p>邮箱：
      <input type="text" name="email" size="16"></p>

    <p>年龄：
      <input type="text" name="age"></p>
    <input type="submit" value=" 提交">
    <input type="reset" value="重填"></p>
  </form>
</body>
</html>
