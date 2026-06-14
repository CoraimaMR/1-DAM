
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 22 abr 2026     ⏰ Hora: 13:08:51
 *
 *  Nombre del programa : ejercicioB1
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Implementa un programa que muestre por pantalla los valores máximos y mínimos 
del archivo ‘numeros.txt’.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ejercicioB1 {

    public static void main(String[] args) {

        try {
          // Intentamos abrir el fichero
          File archivo = new File("Documentos/numeros.txt");
          mostrarValores(archivo);  
        } catch (FileNotFoundException e) { // ERROR de archivo no encontrado
            System.out.println("ERROR DE ARCHIVO NO ENCONTRADO: " + e);
            e.printStackTrace();
        }catch (Exception e) { // ERROR general
        System.out.println("OTRO TIPO DE ERROR: " + e);
            e.printStackTrace();
        }        

    } //main()

    private static void mostrarValores(File archivo) throws FileNotFoundException {
        if (!archivo.exists()) throw new FileNotFoundException("*** Error en la apertura del archivo ***");
        
        int n;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        Scanner lector=new Scanner (archivo); // Abrimos el fichero
        
        while (lector.hasNext()) {
            n = lector.nextInt();
            if (n < min) min = n;
            if (n > max) max = n;
        }
        
        lector.close(); // Cerramos el fichero
        
        // Mostramos los resultados
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
        
    } // mostrarValores(File archivo)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘