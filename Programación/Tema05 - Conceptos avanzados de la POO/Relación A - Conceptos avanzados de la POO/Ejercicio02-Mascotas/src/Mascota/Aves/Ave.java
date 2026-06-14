
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Mascota.Aves;
import Mascota.Mascota;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 10 mar 2026 ⏰ Hora: 9:27:16
* @version 1.0
*******************************************************************************/

public class Ave extends Mascota {

    // --------- ATRIBUTOS ---------
    protected String pico;
    protected boolean vuela;
    
    // -------- CONSTRUCTOR --------
    public Ave(String nombre, int edad, String fechaNacimiento, String pico, boolean vuela) {
        super(nombre, edad, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }    
    
    // ---------- GETTERS ----------
    public String getPico() {return pico;}
    public boolean isVuela() {return vuela;}
    
    // ---------- SETTERS ----------
    public void setPico(String pico) {this.pico = pico;}
    public void setVuela(boolean vuela) {this.vuela = vuela;}
    
    //---- METODOS DE LA CLASE -----
    public void muestra(){
        super.muestra();
        System.out.println("ESPECIE AVE --");
        System.out.println("Tipo de pico: " + this.pico);
        System.out.println("Vuela: " + this.vuela);
    }
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘