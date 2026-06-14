
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 17 nov 2025     ⏰ Hora: 21:14:14
 *
 *  Nombre del programa : practica03
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que pida diez números reales por teclado, los almacene en un 
array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por 
pantalla.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;
import java.util.Scanner;

public class practica03 {
    public static void main(String[] args) {
        double[] v1;  // Declaro vector
        double max = 0, min = 0;
        
        v1=new double [10];  // Vector de tamaño 10
        
        Scanner sc = new Scanner(System.in);

        // Preguntamos los vectores
        for (int i = 0; i < v1.length; i++) {
            System.out.print("Véctor "+i+". Introduce un número: ");
             v1[i] = sc.nextDouble();      
             System.out.println("");
             
             // Comprobamos cual es max y min
             if (i==0) {
                max=v1[i];
                min=v1[i];
            } else {
                 if (v1[i]>max) max=v1[i];
                 if (v1[i]<min) min=v1[i];
            }
        }
        
        // Mostramos los vectores guardados 
        System.out.println("Valores guardados del vector: v1");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i]+" ");
        }
        System.out.println("");
        
        // Mostramos max y min
        System.out.println("El número máximo guardado es: "+max);
        System.out.println("El número mínimo guardado es: "+min);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘