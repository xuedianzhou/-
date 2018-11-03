<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>My JSP 'home.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="layui-v2.3.0/layui/css/layui.css">
<script type="text/javascript" src="layui-v2.3.0/layui/layui.js"></script>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<style type="text/css">
</style>
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header" style="background-color: #708090">
			<div class="layui-logo">
				<h1>Day One</h1>
			</div>
			<!-- 头部区域（可配合layui已有的水平导航） -->
			<ul class="layui-nav layui-layout-left ">
				<li class="layui-nav-item"><a href="admin/home.jsp">控制台</a></li>
				<li class="layui-nav-item"><a href="">消息管理</a></li>
				<li class="layui-nav-item"><a href="admin/finduser.jsp"
					target="option">用户信息</a></li>
				<li class="layui-nav-item"><a href="javascript:;">其它系统</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">计费方式</a>
						</dd>
						<dd>
							<a href="">收费标准</a>
						</dd>
					</dl></li>
			</ul>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"> 欢迎你登录：【
						${name }】 </li>
			</ul>
		</div>

		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll" style="background-color: #708090">
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree " lay-filter="test"
					style="background-color: #708090">
					<li class="layui-nav-item layui-nav-itemed"
						style="background-color: #708090"><a 
						href="javascript:;">审核管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="admin/checkdsp.html" target="option">广告审核</a>
							</dd>
							<dd>
								<a href="admin/checksites.html" target="option">网站审核</a>
							</dd>
							<dd>
								<a href="admin/checkspace.html" target="option">广告位审核</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;">业务信息</a>
						<dl class="layui-nav-child">

							<dd>
								<a href="admin/findadvet.html" target="option">广告主订单信息管理</a>
							</dd>
							<dd>
								<a href="admin/findspace.html" target="option">网站主订单信息管理</a>
							</dd>
							<dd>
								<a href="admin/findrecordl.html" target="option">用户交易记录</a>
							</dd>
							<dd>
								<a href="admin/findfeedback.html" target="option">订单维护</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;">盈利管理</a>
						<dl class="layui-nav-child">

							<dd>
								<a href="admin/findadvet.html" target="option">数据分析</a>
							</dd>
							<dd>
								<a href="admin/findspace.html" target="option">盈利情况</a>
							</dd>
							<dd>
								<a href="admin/findrecordl.html" target="option">账户金额信息</a>
							</dd>

						</dl></li>

				</ul>
			</div>
		</div>

		<div class="layui-body">
			<!-- 内容主体区域 -->
			<iframe id="option" name="option" src="admin/main.html"
				style="overflow: visible;" scrolling="no" frameborder="no"
				width="100%" height="100%"></iframe>
		</div>

		<div class="layui-footer" style="background-color:	#F5F5F5 ">
			<!-- 底部固定区域 -->

			<h3>© 天一广告平台</h3>
		</div>
	</div>
	<script>
		//JavaScript代码区域
		layui.use('element', function() {
			var element = layui.element;

		});
	</script>
</body>
</html>

