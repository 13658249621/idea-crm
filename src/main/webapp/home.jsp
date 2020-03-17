<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Off Canvas Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="offcanvas.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<nav class="navbar navbar-fixed-top navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">物业管理系统</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">主页</a></li>
                <li><a href="#about">关于我们</a></li>
                <li><a href="#contact">联系我们</a></li>
                <li><a href="">退出登录</a></li>
            </ul>
        </div><!-- /.nav-collapse -->
    </div><!-- /.container -->
</nav><!-- /.navbar -->

<div class="container">

    <div class="row row-offcanvas row-offcanvas-right">

        <div class="col-xs-12 col-sm-9">
            <p class="pull-right visible-xs">
                <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle nav</button>
            </p>
            <div class="jumbotron">
                <h1>尊敬的用户，您好！</h1>
                <p>欢迎使用小区物业管理系统，祝您生活愉快.</p>
            </div>
            <div class="row">
                <div class="col-xs-6 col-lg-4">
                    <h2>我要报修</h2>
                    <p>选择需要报修的设备信息，报修日期，联系方式等，专业的维修师傅会为您服务！ </p>
                    <p><a class="btn btn-default" href="#" role="button">查看详情 &raquo;</a></p>
                </div><!--/.col-xs-6.col-lg-4-->
                <div class="col-xs-6 col-lg-4">
                    <h2>查询车位</h2>
                    <p>查询您的车位编号和小区车位信息. </p>
                    <p><a class="btn btn-default" href="#" role="button">查看详情 &raquo;</a></p>
                </div><!--/.col-xs-6.col-lg-4-->
                <div class="col-xs-6 col-lg-4">
                    <h2>缴费信息</h2>
                    <p>查询物业管理费、物业管理费、物业管理费、物业管费</p>
                    <p><a class="btn btn-default" href="#" role="button">查看详情 &raquo;</a></p>
                </div><!--/.col-xs-6.col-lg-4-->
                <div class="col-xs-6 col-lg-4">
                    <h2>投诉和建议</h2>
                    <p>如果您有任何建议或则有任何您不满意的地方，可以向我们投诉.</p>
                    <p><a class="btn btn-default" href="#" role="button">查看详情 &raquo;</a></p>
                </div><!--/.col-xs-6.col-lg-4-->
                <div class="col-xs-6 col-lg-4">
                    <h2>社区公告</h2>
                    <p>社区有时会发布一些重要公告，您可以在这里查看社区公告，第一时间获知最新消息. </p>
                    <p><a class="btn btn-default" href="#" role="button">查看详情 &raquo;</a></p>
                </div><!--/.col-xs-6.col-lg-4-->
                <div class="col-xs-6 col-lg-4">
                    <h2>六</h2>
                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                    <p><a class="btn btn-default" href="#" role="button">查看详情 &raquo;</a></p>
                </div><!--/.col-xs-6.col-lg-4-->
            </div><!--/row-->
        </div><!--/.col-xs-12.col-sm-9-->

        <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar">
            <div class="list-group" style="margin-top: 60px">
                <a href="#" class="list-group-item active">快速导航</a>
                <a href="fix.html" class="list-group-item">我要报修</a>
                <a href="#" class="list-group-item">查询车位</a>
                <a href="#" class="list-group-item">缴费信息</a>
                <a href="#" class="list-group-item">投诉和建议</a>
                <a href="#" class="list-group-item">查看社区公告</a>
                <a href="#" class="list-group-item">住户管理</a>
                <a href="#" class="list-group-item">楼栋管理</a>

                <a href="#" class="list-group-item">Link</a>
            </div>
        </div><!--/.sidebar-offcanvas-->
    </div><!--/row-->

    <hr>

    <footer>
        <p>&copy;权限归属 物业管理公司</p>
    </footer>

</div><!--/.container-->


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
<script src="offcanvas.js"></script>
</body>
</html>
