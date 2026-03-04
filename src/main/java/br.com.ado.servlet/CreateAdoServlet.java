package br.com.ado.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.rmi.server.ServerCloneException;

    @WebServlet("/create-ado")
    public  class  CreateAdoServlet extends HttpServlet {
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String adoItem = request.getParameter("ado-item");
            System.out.println(adoItem);

            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");

            String json = "{\"item\":\"" + adoItem + "\"}";
            response.getWriter().write(json);


        }
    }