
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 23 nov 2025     ⏰ Hora: 19:16:05
 *
 *  Nombre del programa : CuboAgua
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package otros;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CuboAgua {

    public static void main(String[] args) {

        // Declaración de variables
        int altura = 0, anchura = 0, liquido = 0;
        boolean repetir;
        int blanco, relleno;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        // No consideramos un cubo algo con menos de 2 de altura y 3 de anchura
        do {            
            repetir = false;
            try {
                System.out.print("Introduce la altura del cubo (min 2): ");
                altura = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());                
                sc.nextLine();
                repetir = true;
            }
        } while (repetir || altura<2);
        
        do {            
            repetir = false;
            try {
                System.out.print("Introduce la anchura del cubo (min 3): ");
                anchura = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());                
                sc.nextLine();
                repetir = true;
            }
        } while (repetir || anchura<3);
        
        do {            
            repetir = false;
            try {
                System.out.print("Introduce la altura del agua (tiene que ser menor que la altura): ");
                liquido = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());                
                sc.nextLine();
                repetir = true;
            }
        } while (repetir || liquido<0 || liquido>=altura);
        
        // Empezamos a crear el interior del programa
        blanco = (altura-1)-liquido;
        relleno = (altura-1)-blanco;
        
        for (int i = 0; i < blanco; i++) {  // Creamos las lineas sin relleno
            System.out.print("|");  // Primer caracter de la linea
            for (int j = 0; j < anchura-2; j++) {  // Espacios en blanco
                System.out.print(" ");
            }
            System.out.print("|");  // Segundo caracter de la linea
            System.out.println("");  // Siguiente linea
        }//fin lineas sin relleno
        
        for (int i = 0; i < relleno; i++) {  // Creamos las lineas con relleno
            System.out.print("|");  // Primer caracter de la linea
            for (int j = 0; j < anchura-2; j++) {  // Espacios rellenos
                System.out.print("*");
            }
            System.out.print("|");  // Segundo caracter de la linea
            System.out.println("");  // Siguiente linea

        }//fin lineas con relleno
        
        for (int i = 0; i < anchura; i++) {  // Última linea especial
            System.out.print("-");
        }
        System.out.println("");  // Siguiente linea
        
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘