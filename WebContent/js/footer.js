$(document).ready(function(){
    function changeColors(dist){
         $("#footer-west,#footer-east,#footer-south").css({"z-index":"1"});
        if(dist == "footer-west"){
            $("#footer-west").css({"z-index":"3"});
            $(".district").css("left",0);
        }
        else if(dist == "footer-east"){
            $("#footer-east").css({"z-index":"3"});
            $(".district").css("left","-480px");
        }
        else if(dist == "footer-south"){
            $("#footer-south").css({"z-index":"3"});
            $(".district").css("left","-960px");
        }
    }

    $(".dist").click(function(){
        changeColors($(this).attr("id"));
    });

    $("#logo").click(function () {
        $("html,body").animate({
            scrollTop: 0
        }, 400, "linear");
    });

});