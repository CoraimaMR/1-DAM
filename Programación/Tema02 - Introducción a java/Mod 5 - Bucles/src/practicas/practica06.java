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
 *  Programa : practica06 CORREGIDO
 *
 *******************************************************/

/* 6. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha leído
algún número negativo o no. */

public class practica06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean esNegativo=false;
        
        for (int i = 0; i < 10&&!esNegativo; i++) {
            System.out.println("Introduce un número 8"+(1+i)+":");
            n = sc.nextInt();
            if (n<0) esNegativo=true;
        }//for
        
        if (esNegativo) {
            System.out.println("Ha introducido algún número negativo.");
            
        }
   
    }//main
}
