$(document).ready(function(){
    $(".policy-link,.policy-modal").click(function(){
        $(".policy-modal").toggle(50);
    });
    $(".btn-submit").click(function(){
        let comment = document.getElementById("inquiry-text");

        comment.value = comment.value.replace(/\n/g, "<br>");
        comment.value = comment.value.replace(/'/g, "’");
        comment.value = comment.value.replace(/"/g, "”");
    });
});