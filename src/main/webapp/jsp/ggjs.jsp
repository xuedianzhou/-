<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ggjs.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<script type="text/javascript" src="layui-v2.3.0/layui/layui.all.js"></script>
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<link rel="stylesheet" href="css/style.css" tppabs="css/style.css" />
		<link rel="stylesheet" href="css/youxia.css" tppabs="css/youxia.css" />
		<script type="text/javascript" src="js/ssd.js"></script>
		<script type="text/javascript" src="layui-v2.3.0/layui/layui.js"></script>
		<link rel="stylesheet" href="layui-v2.3.0/layui/css/layui.css" tppabs="layui-v2.3.0/layui/css/layui.css" />
  
  </head>
  
  <body>
  			<ul class="layui-tab-title">
  				<li class="layui-this">普通推广</li>
   		 		<li>自行推广</li>
  			</ul>
  			
  			<div  class="layui-tab-content" style="height: auto;">
    			<div class="layui-tab-item layui-show" >
    				页面漂浮广告：<button id="myBtn" class="layui-btn layui-btn-xs">点我</button>
    				<textarea disabled="disabled" name="" required lay-verify="required" placeholder="请输入" class="layui-textarea">
    				
<DIV id="img1" style="Z-INDEX: 100; LEFT: 2px; WIDTH: 59px; POSITION: absolute; TOP: 43px; HEIGHT: 61px;visibility: visible;display: none;">
 	<a href="https://www.baidu.com/" target="_blank">
 		<img src="" width="160" height="120" border="0">
 	</a>
 </DIV>
<SCRIPT src="https://www.jb51.net/adtest/11/js/js.js"></SCRIPT></textarea>

    				右下角弹窗广告：<button id="myBtn1" class="layui-btn layui-btn-xs">点我</button>
    				<textarea disabled="disabled" name="" required lay-verify="required" placeholder="请输入" class="layui-textarea"></textarea>
    			</div>
    		<div class="layui-tab-item">2</div>
 			</div>
  </body>
</html>
