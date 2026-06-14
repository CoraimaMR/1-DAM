/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class practica04 {
    
/*
    4. Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta,
producto y división.
*/
    
    public static void main(String[] args) {
        
        int n1,n2;
        int suma,resta,producto,division;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce el primer valor:");
        n1=sc.nextInt();
        
        System.out.println("Introduce el segundo valor:");
        n2=sc.nextInt();
        
        suma=n1+n2;
        resta=n1-n2;
        producto=n1*n2;
        division=n1/n2;
        
        System.out.println("-------------------------------------------------");
        System.out.println("La suma de los números "+n1+" y "+n2+" es:"+suma);
        System.out.println("La resta de los números "+n1+" y "+n2+" es:"+resta);
        System.out.println("El producto de los números "+n1+" y "+n2+" es:"+producto);
        System.out.println("La división de los números "+n1+" y "+n2+" es:"+division);
        System.out.println("-------------------------------------------------");
    }
    
}
