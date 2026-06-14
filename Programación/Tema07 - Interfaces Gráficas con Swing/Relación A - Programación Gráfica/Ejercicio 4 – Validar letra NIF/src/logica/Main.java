
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
Aplicación gráfica que permita introducir un NIF (8 números y una letra 
utilizando un JFormattedTextField) e indique si la letra de dicho NIF es válida.
Más información en este enlace: 

http://www.interior.gob.es/web/servicios-al-ciudadano/dni/calculo-del-digito-de-control-del-nif-nie
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

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘