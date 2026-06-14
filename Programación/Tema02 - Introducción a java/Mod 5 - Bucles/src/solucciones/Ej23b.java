/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej23b;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------

*/

/**
 * @author Jesús Pérez 
 */
public class Ej23b {

    public static void main(String[] args) {
        int num, blancos=0, asteriscos=1;
        int i, j, k;
        
        Scanner sc=new Scanner (System.in);
        
        //Pedimos el número por teclado
        System.out.println("Introduzca un número positivo: ");
        num=sc.nextInt();
        
        //Si el número no es mayor que 0, informamos y finalizamos el programa
        if (num<=0) {
            System.out.println("El número ha de ser positivo.");
        }
        else{
            
            //En la primera línea, el número de espacios en blanco es igual al
            //número introducido por teclado.
            blancos=num;
            
            //Hacemos un bucle for desde 1 hasta el número de filas - 1
            //ya que la última estará llena completamente de *
            for (i = 1; i < num; i++) {
                
                //BUCLE BLANCOS
                //Primero imprimimos los blancos, empezando por 1 y terminando
                //en el tope indicado en la variable blancos
                for ( j = 1; j < blancos; j++) {
                    System.out.print(" ");
                }
                
                //BUCLE ASTERISCOS
                //Ahora imprimimos los asteriscos. En cada fila el número de 
                //asteriscos es igual al doble del número de fila menos 1
                for (k = 1; k <= asteriscos; k++) {
                    if (k==1||k==asteriscos) {
                        System.out.print("*"); 
                    } else {
                        System.out.print(" ");
                    }
                    
                }
                
                //Imprimimos un salto de línea para generar una fila nueva
                System.out.println("");
                
                //Decrementamos la variable blancos, ya que en la próxima fila
                //habrá un espacio en blanco menos.
                blancos--;
                
                //Sumamos 2 al número de asteriscos, ya que en cada fila hay dos
                //asteriscos más.
                asteriscos+=2;
            }//for externo
            
            //Pinto la última fila
            for (int l = 0; l < 2*num-1; l++) {
                System.out.print("*");
            }//for última fila
            System.out.println("");
        }//else
        
    }//main

}//class
