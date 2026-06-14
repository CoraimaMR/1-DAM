/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package d4;

/**
 *
 * @author 🌟 Coraima Mera Rodríguez 🌟
 */

public class D4 {

    public static void main(String[] args) {

        // Creamos instancias de la clase Articulo (constructor con 4 parámetros)
        Articulo articulo1 = new Articulo("Pijama", 10, 21, 50);
        
        // Imprimo los datos dados
        System.out.println("\nDATOS DADOS SOBRE EL AARTICULO");
        articulo1.imprimir();
        
        // Calculo el PVP del articulo
        System.out.println("\nPRECIO CON IVA");
        System.out.println("Articulo 1: " + articulo1.getPVP() + "€");
        
        // Calculo el PVP del articulo con el descuento de 10%
        System.out.println("\nPRECIO CON IVA Y DESCUENTO DE 10%");
        System.out.println("Articulo 1: " + articulo1.getPVPDescuento(10)  + "€");
        
        // PROBAMOS A VENDER ARTICULOS
        System.out.println("\nVENDEMOS ARTICULOS");
        System.out.println("Vendemos 60 articulos \n¿Hay stock?:" 
                + articulo1.vender(60) + "\nCantidad que quedaría: " + articulo1.getCuantosQuedan());
        System.out.println("\nVendemos 5 articulos \n¿Hay stock?:" 
                + articulo1.vender(5) + "\nCantidad que quedaría: " + articulo1.getCuantosQuedan());
        
        // PROBAMOS A ALMACENAR ARTICULOS
        System.out.println("\nALMACENAMOS ARTICULOS");
        System.out.println("Almacenamos 60 articulos \n¿Se puede?:" + articulo1.almacenar(60) 
                + "\nCantidad que habrría: " + articulo1.getCuantosQuedan());
    } // main
    
} // clase principal
