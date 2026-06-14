
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 27 abr 2026     ⏰ Hora: 12:55:18
 *
 *  Nombre del programa : ejercicioB8
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Se suministra el fichero 'direcciones.csv' el cual contiene una lista de 
nombres, apellidos, direcciones y códigos postales de diferentes clientes. Se 
pide diseñar un programa que sea capaz de seleccionar y mostrar por pantalla 
aquellos cuyo código postal comience por ‘11’.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ejercicioB8 {

    public static void main(String[] args) {
        
        try {
            
            File file = new File("Documentos/Direcciones.csv");
            mostrarPostales(file);
        
        } catch (FileNotFoundException e) { // ERROR de archivo no encontrado
            System.out.println("ERROR DE ARCHIVO NO ENCONTRADO: " + e);
            e.printStackTrace();
        } catch (Exception e) { // ERROR general
            System.out.println("OTRO TIPO DE ERROR: " + e + "\n" + "e");
            e.printStackTrace();
        }
        
    } //main()
    
    public static void mostrarPostales(File archivo) throws FileNotFoundException {
        if (!archivo.exists()) {
            throw new FileNotFoundException("*** Error en la apertura del archivo ***");
        }
        
        Scanner lector = new Scanner(archivo); // Abrimos el fichero
        
        while (lector.hasNextLine()) {
            String linea = lector.nextLine();
            String[] partes = linea.split(";");

            if (partes.length >= 4) {
                String codigoPostal = partes[3];

                if (codigoPostal.startsWith("11")) {
                    System.out.println(linea);
                }
            }
        }       

        lector.close(); // Cerramos el fichero
        
        System.out.println("*** Fichero leido correctamente ***");
        
    } // mostrarPostales(File archivo)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘