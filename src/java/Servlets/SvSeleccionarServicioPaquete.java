/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Controladora;
import Logica.PaqueteTuristico;
import Logica.Servicio;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @asuthor w11
 */
@WebServlet(name = "SvSeleccionarServicioPaquete", urlPatterns = {"/SvSeleccionarServicioPaquete"})
public class SvSeleccionarServicioPaquete extends HttpServlet {
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
            out.println("<title>Servlet seleccionarServicioPaquete</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet seleccionarServicioPaquete at " + request.getContextPath() + "</h1>");
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
        String id=request.getParameter("id");
        Servicio servicio=control.buscarServicio(id);
        PaqueteTuristico paquete=(PaqueteTuristico)misession.getAttribute("paqueteC");
        if(paquete==null){
        paquete=new PaqueteTuristico();
        paquete.setAgregarServicio(servicio);
        }else{
        paquete.setAgregarServicio(servicio);
        }
        misession.setAttribute("paqueteC",paquete);
        response.sendRedirect("crearPaquete.jsp");}
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
