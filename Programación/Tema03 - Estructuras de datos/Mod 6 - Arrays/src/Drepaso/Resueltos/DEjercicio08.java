/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* RELACIÓN D EJERCICIO 8
Escribe un programa que rellene un array de 20 elementos con números enteros 
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el 
programa mostrará el array y preguntará si el usuario quiere resaltar los 
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el 
array escribiendo los números que se quieren resaltar entre corchetes.

Ejemplo:
159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13

¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): 1
159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 326 223 13

*/

import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class DEjercicio08 {
    public static void main(String[] args) {
        int vector[]=new int[20];
        int opcion, divisor;
        Scanner sc= new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*401);
            System.out.print(vector[i]+"  ");
        }
        System.out.println("");
        
        System.out.print("¿Qué números desea resaltar? "
                + "(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        opcion=sc.nextInt();
        
        if (opcion==1) {
            divisor=5;//Múltiplos de 5
        } else {
            divisor=7;//Múltiplos de 7
        }       
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]%divisor==0) {
                System.out.print("["+vector[i]+"] ");
            }else{
                System.out.print(vector[i]+"  ");
            }                
        }//for
        
        
    }//main
}
