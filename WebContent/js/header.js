$(document).ready(function(){
    /********************************************************
     *標準拡大ボタンの位置を決める関数宣言
     *******************************************************/
    function Button(){
        if(viewWidth >= 1300){
            $(".font-button").css("right","15%");
        }
        else if(viewWidth >= 1024){
            $(".font-button").css("right","10%");
        }
        else if(viewWidth >= 768){
            $(".font-button").css("right","5%");
        }
        else {
            $(".font-button").css("right","10px");
        }
    }

    /********************************************************
     *標準拡大ボタンの位置を決める関数を呼び出す
     *******************************************************/
    let viewWidth = $(window).width();
    let diff = $("#header").offset().top - window.scrollY;
    if(diff < 0){
        Button();
    }

    /********************************************************
     *天井で張り付くヘッダー/ロゴサイズ変更
     *******************************************************/
    // window.addEventListener("scroll",function(){
    //     // topで留まるheader
    //     let header = $(".g-navi-wrap");
    //     // let headTop = header.offset().top;
    //     let key = $("#keyVisual");
    //     let keyBtm = key.offset().top + key.height();

    //     if(viewWidth > 767){
    //         if(window.scrollY >= keyBtm){
    //             header.css({
    //                 "position":"fixed","top": 0
    //             });
    //             Button();
    //         }
    //         else{
    //             header.css({
    //                 "position":"relative"
    //             });
    //             $(".font-button").css("right","30px");
    //         }
    //     }
    // });
    /********************************************************
     *にょきっと出てくるナビマーク
     *******************************************************/
    // let logo = $("#logo-img");
    // let logoTop = logo.offset().top;

    // if(logoTop - window.scrollY - 200 < 0){
        $(".g-navi-items").on("mouseover", function(){
            $(this).addClass("active");
        });
        $(".g-navi-items").on("mouseleave", function(){
            $(this).removeClass("active");
        });
    // }

    /********************************************************
    *文字サイズ変更
    *******************************************************/
    const NORMAL = "100%";      // フォントサイズ中(デフォルト)
    const BIG = "133.3%";       // フォントサイズ大
    const COLOR_1 = "#fafeff";  // ノンアクティブ時の背景色
    const COLOR_2 = "#88c1d8";  // アクティブ時の背景色

    $("#normal").click(function(){
        $(this).css("background-color", COLOR_2);
        $("#big").css("background-color", COLOR_1);
        $("html").css("font-size", NORMAL);
    });
    $("#big").click(function(){
        $(this).css("background-color", COLOR_2);
        $("#normal").css("background-color", COLOR_1);
        $("html").css("font-size", BIG);
    });

    /********************************************************
     *ハンバーガーメニューの開閉
     *******************************************************/
    $(".hamburger").click(function(){
        $(".burger").toggleClass("active");
        $(".site-map #container").slideToggle(300,"linear");
        $("#header").toggleClass("active");
    });
});