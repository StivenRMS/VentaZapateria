/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Pedido {
    int id;
    int cantidadPedido;
    String fechaPedido;
    int idTienda;
    int idTaller;
    int idEstilos;
    
     public Pedido(){
        
    }

    public Pedido(int id, int cantidadPedido, String fechaPedido, int idTienda, int idTaller, int idEstilos) {
        this.id = id;
        this.cantidadPedido = cantidadPedido;
        this.fechaPedido = fechaPedido;
        this.idTienda = idTienda;
        this.idTaller = idTaller;
        this.idEstilos = idEstilos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadPedido() {
        return cantidadPedido;
    }

    public void setCantidadPedido(int cantidadPedido) {
        this.cantidadPedido = cantidadPedido;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public int getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(int idTaller) {
        this.idTaller = idTaller;
    }

    public int getIdEstilos() {
        return idEstilos;
    }

    public void setIdEstilos(int idEstilos) {
        this.idEstilos = idEstilos;
    }

   
    
    
    
    
}
