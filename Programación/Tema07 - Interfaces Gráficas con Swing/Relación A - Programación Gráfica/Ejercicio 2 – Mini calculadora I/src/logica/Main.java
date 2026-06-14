
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
Aplicación gráfica que permita introducir dos números reales y calcular el 
resultado de su suma, resta, multiplicación o división. Utiliza un JButton 
distinto para cada operación y un único JLabel para mostrar el resultado.
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
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘