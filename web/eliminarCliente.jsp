

<%@page import="Logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./Node/css/style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
  <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    </head>
    <body>
        <%  Controladora control=new Controladora();
            HttpSession misession=request.getSession(true);
            String usu=(String)misession.getAttribute("usuario");
      
         %>
        <header>

    <nav class="navbar navbar-expand-lg navbar-light bg-light " id="nav">
      <div class="container-fluid">
        <a class="navbar-brand" href="#"><img src="./images/logo.png"
            alt="logo del emprendimiento" id="logoemprendimiento"></img></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
          aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link " aria-current="page" href="verEmpleados.jsp">Empleados</a>
            </li>
            <li class="nav-item">
              <a class="nav-link " aria-current="page" href="seleccionarPaquete.jsp" >Servicios</a>
            </li>
            <li class="nav-item">
              <a class="nav-link " aria-current="page" href="cargarPaquete.jsp">Paquetes</a>
            </li>

            <li class="nav-item">
              <a class="nav-link active" href="cargarVenta.jsp">Ventas</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" id="visitado"  href="cargarCliente.jsp">Clientes</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="./pages/contacto.html">Ganancias</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

  </header>
        <section class="eliminarServicios" data-aos="zoom-in-down">

        <div class="menu">
        <lu>
            <li class="elementoMenu"><a href="buscarCliente.jsp"><h5 id="titulosMenu">Buscar</h5></a></li>
            <li class="elementoMenu"><a href="cargarCliente.jsp"><h5 id="titulosMenu">Cargar</h5></a></li>
            <li class="elementoMenu"><a><h5 id="seleccionado">Eliminar</h5></a></li>
          <li class="elementoMenu"><a href="modificarCliente.jsp"><h5 id="titulosMenu">Modificar</h5></a></li>
        </lu>  
        </div>
    
        <form class="cargar">
          <label for="buscar" id="label">Buscar cliente</label><br> 
          <input type="text" placeholder="Ingrese número de dni del cliente " id="datos" label=""><br>
          <button type="button" class="btn btn-success">Buscar</button>
          <label for="nombre"  id="label">IdCliente</label><br> 
          <input type="text" placeholder="Estado de la búsqueda " id="datos" label=""><br>
          <button type="button" class="btn btn-success">Eliminar</button>
        </form>
       
        </div>

          </section>
        <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
<script>
  AOS.init();
</script>
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
  integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>

</body>
</html>
