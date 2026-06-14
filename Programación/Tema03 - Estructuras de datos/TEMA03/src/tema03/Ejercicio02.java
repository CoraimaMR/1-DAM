
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 11 dic 2025     ⏰ Hora: 11:52:09
 *
 *  Nombre del programa : Ejercicio02
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package tema03;
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        
        // Declaración de variables y constantes
        String nombre, usuario = "";
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Introduzca tu nombre completo: ");
        nombre=sc.nextLine().trim();
        
        // Empezamos a crear el interior del programa
        String partes[] = nombre.split("\\s+");
        
        for (int i = 0; i < partes.length; i++) {
            usuario += partes[i].substring(0,1).toUpperCase();
            usuario += partes[i].substring(1,3).toLowerCase();
        }
        
        // Mostramos el resultado
        System.out.println("El nombre de usuario sería: " + usuario);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘