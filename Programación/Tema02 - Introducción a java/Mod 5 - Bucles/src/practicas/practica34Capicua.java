
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 11 nov 2025     ⏰ Hora: 8:39:51
 *
 *  Nombre del programa : practica34
 *
 *******************************************************/

/* Ejercicio 34 
Escribe un programa que diga si un número introducido por teclado es o no capicúa. 
Los números capicúa se leen igual hacia delante y hacia atrás. */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica34Capicua {

    public static void main(String[] args) {

        // Declaración de variables
        long n, copia, alReves;
        
        // Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número:");
        n = sc.nextInt();
        
        // Empezamos a crear el interior del programa
        copia=n;
        alReves=0;
        
        while (copia>0) {
            alReves= (alReves*10)+copia%10;
            copia/=10;
            System.out.println(copia+"      "+alReves);
        }
        
        System.out.println("alReves = " + alReves);
        
        if(n==alReves){
            System.out.println("El número "+n+" es capicúa");
        }
        else{
            System.out.println("El número "+n+" NO es capicúa");
        }

        
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘