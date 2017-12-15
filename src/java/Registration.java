/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author Bharath kumar
 */
@WebServlet(urlPatterns = {"/Registration"})
public class Registration extends HttpServlet {

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
            
             try{ 
                 String q="insert into registrationpagenew values (?,?,?,?,?);";
            Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","12345");
		
                String Fname=request.getParameter("firstname12");
                String Lname=request.getParameter("lastname12");
                String Email=request.getParameter("email123");
                String Pass=request.getParameter("password12");
               // String RePass=request.getParameter("repassword12");
                String Phone=request.getParameter("phonenumber12");
                PreparedStatement st=con.prepareStatement(q);
                
                st.setString(1,Fname);
                 st.setString(2,Lname);
                  st.setString(3,Email);
                   st.setString(4,Pass);
                    //st.setString(5,RePass);
                     st.setString(5,Phone);
                     int a=st.executeUpdate();
                     if(a==1)
                     {
                         out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>registration</title>");            
            out.println(" <style>\n" +
"            body{background-color: burlywood}\n" +
"            a{color: black}\n" +
"        </style> </head>");
            out.println("<body>");
            out.println("<form action=LoginPage.html >"
                    + "<input type=submit value=login >"
                    + "</form>");
            out.println("</body>");
            out.println("</html>");
                     }
                    
               
                
		
		
           }
           catch(Exception e){
           out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registration</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>caught  "  +e+ "</h1>");
            out.println("</body>");
            out.println("</html>");}
            
            
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
