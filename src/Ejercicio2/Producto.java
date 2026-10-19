/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author israc
 */
public class Producto {
    
    //Atributos
    String nombreProducto,estado;
    double precio;
    int stock;
    
    //Constructores

    public Producto() {
    }

    public Producto(String nombreProducto, String estado, double precio, int stock) {
        this.nombreProducto = nombreProducto;
        this.estado = estado;
        this.precio = precio;
        this.stock = stock;
    }
    
    //Metodos
    public void vender(int cantidad)throws Exception{
        if (cantidad <= 0) {
            throw new Exception("Ingrese una cantidad valida");
        }else if (cantidad > stock) {
            throw new Exception("Lo sentimos, solo tenemos " + stock + " del producto");
        }else{
            stock = stock - cantidad;
        }
    }
    
    public void reabastecer(int cantidad)throws Exception{
        if (cantidad <= 0) {
            throw new Exception("Ingrese una cantidad válida");
        }else {
            stock = stock + cantidad;
        }
    }
    
    public void verificarEstado(){
        if (stock == 0) {
            System.out.println("El producto se encuentra");
        }else{
            System.out.println("Tenemos " + stock + " de " + nombreProducto);
        }
    }
    
    public void mostrarProducto(){
        System.out.println("=====INVENTARIO=====");
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio del producto: " + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Estado del producto: " + estado);
    }
}
