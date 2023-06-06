/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.Pedido;
import Modelo.PedidoDAO;
import Modelo.Producto;
import Modelo.ProductosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
public class Controlador extends HttpServlet {

    ProductosDAO dao = new ProductosDAO();
    Producto p = new Producto();
    Pedido ped = new Pedido();
    PedidoDAO daoP = new PedidoDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        switch (accion) {
            case "Listar":

                List<Producto> datos = dao.listar();

                request.setAttribute("datos", datos);
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case "Nuevo":
                request.getRequestDispatcher("add.jsp").forward(request, response); //se llama al otro formulario

                break;
            case "Guardar":
                //se guarda el dato de la caja de texto del .jsp en la variable
                String nom = request.getParameter("txtnombre");
                String precio = request.getParameter("txtprecio");
                String talla = request.getParameter("txttalla");
                int estilo = Integer.parseInt(request.getParameter("txtestilo"));
                int tienda = Integer.parseInt(request.getParameter("txttienda"));
                int cantidad = Integer.parseInt(request.getParameter("txtcantidad"));
                int pedido = Integer.parseInt(request.getParameter("txtpedido"));
                int proveedor = Integer.parseInt(request.getParameter("txtproveedor"));

                //se agregan los valores al objeto producto
                p.setNombre(nom);
                p.setPrecio(Float.parseFloat(precio));
                p.setTalla(talla);
                p.setEstilo(estilo);
                p.setTienda(tienda);
                p.setCantidad(cantidad);
                p.setPedido(pedido);
                p.setProveedor(proveedor);

                dao.agregar(p);
                request.getRequestDispatcher("Controlador?accion=Listar").forward(request, response);

                break;
            case "ActualizarPrecio":
                String ide = request.getParameter("id");
                Producto pe = dao.listarId(ide);
                request.setAttribute("producto", pe);
                request.getRequestDispatcher("actualizarPrecio.jsp").forward(request, response);
                break;
            case "ActualizarPrecioBtn":
                String id1 = request.getParameter("txtid");
                String precio1 = request.getParameter("txtprecio");

                dao.actulizarPrecios(id1, Float.parseFloat(precio1));
                request.getRequestDispatcher("Controlador?accion=Listar").forward(request, response);

                break;
            case "Pedido":
                request.getRequestDispatcher("addPedido.jsp").forward(request, response);

                break;
            case "GuardarPedido":
                //se guarda el dato de la caja de texto del .jsp en la variable
                
                int pedi = Integer.parseInt(request.getParameter("txtpedidoP"));
                int tiendaP = Integer.parseInt(request.getParameter("txttiendaP"));
                int tallerP = Integer.parseInt(request.getParameter("txttallerP"));
                int estiloP = Integer.parseInt(request.getParameter("txtEstiloP"));
                

                //se agregan los valores al objeto producto
                ped.setCantidadPedido(pedi);
                ped.setIdTienda(tiendaP);
                ped.setIdTaller(tallerP);
                ped.setIdEstilos(estiloP);

                daoP.agregarP(ped);
                request.getRequestDispatcher("Controlador?accion=Listar").forward(request, response);

                break;
            default:
                throw new IllegalArgumentException("Acción no válida: " + accion);

        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
