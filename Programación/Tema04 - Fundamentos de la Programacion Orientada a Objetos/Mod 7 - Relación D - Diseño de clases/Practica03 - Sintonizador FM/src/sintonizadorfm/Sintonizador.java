
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package sintonizadorfm;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 24 ene 2026 ⏰ Hora: 22:29:25
* @version 1.0
*******************************************************************************/

public class Sintonizador {

    // -- VARIABLES DE INSTANCIA --
    private double frecuencia;
    
    //---- CONSTANTES ESTATICAS ----
    private static final double MIN = 80.0;
    private static final double MAX = 108.0;
    private static final double PASO = 0.5;
    
    // -------- CONSTRUCTOR --------
    
    public Sintonizador(){
        this.frecuencia = 80;
    }
    
    public Sintonizador(double frecuencia){
        if (frecuencia<MIN) {
            this.frecuencia = MAX;
        }
        if (frecuencia>MAX) {
            this.frecuencia = MIN;
        }
    }
    
    //---- METODOS DE LA CLASE -----
    public void display(){
        System.out.printf("Frecuencia actual = %.2f MHz\n", this.frecuencia);
    } // display()
    
    public void up(int cantidad){
         this.frecuencia += cantidad * PASO;
         rango();
    } // up(cantidad)
    
    public void down(int cantidad){
         this.frecuencia -= cantidad * PASO;
         rango();
    } // down(cantidad)
    
    private void rango(){
        if (this.frecuencia > MAX) {
            this.frecuencia = MIN;
        }
        if (this.frecuencia < MIN) {
            this.frecuencia = MAX;
        }
    }
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘