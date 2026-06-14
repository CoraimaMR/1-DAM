
/*******************************************************
 *                                                     *
 *             💻  PROGRAMACIÓN EN JAVA  💻             *
 *                                                     *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟             *
 *  Curso:       Programación de 1º  DAM               *
 *                                                     *
 *     🗓️ Fecha: 17 nov 2025     ⏰ Hora: 12:46:25      *
 *                                                     *
 *  Nombre del programa : practica01vectores           *
 *                                                     *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que pida diez números reales por teclado, los almacene en un 
array, y luego muestre todos sus valores.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;

public class practica01vectores {

    public static void main(String[] args) {

        // Declaración de variables
        int[] v1;  //Declaro el vector
        
        v1=new int[10]; //Se trata de un vector de tamaño 10
        
        // Empezamos a crear el interior del programa
        for (int i = 0; i < v1.length; i++) {
        v1[i]=(int)(Math.random()*100); //Número aleatorio entre 0 y 99
        }       
        
        // Mostramos resultado
        System.out.println("Valores aleatorios de v3:");
        for (int i : v1) {
         System.out.print(i+" ");
        }
        System.out.println("");
        
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘