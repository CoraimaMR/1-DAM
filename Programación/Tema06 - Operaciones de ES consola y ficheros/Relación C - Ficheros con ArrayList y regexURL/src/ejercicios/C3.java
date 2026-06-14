
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 11 may 2026     ⏰ Hora: 12:21:49
 *
 *  Nombre del programa : C3
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Implementa un programa que genere aleatoriamente nombres de persona (combinando 
nombres y apellidos de ‘usa_nombres.txt’ y ‘usa_apellidos.txt’). Se le pedirá al
usuario cuántos nombres de persona desea generar y a qué archivo añadirlos (por 
ejemplo ‘usa_personas.txt’).
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class C3 {

    public static void main(String[] args) {
        
        // Archivos que usaremos
        File fileNombre = new File("Documentos/usa_nombres.txt");
        File fileApellido = new File("Documentos/usa_apellidos.txt");
        File filePersona = new File("personas.txt");
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        try {
            
            System.out.print("¿Cuantos nombres quieres generar?: ");
            int n = sc.nextInt();

            añadirPersonas(fileNombre, n, fileApellido, filePersona);
        
        } catch (FileNotFoundException e) { // ERROR de archivo no encontrado
            System.out.println("ERROR DE ARCHIVO NO ENCONTRADO: " + e);
        } catch (IOException e) { // ERROR de entrada o salida de texto
            System.out.println("ERROR EN LA ENTRADA O SALIDA DE TEXTO: " + e);
        } catch (Exception e) { // ERROR general
            System.out.println("OTRO TIPO DE ERROR: " + e);
        }
        
    } //main()

    private static void añadirPersonas(File fileNombre, int n, File fileApellido, File filePersona) throws FileNotFoundException, IOException {
        if (!fileNombre.exists() || !fileApellido.exists())
            throw new FileNotFoundException("*** Error de apertura del archivo ***");
        
        FileWriter fw = new FileWriter(filePersona); //  Abrimos el archivo en modo de no adición: sobreesribir
        Scanner lectorNombre = new Scanner(fileNombre); // Abrimos el fichero
        Scanner lectorApellido = new Scanner(fileApellido); // Abrimos el fichero        
        
        ArrayList<String> nombre = new ArrayList<>();
        ArrayList<String> apellido = new ArrayList<>();
        
        while (lectorNombre.hasNextLine()) nombre.add(lectorNombre.nextLine());
        while (lectorApellido.hasNextLine()) apellido.add(lectorApellido.nextLine());
        
        for (int i = 0; i < n; i++) {
            
            int aleNombre = (int)(Math.random()*nombre.size());
            int aleApellido = (int)(Math.random()*apellido.size());
            String pesona = nombre.get(aleNombre) + " " + apellido.get(aleApellido);
            
            fw.write(pesona + "\n");
            
        }
        
        lectorNombre.close(); // Cerramos el fichero
        lectorApellido.close(); // Cerramos el fichero
        fw.close(); // cerramos el FileWriter
        System.out.println("*** Fichero escrito correctamente ***");
        
    } // añadirPersonas(File fileNombre, int n, File fileApellido, File filePersona)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘