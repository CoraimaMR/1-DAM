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
 *  Programa :   practica11 CORREGIDO
 *
 *******************************************************/

/* 11. Realiza un programa que sume independientemente los pares y los impares de los números
comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas. */

public class practica11 {

    public static void main(String[] args) {

        //Variables locales
        Scanner sc = new Scanner(System.in);
        int n;
        int par=0,impar=0;
      
        for (int i = 0; i < 3; i++) {
           System.out.println("Introduce un valor (100-200):");
            n = sc.nextInt();
            
            if (n>=100&&n<=200) {
               if (n%2==0) {
                par=par+n;
            } else {
                impar=impar+n;
            } 
            } else {
                System.out.println("ERROR. El número no esta en el intervalo.");
            }
            
        }
        
        System.out.println("La suma de los números pares: "+par);
        System.out.println("La suma de los números impares: "+impar);
    } 
}
