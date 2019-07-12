<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>展示</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
        $(function(){
            $("tr:odd").css("background-color","#b28fce");
            $("tr:even").css("background-color","#51a8dd");
        })

    </script>


</head>
<body>
<h1>空气质量检测信息库</h1>
	<form action="/getair" method="post">

按区域查询：<input type="text" name="district" value="${disname}">
			<input type="submit"  value="检索">
	</form>
		<a href="/toadd" >添加空气质量信息</a>
	<h3>检索结果</h3>
	<div>

		<c:if test="${pu.total!=0}">
	<table border="1" cellspacing="0" width="70%">
		<tr>
			<td>序号</td>
			<td>区域</td>
			<td>监测时间</td>
			<td>PM10数据</td>
			<td>PM2.5数据</td>
			<td>监测站</td>
		</tr>


		<c:forEach items="${pu.list}" var="pi" varStatus="sta">
		<tr>
			<td>${sta.count}</td>
			<td><a href="/toup?id=${pi.aid}">${pi.district.name}</a></td>
			<td><fmt:formatDate value="${pi.montime}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate> </td>
			<td>${pi.pm10}</td>
			<td>${pi.pm25}</td>
			<td>${pi.monstation}</td>
		</tr>
		</c:forEach>



		<tr>
			<td colspan="4">
			<a href="/getair?district=${disname}">首页</a>&nbsp;
			<a href="/getair?index=${pu.prePage==0?1:pu.prePage}&district=${disname}">上一页</a>&nbsp;
			<a href="/getair?index=${pu.nextPage==0?pu.pages:pu.nextPage}&district=${disname}">下一页</a>&nbsp;
			<a href="/getair?index=${pu.pages}&district=${disname}">尾页</a>&nbsp;
			第${pu.pageNum}页/共${pu.pages}页&nbsp;
			共${pu.total}条<br>
			</td>
		</tr>
	</table>
			</c:if>
			<c:if test="${pu.total==0}">

		<table border="1" cellspacing="0" width="70%">
			<tr>
				<td>序号</td>
				<td>区域</td>
				<td>监测时间</td>
				<td>PM10数据</td>
				<td>PM2.5数据</td>
				<td>监测站</td>
			</tr>
		</table>

				<h1>张莹大傻蛋</h1>

			</c:if>

	</div>
	<br>
	
</body>
</html>