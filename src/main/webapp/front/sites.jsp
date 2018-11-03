<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@ page language="java"%>
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.*"%> 
<%@ page import="java.text.*"%> 

<html>
  <head>
  <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="layui-v2.4.3/layui/css/layui.css" media="all">
</head>
  
 <body style="margin-top: 10">        
<form class="layui-form" action="a" method="post">
  <div class="layui-form-item" style="width:500px">
    <label class="layui-form-label">网站域名</label>
    <div class="layui-input-block">
      <input type="text"  name="dns" lay-verify="title" autocomplete="off" placeholder="请输入域名" class="layui-input">
    </div><br/>
  
  <label class="layui-form-label">网站名称</label>
    <div class="layui-input-block">
      <input type="text"  name="sitesurl" lay-verify="title" autocomplete="off" placeholder="网站名称" class="layui-input">
    </div><br/>
  
    <div class="layui-form-item" >
    <label class="layui-form-label">日均访问量</label>
    <div class="layui-input-block">
      <select name="pv" lay-filter="aihao">
        <option value="1千以下">1千以下</option>
        <option value="1千-1万">1千-1万</option>
        <option value="1万-10万">1万-10万</option>
        <option value="10万以上">10万以上</option>
      </select>
    </div>
    
  </div>
  
  <label class="layui-form-label">分组名称</label>
    <div class="layui-input-block">
      <input type="text"  name="grouping" lay-verify="title" autocomplete="off" placeholder="分组名称" class="layui-input">
    </div><br/>
    
    <label class="layui-form-label">备案号</label>
    <div class="layui-input-block">
      <input type="text"  name="pc" lay-verify="title" autocomplete="off" placeholder="备案号" class="layui-input">
    </div><br/>
    
    <label class="layui-form-label">网站主id</label>
    <div class="layui-input-block">
      <input type="text"  name="uid" lay-verify="title" autocomplete="off" value="${list.get(0).uid }" disabled="disabled"  class="layui-input">
    </div><br/>
    
   <label class="layui-form-label">创建时间</label>
    <div class="layui-input-block">
      <input type="hi"  name="ptime" lay-verify="title" autocomplete="off" value="<% out.print(new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())); %>" disabled="disabled"  class="layui-input">
    </div><br/>
    
    <label class="layui-form-label">地址</label>
    <div class="layui-input-block">
      <input type="text"  name="address" lay-verify="title" autocomplete="off" placeholder="请输入域名" class="layui-input">
    </div><br/>
    
       <div class="layui-form-item" >
    <label class="layui-form-label">行业类别</label>
    <div class="layui-input-block">
      <select name="sort" lay-filter="aihao">
        <option value="0">电子</option>
        <option value="1">服装</option>
        <option value="2">食品</option>
        <option value="3">皮业</option>
      </select>
    </div><br/>
     <div class="layui-form-item">
    <div class="layui-input-block">
        <input type="submit" class="layui-btn" lay-submit="" lay-filter="demo1" value="立即提交">
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
   
</form>
  
    
  </body>
  <script src="layui-v2.4.3/layui/layui.js" charset="utf-8"></script>
  <script type="text/javascript">
  layui.use('form', function(){
	  var form = layui.form; //只有执行了这一步，部分表单元素才会自动修饰成功
	  
	  //……
	  
	  //但是，如果你的HTML是动态生成的，自动渲染就会失效
	  //因此你需要在相应的地方，执行下述方法来手动渲染，跟这类似的还有 element.init();
	  form.render();
	});   
  
  </script>
</html>
