
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 15 abr 2026     ⏰ Hora: 11:59:06
 *
 *  Nombre del programa : ejercicio11
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Se proporciona el siguiente texto:
“Continuando con el tema de las redes, tenemos que hablar de las direcciones MAC.
Se trata de seis grupos de dos dígitos hexadecimales separados por : o por -.
Por ejemplo, 12:34:67:AD:A2:F5. De la anterior dirección, 12:34:67 identifica al 
fabricante, mientras que AD:A2:F5 identifica al producto. 45:77:GH:78:2:23 no 
sería una dirección válida. Para cualquier duda, puedes escribirme a 
admin_super21@g.empresa.com o llamarme al 688124578 o al 957-221133”

Diseña un programa en Java que sea capaz de examinar el texto anterior y de 
mostrar por pantalla las direcciones MAC correctas, así como la dirección de 
correo electrónico suministrada y los teléfonos.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio11 {

    public static void main(String[] args) {
        
        String texto = "Se proporciona el siguiente texto:\n" +
    "“Continuando con el tema de las redes, tenemos que hablar de las direcciones MAC.\n" +
    "Se trata de seis grupos de dos dígitos hexadecimales separados por : o por -.\n" +
    "Por ejemplo, 12:34:67:AD:A2:F5. De la anterior dirección, 12:34:67 identifica al \n" +
    "fabricante, mientras que AD:A2:F5 identifica al producto. 45:77:GH:78:2:23 no \n" +
    "sería una dirección válida. Para cualquier duda, puedes escribirme a \n" +
    "admin_super21@g.empresa.com o llamarme al 688124578 o al 957-221133”\n" +
    "\n" +
    "Diseña un programa en Java que sea capaz de examinar el texto anterior y de \n" +
    "mostrar por pantalla las direcciones MAC correctas, así como la dirección de \n" +
    "correo electrónico suministrada y los teléfonos.";
        
        String regexMAC = "([0-9A-Fa-f]{2}[:,-]){5}[0-9A-Fa-f]{2}";
        String regexCorreo = "[a-zA-Z0-9._]+(@)[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,3}";
        String regexTelefono = "\\d{9}|\\d{3}(-)\\d{6}";
        
        // Identificamos lo pedido y lo mostramos;
        System.out.println("=== DIRECCIONES MAC ENCONTRADAS ===");
        identificador(texto, regexMAC);
        
        System.out.println("=== CORREOS ELECTRONICOS ENCONTRADOS ===");
        identificador(texto, regexCorreo);
        
        System.out.println("=== TELÉFONOS ENCONTRADOS ===");
        identificador(texto, regexTelefono);
        
    } //main()

    private static void identificador(String texto, String regex) {
        
        Pattern patron = Pattern.compile(regex); // Pattern: Patron que buscamos
        Matcher matcher = patron.matcher(texto); // Matcher: Donde lo buscamos
        
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println(); // Salto de linea
        
    } // identificador(String texto, String regex)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘