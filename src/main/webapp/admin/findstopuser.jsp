<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'findstopuser' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="layui-v2.3.0/layui/css/layui.css"
	media="all">
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript" src="layui-v2.3.0/layui/layui.js"></script>
</head>

<body>
	<div style="margin-bottom: 5px;">

		<!-- 示例-970 -->
		<ins class="adsbygoogle"
			style="display:inline-block;width:970px;height:90px"
			data-ad-client="ca-pub-6111334333458862" data-ad-slot="3820120620"></ins>

	</div>
	<table class="layui-table"
		lay-data="{width: 1500, height:332, url:'findstop', page:true, id:'idTest'}"
		lay-filter="demo">
		<thead>
			<tr>
				<th lay-data="{field:'uid', width:150, sort: true, fixed: true}">ID</th>
				<th lay-data="{field:'uname', width:150}">用户名</th>
				<th lay-data="{field:'phone', width:150, sort: true}">电话</th>
				<th lay-data="{field:'proof', width:150, sort: true}">身份证</th>
				<th lay-data="{field:'ctime', width:150, sort: true}">创建时间</th>
				<th lay-data="{field:'uptime', width:150, sort: true}">修改时间</th>
				<th
					lay-data="{field:'state', width:150, sort: true,templet:'#state'}">用户状态

				</th>

				<th
					lay-data="{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}">操作</th>
			</tr>
		</thead>
	</table>
	<!-- 数据转义 -->
	<script type="text/html" id="state">
  	 {{#  if(d.state =='0'){ }}
     使用中
        {{#  } else { }}
     		    禁用
        {{#  } }}

				</script>
	<script type="text/html" id="barDemo">
<a class="layui-btn layui-btn-xs" lay-event="edit">账户解冻</a>
</script>
	<script>
		layui.use('table', function() {
			var table = layui.table;

			//监听工具条
			table.on('tool(demo)', function(obj) {
				var data = obj.data;
				if (obj.event === 'edit') {
					layer.confirm('确定执行此操作？', function(index) {
						$.get("upstate", {
							id : data.uid,
							state:0
						}, function(data) {
							if (data == false) {
								layer.msg('正在使用中,不能冻结此用户!');
							
							} else {
								layer.msg('操作成功');
								table.reload('idTest');
							}
							;
						});
					});
					
					layer.close(index);
				}
			});
			
			$('.demoTable .layui-btn').on('click', function() {
				var type = $(this).data('type');
				active[type] ? active[type].call(this) : '';
			}); 
		});
	</script>
</body>

</html>

