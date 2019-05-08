<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/5 0005
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.3.1.min.js"></script>
</head>
<body>
<input type="text" name="username" id="uname" onblur="aaa()"/>
<span id="span"></span>
<br>
<input type="password" name="password"/>
<br>
<input type="submit" value="注册"/>
</body>
</html>

<script>
    function aaa() {
        // console.log("rgr")
        var value = $("#uname").val();
        $.ajax({
            url:"ajaxServlet" , // 请求路径
            type:"POST" , //请求方式
            //data: "username=jack&age=23",//请求参数
            data:{"username":value,},
            success:function (data) {
                // $("#span").html("success")
                if (data=="success") {
                    $("#span").html("success")
                } else {
                    $("#span").html("erro")
                }

            },//响应成功后的回调函数
            error:function () {
                if (data=="erro") {
                    $("#span").html("erro")
                }

            },//表示如果请求响应出现错误，会执行的回调函数

            dataType:"text"//设置接受到的响应数据的格式
        });
    }


</script>
