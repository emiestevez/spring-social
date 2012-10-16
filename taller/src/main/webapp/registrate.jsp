<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt'%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<script src="/taller/js/jquery-1.8.0.min.js"></script>
<script src="/taller/js/taller-spring-social.js"></script>
<script src="/taller/js/bootstrap/bootstrap.js"></script>
<link rel="stylesheet" href="/taller/css/bootstrap/css/bootstrap-responsive.css" />
<link rel="stylesheet" href="/taller/css/bootstrap/css/bootstrap.css" />

<title>Taller de Spring Social</title>

</head>
<body>

    <form class="form-horizontal">
        <legend>Completa los datos para poder continuar</legend>

        <div class="control-group">
            <label class="control-label">Nombre</label>
            <div class="controls">
                <input type="text" placeholder="Type something">
            </div>
        </div>

        <div class="control-group">
            <label class="control-label">Username</label>
            <div class="controls">
                <input type="text" placeholder="Type something">
            </div>
        </div>

        <div class="control-group">
            <label class="control-label" for="inputEmail">Email</label>
            <div class="controls">
                <input type="text" id="inputEmail" placeholder="Email">
            </div>
        </div>

        <div class="control-group">
            <div class="controls">
                <label class="checkbox"> <input type="checkbox"> Remember me </label>
                <button type="submit" class="btn">Sign in</button>
            </div>
        </div>
    </form>


</body>
</html>