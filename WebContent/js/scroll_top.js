$(document).ready(function(){
    $(".back-top").click(function () {
        $("html,body").animate({
            scrollTop: 0
        }, 400, "linear");
    });
});
