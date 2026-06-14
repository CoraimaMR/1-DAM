
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 18 nov 2025     ⏰ Hora: 9:33:24
 *
 *  Nombre del programa : practica10
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa para realizar cálculos relacionados con la altura (en metros) 
de personas. Pedirá un valor N y luego almacenará en un array N alturas
introducidas por teclado. Luego mostrará la altura media, máxima y mínima así 
como cuántas personas miden por encima y por debajo de la media.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;
import java.util.Scanner;

public class practica10 {

    public static void main(String[] args) {

        // Declaración de variables
        double[] n;
        double suma = 0, media = 0, max = 0, min = 0;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        n = new double[10];
        
        for (int i = 0; i < n.length; i++) {
            // Lectura del vector
            System.out.print("Introduce la altura en  metros de una persona:");
            n[i] = sc.nextDouble();
            
            // Sumamos para despues hacer la media
            suma += n[i];
            
            // Comprobamos cual es max y min
             if (i==0) {
                max=n[i];
                min=n[i];
            } else {
                 if (n[i]>max) max=n[i];
                 if (n[i]<min) min=n[i];
            }
        }
        media = suma/n.length;
        
        // Mostramos los resultado
        System.out.println("-----------------------------------");
        System.out.println("La altura media: "+media);
        System.out.println("La altura máxima: "+max);
        System.out.println("La altura mínima: "+min);
        System.out.println("Alturas por encima de la media");
        for (int i = 0; i < n.length; i++) {
            if (n[i] > media)System.out.print(n[i]+" ");
        }
        System.out.println("");
        System.out.println("Alturas por debajo de la media");
        for (int i = 0; i < n.length; i++) {
            if (n[i] < media)System.out.print(n[i]+" ");
        }
        System.out.println("");
        System.out.println("-----------------------------------");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘