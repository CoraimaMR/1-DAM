
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicio09;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 18 mar 2026 ⏰ Hora: 13:08:48
* @version 1.0
*******************************************************************************/

public class Rectangulo {
    
    //--------- ATRIBUTOS ----------
    private double base;
    private double altura;
    private static int rectangulosCreados = 0;
    
    // -------- CONSTRUCTOR --------
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.rectangulosCreados++;
    }
    
    // ---------- GETTERS ----------
    public double getBase() {return base;}
    public double getAltura() {return altura;}
    public static int getRectangulosCreados() {return rectangulosCreados;}
    
    // ---------- SETTERS ----------
    public void setBase(double base) {this.base = base;}
    public void setAltura(double altura) {this.altura = altura;}
    
    //---- METODOS DE LA CLASE -----
    @Override
    public String toString() {
        String dibujo = "";
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                dibujo += "*";
            }
            dibujo += "\n";
        }
        return dibujo;
    } // toString()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘