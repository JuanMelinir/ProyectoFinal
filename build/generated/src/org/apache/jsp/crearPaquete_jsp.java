package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Logica.Servicio;
import Logica.Controladora;
import java.util.List;
import Logica.PaqueteTuristico;

public final class crearPaquete_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("              <a class=\"nav-link \" id=\"visitado\" aria-current=\"page\" href=\"crearPaquete.jsp\">Paquetes</a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active\"  href=\"cargarVenta.jsp\">Ventas</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active\" href=\"verCliente.jsp\">Clientes</a>\n");
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
      out.write("                  \n");
      out.write("                <div class=\"menu\">\n");
      out.write("                <lu>\n");
      out.write("                    <li class=\"elementoMenu\"><a href=\"seleccionarPaquete.jsp\"><h5  id=\"titulosMenu\">Ver</h5></a></li>\n");
      out.write("                  <li class=\"elementoMenu\"><a href=\"\"><h5 id=\"seleccionado\">Crear</h5></a></li>\n");
      out.write("                </lu>  \n");
      out.write("                </div>\n");
      out.write("            <div class=\"cargar\">\n");
      out.write("                  <label for=\"buscar\" id=\"label\">Agregar servicio</label><br>\n");
      out.write("                   <button type=\"button\" class=\"btn btn-success\"><a id=\"botonIngresar\" href=\"seleccionarServicioPaqueteHotel.jsp\">Agregar</a></button>\n");
      out.write("                  <label for=\"buscar\" id=\"label\">Servicios agregados</label><br>\n");
      out.write("                  <table>\n");
      out.write("                    <thead>\n");
      out.write("                        <tr class=\"row100 head \">\n");
      out.write("                            <th class=\"cell100 column1\">Nombre</th>\n");
      out.write("                            <th class=\"cell100 column2\">Descripción</th>\n");
      out.write("                            <th class=\"cell100 column3\">Destino</th>\n");
      out.write("                            <th class=\"cell100 column4\">Fecha</th>\n");
      out.write("                            <th class=\"cell100 column5\">Costo</th>>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                        PaqueteTuristico paqueteC=new PaqueteTuristico();
                        HttpSession misession=request.getSession();
                        paqueteC=(PaqueteTuristico)misession.getAttribute("paqueteC");
                        if(paqueteC!=null){
                        List<Servicio>serviciosPaq=paqueteC.getlistaServicios();    
                        Controladora control=new Controladora();
                        
                       if(serviciosPaq!=null){
                        for(Servicio s:serviciosPaq){
                            
      out.write("\n");
      out.write("                            <tr class=\"row100 body\">\n");
      out.write("                            ");

                            String id=s.getCodigo_servicio();
                            String nombre=s.getNombre();
                            String descripcion=s.getDescripcion_breve();
                            String destino=s.getDestino_servicio();
                            String fecha=s.getFecha_servicio();
                            Double costo=s.getCosto_servicio();
                            
      out.write(" \n");
      out.write("                            <td class=\"cell100 column1\">");
      out.print(nombre);
      out.write("</td>\n");
      out.write("                            <td class=\"cell100 column2\">");
      out.print(descripcion);
      out.write("</td>                           \n");
      out.write("                            <td class=\"cell100 column3\">");
      out.print(destino);
      out.write("</td>                         \n");
      out.write("                            <td class=\"cell100 column4\">");
      out.print(fecha);
      out.write("</td>      \n");
      out.write("                            <td class=\"cell100 column5\">");
      out.print(fecha);
      out.write("\n");
      out.write("                            <td class=\"cell100 column6\">");
      out.print(costo);
      out.write("</td>\n");
      out.write("                            <td class=\"cell100 column1\">\n");
      out.write("                                <form class=\"modificar\" name=\"eliminar\"  action=\"SvEliminarServicioPaquete\" method=\"POST\" style=\"display:inline\">\n");
      out.write("                                    <input type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\">\n");
      out.write("                                    <button type=\"submit\" style=\"display:inline\" class=\"btn btn-success\">Eliminar</button>\n");
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
      out.write("\n");
      out.write("                  <label for=\"buscar\" id=\"label\">Costo</label><br> \n");
      out.write("                  \n");
      out.write("                 \n");
      out.write("               \n");
      out.write("                  ");

                      
                      double montoTotal=paqueteC.getCosto_paquete();
                  
      out.write("\n");
      out.write("                  <input type=\"text\" placeholder=\"monto acumulado \" id=\"datos\" label=\"\" value=\"");
      out.print(montoTotal);
      out.write("\"><br>\n");
      out.write("                 ");

                 if(paqueteC.listServicios.size()>1){
                 
      out.write("\n");
      out.write("                      <form class=\"modificar\" name=\"eliminar\"  action=\"SvPaquete\" method=\"POST\" style=\"display:inline\">\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-success\"><a id=\"botonIngresar\">Crear</a></button> \n");
      out.write("                      </form>\n");
      out.write("                 ");
}
      out.write("   \n");
      out.write("                 \n");
      out.write("                  ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("              \n");
      out.write("                  </section>\n");
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
      out.write("\n");
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
