<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addadvert.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="layui-v2.3.0/layui/css/layui.css"  media="all">
	<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
  </head>
  
  <body>
  <input type="hidden" id="ass" value=${ass }>
  	<form class="layui-form" action="advert/insert" method="post">
  	<!--备注  -->
  <div class="layui-form-item">
    <label class="layui-form-label">标题</label>
    <div class="layui-input-block" style="width: 400px;">
      <input type="text" name="remark" lay-verify="title" autocomplete="off" placeholder="请输入一个让那些家里有网站的人一个震惊的标题" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">结算类型</label>
    <div class="layui-input-block" style="width: 400px;">
      <input type="text" name="close" lay-verify="required" placeholder="" autocomplete="off" value="点击量" class="layui-input" disabled="disabled">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">广告模板</label>
    <div class="layui-input-block"style="width: 400px;">
      <select name="mid" lay-filter="aihao">
      <c:forEach items="${qname }" var="q">
        <option value="${q.mid }">${q.mname }</option>
        </c:forEach>
        
      </select>
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">广告类型</label>
    <div class="layui-input-block"style="width: 400px;">
      <select name="aform" lay-filter="aihao">
        <option value=""></option>
        <option value="女装">女装</option>
        <option value="男装" selected="">男装</option>
        <option value="美妆">美妆</option>
        <option value="电子产品">电子产品</option>
        <option value="汽车">汽车</option>
        <option value="医药保健">医药保健</option>
        <option value="其它">其它</option>
      </select>
    </div>
  </div>
  
   <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">单价</label>
      <div class="layui-input-inline" style="width: 200px;">
        <input type="text" name="unit" placeholder="￥" autocomplete="off" class="layui-input">
      </div>
    </div>
  </div>
  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">金额预算</label>
      <div class="layui-input-inline" style="width: 200px;">
        <input type="text" name="sum" placeholder="￥" autocomplete="off" class="layui-input">
      </div>
    </div>
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" type="submit">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>
  </body>
  <script src="layui-v2.3.0/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  
  //日期
  laydate.render({
    elem: '#date'
  });
  laydate.render({
    elem: '#date1'
  });
  
  //创建一个编辑器
  var editIndex = layedit.build('LAY_demo_editor');
 
  //自定义验证规则
  form.verify({
    title: function(value){
      if(value.length < 5){
        return '标题至少得5个字符啊';
      }
    }
    ,pass: [/(.+){6,12}$/, '密码必须6到12位']
    ,content: function(value){
      layedit.sync(editIndex);
    }
  });
  
  //监听指定开关
  form.on('switch(switchTest)', function(data){
    layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
      offset: '6px'
    });
    layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
  });
  
  //监听提交
  form.on('submit(demo1)', function(data){
    layer.alert(JSON.stringify(data.field), {
      title: '最终的提交信息'
    })
    return false;
  });
 
});
</script>
<script type="text/javascript">
window.onload=function (){
	var ass=document.getElementById("ass").value;
	if(ass==1){
		layer.msg('添加成功'); 
	}else{
		if(ass==2){
		layer.msg('余额不足请充值');
		}
	}
}
</script>
</html>
