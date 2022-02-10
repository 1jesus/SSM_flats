<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>XX系统 - 房租信息管理</title>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
    <h3>房租信息管理</h3>
    <div class="actions">
        <div>
            <a class="btn btn-primary" href="WEB-INF/jsp/view/rent/add.jsp">添加房租信息</a>
        </div>
    </div>
    <div style="margin-top: 10px">
        <form action="rent/list.do" method="get">
            <select name="field">
                <option value="rhid">房屋信息</option>
                <option value="rlid">租户信息</option>
            </select>
            <input type="text" placeholder="输入关键字" name="keyWord" value="${keyWord}">
            <input type="submit" value="搜索">
        </form>
    </div>
    <table class="list">
        <tr>
            <th>标识</th>
            <th>房屋信息</th>
            <th>租户信息</th>
            <th>缴纳房租额</th>
            <th>缴纳时间</th>
            <th>操作</th>
        </tr>
        <c:forEach var="rent" items="${pageInfo.list}">
            <tr>
                <td>${rent.rid}</td>
                <td>${rent.rhid}</td>
                <td>${rent.rlid}</td>
                <td>${rent.rprice}</td>
                <td><fmt:formatDate pattern="yyyy-MM-dd" value="${rent.rpayTime}"/></td>
                <td>
                    <a class="fa fa-info" title="详情" href="/rent/detail?rid=${rent.rid}"></a>
                    &nbsp;&nbsp;
                    <a class="fa fa-pencil" title="编辑" href="/rent/update?rid=${rent.rid}"></a>
                    &nbsp;&nbsp;
                    <a class="fa fa-remove" title="删除" href="#" onclick="return confirmDelete(${rent.rid})"></a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div class="pager-info">
        <div>共有 ${pageInfo.total} 条记录，第 ${pageInfo.pageNum}/${pageInfo.pages} 页</div>
        <div>
            <ul class="pagination">
                <c:if test="${pageInfo.isFirstPage}">
                    <li class="paginate_button previous disabled">
                        <a href="<c:url value="rent/list.do?pageNum=${pageInfo.prePage}&field=${field}&keyWord=${keyWord}"/> ">上一页</a>
                    </li>
                </c:if>

                <c:forEach var="page" begin="1" end="${pageInfo.pages}">
                    <li class="${pageInfo.pageNum == page ? 'active':''}">
                        <a href="<c:url value="rent/list.do?pageNum=${page}&field=${field}&keyWord=${keyWord}"/> ">${page}</a>
                    </li>
                </c:forEach>

                <c:if test="${pageInfo.isLastPage}">
                    <li class="paginate_button next disabled">
                        <a href="<c:url value="rent/list.do?pageNum=${pageInfo.nextPage}&field=${field}&keyWord=${keyWord}"/> ">下一页</a>
                    </li>
                </c:if>
            </ul>
        </div>
    </div>
</div>
<script src="lib/jquery/jquery.js"></script>
<script>
    function confirmDelete(rid) {
        if (confirm("确定要删除码？")) {
            alert('发送删除请求，刷新页面（不要异步）');
            window.location = "http://localhost:8080/rent/delete?rid="+rid;
        }
        return false;
    }
</script>
</body>
</html>
