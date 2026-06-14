
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Mascota;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 10 mar 2026 ⏰ Hora: 9:26:55
* @version 1.0
*******************************************************************************/

public class Gato extends Mascota{

    // --------- ATRIBUTOS ---------
    private String color;
    private boolean peloLargo;
    
    // -------- CONSTRUCTOR --------
    public Gato(String nombre, int edad, String fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }
        
    // ---------- GETTERS ----------
    public String getColor() {return color;}
    public boolean isPeloLargo() {return peloLargo;}
    
    // ---------- SETTERS ----------
    public void setColor(String color) {this.color = color;}
    public void setPeloLargo(boolean peloLargo) {this.peloLargo = peloLargo;}
    
    //---- METODOS DE LA CLASE -----
    public void muestra(){
        super.muestra();
        System.out.println("ESPECIE GATO --");
        System.out.println("Color: " + this.color);
        System.out.println("Tiene el pelo largo: " + this.peloLargo);
    }
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘