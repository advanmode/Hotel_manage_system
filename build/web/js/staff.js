/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
window.addEventListener('load', function() {
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
    var blank = document.querySelector('.blank');
    var functio = document.querySelector('.function');
    var content = document.querySelector('.content');
    var group1 = document.getElementsByClassName('group1');
    var group2 = document.getElementsByClassName('group2');
    var group3 = document.getElementsByClassName('group3');
    var group4 = document.getElementsByClassName('group4');
    var group5 = document.getElementsByClassName('group5');
    var group6 = document.getElementsByClassName('group6');
    var shows=document.querySelectorAll(".show");
    var out=document.querySelector(".out");
    for (var i = 1; i < func_lis.length; i++) {

        //为每个func栏小li设置自定义属性index2
        func_lis[i].setAttribute('index', i);

        //为每个func栏小li添加点击事件
        func_lis[i].addEventListener('click', function() {

            //改变当前func栏小li颜色
            for (var i = 1; i < func_lis.length; i++) {
                func_lis[i].style.backgroundColor = '#D5E8D4';
                func_lis[i].style.color = '';
            }
            this.style.backgroundColor = '#6D8764';
            this.style.color = '#fff'

            //显示function模块，隐藏blank模块
            blank.style.display = 'none';
            functio.style.display = 'block';

            //恢复所有tab栏小li颜色
            for (var i = 0; i < tab_lis.length; i++) {
                tab_lis[i].style.backgroundColor = '#FFF2CC';
                tab_lis[i].style.color = '';
            }

            //隐藏所有tab栏小li对应模块
            for (var i = 0; i < content.children.length; i++) {
                content.children[i].style.display = 'none';
            }

            //点击对应func栏小li，修改对应tab栏小li内容
            var index = this.getAttribute('index');
            if (index == 1) {
                tab_lis[0].innerText = "预定记录";
                tab_lis[1].innerText = "预定添加";
                tab_lis[2].innerText = "预定修改";
                tab_lis[3].innerText = "预定查询";
                tab_lis[4].innerText = "预定删除";
            }
            if (index == 2) {
                tab_lis[0].innerText = "入住记录";
                tab_lis[1].innerText = "入住添加";
                tab_lis[2].innerText = "入住修改";
                tab_lis[3].innerText = "入住查询";
                tab_lis[4].innerText = "入住删除";
            } else if (index == 3) {
                tab_lis[0].innerText = "换房记录";
                tab_lis[1].innerText = "换房添加";
                tab_lis[2].innerText = "换房修改";
                tab_lis[3].innerText = "换房查询";
                tab_lis[4].innerText = "换房删除";
            } else if (index == 4) {
                tab_lis[0].innerText = "续住记录";
                tab_lis[1].innerText = "续住添加";
                tab_lis[2].innerText = "续住修改";
                tab_lis[3].innerText = "续住查询";
                tab_lis[4].innerText = "续住删除";
            } else if (index == 5) {
                tab_lis[0].innerText = "退房记录";
                tab_lis[1].innerText = "退房添加";
                tab_lis[2].innerText = "退房修改";
                tab_lis[3].innerText = "退房查询";
                tab_lis[4].innerText = "退房删除";
            } else if (index == 6) {
                tab_lis[0].innerText = "客房记录";
                tab_lis[1].innerText = "客房添加";
                tab_lis[2].innerText = "客房修改";
                tab_lis[3].innerText = "客房查询";
                tab_lis[4].innerText = "客房删除";
            }

        })

        //鼠标进入，样式为小手，离开恢复
        func_lis[i].addEventListener('mouseenter', function() {
            this.style.cursor = 'default';
        })
        func_lis[i].addEventListener('mouseleave', function() {
            this.style.cursor = '';
        })
    }

    for (var i = 0; i < tab_lis.length; i++) {

        //为每个tab栏小li设置自定义属性index2
        tab_lis[i].setAttribute('index2', i);

        //为每个tab栏小li添加点击事件
        tab_lis[i].addEventListener('click', function() {
            for (var i = 0; i < tab_lis.length; i++) {
                tab_lis[i].style.backgroundColor = '#FFF2CC';

                tab_lis[i].style.color = '';
            }
            this.style.backgroundColor = '#F0A30A';

            this.style.color = '#fff'

            // 点击tab栏小li，对应模块显示，其他隐藏
            var type = this.innerText;
            if (type == '预定记录' || type == '预定添加' || type == '预定修改' || type == '预定查询' || type == '预定删除') {
                for (var i = 0; i < content.children.length; i++) {
                    content.children[i].style.display = 'none';
                }
                var index2 = this.getAttribute('index2');
                group1[index2].style.display = 'block';
            } else if (type == '入住记录' || type == '入住添加' || type == '入住修改' || type == '入住查询' || type == '入住删除') {
                for (var i = 0; i < content.children.length; i++) {
                    content.children[i].style.display = 'none';
                }
                var index2 = this.getAttribute('index2');
                group2[index2].style.display = 'block';
            } else if (type == '换房记录' || type == '换房添加' || type == '换房修改' || type == '换房查询' || type == '换房删除') {
                for (var i = 0; i < content.children.length; i++) {
                    content.children[i].style.display = 'none';
                }
                var index2 = this.getAttribute('index2');
                group3[index2].style.display = 'block';
            } else if (type == '续住记录' || type == '续住添加' || type == '续住修改' || type == '续住查询' || type == '续住删除') {
                for (var i = 0; i < content.children.length; i++) {
                    content.children[i].style.display = 'none';
                }
                var index2 = this.getAttribute('index2');
                group4[index2].style.display = 'block';
            } else if (type == '退房记录' || type == '退房添加' || type == '退房修改' || type == '退房查询' || type == '退房删除') {
                for (var i = 0; i < content.children.length; i++) {
                    content.children[i].style.display = 'none';
                }
                var index2 = this.getAttribute('index2');
                group5[index2].style.display = 'block';
            } else if (type == '客房记录' || type == '客房添加' || type == '客房修改' || type == '客房查询' || type == '客房删除') {
                for (var i = 0; i < content.children.length; i++) {
                    content.children[i].style.display = 'none';
                }
                var index2 = this.getAttribute('index2');
                group6[index2].style.display = 'block';
            }

        })

        //鼠标进入，样式为小手，离开恢复
        tab_lis[i].addEventListener('mouseenter', function() {
            this.style.cursor = 'default';
        })
        tab_lis[i].addEventListener('mouseleave', function() {
            this.style.cursor = '';
        })
    }

    //点击修改界面确定按钮，显示修改页面
    // for (var i = 0; i < sures.length; i++) {
    //     sures[i].addEventListener('click', function(e) {
    //         e.preventDefault();
    //         this.parentNode.parentNode.style.display = 'none';
    //         this.parentNode.parentNode.nextElementSibling.nextElementSibling.nextElementSibling.style.display = 'block';
    //     })
    // }
    // tab_lis[0].addEventListener('click', function() {
    //     this.style.backgroundColor = '#FFF2CC';
    // })
    for(var i=0;i<shows.length;i++){
         shows[i].addEventListener('click',function(){
        this.style.backgroundColor="#6D8764";
        this.style.color="#fff";
    })
    }
   
    //退出系统
    out.addEventListener('click',function(){
        location.href='login.jsp';
    })

})