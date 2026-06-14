/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4clasesabstractas;

/**
 *
 * @author Jesús Pérez
 */
/*
Definimoos una clase abstracta A, donde declaramos e inicializamos una variable
entera x. Asimismo, definimos e implementamos un método metodo1().
Tanto la variable como el método serán heredados por las subclases de A.
Por otra parte, declaramos un método abstracto metodo2()
*/

public abstract class ClaseA {
    int x=1;

    public int getX() {
        return x;
    }
    
    void metodo1(){
        System.out.println("Método 1 definido en la clase abstracta A");
    }
    
    abstract void metodo2();
    
}
