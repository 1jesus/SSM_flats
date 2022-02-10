<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>XX系统 - 房租信息更新</title>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="/css/main.css">
    <link rel="stylesheet" href="/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
    <h3>更新房租信息</h3>
    <form action="/rent/update" method="post">
        <table class="form-table">
            <tr hidden>
                <td>标识</td>
                <td colspan="3" class="control">
                    <input type="text" name="rid" placeholder="标识" value="${rent.rid}">
                </td>
            </tr>
            <tr>
                <td>房屋信息</td>
                <td colspan="3" class="control">
                    <input type="text" name="rhid" placeholder="合同号" value="${rent.rhid}">
                </td>
            </tr>
            <tr>
                <td>租户信息</td>
                <td colspan="3" class="control">
                    <input type="text" name="rlid" placeholder="房屋信息" value="${rent.rlid}">
                </td>
            </tr>
            <tr>
                <td>缴纳房租额</td>
                <td colspan="3" class="control">
                    <input type="text" name="rprice" placeholder="租户信息" value="${rent.rprice}">
                </td>
            </tr>
            <tr>
                <td>缴纳时间</td>
                <td colspan="3" class="control">
                    <input type="text" name="rpayTime" placeholder="时间" value="${rent.rpayTime}">
                </td>
            </tr>
        </table>
        <div class="buttons">
            <input class="btn btn-primary va-bottom" type="submit" value="保存">&nbsp;&nbsp;
            <a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
        </div>
    </form>
</div>
</body>
</html>