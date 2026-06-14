
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 7 nov 2025     ⏰ Hora: 17:49:01
 *
 *  Nombre del programa : practica03
 *
 *******************************************************/

/* 3. Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Esta vez
utiliza un contador sumando de 1 en 1.   */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;

public class practica03 {
    public static void main(String[] args) {
        
        for (int i = 2; i <= 200; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
        
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘