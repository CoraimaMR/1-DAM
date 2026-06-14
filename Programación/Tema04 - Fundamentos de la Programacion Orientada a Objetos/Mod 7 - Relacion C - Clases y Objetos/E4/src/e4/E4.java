/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e4;

/**
 *
 * @author 🌟 Coraima Mera Rodríguez 🌟
 */

public class E4 {

    public static void main(String[] args) {

        // Creamos instancias de la clase Articulo (constructor con 4 parámetros)
        Articulo articulo1 = new Articulo("Pijama", 10, 21, 50);
        Articulo articulo2 = new Articulo("Libro", 15, 10, 20);
        Articulo articulo3 = new Articulo("Transporte", 25, 4, 10);
        
        // Intento de crear un artículo con IVA inválido
        System.out.println("\nARTICULO CON IVA INVALIDO");
        Articulo articuloInvalido = new Articulo("Galletas", 5, 18, 30); // debe mostrar error
        articuloInvalido.imprimir();
        
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
        
        // PROBANDO SETTERS
        System.out.println("\nPROBANDO SETTERS");
        System.out.println("Intentamos poner IVA inválido (50%) al libro:");
        articulo2.setIva(50); // debe mostrar error
        System.out.println("IVA actual del libro: " + articulo2.getIva() + "%");

        System.out.println("\nCambiamos IVA correctamente a 4% (superreducido) al transporte:");
        articulo3.setIva(Articulo.IVA_SUPER);
        System.out.println("IVA actual del transporte: " + articulo3.getIva() + "%");
        
    } // main
    
} // clase principal
