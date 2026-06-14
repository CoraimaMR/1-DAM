
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 17 nov 2025     ⏰ Hora: 21:32:15
 *
 *  Nombre del programa : practica04
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que pida veinte números enteros por teclado, los almacene en un array y luego 
muestre por separado la suma de todos los valores positivos y negativos.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;
import java.util.Scanner;

public class practica04 {
    public static void main(String[] args) {
         int[] v1;  // Declaro vector
        int sumaPos = 0, sumaNegat = 0;
        
        v1=new int [10];  // Vector de tamaño 10
        
        Scanner sc = new Scanner(System.in);

        // Preguntamos los vectores
        for (int i = 0; i < v1.length; i++) {
            System.out.print("Véctor "+i+". Introduce un número: ");
             v1[i] = sc.nextInt();      
             System.out.println("");
             
             // Comprobamos si es negativo o positivo y sumamos
            if (v1[i]<0) {
                sumaNegat += v1[i];
            } else {
                sumaPos += v1[i];
            }
            }
        
        // Mostramos los vectores guardados 
        System.out.println("Valores guardados del vector: v1");
        for (int i : v1) {
            System.out.print(i+" ");
        }
        System.out.println("");
        
        // Mostramos las sumas
        System.out.println("El número máximo guardado es: "+sumaPos);
        System.out.println("El número mínimo guardado es: "+sumaNegat);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘