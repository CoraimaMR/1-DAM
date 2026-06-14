
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Vehiculo.Aereo;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 14 mar 2026 ⏰ Hora: 18:21:29
* @version 1.0
*******************************************************************************/

public class Avion extends Aereo{
    
    //--------- ATRIBUTOS ----------
    private double tiempoMaxVuelo;
    
    // -------- CONSTRUCTOR --------
    public Avion(String matricula, String modelo, int numAsientos, double tiempoMaxVuelo) {
        super(matricula, modelo, numAsientos);
        this.tiempoMaxVuelo = tiempoMaxVuelo;
    }
    
    // ---------- GETTERS ----------    
    public double getTiempoMaxVuelo() {return tiempoMaxVuelo;}

    // ---------- SETTERS ----------
    public void setTiempoMaxVuelo(double tiempoMaxVuelo) {this.tiempoMaxVuelo = tiempoMaxVuelo;}

    //---- METODOS DE LA CLASE -----
    public void mostrar() {
        System.out.println("TIPO DE VEHÍCULO: AVIÓN ==");
        super.mostrar();
        System.out.println("Tiempo máximo de vuelo: " + this.tiempoMaxVuelo);
    } // mostrar()
    
    //----- METODOS ESTATICOS ------    
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘