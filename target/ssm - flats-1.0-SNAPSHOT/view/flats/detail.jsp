<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>XX系统 - 房屋信息详情查看</title>
    <base href="<%=basePath%>">

    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
    <h3>房屋信息详情</h3>
    <form action="house/detail.do" method="post">
        <table class="form-table">
            <tr>
                <td class="label">地区</td>
                <td class="detail">
                    ${detailHouse.haddress}
                </td>
            </tr>
            <tr>
                <td class="label">小区</td>
                <td colspan="3" class="detail">
                </td>
            </tr>
            <tr>
                <td class="label">单元号</td>
                <td colspan="3" class="detail">
                </td>
            </tr>
            <tr>
                <td class="label">楼层</td>
                <td colspan="3" class="detail">
                    ${detailHouse.hfloor}
                </td>
            </tr>
            <tr>
                <td class="label">房间号</td>
                <td colspan="3" class="detail">
                    ${detailHouse.hroomNum}
                </td>
            </tr>
            <tr>
                <td class="label">面积(平米)</td>
                <td colspan="3" class="detail">
                    ${detailHouse.harea}
                </td>
            </tr>
            <tr>
                <td class="label">朝向</td>
                <td colspan="3" class="detail">
                    ${detailHouse.hdir}
                </td>
            </tr>
            <tr>
                <td class="label">装修</td>
                <td colspan="3" class="detail">
                    ${detailHouse.hdeco ==1 ? '精装':'简装'}
                </td>
            </tr>
            <tr>
                <td class="label">是否双气</td>
                <td colspan="3" class="detail">
                    ${detailHouse.hair ==1 ? '双气':'单气'}
                </td>
            </tr>
            <tr>
                <td class="label">限住人数</td>
                <td colspan="3" class="detail">
                </td>
            </tr>
            <tr>
                <td class="label">配套设施</td>
                <td colspan="3" class="detail">
                </td>
            </tr>
            <tr>
                <td class="label">出租价格(元/月)</td>
                <td colspan="3" class="detail">
                    ${detailHouse.hprice}
                </td>
            </tr>
            <tr>
                <td class="label">出租状态</td>
                <td colspan="3" class="detail">
                    ${detailHouse.hrentStatus == 1 ? '已出租' : '待出租'}
                </td>
            </tr>
            <tr>
                <td class="label">房屋图片</td>
                <td colspan="3" class="detail">
                    <img src="${detailHouse.himage}" width="200px" height="150px">
                </td>
            </tr>
            <tr>
                <td class="label">完整地址信息</td>
                <td colspan="3" class="detail">
                    <%--                    郑州市经济开发区xxx路xx号xx小区xx号楼xx单元xx层xx室--%>
                </td>
            </tr>
            <tr>
                <td class="label">备注说明</td>
                <td colspan="3" class="detail">
                    <%--                    备注说明--%>
                </td>
            </tr>
            <tr>
                <td class="label">添加时间</td>
                <td colspan="3" class="detail">
                    <fmt:formatDate value="${detailHouse.haddTime}" pattern="yyyy-MM-dd"/>
                </td>
            </tr>
            <tr>
                <td class="label">更新时间</td>
                <td colspan="3" class="detail">
                    <fmt:formatDate value="${detailHouse.hupdateTime}" pattern="yyyy-MM-dd"/>
                </td>
            </tr>

        </table>
        <div class="buttons">
            <a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
        </div>
    </form>
</div>
</body>
</html>