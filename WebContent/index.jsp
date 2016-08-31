<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index页面</title>
	<script type="text/javascript">
	var ws;
	var url ;
	function init(){
		url = "ws://localhost:8080/websocketDemo/server";
		ws = new WebSocket(url);
		ws.onopen = function (eve1) {
			console.log("连接服务器成功。");
		};	
		ws.onmessage = function (eve1) {
			console.log("收到服务器信息："+eve1.data);
		};
		ws.onclose = function (eve1) {
			console.log("服务端关闭，原因："+eve1.reason);
		};
		ws.onerror = function (eve1) {
			console.log("连接出现错误："+eve1.reason);
		};
	};
	
	</script>
</head>
<body>
	websocket 连接：
	<input type="button" onclick="init()" value="点我啊">

</body>
</html>