
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 12 ene 2026     ⏰ Hora: 14:02:31
 *
 *  Nombre del programa : practica13
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
 Realiza un programa que calcule el porcentaje de descuento que nos han hecho al
 comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad con el 
 descuento aplicado. Se debe crear una función a la que le pasemos ambos valores
 y nos devuelva el descuento.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica13 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        int conDescuento, sinDescuento;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca el artículo con descuento: ");
        conDescuento = sc.nextInt();
        
        System.out.print("Introduzca el artículo sin descuento: ");
        sinDescuento = sc.nextInt();
        
        // Mostramos el resultado
        System.out.println("El descuento es de "+calcularDescuento (conDescuento, sinDescuento)+" %");

    } //main()
    
    public static int calcularDescuento ( int conDescuento, int sinDescuento){
        
        // Declaración de variables
        int calcularDescuento = 0;

        // Empezamos a crear el interior del programa
        calcularDescuento = sinDescuento - conDescuento;
        
        // Devuelvo el resultado
        return calcularDescuento;        
        
    } // calcularDescuento (conDescuento, sinDescuento)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘