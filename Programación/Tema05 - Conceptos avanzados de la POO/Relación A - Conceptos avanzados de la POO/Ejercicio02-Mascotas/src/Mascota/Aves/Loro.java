
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Mascota.Aves;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 10 mar 2026 ⏰ Hora: 9:27:45
* @version 1.0
*******************************************************************************/

public class Loro extends Ave{

    // --------- ATRIBUTOS ---------
    private String origen;
    private boolean habla;
    
    // -------- CONSTRUCTOR --------
    public Loro(String nombre, int edad, String fechaNacimiento, String origen, boolean habla, String pico, boolean vuela) {
        super(nombre, edad, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }
    
    // ---------- GETTERS ----------
    public String getOrigen() {return origen;}
    public boolean isHabla() {return habla;}
    
    // ---------- SETTERS ----------
    public void setOrigen(String origen) {this.origen = origen;}
    public void setHabla(boolean habla) {this.habla = habla;}
    
    //---- METODOS DE LA CLASE -----
    public void muestra(){
        super.muestra();
        System.out.println("TIPO LORO --");
        System.out.println("Origen: " + this.origen);
        System.out.println("Habla: " + this.habla);        
    }
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘