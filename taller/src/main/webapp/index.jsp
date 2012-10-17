<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt'%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Login</title>
<link rel="stylesheet" href="/taller/css/taller.css" type="text/css" />
<script src="/taller/js/bootstrap/bootstrap.js"></script>
<link rel="stylesheet" href="/taller/css/bootstrap/css/bootstrap-responsive.css" />
<link rel="stylesheet" href="/taller/css/bootstrap/css/bootstrap.css" />
</head>
<body>

    <form id="tw_signin" action="<c:url value="service/signin/twitter"/>" method="POST">
        <button type="submit" class="button-social">
            <img src="<c:url value="/images/twitter-signin.png"/>" />
        </button>
    </form>

</body>
</html>