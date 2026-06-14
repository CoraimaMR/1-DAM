package tareas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/*******************************************************
 * 
 *               💻 PROGRAMACIÓN EN JAVA 💻
 *
 *  Autor/a:     Coraima Mera Rodríguez
 *  Curso:       1º de DAM
 *  Fecha:       30 oct 2025
 *
 *  Programa : Tarea01 - Ejercicio15
 *  Descripción: 15. Escribe un programa que lea tres 
 *  números distintos y nos diga cuál es el mayor.
 *  Resolver al menos de 3 formas distintas.
 *
 *******************************************************/

public class Tarea01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1, n2, n3;
        
        System.out.println("Introduce el valor del número 1:");
        n1 = sc.nextInt();
        
        System.out.println("Introduce el valor del número 2:");
        n2 = sc.nextInt();
        
        System.out.println("Introduce el valor del número 3:");
        n3 = sc.nextInt();
        
        // FORMA 1: Usando condicionales independientes
        if (n1 > n2 && n1 > n3) {
            System.out.println("El número más grande es el número 1: " + n1);
        }
        
        if (n2 > n1 && n2 > n3) {
            System.out.println("El número más grande es el número 2: " + n2);
        }
        
        if (n3 > n1 && n3 > n2) {
            System.out.println("El número más grande es el número 3: " + n3);
        }
        
        // FORMA 2: Usando if - else anidados
        if (n1 > n2 && n1 > n3) {
            System.out.println("El número más grande es el número 1: " + n1);
        } else if (n2 > n3) {
            System.out.println("El número más grande es el número 2: " + n2);
        } else {
            System.out.println("El número más grande es el número 3: " + n3);
        }
        
        // FORMA 3: Usando Math.max
        int mayor = Math.max(n1, Math.max(n2, n3));
        System.out.println("El número mayor del método 3 es: " + mayor);
    }
}