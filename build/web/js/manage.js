/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
window.addEventListener('load', function () {
    var time = this.setInterval(getTime, 1000)

    function getTime() {
        var time = document.querySelector(".time");
        var date = new Date();
        var year = date.getFullYear();
        var month = date.getMonth();
        var day = date.getDate();
        var hour = date.getHours();
        var min = date.getMinutes();
        var second = date.getSeconds();
        var week = date.getDay();
        month += 1;
        month = month < 10 ? '0' + month : month;
        day = day < 10 ? '0' + day : day;
        hour = hour < 10 ? '0' + hour : hour;
        min = min < 10 ? '0' + min : min;
        second = second < 10 ? '0' + second : second;
        switch (week) {
            case 0:
                week = '日';
                break;
            case 1:
                week = '一';
                break;
            case 2:
                week = '二';
                break;
            case 3:
                week = '三';
                break;
            case 4:
                week = '四';
                break;
            case 5:
                week = '五';
                break;
            case 6:
                week = '六';
                break;
        }
        time.innerText = '系统时间：' + year + '年' + month + '月' + day + '日' + hour + ':' + min + ':' + second + ' 星期' + week;

    }
    var func = document.querySelector(".function_list");
    var func_lis = func.getElementsByTagName('li');
    var tab = document.querySelector(".tab_list");
    var tab_lis = tab.getElementsByTagName('li');
    var blank = document.querySelector(".blank");
    var functio = document.querySelector(".function");
    var content = document.querySelector(".content");
    var group1 = document.getElementsByClassName('group1');
    var group2 = document.getElementsByClassName('group2');
    var group3 = document.getElementsByClassName('group3');
    var group4 = document.getElementsByClassName('group4');
    var group5 = document.getElementsByClassName('group5');
    var group6 = document.getElementsByClassName('group6');
    var group7 = document.getElementsByClassName('group7');
    var shows = document.querySelectorAll(".show");
    var out = document.querySelector(".out");
    tab_click();
    for (var i = 1; i < func_lis.length; i++) {
        //设置自定义属性index，用作索引
        func_lis[i].setAttribute('index', i);
        func_lis[i].addEventListener('click', function () {
            //当前func小li颜色改变
            for (var i = 1; i < func_lis.length; i++) {
                func_lis[i].style.backgroundColor = '#D5E8D4';
                func_lis[i].style.color = '';
            }
            this.style.backgroundColor = '#6D8764';
            this.style.color = '#fff';
            //显示function模块，隐藏blank模块
            blank.style.display = 'none';
            functio.style.display = 'block';
            //恢复tab小li背景颜色，恢复文字颜色
            for (var i = 0; i < tab_lis.length; i++) {
                tab_lis[i].style.backgroundColor = "#FFF2CC";
                tab_lis[i].style.color = "#000";
            }
            //隐藏所有block块
            for (var i = 0; i < content.children.length; i++) {
                content.children[i].style.display = 'none';
            }
            //根据tab小li改变tab小li相应内容
            var index = this.getAttribute('index');
            if (tab_lis.length >= 3) {
                tab_lis[0].parentNode.removeChild(tab_lis[2]);
                tab_lis[0].parentNode.removeChild(tab_lis[1]);
            } else if (tab_lis.length >= 2) {
                tab_lis[0].parentNode.removeChild(tab_lis[1]);
            }
            if (index == 1) {
                tab_lis[0].innerText = "预定记录";
            } else if (index == 2) {
                tab_lis[0].innerText = "入住记录";
            } else if (index == 3) {
                tab_lis[0].innerText = "换房记录";
            } else if (index == 4) {
                tab_lis[0].innerText = "续住记录";
            } else if (index == 5) {
                tab_lis[0].innerText = "退房记录";
            } else if (index == 6) {
                if (tab_lis.length < 2) {
                    var li = document.createElement("li");
                    tab_lis[0].parentNode.appendChild(li);
                }
                tab_lis[0].innerText = "客房记录";
                tab_lis[1].innerText = "客房价格调整";
                tab_click();
            } else if (index == 7) {
                if (tab_lis.length < 3) {
                    for (var i = 0; i < 2; i++) {
                        var li = document.createElement("li");
                        tab_lis[0].parentNode.appendChild(li);
                    }
                }
                tab_lis[0].innerText = "员工记录";
                tab_lis[1].innerText = "员工添加";
                tab_lis[2].innerText = "员工删除";
                tab_click();
            }

        })
        func_lis[i].addEventListener('mouseenter', function () {
            this.style.cursor = 'default';
        })
        func_lis[i].addEventListener('mouseleave', function () {
            this.style.cursor = '';
        })
    }

    function tab_click() {
        for (var i = 0; i < tab_lis.length; i++) {
            //为tab小li设置自定义属性，显示隐藏block时使用
            tab_lis[i].setAttribute('index2', i);
            tab_lis[i].addEventListener('click', function () {
                for (var i = 0; i < tab_lis.length; i++) {
                    tab_lis[i].style.backgroundColor = '#FFF2CC';
                    tab_lis[i].style.color = '';

                }
                this.style.backgroundColor = '#F0A30A';
                this.style.color = '#fff';

                var type = this.innerText;
                if (type == '预定记录') {
                    for (var i = 0; i < content.children.length; i++) {
                        content.children[i].style.display = 'none';
                    }
                    var index2 = this.getAttribute('index2');
                    group1[index2].style.display = 'block';
                } else if (type == '入住记录') {
                    for (var i = 0; i < content.children.length; i++) {
                        content.children[i].style.display = 'none';
                    }
                    var index2 = this.getAttribute('index2');
                    group2[index2].style.display = 'block';
                } else if (type == "换房记录") {
                    for (var i = 0; i < content.children.length; i++) {
                        content.children[i].style.display = 'none';
                    }
                    var index2 = this.getAttribute('index2');
                    group3[index2].style.display = 'block';
                } else if (type == "续住记录") {
                    for (var i = 0; i < content.children.length; i++) {
                        content.children[i].style.display = 'none';
                    }
                    var index2 = this.getAttribute('index2');
                    group4[index2].style.display = 'block';
                } else if (type == "退房记录") {
                    for (var i = 0; i < content.children.length; i++) {
                        content.children[i].style.display = 'none';
                    }
                    var index2 = this.getAttribute('index2');
                    group5[index2].style.display = 'block';
                } else if (type == "客房记录" || type == "客房价格调整") {
                    for (var i = 0; i < content.children.length; i++) {
                        content.children[i].style.display = 'none';
                    }
                    var index2 = this.getAttribute('index2');
                    group6[index2].style.display = 'block';
                } else if (type == "员工记录" || type == "员工添加" || type == "员工删除") {
                    for (var i = 0; i < content.children.length; i++) {
                        content.children[i].style.display = 'none';
                    }
                    var index2 = this.getAttribute('index2');
                    group7[index2].style.display = 'block';
                }
            })
            tab_lis[i].addEventListener('mouseenter', function () {
                this.style.cursor = 'default';
            })
            tab_lis[i].addEventListener('mouseleave', function () {
                this.style.cursor = '';
            })
        }
    }

    //退出系统
    out.addEventListener('click', function () {
        location.href = 'login.jsp';
    })
    for (var i = 0; i < shows.length; i++) {
        shows[i].addEventListener('click', function () {
            this.style.backgroundColor = "#6D8764";
            this.style.color = "#fff";
        })
    }
    //正则验证
    var passwordReg = /^\w{6,16}$/; //6-16位字母、字母、下划线
    var emailReg = /^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/; //只允许英文字母、数字、下划线、英文句号、以及中划线组成
    var authReg = /^[a-z]{5}$/; //5个英文小写字母
    var password = document.querySelector(".password");
    var email = document.querySelector(".email");
    var auth = document.querySelector(".authority");
    password.addEventListener('blur', function () {
        if (passwordReg.test(password.value)) {
            this.nextElementSibling.innerHTML = '<i class="success_icon"></i>你输入的格式正确！';
        } else {
            this.nextElementSibling.innerHTML = '<i class="error_icon"></i>请输入6-16位字母、字母、下划线！';
        }
    })
    email.addEventListener('blur', function () {
        if (emailReg.test(email.value)) {
            this.nextElementSibling.innerHTML = '<i class="success_icon"></i>你输入的格式正确！';
        } else {
            this.nextElementSibling.innerHTML = '<i class="error_icon"></i>请输入英文字母、数字、下划线、英文句号、以及中划线！';
        }
    })
    auth.addEventListener('blur', function () {
        if (authReg.test(auth.value)) {
            this.nextElementSibling.innerHTML = '<i class="success_icon"></i>你输入的格式正确！';
        } else {
            this.nextElementSibling.innerHTML = '<i class="error_icon"></i>请输入5个英文小写字母！';
        }
    })
})