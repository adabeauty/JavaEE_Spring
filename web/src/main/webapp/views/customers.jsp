<%--
  Created by IntelliJ IDEA.
  User: hgwang
  Date: 7/17/15
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>课程管理</title>

  <link href="./lib/css/bootstrap.css" rel="stylesheet"/>

  <script src="./lib/js/jquery-1.11.1.min.js"></script>
  <script src="./lib/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="container">
    <nav class="navbar navbar-default">
      <div class="container-fluid">
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav">
            <li><a href="./index"> 首页 </a></li>
            <li><a href="./users">用户管理</a> </li>
            <li><a href="./users">员工管理</a> </li>
            <li><a href="./users">课程管理</a> </li>
            <li class="active"><a href="./customers">顾客管理</a> </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a type="button" href="./logout">退出登录</a></li>
          </ul>
        </div>
      </div>
    </nav>
  </div>
</body>
</html>
