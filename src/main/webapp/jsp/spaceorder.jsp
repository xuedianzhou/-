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

<title>My JSP 'spaceorder.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="layui-v2.3.0/layui/layui.all.js"></script>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<link rel="stylesheet" href="css/styled.css" tppabs="css/style.css" />
<link rel="stylesheet" href="css/youxia.css" tppabs="css/youxia.css" />
<script type="text/javascript" src="js/ssd.js"></script>
<script type="text/javascript" src="layui-v2.3.0/layui/layui.js"></script>
<link rel="stylesheet" href="layui-v2.3.0/layui/css/layui.css"
	tppabs="layui-v2.3.0/layui/css/layui.css" />
<style type="text/css">
table tr td {
	font-size: 16px;
	height: 50px;
	width: 10%;
}
</style>
</head>

<body>
	<table border="1px solid green">
		<caption>广告详情</caption>
		<c:forEach items="${list }" var="l">
			<tr>
				<td>广告名称：</td>
				<td>${l.mname}</td>
			</tr>
			<tr>
			<tr>
				<td>广告类型：</td>
				<td>${l.aform}</td>
			</tr>
			<tr>
				<td>结算类型：</td>
				<td>${l.close}</td>
			</tr>
			<tr>
				<td>单价：</td>
				<td>${l.unit}</td>
			</tr>
			<tr>

				<td><input type="hidden" id="uid" value="${l.uid }"> <input
					type="hidden" id="price" value="${l.unit }"> <input
					type="hidden" id="aid" value="${l.aid }"> 广告简介：</td>
				<td>${l.remark}</td>
			</tr>
			
		</c:forEach>
	</table>


	<button class="layui-btn layui-btn-primary btn" id="asid">推广获取代码</button>
	<div class="layui-tab layui-tab-card" id="add-main"
		style="display: none;width: 395px">
		<ul class="layui-tab-title">
			<li class="layui-this">页面漂浮广告</li>
			<li>右下角弹窗广告</li>
			<li>自行推广</li>
		</ul>

		<div class="layui-tab-content" style="height: auto;">
			<div class="layui-tab-item layui-show">
				页面漂浮广告：
				<button id="myBtn" class="layui-btn layui-btn-xs">点我</button>
				<br /> 引用路径：
				<textarea disabled="disabled" class="layui-textarea"
					style="height: 40px"><SCRIPT
						src="https://www.jb51.net/adtest/11/js/js.js"></SCRIPT></textarea>
				js代码：
				<textarea id="absp" disabled="disabled" class="layui-textarea"
					style="height: 160px;">
					</textarea>
			</div>
			<div class="layui-tab-item">
				右下角弹窗广告：
				<button id="myBtn1" class="layui-btn layui-btn-xs">点我</button>
				<br /> 引用路径：
				<textarea disabled="disabled" class="layui-textarea"
					style="height: 40px">
<link rel="stylesheet"
						href="http://localhost:8080/AdCenter/css/youxia.css"
						tppabs="css/youxia.css" />
<script type="text/javascript"
						src="http://localhost:8080/AdCenter/js/jquery-3.1.1.js"></script>
<script type="text/javascript"
						src="http://localhost:8080/AdCenter/js/youxia.js"></script>
 </textarea>
				js代码：
				<textarea id="absp2" disabled="disabled" class="layui-textarea"
					style="height: 160px;">
					</textarea>
			</div>
			<div class="layui-tab-item">
				图片路径：
				<textarea id="absp3" disabled="disabled" class="layui-textarea"
					style="height: 40px">
					</textarea>
				url:
				<textarea id="absp4" disabled="disabled" class="layui-textarea"
					style="height: 160px;">
					</textarea>
			</div>
		</div>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<button type="reset" class="layui-btn layui-btn-lg"
			id="btn">创建订单</button>
	</div>



	<DIV id="img1"
		style="Z-INDEX: 100; LEFT: 2px; WIDTH: 59px; POSITION: absolute; TOP: 43px; HEIGHT: 61px;visibility: visible;display: none;">
		<a href="https://www.baidu.com/" target="_blank"> <img
			src="img/dcy/timg.jpg" width="160" height="120" border="0">
		</a>
	</DIV>
	<script type="text/javascript"
		src="https://www.jb51.net/adtest/11/js/js.js">
		
	</script>

	<div id="img2" class="lanrenzhijia" style="display: none;">
		<a href="javascript:" class="close">关闭</a> <a href="jsp/success.jsp">
			<img class="img" alt=""
			src="http://bpic.588ku.com/element_origin_min_pic/18/06/10/707781de7ee0fe7e9e7098cc283ac5ee.jpg">
		</a>
	</div>

</body>
<script type="text/javascript">
	$("#btn").click(function() {
		$.post("advert/addspaceorder", {
			"uid" : $("#uid").val(),
			"aid" : $("#aid").val(),
			"price" : $("#price").val(),
		}, function(data) {
			if (data == "ok") {
				alert("订单创建成功");
				window.location="advert/product";
			} else {

			}
		})
	})

	$("#asid")
			.click(
					function() {
						var aid = $("#aid").val();
						alert(aid);
						var cid = "cid=" + aid;
						$
								.ajax({
									url : "advert/qm",//后台请求的数据，用的是PHP
									dataType : "json",//数据格式 
									type : "post",//请求方式
									data : cid,
									dataType : "json",
									success : function(data) {//如果请求成功，返回数据。
										var html = "";
										var html2 = "";
										var html3 = "";
										var html4 = "";
										var style = "";
										var target = "_blank";
										var width = "160";
										var height = "120";
										var border = "0";
										var js1s = "https://www.jb51.net/adtest/11/js/js.js";
										var js2s = "<SCRIPT src=";
		var ads="/SCRIPT>";
										var img = "http://localhost:8080/AdCenter/";
										for (var i = 0; i < data.length; i++) {
											var ls = data[i];
											var imgs = img + ls.mimg;
											var id = "?aid=" + ls.mid;
											var uid = "&uid=" + ls.uid;
											html += "<DIV id=img1 style=\"Z-INDEX: 100; LEFT: 2px; WIDTH: 59px; POSITION: absolute; TOP: 43px; HEIGHT: 61px;visibility: visible;"+"\"><a href=\""+ls.murl+id+uid+"\" target=\""+target+"\"><img src=\""+imgs+"\" width=\""+width+"\" height=\""+height+"\" border=\""+border+"\"></a></DIV>";
											html2 += "<div class=\"lanrenzhijia\"><a href=\"javascript:\" class=\"close\">关闭</a><a href=\""+ls.murl+id+uid+"\"><img class=\"img\" src=\""+imgs+"\"></a></div>";
											html3 += imgs;
											html4 += ls.murl;
										}
										$("#absp").html(html);
										$("#absp2").html(html2);
										$("#absp3").html(html3);
										$("#absp4").html(html4);
									}
								})
						//页面层-自定义
						layer.open({
							type : 1,
							title : "添加广告模板",
							closeBtn : false,
							shift : 1,
							area : [ '400px', '500px' ],
							shadeClose : true,
							// btn: ['新增', '取消'],
							// btnAlign: 'c',
							content : $("#add-main"),
							success : function(layero, index) {
							},
							yes : function() {
							}
						});
					});
</script>
<script>
	var myBtn = document.getElementById('myBtn');
	var myDiv = document.getElementById('myDiv');
	myBtn.onclick = function() {
		var val = img1.style.display;
		if (val == 'none') {
			img1.style.display = 'block'; //显示
		} else {
			img1.style.display = 'none'; //隐藏
		}
	}
</script>
<script>
	var myBtn1 = document.getElementById('myBtn1');
	myBtn1.onclick = function() {
		var val = img2.style.display;
		if (val == 'none') {
			img2.style.display = 'block'; //显示
		} else {
			img2.style.display = 'none'; //隐藏
		}
	}
</script>
<script>
	$(function() {
		$('.lanrenzhijia').animate({
			right : '10px'
		}, 1000);
		$('.lanrenzhijia .close').click(function() {
			$('.lanrenzhijia').hide();
		});
	});
</script>
</html>
