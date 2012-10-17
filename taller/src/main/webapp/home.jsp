<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt'%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<script src="/taller/js/jquery-1.8.0.min.js"></script>
<script src="/taller/js/taller-spring-social.js"></script>

<title>Mi aplicacion</title>

<script>
	$(document).ready(function() {
		$.ajax({
			type : "GET",
			url : "http://localhost:8080/taller/service/usuario",
			contentType : "application/json; charset=utf-8",
			dataType : "json",
			success : function(msg) {
				$('input#input_nombre').val(msg.nombre);
				$('label#usuario').text(msg.nombre);
			},
			error : function(err) {
				alert('error');

			}
		});

	});
</script>

</head>
<body>

    Bienvenido <label id="usuario"/>

</body>
</html>