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
public class practica06 {
    
/*
6. Escribe un programa que dado el precio de un artículo y el precio de venta real nos muestre el
porcentaje de descuento realizado.  
    */
    
    public static void main(String[] args) {
        
        int precio,pagado,descuento;
        
        Scanner sc=new Scanner(System.in);
        
        precio=100;
        
        System.out.println("El precio del articulo: "+precio+"€");

        System.out.println("Introduce el precio a pagar del articulo:");
        pagado = sc.nextInt();
        
        descuento = (precio - pagado)/1;
        
        System.out.println("El porcentaje de descuento realizado es de "+descuento+"%");
        
    }
}
