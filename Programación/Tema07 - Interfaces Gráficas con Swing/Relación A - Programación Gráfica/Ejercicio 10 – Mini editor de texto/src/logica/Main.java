
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 26 may 2026     ⏰ Hora: 8:47:39
 *
 *  Nombre del programa : Main
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Aplicación gráfica que funcione como un editor de texto sencillo con un 
JTextArea y botones “Abrir” y “Guardar”. Utiliza un JFileChooser para que el 
usuario pueda elegir archivo.
Extra: Añade un JSlider que permita cambiar el tamaño del texto.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package logica;
import gui.Ventana;
import gui.Ventana_v2;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

public class Main {

    public static void main(String[] args) {
        
//        // Version normal
//        Ventana window = new Ventana(); // Creo la  nueva instancia "window"
//        window.setVisible(true); // Activo la ventana
//        window.setLocationRelativeTo(null); // Posicion de la ventana al ejecutar: medio
        
        // Version extra
        Ventana_v2 window_v2 = new Ventana_v2(); // Creo la  nueva instancia "window_v2"
        window_v2.setVisible(true); // Activo la ventana
        window_v2.setLocationRelativeTo(null); // Posicion de la ventana al ejecutar: medio
        
    } //main()
    
    public static void abrirFile(JFileChooser jFileChooser, JTextArea jTextArea){
        int seleccion = jFileChooser.showOpenDialog(jFileChooser);
    
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();

            try (Scanner lector = new Scanner(file)) { // Si se abre correctamente el fichero 
                jTextArea.setText(""); // Limpiamos el área de texto
                
                while (lector.hasNextLine()) { // Leemos linea x linea
                    jTextArea.append(lector.nextLine() + "\n");
                }
                System.out.println("*** Fichero leído correctamente ***");
                
            } catch (IOException e) { // Da error
                javax.swing.JOptionPane.showMessageDialog(jFileChooser, "Error al abrir el fichero.");
            }
        }
    } // abrirFile(JFileChooser jFileChooser, JTextArea jTextArea)
    
    public static void guardarFile(JFileChooser jFileChooser, JTextArea jTextArea){
        int seleccion = jFileChooser.showSaveDialog(jFileChooser); // Mostramos la ventana de archivos
        
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            
            try (PrintWriter pw = new PrintWriter(file)) { // Si se crea correctamente el fichero
                pw.print(jTextArea.getText()); // Se escribe
                System.out.println("*** Fichero escrito correctamente ***");
                
            } catch (IOException e) { // Da error 
                javax.swing.JOptionPane.showMessageDialog(jFileChooser, "Error al escribir en el fichero.");
            }
        }
    } // guardarFile(JFileChooser jFileChooser, JTextArea jTextArea)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘