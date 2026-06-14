
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 12 may 2026     ⏰ Hora: 9:55:17
 *
 *  Nombre del programa : Main
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Aplicación gráfica que permita introducir un número entero y luego saber si 
dicho número es par o impar. Utiliza un JTextField para introducir el valor, un
JButton con el texto “¿par o impar?” y un JLabel para mostrar “PAR” o “IMPAR” 
según el caso.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package logica;
import gui.Ventana;

public class Main {

    public static void main(String[] args) {
        
        Ventana window = new Ventana(); // Creo la  nueva instancia "window"
        window.setVisible(true); // Activo la ventana
        window.setLocationRelativeTo(null); // Posicion de la ventana al ejecutar: medio
//        window.setResizable(false);
    } //main()

    public static String esPar(String text) {
        try {
            int n;
            n = Integer.parseInt(text);
            
            if (n % 2 == 0) {
                return "PAR";
            } else {
                return "IMPAR";
            }
        
        } catch (Exception e) { // ERROR general
            return "ERROR";
        }        
    } // esPar(String text)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘