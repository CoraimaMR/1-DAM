
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 9 ene 2026     ⏰ Hora: 10:27:50
 *
 *  Nombre del programa : practica04
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
4. Escribe un programa que pida un número entero por teclado y muestre por 
pantalla si es positivo, negativo o cero. Implementa y utiliza la función:

int dimeSigno(int a)
Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica04 {

    public static void main(String[] args) {

        // Declaración de variables
        int a;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        a = sc.nextInt();
        
        // Mostramos el resultado
        switch (dimeSigno(a)) {
            case 0: System.out.println("El número es 0.");
                break;
            case 1: System.out.println("El número es positivo.");
                break;
            case -1: System.out.println("El número es negativo.");
                break;
        }

    } //main()
    
    public static int dimeSigno(int a) {
        // Declaración de variables
        int dimeSigno;
        
        // Empezamos a crear el interior del programa
            if (a==0) {
            dimeSigno = 0;
        } else {
                if (a>0) {
                    dimeSigno = 1;
                } else {
                    dimeSigno = -1;
                }
        }
        
        // Devuelvo el resultado
        return dimeSigno;        
        
    } // dimeSigno

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘