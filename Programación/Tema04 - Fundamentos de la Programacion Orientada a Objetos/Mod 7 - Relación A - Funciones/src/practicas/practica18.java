
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 16 ene 2026     ⏰ Hora: 8:32:08
 *
 *  Nombre del programa : practica18
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide 
el número de DNI entre 23 y el resto es codificado por una letra según la 
siguiente equivalencia:

0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",
10:"X", 11: "B", 12: "N", 13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 
19: "L", 20: "C", 21: "K", 22: "E".

Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. 
Para ello se deberá crear una función a la que se le pase el número y devuelva 
la letra.

Ejemplo: para el DNI 56321122 el NIF es ‘X’.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 16 ene 2026 ⏰ Hora: 8:32:08
* @version 1.0
*******************************************************************************/

public class practica18 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        int dni;
        char letra;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        dni = sc.nextInt();
        
        // Empezamos a crear el interior del programa

        // Mostramos el resultado
        letra = calcularDNI(dni);
        System.out.println("La letra del DNI es: "+letra);

    } //main()
    
    public static char calcularDNI (int dni){

        // Empezamos a crear el interior del programa
        String letra = "TRWAMYFPDXBNJZSQVHLCKE";
        
        // Devuelvo el resultado
        return letra.charAt(dni%23);        
        
    } // char calcularDNI (int dni)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘