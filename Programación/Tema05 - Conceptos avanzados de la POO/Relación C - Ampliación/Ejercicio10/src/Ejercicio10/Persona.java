
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio10;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 20 mar 2026 ⏰ Hora: 8:39:48
* @version 1.0
*******************************************************************************/

public class Persona {

    // --------- ATRIBUTOS ---------
    protected final String nombre;
    protected final String apellidos;
    protected final String dni;
    
    // -------- CONSTRUCTOR --------
    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
    
    // ---------- GETTERS ----------
    public String getNombre() {return nombre;}
    public String getApellidos() {return apellidos;}
    public String getDni() {return dni;}
    
    //---- METODOS DE LA CLASE -----
    public void imprimir() {
        System.out.println("========== DATOS DE LA PERSONA ==========");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("DNI: " + this.dni);
    }  // imprimir()
    
    //----- METODOS ESTATICOS ------   
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘