
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 28 may 2026     ⏰ Hora: 13:25:17
 *
 *  Nombre del programa : Main
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Implementa una aplicación gráfica que simule una aplicación de pedidos de menús 
de hamburguesas. La aplicación permitirá configurar un solo menú. El usuario 
podrá elegir el tipo de hamburguesa, pan, patatas y bebida. También hay 
elementos opcionales/extra. 

El precio de un menú básico es de 8 euros pero algunas opciones tienen un coste 
adicional. Se mostrará el precio total del menú con las opciones elegidas, el 
IVA en € (21% adicional) y el precio de venta al público (tras sumar el IVA).
Las opciones obligatorias a elegir son:
• Hamburguesa a elegir: pollo, cerdo, ternera (+1€) o vegana (+1€).
• Pan a elegir: normal, integral o centerno.
• Patatas a elegir: fritas, gajo y caseras (+1 €).
• Bebida a elegir: refreso de cola, refresco de naranja, refresco de limón, agua 
y cerveza.
Las opciones extra/adicionales son:
• Hamburguesa doble (+2 €).
• Extra de queso (+0,50 €).
• Extra de patatas (+1 €).
• Salsas: ketchup, barbacoa, mostaza y thai. Puedem pedirse varias de cada 
(+0,50 cada una).
• Reparto a domicilio (precio estándar) o recogida en el local (-20% sobre el 
precio final).
*******************************************************************************/

/******************************** EXPLICACIÓN **********************************
 El programa funciona mediante una interfaz gráfica donde el usuario selecciona 
 los distintos componentes del menú. Cada vez que se marca una opción, se 
 recalcula el precio total del pedido. 
 
 Cuando se pulsa el botón Comprar, el programa recoge todas las selecciones 
 realizadas, calcula el IVA y posibles descuentos, y genera una factura 
 mostrando el detalle del pedido y el importe final a pagar.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package logica;
import gui.Ventana;

public class Main {
    
    private static double extras = 0;
    private static boolean descuento;

    public static void main(String[] args) {
        
        Ventana window = new Ventana(); // Creo la  nueva instancia "window"
        window.setVisible(true); // Activo la ventana
        window.setLocationRelativeTo(null); // Posicion de la ventana al ejecutar: medio
        
    } //main()
    
    /* Calcula el precio en ese momento del menu */
    public static double precioMenu() {
        return 8 + extras;
    } // precioMenu()

    /* Actualiza si el menu tiene descuento */
    public static void añadirDescuento(boolean si) {
        descuento = si;
    } // añadirDescuento(boolean si)
    
    /* Añade en tiempo real el dinero de extras que se seleccionan */
    public static void añadirExtras(double n) {
        extras += n;
    } // añadirExtras(double n)
    
    /* Reinicia el dinero total de los extras que se seleccionan */
    public static void reinicio() {
        extras = 0;
    } // reinicio()
    
    /* Se añade a la factura el dinero total, iva y si tiene descuento */
    public static String factura(String pedido) {

        double precio = precioMenu();
        double iva = precio * 0.21;
        double total = precio + iva;

        String factura = "=========== FACTURA ===========\n\n";
        factura += "Precio base del menú: 8€\n\n";
        factura += "Elecciones:\n" + pedido + "\n";

        factura += String.format("\nPrecio base: %.2f€" + "\nIVA (21%%): +%.2f€", precio, iva);

        if (descuento) {
            double desc = total * 0.20;
            total -= desc;
            factura += String.format("\nDescuento recogida local (20%%): -%.2f€", desc);
        }
        factura += String.format("\n\nTOTAL: %.2f€", total);

        return factura;
        
    } // factura(String pedido)
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘