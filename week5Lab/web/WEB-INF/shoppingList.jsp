<%-- 
    Document   : shoppingList
    Created on : Oct 10, 2017, 9:58:12 AM
    Author     : 643507
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        
        Hello ${username}, <a href="ShoppingList?action=logout">Log Out</a>
        
        <h2>List</h2>
        <br>
        <form action="ShoppingList?action=add" method="POST">
            Add Item: <input type="text" name="item" value="${addItem}" >
            <input type="submit" value = "add">
            <br>
    </form>
           
    <c:if test ="${fn:length(item) gt 0}" >
         <form action ="ShoppingList?action=delete" method="POST">
    <c:forEach var ="l" items="${item}">
        <input type="radio" name="list" value="${l}"/> ${l}<br>
    </c:forEach>  
        <br>
        <input type="submit" value="delete"/>
        
    </c:if>
            </form>
                 
                  
      
    </body>
</html>
