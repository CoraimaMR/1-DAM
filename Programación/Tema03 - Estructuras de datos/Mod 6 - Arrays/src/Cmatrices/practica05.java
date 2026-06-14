
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 26 nov 2025     ⏰ Hora: 13:11:59
 *
 *  Nombre del programa : practica05
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por 
teclado la información de N personas distintas (valor también introducido por 
teclado). Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su 
sueldo. Esta información debe guardarse en una única matriz. Luego se mostrará 
por pantalla el sueldo medio de cada género.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Cmatrices;
import java.util.Scanner;

public class practica05 {

    public static void main(String[] args) {

        // Declaración de variables
        int n;
        int sumaHombre = 0, sumaMujer = 0;
        int numHombres = 0, numMujeres = 0;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el número de personas:");
        n = sc.nextInt();
        
        int matriz[][] = new int[n][2];  // Matriz de tamaño F/C
        
        // Empezamos a crear el interior del programa
        for (int i = 0; i < matriz.length; i++) {

            System.out.println("Persona " + (i + 1));

            // Columna 0 → género
            System.out.print("¿De qué género es? (0 varón, 1 mujer): ");
            matriz[i][0] = sc.nextInt();

            // Columna 1 → sueldo
            System.out.print("¿Cuál es su sueldo?: ");
            matriz[i][1] = sc.nextInt();

            // Acumulación de datos
            if (matriz[i][0] == 0) {            // Hombre
                sumaHombre += matriz[i][1];
                numHombres++;
            } else if (matriz[i][0] == 1) {     // Mujer
                sumaMujer += matriz[i][1];
                numMujeres++;
            }
        }

        //Mostramos sus valores por pantalla
        for (int i = 0; i < matriz.length; i++) {  // FILA
            for (int j = 0; j < matriz[0].length; j++) {  // COLUMNA
                System.out.print(matriz[i][j]+"\t");               
            }
            System.out.println("");
        }
        // SUELDOS MEDIOS
        System.out.println("Sueldo medio de los varones: "+sumaHombre/numHombres);
        System.out.println("Sueldo medio de los mejeres: "+sumaMujer/numMujeres);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘