<%-- 
    Document   : modificarEmpleado
    Created on : 20-dic-2021, 19:30:11
    Author     : w11
--%>

<%@page import="Logica.Empleado"%>
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
          
    </div>

    <form class="cargar" action="SvModificarEmpleado" method="post">
        <%
        HttpSession misession=request.getSession();
        Empleado empleado=(Empleado)misession.getAttribute("empleado");
        String nombre=empleado.getNombre();
        String apellido=empleado.getApellido();
        String direccion=empleado.getDireccion();
        String dni=empleado.getDni();
        String fecha=empleado.getFecha_nac();
        String nacionalidad=empleado.getNacionalidad();
        String celular=empleado.getCelular();
        String email=empleado.getEmail();
        String cargo=empleado.getCargo();
        double sueldo=empleado.getSueldo();
        String usuario=empleado.getUsuario().getNombre();
        String contra=empleado.getUsuario().getContraseña();
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
            <label for="nombre" id="label">Cargo</label><br> 
            <input type="text" placeholder="ingrese cargo" id="datos" label="" name="cargo" value="<%=cargo%>"><br>
            <label for="nombre" id="label">Sueldo</label><br> 
            <input type="text" placeholder="ingrese sueldo" id="datos" label="" name="sueldo" value="<%=sueldo%>"><br>
            <label for="nombre" id="label">Usuario</label><br> 
            <input type="email"placeholder="ingrese usuario" id="datos" label="" name="usuario" value="<%=usuario%>"><br>
            <label for="nombre" id="label">Contraseña</label><br> 
            <input type="text" placeholder="ingrese contraseña" id="datos" label="" name="contra" value="<%=contra%>"><br>
            <button type="submit" class="btn btn-success">Modificar</button>>
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
