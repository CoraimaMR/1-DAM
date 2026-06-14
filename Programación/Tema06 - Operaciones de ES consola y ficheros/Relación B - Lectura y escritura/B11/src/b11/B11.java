
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 28 abr 2026     ⏰ Hora: 9:31:34
 *
 *  Nombre del programa : ejercicioB11
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Diseña una clase denominada Cesar que contenga un método que encripte y otro que
desencripte un fichero de texto utilizando el código césar. El cifrado césar es 
un tipo de cifrado de sustitución en el que cada letra en el texto se desplaza 
un cierto número de lugares en el alfabeto. Por ejemplo, con un desplazamiento 
de 2, ‘A’ se reemplazaría por ‘C’, ‘B’ se convertiría en ‘D’, etc. 
Adicionalmente, crearás otra clase que contenga el método main, por ejemplo B11.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package b11;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B11 {

    public static void main(String[] args) {
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);    
        
        try {      
            
            System.out.print("Introduzca el fichero: ");
            String ruta = sc.nextLine();
            File file = new File(ruta);            
            
            System.out.print("Introduzca el número de desplazamientos: ");
            int n = sc.nextInt();            
            
            Cesar fichero = new Cesar(n, file);
            
            fichero.encriptar();
            fichero.desencriptar();
            
        } catch (FileNotFoundException e) { // ERROR de archivo no encontrado
            System.out.println("ERROR DE ARCHIVO NO ENCONTRADO: " + e);
        } catch (Exception e) { // ERROR general
            System.out.println("OTRO TIPO DE ERROR: " + e);
        }
        
    } //main()

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘