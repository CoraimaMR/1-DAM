
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Vehiculo.Acuatico;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 14 mar 2026 ⏰ Hora: 18:21:01
* @version 1.0
*******************************************************************************/

public class Barco extends Acuatico {
    
    //--------- ATRIBUTOS ----------
    private boolean tieneMotor;
    
    // -------- CONSTRUCTOR --------
    public Barco(String matricula, String modelo, double eslora, boolean tieneMotor) {
        super(matricula, modelo, eslora);
        this.tieneMotor = tieneMotor;
    }
    
    // ---------- GETTERS ----------
    public boolean isTieneMotor() {return tieneMotor;}

    // ---------- SETTERS ----------
    public void setTieneMotor(boolean tieneMotor) {this.tieneMotor = tieneMotor;}

    //---- METODOS DE LA CLASE -----
    public void mostrar() {
        System.out.println("TIPO DE VEHÍCULO: BARCO ==");
        super.mostrar();
        System.out.println("Tiene motor: " + this.tieneMotor);
    } // mostrar()
    
    //----- METODOS ESTATICOS ------
        
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘