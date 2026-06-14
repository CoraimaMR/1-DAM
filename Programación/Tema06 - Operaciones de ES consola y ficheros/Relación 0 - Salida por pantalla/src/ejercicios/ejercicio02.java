
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 6 abr 2026     ⏰ Hora: 12:44:30
 *
 *  Nombre del programa : ejercicio02
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Analiza si un nombre propio tiene la estructura correcta
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;

public class ejercicio02 {

    public static void main(String[] args) {
        System.out.println("2. Analiza si un nombre propio tiene la estructura correcta.\n");
        
        System.out.println("Coraima: " + validarNombreSimple("Coraima")); // true
        System.out.println("Lucía: " + validarNombreSimple("Lucía")); // true
        System.out.println("Francisco Manuel: " + validarNombreCompuesto("Francisco Manuel") + "\n"); // true
        
        System.out.println("coraima: " + validarNombreSimple("coraima")); // false
        System.out.println("cORAIMA: " + validarNombreSimple("cORAIMA")); // false
        System.out.println("C0r4im4: " + validarNombreSimple("C0r4im4") + "\n"); // false
        
    } //main()
    
    public static boolean validarNombreSimple(String nombre) {
        return nombre.matches("^[A-ZÁÉÍÓÚ]{1}[a-záéíóú]+$");
    } // validarNombreSimple(String nombre)
    
    public static boolean validarNombreCompuesto(String nombre) {
//        return nombre.matches("^([A-ZÁÉÍÓÚ]{1}[a-záéíóú]+\\s?){1,2}$"); // nombres simples y compuestos
        return nombre.matches("^([A-ZÁÉÍÓÚ]{1}[a-záéíóú]+\\s?){2}$"); // solo nombres compuestos
    } // validarNombreCompuesto(String nombre)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘