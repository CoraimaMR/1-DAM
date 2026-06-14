/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* RELACIÓN D - EJERCICIO 9
Realiza un programa que calcule la estatura media, mínima y máxima en
centímetros de personas de diferentes países. El array que contiene los
nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
“USA”}. Los datos sobre las estaturas se deben simular mediante un
array de 4 filas por 10 columnas con números aleatorios generados al azar entre
140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
los países se deben mostrar utilizando el array de países (no se pueden escribir
directamente).
*/

/**
 *
 * @author Jesús Pérez
 */
public class DEjercicio09 {
    public static void main(String[] args) {
        String[] paises={"España", "Rusia", "Japón", "USA"};
        int[][] estaturas=new int[4][10];
        int max=140, min=210, suma;
        
        //Genero las estaturas aleatorias de la matriz
        for (int i = 0; i < estaturas.length; i++) {
            for (int j = 0; j < estaturas[0].length; j++) {
                estaturas[i][j]=(int)(140+Math.random()*71);                
            }
        }//for externo
        
        //Letreros de la primera fila
        System.out.print("PAÍS\t");
        for (int i = 0; i < estaturas[0].length; i++) {
            System.out.print(i+"   ");            
        }
        System.out.print(" | ");
        System.out.print("MAX ");
        System.out.print("MIN ");
        System.out.print("MED ");
        
        System.out.println("");
        
        //Imprimo países, estaturas y estadísticas
        for (int i = 0; i < estaturas.length; i++) {
            System.out.print(paises[i]+":\t");
            suma=0;
            max=140;
            min=210;
            for (int j = 0; j < estaturas[0].length; j++) {
                System.out.print(estaturas[i][j]+" ");                  
                if (estaturas[i][j]<min) {
                    min=estaturas[i][j];
                }
                if (estaturas[i][j]>max) {
                    max=estaturas[i][j];
                }
                suma+=estaturas[i][j];
            }
            System.out.print(" | ");
            System.out.print(max+" ");
            System.out.print(min+" ");
            System.out.print((suma/estaturas[0].length)+" ");
            System.out.println("");//Salto de línea
        }//for externo
            
        
    }//main
}
