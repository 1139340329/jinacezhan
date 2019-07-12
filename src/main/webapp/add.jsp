<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>增加</title>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
 $(function(){
	 $("form").submit(function(){
		 //验证信息
		 var str=$("[name='cid']").val();
		 if(str=='请选择'){
			 alert("请选择分类");
			 return false;
		 }
		 
		 var title=$("[name='title']").val();
		 if($.trim(title).length==0){
			 alert("请填写标题");
			 return false;
		 }
		 
		 var content=$("[name='content']").val();
		 if($.trim(content).length==0){
			 alert("请填写内容");
			 return false;
		 }
		 
		 return true;
		 
		 
	 });
 })
</script>
</head>
<body>
<h1>添加新条目</h1>
<div>
<form action="/add" method="post">
检测区域：<select name="did">
		<option>请选择</option>
		<c:forEach items="${list}" var="c">
		<option value="${c.did}">${c.name}</option>
		</c:forEach>
	</select><br>
	检测日期：<input type="text" name="montime"><br>
	pm10：<input type="text" name="pm10"><br>
	pm25：<input type="text" name="pm25"><br>

检测站：<input type="text" name="monstation">

	<input type="submit" value="保存">
	<input type="reset" value="重置">
	<input type="button" value="放弃" onclick="">
</form>
</div>
</body>
</html>