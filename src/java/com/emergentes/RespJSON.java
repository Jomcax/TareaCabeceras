package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespJSON", urlPatterns = {"/RespJSON"})
public class RespJSON extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        response.setContentType("application/json");
        response.setHeader("Content-Disposition","attachment;filename=empleados.json");
        PrintWriter out = response.getWriter();
        try{
            out.println("{'empleados':[");
            out.println("{'nombre':'bruno','apellidos':'diaz'},");
            out.println("{'nombre':'juan jose','apellidos':'paredes'},");            
            out.println("{'nombre':'dolores','apellidos':'fuentes'}");
            out.println("]}");
        }finally{
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
