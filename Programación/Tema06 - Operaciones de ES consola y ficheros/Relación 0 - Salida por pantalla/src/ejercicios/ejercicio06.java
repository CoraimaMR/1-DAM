
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 7 abr 2026     ⏰ Hora: 9:14:20
 *
 *  Nombre del programa : ejercicio06
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Validar números reales: real, real positivo, real negativo y real con x decimales.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;

public class ejercicio06 {

    public static void main(String[] args) {

        System.out.println("6. Validar números reales: real, real positivo, real negativo y real con x decimales.\n");

        System.out.println(validarReal("5")); // true
        System.out.println(validarReal("-3.14")); // true
        System.out.println(validarRealPositivo("4,2")); // true
        System.out.println(validarRealNegativo("-7")); // true
        System.out.println(validarRealDecimal("2.5") + "\n"); // true

        System.out.println(validarReal("abc")); // false
        System.out.println(validarRealPositivo("-5")); // false
        System.out.println(validarRealNegativo("5")); // false
        System.out.println(validarRealDecimal("10") + "\n"); // false

    } //main()
    
    public static boolean validarReal(String real) {
        return real.matches("^[-,+]?\\d+([\\.,]\\d+)?$");
    } // validarReal(String real)
    
    public static boolean validarRealPositivo(String real) {
        return real.matches("^[+]?\\d+([\\.,]\\d+)?$");
    } // validarRealPositivo(String real)
    
    public static boolean validarRealNegativo(String real) {
        return real.matches("^[-]\\d+([\\.,]\\d+)?$");
    } // validarRealNegativo(String real)
    
    public static boolean validarRealDecimal(String real) {
        return real.matches("^[-,+]?\\d+([\\.,]\\d+)$");
    } // validarRealDecimal(String real)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘