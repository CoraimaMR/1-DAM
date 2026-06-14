
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 7 abr 2026     ⏰ Hora: 9:47:40
 *
 *  Nombre del programa : ejercicio08
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Validar una dirección IP
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;

public class ejercicio08 {

    public static void main(String[] args) {

        System.out.println("8. Validar una dirección IP.\n");
        
        System.out.println("192.168.1.11: " + validarIP("192.168.1.11")); // true
        System.out.println("0.0.0.0: " + validarIP("0.0.0.0")); // true
        System.out.println("255.254.0.0: " + validarIP("255.254.0.0") + "\n"); // true
        
        System.out.println("192.168.1.0.: " + validarIP("192.168.1.0.")); // false
        System.out.println("192.168.1: " + validarIP("192.168.1")); // false
        System.out.println("13556777: " + validarIP("13556777") + "\n"); // false

    } //main()
    
    public static boolean validarIP(String IP) {
        return IP.matches("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
    } // validarIP(String IP)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘