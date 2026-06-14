
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 21 abr 2026     ⏰ Hora: 9:04:20
 *
 *  Nombre del programa : EjercicioA2_MostrarInformaciónDeFicheros
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Partiendo de una copia del programa anterior, modifica la función muestraInfoRuta:
● En el caso de un directorio, mostrará la lista de directorios y archivos en 
orden alfabético. Es decir, primero los directorios en orden alfabético y luego 
los archivos en orden alfabético. Te será útil Arrays.sort().
● Añade un segundo argumento ‘boolean info’ que cuando sea ‘true’ mostrará, 
junto a la información de cada directorio o archivo, su tamaño en bytes y la 
fecha de la última modificación. Cuando ‘info’ sea ‘false’ mostrará la 
información como en el ejercicio anterior.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class EjercicioA2_MostrarInformaciónDeFicherosV2 {

    public static void main(String[] args) {
        String scanner = "";
        Scanner sc = new Scanner(System.in);               
        
        do { // Repetimos hasta vacío
            try {
                System.out.print("Introduzca una ruta del sistema de archivos: ");
                scanner = sc.nextLine(); 
                if (scanner!="") { // Si no es vacio mostramos su información
                    File ruta= new File(scanner);
                    muestraInfoRuta(ruta, false); // false para no ver información extra
                    muestraInfoRuta(ruta, true); // true para ver información extra
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

    private static void muestraInfoRuta(File ruta, boolean info) throws FileNotFoundException {
        if (!ruta.exists()) { // Si no encontrasmos el archivo mandamos a ERROR
            throw new FileNotFoundException("La ruta introducida no existe");
        }    
        
        System.out.println("=== ARCHIVO ===");
        if (ruta.isFile()) { // SI es un ARCHIVO
            System.out.println("[A] "+ ruta.getName());
        } else { // Si es una CARPETA
            System.out.println("* "+ruta.getName());
            
            File[] listado = ruta.listFiles(); 
            Arrays.sort(listado); // Ordenamos el array alfabeticamente
            System.out.println("\n=== CONTENIDO ===");
            //Mostramos los directorios
            for (int i = 0; i < listado.length; i++) {
                if (listado[i].isDirectory()) {
                    imprimirDetalle(listado[i], "*", info);
                }
            }
            //Mostramos los archivos
            for (int i = 0; i < listado.length; i++) {
                if (listado[i].isFile()) {
                    imprimirDetalle(listado[i], "[A]", info);
                }                
            }
        }
        System.out.println("");
    } // muestraInfoRuta(File ruta, boolean info)
    
    private static void imprimirDetalle(File f, String prefijo, boolean info) {
        if (info) {
            // Mostramos nombre + tamaño + fecha
            System.out.println(prefijo + " " + f.getName() + " - " + f.length() + " bytes - " + new Date(f.lastModified()));
        } else {
            // Mostramos solo el nombre como en el ejercicio anterior
            System.out.println(prefijo + " " + f.getName());
        }
    } // imprimirDetalle(File f, String prefijo, boolean info)
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘