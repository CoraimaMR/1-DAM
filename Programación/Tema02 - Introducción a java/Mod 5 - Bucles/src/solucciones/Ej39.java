/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej39;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------
Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja.
*/

/**
 * @author Jesús Pérez 
 */
public class Ej39 {

    public static void main(String[] args) {
        // Todavía no se han visto arrays y por eso el ejercicio está implementado
        // exclusivamente con variables. Con arrays es mucho más corto.

        int alea1, alea2, alea3;
        String color1="", color2="", color3="";

        //Generamos tres números aleatorios y repetimos hasta que los tres
        //sean distintos
        do {
          alea1 = (int)(Math.random() * 6);
          alea2 = (int)(Math.random() * 6);
          alea3 = (int)(Math.random() * 6);
        } while ((alea1 == alea2) || (alea1 == alea3) || (alea2 == alea3));


        //Averiguamos el color 1
        switch(alea1) {
          case 0:
            color1 = "rojo";
            break;
          case 1:
            color1 = "azul";
            break;
          case 2:
            color1 = "verde";
            break;
          case 3:
            color1 = "amarillo";
            break;
          case 4:
            color1 = "violeta";
            break;
          case 5:
            color1 = "naranja";
            break;
          default:
        }

        //Averiguamos el color 2
        switch(alea2) {
          case 0:
            color2 = "rojo";
            break;
          case 1:
            color2 = "azul";
            break;
          case 2:
            color2 = "verde";
            break;
          case 3:
            color2 = "amarillo";
            break;
          case 4:
            color2 = "violeta";
            break;
          case 5:
            color2 = "naranja";
            break;
          default:
        }

        
        //Averiguamos el color 3
        switch(alea3) {
          case 0:
            color3 = "rojo";
            break;
          case 1:
            color3 = "azul";
            break;
          case 2:
            color3 = "verde";
            break;
          case 3:
            color3 = "amarillo";
            break;
          case 4:
            color3 = "violeta";
            break;
          case 5:
            color3 = "naranja";
            break;
          default:
        }

        System.out.print(color1 + ", " + color2 + ", " + color3);
        System.out.println("");
    }//main

}//class
