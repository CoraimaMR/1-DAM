
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 5 nov 2025     ⏰ Hora:
 *
 *  Nombre del programa : practica23
 *
 *******************************************************/

/* Continuando con el ejercicio 22, realiza un programa que pida un número y construya por
pantalla su pirámide hueca.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica23Piramide {

    public static void main(String[] args) {

        //Variables
        int n, asterisco=1, fuera, dentro=1;
        
        //Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un número positivo: ");
        n=sc.nextInt();
        
        //COMPROBACIÓN
        if (n<=0) {
            System.out.println("El número ha de ser positivo.");
        }
        else{
            //CODIGO PIRAMIDE
            fuera=n-1;
            //LINAS
            for (int i = 1; i <= n; i++) {
                //ESPACIOS EN BLANCO AFUERA
                for (int j = 1; j <= fuera; j++) {
                    System.out.print(" ");
                }
                //ASTERISCOS
                if (i==1 || i==n) {
                    //ASTERISCOS CASO PRIMERO  Y ULTIMO
                    for (int k = 1; k <= asterisco; k++) {
                        System.out.print("*");
                    }
                } else {
                    //ASTERISCOS OTROS CASOS + ESPACIOS EN BLANCO DENTRO
                    System.out.print("*");
                    for (int m = 3; m <= dentro; m++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println(" ");
                fuera--;
                asterisco=(n*2)-1;
                dentro=dentro+2;
            }
            }
            }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘