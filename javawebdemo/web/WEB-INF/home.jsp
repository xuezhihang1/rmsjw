<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2020/1/14
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="errorpage.jsp"%>
<html>
<head>
    <title>后台首页</title>
    <style>
        #left{
            width: 20%;
            height: 100%;
            float: left;
            background-color: greenyellow;
        }
        #right{
            width: 80%;
            float: right;
            background-color: salmon;
        }
    </style>
</head>
<body>
<div id="left">
    <p>
        <h2><a href="/backed/index/home">回到首页</a></h2>
    </p>
    <h1>欢迎${us.username}登录</h1>
    <h3><a href="/backed/product/getall">获取所有商品数据</a></h3>
</div>
<div id="right">

</div>
</body>
</html>
