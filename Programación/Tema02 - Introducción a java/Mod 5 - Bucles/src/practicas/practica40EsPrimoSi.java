
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 14 nov 2025     ⏰ Hora: 17:58:24
 *
 *  Nombre del programa : practica40
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Ejercicio 40
Escribe un programa que muestre por pantalla 100 números enteros separados por un espacio. 
Los números deben estar generados de forma aleatoria en un rango entre 10 y 200 ambos incluidos. 
Los primos deben aparecer entre almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;

public class practica40EsPrimoSi {
    public static void main(String[] args) { 
        
        int numero;
        boolean esPrimo=true;
        
        for (int i = 0; i < 100; i++) {
            numero = (int)(Math.random() * 191) + 10;

            // Comprueba si el número es primo
            for (int j = 2; j <= Math.sqrt(numero); j++) {
              if ((numero % j) == 0) {
                esPrimo = false;
              }
            }

            if (esPrimo) {
              System.out.print("#" + numero + "#  ");
            } else 
                if ((numero % 5) == 0) {// múltiplo de 5
                    System.out.print("[" + numero + "]  ");
                } else {
                    System.out.print(numero + "  ");
            }
        } 
        System.out.println("");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘