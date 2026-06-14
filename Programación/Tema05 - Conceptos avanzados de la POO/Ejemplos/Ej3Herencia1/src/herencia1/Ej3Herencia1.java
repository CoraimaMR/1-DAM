/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package herencia1;
import java.util.ArrayList;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------

*/

/**
 * @author Jesús Pérez 
 */
public class Ej3Herencia1 {

    public static void main(String[] args) {
        //****** Clase Persona ******        
        //Declaramos y probamos una persona
        Persona p= new Persona("Pepe", "11111111A", "C/ Uno", 611111111);
        
        System.out.println("\n*************************");
        System.out.println("Mostramos una persona: ");
        p.mostrarPersona();
        
        //****** Clase Alumno *******
        //Creamos las notas
        ArrayList notas=new ArrayList();
        
        notas.add(7);
        notas.add(9);
        notas.add(6);
        
        //Declaramos e instanciamos un alumno
        Alumno a=new Alumno("María", "22222222B", "C/ Dos", 622222222, 2, "DAM", 1, notas);
        System.out.println("\n*************************");
        System.out.println("Mostramos una alumna: ");
        a.mostrarPersona();
        
        //***** Clase Profesor ******
        ArrayList<String> modulos=new ArrayList<String>();
        
        modulos.add("Programación");
        modulos.add("Lenguajes de Marcas");
        modulos.add("Entornos de desarrollo");
        
        //Declaramos e instanciamos un profesor
        Profesor profe=new Profesor("Juan", "33333333C", "C/ Tres", 633333333, 3, "Informática", modulos, "Mañana");
        System.out.println("\n*************************");
        System.out.println("Mostramos un profesor: ");
        profe.mostrarPersona();
        
        //***************************** POLIMORFISMO ************************************
        /*
        Declaro un Array de Persona que es el tipo de dato de la clase padre y en él
        añado las tres personas que tengo. La primera es solamente persona, pero
        la segunda es alumno y la tercera profesor.
        */
        Persona[] todos=new Persona[3];
        
        todos[0]=p;
        todos[1]=a;
        todos[2]=profe;
        
        System.out.println("\n************************************************");
        System.out.println("***** Ejemplo de POLIMORFISMO con un Array *****");
        System.out.println("Muestro los datos de cada objeto.");
        System.out.println("a y profe llaman al método sobreescrito en su propia clase");
        for (int i = 0; i < todos.length; i++) {
            todos[i].mostrarPersona();            
        }
        
        /*
        Si quiero invocar al método mostrarPersona() de la clase padre (algo que
        no tiene sentido, pero se hace como mero ejemplo) hay que hacer un casting
        */
        
        System.out.println("\n*************************************");
        System.out.println("Ejemplo de CASTING del objeto Persona como Alumno");
        System.out.println("Llama al método mostrarPersona() de la clase hija");
        Alumno pa=(Alumno)todos[1];
              
        a.mostrarPersona();
        todos[1].mostrarPersona();
        pa.mostrarPersona();
        
        /*
        Como el método mostrarPersona() está sobreescrito en la clase hija, el resultado
        es siempre el mismo. No olvidemos que tenemos un único espacio de memoria referenciado
        por tres variables distintas: a y pa de tipo Alumno y todos[1] de tipo Persona.
        */
        System.out.println("*********El resultado siempre es el mismo************");       
        
    }//main

}//class
