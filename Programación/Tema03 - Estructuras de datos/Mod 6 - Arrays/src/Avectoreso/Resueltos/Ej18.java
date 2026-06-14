package Avectoreso.Resueltos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
++++++++++++++++++++++++++++++++ ENUNCIADO +++++++++++++++++++++++++++++++++++
18. Crea un programa que cree un array de tamaño 30 y lo rellene con valores 
aleatorios entre 0 y 9 (utiliza Math.random()*10). Luego ordena los valores del 
array y los mostrará por pantalla.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

import java.util.Arrays;

/**
 *
 * @author Jesús Pérez
 */
public class Ej18 {
    public static void main(String[] args) {
        int vector[]=new int[30];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*10);
        }//for
        
        Arrays.sort(vector);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");;
        }//for
        
    }//main
}
