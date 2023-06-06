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
                    Actualizar Precio
                </h3>

            </div>
            
            <div
                style="width: 400px; height: 400px; background-color: #f2f2f2; border: 1px solid #000000; border-radius: 10px; padding: 10px;">
                <form action="Controlador" method="POST" >


                    
                    ID:
                    <input type="text" name="txtid" value="${producto.getId()}">
                    <br/>
                    NOMBRE:
                    <input type="text" name="txtnombre" value="${producto.getNombre()}">
                    <br/>
                    PRECIO:
                    <input type="text" name="txtprecio" value="${producto.getPrecio()}">
                    <br/>
                    TALLA:
                    <input type="text" name="txttalla" value="${producto.getTalla()}">
                    <br/>
                    ESTILO:
                    <input type="text" name="txtestilo" value="${producto.getEstilo()}">
                    <br/>
                    TIENDA:
                    <input type="text" name="txttienda" value="${producto.getTienda()}">
                    <br/>
                    CANTIDAD DISPONIBLE:
                    <input type="text" name="txtcantidad" value="${producto.getCantidad()}">
                    <br/>
                    PEDIDO:
                    <input type="text" name="txtpedido" value="${producto.getPedido()}">
                    <br/>
                    PROVEEDOR:
                    <input type="text" name="txtproveedor" value="${producto.getProveedor()}">
                    <br/>
                     
                    <input type="submit" name="accion" value="ActualizarPrecioBtn">

                </form>
            </div>
        </center>
    </body>
</html>
