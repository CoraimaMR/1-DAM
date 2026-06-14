
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 22 abr 2026     ⏰ Hora: 14:05:15
 *
 *  Nombre del programa : ejerciciosB2
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Escribe un programa que guarde en un fichero con nombre ‘primos.dat’ los números
primos que hay entre 1 y 500.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ejercicioB2 {

    public static void main(String[] args) {
        
        try {
          File archivo = new File("Documentos/primos.dat");
          archivo.delete(); // RESET DEL ARCHIVO
          FileWriter fw = new FileWriter(archivo,true); //  Abrimos el archivo en modo de adición 
          
          for (int i = 2; i <= 500; i++) {
            if (esPrimo(i)) { // SI es PRIMO
            fw.write(i + " "); // Escribimos el número seguido de un espacio
            }
          }
          
          fw.close(); // cerramos el FileWriter
          System.out.println("*** Fichero escrito correctamente ***");
          
        }catch (IOException e) { // ERROR de entrada o salida de texto
          System.out.println("ERROR EN LA ENTRADA O SALIDA DE TEXTO: " + e);
            e.printStackTrace();
        } catch (Exception e) { // ERROR general
            System.out.println("OTRO TIPO DE ERROR: " + e);
            e.printStackTrace();
        }

    } //main()

    private static boolean esPrimo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;    
    } // esPrimo(int i)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘