$(document).ready(function(){
    window.addEventListener("scroll", function(){
        let wh = $(window).height();
        let scrollPos = window.scrollY + wh;

		if(document.body.offsetWidth > 767){
	        if(scrollPos > 1500){
	            $(".back-top").css({"bottom": "50px"});
	        }
	        else{
	        	$(".back-top").css({"bottom": "-250px"});
	        }
	    }
    });

    $(".back-top").click(function () {
        $("html,body").animate({
            scrollTop: 0
        }, 400, "linear");
    });
});
