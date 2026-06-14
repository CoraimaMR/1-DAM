
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 11 may 2026     ⏰ Hora: 12:37:54
 *
 *  Nombre del programa : C4
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Utiliza el fichero ‘diccionario.txt’ para clasificar sus palabras. Las que 
tengan un tamaño menor o igual a 4 agrégalas al fichero ‘pequenias.txt’. Las que
tengan entre 4 y 9 letras (ambas incluidas) agrégalas al fichero ‘medianas.txt’.
Las que tengan 10 o más letras, agrégalas el fichero ‘grandes.txt’.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class C4 {

    public static void main(String[] args) {
        
        // Ficheros que usaremos
        File fileDiccionario = new File("Documentos/diccionario.txt");
        File filePeque = new File("pequenias.txt");
        File fileMedia = new File("medianas.txt");
        File fileGrande = new File("grandes.txt");
        
        try {
            
            clasificarPalabras(fileDiccionario, filePeque, fileMedia, fileGrande);
            
        } catch (FileNotFoundException e) { // ERROR de archivo no encontrado
            System.out.println("ERROR DE ARCHIVO NO ENCONTRADO: " + e);
        } catch (IOException e) { // ERROR de entrada o salida de texto
            System.out.println("ERROR EN LA ENTRADA O SALIDA DE TEXTO: " + e);
        } catch (Exception e) { // ERROR general
            System.out.println("OTRO TIPO DE ERROR: " + e);
        } 
        
    } //main()

    private static void clasificarPalabras(File fileDiccionario, File filePeque, File fileMedia, File fileGrande) throws FileNotFoundException, IOException {
        if (!fileDiccionario.exists()) throw new FileNotFoundException("*** Error de apertura del archivo ***");
        
        FileWriter fwPeque = new FileWriter(filePeque); //  Abrimos el archivo
        FileWriter fwMedia = new FileWriter(fileMedia); //  Abrimos el archivo
        FileWriter fwGrande = new FileWriter(fileGrande); //  Abrimos el archivo
        Scanner lector = new Scanner(fileDiccionario); // Abrimos el fichero

        while (lector.hasNextLine()) {
            String linea = lector.nextLine().trim();
            int longitud = linea.length();
            
            if (longitud <= 4) fwPeque.write(linea + "\n");
            if (4 <= longitud && longitud <= 9) fwMedia.write(linea + "\n");
            if (10 <= longitud) fwGrande.write(linea + "\n");
                
        }
        
        lector.close(); // Cerramos el fichero
        fwPeque.close(); // cerramos el FileWriter
        fwMedia.close(); // cerramos el FileWriter
        fwGrande.close(); // cerramos el FileWriter
        System.out.println("*** Ficheros escritos correctamente ***");
        
    } // clasificarPalabras(File fileDiccionario, File filePeque, File fileMedia, File fileGrande)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘