/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;
import java.util.Scanner;
/**
 *
 * @author israc
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op;
        Estudiante estudiantes = null;
        do{
            System.out.println("====GESTION ESTUDIANTES====");
            System.out.println("1. Ingreseo de datos del estudiante");
            System.out.println("2. Evaluar el estado del estudiante");
            System.out.println("3. Actualizacion de promedio");
            System.out.println("4. Mostrar datos del estudiante");
            System.out.println("5. Salir");
            System.out.print("Eliga una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    System.out.println("====INGRESO DE DATOS====");
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese la carrera del estudiante: ");
                    String carrera = sc.nextLine();
                    System.out.print("Ingrese el promedio del estudiante: ");
                    double promedio = sc.nextDouble();
                    sc.nextLine();
                    estudiantes = new Estudiante(nombre, carrera, promedio);
                    break;
                    
                case 2:
                    if (estudiantes != null) {
                        estudiantes.evaluarEstado();
                    }else{
                        System.out.println("Primero ingrese la información del estudiante");
                    }
                    break;
                
                case 3:
                    if (estudiantes != null) {
                        System.out.println("Ingrese el promedio nuevo: ");
                    double nuevoPromedio = sc.nextDouble();
                    estudiantes.actualizarPromedio(nuevoPromedio);
                    }else{
                        System.out.println("Primero registre un estudiante");
                    }break;
                    
                case 4:
                    if (estudiantes != null) {
                       estudiantes.mostrarInformacio(); 
                    }else{
                        System.out.println("Primero debe registrar al estudiante");
                    }break;
                case 5: break;
                default:
                    System.out.println("Ingrese una opcion valida");break;
            }
        }while(op!=5);
        sc.close();
    }
    
}
