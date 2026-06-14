
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
Crear un programa que solicite al usuario el nombre de un archivo de texto y 
cree una copia exacta de él con nombre “copia_de_XXXXX”.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class ejercicioB5_CopiaFichero {

    public static void main(String[] args) {
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        try {
            
            System.out.print("Introduzca la ruta del archivo: ");
            String rutaArchivo = sc.nextLine();
            
            File file = new File(rutaArchivo);
            crearCopia(file);
            
        } catch (FileNotFoundException e) { // ERROR de archivo no encontrado
            System.out.println("ERROR DE ARCHIVO NO ENCONTRADO: " + e);
            e.printStackTrace();
        } catch (IOException e) { // ERROR de entrada o salida de texto
            System.out.println("ERROR EN LA ENTRADA O SALIDA DE TEXTO: " + e);
            e.printStackTrace();
        } catch (Exception e) { // ERROR general
            System.out.println("OTRO TIPO DE ERROR: " + e);
            e.printStackTrace();
        }

    } //main()
    
    public static void crearCopia(File archivoOriginal) throws FileNotFoundException, IOException {
        if (!archivoOriginal.exists()) throw new FileNotFoundException("*** Error en la apertura del archivo ***");
        
        // Generar el nuevo nombre ("copia_de_...")
        String directorio = archivoOriginal.getParent();    // Carpeta donde está
        String nombre = archivoOriginal.getName();          // Nombre del archivo
        String newRuta;                                     // Ruta del archivo

        if (directorio != null) {
            // Si tiene carpeta superior, la concatenamos
            newRuta = directorio + File.separator + "copia_de_" + nombre;
        } else {
            // Si no tiene (está en la carpeta del proyecto), solo el nombre
            newRuta = "copia_de_" + nombre;
        }
        File newArchivo = new File(newRuta);
        
        // Copiar el archivo
        Files.copy(archivoOriginal.toPath(), newArchivo.toPath(), StandardCopyOption.REPLACE_EXISTING);
            
        System.out.println("*** Copia creada con éxito: " + newRuta + " ***");
        
    } // crearCopia(File archivo)
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘