<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt'%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Login</title>
        <link rel="stylesheet" href="/taller/css/taller.css" type="text/css"/>
    </head>
    <body>
        <div id="tab-nav" class="global-nav">
            <div id="navegation">
                <ul>
                    <li class="navegation-first">Mi aplicacion</li>
                    <li class="navegation-last">Ingresar</li>
                </ul>
            </div>
        </div>

        <form id="tw_signin" action="<c:url value="service/signin/twitter"/>" method="POST">
            <button type="submit">
                <img src="<c:url value="/images/twitter-signin.png"/>" />
            </button>
        </form>

        <form id="fb_signin" action="<c:url value="service/signin/facebook"/>" method="POST">
            <button type="submit">
                <img src="<c:url value="/images/facebook-signin.png"/>" />
            </button>
        </form>

    </body>
</html>