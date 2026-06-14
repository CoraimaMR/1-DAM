
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Vehiculo.Aereo;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 14 mar 2026 ⏰ Hora: 18:21:20
* @version 1.0
*******************************************************************************/

public class Helicoptero extends Aereo {
    
    //--------- ATRIBUTOS ----------
    private int numHelices;
    
    // -------- CONSTRUCTOR --------
    public Helicoptero(String matricula, String modelo, int numAsientos, int numHelices) {
        super(matricula, modelo, numAsientos);
        this.numHelices = numHelices;
    }
    
    // ---------- GETTERS ----------    
    public int getNumHelices() {return numHelices;}

    // ---------- SETTERS ----------
    public void setNumHelices(int numHelices) {this.numHelices = numHelices;}

    //---- METODOS DE LA CLASE -----
    public void mostrar() {
        System.out.println("TIPO DE VEHÍCULO: HELICOPTERO ==");
        super.mostrar();
        System.out.println("Número de helices: " + this.numHelices);
    } // mostrar()
    
    //----- METODOS ESTATICOS ------    
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘