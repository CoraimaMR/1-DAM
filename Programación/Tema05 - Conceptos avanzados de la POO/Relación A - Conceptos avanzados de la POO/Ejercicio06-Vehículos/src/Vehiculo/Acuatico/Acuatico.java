
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Vehiculo.Acuatico;
import Vehiculo.Vehiculo;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 14 mar 2026 ⏰ Hora: 18:28:21
* @version 1.0
*******************************************************************************/

public class Acuatico extends Vehiculo {
    
    //--------- ATRIBUTOS ----------
    protected final double eslora;
    
    // -------- CONSTRUCTOR --------
    public Acuatico(String matricula, String modelo, double eslora) {
        super(matricula, modelo);
        this.eslora = eslora;
    }
    
    // ---------- GETTERS ----------
    public double getEslora() {return eslora;}
    
    //---- METODOS DE LA CLASE -----
    public void mostrar() {
        super.mostrar();
        System.out.println("Eslora: " + this.eslora);
    } // mostrar()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘