/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.Calculator;

/**
 *
 * @author 643507
 */
public class CalculatorServlet extends HttpServlet {

   
   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

    
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstString = request.getParameter("first");
        String secondString = request.getParameter("second");
        String operations = request.getParameter("operation");
    
    if      (firstString == null || firstString.isEmpty() || secondString == null ||
            secondString.isEmpty() || operations == null || operations.isEmpty()){
            request.setAttribute("result", "Please enter both values.");
            request.setAttribute("firstNumber", firstString);
            request.setAttribute("secondNumber", secondString);
            getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
            return;
        }
        
        if(secondString.equals("0")  && operations.equals("%")){
            request.setAttribute("result", "Please don't divide by zero.");
            request.setAttribute("firstNumber", firstString);
            request.setAttribute("secondNumber", secondString);
            getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
            return;
        }
        
        double result = Calculator.operate(firstString, secondString, operations);
            request.setAttribute("result", result);
  getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);


    }
    }

   

