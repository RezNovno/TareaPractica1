/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;
import java.util.Scanner;
/**
 *
 * @author israc
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = sc.nextLine();
        System.out.print("Ingrese el numero de noches que desea hospedarse: ");
        int numeroNoches = sc.nextInt();
        sc.nextLine();
        ReservaHotel reserva = null;
        int op;
        do{
            System.out.println("====RESERVACIONES====");
            System.out.println("1. Detalles de la reserva");
            System.out.println("2. Calcular el total de la reserva");
            System.out.println("3. Confirmar reserva");
            System.out.println("4. Finalizar reserva");
            System.out.println("5. Mostrar detalles");
            System.out.println("6. Salir");
            System.out.print("Eliga una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    System.out.print("En que habitacion desea hospedarse: ");
                    String tipoHabitacion = sc.nextLine();
                    reserva = new ReservaHotel(nombreCliente,tipoHabitacion,numeroNoches,0);
                    break;
                case 2:
                    reserva.calcularTotal();
                    break;
                case 3:
                    reserva.confirmarReserva();
                    break;
                case 4:
                    reserva.finalizarReserva();
                    break;
                case 5:
                    reserva.mostrarReserva();
                    break;
                case 6:break;
                default:
                    System.out.println("Eliga una opcion valida");
                    break;
            }
        }while(op!=6);
        sc.close();
    }
    
}
