<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'center.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
     <link href="css/UserCSS.css" rel="stylesheet" type="text/css" />
      <script src="js/jquery-1.9.1.js"></script>
    <!-- 你必须先引入jQuery1.8或以上版本 -->
    <script src="layer-v3.1.1/layer/layer.js"></script>
    <script src="js/bootstrap.min.js"></script>
     <!-- 引入 ECharts 文件 -->
    <script src="js/echarts.min.js"></script>
  
  </head>
  
  <body style="width: 100%;background-color: #fff">    
   
        <div class="u-main">
            <div class="ucenter">
                <div class="ucenter-info mt10">
                    <div class="info-title">
                        <h5>
                            我的个人资料</h5>
                    </div>
                    <div class="info">
                        <ul class="info-img">
                            <li>
                                <img src="${list.get(0).userimg }" class="avatar" /></li></ul>
                        <div class="info-main">
                            <div class="row">
                                <label>
                                    用户名：</label>${list.get(0).uname }</div>
                            <div class="row">
                                <label>
                                    注册时间：</label>${list.get(0).ctime }</div>
                            <div class="row">
                                <label>
                                    手机号：</label>${list.get(0).phone }</div>
                            <div class="row">
                                <label>
                                    角色：</label><span class="orange">普通会员 &nbsp;&nbsp;</span></div>
                            <div class="row">
                                <label>
                                    个人余额：</label><span class="orange">${list.get(0).sum }</span>&nbsp;元
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="front/zfb.jsp">充值</a>
                            </div>
                        </div>
                        <div class="clear">
                        </div>
                    </div>
                </div> 
                <div class="ucenter-info mt10">
                    <!--折线图显示-->
    <div class="box">
        <div class="box-header">
        </div>
        <div class="box-body">
            <div id="echarts-line" style="height: 400px; width :800px;"></div>
        </div>
    </div>

    <!--Table表格显示-->
    <div class="row" style="display: none;">
        <div class="col-xs-12">

            <div class="box">
                <div class="box-header">
                    [ --------商品信息统计-------------]
                </div>
                <div class="box-body">
                    <div class="table-responsive">
                        <table class="table table-striped table-echarts" style="width: 800px">
                            <tbody>
							<c:forEach items="${checkshow}" var="l">
								<tr>
									<td class="td_ptime">${l.ptime}</td>
									<td class="td_hist">${l.hits }</td>
									<td class="td_income">${l.income }</td>
								</tr>
							</c:forEach>
						</tbody>

                        </table>

                    </div>
                </div>
            </div>
        </div>
    </div>
                </div>                
            </div>
     
    </div>
</body>
<script type="text/javascript">
            $(function () {
                var td_ptime = [];
                var td_hist= [];
                var td_income=[];
                

                $(".table-echarts tbody tr").each(function () {
                	td_ptime.push($(this).find(".td_ptime").html());
                	td_hist.push($(this).find(".td_hist").html());
                	td_income.push($(this).find(".td_income").html());
                	
                
                });
                
                var lineEchart = echarts.init(document.getElementById('echarts-line'));
                option = {
                    title: {
                        text: '个人网站统计'
                    },
                    tooltip: {
                        trigger: 'axis'
                    },
                    legend: {
                        data:['收入','点击量']
                    },
                    grid: {
                        left: '3%',
                        right: '4%',
                        bottom: '3%',
                        containLabel: true
                    },
                    toolbox: {
                        feature: {
                            saveAsImage: {}
                        }
                    },
                    xAxis: {
                        type: 'category',
                        boundaryGap: false,
                        data:td_ptime
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [
                        {
                            name:'点击量',
                            type:'line',
                            stack: '总量',
                            data:td_hist
                        },
                        {
                            name:'收入',
                            type:'line',
                            stack: '总量',
                            data:td_income
                        },
                        
                    ]
                };

                lineEchart.setOption(option);

            })
    </script>
</html>
