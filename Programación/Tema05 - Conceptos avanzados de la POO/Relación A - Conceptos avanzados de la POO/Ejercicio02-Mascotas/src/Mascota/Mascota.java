
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Mascota;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 10 mar 2026 ⏰ Hora: 9:26:30
* @version 1.0
*******************************************************************************/

public class Mascota {

    // --------- ATRIBUTOS ---------
    protected String nombre;
    protected int edad;
    protected String fechaNacimiento;
    protected boolean estado;
    
    // -------- CONSTRUCTOR --------    
    public Mascota(String nombre, int edad, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
    // ---------- GETTERS ----------    
    public String getNombre() {return nombre;}
    public int getEdad() {return edad;}    
    public String getFechaNacimiento() {return fechaNacimiento;}
    public boolean isEstado() {return estado;}
    
    // ---------- SETTERS ----------    
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEdad(int edad) {this.edad = edad;}    
    public void setFechaNacimiento(String fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
    public void setEstado(boolean estado) {this.estado = estado;}
    
    //---- METODOS DE LA CLASE -----
    public void muestra(){
        System.out.println("\n=== DATOS DE LA MASCOTA ===");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Estado: " + this.estado);
        System.out.println("Fecha de nacimiento: " + this.fechaNacimiento);
    }
    
    //----- METODOS ESTATICOS ------

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘