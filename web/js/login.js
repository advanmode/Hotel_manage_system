/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

window.addEventListener('click', function() {
    var idReg = /^\d{11}$/; //11位数字
    var passwordReg = /^\w{6,16}$/ //6-16位字母、数字和下划线
   

    var username = document.querySelector(".id");
    var password = this.document.querySelector(".password");


    username.addEventListener('blur', function() {
        if (idReg.test(username.value)) {
            this.nextElementSibling.innerHTML = '<i class="success_icon"></i>你输入的格式正确！';
        } else {
            this.nextElementSibling.innerHTML = '<i class="error_icon"></i>请输入11位数字！'
        }
    })

    password.addEventListener('blur', function() {
        if (passwordReg.test(username.value)) {

            this.nextElementSibling.innerHTML = '<i class="success_icon"></i>你输入的格式正确！';
        } else {
            this.nextElementSibling.innerHTML = '<i class="error_icon"></i>请输入6-16位字母、数字和下划线！'
        }
    })

})
