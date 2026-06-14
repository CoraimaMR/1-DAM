
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 27 abr 2026     ⏰ Hora: 13:10:26
 *
 *  Nombre del programa : ejercicioB9
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Partiendo del archivo ‘direcciones.csv’ del ejercicio anterior, diseñar un 
programa que solicite nuevos datos por teclado al usuario que cumplan con el 
formato del ficherosuministrado. Posteriormente, tendrá que añadirlos al final 
del mismo.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicioB9 {

    public static void main(String[] args) {
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        try {
            
            File file = new File("Documentos/direcciones.csv");
            String scanner = "";
            
            FileWriter fw = new FileWriter(file, true); //  Abrimos el archivo en modo de adición: no sobreesribir
            System.out.println("FORMATO: Nombre;Apellido;C/Calle, numero;codPostal");
            do {                    
                System.out.print("Introduzca el usuario: ");
                scanner = sc.nextLine();
                if (validarUsuario(scanner)) {
                    System.out.println("*** Formato correcto ***\n");
                    fw.write("\n" + scanner);
                }
            } while (!(scanner == ""));            
            fw.close(); // cerramos el FileWriter
            
        } catch (FileNotFoundException e) { // ERROR de archivo no encontrado
            System.out.println("ERROR DE ARCHIVO NO ENCONTRADO: " + e);
            e.printStackTrace();
        } catch (InputMismatchException e) { // ERROR de tipo de dato
            System.out.println("ERROR DE TIPO DE DATO: " + e);
            e.printStackTrace();
        } catch (Exception e) { // ERROR general
            System.out.println("OTRO TIPO DE ERROR: " + e);
            e.printStackTrace();
        }
        
    } //main()
    
    public static boolean validarUsuario(String usuario) {
        return usuario.matches("^([A-Z]{1}[a-z]+[;]){2}(C/\\s?[A-Z]{1}[a-z]+[,]\\s[0-9]+){1}[;][0-9]{5}$");
    } // validarUsuario(String info)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘