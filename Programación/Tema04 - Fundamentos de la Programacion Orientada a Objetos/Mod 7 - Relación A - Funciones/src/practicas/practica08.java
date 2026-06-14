
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 12 ene 2026     ⏰ Hora: 12:21:26
 *
 *  Nombre del programa : practica07
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des
1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y 
utiliza las funciones:

int suma1aN(int n) | Devuelve la suma de enteros de 1 a n
int producto1aN(int n) | Devuelve el producto de enteros de 1 a n
double intermedio1aN(int n) | Devuelve el valor intermedio entre 1 y n
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Locale;
import java.util.Scanner;

public class practica08 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        int n;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        n = sc.nextInt();
        
        // Mostramos el resultado
        System.out.printf("\nSuma de enteros de 1 a %d: %d", n, suma1aN(n));
        System.out.printf("\nProducto de enteros de 1 a %d: %.2f", n, producto1aN(n));
        System.out.printf("\nValor intermedio de 1 a %d: %.2f\n", n, intermedio1aN(n));

    } //main()
    
    public static int suma1aN(int n) {
    
        // Declaración de variables
        int suma1aN = 0;
        
        // Empezamos a crear el interior del programa
        for (int i = 1; i <= n; i++) {
            suma1aN =+ i;
        }
        
        // Devuelvo el resultado
        return suma1aN;  
        
    } // suma1aN(n)

    public static double producto1aN(int n) {
    
        // Declaración de variables
        double producto1aN = 1;
        
        // Empezamos a crear el interior del programa
        for (int i = 1; i <= n; i++) {
            producto1aN = producto1aN * i;
        }
        
        // Devuelvo el resultado
        return producto1aN;  
        
    } // producto1aN(n)

    public static double intermedio1aN(int n) {
    
        // Devuelvo el resultado
        return (1 + n) / 2;  
        
    } // intermedio1aN(n)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘