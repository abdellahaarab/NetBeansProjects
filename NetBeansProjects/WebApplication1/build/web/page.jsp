<%-- 
    Document   : page
    Created on : Oct 27, 2023, 9:00:22 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            int i=0;
            for(i=0; i<10; i++){
                out.print("<h1> Bonjour !! </h1>");
            }
        
        %>
        <h1>Hello World!</h1>
    </body>
</html>
