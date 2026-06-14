package practicas;
import java.util.Scanner;

/*******************************************************
 * 
 *               💻 PROGRAMACIÓN EN JAVA 💻
 *
 *  Autor/a:     Coraima Mera Rodríguez
 *  Curso:       1º de DAM
 *  Fecha:       3 nov 2025
 *
 *  Programa : practica05
 *
 *******************************************************/

/* 5. Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
Siendo el factorial:
0! = 1
1! = 1
2! = 2 * 1
3! = 3 * 2* 1
N! = N * (N-1) * (N-2)........* 3*2*1 */

public class practica05 {

    public static void main(String[] args) {
        
        //Variables locales
        int n;
        int factorial;
        Scanner sc = new Scanner(System.in);
        
        //Solicito el número y obligo a que no sea negativo
        do {
            System.out.println("Introduce un número no negativo:");
            n = sc.nextInt();
        } while (n<0);
        
        //Inicializo la variable factorial a 1, ya que un factorial nunca puede ser 0.
        factorial=1;
        
        //Calculo el factorial con un  bucle, en el caso de que el número introducido sea mayor o gual que 2. Si es 1 o 2, no entra en el bucle.   
       int i = 1;
       while (i <= n) { 
           factorial = factorial * i; 
           i++;
           }
       
           // Muestro el resultado 
           System.out.println(n + "! = " + factorial);
    }
        
}
