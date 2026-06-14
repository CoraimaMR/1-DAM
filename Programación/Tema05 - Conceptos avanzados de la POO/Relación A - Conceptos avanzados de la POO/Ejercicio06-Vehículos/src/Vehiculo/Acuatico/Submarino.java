
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Vehiculo.Acuatico;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 14 mar 2026 ⏰ Hora: 18:21:08
* @version 1.0
*******************************************************************************/

public class Submarino extends Acuatico {
    
    //--------- ATRIBUTOS ----------
    private double profundidadMax;
    
    // -------- CONSTRUCTOR --------
    public Submarino(String matricula, String modelo, double eslora, double profundidadMax) {
        super(matricula, modelo, eslora);
        this.profundidadMax = profundidadMax;
    }    
    
    // ---------- GETTERS ----------    
    public double getProfundidadMax() {return profundidadMax;}

    // ---------- SETTERS ----------
    public void setProfundidadMax(double profundidadMax) {this.profundidadMax = profundidadMax;}

    //---- METODOS DE LA CLASE -----
    public void mostrar() {
        System.out.println("TIPO DE VEHÍCULO: SUBMARINO ==");
        super.mostrar();
        System.out.println("Máxima profuncidad: " + this.profundidadMax);
    } // mostrar()
    
    //----- METODOS ESTATICOS ------    
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘