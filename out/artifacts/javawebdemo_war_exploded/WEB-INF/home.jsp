<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2020/1/14
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="errorpage.jsp" %>
<html>
<head>
    <title>后台首页</title>
    <style>
        a {
            text-decoration: none;
        }
        body {
            margin: 0;
        }
        #left {
            width: 20%;
            height: 100%;
            float: left;
            background-color: greenyellow;
        }

        #right {
            width: 80%;
            float: right;
            background-color: salmon;
        }
        #dd{
            display: flex;
            background-color: black;
        }
        #d1 {
            float: left;
            font-size: 8px;
            margin-left: 15px;
            margin-top: 5px;
            color: white;
        }
        #d2 {
            position: absolute;
            top: 5px;
            right: 300px;
            font-size: 10px;
            color: white;
        }
        #d2 a:link{
            color:white;
        }
        #d2 a:visited{
            color:white;
        }
        #d3{
            position: absolute;
            top:5px;
            right: 200px;
            font-size: 10px;
            color: white;
        }
        #d4{
            position: absolute;
            top: 5px;
            right: 100px;
            font-size: 10px;
            color: white;
        }
        #d4 a:link{
            color: white;
        }
        #d4 a:visited{
            color:white;
        }
    </style>
</head>
<body>
<div id="dd">
    <div id="d1">欢迎来到星河电器商城后台管理</div>
    <div id="d2"><a href="/backed/index/home">去首页</a></div>
    <div id="d3">${us.username}，你好</div>
    <div id="d4"><a href="/backed/index">退出</a></div>
</div>
<div id="left">
    <h3><a href="/backed/product/getall">获取所有商品数据</a></h3>
</div>
<div id="right">

</div>
</body>
</html>
