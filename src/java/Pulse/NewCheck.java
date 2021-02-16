/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pulse;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ruchi
 */
public class NewCheck extends HttpServlet {

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
            String sbp=request.getParameter("sbp");  //systolic 
            String dbp;
            dbp = request.getParameter("dbp");       //diastolic
           
            CheckPulse pulse=new CheckPulse();
            pulse.setSbp(sbp);
            pulse.setDbp(dbp);
            
            request.setAttribute("pulse",pulse);
            boolean status = false;
            
            if(status)
            {  
            RequestDispatcher rd=request.getRequestDispatcher("Alert.jsp");  
            rd.forward(request, response); 
            }  
        }
        catch(Exception e)
                    {
                        out.println(e);
                    }
    }

    
