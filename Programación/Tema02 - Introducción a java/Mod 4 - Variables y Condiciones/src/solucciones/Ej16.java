/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
******************************* ENUNCIADO *********************************
Escribe un programa que lea una calificación numérica entre 0 y 10 y la 
transforma en calificación alfabética, escribiendo el resultado.
***************************************************************************
*/
package solucciones;
import java.util.Scanner;
/**
 *
 * @author Jesús Pérez
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    
    //PRIMERA FORMA
    public static void main(String[] args) {
       float nota;
       
       Scanner sc=new Scanner(System.in);
       
        System.out.println("Introduzca la nota");
        nota=sc.nextFloat();
        
        if (nota<3.0) 
            System.out.println("MUY DEFICIENTE");
         else 
            if (nota<5.0) 
                System.out.println("INSUFICIENTE");     
            else 
                if (nota<6.0)
                    System.out.println("SUFICIENTE");
                else
                    if (nota<9.0) 
                        System.out.println("NOTABLE");
            
                    else 
                        System.out.println("SOBRESALIENTE");
        }
    }