<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css" href="css/styles.css">
<link rel="stylesheet" href="css/jigsaw.css">
<style>
#msg {
	width: 100%;
	line-height: 40px;
	font-size: 14px;
	text-align: center;
}
</style>
</head>
<body>

	<div class="jq22-container" style="margin-left: 500px;margin-top: 50">
		<div class="login-wrap">
			<div class="login-html">
				<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label
					for="tab-1" class="tab">登录</label> <input id="tab-2" type="radio"
					name="tab" class="sign-up"><label for="tab-2" class="tab">注册</label>
				<div class="login-form">
					<form action="frontlogin" method="post">
						<div class="sign-in-htm">
							<div class="group">
								<label for="user" class="label">用户名</label> <input id="uname"
									name="uname" type="text" class="input" placeholder="请输入用户名">
							</div>
							<div class="group">
								<label for="pass" class="label">密码</label> <input id="rpwd"
									type="rpwd" name="rpwd" class="input" data-type="password"
									placeholder="请输入密码">
							</div>
							<div class="group">
								<div class="container">
									<div id="captcha" style="position: relative"
										data-type="password"></div>
									<div id="msg"></div>
								</div>
							</div>
							<div class="group">
								<input id="check" type="checkbox" class="check" checked>
								<label for="check"><span class="icon"></span> 保持登录</label>
							</div>
							<div class="group">
								<input type="submit" class="button" value="登录" onClick="sub()">
							</div>
							<div class="hr"></div>
							<div class="foot-lnk">
								<a href="#forgot">忘记密码?</a>
							</div>
						</div>
					</form>
					<form action="add" method="post">
						<div class="sign-up-htm">
							<div class="group">
								<label for="user" class="label">用户名</label> <input type="text"
									id="uname" class="input" name="uname" placeholder="请输入用户名">
							</div>
							<div class="group">
								<label for="pass" class="label">密码</label> <input id="passs"
									type="password" class="input" data-type="password" name="rpwd"
									placeholder="请输入密码">
							</div>
							<div class="group">
								<label for="pass" class="label">手机号</label> <input type="text"
									class="input" id="phone" name="phone" placeholder="请输入手机号"><br>
								<input type="button" class="button" value="发送验证码"
									onClick="sendCode()"
									style="width:120px;height:50px;background:#00CED1"> <br>
								<input id="code" type="text" class="input" name="code"
									placeholder="请输入验证码">
							</div>
							<div class="group">
								<a href="register.html"><input type="submit" class="button"
									value="注册"></a>
							</div>
							<div class="hr"></div>
							<div class="foot-lnk">
								<label for="tab-1">已经成员?</a>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	
	<script src="js/jquery-3.1.1.js"></script>
	<script src="js/jigsaw.js"></script>
	<script>
		var flag = false;
		function sub() {
			var name = document.getElementById('uname').value;
			var pass = document.getElementById('rpwd').value;
			if (name != null && pass != null && flag == true) {
				
			} else {
				if (flag == false) {
					
					return;
				}
			
			}
		}
		jigsaw.init(document.getElementById('captcha'), function() {
			flag = true;
			document.getElementById('msg').innerHTML = '验证成功！'
		})
		var c = null;
		function sendCode() {
			var p = document.getElementById('phone').value;

			alert(p);
			$.ajax({
				url : "code",
				type : "post",
				data : {
					phone : p
				},
				success : function(data) {
					alert(data);
					if (data != "") {
						c = data;
						
						
					} else {
						
					}
				}
			});

		}
		$("#code").blur(function() {
			if ($("#code").val != c) {
				
			} else {
				
			}
		})
		$("#phone").blur(function() {
			var phone = $(this).val();
			var pattern = /^1[34578]\d{9}$/;
			if (phone != "") {
				if (phone.substring(0, 1) == 1) {
					if (pattern.test(phone)) {
						
					} else {
						
					}
				} else {
					
				}
			} else {
				
			}
		})
	</script>
</body>
</html>
