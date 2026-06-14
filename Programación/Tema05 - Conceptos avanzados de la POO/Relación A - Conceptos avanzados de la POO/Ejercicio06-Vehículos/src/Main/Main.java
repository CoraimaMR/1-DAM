
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 14 mar 2026     ⏰ Hora: 15:56:47
 *
 *  Nombre del programa : main
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Main;
import java.util.ArrayList;

import Vehiculo.Vehiculo;
import Vehiculo.Terrestre.Terrestre;
import Vehiculo.Terrestre.Coche;
import Vehiculo.Terrestre.Moto;
import Vehiculo.Acuatico.Acuatico;
import Vehiculo.Acuatico.Barco;
import Vehiculo.Acuatico.Submarino;
import Vehiculo.Aereo.Aereo;
import Vehiculo.Aereo.Avion;
import Vehiculo.Aereo.Helicoptero;

public class Main {

    public static void main(String[] args) {
        // Creamos el arraylist vehiculos
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        
        // Creamos los vehiculos
        vehiculos.add(new Coche("1234ABC", "Toyota Corolla", 4, true));
        vehiculos.add(new Moto("5678DEF", "Honda CB500", 2, "Rojo"));
        vehiculos.add(new Barco("AMALFI", "Sunseeker 50", 15.5, true));
        vehiculos.add(new Submarino("OCTUBRE", "Typhoon Class", 175.0, 500.0));
        vehiculos.add(new Avion("ECAB123456", "Boeing 747", 416, 15.5));
        vehiculos.add(new Helicoptero("HELI987654", "Apache AH-64", 2, 4));

        vehiculos.add(new Terrestre("9999XYZ", "Generico Tierra", 6));
        vehiculos.add(new Acuatico("GENERICO", "Generico Mar", 50.0));
        vehiculos.add(new Aereo("AIRG000000", "Generico Aire", 1));
        
        // Mostramos la lista de los vehiculos
        mostrarLista(vehiculos);
        
        // Mostramos todos los datos de la lista
        mostrarDatosLista(vehiculos);
        
    } //main()
    
    public static void mostrarLista(ArrayList<Vehiculo> lista) {
        System.out.println("=== LISTA DE VEHICULOS ===");
        for (int i = 0; i < lista.size(); i++) {
            String v = lista.get(i).getModelo();
            System.out.println(i + ". " + v);
        }
        System.out.println();
    } // mostrarLista(ArrayList<Vehiculo> lista)
    
    public static void mostrarDatosLista(ArrayList<Vehiculo> lista) {
        System.out.println("=== LISTA DE DATOS DE LOS VEHICULOS ===");
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).mostrar();
            System.out.println("");
        }
    } // mostrarDatosLista (ArrayList<Vehiculo> lista)
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘