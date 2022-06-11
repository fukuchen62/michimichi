$(document).ready(function(){
    console.log(window.vh);
    $('#slider-v').sliderPro({
        width: "80.85%",
        height: 558.81,
        orientation: 'vertical',//スライドの方向
        arrows: true,//左右の矢印
        buttons: false,//ナビゲーションボタン
        autoplay: false,
        loop: false,//ループ
        thumbnailsPosition: 'right',//サムネイルの位置
        thumbnailPointer: true,//アクティブなサムネイルにマークを付ける
        thumbnailWidth: 200,//サムネイルの横幅
        thumbnailHeight: 137,//サムネイルの縦幅
    });

    $(".slider").slick({
        slideToShow: 1,
        autoplay: false,
        dots: true,
        swipeToSlide: true,
    });

    $(".spot-box").click(function(){
        $(this).next().show(300);
    });

    $(".spot-modal").click(function(){
        $(this).hide(300);
    });

    $(".btn-more").click(function(){
        $(".info-more").slideToggle();
    });

    $(".commodity").click(function(){
        $(this).toggleClass("active");
        $(this).next().slideToggle(300, "linear");
    });
    $(".btn-comment").click(function(){
        let name = document.getElementById("comment-name");
        let comment = document.getElementById("comment-text");

        let res_name = document.getElementById("res-name");
        let res_text = document.getElementById("res-text");
        res_name.value = name.value;
        res_text.value = comment.value;

        $(".comment-modal").css({"bottom": "0"});
        $("#footer").css({"z-index": "-1"});
    });
    $(".btn-return, .btn-submit").click(function(){
        $(".comment-modal").css({"bottom": "-2000px"});
        $("#footer").css({"z-index": "1"});
    });
});