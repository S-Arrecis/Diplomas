/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ModificarPDF;

/**
 *
 * @author Maydas
 */
public class sv_users extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet sv_users</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet sv_users at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        String nombre = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String fecha_nacimiento = request.getParameter("fecha_nacimiento");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");
        
        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(fecha_nacimiento);
        System.out.println(telefono);
        System.out.println(email);
       
        String resourcesPath = "/";
        String absolutePath = getServletContext().getRealPath(resourcesPath);
        System.out.println(absolutePath);
        HttpSession session = request.getSession(true);
        session.setMaxInactiveInterval(30 * 60);
       
        
        //request.setAttribute("ruta", absolutePath);
         ModificarPDF pdf = new ModificarPDF();
        pdf.modificarPDF(nombre+" "+apellidos,absolutePath,email);
        //session.setAttribute("instancia", pdf);
        System.out.println(absolutePath);
        System.out.println(absolutePath+"Diploma_"+nombre+" "+apellidos+".pdf");
        //String miString = "Hola desde el servlet";
        request.setAttribute("mensaje","Diploma_"+email+".pdf");
        //System.out.println("Mensaje en el servlet: " + absolutePath);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Encuesta.jsp");
        dispatcher.forward(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
