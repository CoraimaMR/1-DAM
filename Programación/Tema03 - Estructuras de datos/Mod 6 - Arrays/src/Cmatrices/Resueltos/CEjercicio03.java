/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/*------------------- comentario

*/


/*
+++++++++++++++++++++++++++++++++ ENUNCIADO +++++++++++++++++++++++++++++++++++
3. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
menores que cero y cuántos son igual a cero.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class CEjercicio03 {
    public static void main(String[] args) {
        int filas, columnas;
        int mayor0=0, menor0=0, cero=0;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Vamos a crear una MATRIZ.");
        
        System.out.print("Introduzca el número de filas: ");
        filas=sc.nextInt();
        
        System.out.println("Introduzca el número de columnas: ");
        columnas=sc.nextInt();
        
        //Creamos la matriz con los parámetros introducidos por teclado
        int[][] matriz = new int[filas][columnas];
        
        //Solicitamos los valores a introducir
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor "+i+","+j+": ");;
                matriz[i][j]=sc.nextInt();
            }
        }//for externo
        
        //Mostramos los valores introducidos
        System.out.println("");
        System.out.println("La matriz introducida es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");   
                
                if (matriz[i][j]==0) {
                    cero++;
                } else {
                    if (matriz[i][j]>0) {
                        mayor0++;
                    } else {
                        menor0++;
                    }
                }
            }
            System.out.println("");
        }//for externo
        
        System.out.println("mayor0 = " + mayor0);
        System.out.println("menor0 = " + menor0);
        System.out.println("cero = " + cero);
    }//main
}
