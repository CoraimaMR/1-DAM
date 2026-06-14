
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 14 nov 2025     ⏰ Hora: 17:57:31
 *
 *  Nombre del programa : practica39
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Ejercicio 39
Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren sustituir el color blanco por 
colores más alegres. Realiza un programa que genere de forma aleatoria una secuencia de tres 
colores aleatorios (uno para cada dormitorio) de tal forma que no se repita ninguno. Los colores 
entre los que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y naranja.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;

public class practica39 {
    public static void main(String[] args) {
        int n1, n2, n3;
        String  color1 =  "", color2 = "",  color3 = "";
        
        do {
        n1 = (int) (Math.random() * 6) ;
        n2 = (int) (Math.random() * 6);
        n3 = (int) (Math.random() * 6);
        } while (n1==n2 || n2==n3 || n1==n3);
        
        switch(n1) {
          case 0 -> color1 = "rojo";
          case 1 -> color1 = "azul";
          case 2 -> color1 = "verde";
          case 3 -> color1 = "amarillo";
          case 4 -> color1 = "violeta";
          case 5 -> color1 = "naranja";
        }
        
        switch(n2) {
          case 0 -> color2 = "rojo";
          case 1 -> color2 = "azul";
          case 2 -> color2 = "verde";
          case 3 -> color2 = "amarillo";
          case 4 -> color2 = "violeta";
          case 5 -> color2 = "naranja";
        }
        
        switch(n3) {
          case 0 -> color3 = "rojo";
          case 1 -> color3 = "azul";
          case 2 -> color3 = "verde";
          case 3 -> color3 = "amarillo";
          case 4 -> color3 = "violeta";
          case 5 -> color3 = "naranja";
        }
        
        System.out.print(color1 + ", " + color2 + ", " + color3);
        System.out.println("");
        
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘