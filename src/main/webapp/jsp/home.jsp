<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'home.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="css/layui.css">

  </head>
  
  <body class="layui-layout-body" style="overflow-y: hidden" >
		<div class="layui-layout layui-layout-admin">
			<div class="layui-header">
				<div class="layui-logo">A+广告联盟</div>
				<!-- 头部区域（可配合layui已有的水平导航） -->

				<ul class="layui-nav layui-layout-right">
					<li class="layui-nav-item">
						<a href="javascript:;">
							<img src="images/1.gif"  class="layui-nav-img"> 管理员
						</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="">个人中心</a>
							</dd>
						</dl>
					</li>
					<li class="layui-nav-item">
						<a href="jsp/login.jsp">退了</a>
					</li>
				</ul>
			</div>

			<div class="layui-side layui-bg-black">
				<div class="layui-side-scroll">
					<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
					<ul class="layui-nav layui-nav-tree" lay-filter="test">
						<li class="layui-nav-item layui-nav-itemed">
							<a class="" href="javascript:;">菜单栏</a>
							<dl class="layui-nav-child">
								<dd>
									<a href="advert/product" tppabs="advert/product" target="right">广告平台</a>
								</dd>
								<dd>
									<a href="muban/query" tppabs="muban/query" target="right">广告模板管理</a>
								</dd>
								<dd>
									<a href="advert/query" tppabs="advert/query" target="right">广告管理</a>
								</dd>
								
								<dd>
									<a href="advert/qname" tppabs="advert/qname" target="right">发布广告</a>
								</dd>

							</dl>
						</li>
						
						
					</ul>
				</div>
			</div>

			<div class="layui-body" style="z-index: 0;">
				<!-- 内容主体区域 -->
				<div>
					<iframe src="advert/product" tppabs="advert/product" name="right" frameborder="0" width="100%" height="600"></iframe>
				</div>
			</div>

			<div class="layui-footer">
				<!-- 底部固定区域 -->
				底部固定区域
			</div>
		</div>
		
		<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
		<script type="text/javascript" src="js/plugs.js">
		</script>
		<script type="text/javascript">
			//添加编辑弹出层
			function updatePwd(title, id) {
				$.jq_Panel({
					title: title,
					iframeWidth: 500,
					iframeHeight: 300,
					url: "updatePwd.html"/*tpa=http://www.17sucai.com/preview/81082/2018-07-05/ly/updatePwd.html*/
				});
			}
		</script>
		<script src="js/layui.js"></script>
		<script>
			//JavaScript代码区域
			layui.use('element', function() {
				var element = layui.element;

			});
		</script>
  </body>
</html>
