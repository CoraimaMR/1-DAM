
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 7 abr 2026     ⏰ Hora: 9:44:20
 *
 *  Nombre del programa : ejercicio07
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Validar una matrícula y una fecha
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;

public class ejercicio07 {

    public static void main(String[] args) {

        System.out.println("7. Validar una matrícula y una fecha.\n");
        
        System.out.println("1676 PGR: " + validarMatricula("1676 PGR")); // true
        System.out.println("9856LPM: " + validarMatricula("1676PGR")); // true
        System.out.println("25/2/2026: " + validarFecha("25/2/2026")); // true
        System.out.println("25-02-2026: " + validarFecha("25-02-2026") + "\n"); // true
        
        System.out.println("6489 POUA: " + validarMatricula("6489 POUA")); // false
        System.out.println("40/06/30: " + validarFecha("40/06/30")); // false
        System.out.println("1102026: " + validarFecha("1102026") + "\n"); // false

    } //main()
    
    public static boolean validarMatricula(String matricula) {
        return matricula.matches("^\\d{4}\\s?[BCDFGHJKLMNPRSTVWXYZ]{3}$");
    } // validarMatricula(String matricula)
    
    public static boolean validarFecha(String fecha) {
        // Formato dd/mm/aaaa
        return fecha.matches("^(0[1-9]|[12][0-9]|3[01])[/,-](0?[1-9]|1[0-2])[/,-]\\d{4}$");
    } // validarFecha(String fecha)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘