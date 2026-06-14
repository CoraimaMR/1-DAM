/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a4;

/**
 *
 * @author coram
 */
public class A4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creamos una instancia de la clase Articulo
        Articulo articulo1 = new Articulo();
        
        // Asignamos los valores a los atributos
        
        articulo1.nombre = "Pijama";
        articulo1.precio = 10;
        articulo1.iva = 21;
        articulo1.cuantosQuedan = 1;
        
        // Mostramos en pantalla los valores inniciales
        System.out.println("VALORES INICIALES DEL ARTICULO");
        System.out.printf("%s - Precio:%.0f€ - IVA:%d%% - PVP:%.2f€\n"
                , articulo1.nombre, articulo1.precio, articulo1.iva, 
                articulo1.precio + (articulo1.precio * articulo1.iva / 100));
        
        // Modifico los valores iniciales
        
        articulo1.precio = 20;
        
        // Mostramos en pantalla los valores modificados
        System.out.println("\nVALORES MODIFICADOS DEL ARTICULO");
        System.out.printf("%s - Precio:%.0f€ - IVA:%d%% - PVP:%.2f€\n"
                , articulo1.nombre, articulo1.precio, articulo1.iva, 
                articulo1.precio + (articulo1.precio * articulo1.iva / 100));

    }
    
}
