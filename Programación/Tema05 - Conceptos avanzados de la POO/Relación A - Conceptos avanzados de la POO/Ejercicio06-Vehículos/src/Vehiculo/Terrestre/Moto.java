
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Vehiculo.Terrestre;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 14 mar 2026 ⏰ Hora: 18:20:52
* @version 1.0
*******************************************************************************/

public class Moto extends Terrestre {
    
    //--------- ATRIBUTOS ----------
    private String color;
    
    // -------- CONSTRUCTOR --------
    public Moto(String matricula, String modelo, int numRuedas, String color) {
        super(matricula, modelo, numRuedas);
        this.color = color;
    }
    
    // ---------- GETTERS ----------
    public String getColor() {return color;}
    
    // ---------- SETTERS ----------
    
    public void setColor(String color) {this.color = color;}

    //---- METODOS DE LA CLASE -----
    public void mostrar() {
        System.out.println("TIPO DE VEHÍCULO: MOTO ==");
        super.mostrar();
        System.out.println("Color: " + this.color);
    } // mostrar()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘