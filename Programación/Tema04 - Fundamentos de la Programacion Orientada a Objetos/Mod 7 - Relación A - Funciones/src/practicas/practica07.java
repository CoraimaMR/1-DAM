
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 12 ene 2026     ⏰ Hora: 12:31:10
 *
 *  Nombre del programa : practica07
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Escribe un programa que pida el ancho y alto de un rectángulo y muestre por 
pantalla su área y su perímetro. Implementa y utiliza las funciones:

double perimetroRectangulo(double ancho, double alto) | Devuelve el perímetro
double areaRectangulo(double ancho, double alto) | Devuelve el área
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica07 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        int ancho, alto;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca el ancho: ");
        ancho = sc.nextInt();
        
        System.out.print("Introduzca el alto: ");
        alto = sc.nextInt();
        
        // Mostramos el resultado
        System.out.printf("\nÁrea: %.2f\n", areaRectangulo(ancho, alto));
        System.out.printf("Perímetro: %.2f\n", perimetroRectangulo(ancho, alto));

    } //main()
    
    public static double perimetroRectangulo(double ancho, double alto) {
    
        // Devuelvo el resultado
        return (2*ancho) * (2*alto);  
        
    } // perimetroRectangulo(ancho, alto)

    public static double areaRectangulo(double ancho, double alto) {
    
        // Devuelvo el resultado
        return ancho * alto;  
        
    } // areaRectangulo(ancho, alto)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘