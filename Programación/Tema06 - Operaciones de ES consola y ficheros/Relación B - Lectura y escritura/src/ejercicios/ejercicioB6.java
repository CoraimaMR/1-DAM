
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 24 abr 2026     ⏰ Hora: 8:42:10
 *
 *  Nombre del programa : ejercicioB5
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Escribe un programa que guarde en un fichero el contenido de otros dos ficheros, 
de tal forma que en el fichero resultante aparezcan las líneas de los primeros 
dos ficheros mezcladas, es decir, la primera línea será del primer fichero, la 
segunda será del segundo fichero, la tercera será la siguiente del primer 
fichero, etc.
Los nombres de los dos ficheros origen y el nombre del fichero destino se deben 
pasar como argumentos en la línea de comandos. Hay que tener en cuenta que los 
ficheros de donde se van cogiendo las líneas pueden tener tamaños diferentes.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicioB6 {

    public static void main(String[] args) {

        try {
            // Ficheros origen
            File file1 = new File("Documentos/usa_nombres.txt");
            File file2 = new File("Documentos/usa_apellidos.txt");
//            File destino = new File("Documentos/usa_personas.txt");
            File destino = new File("Documentos/prueba.txt");
            
            mezclarFicheros(file1, file2, destino);

            System.out.println("Fichero creado correctamente");
        } catch (FileNotFoundException e) { // ERROR de archivo no encontrado
            System.out.println("ERROR DE ARCHIVO NO ENCONTRADO: " + e);
            e.printStackTrace();
        } catch (IOException e) { // ERROR de entrada o salida de texto
            System.out.println("ERROR EN LA ENTRADA O SALIDA DE TEXTO: " + e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
            e.printStackTrace();
        }

    } //main()

    private static void mezclarFicheros(File file1, File file2, File destino) throws IOException, FileNotFoundException {
        if (!destino.exists()||!file1.exists()||!file2.exists()) throw new FileNotFoundException("*** Error en la apertura del archivo ***");
        
        // Abrimos ficheros
        Scanner f1 = new Scanner(file1);
        Scanner f2 = new Scanner(file2);
        FileWriter f0 = new FileWriter(destino); // sin append: sobreescribir
        
        String completo = "";
        String temporal1 = "";
        String temporal2 = "";
            
        // Mientras haya líneas en alguno
        while (f1.hasNextLine() && f2.hasNextLine()) {
            // Leer de fichero 1
            if (f1.hasNextLine()) temporal1 = f1.nextLine() + " ";
                else temporal1 = "";
            // Leer de fichero 2
            if (f2.hasNextLine()) temporal2 = f2.nextLine() + "\n";
                else temporal1 = "";
            completo = completo + temporal1 + temporal2;
        }
        f0.write(completo);
        
        // Cerramos ficheros
        f1.close();
        f2.close();
        f0.close();
    }

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘