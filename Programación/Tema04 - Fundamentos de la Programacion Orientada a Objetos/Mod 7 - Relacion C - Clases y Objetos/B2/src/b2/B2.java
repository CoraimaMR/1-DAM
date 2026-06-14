/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b2;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instancias dos objetos de la clase persona
        Persona persona1 = new Persona("12121212S", "Lola", "Mera Moriano", 5);
        Persona persona2 = new Persona("23232323J", "Luna", "Pera Sol", 18);
        
        // Mostramos los resultados
        
        String cadena1 = persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni; 
        String cadena2 = persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni; 
        
        if (persona1.edad >= 18) {
            cadena1 += " es mayor de edad.";
        } else {
            cadena1 += " es menor de edad.";
        }
        
        if (persona2.edad >= 18) {
            cadena2 += " es mayor de edad.";
        } else {
            cadena2 += " es menor de edad.";
        }
        
        System.out.println("\n" + cadena1);
        System.out.println(cadena2);
    }
    
}
