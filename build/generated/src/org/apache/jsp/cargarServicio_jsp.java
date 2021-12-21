package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Logica.Controladora;

public final class cargarServicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <header>\n");
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
      out.write("              <a class=\"nav-link \" aria-current=\"page\" href=\"verEmpleados.jsp\">Empleados</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link \" id=\"visitado\" aria-current=\"page\" href=\"seleccionarServicio.jsp\">Servicios</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link \" aria-current=\"page\" href=\"seleccionarPaquete.jsp\">Paquetes</a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active\" href=\"cargarVenta.jsp\">Ventas</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active\" href=\"verCliente.jsp\">Clientes</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"\">Ganancias</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("  </header>\n");
      out.write("        <section class=\"cargarServicios\" data-aos=\"zoom-in-down\">\n");
      out.write("        <div class=\"menu\">\n");
      out.write("    <lu>\n");
      out.write("        <li class=\"elementoMenu\"><a href=\"seleccionarServicio.jsp\"><h5 id=\"titulosMenu\">Ver</h5></a></li>\n");
      out.write("        <li class=\"elementoMenu\"><a><h5 id=\"seleccionado\">Cargar</h5></a></li>\n");
      out.write("    </lu>  \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <form class=\"cargar\" action=\"SvCargarServicio\" method=\"post\">\n");
      out.write("        \n");
      out.write("            <label for=\"nombre\" id=\"label\">Nombre</label><br> \n");
      out.write("            <select name=\"nombre\" class=\"seleccion\" >\n");
      out.write("            <option value=\"Hotel\">Hotel</option></div>\n");
      out.write("            <option value=\"Alquiler\">Alquiler vehiculos</option></div>\n");
      out.write("            <option value=\"Pasaje avion\">Pasaje avión</option></div>\n");
      out.write("            <option value=\"Pasaje colectivo\">Pasaje colectivo</option></div>\n");
      out.write("            <option value=\"Pasaje tren\">Pasaje tren</option></div>\n");
      out.write("            <option value=\"Excursion\">Excursión</option></div>\n");
      out.write("            <option value=\"Evento\">Evento</option></div>\n");
      out.write("            </select>\n");
      out.write("            <label for=\"nombre\" id=\"label\">Descripción</label><br> \n");
      out.write("            <input type=\"text\" placeholder=\"ingrese descripción \" id=\"datos\" label=\"\" name=\"descripcion\"><br>\n");
      out.write("            <label for=\"nombre\" id=\"label\">Destino</label><br> \n");
      out.write("            <input type=\"text\" placeholder=\"ingrese destino \" id=\"datos\" label=\"\" name=\"destino\"><br>\n");
      out.write("            <label for=\"nombre\" id=\"label\">Fecha</label><br> \n");
      out.write("            <input type=\"text\" placeholder=\"ingrese fecha\" id=\"datos\" label=\"\" name=\"fecha\"><br>\n");
      out.write("            <label for=\"nombre\" id=\"label\">Costo</label><br> \n");
      out.write("            <input type=\"text\" placeholder=\"ingrese Costo \" id=\"datos\" label=\"\" name=\"costo\"><br>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success\">Cargar</button>\n");
      out.write("          </form>\n");
      out.write("          \n");
      out.write("    </section>\n");
      out.write("        <script src=\"https://unpkg.com/aos@2.3.1/dist/aos.js\"></script>\n");
      out.write("<script>\n");
      out.write("  AOS.init();\n");
      out.write("</script>\n");
      out.write("</script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("  integrity=\"sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj\" crossorigin=\"anonymous\"></script>\n");
      out.write("    \n");
      out.write("</body>\n");
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
