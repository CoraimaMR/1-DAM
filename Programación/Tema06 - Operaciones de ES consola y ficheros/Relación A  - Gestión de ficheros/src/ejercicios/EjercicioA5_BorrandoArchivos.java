/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 21 abr 2026     ⏰ Hora: 8:54:47
 *
 *  Nombre del programa : EjercicioA5_BorrandoArchivos
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Implementa un programa con una función boolean borraTodo(File f) que borre f: Si
no existe lanzará una excepción. Si es un archivo lo borrará. Si es un 
directorio, borrará primero sus archivos y luego el propio directorio (recuerda 
que para poder borrar un directorio debe estar vacío). Devolverá ‘true’ si pudo 
borrar el ‘File f’ (‘false’ si no fué posible). Prueba la función borrando las 
carpetas: ‘Documentos/Fotografias’, ‘Documentos/Libros’ y ‘Documentos’ (es decir,
tres llamadas a la función, en ese orden).
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;
import java.io.FileNotFoundException;

public class EjercicioA5_BorrandoArchivos {

    public static void main(String[] args) {
        
        try {
            // Intentamos borrar en el orden solicitado
            System.out.println("Borrado Fotografias: " + borraTodo(new File("Documentos/Fotografias")));
            System.out.println("Borrado Libros: " + borraTodo(new File("Documentos/Libros")));
            System.out.println("Borrado Documentos: " + borraTodo(new File("Documentos")));
            
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado.");
            e.printStackTrace();
        }

    } //main()
    
    public static boolean borraTodo(File f) throws FileNotFoundException {
        // Si no existe, lanzamos excepción
        if (!f.exists()) {
            throw new FileNotFoundException("El archivo o ruta no existe: " + f.getAbsolutePath());
        }

        // 2. Si es un directorio, vaciamos su contenido primero
        if (f.isDirectory()) {
            File[] contenido = f.listFiles();
            if (contenido != null) {
                for (int i = 0; i < contenido.length; i++) {
                    contenido[i].delete();
                }
            }
        }

        // Borramos el archivo o la carpeta (que ahora ya estará vacía)
        boolean borrado = f.delete();
        
        // Devolvelos los resultados
        return borrado;
    } // borraTodo(File f)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘
