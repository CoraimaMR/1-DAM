/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplomatrices;
/*
*******************************************************************************
+++++++++++++++++++++++ EJEMPLO DE USO DE MATRICES ++++++++++++++++++++++++++++
*******************************************************************************
*/

import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class EjemploMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Declaramos e instanciamos una matriz 4x3 de enteros
        //Es decir, 4 filas y 3 columnas
        /*
                0   1   2 
            0   n   n   n
            1   n   n   n
            2   n   n   n
            3   n   n   n
        */
        
        int matrizEnteros[][]=new int[4][3];
        
        //La rellenamos con valores aleatorios entre 1 y 10
        for (int i = 0; i < matrizEnteros.length; i++) {
            for (int j = 0; j < matrizEnteros[0].length; j++) {
                matrizEnteros[i][j]=(int)(Math.random()*10)+1;                
            }
            
        }//for externo
        
        System.out.println("Pulse cualquier tecla para mostrar el contenido de"
                + "la matriz...");
        sc.nextLine();
        
        //Mostramos sus valores por pantalla
        //En cada fila,separamos los enteros con un tabulador
        //Al final de cada fila insertamos un salto de línea
        for (int i = 0; i < matrizEnteros.length; i++) {
            for (int j = 0; j < matrizEnteros[0].length; j++) {
                System.out.print(matrizEnteros[i][j]+"\t");               
            }
            System.out.println("");
        }//for externo
    }//main
    
}//class
