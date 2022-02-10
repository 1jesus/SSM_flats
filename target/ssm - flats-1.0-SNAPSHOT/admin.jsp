<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>XX系统 - 后台管理</title>
    <base href="<%=basePath%>">

    <link rel="stylesheet" href="css/admin.css">
    <link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="header">
    <h1><a href="#">XX系统</a></h1>
    <div class="user">
        <a href="#">XX用户</a>
        <a href="login.html">退出</a>
    </div>
</div>
<div class="main">
    <ul class="left-side">
        <li class="menu-title active">
            <a href="#">
                <i class=" fa fa-users"></i>&nbsp;&nbsp;公寓管理
            </a>
        </li>
        <li class="sub-menu">
            <ul>
                <li class="active">
                    <a href="house/list.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;房屋信息
                    </a>
                </li>
                <li>
                    <a href="contract/list.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;租赁合同
                    </a>
                </li>
                <li>
                    <a href="lessee/list.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;租户信息
                    </a>
                </li>
                <li>
                    <a href="rent/list.do" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;房租信息
                    </a>
                </li>

            </ul>
        </li>
        <li class="menu-title">
            <a href="#">
                <i class=" fa fa-file-text"></i>&nbsp;&nbsp;服务管理
            </a>
        </li>
        <li class="sub-menu">
            <ul>
                <li>
                    <a target="pageBox" href="">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;后勤人员
                    </a>
                </li>
                <li>
                    <a target="pageBox" href="">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;修缮记录
                    </a>
                </li>
                <li>
                    <a target="pageBox" href="">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;公寓活动
                    </a>
                </li>

            </ul>
        </li>
        <li class="menu-title">
            <a href="#">
                <i class=" fa fa-sitemap"></i>&nbsp;&nbsp;管理员
            </a>
        </li>
        <li class="sub-menu">
            <ul class="menu">
                <li>
                    <a target="pageBox" href="#">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;角色管理
                    </a>
                </li>
                <li>
                    <a target="pageBox" href=""><%--/admin/list--%>
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;用户管理
                    </a>
                </li>
            </ul>
        </li>
    </ul>
    <div class="right-side">
        <iframe name="pageBox" src="house/list.do?pageNum=1" ></iframe>
        <div class="footer">
            智游教育 ©2018 河南智游臻龙教育科技有限公司
        </div>
    </div>
</div>
<script src="lib/jquery/jquery.js"></script>
<script src="js/admin.js"></script>
</body>
</html>
