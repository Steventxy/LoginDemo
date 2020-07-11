$(function () {
    $(document).keyup(function (event) {
        if (event.keyCode === 13) {
            $("#login").click();
        }
    });

    layui.use(['form', 'jquery'], function () {
        var $ = layui.jquery,
            layer = layui.layer,
            form = layui.form;

        form.render();

        form.on('submit(register)', function (obj) {
            if (/^\w{6,25}$/.exec($("#password").val()) === null) {
                layer.msg("密码格式错误", {
                    icon: 2, shade: [0.5, '#000000'], shadeClose: true
                });
                return false;
            } else if ($('#password').val() !== $('#pwdConfirm').val()){
                layer.msg("两次输入密码不一致", {
                    icon: 5, shade: [0.5, '#000000'], shadeClose: true
                });
                return false;
            }
            else{
                $.ajax({
                    type: 'post',
                    url: '/register',
                    data: obj.field,
                    success: function (res) {
                        if (res === "success"){

                        }
                    }
                })
            }

        })
    })
});