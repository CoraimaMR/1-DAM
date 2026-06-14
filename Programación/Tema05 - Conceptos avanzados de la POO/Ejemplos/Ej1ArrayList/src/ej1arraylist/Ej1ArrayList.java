/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej1arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------

*/

/**
 * @author Jesús Pérez 
 */
public class Ej1ArrayList {

    public static void main(String[] args) {
        //Declaración y creación de la lista
        ArrayList lista=new ArrayList();
        
        //Añadir cuatro elementros de tipo String a la lista
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");
        
        //Recorrer la lista y mostrar su contenido
        System.out.println("RECORRIDO DE LA LISTA:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            
        }//for
        
        //Inserto un elemento nuevo y vuelvo a recorrer la lista
        System.out.println("\nInserto un elemento nuevo en la posición 2 y vuelvo a recorrer la lista");
        lista.add(2, "dos2");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            
        }//for
        
        //Recorro la lista con un Iterador
        System.out.println("\nRecorro la lista con un ITERADOR:");
        Iterator it=lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }//while        
                
    }//main

}//class
