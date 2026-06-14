/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
RELACIÓN D - EJERCICIO 2
2D. Escribe un programa que contenga un vector de tamaño N definido por una 
constante. A continuación, lee N números por teclado y almacénalos en dicho 
vector. A continuación, desplaza los elementos de manera que el de la posición 0 
pase a la posición 1, el de la posición 1 a la 2, etc. El número que se encuentra 
en la posición final debe pasar a la número 0. Muestra por pantalla el resultado 
inicial y el final. Utiliza un solo vector para todo el proceso.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

import java.util.Scanner;
/**
 *
 * @author Jesús Pérez
 */
public class DEjercicio02 {
    public static void main(String[] args) {
        //Tamaño del vector
        final int N=9;
        
        //Variables
        int ultimo=0;
        int v[]=new int[N];
        Scanner sc=new Scanner(System.in);
        
        for (int i = 0; i < v.length; i++) {
            System.out.print("Valor "+i+" = ");
            v[i]=sc.nextInt();            
        }//for
        
        //Mostramos los valores originales
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+"\t");            
        }
        System.out.println("");
        
        //DESPLAZAMIENTO DEL VECTOR
        //Guardamos el valor final en una variable temporal
        ultimo=v[N-1];
        //Recorremos el vector desde el último hacia atrás parando en índice 1
        //Asignamos a cada posición la anterior
        for (int i = v.length-1; i >0; i--) {
            v[i]=v[i-1];           
        }
        //Asignamos el último número guardado en una variable temporal, a la primera posición
        v[0]=ultimo;
        
        //Mostramos el vector desplazado
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+"\t");            
        }
        
    }//main
 
}
