
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
Aplicación gráfica que permita al usuario simular que lanza un dado de juegos de
rol. Podrá elegir entre dado de 6 caras (de 1 a 6), dado de 8 caras (de 1 a 8), 
dado de 10 caras (de 1 a 10), dado de 12 caras (de 1 a 12) y dado de 20 caras 
(de 1 a 20). Utiliza un botón distinto para cada tipo de dado. Muestra en cada 
botón una imagen de cada dado. Puedes encontrar las imágenes fácilmente haciendo
una búsqueda en Internet.
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