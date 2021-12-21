package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Logica.Servicio;
import java.util.List;
import Logica.Cliente;
import Logica.Controladora;

public final class cargarVenta1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("              <a class=\"nav-link \" aria-current=\"page\" href=\"\">Empleados</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link \" aria-current=\"page\" href=\"seleccionarServicio.jsp\">Servicios</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link \" aria-current=\"page\" href=\"crearPaquete.jsp\">Paquetes</a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active\" id=\"visitado\" href=\"cargarVenta.jsp\">Ventas</a>\n");
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
      out.write("        <section class=\"ventas\" data-aos=\"zoom-in-down\">\n");
      out.write("\n");
      out.write("                <div class=\"menu\">\n");
      out.write("                <lu>\n");
      out.write("                    <li class=\"elementoMenu\"><a><h5 id=\"seleccionado\">Crear</h5></a></li>\n");
      out.write("                  <li class=\"elementoMenu\"><a href=\"eliminarVenta.jsp\"><h5 id=\"titulosMenu\">Eliminar</h5></a></li>\n");
      out.write("                  <li class=\"elementoMenu\"><a href=\"modificarVenta.jsp\"><h5 id=\"titulosMenu\">Modificar</h5></a></li>\n");
      out.write("                  <li class=\"elementoMenu\"><a href=\"mostrarVenta.jsp\"><h5 id=\"titulosMenu\">Mostrar</h5></a></li>\n");
      out.write("                </lu>  \n");
      out.write("                </div>\n");
      out.write("            <div class=\"tablaDatos\">\n");
      out.write("                <form class=\"cargar\" action=\"SvVenta\"  method=\"post\" action=\"SvSeleccionarCliente\" method=\"get\" action=\"SvEliminarClienteSeleccionado\" >\n");
      out.write("                  ");
HttpSession misession=request.getSession();
      out.write("\n");
      out.write("                  ");
String numero=(String)misession.getAttribute("numero");
                  String fecha=(String)misession.getAttribute("fecha");
                  
      out.write("  \n");
      out.write("                  <label for=\"buscar\" id=\"label\" name=numero\"\">Número</label><br> \n");
      out.write("                  <input type=\"text\" placeholder=\"Ingrese número de venta\" id=\"datos\" label=\"\" name=\"numero\" value=\"");
      out.print(numero);
      out.write("\"><br>\n");
      out.write("                  <label for=\"buscar\" id=\"label\" name=\"fecha\">Fecha</label><br> \n");
      out.write("                  <input type=\"text\" placeholder=\"Ingrese fecha\" id=\"datos\" label=\"\" name=\"fecha\" value=\"");
      out.print(fecha);
      out.write("\"><br>\n");
      out.write("                   </form>\n");
      out.write("                  <label for=\"buscar\" id=\"label\">Cliente</label><br> \n");
      out.write("                \n");
      out.write("                  <button type=\"submit\" class=\"btn btn-success\" ><a  href=\"verCliente.jsp\">Agregar</a></button>\n");
      out.write("                  \n");
      out.write("                  <label for=\"buscar\" id=\"label\">Cliente agregado</label><br>\n");
      out.write("                  ");

                  Cliente cliente=(Cliente)misession.getAttribute("clienteVenta");
                  if(cliente!=null){
                  int id=cliente.getIdCliente();
                  String nombre=cliente.getNombre();
                  String apellido=cliente.getApellido();
                  String direccion=cliente.getDireccion();
                  String dni=cliente.getDni();
                  String fechaCliente=cliente.getFecha_nac();
                  String nacionalidad=cliente.getNacionalidad();
                  String celular=cliente.getCelular();
                  String email=cliente.getEmail();
                  
      out.write("\n");
      out.write("                  <table>\n");
      out.write("                    <thead>\n");
      out.write("                        <tr class=\"row100 head \">\n");
      out.write("                            <th class=\"cell100 column1\">Nombre</th>\n");
      out.write("                            <th class=\"cell100 column2\">Apellido</th>\n");
      out.write("                            <th class=\"cell100 column3\">Dirección</th>\n");
      out.write("                            <th class=\"cell100 column4\">DNI</th>\n");
      out.write("                            <th class=\"cell100 column5\">Fecha de nacimiento</th>\n");
      out.write("                            <th class=\"cell100 column6\">Nacionalidad</th>\n");
      out.write("                            <th class=\"cell100 column7\">Celular</th>\n");
      out.write("                            <th class=\"cell100 column8\">Email</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                            <tr class=\"row100 body\">\n");
      out.write("                            <td class=\"cell100 column1\">");
      out.print(nombre);
      out.write("</td>\n");
      out.write("                            <td class=\"cell100 column2\">");
      out.print(apellido);
      out.write("</td>                           \n");
      out.write("                            <td class=\"cell100 column3\">");
      out.print(direccion);
      out.write("</td>                         \n");
      out.write("                            <td class=\"cell100 column4\">");
      out.print(dni);
      out.write("</td>      \n");
      out.write("                            <td class=\"cell100 column5\">");
      out.print(fechaCliente);
      out.write("\n");
      out.write("                            <td class=\"cell100 column6\">");
      out.print(nacionalidad);
      out.write("</td>\n");
      out.write("                            <td class=\"cell100 column7\">");
      out.print(celular);
      out.write("</td>                  \n");
      out.write("                            <td class=\"cell100 column8\">");
      out.print(email);
      out.write(" </td>\n");
      out.write("                            <td class=\"cell100 column1\">\n");
      out.write("                                <form class=\"modificar\" name=\"eliminar\"  action=\"SvEliminarClienteSeleccionado\" method=\"POST\" style=\"display:inline\">\n");
      out.write("                                    <input type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\">\n");
      out.write("                                    <button type=\"submit\" style=\"display:inline\" class=\"btn btn-success\">Eliminar</button>\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                            </tr>\n");
      out.write("                            </tbody>         \n");
      out.write("                </table>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                         \n");
      out.write("                  <label for=\"buscar\" id=\"label\">Producto</label><br> \n");
      out.write("                  <select name=\"\" class=\"seleccion\" id=\"seleccionProducto\" onclick=\"seleccion()\">\n");
      out.write("                      <option value=\"servicio\">Servicio</option></div>\n");
      out.write("                      <option value=\"paquete\">Paquete</option></div>\n");
      out.write("                    </select>\n");
      out.write("                  <button  type=\"button\" class=\"btn btn-success\"  id=\"linkBoton\" onclick=\"ir()\">Agregar</button>\n");
      out.write("                  <label for=\"buscar\" id=\"label\">Producto agregado</label><br> \n");
      out.write("                  ");

                  Servicio servicio=(Servicio)misession.getAttribute("servicio");
                  if(servicio!=null){
                  String codigoS=servicio.getCodigo_servicio();
                  String nombre=servicio.getNombre();
                  String descripcion=servicio.getDescripcion_breve();
                  String direccion=servicio.getDestino_servicio();
                  String fechaS=servicio.getFecha_servicio();
                  Double costoS=servicio.getCosto_servicio();
                  
      out.write("\n");
      out.write("                  <table>\n");
      out.write("                    <thead>\n");
      out.write("                        <tr class=\"row100 head \">\n");
      out.write("                            <th class=\"cell100 column1\">Nombre</th>\n");
      out.write("                            <th class=\"cell100 column2\">Descripcion</th>\n");
      out.write("                            <th class=\"cell100 column3\">Destino</th>\n");
      out.write("                            <th class=\"cell100 column4\">Fecha</th>\n");
      out.write("                            <th class=\"cell100 column5\">Costo</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                            <tr class=\"row100 body\">\n");
      out.write("                            <td class=\"cell100 column1\">");
      out.print(nombre);
      out.write("</td>\n");
      out.write("                            <td class=\"cell100 column2\">");
      out.print(descripcion);
      out.write("</td>                           \n");
      out.write("                            <td class=\"cell100 column3\">");
      out.print(direccion);
      out.write("</td>                         \n");
      out.write("                            <td class=\"cell100 column4\">");
      out.print(fechaS);
      out.write("</td>      \n");
      out.write("                            <td class=\"cell100 column5\">");
      out.print(costoS);
      out.write("\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            </tbody>         \n");
      out.write("                </table>\n");
      out.write("                  <button type=\"button\" class=\"btn btn-success\"><a id=\"botonIngresar\" >Eliminar</a></button>\n");
      out.write("                  <label for=\"buscar\" id=\"label\">Medio de pago</label><br> \n");
      out.write("                  <select name=\"\" class=\"seleccion\" name=\"pago\">\n");
      out.write("                    <option value=\"E\">Efectivo</option>\n");
      out.write("                    <option value=\"D\">Débito</option>\n");
      out.write("                    <option value=\"C\">Crédito</option>\n");
      out.write("                  </select>\n");
      out.write("                  <label for=\"nombre\" id=\"label\">Empleado</label><br> \n");
      out.write("                  <input type=\"text\" placeholder=\"Datos del empleado \" id=\"datos\" label=\"empleado\" name=\"empleado\"><br>\n");
      out.write("                  <button type=\"button\" class=\"btn btn-success\">Confirmar</button>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("                  </section>\n");
      out.write("                            <script src=\"./Js/seleccionarPagina.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/aos@2.3.1/dist/aos.js\"></script>\n");
      out.write("<script>\n");
      out.write("  AOS.init();\n");
      out.write("</script>\n");
      out.write("\n");
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
