
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 6 abr 2026     ⏰ Hora: 12:33:19
 *
 *  Nombre del programa : ejercicio01
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Busca la cadena "cena" dentro de un String
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio01 {

    public static void main(String[] args) {
        
        int cuenta = 0;
        
        String texto = "La quincena es para la cena"; // String donde queremos buscar
        String regex1 = "cena"; // Lo que queremos buscar
        String encontrado = " ";
        
        Pattern pattern = Pattern.compile(regex1); // Pattern: Lo que estamos buscando
        Matcher matcher = pattern.matcher(texto); // Matcher: Donde lo buscamos
        
        while (matcher.find()) { // Mostramos los resultados
            encontrado = matcher.group();
            System.out.println("La coincidencia es: " + encontrado);
            cuenta++;
        }
        
        System.out.println("Hemos encontrado " + cuenta + " coincidencias");
        
    } //main()

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘