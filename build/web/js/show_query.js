/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
window.addEventListener('load',function(){
    var back=document.querySelector(".back");
    back.addEventListener('click',function(){
        this.style.backgroundColor="#6D8764";
        this.style.color="#fff";
        window.history.back();
        return false;
    });
});

