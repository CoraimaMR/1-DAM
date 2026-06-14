
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 17 nov 2025     ⏰ Hora: 21:08:09
 *
 *  Nombre del programa : practica02
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que pida diez números reales por teclado, los almacene en un 
array, y luego muestre la suma de todos los valores
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;
import java.util.InputMismatchException;
import java.util.Scanner;

public class practica02 {
    public static void main(String[] args) {
        double[] v1;  // Declaro vector
        int sumaTotal = 0;
        boolean fallo = false;
        
        v1=new double [10];  // Vector de tamaño 10
        
        Scanner sc = new Scanner(System.in);

        // Preguntamos vectores
        for (int i = 0; i < v1.length; i++) {
             do {         
                 fallo = false;
                try {
                    System.out.print("Véctor "+i+". Introduce un número: ");
                    v1[i] = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Valor no válido, tipo de excepción " + e.toString());                
                    sc.nextLine();
                    fallo = true;
                }
            } while (fallo);
            
        }
        
        // Sumamos vectores
        for (int i = 0; i < v1.length; i++) {
            sumaTotal += v1[i];
        }
        
        // Mostramos resultado
        System.out.println("La suma total de los vectores es: "+sumaTotal);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘