$(document).ready(function(){
    /********************************************************
     *ハンバーガーメニューの開閉
     *******************************************************/
    $(".hamburger").click(function(){
        $(".burger").toggleClass("active");
        $("#container").slideToggle(300,"linear");
    });
});