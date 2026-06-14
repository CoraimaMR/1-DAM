
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 7 abr 2026     ⏰ Hora: 9:05:39
 *
 *  Nombre del programa : ejercicio05
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Validar un binario, octal y hexadecimal
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;

public class ejercicio05 {

    public static void main(String[] args) {

        System.out.println("5. Validar un binario, octal y hexadecimal.\n");
        
        System.out.println("10101011: " + validarBinario("10101011")); // true
        System.out.println("01234567: " + validarOctal("01234567")); // true
        System.out.println("E23: " + validarHexadecimal("E23") + "\n"); // true
        
        System.out.println("10101115: " + validarBinario("10101115")); // false
        System.out.println("12345678: " + validarOctal("12345678")); // false
        System.out.println("FG75: " + validarHexadecimal("FG75") + "\n"); // false

    } //main()
    
    public static boolean validarBinario(String binario) {
        return binario.matches("^[01]+$");
    } // validarBinario(String binario)
    
    public static boolean validarOctal(String octal) {
        return octal.matches("^[0-7]+$");
    } // validarOctal(String octal)
    
    public static boolean validarHexadecimal(String hexadecimal) {
        return hexadecimal.matches("^[0-9ABCDEF]+$");
    } // validarHexadecimal(String hexadecimal)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘