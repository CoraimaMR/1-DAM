
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 5 may 2026     ⏰ Hora: 10:13:12
 *
 *  Nombre del programa : B12
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Diseña un programa que a partir del archivo documentos.zip, cree en el directorio de trabajo
una carpeta llamada ‘ejercicioB12’. Dentro de ella crearás a su vez dos carpetas. En primer
lugar, la carpeta ‘mates’ la cual contendrá ‘numeros.txt’ y ‘pi-million.txt’, y en segundo lugar
la carpeta ‘lengua’ que contendrá a su vez ‘frases.txt’ y ‘diccionario.txt’. Por último, crearás
dentro de ‘ejercicioB12’ el archivo de texto ‘info.txt’ en el cual guardarás el tamaño y última
fecha de edición del contenido de las carpetas anteriores.
Para facilitar el ejercicio, crea todo el código en una sola clase la cual contendrá el método
‘main’. Además, deberás crear los métodos oportunos para simplificar el programa.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package b12;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Date;

public class B12 {

    public static void main(String[] args) throws IOException {
        
        //CREACIÓN DE CARPETAS
        System.out.println("============= CREACIÓN DE CARPETAS =============");
        creacionCarpeta("ejercicioB12");
        creacionCarpeta("ejercicioB12/mates");
        creacionCarpeta("ejercicioB12/lengua");
        System.out.println(); // Salto de linea
        
        // CREACIÓN ARCHIVO info.txt
        System.out.println("============ CREACIÓN DE ARCHIVOS ============");
        crearArchivo("ejercicioB12/info.txt");
        System.out.println(); // Salto de linea
        
        // DUPLICACIÓN DE ARCHIVOS
        System.out.println("============ DUPLICACIÓN DE ARCHIVOS ============");
        duplicacionFile("Documentos/numeros.txt", "ejercicioB12/mates/numeros.txt");
        duplicacionFile("Documentos/pi-million.txt", "ejercicioB12/mates/pi-million.txt");
        duplicacionFile("Documentos/frases.txt", "ejercicioB12/lengua/frases.txt");
        duplicacionFile("Documentos/diccionario.txt", "ejercicioB12/lengua/diccionario.txt");
        
    } //main()
    
    public static void creacionCarpeta(String ruta) {
        File file = new File(ruta);
        if (file.exists()) {
            System.out.println("***  Carpeta " + file.getName() + " ya estaba creada ***");
        } else {
            file.mkdir();
            System.out.println("***  Carpeta " + file.getName() + " creada correctamente ***");
        }
    } // creacionCarpeta(String ruta)
    
    public static void duplicacionFile(String duplicar, String destino) throws IOException {
        File archivoOriginal = new File(duplicar);
        File newArchivo = new File(destino);
        
        if (newArchivo.exists()) {
            System.out.println("***  Archivo " + newArchivo.getName() + " ya estaba creado ***");
        } else {
            // Copiar el archivo
            Files.copy(archivoOriginal.toPath(), newArchivo.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("*** Copia " + newArchivo.getName() + " creada correctamente ***");
            actualizarInfo(newArchivo);
        }        
    } // duplicacionFile(String duplicar, String destino)
    
    public static void crearArchivo(String ruta) throws IOException {
        File file = new File(ruta);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("*** Archivo " + file.getName() + " creado correctamente ***");
        } else {
            System.out.println("*** Archivo " + file.getName() + " ya estaba creado ***");
        }
    }
    
    public static void actualizarInfo(File f) throws IOException {
        File file = new File("ejercicioB12/info.txt");
        
        FileWriter fw = new FileWriter(file, true); //  Abrimos el archivo en modo de adición: no sobreesribir
        fw.write(f.getName() + " - " + f.length() + " bytes - Ultima Modificación: " + new Date(f.lastModified()) + "\n");
        fw.close(); // cerramos el FileWriter
        System.out.println("*** Fichero " + file.getName() + " actualizado correctamente ***");
    } // actualizarInfo(File f)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘