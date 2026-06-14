
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicio09;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 18 mar 2026 ⏰ Hora: 13:08:40
* @version 1.0
*******************************************************************************/

public class Piramide {
    
    //--------- ATRIBUTOS ----------
    private double altura;
    private static int piramidesCreadas = 0;
    
    // -------- CONSTRUCTOR --------
    public Piramide(int altura) {
        this.altura = altura;
        this.piramidesCreadas++;
    }
    
    // ---------- GETTERS ----------
    public double getAltura() {return altura;}
    public static int getPiramidesCreadas() {return piramidesCreadas;}
    
    // ---------- SETTERS ----------
    public void setAltura(double altura) {this.altura = altura;}

    //---- METODOS DE LA CLASE -----
    @Override
    public String toString() {
        String dibujo = "";
        for (int i = 1; i <= altura; i++) {
            // espacios
            for (int j = 1; j <= altura - i; j++) {
                dibujo += " ";
            }
            // asteriscos
            for (int j = 1; j <= (2 * i - 1); j++) {
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