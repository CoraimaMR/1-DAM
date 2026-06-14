
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 10 nov 2025     ⏰ Hora: 12:18:38
 *
 *  Nombre del programa : practica30
 *
 *******************************************************/

/* Ejercicio 30 
Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados 
por espacios.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;

public class practica30 {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            System.out.print((int) (Math.random()*11)+" ");
        }
        System.out.println("");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘