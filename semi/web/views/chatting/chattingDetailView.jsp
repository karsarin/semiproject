<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<fieldset>
        <textarea id="messageWindow" rows="10" cols="50" readonly="true"></textarea>
        <br/>
        
        <form action="/semiY/cupdate" enctype="multipart/form-data" method="post">
		   <input id="inputMessage" type="text"/> <BR>
		      파일 : <input type="file" name="upfile">
      		<input type="submit" value="send" onclick="send()">
   		</form>
    </fieldset>
    
	<session>
		<h2 align="center"><%= /* member.getMemberid() */ %> 님과 채팅</h2><br>
		
		<script type="text/javascript">
        var textarea = document.getElementById("messageWindow");
        var webSocket = new WebSocket('ws://localhost:8888/semi/cchatting');
        var inputMessage = document.getElementById('inputMessage');
        
	    webSocket.onerror = function(event) {
	      onError(event)
	    };
	    webSocket.onopen = function(event) {
	      onOpen(event)
	    };
	    webSocket.onmessage = function(event) {
	      onMessage(event)
	    };
	    function onMessage(event) {
	        textarea.value += "상대 : " + event.data + "\n";
	    }
	    function onOpen(event) {
	        textarea.value += "연결 성공\n";
	    }
	    function onError(event) {
	      alert(event.data);
	    }
	    function send() {
	        textarea.value += "나 : " + inputMessage.value + "\n";
	        webSocket.send(inputMessage.value);
	        inputMessage.value = "";
	    }
	    
    	</script>
	</session>

</body>
</html>