
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 21 abr 2026     ⏰ Hora: 9:52:56
 *
 *  Nombre del programa : main
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

/********************************* ENUNCIADO ***********************************
Implementa un programa que funcione como una pequeña terminal Linux con algunos 
comandos (simplificados) que permitan al usuario realizar distintas operaciones
de gestión de archivos. 

Los comandos que el usuario podrá ejecutar son:
● pwd: Muestra cual es la carpeta actual.
● cd <DIR>: Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior.
● ls: Muestra la lista de directorios y archivos de la carpeta actual (primero 
directorios, luego archivos, ambos ordenados alfabéticamente).
● ll: Como ls pero muestra también el tamaño y la fecha de última modificación.
● mkdir <DIR>: Crea el directorio ‘DIR’ en la carpeta actual.
● rm <FILE>: Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y 
luego la carpeta. Si tiene subcarpetas, las dejará intactas y mostrará un aviso 
al usuario.
● mv <FILE1> <FILE2>: Mueve o renombra ‘FILE1’ a ‘FILE2’.
● help: Muestra una breve ayuda con los comandos disponibles.
● exit: Termina el programa.

Clase MiniTerminal: Clase principal (con función main) que se encargará de 
interactuar con el usuario e interpretar los comandos (qué comando se pide, 
argumentos, etc.). Utilizará la segunda clase para realizar las operaciones de 
gestión de archivos. Manejará todas las posibles excepciones.

Clase MiniFileManager: Tendrá los atributos y métodos que necesites para 
realizar las distintas operaciones relacionadas con la gestión de archivos. 
Necesitarás al menos un método por cada operación. Se anzará una excepción si se
produce un error o la operación solicitada no es posible.

Algunos ejemplos que podrías implementar:
● String getPWD(): Devuelve una cadena de texto con la carpeta actual.
● boolean changeDir(String dir): Cambia la carpeta actual a dir. Devuelve ‘true’ 
si fué posible.
● void printList(boolean info): Muestra una lista con los directorios y archivos
de la carpeta actual. Si info es ‘true’ mostrará también su tamaño y fecha de 
modificación.
● etc.
*******************************************************************************/

package PracticaA;
import java.util.Scanner;

public class MiniTerminal {

    public static void main(String[] args) {
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        String scanner;
        boolean salir = false;
        
        MiniFileManager fl = new MiniFileManager("usuario");
            
        System.out.println("========== BIENVENID@ A LA TERMINAL ==========");
        do {                      
            
            try {
                System.out.print("Introduzca el comando: ");
                scanner = sc.nextLine().trim(); // Quito el primer y ultimo espacio
                
                String[] partes = scanner.split("\\s+"); // Separo el comando por los espacios
                String comando = partes[0].toLowerCase(); // Cojo la primera parte y lo pongo todo en minuscula
                
                switch (comando) {
                    case "pwd": // MUESTRA NOMBRE
                        comprobacionArray(partes, 1);
                        fl.getPWD();
                        break;
                    case "cd": // CAMBIA DE CARPETA ACTUAL
                        comprobacionArray(partes, 2);
                        fl.cambiarCarpeta(partes[1]);
                        break;
                    case "ls": // MUESTRA CONTENIDO
                        comprobacionArray(partes, 1);
                        fl.mostrarContenido(false);
                        break;
                    case "ll": // MUESTRA CONTENIDO Y DATOS EXTRAS
                        comprobacionArray(partes, 1);
                        fl.mostrarContenido(true);
                        break;
                    case "mkdir": // CREA DIRECTORIO
                        comprobacionArray(partes, 2);
                        fl.mkdir(partes[1]);
                        break;
                    case "rm": // BORRA CARPETA/CONTENIDOS
                         comprobacionArray(partes, 2);
                         fl.borrarContenido(partes[1]);
                        break;
                    case "mv": // MUEVE O RENOMBRA
                         comprobacionArray(partes, 3);
                         fl.moverOrenombrar(partes[1], partes[2]);
                        break;
                    case "help": // LISTA DE COMANDOS
                        comprobacionArray(partes, 1);
                        listarComandos();
                        break;
                    case "exit": // SALIR DEL BUCLE
                        comprobacionArray(partes, 1);
                        salir = true;
                        System.out.println("Saliendo ...");
                        break;
                    default: // OTRA OPCIÓN
                        System.out.println("ERROR. Comando no encontrado.");
                }
                System.out.println(); // Salto de linea
            } catch (Exception e) { // ERROR general
                System.out.println("OTRO TIPO DE ERROR: " + e);
            }
            
        } while (!salir);
        System.out.println("==================== FIN ====================");

    } //main()
    
    public static void listarComandos() {
        System.out.println("\n=== LISTA DE COMANDOS ===");
        System.out.println("""
        - pwd: Muestra cual es la carpeta actual.
        - cd <DIR>: Cambia la carpeta actual a \u2018DIR\u2019. Con .. cambia a la carpeta superior.
        - ls: Muestra la lista de directorios y archivos de la carpeta actual (primero 
        directorios, luego archivos, ambos ordenados alfab\u00e9ticamente).
        - ll: Como ls pero muestra tambi\u00e9n el tama\u00f1o y la fecha de \u00faltima modificaci\u00f3n.
        - mkdir <DIR>: Crea el directorio \u2018DIR\u2019 en la carpeta actual.
        - rm <FILE>: Borra \u2018FILE\u2019. Si es una carpeta, borrar\u00e1 primero sus archivos y 
        luego la carpeta. Si tiene subcarpetas, las dejar\u00e1 intactas y mostrar\u00e1 un aviso 
        al usuario.
        - mv <FILE1> <FILE2>: Mueve o renombra \u2018FILE1\u2019 a \u2018FILE2\u2019.
        - help: Muestra una breve ayuda con los comandos disponibles.
                           - exit: Termina el programa.""");
    } // listarComandos()
    
    public static void comprobacionArray(String[] partes, int n) throws Exception {
        if (partes.length != n) throw new Exception("ERROR. Estructura del comando errónea.\n");
    } // comprobacionArray(String[] partes, int n)
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘