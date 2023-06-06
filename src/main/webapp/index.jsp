
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
    Document   : index
    Created on : 7/03/2023, 16:41:50
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <link rel="stylesheet" href="https://unpkg.com/@picocss/pico@1.*/css/pico.min.css">
    <body>
        <center>
            <div>
                <h3>Productos</h3>
                <form action="Controlador" method="POST">
                    <input type="submit" name="accion" value="Listar">
                    <input type="submit" name="accion" value="Nuevo">
                    <input type="submit" name="accion" value="Pedido">
                    
                </form>
            </div>
            <div>
                <table border="1">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Precio</th>
                            <th>Talla</th>
                            <th>Estilo</th>
                            <th>Tienda</th>
                            <th>Cantidad</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="dato" items="${datos}">
                        <tr>
                            <td>${dato.getId()}</td>
                            <td>${dato.getNombre()}</td>
                            <td>${dato.getPrecio()}</td>
                           <td>${dato.getTalla()}</td>
                           <td>${dato.getEstilo()}</td>
                           <td>${dato.getTienda()}</td>
                           <td>${dato.getCantidad()}</td>
                           
                           <td>
                            <form accion="Controlador" method="POST">
                                <input type="hidden" name="id" value="${dato.getId()}">
                                <input type="submit" name="accion" value="ActualizarPrecio">
                                <input type="submit" name="accion" value="Eliminar">
                            </form>
                           </td>
                                
                        </tr>
                    </c:forEach>
                    </tbody>
                    
                </table>
            </div>
        </center>
    </body>
</html>
