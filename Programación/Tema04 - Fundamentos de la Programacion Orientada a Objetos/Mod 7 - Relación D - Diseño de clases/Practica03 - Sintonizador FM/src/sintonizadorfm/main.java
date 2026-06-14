/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sintonizadorfm;

/**
 *
 * @author coram
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creo dos instancias
        Sintonizador s1 = new Sintonizador();
        Sintonizador s2 = new Sintonizador(81);
        
        System.out.println("\nCREO DOS SINTONIZADORES");
        System.out.print("Sintonizador 1: ");
        s1.display();
        System.out.print("Sintonizador 2: ");
        s2.display();
        
        // Subimos las frecuencias
        s1.up(8);
        System.out.print("\nSUBIMOS 8 SALTOS AL SINTONIZADOR 1\n");
        System.out.print("Sintonizador 1: ");
        s1.display();
        
        // Bajamos las frecuencias
        s2.down(3);
        System.out.print("\nBAJAMOS 3 SALTOS AL SINTONIZADOR 2\n");
        System.out.print("Sintonizador 2: ");
        s2.display();
        
        s2.down(5);
        System.out.print("\nBAJAMOS 5 SALTOS AL SINTONIZADOR 2\n");
        System.out.print("Sintonizador 2: ");
        s2.display();
    }
    
}
