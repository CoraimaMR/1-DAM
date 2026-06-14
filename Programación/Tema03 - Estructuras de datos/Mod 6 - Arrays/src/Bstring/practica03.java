
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 1 dic 2025     ⏰ Hora: 18:50:08
 *
 *  Nombre del programa : practica03
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que pida por teclado tres cadenas de texto: nombre y dos 
apellidos. Luego mostrará un código de usuario (en mayúsculas) formado por la 
concatenación de las tres primeras letras de cada uno de ellos. Por ejemplo si 
se introduce “Lionel”, “Tarazón” y “Alcocer” mostrará “LIOTARALC”.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Bstring;
import java.util.Scanner;

public class practica03 {

    public static void main(String[] args) {

        // Declaración de variables
        String nombre;
        String apellido1;
        String apellido2;
        String codNombre;
        String codApe1;
        String codApe2;
        String codigoFinal;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();

        System.out.print("Introduce tu primer apellido: ");
        apellido1 = sc.nextLine();

        System.out.print("Introduce tu segundo apellido: ");
        apellido2 = sc.nextLine();
        
        // Empezamos a crear el interior del programa
        // Obtener las primeras 3 letras de cada cadena
        codNombre = nombre.substring(0, 3);
        codApe1 = apellido1.substring(0, 3);
        codApe2 = apellido2.substring(0, 3);

        // Sumar y convertir a mayúsculas
        codigoFinal = (codNombre + codApe1 + codApe2).toUpperCase();

        // Mostramos el resultado
        System.out.println("\nCódigo de usuario: " + codigoFinal);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘