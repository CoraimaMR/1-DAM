
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 9 abr 2026     ⏰ Hora: 13:26:23
 *
 *  Nombre del programa : ejercicio09
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Se proporciona el siguiente texto:

"Mi dirección IP es la 192.168.1.11, ya que la puerta de enlace es la 192.168.1.
1. La dirección de red es la 192.168.1.0 y sería incorrecto expresarla como 192.
168.1. Por otro lado, mi usuario de twitter, ahora llamado X es @Admin_super21 y
el coche de empresa que me han prestado tiene la matrícula 7808FGH. La del antiguo 
terminaba en DTH pero no recuerdo los números."

Diseñar un programa que sea capaz de extraer y mostrar por pantalla cada una de 
las direcciones IP correctas, indicando además el número total de las encontradas. 
Además, hay que indicar cuál es el usuario de Twitter y la matrícula del coche 
de empresa.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio09 {

    public static void main(String[] args) {
        
        String texto = "Mi dirección IP es la 192.168.1.11, ya que la puerta de enlace es la 192.168.1.\n" +
"1. La dirección de red es la 192.168.1.0 y sería incorrecto expresarla como 192.\n" +
"168.1. Por otro lado, mi usuario de twitter, ahora llamado X es @Admin_super21 y\n" +
"el coche de empresa que me han prestado tiene la matrícula 7808FGH. La del antiguo \n" +
"terminaba en DTH pero no recuerdo los números.";
                        
        // EXTRAER IPs
        extraerIP(texto);        
        
        // EXTRAER MATRÍCULA
        extraerMatricula(texto);

        // EXTRAER USUARIO TWITTER
        extraerUsuarioTwitter(texto);
        
    } //main()
    
    public static void extraerIP(String texto) {
        String regexIP = "\\b((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\b";
                
        Pattern patronIP = Pattern.compile(regexIP); // Pattern: Patron que buscamos
        Matcher matcherIP = patronIP.matcher(texto); // Matcher: Donde lo buscamos

        int contadorIPs = 0;
        System.out.println("=== IPs encontradas ===");

        while (matcherIP.find()) { // Mostramos lo encontrado
            System.out.println(matcherIP.group());
            contadorIPs++;
        }
        System.out.println("Total IPs: " + contadorIPs + "\n");
    } // extraerIP(String texto)
    
    public static void extraerMatricula(String texto) {
        String regexMATRICULA = "\\b\\d{4}[BCDFGHJKLMNPRSTVWXYZ]{3}\\b";
        
        Pattern patronMatricula = Pattern.compile(regexMATRICULA); // Pattern: Patron que buscamos
        Matcher matcherMatricula = patronMatricula.matcher(texto); // Matcher: Donde lo buscamos

        while (matcherMatricula.find()) { // Mostramos lo encontrado
            System.out.println("Matrícula: " + matcherMatricula.group());
        } 
    } // extraerMatricula(String texto)
    
    public static void extraerUsuarioTwitter(String texto) {
        String regexUSUARIO = "@[A-Za-z0-9_]+";
        
        Pattern patronUsuario = Pattern.compile(regexUSUARIO); // Pattern: Patron que buscamos
        Matcher matcherUsuario = patronUsuario.matcher(texto); // Matcher: Donde lo buscamos

        while (matcherUsuario.find()) { // Mostramos lo encontrado
            System.out.println("Usuario Twitter: " + matcherUsuario.group());
        }
    } // extraerUsuarioTwitter(String texto)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘