
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 26 may 2026     ⏰ Hora: 10:11:14
 *
 *  Nombre del programa : Main
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Aplicación gráfica que simule una ventana de inicio de sesión y registro de 
usuarios. El usuario podrá introducir su nombre de usuario, contraseña 
(JPasswordField) y apretar un botón de “Iniciar sesión”. Muestra el resultado 
del intento de inicio de sesión en un cuadro de diálogo (JoptionPane).

Los usuarios registrados y sus contraseñas estaran en el archivo ‘users.txt’. 
Crea unos pocos usuarios de ejemplo para probar la aplicación. No está permitido
utilizar espacios ni en los nombres de usuario ni en las contraseñas.

Extra: Añade un botón “Crear usuario” que registre un nuevo usuario.
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