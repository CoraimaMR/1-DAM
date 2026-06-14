/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
******************************* ENUNCIADO ********************************
30. Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) 
separados por espacios.
**************************************************************************
*/

package ej30;

/**
 *
 * @author Jesús Pérez
 */
public class Ej30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print((int)(Math.random()*11));
            System.out.print(" ");
        }
        System.out.println("");
    }
    
}
