/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.ModificarPDF;

/**
 *
 * @author Maydas
 */
@WebServlet(name = "sv_encuesta", urlPatterns = {"/sv_encuesta"})
public class sv_encuesta extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet sv_encuesta</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet sv_encuesta at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        ModificarPDF myInstance = ( ModificarPDF) request.getAttribute("instancia");
        String nombres = (String) request.getAttribute("nombres");
        String ruta = (String) request.getAttribute("ruta");
        
        System.out.println("---------------------------");
        System.out.println(nombres);
        System.out.println(ruta);
        System.out.println("------------------------------");
        request.getRequestDispatcher("Encuesta.jsp");
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
