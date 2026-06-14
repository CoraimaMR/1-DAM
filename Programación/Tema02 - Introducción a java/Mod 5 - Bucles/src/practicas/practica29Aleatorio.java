
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 10 nov 2025     ⏰ Hora: 12:00:16
 *
 *  Nombre del programa : practica29
 *
 *******************************************************/

/* Ejercicio 29
Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también
la suma total (los puntos que suman entre los tres dados).  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;

public class practica29Aleatorio {

    public static void main(String[] args) {

        // Variables
        int dado1 = (int) (Math.random() * 6)+1; // Se suma 1 para no dar 0 
        int dado2 = (int) (Math.random() * 6)+1;    
        int dado3 = (int) (Math.random() * 6)+1;   
        
        int suma=dado1+dado2+dado3;
        
        //Mostramos resultado
        System.out.println("---------------------------------------");
        System.out.println("Tirada del dado 1: "+dado1);
        System.out.println("Tirada del dado 2: "+dado2);
        System.out.println("Tirada del dado 3: "+dado3);
        System.out.println("");
        System.out.println("Suma total de las tres tiradas: "+suma);
        System.out.println("---------------------------------------");

    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘