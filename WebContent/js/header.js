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
     window.addEventListener("scroll",function(){
        // topで留まるheader
        let header = $("#header");
        let headTop = header.offset().top;
        let logo = $("#logo-img");
        let logoTop = logo.offset().top;
        let scrollPos = $(window).height() + window.scrollY;

        if(viewWidth > 767){
            if(window.scrollY >= logoTop){
                logo.css({"height": "60px"});
            }
            else{
                logo.css({"height": "120px"});
            }

            if(window.scrollY >= headTop){
                header.css({
                    "position":"sticky","top": 0
                });
                Button();
            }
            else{
                header.css({
                    "position":"relative"
                });
                $(".font-button").css("right","30px");
            }
        }
    });

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
        $("#container").slideToggle(300,"linear");
    });
});