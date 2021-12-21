package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"esp\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Remeras personalizadas</title>\n");
      out.write("  <meta name=\"description\" content=\"Las remeras personalizadas de insiders son estampadas con el diseño que vos quieras,además son 100% algodón. \">\n");
      out.write("  <meta name=\"keywords\" content=\"remeras,gorras,tazas,personalizadas,algodón,rio negro\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"./Node/css/style.css\">\n");
      out.write("  <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("  <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Lobster&display=swap\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"https: //fonts.googleapis.com/css2? family = Russo + One & display = swap \" rel=\" stylesheet \">\n");
      out.write("  <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("  <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Comfortaa:wght@300;500&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Lobster&display=swap\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css\" />\n");
      out.write("  <link href=\"https://unpkg.com/aos@2.3.1/dist/aos.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("    integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <section class=\"inicio\" data-aos=\"zoom-in-down\">\n");
      out.write("    <img src=\"./images/logo.png\"\n");
      out.write("      alt=\"logo del emprendimiento\" id=\"logoemprendimiento\"></img>\n");
      out.write("    \n");
      out.write("      <form id=\"ingreso\" action=\"SvUsuario\" method=\"post\">\n");
      out.write("        <div class=\"mb-3\">\n");
      out.write("          <label for=\"exampleInputEmail1\" class=\"form-label\">Usuario</label>\n");
      out.write("          <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" name=\"user\" >\n");
      out.write("  \n");
      out.write("        </div>\n");
      out.write("        <div class=\"mb-3\">\n");
      out.write("          <label for=\"exampleInputPassword1\" class=\"form-label\">Contraseña</label>\n");
      out.write("          <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" name=\"pass\" >\n");
      out.write("        </div>\n");
      out.write("         <button type=\"submit\" class=\"btn btn-primary\" ><a id=\"botonIngresar\" href=\"cargarVenta.jsp\">Ingresar</a></button>\n");
      out.write("         <h1 class=\"inicio__titulos__titulo1\"><a id=\"registrar\" href=\"crearUsuario.jsp\">Registrar usuario nuevo</a></h1>\n");
      out.write("      </form>\n");
      out.write("   \n");
      out.write(" </section>\n");
      out.write("<script src=\"https://unpkg.com/aos@2.3.1/dist/aos.js\"></script>\n");
      out.write("<script>\n");
      out.write("  AOS.init();\n");
      out.write("</script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("  integrity=\"sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
