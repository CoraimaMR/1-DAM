
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 13 abr 2026     ⏰ Hora: 13:27:25
 *
 *  Nombre del programa : ejercicio01
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Implementa un programa que pida al usuario introducir por teclado una ruta del 
sistema de archivos (por ejemplo, “C:/Windows” o “Documentos”) y muestre 
información sobre dicha ruta (ver función más abajo). El proceso se repetirá una
y otra vez hasta que el usuario introduzca una ruta vacía (tecla intro). Deberá 
manejar las posibles excepciones.

Necesitarás crear la función ​void muestraInfoRuta(File ruta) que dada una ruta 
de tipo File haga lo siguiente:
● Si es un archivo, mostrará por pantalla el nombre del archivo.
● Si es un directorio, mostrará por pantalla la lista de directorios y archivos 
que contiene (sus nombres). Deberá mostrar primero los directorios y luego los 
archivos.
● En cualquier caso, añade delante del nombre la etiqueta [*] o [A] para indicar 
si es un directorio o un archivo respectivamente.
● Si el path no existe lanzará un FileNotFoundException.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioA1_MostrarInformaciónDeFicheros {

    public static void main(String[] args) {
        String scanner = "";
        Scanner sc = new Scanner(System.in);               
        
        do { // Repetimos hasta vacío
            try {
                System.out.print("Introduzca una ruta del sistema de archivos: ");
                scanner = sc.nextLine(); 
                if (scanner!="") { // Si no es vacio mostramos su información
                    File ruta= new File(scanner);
                    muestraInfoRuta(ruta);
                }     
            } catch (FileNotFoundException e) { // ERROR de archivo no encontrado
                System.out.println("ERROR: " + e + "\n");
                e.printStackTrace();
            }
            catch (Exception e) { // ERROR general
                System.out.println("ERROR: " + e + "\n");
                e.printStackTrace();
            }           
        } while (!scanner.equals(""));
        
    } //main()

    private static void muestraInfoRuta(File ruta) throws FileNotFoundException {
        if (!ruta.exists()) { // Si no encontrasmos el archivo mandamos a ERROR
            throw new FileNotFoundException("La ruta introducida no existe");
        }    
        
        System.out.println("=== ARCHIVO ===");
        if (ruta.isFile()) { // SI es un ARCHIVO
            System.out.println("[A] "+ ruta.getName());
        } else { // Si es una CARPETA
            System.out.println("* "+ruta.getName());
            
            File[] listado = ruta.listFiles();  
            System.out.println("\n=== CONTENIDO ===");
            //Mostramos los directorios
            for (int i = 0; i < listado.length; i++) {
                if (listado[i].isDirectory()) {
                    System.out.println("* "+listado[i].getName());
                }                
            }
            //Mostramos los archivos
            for (int i = 0; i < listado.length; i++) {
                if (listado[i].isFile()) {
                    System.out.println("[A] "+ listado[i].getName());
                }                
            }
        }
        System.out.println("");
    } // muestraInfoRuta(File ruta)
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘