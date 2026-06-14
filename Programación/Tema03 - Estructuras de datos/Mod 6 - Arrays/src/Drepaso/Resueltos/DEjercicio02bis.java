/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
RELACIÓN D - EJERCICIO 2bis
2D. Idem ejercicio anterior, pero preguntando al usuario cuántas posiciones
desea desplazar el vector.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

import java.util.Scanner;
/**
 *
 * @author Jesús Pérez
 */
public class DEjercicio02bis {
    public static void main(String[] args) {
        //Tamaño del vector
        final int N=9;
        
        //Variables
        int temporal=0;
        int posiciones;
        int v[]=new int[N];
        Scanner sc=new Scanner(System.in);
        
        //Pedimos los valores por teclado
        for (int i = 0; i < v.length; i++) {
            System.out.print("Valor "+i+" = ");
            v[i]=sc.nextInt();            
        }//for
        
        //Mostramos los valores originales
        System.out.println("");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+"\t");            
        }
        System.out.println("");
        
        //Preguntamos cuántas veces se desea desplazar el vector
        System.out.println("");
        System.out.print("Indique cuántas posiciones quiere desplazar el vector: ");
        posiciones=sc.nextInt();
        
        //DESPLAZAMIENTO DEL VECTOR
        //Realizaremos los desplazamientos de uno en uno tantas veces como 
        //indique la variable posiciones.
        for (int j = 1; j <= posiciones ; j++) {
                  
            //Guardamos el valor final en una variable temporal
            temporal=v[N-1];
            //Recorremos el vector desde el último hacia atrás parando en índice 1
            //Asignamos a cada posición la anterior
            for (int i = v.length-1; i >0; i--) {
                v[i]=v[i-1];           
            }
            //Asignamos el último número guardado en una variable temporal, a la primera posición
            v[0]=temporal;
         }//for externo
        
        //Mostramos el vector desplazado
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+"\t");            
        }
        
    }//main
 
}
