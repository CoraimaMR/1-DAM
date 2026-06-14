
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio11;
import java.util.ArrayList;
import java.util.Date;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 23 mar 2026 ⏰ Hora: 12:31:22
* @version 1.0
*******************************************************************************/

public class Ordenador {

    // --------- ATRIBUTOS ---------
    private int almacenamiento;
    private int ram;
    private String microprocesador;
    private final Date fechaAlta = new Date();
    private boolean conexionCable;
    private boolean conexionInalambrica;
    private ArrayList<Incidencia> listaIncidencias = new ArrayList<>();
    
    // -------- CONSTRUCTOR --------
    public Ordenador(int almacenamiento, int ram, String microprocesador) {
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.microprocesador = microprocesador;
    }
    
    // ---------- GETTERS ----------
    public int getAlmacenamiento() {return almacenamiento;}
    public int getRam() {return ram;}
    public String getMicroprocesador() {return microprocesador;}
    public Date getFechaAlta() {return fechaAlta;}
    public boolean isConexionCable() {return conexionCable;}
    public boolean isConexionInalambrica() {return conexionInalambrica;}    

    // ---------- SETTERS ----------
    public void setAlmacenamiento(int almacenamiento) {this.almacenamiento = almacenamiento;}
    public void setRam(int ram) {this.ram = ram;}
    public void setMicroprocesador(String microprocesador) {this.microprocesador = microprocesador;}
    public void setConexionCable(boolean conexionCable) {this.conexionCable = conexionCable;}
    public void setConexionInalambrica(boolean conexionInalambrica) {this.conexionInalambrica = conexionInalambrica;}

    //---- METODOS DE LA CLASE -----
    public void añadirIncidencia(Incidencia i) {
        listaIncidencias.add(i);
    } // añadirIncidencia(Incidencia i)
    
    public void eliminarIncidencia(Incidencia i) {
        listaIncidencias.remove(i);
    } // eliminarIncidencia(Incidencia i)
    
    public void listarIncidencias() {
        if (listaIncidencias.size() > 0) {
            System.out.println("\n===== LISTA DE INCIDENCIAS =====");
            for (int i = 0; i < listaIncidencias.size(); i++) {
                System.out.print((i+1) + ". ");
                listaIncidencias.get(i).imprimir();
            }
        } else {
            System.out.println("=== NO HAY INCIDENCIAS EN EL ORDENADOR ===");
        }        
    } // listarTarjetaGrafica()
    
    public void imprimir() {
        System.out.println("======== DATOS DEL ORDENADOR ========");
        System.out.println("Fecha de alta: " + this.fechaAlta);
        System.out.println("Almacenamiento en el disco: " + this.almacenamiento);
        System.out.println("Memoria RAM: " + this.ram);
        System.out.println("Microprocesador: " + this.microprocesador);
        if (conexionCable) {
            System.out.println("Tiene conexión por cable");
        }
        if (conexionInalambrica) {
            System.out.println("Tiene conexión inalámbrica");
        }
    } // imprimir()
    
    //----- METODOS ESTATICOS ------   
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘