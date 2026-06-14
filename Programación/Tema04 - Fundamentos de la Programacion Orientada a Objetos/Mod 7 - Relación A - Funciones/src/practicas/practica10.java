
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 12 ene 2026     ⏰ Hora: 13:14:58
 *
 *  Nombre del programa : practica10
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
 Realiza un programa que lea una fecha introduciendo el día, mes y año por 
 separado y nos diga si la fecha es correcta o no. Supondremos que todos los 
 meses tienen 30 días. Se debe crear una función donde le pasemos los datos y 
 devuelva si es correcta o no.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica10 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        int dia, mes, año;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Día: ");
        dia = sc.nextInt();
        
        System.out.print("Mes: ");
        mes = sc.nextInt();
        
        System.out.print("Año: ");
        año = sc.nextInt();
        
        // Mostramos el resultado
        if (correcto (dia, mes, año)) {
            System.out.println("Es CORRECTO.");
        } else {
            System.out.println("Es INCORRECTO.");
        }

    } //main()
    
    public static boolean correcto (int dia, int mes, int año){
        
//        // Declaración de variables
//        boolean correcto = false;
//
//        // Empezamos a crear el interior del programa
//        if ( 0 <=dia && dia<31 ) {
//            if ( 0<=mes && mes<13) {
//                if ( 0<=año ) {
//                    correcto = true;
//                }
//            }
//        }
//        
//        // Devuelvo el resultado
//        return correcto;   
        
        return (0<=dia && dia<31 && 0<=mes && mes<13 && 0<=año);
        
    } // correcto (dia, mes, año)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘