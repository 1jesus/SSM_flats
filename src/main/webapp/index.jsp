<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <meta charset="UTF-8">
    <base href="<%=basePath%>" />
    <title>XX系统 - 登录页面</title>

    <link rel="stylesheet" href="css/index.css">
</head>
<body>
<div class="login">
    <img src="image/logo.png" alt="智游">
    <p>XX系统</p>
    <form action="user/login.do" method="post">
        <div>
            <input type="text" id="username" name="uname" value="" placeholder="请输入用户名">
        </div>
        <div>
            <input type="password" id="password" name="upassword" value="" placeholder="请输入密码">
        </div>
        <div>
            <p class="error-message">${loginErrMsg}</p>
            <input type="submit" value="登录">
        </div>
    </form>
</div>
<script>
    if (window.top !== window) {
        window.top.location.reload();
    }
</script>
</body>
</html>
