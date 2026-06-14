
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 17 nov 2025     ⏰ Hora: 21:39:24
 *
 *  Nombre del programa : practica05
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que pida veinte números reales por teclado, los almacene en un array y luego lo 
recorra para calcular y mostrar la media: (suma de valores) / nº de valores. 
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;
import java.util.Scanner;

public class practica05 {
    public static void main(String[] args) {
        int[] v1;  // Declaro vector
        int suma = 0;
        
        v1=new int [20];  // Vector de tamaño 10
        
        Scanner sc = new Scanner(System.in);

        // Preguntamos los vectores
        for (int i = 0; i < v1.length; i++) {
            System.out.print("Véctor "+i+". Introduce un número: ");
             v1[i] = sc.nextInt();      
             System.out.println("");
             suma += v1[i];  // Sumamos los vectores
            }
        
        // Mostramos los vectores guardados 
        System.out.println("Valores guardados del vector: v1");
        for (int i : v1) {
            System.out.print(i+" ");
        }
        System.out.println("");
        
        // Mostramos la media
        System.out.println("La media del vector es: "+suma/v1.length);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘