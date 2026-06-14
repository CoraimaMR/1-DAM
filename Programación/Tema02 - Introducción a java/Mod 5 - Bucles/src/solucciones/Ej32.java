/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
*********************************** ENUNCIADO ***********************************
32. Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. 
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno 
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria 
entre 1 y 40 caracteres.
********************************************************************************
*/

package ej32;

/**
 *
 * @author Jesús Pérez
 */
public class Ej32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int caracter;
        int longitud;
        
        //Genero las diez líneas
        for (int i = 0; i < 10; i++) {
            
            //Calculo la longitud de cada línea
            longitud=(int)(Math.random()*40)+1;
            
            //Bucle con tope en la longitud calculada anteriormente
            for (int j = 0; j < longitud; j++) {
                
                //Calculo el número del carácter aleatorio
                caracter=(int)(Math.random()*6);
                
                switch (caracter) {
                    case 0:
                        System.out.print("*");
                        break;
                    case 1:
                        System.out.print("-");
                        break;
                    case 2:
                        System.out.print("=");
                        break;
                    case 3:
                        System.out.print(".");
                        break;
                    case 4:
                        System.out.print("|");
                        break;
                    case 5:
                        System.out.print("@");
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            System.out.println("");
        }
    }
    
}
