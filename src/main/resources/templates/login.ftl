<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="Author" content="Ma Zekun">
    <meta name="copyright" content="Ma Zekun All Rights Reserved">
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.0/animate.min.css">
        <link href="../static/css/style.css" rel="stylesheet" type="text/css"/>
        <link href="../static/css/weather.css" rel="stylesheet" type="text/css"/>
    </head>
<body class="body">
<div class="wrapper">
    <br>
    <br>
    <br>
    <br>
    <br>
    <pre class="slogan">
  __                                    
 / /       /  |                /|/|     
( /   ___ (___|      ___      ( / | ___ 
 /  )|___)|\   |   )|   )     |   )|   )
/__/ |__  | \  |__/ |  /      |  / |__/|
</pre>
    <tr>
        <th>City：</th>
        <th>${weather.city}</th>
        <th>Weather：</th>
        <# if weather.todayWeather == "晴">
        <th>
            <div class="sun"></div>
        </th>
    </tr>
    <br>
    <br>
    <br>
    <br>
    <br>
    <div class="lableimage">
        <img id="image" src="../templates/images/heart.png" href=""/>
        <img id="image" src="../templates/images/middle.png" href=""/>
        <img id="image" src="../templates/images/tomainpage.png" href="${request.contextPath}/mainpage"/>
    </div>
    <br>
    <img src="https://img.shields.io/badge/WeiBo-Daylightmazekun-orange.svg"
         href="https://weibo.com/u/3196240693?is_all=1"/>
    <img src="https://img.shields.io/badge/EMail-mazekun%40outlook.com-green.svg" href=""/>
    <img src="https://img.shields.io/badge/Github-Daylightmazekun-red.svg" href=""/>

    <div class="panel-body">
        <form id="loginForm" action="/login" method="post">
            <table align="center">
                <tr>
                    <td>用户名：</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>密码：</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <button type="submit">登录</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>


</div>

</body>
</html>

