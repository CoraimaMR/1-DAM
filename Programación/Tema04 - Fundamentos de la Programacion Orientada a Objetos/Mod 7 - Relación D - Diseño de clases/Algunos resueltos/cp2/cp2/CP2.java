/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cp2;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------
Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda bombillaON
o bombillaOFF individualmente. Para ello, hacer una clase BOMBILLA con una variable 
privada que indique si está encendida o apagada, así como un método que nos diga
el estado de una bombilla concreta. Además, queremos poner un interruptor general,
de forma que si este se apaga, todas las bombillas quedan apagadas. Cuando el 
interruptor general se activa, las bombillas vuelven a estar encendidas o apagadas, 
según estuvieran antes. Cada bombilla se enciende y se apaga individualmente, 
pero sólo responde que esté encendida si su interruptor particular está activado 
y además hay luz general.
*/

/**
 * @author Jesús Pérez 
 */
public class CP2 {

    public static void main(String[] args) {
        Bombilla b1=new Bombilla();
        Bombilla b2=new Bombilla();
        
        System.out.println("Instanciamos b1 y b2");
        System.out.println("Estado b1: "+b1.imprimeEstado());
        System.out.println("Estado b2: "+b2.imprimeEstado());
        System.out.println("");
        
        b1.bombillaON();
        b2.bombillaON();
        
        System.out.println("Encendemos b1 y b2");
        System.out.println("Estado b1: "+b1.imprimeEstado());
        System.out.println("Estado b2: "+b2.imprimeEstado());
        System.out.println("");
        
        
        System.out.println("Cortamos la luz");
        Bombilla.cortarLuz();
        
        System.out.println("Estado b1: "+b1.imprimeEstado());
        System.out.println("Estado b2: "+b2.imprimeEstado());
        System.out.println("");        
        
        System.out.println("Damos la luz");
        Bombilla.darLuz();
        
        System.out.println("Estado b1: "+b1.imprimeEstado());
        System.out.println("Estado b2: "+b2.imprimeEstado());
        System.out.println("");
                
        System.out.println("Apagamos b1");
        b1.bombillaOFF();
        System.out.println("Estado b1: "+b1.imprimeEstado());
        System.out.println("Estado b2: "+b2.imprimeEstado());        
        System.out.println("");
        
        System.out.println("Cortamos la luz");
        Bombilla.cortarLuz();
        
        System.out.println("Estado b1: "+b1.imprimeEstado());
        System.out.println("Estado b2: "+b2.imprimeEstado());
        System.out.println("");
        
        System.out.println("Damos la luz");
        Bombilla.darLuz();
        
        System.out.println("Estado b1: "+b1.imprimeEstado());
        System.out.println("Estado b2: "+b2.imprimeEstado());
        System.out.println("");
    }//main

}//class
