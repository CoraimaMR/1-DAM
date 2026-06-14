
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 10 nov 2025     ⏰ Hora: 12:50:37
 *
 *  Nombre del programa : practica32
 *
 *******************************************************/

/* Ejercicio 32
Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. 
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno 
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria 
entre 1 y 40 caracteres.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;

public class practica32 {

    public static void main(String[] args) {
        // Empezamos a crear el interior del programa
        //Genero 10 lineas
        for (int i = 1; i <= 10; i++) {
            //Calculo la longitud de la linea
            int longitud = (int) ((Math.random()*40)+1);
            for (int j = 1; j <= longitud; j++) {
                //Calculo el caracter del número aleatorio
                int caracter = (int) (Math.random()*6)+1;
                switch (caracter) {
                    case 1: System.out.print("*");
                        break;
                    case 2: System.out.print("-");
                        break;
                    case 3: System.out.print("=");
                        break;
                    case 4:  System.out.print(".");
                        break;
                    case 5: System.out.print("|");
                        break;
                    case 6: System.out.print("@");
                        break;
                }
            }
            System.out.println("");
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘