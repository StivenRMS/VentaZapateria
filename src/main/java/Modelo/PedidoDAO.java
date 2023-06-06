/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Usuario
 */
public class PedidoDAO {
     PreparedStatement ps;
     ResultSet rs;
     Conexion c = new Conexion();
     Connection con;
    
     public int agregarP(Pedido p) {
        int r = 0;
        String sql = "insert into tb_pedidos ( cantidad_pedido, fecha_pedido, id_tienda,id_taller,id_estilos) values(?,?,?,?,?)";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getCantidadPedido());
            ps.setDate(2, new java.sql.Date(new java.util.Date().getTime()) );
            ps.setInt(3, p.getIdTienda());
            ps.setInt(4, p.getIdTaller());
            ps.setInt(5, p.getIdEstilos());
          

            r = ps.executeUpdate();
            if (r == 1) {
                r = 1;
            } else {
                r = 0;
            }
        } catch (Exception e) {
            System.out.println("ERROR EN agregarP "+e);
        }
        return r;
    }
    
}
