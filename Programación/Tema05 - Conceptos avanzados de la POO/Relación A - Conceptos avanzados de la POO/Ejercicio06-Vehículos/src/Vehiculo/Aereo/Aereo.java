
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Vehiculo.Aereo;
import Vehiculo.Vehiculo;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 14 mar 2026 ⏰ Hora: 18:28:27
* @version 1.0
*******************************************************************************/

public class Aereo extends Vehiculo {
    
    //--------- ATRIBUTOS ----------
    protected final int numAsientos;
    
    // -------- CONSTRUCTOR --------
    public Aereo(String matricula, String modelo, int numAsientos) {
        super(matricula, modelo);
        this.numAsientos = numAsientos;
    }
    
    // ---------- GETTERS ----------
    public int getNumAsientos() {return numAsientos;}
    
    //---- METODOS DE LA CLASE -----
    public void mostrar() {
        super.mostrar();
        System.out.println("Número de asientos: " + this.numAsientos);
    } // mostrar()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘