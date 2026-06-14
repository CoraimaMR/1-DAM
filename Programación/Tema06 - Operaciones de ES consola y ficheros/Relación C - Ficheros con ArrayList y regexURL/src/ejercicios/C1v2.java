
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
Haz una copia del ejercicio anterior y añade un menú con las siguientes opciones:
- Añadir líneas al fichero de alumnos.
- Mostrar datos de menor a mayor y guardarlos en un fichero.
- Mostrar datos de mayor a menor y guardarlos en otro fichero.
- Salir.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C1v2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        // Archivo que vamos a mostrar, duplicar ordenadamente y añadir alumnos
        File file = new File("Documentos/alumnos_notas.txt");
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        int scanner;
        
        do {            
            System.out.println("======================= MENU =======================\n" +
                "1 - Añadir líneas al fichero de alumnos.\n" +
                "2 - Mostrar datos de menor a mayor y guardarlos en un fichero.\n" +
                "3 - Mostrar datos de mayor a menor y guardarlos en otro fichero.\n" +
                "4 - Salir.");
            System.out.println("");
            scanner = sc.nextInt();
            sc.nextLine();
            
            switch (scanner) {
                case 1: // OPCIÓN 1: Añadir alumno
                    añadirAlumno(file, sc);
                    break;
                case 2: // OPCIÓN 2: >
                    mostrarLista(true, file);
                    break;
                case 3: // OPCIÓN 3: <
                    mostrarLista(false, file);
                    break;
                case 4: // OPCIÓN 4: Salir
                    System.out.println("Saliendo ...");
                    seguir = false;
                    break;
                default: // OTRA OPCIÓn
                    System.out.println("ERROR. Introduzca un número del 1 al 4.");
            }
            
        } while (seguir == true);
        
    } //main()
    
    public static void añadirAlumno(File file, Scanner sc) throws IOException{
        FileWriter fw = new FileWriter(file, true); //  Abrimos el archivo en modo de adición: no sobreesribir

        System.out.print("Introduzca su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduzca su primer apellido: ");
        String apellido = sc.nextLine();
        fw.write(nombre + " " + apellido);

        boolean seguirNota = true;
        do {
            System.out.print("Introduzca una nota (para salir pon -1): ");
            int n = sc.nextInt();
            if (n == -1) {
                seguirNota = false;
            } else {
                fw.write(" " + n);
            }
        } while (seguirNota == true);
        fw.write("\n");

        fw.close(); // cerramos el FileWriter  
        System.out.println("*** Alumno añadido correctamente ***\n");
    } // añadirAlumno(File file)
    
    public static void mostrarLista(boolean ascendente, File fileCopiar) throws FileNotFoundException, IOException {  
        
        String nombreFile;
        if (ascendente) nombreFile = "ascendente.txt";
        else nombreFile = "descendente.txt";
        
        File filePegar = new File(nombreFile);
        
        FileWriter fw = new FileWriter(filePegar);
        ArrayList<String> alumnos = new ArrayList<>();
        Scanner lector = new Scanner(fileCopiar); // Abrimos el fichero

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
        // Ordenamos la lista 
        if (ascendente) Collections.sort(alumnos);
        else Collections.sort(alumnos, Collections.reverseOrder());

        // Mostramos los resultados por pantalla
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println("Nota Media: " + alumnos.get(i));
            fw.write(alumnos.get(i) + "\n");
        }
        
        fw.close(); // cerramos el FileWriter
        lector.close(); // Cerramos el fichero
        
        System.out.println("*** Fichero escrito correctamente ***\n");

    } // iniciarLista(boolean ascendente)
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘