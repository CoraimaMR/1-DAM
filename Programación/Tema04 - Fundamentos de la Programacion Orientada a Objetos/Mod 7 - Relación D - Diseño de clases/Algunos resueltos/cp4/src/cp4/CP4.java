/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cp4;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------

*/

/**
 * @author Jesús Pérez 
 */
public class CP4 {

    public static void main(String[] args) {
        Texto tex=new Texto(15);
        tex.addInicio("Hola");
        tex.addFinal(" Mundo");
        tex.imprimeCadena();
        tex.addFinal('!');
        tex.imprimeCadena();
        tex.addInicio('¡');
        tex.imprimeCadena();
        System.out.println("\nNúmero de vocales = "+tex.cuentaVocales());
        
    }//main

}//class
