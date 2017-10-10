<%-- 
    Document   : register
    Created on : Oct 10, 2017, 9:58:00 AM
    Author     : 643507
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <h1>Registration</h1>
        <form action="ShoppingList?action=register" method="POST">
         Username: <input type="text" name="username" >
          <input type="submit"  value ="register">
              
        </form>
        
    </body>
</html>
