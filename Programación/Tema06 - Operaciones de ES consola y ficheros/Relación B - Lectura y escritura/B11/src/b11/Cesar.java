// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package b11;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 28 abr 2026 ⏰ Hora: 9:37:55
* @version 1.0
*******************************************************************************/

public class Cesar {   

    // --------- ATRIBUTOS ---------
    private int n;
    private File file;
    
    // -------- CONSTRUCTOR --------
    public Cesar(int n, File file) throws FileNotFoundException {
        if (!file.exists()) throw new FileNotFoundException("*** Error en la apertura del archivo ***");
        this.n = n;
        this.file = file;
    }
    
    //---- METODOS DE LA CLASE -----
    public void encriptar() throws IOException {
        String nombreFichero = "encriptado.txt";
        codCesar(n, nombreFichero);
        System.out.println("*** Encriptado correctamente ***");
        // Usamos el fichero para lo siguiente
        this.file = new File("encriptado.txt");
    } // encriptar()
    
    public void desencriptar() throws IOException {
        String nombreFichero = "desencriptado.txt";
        codCesar(-n, nombreFichero);
        System.out.println("*** Desencriptado correctamente ***");
        // Usamos el fichero para lo siguiente
        this.file = new File("desencriptado.txt");
    } // desencriptar()
    
    public void codCesar(int n, String nombreFichero) throws IOException {
        
        FileWriter fw = new FileWriter(nombreFichero); 
        Scanner reader = new Scanner(this.file);

        while (reader.hasNextLine()) {
            String linea = reader.nextLine();
            char[] caracteres = linea.toCharArray();
            
            for (int i = 0; i < caracteres.length; i++) {
                char c = caracteres[i];
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    // Aplicamos el desplazamiento circular (alfabeto de 26 letras)
                    c = (char) (base + (c - base + n % 26 + 26) % 26);
                }
                fw.write(c);
            }
            fw.write("\n"); // Mantener los saltos de línea
        }
        reader.close();
        fw.close(); // cerramos el FileWriter
        
    } // codCesar(int n, String nombreFichero)
    
} // clase Cesar

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘