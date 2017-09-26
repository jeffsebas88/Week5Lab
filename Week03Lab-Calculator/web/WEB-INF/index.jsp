<%-- 
    Document   : index
    Created on : Sep 26, 2017, 9:24:45 AM
    Author     : 643507
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
    </head>
        <body>
        <h1>Simple JSP Calculator</h1>
        
        <form action="CalculatorServlet" method="POST">
            First: <input type="text" name="first" value= ${firstNumber}><br/>
            Second: <input type="text" name="second" value=${secondNumber}><br/>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-"> 
            <input type="submit" name="operation" value="*"> 
            <input type="submit" name="operation" value="%">
        </form>
        <br/>
Result: ${result}
        </body>
</html>
