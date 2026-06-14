/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
+++++++++++++++++++++++++++++++++ ENUNCIADO +++++++++++++++++++++++++++++++++++
5. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
información de N personas distintas (valor también introducido por teclado). Para cada
persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe
guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada
género.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class CEjercicio05 {
    public static void main(String[] args) {
        int personas;
        double sueldoHombre=0, sueldoMujer=0;
        int numHombre=0, numMujer=0;
        
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduzca el número de personas: ");
        personas=sc.nextInt();
        
        double sueldos[][]=new double[personas][2];
        
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Persona "+(i+1));
            for (int j = 0; j < sueldos[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Introduzca el género de la persona "
                        + "(0-Masculino / 1-Femenino): ");
                        sueldos[i][j]=sc.nextDouble();
                        break;
                    case 1:
                        System.out.print("Introduzca su sueldo: ");
                        sueldos[i][j]=sc.nextDouble();
                        break;
                    default:
                        throw new AssertionError();
                }//switch               
            }//for interno            
        }//for externo
        
        //Listado de la matriz para comprobación
        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                System.out.print(sueldos[i][j]+ "\t");                
            }
            System.out.println("");
        }//for externo
        
        //Cálculo del sueldo medio
        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i][0]==0.0) {
                sueldoHombre+=sueldos[i][1];
                numHombre++;
            } else {
                sueldoMujer+=sueldos[i][1];
                numMujer++;
            }                    
        }//for externo
        System.out.println("Sueldo medio hombres = "+(sueldoHombre/numHombre));
        System.out.println("Sueldo medio mujeres = "+(sueldoMujer/numMujer));
    }//main
}//class
