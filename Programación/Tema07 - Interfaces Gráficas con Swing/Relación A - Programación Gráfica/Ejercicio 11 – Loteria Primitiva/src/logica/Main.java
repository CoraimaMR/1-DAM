
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 27 may 2026     ⏰ Hora: 12:37:59
 *
 *  Nombre del programa : Main
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package logica;
import gui.Ventana;
import java.util.Arrays;
import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) {
        
        Ventana window = new Ventana(); // Creo la  nueva instancia "window"
        window.setVisible(true); // Activo la ventana
        window.setLocationRelativeTo(null); // Posicion de la ventana al ejecutar: medio
        
    } //main()

    public static int numeroAleatorio() {
        return (int) (Math.random()*49)+1;
    } // numeroAleatorio()

    public static void selccionarNumeros(JLabel n1, JLabel n2, JLabel n3, JLabel n4, JLabel n5, JLabel n6) {
        
        int[] n = new int[6];
        
        for (int i = 0; i < n.length; i++) {
            n[i] = numeroAleatorio();
        }
        Arrays.sort(n);
        
        n1.setText(Integer.toString(n[0]));
        n2.setText(Integer.toString(n[1]));
        n3.setText(Integer.toString(n[2]));
        n4.setText(Integer.toString(n[3]));
        n5.setText(Integer.toString(n[4]));
        n6.setText(Integer.toString(n[5]));
        
    } // selccionarNumeros(JLabel n1, JLabel n2, JLabel n3, JLabel n4, JLabel n5, JLabel n6)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘