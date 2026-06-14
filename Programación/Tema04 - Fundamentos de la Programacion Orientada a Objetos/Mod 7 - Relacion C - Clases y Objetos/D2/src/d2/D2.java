/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package d2;

/**
 *
 * @author 🌟 Coraima Mera Rodríguez 🌟
 */
public class D2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instancias dos objetos de la clase persona
        Persona persona1 = new Persona("12121212S", "Lola", "Mera Moriano", 5);
        Persona persona2 = new Persona("Luna", "Pera Sol", 18);
        
        // Imprimo la información del objeto
        System.out.println("\nIMPRIMO LOS DATOS DE PERSONA");
        persona1.imprime();
        persona2.imprime();
        
        // Muestro si persona1 es mayor de edad o no
        System.out.println("\n¿ES MAYOR DE EDAD?");
        if (persona1.esMayorEdad()) {
            System.out.println("Persna 1 es mayor de edad");
        } else {
            System.out.println("Persona 1 es menor de edad");
        }
        
        // Muestro si persona2 esta jubilado o no
        System.out.println("\n¿ESTA JUBILADO?");
        if (persona2.esJubilado()) {
            System.out.println("Persona 2 esta jubilado");
        } else {
            System.out.println("Persona 2 no esta jubilado");
        }
        
        // Calculo la diferencia de edad entre persona1 y persona2
        System.out.println("\nCALCULO LA DIFERENCIA DE EDAD");
        System.out.println("La diferencia de edad entre la persona 1 y 2 es de " + persona1.diferenciaEdad(persona2));
        
    } // main
    
} // clase principal
