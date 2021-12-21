/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Cliente;
import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvCliente", urlPatterns = {"/SvCliente"})
public class SvCliente extends HttpServlet {

Controladora control=new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvCliente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvCliente at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
         String nombre=request.getParameter("nombre");
         String apellido=request.getParameter("apellido");
         String direccion=request.getParameter("direccion");
         String dni=request.getParameter("dni");
         String fecha=request.getParameter("fecha");
         String nacionalidad=request.getParameter("nacionalidad");
         String celular=request.getParameter("celular");
         String email=request.getParameter("email");
         
         Cliente cliente=control.buscarCliente(id);
         cliente.setNombre(nombre);
         cliente.setApellido(apellido);
         cliente.setDireccion(direccion);
         cliente.setDni(dni);
         cliente.setFecha_nac(fecha);
         cliente.setNacionalidad(nacionalidad);
         cliente.setCelular(celular);
         cliente.setEmail(email);
         control.modificarCliente(cliente);
         request.getSession().setAttribute("listaClientes", control.traerClientes());
         response.sendRedirect("verCliente.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {;
         String nombre=request.getParameter("nombre");
         String apellido=request.getParameter("apellido");
         String direccion=request.getParameter("direccion");
         String dni=request.getParameter("dni");
         String fecha=request.getParameter("fecha");
         String nacionalidad=request.getParameter("nacionalidad");
         String celular=request.getParameter("celular");
         String email=request.getParameter("email");
         control.crearCliente(nombre,apellido,direccion,dni,fecha,nacionalidad,celular,email);
         response.sendRedirect("verCliente.jsp");
         
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
