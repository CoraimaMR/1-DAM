
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio10;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 20 mar 2026 ⏰ Hora: 8:40:38
* @version 1.0
*******************************************************************************/

public class Secretario extends Empleado{

    // --------- ATRIBUTOS ---------
    private int despacho;
    private String fax;
    
    // -------- CONSTRUCTOR --------
    public Secretario(String nombre, String apellidos, String dni, double salario, int despacho, String fax) {
        super(nombre, apellidos, dni, salario);
        this.despacho = despacho;
        this.fax = fax;
        setIncremento(0.05); // 5%
    }    

    // ---------- GETTERS ----------
    public int getDespacho() {return despacho;}
    public String getFax() {return fax;}
    
    // ---------- SETTERS ----------
    public void setDespacho(int despacho) {this.despacho = despacho;}
    public void setFax(String fax) {this.fax = fax;}

    //---- METODOS DE LA CLASE -----
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("PUESTO: SECRETARIO ---");
        System.out.println("Número de despacho: " + this.despacho);
        System.out.println("Fax: " + this.fax);
    } // imprimir()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘