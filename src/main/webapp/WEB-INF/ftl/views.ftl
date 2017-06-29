<!DOCTYPE html>
<html>
<head>
    <title>用户登录</title>
    <meta charset="utf-8">
</head>
<body>
<div class="tree-default tree-file"></div>
<div class="tree-default tree-folder"></div>
<div class="container">
    <form class="form-signin" id="form" role="form" action="/login" method="post">
        <div class="form-group">
            <input type="text" name="username" class="form-control form-username" placeholder="用户名/邮箱/手机号" autofocus>
        </div>
        <div class="form-group">
            <input type="password" name="password" class="form-control form-password" placeholder="密码" required>
        </div>
        <div class="checkbox">
            <label>
                <input type="checkbox" name="rememberMe"> 记住密码 <!--<a href="#">忘记密码？</a>-->
            </label>
            <a class="register" href="/toRegister">注册</a>
        </div>
        <div class="form-group">
            <input class="btn btn-lg btn-success btn-block" type="submit" id="submit" value="登录"/>
        </div>
    </form>
</div>
</body>
</html>
