<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'zfb.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	 <link rel="stylesheet" href="css/bootstrap.min.css">
     <link rel="stylesheet" href="css/zfbstyle.css">

  </head>
  
 <body >
  <div class="container" style="width: 800px;margin-left: 200px">
    <div class="row">
      <div class="container_logo">
        <div class="play col-xs-10 col-sm-10 col-md-10 col-lg-10">
          <img src="img/zxd/logo.png" />
        </div>
      </div>
    </div>
    <form action="pay" method="post">
      <div class="row">
        <div class="play col-xs-10 col-sm-10 col-md-10 col-lg-10">
          <div class="form-group">
            <input type="hidden" class="getId" name="id">
            <h4>充值金额</h4>
            <div class="number_amount">
              <label>￥</label>
              <input type="number" name="money">
            </div>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="quick_amount col-xs-10 col-sm-10 col-md-10 col-lg-10">
          <p class="col-xs-3 col-sm-3 col-md-3 col-lg-3" data-item='100'>100</p>
          <p class="col-xs-3 col-sm-3 col-md-3 col-lg-3" data-item='200'>200</p>
          <p class="col-xs-3 col-sm-3 col-md-3 col-lg-3" data-item='500'>500</p>
          <p class="col-xs-3 col-sm-3 col-md-3 col-lg-3" data-item='1000'>1000</p>
          <p class="col-xs-3 col-sm-3 col-md-3 col-lg-3" data-item='2000'>2000</p>
          <p class="col-xs-3 col-sm-3 col-md-3 col-lg-3" data-item='5000'>5000</p>
        </div>
      </div>
      <div class="row">
        <div class="_submit col-xs-10 col-sm-10 col-md-10 col-lg-10">
          <input type="submit" value="充值" class="btn btn-primary submit-amount">
        </div>
      </div>
    </form>
  </div>
  </div>
    <div class="modal fade" tabindex="-1" role="dialog" id='exampleModal'>
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
          <h4 class="modal-title">提示</h4>
        </div>
        <div class="modal-body">
          <p>输入金额不能超出5000元</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-primary" data-dismiss="modal" aria-label="Close">确定</button>
        </div>
      </div>
    </div>
  </div>
  <div class="mask"></div>
</body>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
var $amountInput = $('[type="number"]');
var amount = '';
var $getId = $('[type="hidden"]');
var getparse=ParaMeter();
$getId.val(getparse.id);
$(".quick_amount p").off("click").on("click", function () {
  amount = $(this).text();
  if (!$(this).hasClass('active')) {
    $(this).addClass('active').siblings().removeClass('active');
    $amountInput.val(amount);
  } else {
    $(this).removeClass('active');
    $amountInput.val('');
  }
})
$amountInput.on('input propertychange', function () {
  if ($(this).val() > 5000) {
    $('#exampleModal').modal('show')
  }
  if($(this).val()!==$('.quick_amount p.active').text()){
    $('.quick_amount p').removeClass('active');
  }
})
$('#exampleModal').on('hidden.bs.modal', function (e) {
  $amountInput.val(5000);
})
function ParaMeter()
{
  var obj={};
  var arr=location.href.substring(location.href.lastIndexOf('?')+1).split("&");
  for(var i=0;i < arr.length;i++){
  var aa=arr[i].split("=");
  obj[aa[0]]=aa[1];
}
  return obj;
}
</script>
</html>
