
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 18 may 2026     ⏰ Hora: 12:30:07
 *
 *  Nombre del programa : Main
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Aplicación gráfica que permita obtener un número aleatorio cada vez que se pulse
un botón. Deberá incluir un JSlider entre 1 y 100 que permita al usuario elegir
el valor máximo del número aleatorio a generar. Así, por ejemplo, si el usuario
pone el slider a 25, cada vez que le de al botón se mostrará un número aleatorio
entre 0 y 25.
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
        
    } //main()

    public static String generarNumero(int max) {
        int n = (int) ((Math.random() * max) + 1 );
        
        return Integer.toString(n);
    } // generarNumereo(String s)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘