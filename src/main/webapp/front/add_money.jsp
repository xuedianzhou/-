<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'add_money.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>
<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="easyui/demo.css">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<body>
	<form action="add_money" method="post">
		<table>
			<tr>
				<td>uid</td>
				<td><input type="text" name="uid" id="uid"></td>
			</tr>
			<tr>
				<td>accountsum</td>
				<td><input type="text" name="accountsum" id="a"></td>
			</tr>
			<tr>
				<td>frostsum</td>
				<td><input type="text" name="frostsum" id="b"></td>
			</tr>
			<tr>
				<td>sum</td>
				<td><input type="text" name="sum" id="c"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="提交"></td>
			</tr>

		</table>
	</form>
</body>
<script type="text/javascript">
	var a;
	var b;
	$("#a").blur(function() {
		a = $("#a").val();
		$("#c").val(a * 1+b*1);
	})
	$("#b").blur(function() {
		b = $("#b").val();
		$("#c").val(b * 1+a*1);
	})
</script>
</html>
