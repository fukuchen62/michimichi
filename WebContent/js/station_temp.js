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

	// spotを押したらモーダルを出してヘッダーを非表示
    $(".spot-box").click(function(){
    console.log("ok");
        $(this).next().show(300);
        $("#header").hide();
    });

	// モーダルをクリックで消してヘッダーを表示
    $(".spot-modal").click(function(){
        $(this).hide(300);
        $("#header").show();
    });

	// informationの周辺施設ボタン
    $(".btn-more").click(function(){
        $(".info-more").slideToggle();
    });

	// recommendを押した時の処理
    $(".commodity").click(function(){
        $(this).toggleClass("active");
        $(this).next().slideToggle(300, "linear");
    });

	// 投稿ボタンを押した時の処理
    $(".btn-comment").click(function(){
        let name = document.getElementById("comment-name");
        let comment = document.getElementById("comment-text");
		let wName = document.getElementById("warning-name");
        let wComment = document.getElementById("warning-comment");

		if(name.value == "" || comment.value == ""){

			// 名前入力判定
			if(name.value == ""){
				// 名前未入力警告
				wName.innerHTML = "※お名前が入力されていません";
			}
			else{
				wName.innerHTML = "";
				console.log(123);
			}

			// コメントの入力判定
			if(comment.value == ""){
				// コメント未入力警告
				wComment.innerHTML = "※コメントが入力されていません";
			}
			else{
				wComment.innerHTML = "";
					console.log(456);
			}

			// 警告文を表示
			$("#warning-wrap").show();
		}
		else{
	        let res_name = document.getElementById("res-name");
	        let res_text = document.getElementById("res-text");
	        res_name.value = name.value;
	        res_text.value = comment.value;

			// モーダルを表示領域に
	        $(".comment-modal").css({"bottom": "0"});

	        // ヘッダーを表示
	        $("#header").hide(300);

	        // フッターのz-indexを-1に
	        $("#footer").css({"z-index": "-1"});

	        $(".btn-submit").click(function(){
	        	// コメントの改行を半角文字を修正
	            res_text.value = res_text.value.replace(/\n/g, "<br>");
	            res_text.value = res_text.value.replace(/'/g, "’");
	            res_text.value = res_text.value.replace(/"/g, "”");

	            // ヘッダーを表示
	            $("#header").show();
	        });
	    }

		// 戻るボタン、送信ボタンを押した時の処理
	    $(".btn-return, .btn-submit").click(function(){
	    	// モーダルを画面外に
	        $(".comment-modal").css({"bottom": "-3000px"});

	        // フッターのz-indexを1に戻す
	        $("#footer").css({"z-index": "1"});

	        // ヘッダーを表示
	        $("#header").show();

			// 警告文を非表示
			$("#warning-wrap").hide(300);

	        // 警告文を消去
			wName.innerHTML = "";
			wComment.innerHTML = "";
	    });
    });

    $(".comment-more").click(function(){
	    $(".comment-accordion").toggle("slow");
	    $(".arrow").toggleClass("active");
	});
});