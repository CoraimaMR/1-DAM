/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Recursividad;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------
Calcula el factorial de un número mediante un algoritmo recursivo
*/


/*------------------------------- CONCEPTOS ------------------------------------
- Una función recursiva es aquella que se invoca a sí misma
- Tiene que contener un caso base: 
    - El cual, impedirá que se llame infinitamente.
    - Estará formado por una sentencia if + condición.
- Para conseguir problemas cada vez más pequeños, los datos de entrada deben
tender al caso base. Conceptualmente, los argumentos de la nueva llamada deben
ser de un menor tamaño que en la función desde la que se hace la llamada.
*/

/**
 * @author Jesús Pérez 
 */
public class Ejemplo {

    public static void main(String[] args) {
        int n, f;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número entero no negativo: ");
        n=sc.nextInt();
        
        if (n<0) {
            System.out.println("Lo siento, el número es negativo");
        } else {
            System.out.println("El factorial de "+n+" es "+factorial(n));
                       
        }
    }//main
    
public static long factorial(int n){
    long resultado;
    if (n==0){ //caso base: el factorial de 0 es 1
        resultado=1;
    }else{
        resultado=n*factorial(n-1); //llamada recursiva: el factorial de n es 
                                    //igual a n*factorial de n-1
    }
    return resultado;
}//factorial()

}//class