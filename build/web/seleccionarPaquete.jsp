
<%@page import="Logica.Servicio"%>
<%@page import="Logica.PaqueteTuristico"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Cliente"%>
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
              <a class="nav-link " aria-current="page" href="seleccionarServicio.jsp">Servicios</a>
            </li>
            <li class="nav-item">
              <a class="nav-link " id="visitado" aria-current="page" href="seleccionarPaquete.jsp">Paquetes</a>
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
                  <li class="elementoMenu"><a href="crearPaquete.jsp"><h5 id="titulosMenu">Crear</h5></a></li>
                </lu>  
                </div>
            
                <div class="tablaDatos">
                <label for="buscar" id="label">Paquetes</label><br> 
                <table>
                    <thead>
                        <tr class="row100 head ">
                            <th class="cell100 column1">Servicios</th>
                            <th class="cell100 column2">Costo Paquete</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                        List<PaqueteTuristico>listaPaquetes=control.traerPaquetes();
                        for(PaqueteTuristico p:listaPaquetes){
                            %>
                            <tr class="row100 body">
                            <%int id=p.getCodigo_paquete();
                            List<Servicio>servicios=p.getlistaServicios();
                            double costoP=p.getCosto_paquete();
                            %> 
                            <td class="cell100 column1">
                                <div class="tablaDatos">
                 
                <table>
                    <thead>
                        <tr class="row100 head ">

                            <th class="cell100 column2">Nombre</th>
                            <th class="cell100 column3">Descripci??n</th>
                            <th class="cell100 column4">Destino</th>
                            <th class="cell100 column5">Fecha</th>
                            <th class="cell100 column6">Costo</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                        for(Servicio servicio:servicios){
                            %>
                            <tr class="row100 body">
                            <%
                            String nombre=servicio.getNombre();
                            String descripcion=servicio.getDescripcion_breve();
                            String destino=servicio.getDestino_servicio();
                            String fecha=servicio.getFecha_servicio();
                            Double costo=servicio.getCosto_servicio();
                            %> 
                            <td class="cell100 column2"><%=nombre%></td>
                            <td class="cell100 column3"><%=descripcion%></td>                           
                            <td class="cell100 column4"><%=destino%></td>                         
                            <td class="cell100 column5"><%=fecha%></td>      
                            <td class="cell100 column6"><%=costo%></td>
                            </tr> 
                            <%}%>
                        
                        
                    </tbody>           
                </table>
              </div>

                            </td>
                            <td class="cell100 column2"><%=costoP%></td>                           
                            <td class="cell100 column1">
                                <form class="modificar" name="eliminar"  action="SvEliminarPaquete" method="POST" style="display:inline">
                                    <input type="hidden" name="id" value="<%=id%>">
                                    <button type="submit" style="display:inline" class="btn btn-success">Eliminar</button>
                                </form>
                            </td>
                            <td class="cell100 column1">
                                <form class="modificar"  action="SvModificarCPaquete" method="POST" style="display:inline">
                                <input type="hidden" name="id" value="<%=id%>">
                                <button type="submit" style="display:inline" class="btn btn-success">Modificar</button>    
                                </form>
                            </td>
                            <td class="cell100 column1">
                                <form class="modificar"  action="SvSeleccionarPaquete" method="POST" style="display:inline">
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