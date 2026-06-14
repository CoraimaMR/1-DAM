
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 23 mar 2026     ⏰ Hora: 12:27:37
 *
 *  Nombre del programa : main
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio11;

public class main {

    public static void main(String[] args) {
        
        // ------------- CREAR ORDENADORES -------------
        Portatil portatil = new Portatil(512, 16, "Intel i7", 8);
        Tablet tablet = new Tablet(256, 8, "Snapdragon", 11, true);
        Sobremesa sobremesa = new Sobremesa(1024, 32, "AMD Ryzen 9");

        // ------------- CREAR TARJETAS GRÁFICAS -------------
        TarjetaGrafica tg1 = new TarjetaGrafica("NVIDIA", "RTX 4080", 16);
        TarjetaGrafica tg2 = new TarjetaGrafica("AMD", "Radeon RX 7900", 20);

        // Añadir tarjetas al sobremesa
        sobremesa.añadirTarjetaGrafica(tg1);
        sobremesa.añadirTarjetaGrafica(tg2);

        // ------------- CREAR INCIDENCIAS -------------
        Incidencia inc1 = new Incidencia("Pantalla azul");
        Incidencia inc2 = new Incidencia("No enciende");
        Incidencia inc3 = new Incidencia("Batería defectuosa");

        // Añadir incidencias
        portatil.añadirIncidencia(inc1);
        portatil.añadirIncidencia(inc2);
        sobremesa.añadirIncidencia(inc2);
        tablet.añadirIncidencia(inc3);

        // Resolver una incidencia
        inc1.resolver("Reinstalación del sistema operativo");

        // ------------- CREAR SALAS -------------
        Sala sala1 = new Sala(01, 2);
        Sala sala2 = new Sala(02, 1);
        
        // Añadimos ordenadores
        sala1.añadirOrdenador(portatil);
        sala1.añadirOrdenador(tablet);
        sala1.añadirOrdenador(sobremesa);
        sala2.añadirOrdenador(sobremesa);
        
        // ------------- IMPRIMIMOS DATOS -------------
        System.out.println("\n-------------------------- SALA 1 --------------------------\n");
        sala1.listarOrdenadores();
        
        System.out.println("\n-------------------------- SALA 2 --------------------------\n");
        sala2.listarOrdenadores();
        
    } //main()

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘