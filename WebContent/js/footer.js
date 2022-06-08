$(document).ready(function(){

    function changeColors(dist){
        let color = "#fff";
        let bgColor = "#e69c81";

        $("#west,#east,#south").css({"z-index":"1"});
        if(dist == "west"){
            $("#west").css({"z-index":"3"});
            $(".district").css("left",0);
        }
        else if(dist == "east"){
            $("#east").css({"z-index":"3"});
            $(".district").css("left","-480px");
        }
        else if(dist == "south"){
            $("#south").css({"z-index":"3"});
            $(".district").css("left","-960px");
        }
    }

    $(".dist").click(function(){
        changeColors($(this).attr("id"));
    });
});