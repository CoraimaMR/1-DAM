
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 7 may 2026     ⏰ Hora: 13:17:25
 *
 *  Nombre del programa : C2
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Implementa un programa que pida al usuario un nombre de archivo A para lectura y
otro nombre de archivo B para escritura. Leerá el contenido del archivo A (por 
ejemplo ‘usa_personas.txt’) y lo escribirá ordenado alfabéticamente en B (por 
ejemplo ‘usa_personas_sorted.txt’).
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

public class C2 {

    public static void main(String[] args) {
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        try {
            
            // Preguntamos los archivos
            System.out.print("Introduzca el nombre del archivo:  ");
            String scanner = sc.nextLine();
            
            if (!validarFile(scanner)) {
                throw new IOException("Nombre de archivo no válido");
            }
            
            File file = new File(scanner);
            
            dupicarOrdenado(file);
        
        } catch (FileNotFoundException e) { // ERROR de archivo no encontrado
            System.out.println("ERROR DE ARCHIVO NO ENCONTRADO: " + e);
        } catch (IOException e) { // ERROR de entrada o salida de texto
            System.out.println("ERROR EN LA ENTRADA O SALIDA DE TEXTO: " + e);
        } catch (Exception e) { // ERROR general
            System.out.println("OTRO TIPO DE ERROR: " + e);
        }
        
    } //main()
    
    public static void dupicarOrdenado(File fileA) throws FileNotFoundException, IOException {
        // Si no encuentra agun archivo
        if (!fileA.exists()) throw new FileNotFoundException("*** Error de apertura del archivo ***");
        
        String[] nombreFileA = fileA.getName().split("\\.");
        String nombreFileB = nombreFileA[0] + "_sorted.txt";
        File fileB = new File(nombreFileB);
        
        FileWriter fw = new FileWriter(fileB);
        Scanner lector = new Scanner(fileA); 
        
        ArrayList<String> frases = new ArrayList<>();
        while (lector.hasNextLine()) {
            String linea = lector.nextLine();
            frases.add(linea);
        }
        
        Collections.sort(frases); // Ordeno alfabeticamente las frases
        
        // Escribimos lo conseguido
        for (int i = 0; i < frases.size(); i++) {
            fw.write(frases.get(i) + "\n");
        }
        
        lector.close(); // Cerramos el fichero
        fw.close(); // cerramos el FileWriter
        System.out.println("*** Fichero escrito correctamente ***");
        
    } // dupicarOrdenado(File fileA)
    
    public static boolean validarFile(String file) {
        return file.matches("^[a-zA-Z0-9_\\-\\/]+\\.txt$");
    } // validarFile(String file)
  
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘