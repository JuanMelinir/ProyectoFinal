

<%@page import="Logica.Servicio"%>
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
        <%  Controladora control = new Controladora();
            HttpSession misession = request.getSession(true);
            String usu = (String) misession.getAttribute("usuario");

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
                                <a class="nav-link " id="visitado" aria-current="page" href="seleccionarPaquete.jsp" >Servicios</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " aria-current="page" href="crearPaquete.jsp">Paquetes</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link active" href="cargarVenta.jsp">Ventas</a>
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
        <section class="modificarServicios" data-aos="zoom-in-down">

            <div class="menu">
                <lu>
                    <li class="elementoMenu"><a href="seleccionarServicio.jsp"><h5 id="titulosMenu">Ver</h5></a></li>
                    <li class="elementoMenu"><a><h5 id="seleccionado">Cargar</h5></a></li>
                </lu>  
            </div>


            <form class="cargar">
                <%  
                    Servicio servicio = (Servicio) misession.getAttribute("servicio");
                    String nombre = servicio.getNombre();
                    String descripcion = servicio.getDescripcion_breve();
                    String destino = servicio.getDestino_servicio();
                    String fecha = servicio.getFecha_servicio();
                    double costo = servicio.getCosto_servicio();
                      %>

            </form>
            <form class="cargar" action="SvModificarServicio" method="post">
                <label for="nombre" id="label">Nombre</label><br> 
                <input type="text" placeholder="sin dato " id="datos" label="" value="<%=nombre%>"><br>
                <label for="nombre" id="label">Descripción</label><br> 
                <input type="text" placeholder="sin dato " id="datos" label="" value="<%=descripcion%>"><br>
                <label for="nombre" id="label">Destino</label><br> 
                <input type="text" placeholder="sin dato " id="datos" label="" value="<%=destino%>"><br>
                <label for="nombre" id="label">Fecha</label><br> 
                <input type="text" placeholder="sin dato " id="datos" label="" value="<%=fecha%>"><br>
                <label for="nombre" id="label">Costo</label><br> 
                <input type="text" placeholder="sin dato " id="datos" label="" value="<%=costo%>"><br>
                <button type="submit" class="btn btn-success"><a href="seleccionarServicio.jsp">Modificar</a></button>
            </form>   
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
