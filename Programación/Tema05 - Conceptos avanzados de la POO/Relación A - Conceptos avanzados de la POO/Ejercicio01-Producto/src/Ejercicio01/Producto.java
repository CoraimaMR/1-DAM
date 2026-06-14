
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio01;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 4 mar 2026 ⏰ Hora: 13:15:44
* @version 1.0
*******************************************************************************/

public class Producto {

    // --------- ATRIBUTOS ---------
    private String nombre;
    private int cantidad;
    
    // -------- CONSTRUCTOR --------
    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    // ---------- GETTERS ----------
    public String getNombre() {return nombre;}
    public int getCantidad() {return cantidad;}

    // ---------- SETTERS ----------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘