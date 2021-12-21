/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Cliente;
import Logica.Controladora;
import Logica.MedioDePago;
import Logica.Servicio;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author juan
 */
@WebServlet(name = "SvVenta", urlPatterns = {"/SvVenta"})
public class SvVentaServicio extends HttpServlet {

Controladora control=new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvVenta</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvVenta at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession misession=request.getSession();
         String fecha=request.getParameter("fecha");
         String pago=request.getParameter("pago");
         misession.setAttribute("fecha", fecha);
         MedioDePago mediopago=new MedioDePago(pago);
        Cliente cliente=(Cliente)misession.getAttribute("clienteVenta");
        Servicio servicio=(Servicio)misession.getAttribute("servicioVenta");
        control.crearVenta(fecha,mediopago, cliente, servicio);
       response.sendRedirect("modificarCliente.jsp");
       request.getSession().removeAttribute("fecha");
       request.getSession().removeAttribute("pago");
       request.getSession().removeAttribute("clienteVenta");
       request.getSession().removeAttribute("servicioVenta");
        response.sendRedirect("verVenta.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
