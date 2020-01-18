<%--
  Created by IntelliJ IDEA.
  User: think
  Date: 2020/1/14
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录</title>
    <style>
        body {
            background-image: url("/1.jpg");
            background-size: 100%;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        p {
            size: 20px;
        }

        input {
            width: 180px;
            height: 30px;
        }

        #shouye {
            width: 100%;
            display: flex;
            position: absolute;
            justify-content: center;
            top: 40px;
            font-size: 40px;
            color: red;
        }

        #but{
            width: 80px;
            display: block;
            position: absolute;
            left: 700px;
        }
    </style>
</head>
<p id="shouye">欢迎来到王者荣耀道聚城后台管理系统</p>
<body>
<div>
    <div>
        <div>
            <form action="/backed/user/login" method="post">
                用户名:&nbsp;<input type="text" placeholder="账号" name="username" id="user" onfocus="show('user','请输入用户名！')"
                                 onblur="check('user','用户名不能为空！')"><span id="userspan"></span><br>
                密&nbsp;&nbsp;&nbsp;码:&nbsp;<input type="password" placeholder="密码" name="password" id="ps"
                                                  onfocus="show('ps','请输入密码！')" onblur="check('ps','密码不能为空！')"><span
                    id="psspan"></span><br>
                <input type="submit" value="登录" id="but">
            </form>
        </div>
    </div>
</div>
<script src="js/jquery-3.3.1.js"></script>
<script>
    function show(id, infor) {
        document.getElementById(id + "span").innerHTML = "<font color='red'>" + infor + "</font>";
    }

    function check(id, infor) {
        var x = document.getElementById(id);
        if (x.value == "") {
            document.getElementById(id + "span").innerHTML = "<font color='red'>" + infor + "</font>";
        } else {
            document.getElementById(id + "span").innerHTML = "";
        }
    }
</script>
</body>
</html>
