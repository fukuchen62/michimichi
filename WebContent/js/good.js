$(document).ready(function(){
    /********************************************************
     *いいねボタン制御
     *******************************************************/
    function good(){
        let good = document.getElementById("good");
        let numGood = parseInt(good.innerHTML);

        numGood += 1;
        good.innerHTML = numGood;
    }

     $(".thumb, .heart").click(function(){
         good();
    })
});