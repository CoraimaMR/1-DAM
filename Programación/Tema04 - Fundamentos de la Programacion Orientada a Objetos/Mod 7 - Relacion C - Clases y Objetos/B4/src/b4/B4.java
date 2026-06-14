/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b4;

/**
 *
 * @author coram
 */

public class B4 {

    public static void main(String[] args) {

        // Creamos instancias de la clase Articulo (constructor con 4 parámetros)
        Articulo articulo1 = new Articulo("Pijama", 10, 21, 50);

        // Mostramos en pantalla los valores iniciales
        System.out.println("VALORES INICIALES DEL ARTICULO");
        System.out.printf("%s - Precio: %.2f€ - IVA: %d%% - PVP: %.2f€\n",
                articulo1.nombre, articulo1.precio, articulo1.iva,
                articulo1.precio + (articulo1.precio * articulo1.iva / 100));

        // Modifico los valores iniciales
        articulo1.precio = 20;

        // Mostramos en pantalla los valores modificados
        System.out.println("\nVALORES MODIFICADOS DEL ARTICULO");
        System.out.printf("%s - Precio: %.2f€ - IVA: %d%% - PVP: %.2f€\n",
                articulo1.nombre, articulo1.precio, articulo1.iva,
                articulo1.precio + (articulo1.precio * articulo1.iva / 100));
    }
}
