package practicas;
import java.util.Scanner;

/*******************************************************
 * 
 *               💻 PROGRAMACIÓN EN JAVA 💻
 *
 *  Autor/a:     Coraima Mera Rodríguez
 *  Curso:       1º de DAM
 *  Fecha:       4 nov 2025
 *
 *  Programa :   practica13
 *
 *******************************************************/

/* 13. Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta
adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo (el
usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha pensado). */

public class practica13 {

    public static void main(String[] args) {

        //Variables
        int max=100, min=0, num=0;
        char respuesta=110;
        
        //Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce si es mayor(>), menor(<) o igual(=):");
        respuesta = sc.next().charAt(0);
        
         do {
            // El ordenador hace su "propuesta"
            num = (max + min) / 2;
            System.out.println("¿Es tu número " + num + "?");
            System.out.print("Responde con '>' si tu número es mayor, '<' si es menor, '=' si he acertado: ");
            respuesta = sc.next().charAt(0);

            // Procesar la respuesta
            switch (respuesta) {
                case '>':
                    min = num + 1;
                    break;
                case '<':
                    max = num - 1;
                    break;
                case '=':
                    System.out.println("¡He adivinado tu número! Era el " + num + ".");
                    break;
                default:
                    System.out.println("ERROR. Solo se puede introducir '<', '>' o '='");
            }

        } while (respuesta != '=' && min <= max);
    }
}
