/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejemplos;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------
Ejemplo de uso del método String.format()
*/

/*------------------------------- DOCUMENTACIÓN --------------------------------
https://sarreplec.caib.es/pluginfile.php/10272/mod_resource/content/2/PROG06/anexo_i_formateado_de_cadenas_en_java.html
https://www.youtube.com/watch?feature=shared&v=MCzBc5gTwkM
https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Formatter.html#syntax
*/


/*------------ TABLA RÁPIDA DE ESPECIFICADORES ---------------
--------------------------------------------------------------
| Tipo    | Ejemplo                    | Significado         |
| ------- | -------------------------- | ------------------- |
| `%d`    | entero                     | Decimal (int, long) |
| `%f`    | flotante                   | Float/double        |
| `%s`    | texto                      | String              |
| `%c`    | carácter                   | char                |
| `%b`    | booleano                   | true/false          |
| `%.2f`  | decimal 2 cifras           | Precisión           |
| `%10s`  | ancho 10, alineado derecha | Texto               |
| `%-10s` | ancho 10, izquierda        | Texto               |
| `%02d`  | relleno con ceros          | 01, 02…             |

*/

/**
 * @author Jesús Pérez 
 */
public class EjemploFormat {

    public static void main(String[] args) {
        //Utilizaremos String.format() fundamentalmente para números
        //%d - indica la parte entera de un número
        //%f - indica la parte decimal de un número
        
        int entero=14;
        double decimal=23.36;
        double porcentaje=0.25;
        double precio = 1234.5;
        
        //EJEMPLO DE USO DE NÚMEROS ENTEROS
        //Podemos indicarle a %d que queremos rellenar con 0 o blancos
        System.out.println("--- EJEMPLO CON NÚMEROS ENTEROS ---");
        System.out.println("\nImpresión del entero sin String.format()");
        System.out.println(entero);
        
        System.out.println("\nImpresión del entero con 2 ceros a la izda");
        System.out.println(String.format("%04d", entero));
        
        System.out.println("\nImpresión del entero con 2 espacios a la izda");
        System.out.println(String.format("%4d", entero));
        
        System.out.println("\nImpresión del entero con 40 cifras");
        System.out.println(String.format("%040d", entero));
        
        System.out.println("\nImpresión del entero con 38 espacios a la izda");
        System.out.println(String.format("%40d", entero));
        
        System.out.println("\nSeparador de miles");
        System.out.println(String.format("%,d", 1000000)); // 1,000,000

        System.out.println("");
        
        
        //EJEMPLO DE USO DE NÚMEROS DECIMALES
        System.out.println("--- EJEMPLO CON NÚMEROS DECIMALES ---");
        System.out.println("\nImpresión del decimal sin String.format()");
        System.out.println(decimal);
        
        System.out.println("\nImpresión del decimal con 3 cifras decimales");
        System.out.println(String.format("%.3f", decimal));
        
        System.out.println("\nImpresión del decimal con 6 cifras decimales");
        System.out.println(String.format("%.6f", decimal));
        
        System.out.println("\nImpresión del decimal con 0 cifras decimales");
        System.out.println(String.format("%.0f", decimal));
        
        System.out.println("\nImpresión del decimal añadiendo 4 decimales");
        System.out.println(String.format("%4f", decimal));
        
        System.out.println("\nImpresión de PI con 6 decimales");
        System.out.println(String.format("%6f", Math.PI));
        
        System.out.println("\nImpresión de PI con 6 decimales");
        System.out.println(String.format("%.6f", Math.PI));
        System.out.println("");
        
        
        //EJEMPLO DE USO DE TEXTOS
        System.out.println("--- EJEMPLO CON TEXTOS ---");
        System.out.println("\nAlinear texto a la derecha");
        System.out.println(String.format("|%10s|", "Java")); // |      Java|

        System.out.println("\nAlinear texto a la izquierda");
        System.out.println(String.format("|%-10s|", "Java")); // |Java     |

        System.out.println("\nImpresión de un carácter");
        System.out.println(String.format("Letra: %c", 'A'));
        System.out.println("");
        
        //OTROS TIPOS DE FORMATOS
        System.out.println("--- OTROS FORMATOS ---");
        
        System.out.println("\nMostrar porcentajes sin decimales");
        System.out.println(String.format("Porcentaje: %.0f%%", porcentaje * 100));
        
        System.out.println("\nMostrar porcentajes con dos decimales");
        System.out.println(String.format("Porcentaje: %.2f%%", porcentaje * 100));
        
        System.out.println("\nMostrar un precio en Euros");
        System.out.println(String.format("Precio: €%,.2f", precio)); // Precio: €1,234.50
        
        System.out.println("\nMezcla de espacios y números");
        System.out.println(String.format("%-10s %8.2f", "Producto", precio)); // Producto    1234,50

        System.out.println("\nImpresión de una hora");
        System.out.println(String.format("La hora actual es %02d:%02d:%02d", 12, 6, 9 ));
        System.out.println("");
        
        
    }//main

}//class
