/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;
import java.util.Scanner;
/**
 *
 * @author israc
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de productos: ");
        int n = sc.nextInt();
        sc.nextLine();
        int op;
        Producto productos[] = null;
        do{
            System.out.println("====SISTEMA DE INVENTARIO====");
            System.out.println("1. Registro de productos");
            System.out.println("2. Venta de producto");
            System.out.println("3. Reabastecimiento de producto");
            System.out.println("4. Verificar estado del producto");
            System.out.println("5. Mostrar detalles");
            System.out.println("6. Salir");
            System.out.print("Eliga una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    productos = new Producto[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Producto " + (i+1) + ": ");
                        System.out.print("Nombre del producto: ");
                        String nombreProducto = sc.nextLine();
                        System.out.print("Precio del producto: ");
                        double precio = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Stock del producto: ");
                        int stock = sc.nextInt();
                        sc.nextLine();
                        String estado;
                        if (stock == 0) {
                            estado = "Agotado";
                        }else{
                            estado = "Disponible";
                        }
                        
                        productos[i] = new Producto(nombreProducto, estado, precio, stock);
                    }break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        System.out.println("Producto " + productos[i].nombreProducto + " tiene un stok de: " + productos[i].stock);
                        System.out.print("Cuantos productos desea llevarse: ");
                        int cantV = sc.nextInt();
                        sc.nextLine();
                        try{
                            productos[i].vender(cantV);
                            System.out.println("Venta realizada con exito");
                        }catch(Exception e){
                            System.out.println("Error: " + e.getMessage());
                        }
                    }break;
                case 3:
                    for (int i = 0; i < n; i++) {
                        System.out.println("Producto " + productos[i].nombreProducto + " que tiene un stock de: " + productos[i].stock);
                        System.out.println("Cuantos productos va a reabastecer: ");
                        int reab = sc.nextInt();
                        sc.nextLine();
                        try{
                            productos[i].reabastecer(reab);
                            System.out.println("Producto reabastecido con exito");
                        }catch(Exception e){
                            System.out.println("Error: " + e.getMessage());
                        }
                    }break;
                case 4:
                    for (int i = 0; i < n; i++) {
                        productos[i].verificarEstado();
                    }break;
                case 5:
                    for (int i = 0; i < n; i++) {
                        productos[i].mostrarProducto();
                    }
                case 6: break;
                default: 
                    System.out.println("Ingrese una opcion correcta");break;
            }
        }while(op!=6);
        sc.close();
    }
    
}
