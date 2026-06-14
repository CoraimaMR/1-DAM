
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 28 abr 2026     ⏰ Hora: 8:46:47
 *
 *  Nombre del programa : ejercicioB10
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un método que permita eliminar todas las ocurrencias de una palabra dada en
un fichero de texto. Este código producirá un nuevo fichero llamado 
‘nombre_2.ext’
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicioB10 {

    public static void main(String[] args) {
        
        // Lectura y comprobación de datos introducidos por teclado
            Scanner sc = new Scanner(System.in);
            String fichero;
            String palabra;
        
        try {         
            
            System.out.print("Introduzca un palabra a buscar: ");
            palabra = sc.nextLine();
            
            System.out.print("Introduzca el fichero donde buscar: ");
            fichero = sc.nextLine();
            File file = new File(fichero);
            
            crearFichero(file, palabra);
        
        } catch (FileNotFoundException e) { // ERROR de archivo no encontrado
            System.out.println("ERROR DE ARCHIVO NO ENCONTRADO: " + e);
            e.printStackTrace();
        } catch (InputMismatchException e) { // ERROR de tipo de dato
            System.out.println("ERROR DE TIPO DE DATO: " + e);
            e.printStackTrace();
        } catch (Exception e) { // ERROR general
            System.out.println("OTRO TIPO DE ERROR: " + e);
            e.printStackTrace();
        }
        
    } //main()
    
    public static void crearFichero(File archivoOriginal, String palabra) throws FileNotFoundException, IOException {
        if (!archivoOriginal.exists()) throw new FileNotFoundException("*** Error en la apertura del archivo ***");
        
        // Generar el nuevo nombre
        String directorio = archivoOriginal.getParent();    // Carpeta donde está
        String nombre = archivoOriginal.getName();          // Nombre del archivo
        String nombreSplit[] = nombre.split("\\.");
        String newRuta;                                     // Ruta del archivo

        if (directorio != null) {
            // Si tiene carpeta superior, la concatenamos
            newRuta = directorio + File.separator + nombreSplit[0] + "_2.ext";
        } else {
            // Si no tiene (está en la carpeta del proyecto), solo el nombre
            newRuta = nombreSplit[0] + "_2.ext";
        }
        File newArchivo = new File(newRuta);
        newArchivo.createNewFile();       
        
        System.out.println("*** Copia creada con éxito: " + newRuta + " ***");
        
        FileWriter fw = new FileWriter(newArchivo); //  Sobreesribir
        Scanner lector = new Scanner(archivoOriginal); // Abrimos el fichero

        while (lector.hasNextLine()) {
            String linea = lector.nextLine();
            linea = lector.nextLine().replaceAll(" "  + palabra + " ", " ");
            fw.write(linea + "\n");
        }
        
        lector.close(); // Cerramos el fichero
        fw.close(); // cerramos el FileWriter
        
        System.out.println("*** Fichero escrito correctamente ***");
        
    } // crearFichero(String scanner)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘