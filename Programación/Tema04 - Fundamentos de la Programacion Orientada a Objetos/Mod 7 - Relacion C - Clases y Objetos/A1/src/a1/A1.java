/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a1;

/**
 *
 * @author usuario
 */
public class A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creo instancias de tres puntos
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        Punto p3 = new Punto();
        
        // Doy valor a las coordenadas de cada punto
        p1.x = 5;
        p1.y = 0;
        
        p2.x = 10;
        p2.y = 10;
        
        p3.x = 3;
        p3.y = 7;
        
        // Muetro por pantalla el valor de los puntos
        System.out.println("VALORES INICIALES DE LAS COORDENADAS");
        System.out.println("Punto p1: x="+p1.x+" y="+p1.y);
        System.out.println("Punto p2: x="+p2.x+" y="+p2.y);
        System.out.println("Punto p3: x="+p3.x+" y="+p3.y);
        
        // Modifico el valor de las coordenadas
        p1.x++;
        p1.y *= 2;
        
        p2.x *= 5;
        p2.y -= 8;
        
        p3.x /= 4;
        p3.y--;
        
        // Muetro por pantalla el valor de los puntos
        System.out.println("\nMODIFICO LOS VALORES DE LAS COORDENAS");
        System.out.println("Punto p1: x="+p1.x+" y="+p1.y);
        System.out.println("Punto p2: x="+p2.x+" y="+p2.y);
        System.out.println("Punto p3: x="+p3.x+" y="+p3.y);
    }
    
}
