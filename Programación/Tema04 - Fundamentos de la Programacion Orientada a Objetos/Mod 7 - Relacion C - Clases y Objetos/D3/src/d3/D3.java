/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package d3;

/**
 *
 * @author 🌟 Coraima Mera Rodríguez 🌟
 */
public class D3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creamos dos instancias del objeto Rectangulo
        Rectangulo rectangulo1 = new Rectangulo(0,5,5,10);
        Rectangulo rectangulo2 = new Rectangulo(2,3,7,9);
        
        // Imprimo la información del rectanguloo en pantalla
        System.out.println("\nIMPRIMO LOS DATOS DE LOS RECTANGULOS");
        rectangulo1.imprimir();
        rectangulo2.imprimir();
        
        // Calculo el area el area del rectangulo
        System.out.println("\nAREAS DE LOS RECTANGULOS");
        System.out.println("Rectangulo 1: " + rectangulo1.getArea());
        System.out.println("Rectangulo 2: " + rectangulo2.getArea());
        
        // Calculo el perimetro el area del rectangulo
        System.out.println("\nPERIMETROS DE LOS RECTANGULOS");
        System.out.println("Rectangulo 1: " + rectangulo1.getPerimetro());
        System.out.println("Rectangulo 2: " + rectangulo2.getPerimetro());
        
    } // main
    
} // clase principal