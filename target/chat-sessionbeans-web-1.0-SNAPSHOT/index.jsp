<%-- 
    Document   : index
    Created on : Feb 8, 2016, 11:17:43 PM
    Author     : Anderson Souza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salas de Char</title>
    </head>
    <body>
        <form action="chat" method="post">
            <label>Nome da sala</label>
            <input type="text" name="sala">
            <input type="submit" value="Criar Salar/Excluir Sala">
        </form>
        
        <c:forEach items="${sessionScope.salas}" var="sala">
            <p>${sala}</p>
        </c:forEach>
        
    </body>
</html>
