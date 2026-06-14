/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej4clasesabstractas;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------
Ejemplo de clases abstractas. Se crea una clase abstracta llamada ClaseA y dos
clases hijas ClaseB y ClaseC que heredan de ella.
ClaseA contiene un método abstracto que ha de ser implementado en las clases hijas
*/

/**
 * @author Jesús Pérez 
 */
public class Ej4ClasesAbstractas {

    public static void main(String[] args) {
        ClaseB b=new ClaseB();
        ClaseC c=new ClaseC();
        
        System.out.println("Valor de x en la clase B: "+b.getX());
        
        b.metodo1();//Método heredado directamente de ClaseA
        b.metodo2();//implementación del método2() abstracto de A
        c.metodo1();//Método heredado directamente de ClaseA
        c.metodo2();//implementación del método2() abstracto de A
    }//main

}//class
