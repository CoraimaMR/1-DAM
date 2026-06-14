
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio11;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 23 mar 2026 ⏰ Hora: 12:32:02
* @version 1.0
*******************************************************************************/

public class Portatil extends Ordenador {

    // --------- ATRIBUTOS ---------
    private int duracionBateria;
    
    // -------- CONSTRUCTOR --------
    public Portatil(int almacenamiento, int ram, String microprocesador, int duracionBateria) {
        super(almacenamiento, ram, microprocesador);
        this.duracionBateria = duracionBateria;
        this.setConexionCable(true);
        this.setConexionInalambrica(true);
    }
    
    // ---------- GETTERS ----------
    public int getDuracionBateria() {return duracionBateria;}
    
    // ---------- SETTERS ----------
    public void setDuracionBateria(int duracionBateria) {this.duracionBateria = duracionBateria;}

    //---- METODOS DE LA CLASE -----
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("TIPO: PORTATIL ---");
        System.out.println("Duración de la batería: " + this.duracionBateria + "h");
    } // imprimir()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘