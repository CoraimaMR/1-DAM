/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bombillas;
import java.util.Scanner;

/**
 *
 * @author coram
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instanciamos b1 y b2
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        
        System.out.println("\nINSTANCIAMOS B1 y B2");
        System.out.println("ESTADO B1: " + b1.estadoBombilla());
        System.out.println("ESTADO B2: " + b2.estadoBombilla());
        
        // Encendemos b1 y b2
        b1.encenderBombilla();
        b2.encenderBombilla();
        
        System.out.println("\nENCENDEMOS B1 y B2");
        System.out.println("ESTADO B1: " + b1.estadoBombilla());
        System.out.println("ESTADO B2: " + b2.estadoBombilla());
        
        // Cortamos la luz
        Bombilla.apagarLuz();
        
        System.out.println("\nCORTAMOS LA LUZ");
        System.out.println("ESTADO B1: " + b1.estadoBombilla());
        System.out.println("ESTADO B2: " + b2.estadoBombilla());
        
        // Damos luz
        Bombilla.encenderLuz();
        
        System.out.println("\nDAMOS LA LUZ");
        System.out.println("ESTADO B1: " + b1.estadoBombilla());
        System.out.println("ESTADO B2: " + b2.estadoBombilla());
        
        // Apago b1
        b1.apagarBombilla();
        
        System.out.println("\nAPAGAMOS B1");
        System.out.println("ESTADO B1: " + b1.estadoBombilla());
        System.out.println("ESTADO B2: " + b2.estadoBombilla());
        
        // Cortamos la luz
        Bombilla.apagarLuz();
        
        System.out.println("\nCORTAMOS LA LUZ");
        System.out.println("ESTADO B1: " + b1.estadoBombilla());
        System.out.println("ESTADO B2: " + b2.estadoBombilla());
        
        // Damos luz
        Bombilla.encenderLuz();
        
        System.out.println("\nDAMOS LA LUZ");
        System.out.println("ESTADO B1: " + b1.estadoBombilla());
        System.out.println("ESTADO B2: " + b2.estadoBombilla());
    }
    
}
