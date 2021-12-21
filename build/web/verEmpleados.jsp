<%-- 
    Document   : verEmpleados
    Created on : 20-dic-2021, 19:01:05
    Author     : w11
--%>

<%@page import="Logica.Empleado"%>
<%@page import="java.util.List"%>
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
              <a class="nav-link " aria-current="page"  id="visitado"  href="verEmpleados.jsp">Empleados</a>
            </li>
            <li class="nav-item">
              <a class="nav-link " aria-current="page" href="seleccionarServicio.jsp">Servicios</a>
            </li>
            <li class="nav-item">
              <a class="nav-link "  aria-current="page" href="seleccionarPaquete.jsp">Paquetes</a>
            </li>

            <li class="nav-item">
              <a class="nav-link active"  href="cargarVenta.jsp">Ventas</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" href="cargarCliente.jsp">Clientes</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="">Ganancias</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

  </header>
        <section class="ventas" data-aos="zoom-in-down">

                <div class="menu">
                <lu>
                    <li class="elementoMenu"><a><h5  id="seleccionado">Ver</h5></a></li>
                  <li class="elementoMenu"><a href="crearUsuario.jsp"><h5 id="titulosMenu">Crear</h5></a></li>
                </lu>  
                </div>
            
                <div class="tablaDatos">
                <label for="buscar" id="label">Ventas</label><br> 
                <table>
                    <thead>
                        <tr class="row100 head ">
                            <th class="cell100 column1">Nombre</th>
                            <th class="cell100 column2">Apellido</th>
                            <th class="cell100 column1">Direccion</th>
                            <th class="cell100 column2">DNI</th>
                            <th class="cell100 column2">Fecha de nacimiento</th>
                            <th class="cell100 column2">Nacionalidad</th>
                            <th class="cell100 column2">Celular</th>
                            <th class="cell100 column2">Email</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%  
                        List<Empleado>listaEmpleados=control.listarEmpleados();
                        for(Empleado e:listaEmpleados){
                            %>
                            <tr class="row100 body">
                            <%String id=e.getIdEmpleado();
                            String nombre=e.getNombre();
                            String apellido=e.getApellido();
                            String direccion=e.getDireccion();
                            String dni=e.getDni();
                            String fecha=e.getFecha_nac();
                            String nacionalidad=e.getNacionalidad();
                            String celular=e.getCelular();
                            String email=e.getEmail();
                            %> 
                            <td class="cell100 column1"><%=nombre%></td>
                            <td class="cell100 column2"><%=apellido%></td>                           
                            <td class="cell100 column3"><%=direccion%></td>                         
                            <td class="cell100 column4"><%=dni%></td>      
                            <td class="cell100 column5"><%=fecha%>
                            <td class="cell100 column6"><%=nacionalidad%></td>
                            <td class="cell100 column7"><%=celular%></td>                  
                            <td class="cell100 column8"><%=email%> </td>
                            <td class="cell100 column1">
                                <form class="modificar" name="eliminar"  action="SvEliminarEmpleado" method="POST" style="display:inline">
                                    <input type="hidden" name="id" value="<%=id%>">
                                    <button type="submit" style="display:inline" class="btn btn-success">Eliminar</button>
                                </form>
                            </td>
                            <td class="cell100 column1">
                                <form class="modificar"  action="SvModificarEmpleado" method="POST" style="display:inline">
                                <input type="hidden" name="id" value="<%=id%>">
                                <button type="submit" style="display:inline" class="btn btn-success">Modificar</button>    
                                </form>
                            </td>
                            <td class="cell100 column1">
                                <form class="modificar"  action="SvSeleccionaEmpleado" method="POST" style="display:inline">
                                <input type="hidden" name="id" value="<%=id%>">
                                <button type="submit" style="display:inline" class="btn btn-success">Seleccionar</button>    
                                </form>
                            </td>
                            </tr> 
                        <%}%>
                    </tbody>
                </table>
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
