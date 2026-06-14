
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 2 dic 2025     ⏰ Hora: 8:29:24
 *
 *  Nombre del programa : Ejercicio01
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Se desean guardar y representar las notas de 5 alumnos en 4 asignaturas (números
aleatorios con decimales entre 0 y 10) en una matriz. Además, tanto para cada 
asignatura como para cada alumno, se precisa obtener y almacenar la nota máxima,
mínima y la media aritmética.

Diseña una estructura de datos (represéntala primero en un papel) y un algoritmo
adecuado para ello.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Drepaso;

public class Ejercicio01 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        final int ALUMNOS = 5, ASIGNATURAS = 4;
        double maxAlumno = 0, minAlumno = 10, sumaAlumno = 0;
        double maxTotal = 0, minTotal = 10, sumaTotal = 0;
        
        // Iniciamos las matrizes
        double[][] notas = new double[ALUMNOS][ASIGNATURAS];  
        double[][] datosAlumno = new double[ALUMNOS][3];
        
        // Empezamos a crear el interior del programa
        for (int i = 0; i < ALUMNOS; i++) {  // FILAS ALUMNOS i+1
            System.out.println("------- ALUMNO "+(i+1)+" -------");
            System.out.println("NOTAS: ");
            for (int j = 0; j < ASIGNATURAS; j++) {  // COLUMNAS ASIGNATURA j+1
                notas[i][j] = Math.random()*10;  // Asignamos valores randoms
                
                // Mostramos los valores
                System.out.printf("%.2f  ",notas[i][j]);
                
                // Para los datos del alumno
                if (j == 0) {
                    maxAlumno = notas[i][j];
                    minAlumno = notas[i][j];
                    sumaAlumno = notas[i][j];
                } else {
                    if (notas[i][j] > maxAlumno) maxAlumno = notas[i][j];
                    if (notas[i][j] < minAlumno) minAlumno = notas[i][j];
                    sumaAlumno += notas[i][j];
                }
                
                // Para los datos generales
                if (notas[i][j] > maxTotal) maxTotal = notas[i][j];
                if (notas[i][j] < minTotal) minTotal = notas[i][j];
                sumaTotal += notas[i][j];
            }
            // Guardamos en una matriz los datos recolectados del alumno i+1
            for (int j = 0; j < datosAlumno.length; j++) {
                datosAlumno[i][0] = maxAlumno;
                datosAlumno[i][1] = minAlumno;
                datosAlumno[i][2] = sumaAlumno/ASIGNATURAS;
            }
            System.out.println();  // Siguiente linea
        }
        System.out.println();  // Siguiente linea
        // Mostramos datos guardados de las matrizes
        // DE LOS ALUMNOS
        System.out.println("Matriz de datos recolectados del ALUMNO: ");
        System.out.println("----------- MAX - MIN - MEDIA ");
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.printf("ALUMNO %d: ",i+1);
            for (int j = 0; j < datosAlumno[0].length; j++) {
                System.out.printf(" %.2f  ",datosAlumno[i][j]);
            }
            System.out.println();  // Siguiente linea
        }
        // GENERAL
        System.out.println("\nDatos recolectados GENERALES: ");
        System.out.printf("Nota máxima obtenida: %.2f ",maxTotal);
        System.out.printf("\nNota mínima obtenida: %.2f ",minTotal);
        System.out.printf("\nNota media: %.2f ",sumaTotal/(ASIGNATURAS*ALUMNOS));
        System.out.println();  // Siguiente linea
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘