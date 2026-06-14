package practicas;
import java.util.Scanner;

/*******************************************************
 * 
 *               💻 PROGRAMACIÓN EN JAVA 💻
 *
 *  Autor/a:     Coraima Mera Rodríguez
 *  Curso:       1º de DAM
 *  Fecha:       3 nov 2025
 *
 *  Programa :   practica12 CORREGIDO
 *
 *******************************************************/

/* 12. Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del operador de
potencia (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado por
pantalla. */

public class practica12 {

    public static void main(String[] args) {

        //Variables
        double base=0.0, exponente=-1.0, potencia=1.0;
        
        //Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la base de la potencia:");
        base = sc.nextDouble();
        
        System.out.println("Introduce el exponente del número:");
        exponente = sc.nextDouble();
        
        for (int i = 1; i <= Math.abs(exponente); i++) {
            potencia*=base; //potencia=potencia*base
        }
        
        if (exponente<0) {
            System.out.println("Potencia = "+(1/potencia));
        } else {
            System.out.println("Potencia = "+potencia);
        }
    }
}
