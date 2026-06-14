
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 21 abr 2026     ⏰ Hora: 9:05:48
 *
 *  Nombre del programa : EjercicioA3_RenombrandoDirectoriosYFicheros
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Implementa un programa que haga lo siguiente:
● Cambiar el nombre de la carpeta ‘Documentos’ a ‘DOCS’, el de la carpeta 
‘Fotografias’ a ‘FOTOS’ y el de la carpeta ‘Libros’ a ‘LECTURAS’
● Cambiar el nombre de todos los archivos de las carpetas FOTOS y LECTURAS 
quitándole la extensión. Por ejemplo, ‘astronauta.jpg’ pasará a llamarse 
‘astronauta’.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;

public class EjercicioA3_RenombrandoDirectoriosYFicheros {

    public static void main(String[] args) {

         // 1. Renombrar las carpetas
        System.out.println("=== CAMBIOS DE NOMBRES ===");
        renombrarCarpeta("Documentos", "DOCS");
        renombrarCarpeta("DOCS/Fotografias", "DOCS/FOTOS");
        renombrarCarpeta("DOCS/Libros", "DOCS/LECTURAS");

        // 2. Quitar extensiones en FOTOS y LECTURAS
        System.out.println("\n=== EXTENSIONES QUITADAS ===");
        quitarExtensiones("DOCS/FOTOS");
        quitarExtensiones("DOCS/LECTURAS");

    } //main()

    public static void renombrarCarpeta(String nombreActual, String nombreNuevo) {
        File carpeta = new File(nombreActual);
        if (carpeta.exists() && carpeta.isDirectory()) {
            boolean exito = carpeta.renameTo(new File(nombreNuevo));
            if (exito) {
                System.out.println("Carpeta '" + nombreActual + "' renombrada a '" + nombreNuevo + "'");
            }
        } else {
            System.out.println("La carpeta '" + nombreActual + "' no existe.");
        }
    } // renombrarCarpeta(String nombreActual, String nombreNuevo)

    public static void quitarExtensiones(String nombreCarpeta) {
        File directorio = new File(nombreCarpeta);
        
        if (directorio.exists() && directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();

            if (archivos != null) {
                for (int i = 0; i < archivos.length; i++) {
                    File archivo = archivos[i];
                    
                    if (archivo.isFile()) {
                        String nombreConExtension = archivo.getName();
                        
                        // Buscamos el último punto para separar la extensión
                        int indicePunto = nombreConExtension.lastIndexOf(".");
                        
                        if (indicePunto > 0) { // Si tiene extensión
                            String nombreSinExtension = nombreConExtension.substring(0, indicePunto);
                            File nuevoNombre = new File(directorio, nombreSinExtension);
                            
                            if (archivo.renameTo(nuevoNombre)) {
                                System.out.println("En " + nombreCarpeta + " - Renombrado: " + nombreConExtension + " -> " + nombreSinExtension);
                            }
                        }
                    }
                }
            }
        }
    } // quitarExtensiones(String nombreCarpeta)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘
