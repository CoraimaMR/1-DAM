
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 6 may 2026     ⏰ Hora: 12:12:10
 *
 *  Nombre del programa : C1
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
El archivo ‘alumnos_notas.txt’ contiene una lista de alumnos junto con las notas
que han obtenido en cada asignatura. El número de asignaturas de cada alumno es 
variable. Implementa un programa que muestre por pantalla la nota media de cada 
alumno junto a su nombre y apellido, ordenado por nota media de mayor a menor.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C1 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("Documentos/alumnos_notas.txt");
        ArrayList<String> alumnos = new ArrayList<>();
        
        Scanner lector = new Scanner(file); // Abrimos el fichero

        while (lector.hasNextLine()) { // Leemos las lineas 1 a 1
            String linea = lector.nextLine();
            String[] partes = linea.split("\\s+"); // Separo por espacios la linea
            
            String nombre = partes[0] + " " + partes[1];
            double sumaNotas = 0;
            int notasTotales = partes.length - 2;

            // Cuento las notas y las sumo
            for (int i = 2; i < partes.length; i++) {
                sumaNotas += Double.parseDouble(partes[i]);
            }
            double media = sumaNotas / notasTotales; // Hago media

            // Guardamos el alumno
            alumnos.add(String.format("%.2f - %s", media, nombre));
        }
        // Ordenamos la lista de mayor a menor
        Collections.sort(alumnos, Collections.reverseOrder());

        // Mostramos los resultados por pantalla
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println("Nota Media: " + alumnos.get(i));
        }
        
        lector.close(); // Cerramos el fichero

    } //main()

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘