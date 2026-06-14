/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos;

/**
 *
 * @author Jesús Pérez
 */
public class EjemploAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int azaroso;
        
        //Instrucciones
        System.out.println("ACLARACIONES:");
        System.out.println("Los números aleatorios se generan con el método "
                + "random() de la clase Math.");
        System.out.println("Por lo tanto, hay que usar Math.random()");
        System.out.println("Se genera un double entre 0 y 1.");
        System.out.println("A partir de este método, construimos diferentes aplicaciones");
        System.out.println("");
        
        //Un número aleatorio
        System.out.println("Genero un número aleatorio: "+Math.random());
        System.out.println("");
        
        //Diez números aleatorios
        System.out.println("Genero 10 números aleatorios con un bucle for:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Número = "+Math.random());
        }
        System.out.println("");
        
        //Un número entero aleatorio entre 0 y 10
        azaroso=(int)(Math.random()*10);
        System.out.println("Entero aleatorio entre 0 y 10 = "+azaroso);
        System.out.println("");
        
        //Ejemplo de Luis J. Sánchez
        System.out.println("Genera al azar piedra, papel o tijera:");
        int mano = (int)(Math.random()*3); // genera un número al azar
        // entre 0 y 2 ambos incluidos
        switch(mano) {
            case 0:
                System.out.println("piedra");
                break;
            case 1:
                System.out.println("papel");
                break;
            case 2:
                System.out.println("tijera");
                break;
            default:
        }
    }
    
}
