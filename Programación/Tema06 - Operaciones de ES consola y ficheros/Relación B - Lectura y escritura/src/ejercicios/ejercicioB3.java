
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 23 abr 2026     ⏰ Hora: 13:06:36
 *
 *  Nombre del programa : ejercicioB3
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Realiza un programa que lea el fichero creado en el ejercicio anterior y que 
muestre los números por pantalla.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ejercicioB3 {

    public static void main(String[] args) {
        
        try {
          File archivo = new File("Documentos/primos.dat");
          mostrarContenido(archivo);
        } catch (FileNotFoundException e) { // ERROR de archivo no encontrado
            System.out.println("ERROR DE ARCHIVO NO ENCONTRADO: " + e);
            e.printStackTrace();
        } catch (Exception e) { // ERROR general
            System.out.println("OTRO TIPO DE ERROR: " + e);
            e.printStackTrace();
        }       

    } //main()
    
    public static void mostrarContenido(File archivo) throws FileNotFoundException {
        if (!archivo.exists()) throw new FileNotFoundException("*** Error en la apertura del archivo ***");
        
        Scanner lector = new Scanner(archivo); // Abrimos el fichero        
        
        // Mostramos contenido
        while (lector.hasNext()) {
            System.out.print(lector.next() + " ");
        }
        System.out.println("");
        
        lector.close(); // Cerramos el fichero
        
    } // mostrarContenido(File archivo)
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘