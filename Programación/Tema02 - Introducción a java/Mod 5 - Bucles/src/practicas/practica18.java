
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 4 nov 2025     ⏰ Hora:
 *
 *  Nombre del programa : practica18
 *
 *******************************************************/

/* 18. Realiza un programa para calcular la suma de los cuadrados de los 5 primeros números
naturales.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;

public class practica18 {

    public static void main(String[] args) {

        //Variables
        double suma=0;
        
        for (int i = 1; i <= 5; i++) {
            suma+=Math.pow(i, 2);
        }
        System.out.println("La suma de los cuadrados de los 5 primeros números naturales es: "
                + String.format("%.0f", suma));
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘