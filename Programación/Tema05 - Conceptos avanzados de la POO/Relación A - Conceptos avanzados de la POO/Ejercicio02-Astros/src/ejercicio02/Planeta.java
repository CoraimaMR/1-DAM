
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicio02;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 9 mar 2026 ⏰ Hora: 12:31:47
* @version 1.0
*******************************************************************************/

public class Planeta extends Astro{

    // --------- ATRIBUTOS ---------
    private String nombre;
    private double orbitaSol;
    private double distanciaSol;
    
    // -------- CONSTRUCTOR --------
    public Planeta(String nombre, double masa, double radio, double rotacion, double orbitaSol, double temperatura, double gravedad, double distanciaSol) {
        super(radio, rotacion, masa, temperatura, gravedad);
        
        this.nombre = nombre;
        this.orbitaSol = orbitaSol;
        this.distanciaSol = distanciaSol;
    }

    // ---------- GETTERS ----------
    public String getNombre() {return nombre;}
    public double getOrbitaSol() {return orbitaSol;}
    public double getDistanciaSol() {return distanciaSol;}

    // ---------- SETTERS ----------
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setOrbitaSol(double orbitaSol) {this.orbitaSol = orbitaSol;}
    public void setDistanciaSol(double distanciaSol) {this.distanciaSol = distanciaSol;}

    //---- METODOS DE LA CLASE -----
    @Override
    public void muestraAstro(){
        System.out.println("PLANETA = " + this.nombre);
        System.out.println("Órbita al Sol = " + this.orbitaSol);
        System.out.println("Distancia al Sol = " + this.distanciaSol);
        
        super.muestraAstro();
    }
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘