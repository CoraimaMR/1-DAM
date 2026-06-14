/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejemplos;
import java.util.Scanner;
import java.io.File;

/*------------------------------- ENUNCIADO ------------------------------------
Ejemplo de Lectura y Escritura de ficheros.
  - Lectura: clase java.util.Scanner, instanciándola con un File en su constructor.
  - Escritura: clase java.io.FileWriter.
  - Al finalizar la operación, ejecutar el método close()
  - Acceso secuencial.
*/

/**
 * @author Jesús Pérez 
 */
public class EjemploLectura {
    
    public static final int NUM_VALORES = 10;
    
    public static void main(String[] args) {
       /*
        El programa siguiente muestra un ejemplo de cómo leer diez valores enteros de un archivo
        llamado "Enteros.txt" ubicado en la carpeta de trabajo (debería ser la carpeta del proyecto
        Netbeans). Para probarlo, crea el archivo e introduce exactamente 10 valores enteros
        separados por espacios en blanco o saltos de línea.
        */ 
       try {
          // Intentamos abrir el fichero
          File f = new File("enteros.txt");
          leerEnteros(f);            
        } catch (Exception e) {
          // En caso de excepción mostramos el error
          System.out.println("Error: " + e);
          System.out.println(e);
          //e.printStackTrace();
        }
       
    }//main
    
    public static void leerEnteros(File f) throws Exception{
        if (!f.exists()) throw new Exception("*** Error en la apertura del archivo ***");
        
        // Si llega aquí es que ha abierto el fichero :)
        Scanner lector=new Scanner (f);
        for (int i = 0; i < NUM_VALORES; i++) {
          int valor = lector.nextInt();
          System.out.println("El valor leído es: " + valor);
        }//for    
        
        // ¡Hay que cerrar el fichero!
        lector.close();
    } //leerEnteros()

}//class