
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 21 abr 2026     ⏰ Hora: 9:06:47
 *
 *  Nombre del programa : EjercicioA4_CreandoYMoviendoCarpetas
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Implementa un programa que cree, dentro de ‘Documentos’, dos nuevas carpetas: 
‘Mis Cosas’ y ‘Alfabeto’. Mueve las carpetas ‘Fotografias’ y ‘Libros’ dentro de 
‘Mis Cosas’. Luego crea dentro de ‘Alfabeto’ una carpeta por cada letra del 
alfabeto (en mayúsculas): ‘A’, ‘B’, ‘C’... ‘Z’. Te serán de ayuda los códigos 
numéricos ASCII: https://elcodigoascii.com.ar
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.io.File;

public class EjercicioA4_CreandoYMoviendoCarpetas {

    public static void main(String[] args) {
        
        // 1. Crear 'Mis Cosas' y 'Alfabeto' dentro de 'Documentos'
        File misCosas = new File("Documentos/Mis Cosas");
        File alfabeto = new File("Documentos/Alfabeto");
        
        misCosas.mkdirs();
        alfabeto.mkdirs();
        System.out.println("Carpetas 'Mis Cosas' y 'Alfabeto' creadas.");

        // 2. Mover 'Fotografias' y 'Libros' dentro de 'Mis Cosas'
        // Origen: Documentos/Fotografias -> Destino: Documentos/Mis Cosas/Fotografias
        File fotosOrigen = new File("Documentos/Fotografias");
        File fotosDestino = new File("Documentos/Mis Cosas/Fotografias");
        
        File librosOrigen = new File("Documentos/Libros");
        File librosDestino = new File("Documentos/Mis Cosas/Libros");

        if (fotosOrigen.renameTo(fotosDestino)) {
            System.out.println("Carpeta 'Fotografias' movida con éxito.");
        }
        
        if (librosOrigen.renameTo(librosDestino)) {
            System.out.println("Carpeta 'Libros' movida con éxito.");
        }

        // 3. Crear carpetas de la A a la Z dentro de 'Alfabeto'
        // Usamos código ASCII: A es 65 y Z es 90
        System.out.println("Creando abecedario...");
        for (int i = 65; i <= 90; i++) {
            // Convertimos el número ASCII a letra
            char letra = (char) i;
            File carpetaLetra = new File(alfabeto, String.valueOf(letra));
            
            if (carpetaLetra.mkdir()) {
                System.out.print(letra + " ");
            }
        }
        System.out.println("\nProceso finalizado.");

    } //main()

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘