
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 7 nov 2025     ⏰ Hora: 17:58:29
 *
 *  Nombre del programa : practica09
 *
 *******************************************************/

/* 9. Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros números
naturales.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;

public class practica09 {
    public static void main(String[] args) {

        // Declaración de variables
        int suma = 0;
        
        // Empezamos a crear el interior del programa
        for (int i = 1; i <= 10; i++) {
            suma=i+suma;
        }
        System.out.println(suma);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘