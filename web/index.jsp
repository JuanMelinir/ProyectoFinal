
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="esp">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Remeras personalizadas</title>
  <meta name="description" content="Las remeras personalizadas de insiders son estampadas con el diseño que vos quieras,además son 100% algodón. ">
  <meta name="keywords" content="remeras,gorras,tazas,personalizadas,algodón,rio negro">
  <link rel="stylesheet" href="./Node/css/style.css">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link rel="preconnect" href="https://fonts.googleapis.com">
<link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet">
  <link href="https: //fonts.googleapis.com/css2? family = Russo + One & display = swap " rel=" stylesheet ">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@300;500&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
  <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>

<body>

  <section class="inicio" data-aos="zoom-in-down">
    <img src="./images/logo.png"
      alt="logo del emprendimiento" id="logoemprendimiento"></img>
    
      <form id="ingreso" action="SvUsuario" method="post">
        <div class="mb-3">
          <label for="exampleInputEmail1" class="form-label">Usuario</label>
          <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="user" >
  
        </div>
        <div class="mb-3">
          <label for="exampleInputPassword1" class="form-label">Contraseña</label>
          <input type="password" class="form-control" id="exampleInputPassword1" name="pass" >
        </div>
         <button type="submit" class="btn btn-primary" ><a id="botonIngresar" href="cargarVenta.jsp">Ingresar</a></button>
         <h1 class="inicio__titulos__titulo1"><a id="registrar" href="crearUsuario.jsp">Registrar usuario nuevo</a></h1>
      </form>
   
 </section>
<script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
<script>
  AOS.init();
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
  integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
</body>

</html>
