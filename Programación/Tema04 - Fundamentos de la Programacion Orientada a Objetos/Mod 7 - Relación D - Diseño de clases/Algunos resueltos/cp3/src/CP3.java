/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cp3;

/**
 *
 * @author usuario
 */
public class CP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SintonizadorFM s1=new SintonizadorFM();
        SintonizadorFM s2=new SintonizadorFM(81);
        
        System.out.println("Creo dos sintonizadores: ");
        System.out.print("s1: ");
        s1.imprimirFrecuencia();
        System.out.print("s2: ");
        s2.imprimirFrecuencia();
        System.out.println("");
        
        System.out.println("Sintonizador 1: subo 8 saltos.");
        s1.subir();
        s1.subir();
        s1.subirSaltos(6);
        s1.imprimirFrecuencia();
        System.out.println("");
        
        System.out.println("Sintonizador 2: bajo 3 saltos");
        s2.bajar();
        s2.bajar();
        s2.bajar();
        s2.imprimirFrecuencia();
        System.out.println("");
        
        System.out.println("Sintonizador 2: bajo 5 saltos.");
        s2.bajarSaltos(5);
        s2.imprimirFrecuencia();
        
    }//main
    
}//class
