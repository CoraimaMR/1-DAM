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
 *  Programa :   practica10 
 *
 *******************************************************/

/* 10. Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10) que
termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10. */

public class practica10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota,diez = 0;
        
        do {            
            System.out.println("Introduce la nota:");
            nota = sc.nextInt();
            if (nota==10) {
                diez++;
            }
        } while (nota!=-1);
        
        System.out.println("Hubo un total de "+diez+" notas con un 10.");
    }
   
}
