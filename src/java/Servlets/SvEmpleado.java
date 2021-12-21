/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juan
 */
@WebServlet(name = "SvEmpleado", urlPatterns = {"/SvEmpleado"})
public class SvEmpleado extends HttpServlet {
Controladora control=new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String nombre=request.getParameter("nombre");
         String apellido=request.getParameter("apellido");
         String direccion=request.getParameter("direccion");
         String dni=request.getParameter("dni");
         String fecha=request.getParameter("fecha");
         String nacionalidad=request.getParameter("nacionalidad");
         String celular=request.getParameter("celular");
         String email=request.getParameter("email");
         String cargo=request.getParameter("cargo");
         double sueldo=Double.parseDouble(request.getParameter("sueldo"));
         String contra=request.getParameter("contra");
         String usua=request.getParameter("usuario");

        control.crearEmpleado(nombre,apellido,direccion,dni,fecha,nacionalidad,celular,email,cargo,sueldo,usua,contra);  
        response.sendRedirect("index.jsp");  
        
       
            
         
         
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
