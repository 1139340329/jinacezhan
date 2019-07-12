<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改</title>
<%--	<script type="text/javascript" src="js/jquery.js" ></script>
	<script type="text/javascript">
		$(function(){
			$("[value='删除']").click(function(){
				var kid = $("[name='id']").val();
				location.href="/book/deletebook?id="+kid;
			});

		});
	</script>--%>

</head>
<body>
<form action="/update" method="post">
	<input value="${air.aid}" type="hidden" name="aid">
	检测区域：

	<select name="did">
	<option>请选择</option>
	<c:forEach items="${list}" var="c">
		<option value="${c.did}">${c.name}</option>
	</c:forEach>
</select><br>

	检测日期：<input type="text" name="montime" value="<fmt:formatDate value="${air.montime}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>"><br>
	pm10：<input type="text" name="pm10" value="${air.pm10}"><br>
	pm25：<input type="text" name="pm25" value="${air.pm25}"><br>

	检测站：<input type="text" name="monstation" value="${air.monstation}">

	<input type="submit" value="保存">
	<input type="button" value="删除" onclick="javascript:location.href='delete?id=${air.aid}'">
	
	<input type="button" value="返回" onclick="">
</form>
</div>
</body>
</html>