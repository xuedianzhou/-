<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'c.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript"src="https://cdn.goeasy.io/goeasy.js"></script>  
<script src="/js/jquery-3.1.1.js"></script>
  </head>
  
  <body>
   <script type="text/javascript">
   			
             var goEasy = new GoEasy({appkey: 'BS-8442f6eab25947bda865f090d04826ba'});
                           goEasy.subscribe({
                          channel: 'aaa',
                          onMessage: function(message){
                        alert(message.content);
                         }
                         });
                       
                         
   </script>     
   <div id="a"></div>
   aaa
  </body>
</html>
