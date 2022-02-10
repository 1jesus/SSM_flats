<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>XX系统 - 房屋信息更新</title>
    <base href="<%=basePath%>">

    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
    <h3>更新房屋信息</h3>
    <form action="house/update2.do" method="post" enctype="multipart/form-data"><%-- enctype="multipart/form-data"--%>
        <table class="form-table">
            <tr hidden>
                <td>标识</td>
                <td colspan="3" class="control">
                    <input type="text" name="hid" placeholder="标识" value="${houseById.hid}">
                </td>
            </tr>
            <tr>
                <td>地区</td>
                <td colspan="3" class="control">
                    <input type="text" name="haddress" placeholder="填写地区" value="${houseById.haddress}">
                </td>
            </tr>
            <tr>
                <td>小区名字</td>
                <td colspan="3" class="control">
                    <input type="text" name="" placeholder="小区名字" value="">
                </td>
            </tr>
            <tr>
                <td>单元号</td>
                <td colspan="3" class="control">
                    <input type="text" name="" placeholder="单元号" value="">
                </td>
            </tr>
            <tr>
                <td>楼层</td>
                <td colspan="3" class="control">
                    <input type="text" name="hfloor" placeholder="楼层" value="${houseById.hfloor}">
                </td>
            </tr>
            <tr>
                <td>房间号</td>
                <td colspan="3" class="control">
                    <input type="text" name="hroomNum" placeholder="房间号" value="${houseById.hroomNum}">
                </td>
            </tr>
            <tr>
                <td>面积（平米）</td>
                <td colspan="3" class="control">
                    <input type="text" name="harea" placeholder="面积" value="${houseById.harea}">
                </td>
            </tr>
            <tr>
                <td>朝向</td>
                <td colspan="3" class="control">
                    <input type="text" name="hdir" placeholder="朝向" value="${houseById.hdir}">
                </td>
            </tr>
            <tr>
                <td>装修</td>
                <td colspan="3" class="control">
                    <select name="hdeco">
                        <option>装修</option>
                        <option ${houseById.hdeco ==1 ? 'selected': ''} value="1">精装</option>
                        <option ${houseById.hdeco ==2 ? 'selected': ''} value="2">简装</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>是否双气</td>
                <td colspan="3" class="control">
                    <select name="hair">
                        <option>是否双气</option>
                        <option ${houseById.hair ==1 ? 'selected': ''} value="1">双气</option>
                        <option ${houseById.hair ==2 ? 'selected': ''} value="2">单气</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>限住人数</td>
                <td colspan="3" class="control">
                    <input type="text" name="" placeholder="限住人数" value="">
                </td>
            </tr>
            <tr>
                <td>配套设施</td>
                <td colspan="3" class="control">
                    <input type="text" name="" placeholder="配套设施" value="">
                </td>
            </tr>
            <tr>
                <td>出租价格（元/月）</td>
                <td colspan="3" class="control">
                    <input type="text" name="hprice" placeholder="出租价格" value="${houseById.hprice}">
                </td>
            </tr>
            <tr>
                <td>出租状态</td>
                <td colspan="3" class="control">
                    <select name="hrentStatus">
                        <option>出租状态</option>
                        <option ${houseById.hrentStatus == 1 ? 'selected': ''} value="1">已出租</option>
                        <option ${houseById.hrentStatus == 2 ? 'selected': ''} value="2">未出租</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>房屋图片</td>
                <td colspan="3" class="control">
                    <p><img src="${houseById.himage}" width="200px" height="150px">
                    </p><%--width="300px" height="200px"--%>
                    <input type="file" name="himagefile2">
                </td>
            </tr>
            <tr>
                <td>完整地址信息</td>
                <td colspan="3" class="control">
                    <input type="text" name="" placeholder="完整地址信息" value=""><%--郑州市经济开发区xxx路xx号xx小区xx号楼xx单元xx层xx室--%>
                </td>
            </tr>

            <tr>
                <td>备注说明</td>
                <td colspan="3" class="control">
                    <textarea class="p100" name="" placeholder="备注说明信息">房屋备注说明信息</textarea>
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
