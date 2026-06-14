/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
+++++++++++++++++++++++++++++++++ ENUNCIADO +++++++++++++++++++++++++++++++++++
4. Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
programa mostrará la nota mínima, máxima y media de cada alumno.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class CEjercicio04 {
    public static void main(String[] args) {
        
        final int ALUMNOS=4;
        final int ASIGNATURAS=5;
        
        
        
        double notas[][]=new double[ALUMNOS][ASIGNATURAS];
        double max, min, suma, media;
        
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        //Solicitamos las notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduzca las notas del alumno "+(i+1));
            for (int j = 0; j < notas[0].length; j++) {
                System.out.print("Nota "+(j+1)+": ");
                notas[i][j]=sc.nextDouble();                
            }
        }//for externo
        
        //Cálculo de máximo, mínimo y media
        for (int i = 0; i < notas.length; i++) {
            System.out.println("ALUMNO "+(i+1));
            
            max=notas[i][0];
            min=notas[i][0];
            suma=0;
            for (int j = 0; j < notas[0].length; j++) {
                if (notas[i][j]>max) {
                    max=notas[i][j];
                }
                if (notas[i][j]<min) {
                    min=notas[i][j];
                }
                suma+=notas[i][j];
            }
            System.out.println("max = " + max);
            System.out.println("min = " + min);
            System.out.println("Media = "+(suma/ASIGNATURAS));
            System.out.println("");
        }//for externo
    }//main
 
}//class
