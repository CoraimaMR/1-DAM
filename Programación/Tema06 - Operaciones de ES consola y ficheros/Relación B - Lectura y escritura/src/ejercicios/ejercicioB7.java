
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 27 abr 2026     ⏰ Hora: 12:39:37
 *
 *  Nombre del programa : ejercicioB7
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crear un programa que abra el archivo ‘primos.dat’ de los ejercicios B2 y B3 y 
añada en él los números primos comprendidos entre el 500 y el 1000.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ejercicioB7 {

    public static void main(String[] args) {
        
        try {
            
            File file = new File("Documentos/primos.dat");
            añadirPrimos(file);
            
        } catch (FileNotFoundException e) { // ERROR de archivo no encontrado
            System.out.println("ERROR DE ARCHIVO NO ENCONTRADO: " + e);
            e.printStackTrace();
        } catch (Exception e) { // ERROR general
            System.out.println("OTRO TIPO DE ERROR: " + e + "\n" + "e");
            e.printStackTrace();
        }
        
    } //main()
    
    public static void añadirPrimos(File archivo) throws FileNotFoundException, IOException {
        if (!archivo.exists()) throw new FileNotFoundException("*** Error en la apertura del archivo ***");
        
        FileWriter fw = new FileWriter(archivo, true); //  Abrimos el archivo en modo de adición: no sobreesribir
        
        for (int i = 501; i < 1000; i++) {
            if (esPrimo(i)) {
                fw.write(i + " ");
            }
        }
        
        fw.close(); // cerramos el FileWriter
        System.out.println("*** Fichero escrito correctamente ***");
        
    } // añadirPrimos(File archivo)
    
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