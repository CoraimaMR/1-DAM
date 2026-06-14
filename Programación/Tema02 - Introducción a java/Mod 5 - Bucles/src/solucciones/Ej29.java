/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/********************************* ENUNCIADO **********************************
 * 29. Escribe un programa que muestre la tirada de tres dados. Se debe mostrar 
 * también la suma total (los puntos que suman entre los tres dados).
 * ****************************************************************************
*/

package ej29;

/**
 *
 * @author Jesús Pérez
 */
public class Ej29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tirada=0, suma=0;
        
        for (int i = 0; i < 3; i++) {
            tirada=(int)(Math.random()*6)+1;
            suma+=tirada;
            System.out.println("Tirada "+i+"= "+tirada );
        }
        
        System.out.println("suma = " + suma);
    }
    
}
