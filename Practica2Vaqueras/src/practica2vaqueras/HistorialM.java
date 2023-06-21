/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2vaqueras;

import java.util.ArrayList;

/**
 *
 * @author casal
 */
public class HistorialM {
    private int numeroPedido;
    private String vehiculo;
    private String distancia;
    private String total;
    private ArrayList<Productos> productosPedido;
    private String fechaPedido;
    private String fechaEntrega;

    public HistorialM(int numeroPedido, String vehiculo, String distancia, String total, ArrayList<Productos> productosPedido, String fechaPedido, String fechaEntrega) {
        this.numeroPedido = numeroPedido;
        this.vehiculo = vehiculo;
        this.distancia = distancia;
        this.total = total;
        this.productosPedido = productosPedido;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public ArrayList<Productos> getProductosPedido() {
        return productosPedido;
    }

    public void setProductosPedido(ArrayList<Productos> productosPedido) {
        this.productosPedido = productosPedido;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "Pedido{" + "numeroPedido=" + numeroPedido + ", vehiculo=" + vehiculo + ", distancia=" + distancia + ", total=" + total + ", productosPedido=" + productosPedido + ", fechaPedido=" + fechaPedido + ", fechaEntrega=" + fechaEntrega + '}';
    }

   
}
