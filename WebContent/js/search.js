$(document).ready(function(){
    let all = document.getElementById("all");
    let all_sp = document.getElementById("all-sp");
    const district = document.getElementsByName("area");

    function CheckAll(){
        if(this.checked == true){
            for(let i = 0; i < district.length; i++){
                district[i].checked = true;
            }
        }
        else{
            for(let i = 0; i < district.length; i++){
                district[i].checked = false;
            }
        }
    }
    all.addEventListener("click", CheckAll, false);
    all_sp.addEventListener("click", CheckAll, false);

    $(".dist").click(function(){
        all.checked = false;
        all_sp.checked = false;
    });
});