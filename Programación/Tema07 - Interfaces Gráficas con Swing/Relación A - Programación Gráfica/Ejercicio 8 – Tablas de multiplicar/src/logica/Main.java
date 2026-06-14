
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 19 may 2026     ⏰ Hora: 9:57:46
 *
 *  Nombre del programa : Main
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Aplicación gráfica que muestre las tablas de multiplicar del 1 al 10. Utiliza un
JTable de 10 filas por 10 columnas y muestra los valores de cada tabla de 
multiplicar en una fila distinta.
Extra 1: Inserta los valores en la tabla en tiempo de ejecución, por ejemplo al 
presionar un botón.
Extra 2: Añade dos campos de texto A y B para que el usuario pueda introducir 
dos números enteros y se muestren todas las tablas de multiplicar desde A hasta
B. Ten en cuenta que el número de filas es variable.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package logica;
import gui.Ventana;
import gui.Ventana_v1;
import gui.Ventana_v2;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main {

    public static void main(String[] args) {
        
//        // Versión normal
//        Ventana window = new Ventana(); // Creo la  nueva instancia "window"
//        window.setVisible(true); // Activo la ventana
//        window.setLocationRelativeTo(null); // Posicion de la ventana al ejecutar: medio
        
//        // Versión 1
//        Ventana_v1 window_v1 = new Ventana_v1(); // Creo la  nueva instancia "window"
//        window_v1.setVisible(true); // Activo la ventana
//        window_v1.setLocationRelativeTo(null); // Posicion de la ventana al ejecutar: medio
        
        // Versión 2
        Ventana_v2 window_v2 = new Ventana_v2(); // Creo la  nueva instancia "window"
        window_v2.setVisible(true); // Activo la ventana
        window_v2.setLocationRelativeTo(null); // Posicion de la ventana al ejecutar: medio
        
    } //main()
    
    public static void generarTabla(JTable tabla) {
        
        Object[][] datos = new Object[10][10];
        String[] cabecera = new String[10];

        // Crear cabeceras
        for (int i = 0; i < 10; i++) {
            cabecera[i] = "Tabla " + (i + 1);
        }
        
        // Llenar datos
        for (int i = 0; i < 10; i++) { // Columnas
            int tablaActual = i + 1;
            for (int j = 0; j < 10; j++) { // Filas
                datos[i][j] = tablaActual * (j + 1);
            }
        }
        tabla.setModel(new DefaultTableModel(datos, cabecera));
        
    } // generarTabla(JTable tabla)
    
    public static void generarTablaRango(JTable tabla, int A, int B){
        
        int columnas = B - A + 1;
        int filas = 10;

        Object[][] datos = new Object[filas][columnas];
        String[] cabecera = new String[columnas];

        // Crear cabeceras
        for (int i = 0; i < columnas; i++) {
            cabecera[i] = "Tabla " + (A + i);
        }
        
        // Llenar datos
        for (int i = 0; i < columnas; i++) { // Columnas
            int tablaActual = A +  i;
            for (int j = 0; j < filas; j++) { // Filas
                int multiplicador = j + 1;
                datos[j][i] = tablaActual + " x " + multiplicador + " = " + (tablaActual * multiplicador);
            }
        }
        tabla.setModel(new DefaultTableModel(datos, cabecera));
        
    } // generarTablaRango(JTable tabla, int A, int B)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘