
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 6 abr 2026     ⏰ Hora: 12:44:59
 *
 *  Nombre del programa : ejercicio03
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Valida un DNI
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;

public class ejercicio03 {

    public static void main(String[] args) {
        
        System.out.println("3. Valida un DNI.\n");
        
        System.out.println("12345678Z: " + validarDNI("12345678Z")); // true
        System.out.println("87654321A: " + validarDNI("87654321A") + "\n"); // true
        
        System.out.println("1A: " + validarDNI("1A")); // false
        System.out.println("123456789Z: " + validarDNI("123456789Z")); // false
        System.out.println("12345678I: " + validarDNI("12345678I") + "\n"); // false

    } //main()
    
    public static boolean validarDNI(String DNI){
        return DNI.matches("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]{1}$");
    } // validarDNI(String DNI)
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘