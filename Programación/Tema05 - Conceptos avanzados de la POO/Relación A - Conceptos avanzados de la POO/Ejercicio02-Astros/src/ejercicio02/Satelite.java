
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicio02;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 9 mar 2026 ⏰ Hora: 12:32:16
* @version 1.0
*******************************************************************************/

public class Satelite extends Astro{

    // --------- ATRIBUTOS ---------
    private Planeta planeta;
    private String nombre;
    private double orbita;
    private double distanciaPlaneta;
    
    // -------- CONSTRUCTOR --------
    public Satelite(Planeta planeta, String nombre, double masa, double radio, double rotacion, double orbita, double temperatura, double gravedad, double distanciaPlaneta) {
        super(radio, rotacion, masa, temperatura, gravedad);

        this.planeta = planeta;
        this.nombre = nombre;
        this.orbita = orbita;
        this.distanciaPlaneta = distanciaPlaneta;
    }

    // ---------- GETTERS ----------
    public Planeta getPlaneta() {return planeta;}
    public String getNombre() {return nombre;}
    public double getOrbita() {return orbita;}
    public double getDistanciaPlaneta() {return distanciaPlaneta;}

    // ---------- SETTERS ----------
    public void setPlaneta(Planeta planeta) {this.planeta = planeta;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setOrbita(double orbita) {this.orbita = orbita;}
    public void setDistanciaPlaneta(double distanciaPlaneta) {this.distanciaPlaneta = distanciaPlaneta;}

    //---- METODOS DE LA CLASE -----
    @Override
    public void muestraAstro(){
        System.out.println("SATÉLITE = " + this.nombre);
        System.out.println("Órbita = " + this.orbita);
        System.out.println("Distancia al planeta = " + this.distanciaPlaneta);
        
        super.muestraAstro();
    }
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘