/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejemplos;
//import java.io.FileWriter;
//import java.io.File;
//import java.io.IOException;
import java.io.*;
/*------------------------------- ENUNCIADO ------------------------------------

*/

/**
 * @author Jesús Pérez 
 */
public class EjemploEscritura {
    /*
    El código siguiente sirve como ejemplo de un programa que escribe un archivo llamado
    "Enteros.txt" dentro de la carpeta de trabajo. Se escriben 20 valores enteros, empezando por el
    1 y cada vez el doble del anterior. Pruébalo para ver su funcionamiento. Ten en cuenta que si ya
    existía un archivo con ese nombre, quedará totalmente sobrescrito. Después, puedes intentar
    leerlo con el programa del ejemplo anterior para leer 10 valores enteros y mostrarlos por
    pantalla.
    */
    
    /*
    Prueba a ejecutar el código varias veces. Verás que el archivo se sobrescribe y siempre
    queda igual. Luego, modifica la instanciación del FileWriter agregando el segundo argumento
    (“append”) a true: ​ FileWriter fw = new FileWriter(f, ​ true​ ); Pruébalo y verás que ya no
    se sobreescribe el fichero, sino que se añaden los 20 números al final.
    */
    public static void main(String[] args) {
        try {
          File f = new File("Enteros.txt");
          FileWriter fw = new FileWriter(f,true);
          int valor = 1;
          for (int i = 1; i <= 20; i++) {
            fw.write("" + valor); // escribimos valor
            fw.write(" ");
            // escribimos espacio en blanco
            valor = valor * 2;
            // calculamos próximo valor
          }//for
          
          fw.write("\n"); // escribimos nueva línea
          fw.close(); // cerramos el FileWriter
          System.out.println("Fichero escrito correctamente");
        }catch (IOException e) {
          System.out.println("Error: " + e);
        }
    }//main

}//class