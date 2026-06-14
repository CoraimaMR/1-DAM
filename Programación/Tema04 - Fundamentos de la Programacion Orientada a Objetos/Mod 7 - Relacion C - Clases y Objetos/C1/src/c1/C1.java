/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c1;

/**
 *
 * @author usuario
 */
public class C1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creo instancias de tres puntos
        Punto p1 = new Punto(5,0);
        Punto p2 = new Punto(10,10);
        Punto p3 = new Punto(3,7);
        
        // Muestro por pantalla el valor de los puntos usando getters
        System.out.println("VALORES INICIALES DE LAS COORDENADAS");
        System.out.println("Punto p1: x=" + p1.getX() + " y=" + p1.getY());
        System.out.println("Punto p2: x=" + p2.getX() + " y=" + p2.getY());
        System.out.println("Punto p3: x=" + p3.getX() + " y=" + p3.getY());

        // Modifico el valor de las coordenadas usando setters
        p1.setX(p1.getX() + 1);      // x++
        p1.setY(p1.getY() * 2);      // y *= 2

        p2.setX(p2.getX() * 5);      // x *= 5
        p2.setY(p2.getY() - 8);      // y -= 8

        p3.setX(p3.getX() / 4);      // x /= 4
        p3.setY(p3.getY() - 1);      // y--

        // Muestro por pantalla el valor de los puntos tras modificar
        System.out.println("\nVALORES MODIFICADOS DE LAS COORDENADAS");
        System.out.println("Punto p1: x=" + p1.getX() + " y=" + p1.getY());
        System.out.println("Punto p2: x=" + p2.getX() + " y=" + p2.getY());
        System.out.println("Punto p3: x=" + p3.getX() + " y=" + p3.getY());
    }
    
}
