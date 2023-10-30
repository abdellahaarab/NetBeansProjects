<%-- 
    Document   : pagepoo
    Created on : Oct 30, 2023, 9:54:58 AM
    Author     : Administrator
--%>

<%@page import="clases.Etudiant"%>
<%@page import="javax.faces.event.SystemEvent"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Page Poo</h1>
        <% 
            int i=0;
            for(i=0; i<10;i++){
                out.print("<p>Bounjour :!</p>");
            }
            
            Etudiant e1 = new Etudiant();
            
            e1.setName("Simo");
            e1.setPoids(22);

            
            out.print(e1.toString());
            
        %>
    </body>
</html>
