<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'layui.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
  <link rel="stylesheet" href="layui-v2.4.3/layui/css/layui.css">
 <script type="text/javascript" src="js/jquery-1.9.1.js"></script>
 <script type="text/javascript"src="https://cdn.goeasy.io/goeasy.js"></script>  
   <style type="text/css">
    a{
     background-color: #05c0bd;
     font-weight:800;
    }
    a:HOVER {
	background-color: #05c0bd
}
#udesk-feedback-tab {
    position: fixed;
    right: 2px;
    top: 65%;
    margin-top: -76px;
    -webkit-box-shadow: #DDD 0px -1px 5px;
    -moz-box-shadow: #DDD 0px -1px 5px;
    box-shadow: #DDD 0px -1px 5px;
    z-index: 10000;
    cursor: pointer;
    background-image: url(../img/zxd/consult_icon.gif);
    background-repeat: no-repeat;
    background-position: center top;
    display: block;
    height: 76px;
    width: 82px;
    background-color: #FFF!important;
    z-index:999;
}
   </style>

   
   <script type="text/javascript">
    var uid=${list.get(0).uid}
   var goEasy = new GoEasy({appkey: 'BC-d28d9b29a88a4676875adacee352444a'});
   goEasy.subscribe({
   channel: 'user'+uid,
   onMessage: function(message){
   console.log(message);
  
    $("#a").html(message.content);
   }
   });
   </script>
  </head>
      <img style="margin-left: 180" src="img/zxd/xiaoxi.jpg"><span id="a"></span>
  <body  class="layui-layout-body" style="background-color: #f6f6f6;margin-top:20" >
        <input type="hidden" id="uid" name="uid" value="${list.get(0).uid }">
	 <div class="layui-layout layui-layout-admin">
		<div class="layui-header" style="background-color: #05c0bd">
			<div class="layui-logo" style="margin-left: 100">独秀</div>
			<ul class="layui-nav layui-layout-left" style="margin-left: 100;">
				<li class="layui-nav-item"><a
					href="center?uid=${list.get(0).uid }" target="right" style="font-size:16px">个人中心</a></li>
				<li class="layui-nav-item"><a href="grouping" tppabs="grouping"
					target="right" style="font-size:16px" >发布广告位</a></li>
				<li class="layui-nav-item"><a href="front/sites.jsp"
					tppabs="front/sites.jsp" target="right" style="font-size:16px">网站主认证</a></li>
			</ul>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="javascript:;" style="font-size:16px"> <img
						src="${list.get(0).userimg }" class="layui-nav-img"> ${uname}
				</a>
			    </li>
				<li class="layui-nav-item"><a href="" style="font-size:16px">退了</a></li>
			</ul>
		</div>

		<div class="layui-side layui-bg-black" style="margin-left: 100; margin-top:38"">
				<div class="layui-side-scroll" style="background-color: #ffffff">
					<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
					<ul class="layui-nav layui-nav-tree" lay-filter="test" >
						<li class="layui-nav-item layui-nav-itemed">
							 <dl class="layui-nav-child">
								<dd>
									<b><a href="JavaScript:;" id="test1"  tppabs="javascript:;" target="right" style="font-size:16px;" >广告列表</a></b>
								</dd>
								<dd >
									<b><a href="advert/product" tppabs="advert/product" target="right">广告平台</a></b>
								</dd>
								<dd >
									<b><a href="muban/query" tppabs="muban/query" target="right">广告模板管理</a></b>
								</dd>
								<dd >
									<b><a href="advert/query" tppabs="advert/query" target="right">广告管理</a><b/>
								</dd>
								<dd 
									<b><a href="advert/qname" tppabs="advert/qname" target="right">发布广告</a></b>
								</dd >
								<dd>
									<b><a href="javascript:void(0)"  onclick="updatePwd('修改密码',1)">修改密码</a></b>
								</dd>
							</dl> 
						</li>
					</ul>
				</div>
			</div>

			<div class="layui-body" style="z-index: 0;margin-left: 100;margin-top:20"">
				<!-- 内容主体区域 -->
				<div style="margin-top: 20">
					<iframe src="" tppabs="" name="right" frameborder="0" width="100%" height="600"></iframe>
				</div>
			</div>

		</div> 
		
	
      <a target="_blank"  href="http://wpa.qq.com/msgrd?v=1&uin=2801216529&site=qq&menu=yes" id="udesk-feedback-tab" class="udesk-feedback-tab-left" style="display: block; background-color: black;"></a>

<!--qq聊天代码部分end-->


	</body>
	 <script src="js/jquery-1.8.3.js"></script> 
	<script src="layer-v3.1.1/layer/layer.js"></script>
 
<script>
 //JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;
  
}); 


</script>

<script type="text/javascript">
$('#test1').on('click', function(){
	$.ajax({
		url:"state",
		data:{ 
			uid : $("#uid").val()
		},
		type:"post",
		success:function(data){
			if(data!="1"){
				 layer.open({
					  type: 1 //Page层类型
					  ,area: ['600px', '450px']
					  ,title: '提示信息'
					  ,shade: 0.6 //遮罩透明度
					  ,maxmin: true //允许全屏最小化
					  ,anim: 1 //0-6的动画形式，-1不开启
					  ,btn:['取消<a href="front/sites.jsp" tppabs="front/sites.jsp" target="right" class="layui-btn">绑定一个网站</a>']
					  ,content: '<center><p style="margin-top:20"><b><h2>绑定网站</h2></b></p><p style="margin-top:20"><h3>请先至少提交一个网站，即可获取广告代码，赚取佣金。</h3></p></center><img src="img/zxd/TT.jpg"  style="margin-left:210;margin-top:50;width="150px";height="100px" ><div style="margin-left: 240;margin-top: 50"></div>'
					});     
			}else{
				window.location="front/AdvertisingList.jsp";
			}
		}
	});
 });
 
</script>
</html>
