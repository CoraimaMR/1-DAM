/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instancias dos objetos de la clase persona
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        // Para el primer objeto
        System.out.println("INTRODUZCA LOS DATOS DE LA PERONA 1");
        
        System.out.print("Introduzca el DNI: ");
        persona1.dni = sc.nextLine();
        
        System.out.print("Introduzca el nombre: ");
        persona1.nombre = sc.nextLine();
        
        System.out.print("Introduzca los apellidos: ");
        persona1.Apellidos = sc.nextLine();
        
        System.out.print("Introduzca la edad: ");
        persona1.edad = sc.nextInt();
        sc.nextLine(); // Para no dar errores
        
        // Para el segundo objeto
        System.out.println("\nINTRODUZCA LOS DATOS DE LA PERONA 2");
        
        System.out.print("Introduzca el DNI: ");
        persona2.dni = sc.nextLine();
        
        System.out.print("Introduzca el nombre: ");
        persona2.nombre = sc.nextLine();
        
        System.out.print("Introduzca los apellidos: ");
        persona2.Apellidos = sc.nextLine();
        
        System.out.print("Introduzca la edad: ");
        persona2.edad = sc.nextInt();
        
        // Mostramos los resultados
        
        String cadena1 = persona1.nombre + " " + persona1.Apellidos + " con DNI " + persona1.dni; 
        String cadena2 = persona2.nombre + " " + persona2.Apellidos + " con DNI " + persona2.dni; 
        
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
