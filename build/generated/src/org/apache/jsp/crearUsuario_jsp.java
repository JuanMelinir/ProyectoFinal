package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Logica.Usuario;
import Logica.Controladora;

public final class crearUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");
 
            Controladora control=new Controladora();
            HttpSession misession=request.getSession();
            String usu=(String)misession.getAttribute("usuario");
       
         
      out.write("\n");
      out.write("<header>\n");
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
      out.write("              <a class=\"nav-link \"  aria-current=\"page\" href=\"seleccionarServicio.jsp\" >Servicios</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link \" aria-current=\"page\" href=\"crearPaquete.jsp\">Paquetes</a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active\" href=\"cargarVenta.jsp\">Ventas</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active\" id=\"visitado\" href=\"cargarCliente.jsp\">Clientes</a>\n");
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
      out.write("        <section class=\"cargarCliente\" data-aos=\"zoom-in-down\">\n");
      out.write("        <div class=\"menu\">\n");
      out.write("    <lu>\n");
      out.write("        <li class=\"elementoMenu\"><a href=\"verCliente.jsp\"><h5 id=\"titulosMenu\">Ver</h5></a></li>\n");
      out.write("        <li class=\"elementoMenu\"><a><h5 id=\"seleccionado\">Cargar</h5></a></li>\n");
      out.write("    </lu>  \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <form class=\"cargar\" action=\"SvEmpleado\" method=\"post\">\n");
      out.write("        <label for=\"nombre\" id=\"label\">Datos a ingresar</label><br> \n");
      out.write("            <label for=\"nombre\" id=\"label\">Nombre</label><br> \n");
      out.write("            <input type=\"text\" placeholder=\"ingrese nombre \" id=\"datos\" label=\"\" name=\"nombre\"><br>\n");
      out.write("            <label for=\"nombre\" id=\"label\">Apellido</label><br> \n");
      out.write("            <input type=\"text\" placeholder=\"ingrese apellido \" id=\"datos\" label=\"\" name=\"apellido\"><br>\n");
      out.write("            <label for=\"nombre\" id=\"label\">Dirección</label><br> \n");
      out.write("            <input type=\"text\" placeholder=\"ingrese dirección \" id=\"datos\" label=\"\" name=\"direccion\"><br>\n");
      out.write("            <label for=\"nombre\" id=\"label\">DNI</label><br> \n");
      out.write("            <input type=\"text\" placeholder=\"ingrese número de DNI \" id=\"datos\" label=\"\" name=\"dni\"><br>\n");
      out.write("            <label for=\"nombre\" id=\"label\">Fecha de nacimiento</label><br> \n");
      out.write("            <input type=\"text\" placeholder=\"ingrese fecha de nacimiento \" id=\"datos\" label=\"\" name=\"fecha\"><br>\n");
      out.write("            <label for=\"nombre\" id=\"label\">Nacionalidad</label><br> \n");
      out.write("            <input type=\"text\" placeholder=\"ingrese nacionalidad \" id=\"datos\" label=\"\" name=\"nacionalidad\"><br>\n");
      out.write("            <label for=\"nombre\" id=\"label\">Celular</label><br> \n");
      out.write("            <input type=\"text\" placeholder=\"ingrese número de celular \" id=\"datos\" label=\"\" name=\"celular\"><br>\n");
      out.write("            <label for=\"nombre\" id=\"label\">Email</label><br> \n");
      out.write("            <input type=\"text\" placeholder=\"ingrese correo electrónico\" id=\"datos\" label=\"\" name=\"email\"><br>\n");
      out.write("            <label for=\"nombre\" id=\"label\">Cargo</label><br> \n");
      out.write("            <input type=\"text\" placeholder=\"ingrese cargo\" id=\"datos\" label=\"\" name=\"cargo\"><br>\n");
      out.write("            <label for=\"nombre\" id=\"label\">Sueldo</label><br> \n");
      out.write("            <input type=\"text\" placeholder=\"ingrese sueldo\" id=\"datos\" label=\"\" name=\"sueldo\"><br>\n");
      out.write("            <label for=\"nombre\" id=\"label\">Usuario</label><br> \n");
      out.write("            <input type=\"text\" placeholder=\"ingrese usuario\" id=\"datos\" label=\"\" name=\"usuario\"><br>\n");
      out.write("            <label for=\"nombre\" id=\"label\">Contraseña</label><br> \n");
      out.write("            <input type=\"text\" placeholder=\"ingrese contraseña\" id=\"datos\" label=\"\" name=\"contra\"><br>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success\">Cargar</button>>\n");
      out.write("          </form>\n");
      out.write("          \n");
      out.write("    </div>\n");
      out.write("    </section>\n");
      out.write("        <script src=\"https://unpkg.com/aos@2.3.1/dist/aos.js\"></script>\n");
      out.write("<script>\n");
      out.write("  AOS.init();\n");
      out.write("</script>\n");
      out.write("</script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("  integrity=\"sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj\" crossorigin=\"anonymous\"></script>\n");
      out.write(" \n");
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
