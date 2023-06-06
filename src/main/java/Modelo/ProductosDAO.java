/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ProductosDAO {

    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;

    public List listar() {
        List<Producto> lista = new ArrayList<>();
        String sql = "select * from Tb_PRODUCTOS";

        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(Integer.parseInt(rs.getString(1)));
                p.setCantidad(Integer.parseInt(rs.getString(2)));
                p.setNombre(rs.getString(5));
                p.setPrecio(rs.getFloat(3));
                p.setPedido(Integer.parseInt(rs.getString(3)));
                p.setEstilo(Integer.parseInt(rs.getString(8)));
                p.setTienda(Integer.parseInt(rs.getString(6)));
                p.setTalla(rs.getString(4));
                lista.add(p);

            }
        } catch (Exception e) {
            System.out.println("Hay algo mal");
            System.out.println(e);
        }
        return lista;
    }

    public Producto listarId(String id) {
        String sql = "select * from tb_productos where id =" + id;
        Producto p = new Producto();
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                p.setId(Integer.parseInt(rs.getString(1)));
                p.setCantidad(Integer.parseInt(rs.getString(2)));
                p.setNombre(rs.getString(5));
                p.setPrecio(rs.getFloat(3));
                p.setTalla(rs.getString(4));
                p.setPedido(Integer.parseInt(rs.getString(7)));
                p.setEstilo(Integer.parseInt(rs.getString(8)));
                p.setTienda(Integer.parseInt(rs.getString(6)));

            }
        } catch (Exception e) {
            System.out.println("ERROR EN LISTARID "+e);
        }
        return p;
    }

    public void actulizarPrecios(String idProducto, double precioNuevo) {
        
        String sql = "{call actualizar_existencias(?, ?)}";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            System.out.println(idProducto+" Envia esto");
            ps.setString(1, idProducto);
            ps.setDouble(2, precioNuevo);
            ps.execute();
            System.out.println("Procedmineto almacenado ejecutado correctamente");
        } catch (Exception e) {
            System.out.println("Error en actualizarPrecios "+ e);
        }
    }

    public int agregar(Producto p) {
        int r = 0;
        String sql = "insert into tb_productos ( cantidad_disponible, precio_producto, talla_productos, name_producto,id_tienda,id_pedidos,id_estilo,id_proveedores) values(?,?,?,?,?,?,?,?)";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getCantidad());
            ps.setFloat(2, p.getPrecio());
            ps.setString(3, p.getTalla());
            ps.setString(4, p.getNombre());
            ps.setInt(5, p.getTienda());
            ps.setInt(6, p.getPedido());
            ps.setInt(7, p.getEstilo());
            ps.setInt(8, p.getProveedor());

            r = ps.executeUpdate();
            if (r == 1) {
                r = 1;
            } else {
                r = 0;
            }
        } catch (Exception e) {
            System.out.println("Error en agregar "+e);
        }
        return r;
    }
}
