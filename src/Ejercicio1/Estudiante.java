/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author israc
 */
public class Estudiante {
    //Atributos
    String nombre, carrera, estado;
    double promedio;
    
    //Constructo3res
    
    public Estudiante() {
    }
    public Estudiante(String nombre, String carrera, double promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }
    //Métodos
    public void evaluarEstado(){
        if (promedio < 0 || promedio >20) {
            System.out.println("Ingrese un promedio valido");
        }else if (promedio >= 14) {
            estado = "Aprobado";
        }else{
            estado = "Reprobado";
        }
    }
    
    public void actualizarPromedio(double nuevoPromedio){
        if (nuevoPromedio >= 0 && nuevoPromedio <= 20) {
            this.promedio = nuevoPromedio;
        }
    }
    
    public void mostrarInformacio(){
        System.out.println("====DATOS DEL ESTUDIANTE====");
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Es estudiante de la carrera de: " + carrera);
        System.out.println("Su promedio es: " + promedio);
        System.out.println("Su estado actual es: " + estado);
    }
    
}
