let ubicacionPrincipal=window.pageYOffset
let $nav=document.querySelector("#nav");

window.addEventListener("scroll",function(){
    let ubicacionActual=window.pageYOffset
    console.log(ubicacionActual)
    if(ubicacionActual<=600){
        $nav.style.top="-110px";
    }else{
        $nav.style.top="0px";   
    }
})

let ubicacionActual=window.pageYOffset
    console.log(ubicacionActual)
    if(ubicacionActual<=600){
        $nav.style.top="-110px";
    }