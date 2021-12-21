
function seleccion(){

 let seleccionado=document.getElementById("seleccionProducto");
    console.log(seleccionado.value);
    let ruta=document.getElementById("linkBoton");
    console.log(ruta.href);
    if(seleccionado.value=="servicio"){
    ruta.setAttribute('href','seleccionarServicioVenta.jsp'); 
    }else if(seleccionado.value=="paquete"){
    ruta.setAttribute('href','seleccionarPaquete.jsp'); 
    }
return false;    
}
function ir(){
window.location.href=document.getElementById('linkBoton').href ;   
}


seleccion();   
