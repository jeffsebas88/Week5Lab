/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 643507
 */
public class ShoppingListServlet extends HttpServlet {

   
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            HttpSession sess = request.getSession();
            String username = (String)sess.getAttribute("username");
            if(username == null){
         getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").
                    forward(request, response);
                    return;
            }
            String action = request.getParameter("action");
             if(action != null && action.equals("logout")){
             sess.removeAttribute("username");
             response.sendRedirect("/ShoppingList");
             return;
             }
           
            sess.setAttribute("username", username);
       getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             
             HttpSession sess = request.getSession();
             String action = request.getParameter("action");
             if(action != null && action.equals("register")){
             String username = request.getParameter("username"); 
             ArrayList<String> items = new ArrayList<String>();
             sess.setAttribute("username", username);
             sess.setAttribute("item", items);
             response.sendRedirect("/ShoppingList");
             }
             
             if(action != null && action.equals("add")){
             String item = request.getParameter("item");
             ArrayList<String> items = (ArrayList<String>) sess.getAttribute("item");
             items.add(item);
             sess.setAttribute("item", items);
             response.sendRedirect("/ShoppingList");  
             }
             if(action != null && action.equals("delete")){
             String item = request.getParameter("list");
             ArrayList<String> items = (ArrayList<String>) sess.getAttribute("item");
             for(Iterator<String> listies = items.iterator(); listies.hasNext();){
                   String list = listies.next();
               if(list.equals(item)){
                  listies.remove();
               }
           }
            sess.setAttribute("item", items);
             response.sendRedirect("/ShoppingList");  
             }
    
    }
    


   

}
