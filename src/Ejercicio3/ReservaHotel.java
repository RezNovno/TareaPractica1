/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author israc
 */
public class ReservaHotel {
    //Atributos
    String nombreCliente, tipoHabitacion, estado;
    int numeroNoches;
    double precioPorNoche;
    
    //Constructores 

    public ReservaHotel() {
    }

    public ReservaHotel(String nombreCliente, String tipoHabitacion, int numeroNoches, double precioPorNoche) {
        this.nombreCliente = nombreCliente;
        this.tipoHabitacion = tipoHabitacion;
        this.estado = "reservado";
        this.numeroNoches = numeroNoches;
        this.precioPorNoche = precioPorNoche;
    }
    
    //Metodos
    public void calcularTotal(){
        if (tipoHabitacion.equalsIgnoreCase("simple")) {
            precioPorNoche = 25;
        }else if (tipoHabitacion.equalsIgnoreCase("doble")) {
            precioPorNoche = 35;
        }else if (tipoHabitacion.equalsIgnoreCase("suite")) {
            precioPorNoche = 50;
        }
        
        double totalP = numeroNoches * precioPorNoche;
        System.out.println("El total a pagar es de: " + totalP);
    }
    
    public void confirmarReserva(){
        if (estado.equalsIgnoreCase("reservado")) {
            estado = "ocupado";
        }
        System.out.println("Su habitacion ha sido reservada");
    }
    
    public void finalizarReserva(){
        if (estado.equalsIgnoreCase("ocupado")) {
            estado = "finalizado";
        }
        System.out.println("Usted ha desocupado la habitacion");
    }
    
    public void mostrarReserva(){
        System.out.println("====DETALLES DE LA RESERVACION====");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Tipo de habitacion: " + tipoHabitacion);
        System.out.println("Estado: " + estado);
        System.out.println("Numero de noches: "+ numeroNoches);
        System.out.println("Precio por noche: " + precioPorNoche);
        double totalP = numeroNoches * precioPorNoche;
        System.out.println("Total a pagar: " + totalP);
    }
}
