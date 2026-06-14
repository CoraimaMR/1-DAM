/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e2;

/**
 *
 * @author 🌟 Coraima Mera Rodríguez 🌟
 */
public class E2 {

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
        
        // Validar DNI directamente sin objeto
        System.out.println("\nVALIDACIÓN DE DNI SIN CREAR OBJETO");
        System.out.println("12345678Z es válido? " + Persona.validarDNI("12345678Z"));
        System.out.println("12345X78Z es válido? " + Persona.validarDNI("12345X78Z"));
        
        // Probamos crear una persona con DNI inválido
        System.out.println("\nIMPRIMO DATOS DE UNA PERSONA CON DNI INCORRECTO");
        Persona persona3 = new Persona("12X45678A", "Juan", "Pérez", 25);
        persona3.imprime();
        
    } // main
    
} // clase principal
