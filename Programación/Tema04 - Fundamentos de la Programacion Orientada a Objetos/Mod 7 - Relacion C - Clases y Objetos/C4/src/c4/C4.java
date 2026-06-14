/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c4;

/**
 *
 * @author coram
 */

public class C4 {

    public static void main(String[] args) {

        // Creamos instancias de la clase Articulo (constructor con 4 parámetros)
        Articulo articulo1 = new Articulo("Pijama", 10, 21, 50);

        // Mostramos en pantalla los valores iniciales
        System.out.println("VALORES INICIALES DEL ARTICULO");
        System.out.printf("%s - Precio: %.2f€ - IVA: %d%% - PVP: %.2f€\n",
                articulo1.getNombre(), articulo1.getPrecio(), articulo1.getIva(),
                articulo1.getPrecio() + (articulo1.getPrecio() * articulo1.getIva() / 100));

        // Modifico los valores iniciales
        articulo1.setPrecio(20);

        // Mostramos en pantalla los valores modificados
        System.out.println("\nVALORES MODIFICADOS DEL ARTICULO");
        System.out.printf("%s - Precio: %.2f€ - IVA: %d%% - PVP: %.2f€\n",
                articulo1.getNombre(), articulo1.getPrecio(), articulo1.getIva(),
                articulo1.getPrecio() + (articulo1.getPrecio() * articulo1.getIva() / 100));
    }
}
