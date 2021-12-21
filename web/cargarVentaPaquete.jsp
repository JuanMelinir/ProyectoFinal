

<%@page import="Logica.Controladora"%>
<%@page import="java.time.LocalDate"%>
<%@page import="Logica.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Servicio"%>
<%@page import="Logica.PaqueteTuristico"%>
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
                                <a class="nav-link " aria-current="page" href="seleccionarPaquete.jsp">Paquetes</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link active" id="visitado" href="cargarVenta.jsp">Ventas</a>
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
                    <li class="elementoMenu"><a><h5 id="seleccionado">Crear</h5></a></li>
                    <li class="elementoMenu"><a href="eliminarVenta.jsp"><h5 id="titulosMenu">Eliminar</h5></a></li>
                    <li class="elementoMenu"><a href="modificarVenta.jsp"><h5 id="titulosMenu">Modificar</h5></a></li>
                    <li class="elementoMenu"><a href="mostrarVenta.jsp"><h5 id="titulosMenu">Mostrar</h5></a></li>
                </lu>  
            </div>
            <div class="cargar">
                <form class="cargar" action="SvVentaPaquete"  method="post" action="SvSeleccionarCliente" method="get" action="SvEliminarClienteSeleccionado" >
                    <%
                        LocalDate today = LocalDate.now();
                        String numero = (String) misession.getAttribute("numero");
                        String fecha = today.toString();
                    %>  
                    <label for="buscar" id="label" name="fecha">Fecha</label><br> 
                    <input type="text" placeholder="Ingrese fecha" id="datos" label="" name="fecha" value="<%=fecha%>"><br>
                </form>
                <label for="buscar" id="label">Cliente</label><br> 

                <button type="submit" class="btn btn-success" ><a  href="verCliente.jsp">Agregar</a></button>

                <label for="buscar" id="label">Cliente agregado</label><br>
                <%
                    Cliente cliente = (Cliente) misession.getAttribute("clienteVenta");
                    if (cliente != null) {
                        int id = cliente.getIdCliente();
                        String nombre = cliente.getNombre();
                        String apellido = cliente.getApellido();
                        String direccion = cliente.getDireccion();
                        String dni = cliente.getDni();
                        String fechaCliente = cliente.getFecha_nac();
                        String nacionalidad = cliente.getNacionalidad();
                        String celular = cliente.getCelular();
                        String email = cliente.getEmail();
                %>
                <table>
                    <thead>
                        <tr class="row100 head ">
                            <th class="cell100 column1">Nombre</th>
                            <th class="cell100 column2">Apellido</th>
                            <th class="cell100 column3">Dirección</th>
                            <th class="cell100 column4">DNI</th>
                            <th class="cell100 column5">Fecha de nacimiento</th>
                            <th class="cell100 column6">Nacionalidad</th>
                            <th class="cell100 column7">Celular</th>
                            <th class="cell100 column8">Email</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr class="row100 body">
                            <td class="cell100 column1"><%=nombre%></td>
                            <td class="cell100 column2"><%=apellido%></td>                           
                            <td class="cell100 column3"><%=direccion%></td>                         
                            <td class="cell100 column4"><%=dni%></td>      
                            <td class="cell100 column5"><%=fechaCliente%>
                            <td class="cell100 column6"><%=nacionalidad%></td>
                            <td class="cell100 column7"><%=celular%></td>                  
                            <td class="cell100 column8"><%=email%> </td>
                            <td class="cell100 column1">
                                <form class="modificar" name="eliminar"  action="SvEliminarClienteSeleccionado" method="POST" style="display:inline">
                                    <input type="hidden" name="id" value="<%=id%>">
                                    <button type="submit" style="display:inline" class="btn btn-success">Eliminar</button>
                                </form>
                            </td>
                        </tr>
                    </tbody>         
                </table>
                <%}%>

                <label for="buscar" id="label">Producto</label><br> 
                <select name="" class="seleccion" id="seleccionProducto" onclick="seleccion()">
                    <option value="servicio">Servicio</option></div>
            <option value="paquete">Paquete</option></div>
    </select>
    <button  type="button" class="btn btn-success"  ><a href="#" id="linkBoton" onclick="ir()">Agregar</a></button>
    <label for="buscar" id="label">Producto agregado</label><br> 

    <div  id="tablaDatos">
        <label for="buscar" id="label">Paquete</label><br> 
        <table>
            <thead>
                <tr class="row100 head ">
                    <th class="cell100 column1">Servicios</th>
                    <th class="cell100 column2">Costo Paquete</th>
                </tr>
            </thead>
            <tbody>
                <%
                    PaqueteTuristico paqueteVenta = (PaqueteTuristico) misession.getAttribute("paqueteVenta");
                    if (paqueteVenta != null) {
                %>
                <tr class="row100 body">
                    <%int id = paqueteVenta.getCodigo_paquete();
                        List<Servicio> serviciosP = paqueteVenta.getlistaServicios();
                        double costoP = paqueteVenta.getCosto_paquete();
                    %> 
                    <td class="cell100 column1">
                        <div class="tablaDatos">
                            <table>
                                <thead>
                                    <tr class="row100 head ">

                                        <th class="cell100 column2">Nombre</th>
                                        <th class="cell100 column3">Descripción</th>
                                        <th class="cell100 column4">Destino</th>
                                        <th class="cell100 column5">Fecha</th>
                                        <th class="cell100 column6">Costo</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                        for (Servicio servicio : serviciosP) {
                                    %>
                                    <tr class="row100 body">
                                        <%
                                            String nombre = servicio.getNombre();
                                            String descripcion = servicio.getDescripcion_breve();
                                            String destino = servicio.getDestino_servicio();
                                            String fechaS = servicio.getFecha_servicio();
                                            Double costo = servicio.getCosto_servicio();
                                        %> 
                                        <td class="cell100 column2"><%=nombre%></td>
                                        <td class="cell100 column3"><%=descripcion%></td>                           
                                        <td class="cell100 column4"><%=destino%></td>                         
                                        <td class="cell100 column5"><%=fechaS%></td>      
                                        <td class="cell100 column6"><%=costo%></td>
                                    </tr> 
                                </tbody> 
                            </table>
                        </div>
                    </td>
                    <td class="cell100 column2"><%=costoP%></td>                           
                    <td class="cell100 column1">
                        <form class="modificar" name="eliminar"  action="SvEliminarPaqueteVenta" method="POST" style="display:inline">
                            <input type="hidden" name="id" value="<%=id%>">
                            <button type="submit" style="display:inline" class="btn btn-success">Eliminar</button>
                        </form>
                    </td>
                </tr> 

                <%}%>
            </tbody>
        </table>
        <%}%>         
    </div>      
    <label for="buscar" id="label">Medio de pago</label><br> 
    <select name="" class="seleccion" name="pago">
        <option value="E">Efectivo</option>
        <option value="D">Débito</option>
        <option value="C">Crédito</option>
    </select>
    <label for="nombre" id="label">Empleado</label><br> 
    <input type="text" placeholder="Datos del empleado " id="datos" label="empleado" name="empleado"><br>
    <button type="button" class="btn btn-success">Confirmar</button>
</div>

</section>
<script src="./Js/seleccionarPagina1.js"></script>
<script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
<script>
                      AOS.init();
</script>

</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>

</body>
</html>
