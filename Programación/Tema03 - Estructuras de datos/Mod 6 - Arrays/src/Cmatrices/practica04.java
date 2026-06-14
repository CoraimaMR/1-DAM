
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 26 nov 2025     ⏰ Hora: 13:11:26
 *
 *  Nombre del programa : practica04
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados 
“Alumno1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas 
por teclado y luego el programa mostrará la nota mínima, máxima y media de cada 
alumno.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Cmatrices;
import java.util.Scanner;

public class practica04 {

    public static void main(String[] args) {

        // Declaración de variable
        int min = 0, max = 0, suma = 0;
        final int ALUMNOS = 4, ASIGNATURAS = 5;  // CONSTANTES
        
        int matriz[][]=new int[ALUMNOS][ASIGNATURAS];  // Tamaño de la matriz F/C
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Notas del Alumno "+(i+1));
            for (int j = 0; j <= matriz.length; j++) {
                System.out.print("Introduce la nota para la asignatura"+(j+1)+":");
                matriz[i][j] = sc.nextInt();
                if (j==0) {
                    min = matriz[i][j];
                    max = matriz[i][j];
                    suma = matriz[i][j];
                } else {
                    if (matriz[i][j]<min) min=matriz[i][j];
                    if (matriz[i][j]>max) max=matriz[i][j];
                    suma+=matriz[i][j];
                }
                
                // Mostramos los resultados
                if (j==matriz.length) {
                System.out.println("------------------------------");
                System.out.println("Alumno "+(i+1));
                System.out.println("Media de las notas: "+suma/ASIGNATURAS);
                System.out.println("Nota máxima del alumno: "+max);
                System.out.println("Nota mínima del alumno: "+min);
                System.out.println("------------------------------");
                }
            }
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘