<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showmuban.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="layui-v2.3.0/layui/css/layui.css">
	<script type="text/javascript" src="layui-v2.3.0/layui/layui.all.js"></script>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	 <link rel="stylesheet" href="layui-v2.3.0/layui/css/layui.css"  media="all">
	<link rel="stylesheet" href="css/amazeui.min.css" tppabs="css/amazeui.min.css" />
	<link rel="stylesheet" href="css/admin.css" tppabs="css/admin.css" />
  </head>
  
  <body>
<button onclick="onAddBtn()" class="layui-btn layui-btn-radius layui-btn-normal">添加广告模板</button>
    
          
            <table class="layui-table" lay-size="lg">
              <thead>
              <tr>
                <th>ID</th>
                <th>广告名称</th>
                <th>图片</th>
                <th>网站地址</th>
                <th>审核状态</th>
                <th>操作</th>
              </tr>
              </thead>
              <tbody>
              <c:forEach items="${selmuban }" var="s">
              <tr>
                <td>${s.mid }</td>
                <td>${s.mname }</td>
                <td>
                <img id="viewImg${s.mid }" src="${s.mimg }" style="width:80px;height:40px;">
                </td>
                <td class="am-hide-sm-only"><a href="${s.murl }" target="_blank">${s.murl }</a></td>
                
                <td> 
                	<c:if test="${s.uudit=='0'}">审核中</c:if>
                    <c:if test="${s.uudit=='1'}">审核通过</c:if>
                    <c:if test="${s.uudit=='2'}">审核未通过</c:if>
				</td>
                <td>
                  <div class="am-btn-toolbar">
                    <div class="am-btn-group am-btn-group-xs">
                    <a href="muban/del?mid=${s.mid}">删除</a>
                    </div>
                  </div>
                </td>
              </tr>
             </c:forEach>
              
              </tbody>
            </table>
 
<script>
//Demo
layui.use('form', function(){
  var form = layui.form;
  
  //监听提交
  form.on('submit(formDemo)', function(data){
    layer.msg(JSON.stringify(data.field));
    return false;
  });
});
</script>
    <div id="outerdiv" style="position:fixed;top:0;background:rgba(0,0,0,0.7);z-index:1000;width:100%;height:100%;display:none;"><div id="innerdiv" style="position:absolute;width: 100%;height:100%;"><img id="bigimg" style="border:5px solid #fff;margin-left:400px;margin-top:180px;width: 520px;;height:350px;" src="" /></div></div>  

<div id="add-main" style="display: none;">
       <form class="layui-form" id="add-form" action="single/upload" method="post" enctype="multipart/form-data">
         <div class="layui-form-item left" >
          <label class="layui-form-label" style="width: 100px" >广告名称</label>
          <div class="layui-input-block">
           <input type="text" name="name" required value="" style="width: 240px" lay-verify="required" placeholder="请输入广告名称" autocomplete="off" class="layui-input">
          </div>
         <input type="file" name="photo"/><br/>
         <div class="layui-form-item">
          <label class="layui-form-label" style="width: 100px">网站地址</label>
          <div class="layui-input-block">
           <input type="text" name="url" required style="width: 240px" lay-verify="required" placeholder="请输入产品地址" autocomplete="off" class="layui-input">
          </div>
         </div>
         <div class="layui-form-item">
          <div class="layui-input-block">
           <button class="layui-btn" lay-submit lay-filter="save" >立即提交</button>
           <button type="reset" class="layui-btn layui-btn-primary" id="closeBtn" onclick="location='muban/query'">关闭</button>
          </div>
         </div> 
         </div>
       </form>  
    </div>
  </body>
   <script type="text/javascript">
   function onAddBtn(){
	     //页面层-自定义
	    layer.open({
	        type: 1,
	        title:"添加广告模板",
	        closeBtn: false,
	        shift: 1,
	        area: ['400px', '300px'],
	        shadeClose: true,
	        // btn: ['新增', '取消'],
	        // btnAlign: 'c',
	        content: $("#add-main"),
	        success: function(layero, index){},
	        yes:function(){
	        }
	      });
	  }
   //关闭页面
   function CloseWin(){
     parent.location.reload(); // 父页面刷新
     var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
     parent.layer.close(index); //再执行关闭 
   } 
    //图片放大
      $(function(){
        $("#viewImg1").click(function(){
            var _this = $(this);//将当前的pimg元素作为_this传入函数  
            imgShow("#outerdiv", "#innerdiv", "#bigimg", _this);  
          });  
          $("#viewImg6").click(function(){
            var _this = $(this);//将当前的pimg元素作为_this传入函数  
            imgShow("#outerdiv", "#innerdiv", "#bigimg", _this);  
          });  
    	});  
      
    
    
        function imgShow(outerdiv, innerdiv, bigimg, _this){
	        var src = _this.attr("src");//获取当前点击的pimg元素中的src属性  
	        $('#outerdiv').attr('display','block');
	        $(bigimg).attr("src", src);//设置#bigimg元素的src属性  
             $(outerdiv).fadeIn("fast");
          
        $(outerdiv).click(function(){//再次点击淡出消失弹出层  
            $(this).fadeOut("fast");  
        });  
    }
  </script>


</html>
