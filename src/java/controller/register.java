/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
import dao.*;

/**
 *
 * @author Admin
 */
public class register extends HttpServlet {
    
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
            out.println("<title>Servlet register</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet register at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
         response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(name);
       
        CustomerDAO c = new CustomerDAO();
        
        String mail = "";
        String phone = "";
        String pw = "";
        
        if(name.isEmpty() || email.isEmpty() || password.isEmpty() || address.isEmpty() || contact.isEmpty()){
            name = " Please input name";
            request.setAttribute("NAME", name);
            mail = " Please input email";
            request.setAttribute("MAIL", mail);
            phone = " Please input phone number";
            request.setAttribute("PHONE", phone);
            pw = " Pease input password";
            request.setAttribute("PW", pw);
            address = "Please input address";
            request.setAttribute("AD", address);
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
        if(c.checkEmail(email)){
            mail = " Email existed";
            request.setAttribute("MAIL", mail);
        }
        if(c.checkPhone(contact)){
            phone = " Phone existed";
            request.setAttribute("PHONE", phone);
        }
        if(contact.length() != 10){
            phone = " Phone number must be 10 digits";
            request.setAttribute("PHONE", phone);
        }
        if (!contact.matches("[0-9]+") && contact.length() > 2) {
            phone = " Phone must be digit only";
            request.setAttribute("PHONE", phone);
        }
        if(password.length() < 7){
            pw = " Password must greater 6 characters";
            request.setAttribute("PW", pw);
        }
        if(!mail.isEmpty() || !phone.isEmpty() || !pw.isEmpty()){
            request.setAttribute("name", name);
            request.setAttribute("email", email);
            request.setAttribute("address", address);
            request.setAttribute("contact", contact);
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
        else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
            Customer cus = new Customer(c.sizeOfCustomer()+1,name,email,password,contact,address,address);
            c.insertUser(cus);
        }
        
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