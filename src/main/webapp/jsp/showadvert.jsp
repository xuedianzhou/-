<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showadvert.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 <link rel="stylesheet" href="layui-v2.3.0/layui/css/layui.css"  media="all">
  </head>
  
  <body>
    <table class="layui-table" lay-size="lg">
    <thead>
		<tr>
			<th>广告名称</th>
			<th>图片</th>
			<th>url</th>
			<th>结算类型</th>
			<th>单价（点击量）</th>
			<th>预算金额</th>
			<th>广告类型</th>
			<th>创建时间</th>
		</tr>
		</thead>
		<c:forEach items="${advert }" var="s">
		<tr>
		
			<td>${s.mname }</td>
			<td><img id="viewImg2" src="${s.mimg }" style="width:80px;height:40px;"></td>
			<td>${s.murl }</td>
			<td>${s.close }</td>
			<td>${s.unit }元</td>
			<td>${s.sum }</td>
			<td>${s.aform }</td>
			<td>${s.ctime }</td>
		</tr>
		</c:forEach>
	</table>
  </body>
</html>
