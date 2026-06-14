/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jesús Pérez
 */
/* 
EJEMPLO DE ARRAYS DE 3 DIMENSIONES
*/
import java.util.Scanner;

public class EjemploArray3Dimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro Scanner
        Scanner sc=new Scanner(System.in);
        
        //Array de 4 profundidades, 3 filas y 2 columnas
        int cubo1[][][]=new int [4][3][2];
        
        //Array de 3 filas, 4 columnas y 2 profundidades
        //Se debe interpretar como cubo2[profundidad][fila][columna]
        int[][][] cubo2 = {
                           {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}},
                           {{13, 14, 15, 16}, {17, 18, 19, 20}, {21, 22, 23, 24}}
                           };
        
        //**********************************************************************
        //Imprimos los valores de cubo2
        System.out.println("CUBO 2");
        System.out.println("Profundidades = "+cubo2.length);
        System.out.println("Filas = "+cubo2[0].length);
        System.out.println("Columnas = "+cubo2[0][0].length);
        System.out.println("");
        
        for (int i = 0; i < cubo2.length; i++) {
            System.out.println("PROFUNDIDAD "+i);
            for (int j = 0; j < cubo2[i].length; j++) {
                for (int k = 0; k < cubo2[i][j].length; k++) {
                    System.out.print(cubo2[i][j][k]+"\t");                    
                }
                System.out.println("");
            }
            System.out.println("");
                      
        }//for externo
        
        //**********************************************************************        
        //Relleno cubo1
        for (int i = 0; i < cubo1.length; i++) {
            System.out.println("PROFUNDIDAD "+i);
            for (int j = 0; j < cubo1[i].length; j++) {
               for (int k = 0; k < cubo1[i][j].length; k++) {
                   System.out.printf("cubo1[%d][%d][%d] = ",i,j,k); 
                   cubo1[i][j][k]=sc.nextInt();              
                }
                System.out.println("");
            }
            System.out.println("");
                      
        }//for externo
        
        //**********************************************************************
        //Muestro cubo1 por pantalla
        for (int i = 0; i < cubo1.length; i++) {
            System.out.println("PROFUNDIDAD "+i);
            for (int j = 0; j < cubo1[i].length; j++) {
               for (int k = 0; k < cubo1[i][j].length; k++) {
                   System.out.print("| "+cubo1[i][j][k]+" |");              
                }
                System.out.println("");
            }
            System.out.println("");
                      
        }//for externo
        
    }//main   
}