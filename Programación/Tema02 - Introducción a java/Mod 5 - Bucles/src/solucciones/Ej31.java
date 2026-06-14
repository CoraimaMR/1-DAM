/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
********************************** ENUNCIADO ********************************
30. Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) 
separados por espacios. Muestra también el máximo, el mínimo y la media 
de esos números.
*****************************************************************************
*/
package ej31;

/**
 *
 * @author Jesús Pérez
 */
public class Ej31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max=100; 
        int min=199; 
        int suma=0;
        int num=0;
        
        for (int i = 0; i < 50; i++) {
            num=100+(int)(Math.random()*100);
            
            suma+=num;
            
            if (num<min) {
                min=num;
            }
            
            if (num>max) {
                max=num;
            }
            
            System.out.print(num);
            System.out.print(" ");
        }
        System.out.println("");
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("La media es "+(suma/50));
        
    }
    
}
