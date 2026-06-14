
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 29 ene 2026     ⏰ Hora: 13:27:08
 *
 *  Nombre del programa : Ejercicio06
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Diseña un programa que realice diversas acciones utilizando siempre funciones 
recursivas. Deberá tener un menú principal que permita seleccionar cada una de 
ellas, las cuales serán las siguientes:
1. Crea un método que obtenga la suma de los números naturales desde 1 hasta n. 
Se debe pasar como parámetro el número n.
2. Crea un método que imprima los dígitos desde 1 hasta n. Se debe pasar como 
parámetro el número n.
3. Crea un método que imprima los dígitos desde n hasta 1. Se debe pasar como 
parámetro el número n.
4. Crea un método que obtenga la cantidad de dígitos de un número n. Se debe 
pasar como parámetro el número n.
5. Crea un método que dado un número, lo imprima invertido por pantalla.

Documentar convenientemente la clase utilizando JAVADOC.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Recursividad;
import java.util.Scanner;

/*******************************************************************************
 * Clase principal que contiene el método main y los métodos recursivos.
 *
 * @author 🌟 Coraima Mera Rodríguez 🌟
 * @since 29 ene 2026
 * @version 1.0
 *******************************************************************************/

public class Ejercicio06 {

    public static void main(String[] args) {

        // Scanner para leer datos por teclado
        Scanner sc = new Scanner(System.in);

        // Variables para el menú y los números
        int opcion;
        int n;

        // Menú principal (se repite hasta que el usuario elija salir)
        do {
            System.out.println("\n===== MENÚ RECURSIVO =====");
            System.out.println("1. Suma de números desde 1 hasta n");
            System.out.println("2. Imprimir números desde 1 hasta n");
            System.out.println("3. Imprimir números desde n hasta 1");
            System.out.println("4. Cantidad de dígitos de un número");
            System.out.println("5. Imprimir un número invertido");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            // Estructura switch para seleccionar la opción elegida
            switch (opcion) {

                case 1:
                    // Opción 1: suma recursiva
                    System.out.print("Introduce n: ");
                    n = sc.nextInt();
                    System.out.println("La suma es: " + sumaRecursiva(n));
                    break;

                case 2:
                    // Opción 2: imprimir de 1 a n
                    System.out.print("Introduce n: ");
                    n = sc.nextInt();
                    imprimirAscendente(n);
                    System.out.println();
                    break;

                case 3:
                    // Opción 3: imprimir de n a 1
                    System.out.print("Introduce n: ");
                    n = sc.nextInt();
                    imprimirDescendente(n);
                    System.out.println();
                    break;

                case 4:
                    // Opción 4: contar dígitos
                    System.out.print("Introduce un número: ");
                    n = sc.nextInt();
                    System.out.println("Cantidad de dígitos: " + contarDigitos(n));
                    break;

                case 5:
                    // Opción 5: invertir número
                    System.out.print("Introduce un número: ");
                    n = sc.nextInt();
                    invertirNumero(n);
                    System.out.println();
                    break;

                case 0:
                    // Salida del programa
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    // Opción incorrecta
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    } // main()

    /**
     * Calcula la suma de los números desde 1 hasta n usando recursividad.
     * Caso base: si n es 1 o menor, se devuelve n.
     * Caso recursivo: n + sumaRecursiva(n-1)
     */
    public static int sumaRecursiva(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumaRecursiva(n - 1);
    }

    /**
     * Imprime los números desde 1 hasta n.
     * Primero se llama a n-1 y luego se imprime n.
     */
    public static void imprimirAscendente(int n) {
        if (n == 0) {
            return; // caso base
        }
        imprimirAscendente(n - 1);
        System.out.print(n + " ");
    }

    /**
     * Imprime los números desde n hasta 1.
     * Primero imprime n y luego se llama a n-1.
     */
    public static void imprimirDescendente(int n) {
        if (n == 0) {
            return; // caso base
        }
        System.out.print(n + " ");
        imprimirDescendente(n - 1);
    }

    /**
     * Cuenta la cantidad de dígitos de un número.
     * Se divide el número entre 10 en cada llamada recursiva.
     */
    public static int contarDigitos(int n) {
        if (n < 10 && n > -10) {
            return 1; // un solo dígito
        }
        return 1 + contarDigitos(n / 10);
    }

    /**
     * Imprime un número invertido por pantalla.
     * Muestra el último dígito y sigue con el resto.
     */
    public static void invertirNumero(int n) {
        if (n < 10 && n > -10) {
            System.out.print(Math.abs(n));
        } else {
            System.out.print(Math.abs(n % 10));
            invertirNumero(n / 10);
        }
    }

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘
