
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
Aplicación gráfica que permite introducir dos números enteros (A y B) y permita 
realizar tres cálculos distintos: sumatorio de A a B, productorio de A a B y 
exponencial A^B (A elevado a B). Utiliza tres JRadioButton (uno para cada 
cálculo) y un botón “¡Calcula!”.
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

    public static long Sumatorio(int a, int b) {
        long resultado = 0;
            for (int i = a; i <= b; i++) {
                resultado += i;
            }
        return resultado;
    }

    public static long Productorio(int a, int b) {
        long resultado = 0;
            for (int i = a; i <= b; i++) {
                resultado += i;
            }
        return resultado;
    }

    public static long Exponencial(int a, int b) {
        long resultado = 0;
            for (int i = 1; i <= b; i++) {
                resultado += a;
            }
        return resultado;
    }
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘