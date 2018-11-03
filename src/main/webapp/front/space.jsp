<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
   <head>
  <base href="<%=basePath%>">
    
    <title></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="layui-v2.4.3/layui/css/layui.css" media="all">
  </head>
  
  <body style="margin-top: 10">
      <form class="layui-form" action="add_space" method="post" enctype="multipart/form-data" >
      
      <div class="layui-form-item" style="width:500px">
    <label class="layui-form-label">网站id</label>
    <div class="layui-input-block">
      <input type="text"  name="sitesid" lay-verify="title" autocomplete="off" placeholder="宽" class="layui-input">
    </div><br/>
    
      <div class="layui-form-item" style="width:500px">
    <label class="layui-form-label">宽</label>
    <div class="layui-input-block">
      <input type="text"  name="wide" lay-verify="title" autocomplete="off" placeholder="宽" class="layui-input">
    </div><br/>
    
     <label class="layui-form-label">高</label>
    <div class="layui-input-block">
      <input type="text"  name="high" lay-verify="title" autocomplete="off" placeholder="高" class="layui-input">
    </div><br/>
    
     <label class="layui-form-label">创建人</label>
    <div class="layui-input-block">
      <input type="text"  name="uname" lay-verify="title" autocomplete="off" value="${uname}" disabled="disabled" class="layui-input">
    </div><br/>
    
    <label class="layui-form-label">创建时间</label>
    <div class="layui-input-block">
      <input type="text"  name="ptime" value="<% out.print(new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())); %>"  lay-verify="title" autocomplete="off" disabled="disabled"  class="layui-input">
    </div><br/>
       <div class="layui-form-item" >
    <label class="layui-form-label">所属分组</label>
    <div class="layui-input-block">
      <select name="grouping" lay-filter="aihao">
        <c:forEach items="${list }" var="l">
        <option value="${l.grouping }">${l.grouping }</option>
        </c:forEach>
      </select>
    </div><br/>
    
     <label class="layui-form-label">广告位名称</label>
    <div class="layui-input-block">
      <input type="text"  name="sname" lay-verify="title" autocomplete="off" placeholder="请输入域名" class="layui-input">
    </div><br/>
    
    <label class="layui-form-label">广告图片</label>
  <div style="margin-left: 150px">
   <input type="file"  name="imgs"  id="doc" onchange="javascript:setImagePreview();">
   <div id="localImag"><img id="preview" width=-1 height=-1 style="diplay:none" /></div>
</div><br/>


  <div class="layui-form-item layui-form-text">
    <label class="layui-form-label">备注</label>
    <div class="layui-input-block">
      <textarea placeholder="请输入内容" name="remark" class="layui-textarea"></textarea>
    </div>
  </div>

  <div class="layui-form-item" >
    <label class="layui-form-label">日均访问量</label>
    <div class="layui-input-block">
      <select name="hits" lay-filter="aihao">
        <option value="1千以下">1千以下</option>
        <option value="1千-1万">1千-1万</option>
        <option value="1万-10万">1万-10万</option>
        <option value="10万以上">10万以上</option>
      </select>
    </div>
    
  </div>
    <div class="layui-form-item">
    <div class="layui-input-block">
        <input type="submit" class="layui-btn" lay-submit="" lay-filter="demo1" value="立即提交">
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
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
  
  function setImagePreview() {
	  var docObj=document.getElementById("doc");
	  var imgObjPreview=document.getElementById("preview");
	  if(docObj.files && docObj.files[0]){
	  //火狐下，直接设img属性
	  imgObjPreview.style.display = 'block';
	  imgObjPreview.style.width = '300px';
	  imgObjPreview.style.height = '120px';
	  //imgObjPreview.src = docObj.files[0].getAsDataURL();
	  //火狐7以上版本不能用上面的getAsDataURL()方式获取，需要一下方式
	  imgObjPreview.src = window.URL.createObjectURL(docObj.files[0]);
	  }else{
	  //IE下，使用滤镜
	  docObj.select();
	  var imgSrc = document.selection.createRange().text;
	  var localImagId = document.getElementById("localImag");
	  //必须设置初始大小
	  localImagId.style.width = "250px";
	  localImagId.style.height = "200px";
	  //图片异常的捕捉，防止用户修改后缀来伪造图片
	  try{
	  localImagId.style.filter="progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
	  localImagId.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = imgSrc;
	  }catch(e){
	  alert("您上传的图片格式不正确，请重新选择!");
	  return false;
	  }
	  imgObjPreview.style.display = 'none';
	  document.selection.empty();
	  }
	  return true;
	  }
  </script>
</html>
