
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 12 ene 2026     ⏰ Hora: 12:11:14
 *
 *  Nombre del programa : practica06
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Escribe un programa que pida cinco precios y muestre por pantalla el precio de 
venta de cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:

double precioConIVA(double precio) | Devuelve el precio tras sumarle un 21% de IVA
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica06 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        double precio;
        int i = 1;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        while (i < 6) {
            System.out.print("Introduzca el precio de "+i+": ");
            precio = sc.nextDouble();
            
            // Mostramos el resultado
            System.out.printf("Con IVA: %.2f $\n", precioConIVA(precio));
            
            i++;
        }
        
    } //main()
    
    public static double precioConIVA(double precio) {
        
        // Devuelvo el resultado
        return precio * 1.21;        
        
    } // precioConIVA(precio)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘