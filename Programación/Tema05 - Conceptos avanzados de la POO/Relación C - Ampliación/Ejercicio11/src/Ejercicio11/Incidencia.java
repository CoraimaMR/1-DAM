
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio11;
import java.util.Date;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 23 mar 2026 ⏰ Hora: 12:32:26
* @version 1.0
*******************************************************************************/

public class Incidencia {

    // --------- ATRIBUTOS ---------
    private int numIncidencia;
    private final Date fechaCreación = new Date();
    private String descripcionAveria;
    private String descripcionSolucion;
    private boolean resulta;
    private static int totalIncidencias;
    
    // -------- CONSTRUCTOR --------
    public Incidencia(String descripcionAveria) {        
        this.descripcionAveria = descripcionAveria;
        this.resulta = false;
        totalIncidencias++;
        this.numIncidencia = numIncidencia;
    }
    
    // ---------- GETTERS ----------
    public int getNumIncidencia() {return numIncidencia;}
    public Date getFechaCreación() {return fechaCreación;}
    public String getDescripcionAveria() {return descripcionAveria;}
    public String getDescripcionSolucion() {return descripcionSolucion;}
    public boolean isResulta() {return resulta;}    

    // ---------- SETTERS ----------
    public void setDescripcionSolucion(String descripcionSolucion) {this.descripcionSolucion = descripcionSolucion;}
    public void setResulta(boolean resulta) {this.resulta = resulta;}

    //---- METODOS DE LA CLASE -----
    public void resolver(String descripcionSolucion) {
        if (!resulta) {
           this.resulta = true;
            this.descripcionSolucion = descripcionSolucion; 
        }
    } // resolver()
    
    public void imprimir() {
        System.out.println("DATOS DE LA INCIDENCIA ---");
        System.out.println("Número de incidencia: " + this.numIncidencia);
        System.out.println("Fecha de creación de la incidencia: " + this.fechaCreación);
        System.out.println("Descripción de la avería: " + this.descripcionAveria);
        if (resulta) {
            System.out.println("La incidencia está resuelta");
            System.out.println("Descripción de la solucion: " + this.descripcionAveria);
        }else{
            System.out.println("La incidencia NO está resuelta");
        }
    } // imprimir()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘