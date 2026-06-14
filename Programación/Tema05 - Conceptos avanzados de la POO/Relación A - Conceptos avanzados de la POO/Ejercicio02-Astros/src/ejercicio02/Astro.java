
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicio02;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 9 mar 2026 ⏰ Hora: 12:24:30
* @version 1.0
*******************************************************************************/

public class Astro{

    // --------- ATRIBUTOS ---------
    protected double radio;
    protected double rotacion;
    protected double masa;
    protected double temperatura;
    protected double gravedad;
    
    // -------- CONSTRUCTOR --------
    public Astro (double radio, double rotacion, double masa, double temperatura, double gravedad){
        this.radio = radio;
        this.rotacion = rotacion;
        this.masa = masa;
        this.temperatura = temperatura;
        this.gravedad = gravedad;
    }
    
    // ---------- GETTERS ----------
    public double getRadio() {return radio;}
    public double getRotacion() {return rotacion;}
    public double getMasa() {return masa;}
    public double getTemperatura() {return temperatura;}
    public double getGravedad() {return gravedad;}
    
    // ---------- SETTERS ----------
    public void setRadio(double radio) {this.radio = radio;}
    public void setRotacion(double rotacion) {this.rotacion = rotacion;}
    public void setMasa(double masa) {this.masa = masa;}
    public void setTemperatura(double temperatura) {this.temperatura = temperatura;}
    public void setGravedad(double gravedad) {this.gravedad = gravedad;}
    
    //---- METODOS DE LA CLASE -----
        public void muestraAstro(){
        System.out.println("Radio ecuatorial = " + this.radio);
        System.out.println("Rotación sobre su eje = " + this.rotacion);
        System.out.println("Masa = " + this.masa);
        System.out.println("Temperatura Media = " + this.temperatura);
        System.out.println("Gravedad = " + this.gravedad);
    }

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘