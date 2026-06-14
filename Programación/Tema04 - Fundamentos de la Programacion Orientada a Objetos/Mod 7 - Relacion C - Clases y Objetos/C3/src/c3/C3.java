/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c3;

/**
 *
 * @author coram
 */
public class C3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creamos dos instancias del objeto Rectangulo
        Rectangulo rectangulo1 = new Rectangulo(0,10,5,5);
        Rectangulo rectangulo2 = new Rectangulo(7,9,2,3);
        
        // Muestro por pantalla los valores iniciales
        
        System.out.println("\nVALORES INICIALES DE LAS COORDENAS");

        // Rectángulo 1
        System.out.println("Rectangulo 1: (" + rectangulo1.getX1() + "," + rectangulo1.getY1() +
                ") y (" + rectangulo1.getX2() + "," + rectangulo1.getY2() + ")");
        System.out.println("Perímetro: " +
                (2 * (Math.abs(rectangulo1.getX2() - rectangulo1.getX1())
                + Math.abs(rectangulo1.getY2() - rectangulo1.getY1()))));
        System.out.println("Área: " +
                (Math.abs(rectangulo1.getX2() - rectangulo1.getX1())
                * Math.abs(rectangulo1.getY2() - rectangulo1.getY1())) + "\n");

        // Rectángulo 2
        System.out.println("Rectangulo 2: (" + rectangulo2.getX1() + "," + rectangulo2.getY1() +
                ") y (" + rectangulo2.getX2() + "," + rectangulo2.getY2() + ")");
        System.out.println("Perímetro: " +
                (2 * (Math.abs(rectangulo2.getX2() - rectangulo2.getX1())
                + Math.abs(rectangulo2.getY2() - rectangulo2.getY1()))));
        System.out.println("Área: " +
                (Math.abs(rectangulo2.getX2() - rectangulo2.getX1())
                * Math.abs(rectangulo2.getY2() - rectangulo2.getY1())));

        // Modifico los valores
        
        rectangulo1.setX1(1);
        rectangulo1.setY1(2);
        rectangulo1.setX2(6);
        rectangulo1.setY2(8);

        rectangulo2.setX1(4);
        rectangulo2.setY1(4);
        rectangulo2.setX2(10);
        rectangulo2.setY2(6);
        
        // Muestro por pantalla los valores modificados

        System.out.println("\nVALORES MODIFICADOS DE LAS COORDENADAS");

        // Rectángulo 1 modificado
        System.out.println("Rectangulo 1: (" + rectangulo1.getX1() + "," + rectangulo1.getY1() +
                ") y (" + rectangulo1.getX2() + "," + rectangulo1.getY2() + ")");
        System.out.println("Perímetro: " +
                (2 * (Math.abs(rectangulo1.getX2() - rectangulo1.getX1())
                + Math.abs(rectangulo1.getY2() - rectangulo1.getY1()))));
        System.out.println("Área: " +
                (Math.abs(rectangulo1.getX2() - rectangulo1.getX1())
                * Math.abs(rectangulo1.getY2() - rectangulo1.getY1())) + "\n");

        // Rectángulo 2 modificado
        System.out.println("Rectangulo 2: (" + rectangulo2.getX1() + "," + rectangulo2.getY1() +
                ") y (" + rectangulo2.getX2() + "," + rectangulo2.getY2() + ")");
        System.out.println("Perímetro: " +
                (2 * (Math.abs(rectangulo2.getX2() - rectangulo2.getX1())
                + Math.abs(rectangulo2.getY2() - rectangulo2.getY1()))));
        System.out.println("Área: " +
                (Math.abs(rectangulo2.getX2() - rectangulo2.getX1())
                * Math.abs(rectangulo2.getY2() - rectangulo2.getY1())));
    }
}