
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 23 abr 2026     ⏰ Hora: 13:08:39
 *
 *  Nombre del programa : ejercicioB4
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Implementa un programa que pida al usuario un número de cualquier longitud, como
por ejemplo “1234”, y le diga al usuario si dicho número aparece en el primer 
millón de decimales del nº pi (están en el archivo ‘pi-million.txt’). No está 
permitido utilizar ninguna librería ni clase ni método que realice la búsqueda. 
Debes implementar el algoritmo de búsqueda tú.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicioB4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        
        try {
            File file = new File("Documentos/pi-million.txt");
            
            System.out.print("Introduzca un número: ");
            n = sc.nextInt();           
            
            // Mostramos resultados
            System.out.print("El número " + n);
            if (busqueda(file, n)) {
                System.out.println(" está en el archivo ‘pi-million.txt’");
            } else {
                
            }            
        
        } catch (FileNotFoundException e) { // ERROR de archivo no encontrado
            System.out.println("ERROR DE ARCHIVO NO ENCONTRADO: " + e + "\n" + "e");
            e.printStackTrace();
        } catch (InputMismatchException e) { // ERROR de tipo de dato
            System.out.println("ERROR DE TIPO DE DATO: " + e + "\n" + "e");
            e.printStackTrace();
        } catch (Exception e) { // ERROR general
            System.out.println("OTRO TIPO DE ERROR: " + e + "\n" + "e");
            e.printStackTrace();
        }

    } //main()

    public static boolean busqueda(File archivo, int n) throws FileNotFoundException {
        if (!archivo.exists()) throw new FileNotFoundException("*** Error en la apertura del archivo ***");
        
        String buscado = String.valueOf(n);
        int longitudBuscado = buscado.length();

        Scanner lector = new Scanner(archivo);

        while (lector.hasNextLine()) {
            String linea = lector.nextLine();

            // Recorremos la línea hasta donde el "trozo" restante sea igual al tamaño del número
            for (int i = 0; i <= linea.length() - longitudBuscado; i++) {
                // Extraemos el fragmento y comparamos
                if (linea.substring(i, i + longitudBuscado).equals(buscado)) {
                    return true;
                }
            }
        }        
        lector.close();
        return false;
        
    } // busqueda(File archivo, int n)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘