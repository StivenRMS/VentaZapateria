<%-- 
    Document   : add
    Created on : 13/03/2023, 11:16:19 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <h3>
                    Agregar Pedido
                </h3>

            </div>
            
            <div
                style="width: 400px; height: 400px; background-color: #f2f2f2; border: 1px solid #000000; border-radius: 10px; padding: 10px;">
                <form action="Controlador" method="POST" >


                    
                    Cantidad Pedido:
                    <input type="text" name="txtpedidoP">
                    <br/>
                    Tienda:
                    <input type="text" name="txttiendaP">
                    <br/>
                    Taller:
                    <input type="text" name="txttallerP">
                    <br/>
                    Estilo:
                    <input type="text" name="txtEstiloP">
                    <br/>
                    <br/>
                   
                     
                    <input type="submit" name="accion" value="GuardarPedido">

                </form>
            </div>
        </center>
    </body>
</html>
