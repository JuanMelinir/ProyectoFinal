
<%@page import="Logica.Controladora"%>
<%@page import="Logica.Cliente"%>
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
              <a class="nav-link "  aria-current="page" href="cargarServicio.jsp" >Servicios</a>
            </li>
            <li class="nav-item">
              <a class="nav-link " aria-current="page" href="seleccionarPaquete.jsp">Paquetes</a>
            </li>

            <li class="nav-item">
              <a class="nav-link active" href="cargarVenta.jsp">Ventas</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" id="visitado" href="cargarCliente.jsp">Clientes</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="">Ganancias</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

  </header>
        <section class="cargarCliente" data-aos="zoom-in-down">
        <div class="menu">
    <lu>
        <li class="elementoMenu"><a href="verCliente.jsp"><h5 id="titulosMenu">Ver</h5></a></li>
        <li class="elementoMenu"><a><h5 id="titulosMenu">Cargar</h5></a></li>

    </lu>  
    </div>

    <form class="cargar" action="SvModificarCliente" method="get">
        <%
        Cliente cliente=(Cliente)misession.getAttribute("cliente");
        int id=cliente.getIdCliente();
        String nombre=cliente.getNombre();
        String apellido=cliente.getApellido();
        String direccion=cliente.getDireccion();
        String dni=cliente.getDni();
        String fecha=cliente.getFecha_nac();
        String nacionalidad=cliente.getNacionalidad();
        String celular=cliente.getCelular();
        String email=cliente.getEmail();
        {%>
        <label for="nombre" id="label">Datos a ingresar</label><br> 
            <label for="nombre" id="label">Nombre</label><br> 
            <input type="text" placeholder="ingrese nombre " id="datos" label="" name="nombre" value="<%=nombre%>"><br>
            <label for="nombre" id="label">Apellido</label><br> 
            <input type="text" placeholder="ingrese apellido " id="datos" label="" name="apellido" value="<%=apellido%>"><br>
            <label for="nombre" id="label">Dirección</label><br> 
            <input type="text" placeholder="ingrese dirección " id="datos" label="" name="direccion" value="<%=direccion%>"><br>
            <label for="nombre" id="label">DNI</label><br> 
            <input type="text" placeholder="ingrese número de DNI " id="datos" label="" name="dni" value="<%=dni%>"><br>
            <label for="nombre" id="label">Fecha de nacimiento</label><br> 
            <input type="text" placeholder="ingrese fecha de nacimiento " id="datos" label="" name="fecha" value="<%=fecha%>"><br>
            <label for="nombre" id="label">Nacionalidad</label><br> 
            <input type="text" placeholder="ingrese nacionalidad " id="datos" label="" name="nacionalidad" value="<%=nacionalidad%>"><br>
            <label for="nombre" id="label">Celular</label><br> 
            <input type="text" placeholder="ingrese número de celular " id="datos" label="" name="celular" value="<%=celular%>"><br>
            <label for="nombre" id="label">Email</label><br> 
            <input type="text" placeholder="ingrese correo electrónico" id="datos" label="" name="email" value="<%=email%>"><br>
            <button type="submit" class="btn btn-success">Modificar</button>
            <%}%>
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
