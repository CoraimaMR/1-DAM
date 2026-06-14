/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 4 mar 2026     ⏰ Hora: 13:22:49
 *
 *  Nombre del programa : NewClass
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;

public class main {

    public static void main(String[] args) {

        // Crear 5 objetos Producto
        Producto p1 = new Producto("Pan", 10);
        Producto p2 = new Producto("Leche", 5);
        Producto p3 = new Producto("Huevos", 12);
        Producto p4 = new Producto("Arroz", 20);
        Producto p5 = new Producto("Pasta", 15);

        // Crear un ArrayList
        ArrayList<Producto> lista = new ArrayList<>();

        // Añadir los 5 productos al ArrayList
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        // Mostrar el contenido usando Iterator
        System.out.println("LISTA ORIGINAL:");
        Iterator<Producto> it = lista.iterator();

        while (it.hasNext()) {
            Producto p = it.next();
            System.out.println("Nombre: " + p.getNombre() + " | Cantidad: " + p.getCantidad());
        }
        
        // Eliminar dos elementos
        lista.remove(0);  // elimina el primero

        // Insertar un nuevo producto en medio
        Producto nuevo = new Producto("Azucar", 8);
        
        lista.add(1, nuevo);  // lo inserta en la posición 1
        
        lista.remove(2);  // elimina otro (después del cambio de posiciones)
        
        // Mostrar de nuevo la lista con Iterator
        System.out.println("\nLISTA MODIFICADA:");
        Iterator<Producto> it2 = lista.iterator();

        while (it2.hasNext()) {
            Producto p = it2.next();
            System.out.println("Nombre: " + p.getNombre() + " | Cantidad: " + p.getCantidad());
        }

        // Eliminar todos los elementos
        lista.clear();

        System.out.println("\nLista vacía. Tamaño actual: " + lista.size());
    }
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘