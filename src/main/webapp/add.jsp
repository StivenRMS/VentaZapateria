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
                    Agregar Producto
                </h3>

            </div>
            
            <div
                style="width: 400px; height: 400px; background-color: #f2f2f2; border: 1px solid #000000; border-radius: 10px; padding: 10px;">
                <form action="Controlador" method="POST" >


                    
                    NOMBRE:
                    <input type="text" name="txtnombre">
                    <br/>
                    PRECIO:
                    <input type="text" name="txtprecio">
                    <br/>
                    TALLA:
                    <input type="text" name="txttalla">
                    <br/>
                    ESTILO:
                    <input type="text" name="txtestilo">
                    <br/>
                    TIENDA:
                    <input type="text" name="txttienda">
                    <br/>
                    CANTIDAD DISPONIBLE:
                    <input type="text" name="txtcantidad">
                    <br/>
                    PEDIDO:
                    <input type="text" name="txtpedido">
                    <br/>
                    PROVEEDOR:
                    <input type="text" name="txtproveedor">
                    <br/>
                     
                    <input type="submit" name="accion" value="Guardar">

                </form>
            </div>
        </center>
    </body>
</html>
