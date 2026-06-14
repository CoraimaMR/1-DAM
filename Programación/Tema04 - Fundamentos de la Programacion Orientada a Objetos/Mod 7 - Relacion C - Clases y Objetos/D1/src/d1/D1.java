/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package d1;

/**
 *
 * @author 🌟 Coraima Mera Rodríguez 🌟
 */
public class D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creo instancias de tres puntos
        Punto p1 = new Punto(5,0);
        Punto p2 = new Punto(10,10);
        Punto p3 = new Punto(3,7);
        
        // Muestro las coordenaas por pantalla
        System.out.println("\nIMPRIMO LAS COORDENADAS");
        p1.imprime();
        p2.imprime();
        p3.imprime();
        
        // Desplazo el punto p1 y lo imprimo
        System.out.println("\nDESPLAZO p1");
        p1.desplaza(10, 5);
        p1.imprime();
        
        // Calculo la distancia entre p1 y p2
        System.out.println("\nLa distancia entre p1 y p2 es "+p1.distancia(p2));
        
        // Con el método .toString()
        System.out.println("\nUSO EL MÉTODO .toString():");
        System.out.println("Punto 1: "+p1.toString());
        System.out.println("Punto 2: "+p2.toString());
        System.out.println("Punto 3: "+p3.toString());
        
    } // main
    
} // clase principal
