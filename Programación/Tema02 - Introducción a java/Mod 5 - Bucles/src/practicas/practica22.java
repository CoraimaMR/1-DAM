
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 5 nov 2025     ⏰ Hora:
 *
 *  Nombre del programa : practica22
 *
 *******************************************************/

/* 22. Realiza un programa que pida un número y construya por pantalla su pirámide.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica22 {

    public static void main(String[] args) {
        
        //Variables
        int num, blancos=0, asteriscos=1;
        
        //Lectura de datos por teclado
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Introduzca un número positivo: ");
        num=sc.nextInt();
        
        //COMPROBACIÓN LECTURA
        if (num<=0) {
            System.out.println("El número ha de ser positivo.");
        }
        else{
            //DIBUJO DE PIRAMIDE
            blancos=num-1;
            for (int i = 1; i <= num; i++) {
                //ESPACIOS EN BLANCO
                for (int j = 1; j <= blancos; j++) {
                    System.out.print(" ");
                }
                //ASTERISCOS
                for (int k = 1; k <= asteriscos; k++) {
                    System.out.print("*"); 
                }
                System.out.println("");
                blancos--;
                asteriscos+=2;
            }
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘