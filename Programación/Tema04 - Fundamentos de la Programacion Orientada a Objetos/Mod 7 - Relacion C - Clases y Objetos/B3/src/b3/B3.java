/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b3;

/**
 *
 * @author coram
 */
public class B3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creamos dos instancias del objeto Rectangulo
        Rectangulo rectangulo1 = new Rectangulo(0,0,5,5);
        Rectangulo rectangulo2 = new Rectangulo(7,9,2,3);
        
        // Muestro por pantalla los valores iniciales
        
        System.out.println("VALORES INICIALES DE LAS COORDENAS\n");

        // Rectángulo 1
        System.out.println("Rectangulo 1: (" + rectangulo1.x1 + "," + rectangulo1.y1 +
                ") y (" + rectangulo1.x2 + "," + rectangulo1.y2 + ")");
        System.out.println("Perímetro: " +
                (2 * (Math.abs(rectangulo1.x2 - rectangulo1.x1)
                + Math.abs(rectangulo1.y2 - rectangulo1.y1))));
        System.out.println("Área: " +
                (Math.abs(rectangulo1.x2 - rectangulo1.x1)
                * Math.abs(rectangulo1.y2 - rectangulo1.y1)) + "\n");

        // Rectángulo 2
        System.out.println("Rectangulo 2: (" + rectangulo2.x1 + "," + rectangulo2.y1 +
                ") y (" + rectangulo2.x2 + "," + rectangulo2.y2 + ")");
        System.out.println("Perímetro: " +
                (2 * (Math.abs(rectangulo2.x2 - rectangulo2.x1)
                + Math.abs(rectangulo2.y2 - rectangulo2.y1))));
        System.out.println("Área: " +
                (Math.abs(rectangulo2.x2 - rectangulo2.x1)
                * Math.abs(rectangulo2.y2 - rectangulo2.y1)));

        // Modifico los valores
        
        rectangulo1.x1 = 1;
        rectangulo1.y1 = 2;
        rectangulo1.x2 = 6;
        rectangulo1.y2 = 8;

        rectangulo2.x1 = 4;
        rectangulo2.y1 = 4;
        rectangulo2.x2 = 10;
        rectangulo2.y2 = 6;
        
        // Muestro por pantalla los valores modificados

        System.out.println("\nVALORES MODIFICADOS DE LAS COORDENADAS\n");

        // Rectángulo 1 modificado
        System.out.println("Rectangulo 1: (" + rectangulo1.x1 + "," + rectangulo1.y1 +
                ") y (" + rectangulo1.x2 + "," + rectangulo1.y2 + ")");
        System.out.println("Perímetro: " +
                (2 * (Math.abs(rectangulo1.x2 - rectangulo1.x1)
                + Math.abs(rectangulo1.y2 - rectangulo1.y1))));
        System.out.println("Área: " +
                (Math.abs(rectangulo1.x2 - rectangulo1.x1)
                * Math.abs(rectangulo1.y2 - rectangulo1.y1)) + "\n");

        // Rectángulo 2 modificado
        System.out.println("Rectangulo 2: (" + rectangulo2.x1 + "," + rectangulo2.y1 +
                ") y (" + rectangulo2.x2 + "," + rectangulo2.y2 + ")");
        System.out.println("Perímetro: " +
                (2 * (Math.abs(rectangulo2.x2 - rectangulo2.x1)
                + Math.abs(rectangulo2.y2 - rectangulo2.y1))));
        System.out.println("Área: " +
                (Math.abs(rectangulo2.x2 - rectangulo2.x1)
                * Math.abs(rectangulo2.y2 - rectangulo2.y1)));
    }
}