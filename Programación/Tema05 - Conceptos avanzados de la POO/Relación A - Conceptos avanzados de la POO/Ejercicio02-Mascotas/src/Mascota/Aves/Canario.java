
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Mascota.Aves;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 10 mar 2026 ⏰ Hora: 9:28:01
* @version 1.0
*******************************************************************************/

public class Canario extends Ave{

    // --------- ATRIBUTOS ---------
    private String color;
    private boolean canta;
    
    // -------- CONSTRUCTOR --------
    public Canario(String nombre, int edad, String fechaNacimiento, String color, boolean canta, String pico, boolean vuela) {
        super(nombre, edad, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }
    
    // ---------- GETTERS ----------
    public String getColor() {return color;}
    public boolean isCanta() {return canta;}
    
    // ---------- SETTERS ----------
    public void setColor(String color) {this.color = color;}
    public void setCanta(boolean canta) {this.canta = canta;}
    
    //---- METODOS DE LA CLASE -----
    public void muestra(){
        super.muestra();
        System.out.println("TIPO CANARIO --");
        System.out.println("Color: " + this.color);
        System.out.println("Canta: " + this.canta);        
    }
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘