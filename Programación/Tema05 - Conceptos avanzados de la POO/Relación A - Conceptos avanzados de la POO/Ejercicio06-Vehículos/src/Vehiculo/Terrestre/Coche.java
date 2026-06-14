
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Vehiculo.Terrestre;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 14 mar 2026 ⏰ Hora: 18:20:47
* @version 1.0
*******************************************************************************/

public class Coche extends Terrestre {
    
    //--------- ATRIBUTOS ----------
    private boolean tieneAireAcondicionador;
    
    // -------- CONSTRUCTOR --------
    public Coche(String matricula, String modelo, int numRuedas, boolean tieneAireAcondicionador) {
        super(matricula, modelo, numRuedas);
        this.tieneAireAcondicionador = tieneAireAcondicionador;
    }
    
    // ---------- GETTERS ----------
    public boolean isTieneAireAcondicionador() {return tieneAireAcondicionador;}
    
    // ---------- SETTERS ----------
    public void setTieneAireAcondicionador(boolean tieneAireAcondicionador) {
        this.tieneAireAcondicionador = tieneAireAcondicionador;
    }
    
    //---- METODOS DE LA CLASE -----
    public void mostrar() {
        System.out.println("TIPO DE VEHÍCULO: COCHE ==");
        super.mostrar();
        System.out.println("Tiene aire acondicionador: " + this.tieneAireAcondicionador);
    } // mostrar()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘