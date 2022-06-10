/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
window.addEventListener('click', function() {
    var bianhaoReg = /^\d{1,3}$/ //1-3位数字
    var nameReg = /^[\u4e00-\u9fa5]{2,7}$/; //2到7个汉字
    var identifyReg = /^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/ //18位身份证验证
    var phoneReg = /^\d{11}$/; //11位数字
    var roomReg = /^\d{3}$/ //3位数字
    var roomTypeReg = /^[\u4e00-\u9fa5]{2,8}$/; //2到8个汉字
    var timeReg = /^[1-9]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])\s+(20|21|22|23|[0-1]\d):[0-5]\d:[0-5]\d$/ //日期+时间验证，正确格式：2014-01-01 12:00:00
    var totalTimeReg = /^\d|[\u4E00-\u9FA5]$/ //数字或者汉字
    var priceReg = /^\d|[\u4E00-\u9FA5]$/ //数字或者汉字


    var scheduled_id = document.querySelectorAll(".scheduled_id");
    var custom_name = document.querySelectorAll(".custom_name");
    var custom_identify = document.querySelectorAll(".custom_identify");
    var custom_tel = document.querySelectorAll(".custom_tel");
    var scheduled_room = document.querySelectorAll(".scheduled_room");
    var scheduled_room_type = document.querySelectorAll(".scheduled_room_type");
    var scheduled_time = document.querySelectorAll(".scheduled_time");
    var scheduled_begin_live = document.querySelectorAll(".scheduled_begin_live");
    var scheduled_end_leave = document.querySelectorAll(".scheduled_end_leave");
    var scheduled_total_time = document.querySelectorAll(".scheduled_total_time");
    var scheduled_price = document.querySelectorAll(".scheduled_price");


    for (var i = 0; i < scheduled_id.length; i++) {
        scheduled_id[i].addEventListener('blur', function() {
            if (bianhaoReg.test(this.value)) {
                this.nextElementSibling.innerHTML = '<i class="success_icon"></i>你输入的格式正确！';
            } else {
                this.nextElementSibling.innerHTML = '<i class="error_icon"></i>请输入1-3位数字！'
            }
        })
    }
    for (var i = 0; i < custom_name.length; i++) {
        custom_name[i].addEventListener('blur', function() {
            if (nameReg.test(this.value)) {

                this.nextElementSibling.innerHTML = '<i class="success_icon"></i>你输入的格式正确！';
            } else {
                this.nextElementSibling.innerHTML = '<i class="error_icon"></i>请输入2-8位汉字！'
            }
        })
    }
    for (var i = 0; i < custom_identify.length; i++) {
        custom_identify[i].addEventListener('blur', function() {
            if (identifyReg.test(this.value)) {

                this.nextElementSibling.innerHTML = '<i class="success_icon"></i>你输入的格式正确！';
            } else {
                this.nextElementSibling.innerHTML = '<i class="error_icon"></i>请输入18位身份证号码！'
            }
        })
    }
    for (var i = 0; i < custom_tel.length; i++) {
        custom_tel[i].addEventListener('blur', function() {
            if (phoneReg.test(this.value)) {
                this.nextElementSibling.innerHTML = '<i class="success_icon"></i>你输入的格式正确！';
            } else {
                this.nextElementSibling.innerHTML = '<i class="error_icon"></i>请输入11数字！'
            }
        })
    }
    for (var i = 0; i < scheduled_room.length; i++) {
        scheduled_room[i].addEventListener('blur', function() {
            if (roomReg.test(this.value)) {
                this.nextElementSibling.innerHTML = '<i class="success_icon"></i>你输入的格式正确！';
            } else {
                this.nextElementSibling.innerHTML = '<i class="error_icon"></i>请输入3位数字！'
            }
        })
    }
    for (var i = 0; i < scheduled_room_type.length; i++) {
        scheduled_room_type[i].addEventListener('blur', function() {
            if (roomTypeReg.test(this.value)) {
                this.nextElementSibling.innerHTML = '<i class="success_icon"></i>你输入的格式正确！';
            } else {
                this.nextElementSibling.innerHTML = '<i class="error_icon"></i>请输入2-8位汉字！'
            }
        })
    }
    for (var i = 0; i < scheduled_time.length; i++) { timeCheck(scheduled_time[i], timeReg); }
    for (var i = 0; i < scheduled_begin_live.length; i++) { timeCheck(scheduled_begin_live[i], timeReg); }
    for (var i = 0; i < scheduled_end_leave.length; i++) { timeCheck(scheduled_end_leave[i], timeReg); }


    for (var i = 0; i < scheduled_total_time.length; i++) {
        scheduled_total_time[i].addEventListener('blur', function() {
            if (totalTimeReg.test(this.value)) {
                this.nextElementSibling.innerHTML = '<i class="success_icon"></i>你输入的格式正确！';
            } else {
                this.nextElementSibling.innerHTML = '<i class="error_icon"></i>请输入数字、汉字组合！'
            }
        })
    }
    for (var i = 0; i < scheduled_price.length; i++) {
        scheduled_price[i].addEventListener('blur', function() {
            if (priceReg.test(this.value)) {
                this.nextElementSibling.innerHTML = '<i class="success_icon"></i>你输入的格式正确！';
            } else {
                this.nextElementSibling.innerHTML = '<i class="error_icon"></i>请输入数字、汉字组合！'
            }
        })
    }


    function timeCheck(ele, reg) {
        ele.addEventListener('blur', function() {
            if (reg.test(ele.value)) {

                this.nextElementSibling.innerHTML = '<i class="success_icon"></i>你输入的格式正确！';
            } else {
                this.nextElementSibling.innerHTML = '<i class="error_icon"></i>请输入正确格式：2014-01-01 12:00:00!'
            }
        })

    }
    
    function animate(obj, target, callback) {

        // 先清除以前的定时器，只保留当前的一个定时器执行
        clearInterval(obj.timer);
        obj.timer = setInterval(function() {
            // 步长值写入定时器
            var step = (target - obj.offsetLeft) / 10;
            step = step > 0 ? Math.ceil(step) : Math.floor(step);
            if (obj.offsetLeft == target) {
                // 停止动画 本质是停止定时器
                clearInterval(obj.timer);
                callback && callback();
            }
            obj.style.left = obj.offsetLeft + step + 'px';

        }, 15);
    }
    var ani = document.querySelector('.animate');
    var tan = document.querySelector('.tan');
    ani.addEventListener('mouseenter', function() {
        tan.style.display = "block";
        animate(tan, -286, function() {
            ani.children[0].innerHTML = '→';
        });

    })
    ani.addEventListener('mouseleave', function() {
        animate(tan, 330, function() {
            ani.children[0].innerHTML = '←使用须知';
            tan.style.display = "none";
        });

    })


})
