
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Vehiculo.Terrestre;
import Vehiculo.Vehiculo;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 14 mar 2026 ⏰ Hora: 18:28:33
* @version 1.0
*******************************************************************************/

public class Terrestre extends Vehiculo {
    
    //--------- ATRIBUTOS ----------
    protected final int numRuedas;
    
    // -------- CONSTRUCTOR --------
    public Terrestre(String matricula, String modelo, int numRuedas) {
        super(matricula, modelo);
        this.numRuedas = numRuedas;
    }
    
    // ---------- GETTERS ----------
    public int getNumRuedas() {return numRuedas;}
    
    //---- METODOS DE LA CLASE -----
    public void mostrar() {
        super.mostrar();
        System.out.println("Número de ruedas: " + this.numRuedas);
    } // mostrar()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘