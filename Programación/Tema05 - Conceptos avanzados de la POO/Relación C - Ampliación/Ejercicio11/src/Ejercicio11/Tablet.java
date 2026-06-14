
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio11;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 23 mar 2026 ⏰ Hora: 12:32:16
* @version 1.0
*******************************************************************************/

public class Tablet extends Ordenador {

    // --------- ATRIBUTOS ---------
    private int tamañoPantalla;
    private boolean altavocesDolby;
    
    // -------- CONSTRUCTOR --------
    public Tablet(int almacenamiento, int ram, String microprocesador, int tamañoPantalla, boolean altavocesDolby) {
        super(almacenamiento, ram, microprocesador);
        this.tamañoPantalla = tamañoPantalla;
        this.altavocesDolby = altavocesDolby;
        this.setConexionCable(false);
        this.setConexionInalambrica(true);
    }
    
    // ---------- GETTERS ----------
    public int getTamañoPantalla() {return tamañoPantalla;}
    public boolean getAltavocesDolby() {return altavocesDolby;}
    
    // ---------- SETTERS ----------
    public void setTamañoPantalla(int tamañoPantalla) {this.tamañoPantalla = tamañoPantalla;}
    public void setAltavocesDolby(boolean altavocesDolby) {this.altavocesDolby = altavocesDolby;}
    
    //---- METODOS DE LA CLASE -----
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("TIPO: TABLET ---");
        System.out.println("Tamaño de la pantalla: " + this.tamañoPantalla + " pulgadas");
        System.out.println("Altavoces permiten Dolby Atmos: " + this.altavocesDolby);
    } // imprimir()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘