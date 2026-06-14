
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 23 nov 2025     ⏰ Hora: 19:10:51
 *
 *  Nombre del programa : practica43
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Ejercicio 43
Igual que el anterior pero con el número 7. Un número es divisible por 7 si la 
diferencia  entre el número sin su cifra de las unidades y el doble de esa cifra
de las unidades resulta en 0 o un múltiplo de 7. 
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica43 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();

        // Separar cifra de las unidades y el resto del número
        int unidades = n % 10;
        int resto = n / 10;

        // Aplicar la regla: resto - 2 * unidades
        int comprobacion = resto - 2 * unidades;

        // Comprobar divisibilidad por 7
        boolean divisible = (comprobacion % 7 == 0);

        System.out.println("Resultado de la operación (resto - 2*unidades): " + comprobacion);

        if (divisible) {
            System.out.println(n + " ES divisible por 7.");
        } else {
            System.out.println(n + " NO es divisible por 7.");
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘