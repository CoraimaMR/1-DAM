
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 7 abr 2026     ⏰ Hora: 8:30:43
 *
 *  Nombre del programa : ejercicio04
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Valida un número entero, un positivo y un negativo
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;

public class ejercicio04 {

    public static void main(String[] args) {
        
        System.out.println("4. Valida un número entero, un positivo y un negativo.\n");
        
        System.out.println("0: " + validarNumeroPositivo("0")); // true
        System.out.println("14: " + validarNumeroPositivo("14")); // true
        System.out.println("+14: " + validarNumeroPositivo("+14")); // true
        System.out.println("-5: " + validarNumeroNegativo("-5") + "\n"); // true
        
        System.out.println("C: " + validarNumeroPositivo("C")); // false
        System.out.println("-14: " + validarNumeroPositivo("-14")); // false
        System.out.println("5: " + validarNumeroNegativo("5") + "\n"); // false

    } //main()
    
    public static boolean validarNumero(String numero) {
//        return numero.matches("^-?[0-9]+$"); // FORMA 1
        return numero.matches("^[-,+]?\\d+$"); // FORMA 2
    } // validarNumero(String numero)
    
    public static boolean validarNumeroPositivo(String numero) {
        return numero.matches("^[+]?\\d+$");
    } // validarNumeroPositivo(String numero)
    
    public static boolean validarNumeroNegativo(String numero) {
        return numero.matches("^[-]\\d+$");
    } // validarNumeroNegativo(String numero)
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘