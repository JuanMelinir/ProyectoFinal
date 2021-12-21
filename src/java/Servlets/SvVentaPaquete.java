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
 * @author w11
 */
@WebServlet(name = "SvVentaPaquete", urlPatterns = {"/SvVentaPaquete"})
public class SvVentaPaquete extends HttpServlet {
Controladora control=new Controladora();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvVentaPaquete</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvVentaPaquete at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession misession=request.getSession();
        String fecha=request.getParameter("fecha");
        String pago=request.getParameter("pago");
        misession.setAttribute("fecha", fecha);
        MedioDePago mediopago=new MedioDePago(pago);
        Cliente cliente=(Cliente)misession.getAttribute("clienteVenta");
        Servicio servicio=(Servicio)misession.getAttribute("paqueteVenta");
        control.crearVenta(fecha,mediopago, cliente, servicio);
        response.sendRedirect("modificarCliente.jsp");
        request.getSession().removeAttribute("fecha");
        request.getSession().removeAttribute("pago");
        request.getSession().removeAttribute("clienteVenta");
        request.getSession().removeAttribute("paqueteVenta");
        response.sendRedirect("verVenta.jsp");
       response.sendRedirect("modificarCliente.jsp");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
