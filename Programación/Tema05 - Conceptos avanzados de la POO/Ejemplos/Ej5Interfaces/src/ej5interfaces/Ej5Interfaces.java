/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej5interfaces;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------

*/

/**
 * @author Jesús Pérez 
 */
public class Ej5Interfaces {

    public static void main(String[] args) {
        Figura cuadrado1=new Cuadrado(3.5f);
        Figura cuadrado2=new Cuadrado(2.2f);
        Figura cuadrado3=new Cuadrado(8.9f);
        
        Figura circulo1=new Circulo(3.5f);
        Figura circulo2=new Circulo(4f);
        
        Figura rectangulo1=new Rectangulo(2.25f, 2.55f);
        Figura rectangulo2=new Rectangulo(12f, 3f);
        
        ArrayList serieDeFiguras = new ArrayList();
        
        serieDeFiguras.add(cuadrado1);
        serieDeFiguras.add(cuadrado2);
        serieDeFiguras.add(cuadrado3);
        
        serieDeFiguras.add(circulo1);
        serieDeFiguras.add(circulo2);
        
        serieDeFiguras.add(rectangulo1);
        serieDeFiguras.add(rectangulo2);
        
        float areaTotal=0;
        Iterator it=serieDeFiguras.iterator();
        
        while (it.hasNext()) {
            Figura tmp=(Figura)it.next();//casting
            areaTotal=areaTotal+tmp.area();
        }
        
        System.out.println("Número total de Figuras = "+serieDeFiguras.size());
        System.out.println("Área total = "+areaTotal+" unidades cuadradas.");
                
    }//main

}//class
