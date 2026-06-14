
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Mascota;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 10 mar 2026 ⏰ Hora: 9:26:45
* @version 1.0
*******************************************************************************/

public class Perro extends Mascota{

    // --------- ATRIBUTOS ---------
    private String raza;
    private boolean pulgas;
    
    // -------- CONSTRUCTOR --------
    public Perro(String nombre, int edad, String fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }
    
    // ---------- GETTERS ----------
    public String getRaza() {return raza;}
    public boolean isPulgas() {return pulgas;}
    
    // ---------- SETTERS ----------
    public void setRaza(String raza) {this.raza = raza;}
    public void setPulgas(boolean pulgas) {this.pulgas = pulgas;}
    
    //---- METODOS DE LA CLASE -----
    public void muestra(){
        super.muestra();
        System.out.println("ESPECIE PERRO --");
        System.out.println("Raza: " + this.raza);
        System.out.println("Tiene pulgas: " + this.pulgas);
    }
        
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘