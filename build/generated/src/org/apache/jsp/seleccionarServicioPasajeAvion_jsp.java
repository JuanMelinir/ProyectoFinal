package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Logica.Servicio;
import java.util.List;
import Logica.Cliente;
import Logica.Controladora;

public final class seleccionarServicioPasajeAvion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./Node/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css\" />\n");
      out.write("  <link href=\"https://unpkg.com/aos@2.3.1/dist/aos.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("    integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light \" id=\"nav\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\"><img src=\"./images/logo.png\"\n");
      out.write("            alt=\"logo del emprendimiento\" id=\"logoemprendimiento\"></img></a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\"\n");
      out.write("          aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("          <ul class=\"navbar-nav\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link \" aria-current=\"page\" href=\"\">Empleados</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" id=\"visitado\" aria-current=\"page\" href=\"cargarServicio.jsp\"> Servicios</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link \" aria-current=\"page\" href=\"crearPaquete.jsp\">Paquetes</a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active\" href=\"cargarVenta.jsp\">Ventas</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active\" href=\"cargarCliente.jsp\">Clientes</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"./pages/contacto.html\">Ganancias</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("  </header>\n");
      out.write("        <section class=\"servicios\" data-aos=\"zoom-in-down\">\n");
      out.write(" \n");
      out.write("<div class=\"menu\">\n");
      out.write("<lu>\n");
      out.write("  <li class=\"elementoMenu\"><a hre=\"seleccionarServicio.jsp\"><h5  id=\"seleccionado\">Ver</h5></a></li>\n");
      out.write("  <li class=\"elementoMenu\"><a href=\"cargarServicio.jsp\"><h5 id=\"titulosMenu\">Cargar</h5></a></li>\n");
      out.write("</lu>  \n");
      out.write("</div>\n");
      out.write("<div class=\"menuServicios\">\n");
      out.write("<lu>\n");
      out.write("    <li class=\"elementoMenu\"><a href=\"seleccionarServicio.jsp\"><h5 id=\"titulosMenu\">Hoteles</h5></a></li>\n");
      out.write("  <li class=\"elementoMenu\"><a href=\"seleccionarServicioAlquiler.jsp\"><h5  id=\"titulosMenu\" >Alquiler de vehículos</h5></a></li>\n");
      out.write("  <li class=\"elementoMenu\"><a href=\"\"><h5 id=\"seleccionadoSubMenu\">Pasajes avión</h5></a></li>\n");
      out.write("  <li class=\"elementoMenu\"><a href=\"seleccionarServicioPasajeColectivo.jsp\"><h5 id=\"titulosMenu\">Pasajes colectivo</h5></a></li>\n");
      out.write("  <li class=\"elementoMenu\"><a href=\"seleccionarServicioPasajeTren.jsp\"><h5 id=\"titulosMenu\">Pasajes tren</h5></a></li>\n");
      out.write("  <li class=\"elementoMenu\"><a href=\"seleccionarServicioExcursiones.jsp\"><h5  id=\"titulosMenu\">Excursiones</h5></a></li>\n");
      out.write("  <li class=\"elementoMenu\"><a href=\"seleccionarServicioEventos.jsp\"><h5 id=\"titulosMenu\">Eventos</h5></a></li>\n");
      out.write("</lu>  \n");
      out.write("</div>\n");
      out.write("            <!--<div class=\"contenedorDeServicios\">-->\n");
      out.write("                \n");
      out.write("                <!--<div class=\"contenedorLogo\"><img clas=\"imgLogo\" src=\"./images/logoHotel.png\"></img></div>\n");
      out.write("                <div class=\"contenedorTabla\">-->\n");
      out.write("                     <div class=\"tablaDatos\">\n");
      out.write("                 \n");
      out.write("                <table>\n");
      out.write("                    <thead>\n");
      out.write("                        <tr class=\"row100 head \">\n");
      out.write("\n");
      out.write("                            <th class=\"cell100 column2\">Nombre</th>\n");
      out.write("                            <th class=\"cell100 column3\">Descripción</th>\n");
      out.write("                            <th class=\"cell100 column4\">Destino</th>\n");
      out.write("                            <th class=\"cell100 column5\">Fecha</th>\n");
      out.write("                            <th class=\"cell100 column6\">Costo</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                        Controladora control=new Controladora();
                        List<Servicio>listaServicios=control.traerServicios();
                        for(Servicio servicio:listaServicios){
                            
      out.write("\n");
      out.write("                            <tr class=\"row100 body\">\n");
      out.write("                            ");

                            String id=servicio.getCodigo_servicio();
                            String nombre=servicio.getNombre();
                            String descripcion=servicio.getDescripcion_breve();
                            String destino=servicio.getDestino_servicio();
                            String fecha=servicio.getFecha_servicio();
                            Double costo=servicio.getCosto_servicio();
                            if(nombre.toUpperCase().compareTo("Pasaje avion")==0)
                            {
      out.write(" \n");
      out.write("                            <td class=\"cell100 column2\">");
      out.print(nombre);
      out.write("</td>\n");
      out.write("                            <td class=\"cell100 column3\">");
      out.print(descripcion);
      out.write("</td>                           \n");
      out.write("                            <td class=\"cell100 column4\">");
      out.print(destino);
      out.write("</td>                         \n");
      out.write("                            <td class=\"cell100 column5\">");
      out.print(fecha);
      out.write("</td>      \n");
      out.write("                            <td class=\"cell100 column6\">");
      out.print(costo);
      out.write("\n");
      out.write("                            <td class=\"cell100 column7\">\n");
      out.write("                                <form class=\"modificar\" name=\"eliminar\"  action=\"SvEliminarCliente\" method=\"POST\" style=\"display:inline\">\n");
      out.write("                                    <input type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\">\n");
      out.write("                                    <button type=\"submit\" style=\"display:inline\" class=\"btn btn-success\">Eliminar</button>\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"cell100 column1\">\n");
      out.write("                                <form class=\"modificar\"  action=\"SvModificarCliente\" method=\"POST\" style=\"display:inline\">\n");
      out.write("                                <input type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\">\n");
      out.write("                                <button type=\"submit\" style=\"display:inline\" class=\"btn btn-success\">Modificar</button>    \n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"cell100 column1\">\n");
      out.write("                                <form class=\"modificar\"  action=\"SvSeleccionarCliente\" method=\"POST\" style=\"display:inline\">\n");
      out.write("                                <input type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\">\n");
      out.write("                                <button type=\"submit\" style=\"display:inline\" class=\"btn btn-success\">Seleccionar</button>    \n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                            </tr> \n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        \n");
      out.write("                    </tbody>\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("                <!--<input type=\"text\" placeholder=\"ingrese número de dni del cliente\" id=\"datos\" label=\"\"><br>\n");
      out.write("                <button type=\"button\" class=\"btn btn-success\">Buscar</button>\n");
      out.write("                <label for=\"nombre\" id=\"label\">Resultado de la busqueda</label><br> \n");
      out.write("          <input type=\"text\" placeholder=\"IdCliente \" id=\"datos\" label=\"\"><br>-->\n");
      out.write("              </div>\n");
      out.write("                <!---->\n");
      out.write("        <!--</div>\n");
      out.write("            </div>-->\n");
      out.write(" \n");
      out.write("      \n");
      out.write("             \n");
      out.write("<!--\n");
      out.write("      <div class=\"contenedorServicios\">\n");
      out.write("        <div class=\"contenedorServicio\">\n");
      out.write("\n");
      out.write("              <img class=\"logosServicio\" src=\"./images/logoHotel.png\"></img>\n");
      out.write("              <h3 class=\"tituloServicio\">Hoteles</h3>\n");
      out.write("    \n");
      out.write("              <select name=\"\" class=\"seleccion\">\n");
      out.write("                <option value=\"N\">Un hotel</option>\n");
      out.write("              </select>\n");
      out.write("              <button type=\"button\" class=\"btn btn-success\">Seleccionar</button>\n");
      out.write("            </div>   \n");
      out.write("\n");
      out.write("        <div class=\"contenedorServicio\">\n");
      out.write(" \n");
      out.write("              <img class=\"logosServicio\" src=\"./images/logoAutos.png\"></img>\n");
      out.write("              <h3 class=\"tituloServicio\">Alquiler de vehículos</h3>\n");
      out.write("            \n");
      out.write("              <select name=\"\" class=\"seleccion\">\n");
      out.write("                <option value=\"N\">Un auto</option></div>\n");
      out.write("              </select>\n");
      out.write("              <button type=\"button\" class=\"btn btn-success\">Seleccionar</button>\n");
      out.write("            </div>   \n");
      out.write("\n");
      out.write("        <div class=\"contenedorServicio\">\n");
      out.write("\n");
      out.write("              <img class=\"logosServicio\" src=\"./images/logoPasajes.png\"></img>\n");
      out.write("              <h3 class=\"tituloServicio\">Pasajes</h3>\n");
      out.write("    \n");
      out.write("              <h3 class=\"tituloServicio\">Transporte</h3>\n");
      out.write("              <select name=\"\" class=\"seleccion\">\n");
      out.write("                <option value=\"N\">Colectivo</option>\n");
      out.write("                <option value=\"N\">Avión</option>\n");
      out.write("                <option value=\"N\">Tren</option></div>\n");
      out.write("              </select>\n");
      out.write("              <h3 class=\"tituloServicio\">Pasajes</h3>\n");
      out.write("              <select name=\"\" class=\"seleccion\">\n");
      out.write("                <option value=\"N\">Un pasaje</option></div>\n");
      out.write("              </select>\n");
      out.write("              <button type=\"button\" class=\"btn btn-success\">Seleccionar</button>\n");
      out.write("            </div>   \n");
      out.write("\n");
      out.write("        <div class=\"contenedorServicio\">\n");
      out.write("\n");
      out.write("              <img class=\"logosServicio\" src=\"./images/logoExcursion.png\"></img>\n");
      out.write("              <h3 class=\"tituloServicio\">Excursiones</h3>\n");
      out.write("\n");
      out.write("              <select name=\"\" class=\"seleccion\">\n");
      out.write("                <option value=\"N\">Una excursion</option>\n");
      out.write("              </select>\n");
      out.write("              <button type=\"button\" class=\"btn btn-success\">Seleccionar</button>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("          <div class=\"contenedorServicio\">\n");
      out.write("\n");
      out.write("                <img class=\"logosServicio\" src=\"./images/logoEventos.png\"></img>\n");
      out.write("                <h3 class=\"tituloServicio\">Eventos</h3>\n");
      out.write("\n");
      out.write("                <select name=\"\" class=\"seleccion\">\n");
      out.write("                  <option value=\"N\">Un evento</option></div>\n");
      out.write("                </select>\n");
      out.write("                <button type=\"button\" class=\"btn btn-success\">Seleccionar</button>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <button type=\"button\" class=\"btn btn-success\">CONFIRMAR</button>\n");
      out.write("</div>\n");
      out.write("-->\n");
      out.write("  </section>\n");
      out.write("         <script src=\"https://unpkg.com/aos@2.3.1/dist/aos.js\"></script>\n");
      out.write("<script>\n");
      out.write("  AOS.init();\n");
      out.write("</script>\n");
      out.write("</script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("  integrity=\"sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
