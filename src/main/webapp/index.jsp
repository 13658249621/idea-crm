<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>物业管理系统</title>
    <script src="js/jquery-3.4.1.js"/>
    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn1").click(function () {
                console.log("1");
                var uname = $("#uname").val();
                console.log(uname)
                $.ajax({
                    url: "login",
                    type: "post",
                    async: true,
                    data: {"uname": uname},
                    dataType: "text",
                    success: function (res) {
                        //获取通过resp回写的数据
                        if (res == "true") {
                            console.log(11)
                        } else {
                            console.log(22)
                        }
                    }
                })
            })
        })
        function register() {
            window.location.href = "register.html"
        }
    </script>

    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
</head>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<body style=" background: url(https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3331243230,2462603985&fm=26&gp=0.jpg) no-repeat center ; background-size: cover;">
<div class="modal-dialog" style="margin-top: 10%;">
    <div class="modal-content ">
        <div class="modal-header">
            <h4 class="modal-title text-center" id="myModalLabel">登录物业管理系统</h4>
        </div>
        <div class="modal-body" id="model-body">
            <div class="form-group">
                <input id="uname" name="uname" type="text" class="form-control" placeholder="用户名" autocomplete="off">
            </div>
            <div class="form-group">
                <input id="password" type="password" class="form-control" placeholder="密码" autocomplete="off">
            </div>
        </div>
        <div class="modal-footer">
            <div class="form-group">
                <button id="btn1" type="button" class="btn btn-primary form-control">登录</button>
            </div>
            <div class="form-group">
                <button id="btn2" type="button" class="btn btn-default form-control"onclick="register()">注册</button>
            </div>
        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal -->
</body>

</html>

