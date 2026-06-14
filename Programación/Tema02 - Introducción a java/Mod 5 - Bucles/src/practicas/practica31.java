
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 10 nov 2025     ⏰ Hora: 12:22:16
 *
 *  Nombre del programa : practica31
 *
 *******************************************************/

/* Ejercicio 31
Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados
por espacios. Muestra también el máximo, el mínimo y la media de esos números.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;

public class practica31 {

    public static void main(String[] args) {

        // Declaración de variables
        int max=100, min=199, media=0;
        
        // Empezamos a crear el interior del programa
        for (int i = 1; i <= 50; i++) {
            int n=100+(int) (Math.random()*100);
            System.out.print(n+" ");
            if (n > max) max=n;
            if (n < min) min=n;
            media+=n;
        }
        System.out.println("");
        media/=50;
        
        //Mostramos resultados
        System.out.println("-----------------------------------------");
        System.out.println("Número máximo alcanzado: "+max);
        System.out.println("Número minimo alcanzado: "+min);
        System.out.println("");
        System.out.println("Media de los 50 números aleatotios: "+media);
        System.out.println("-----------------------------------------");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘