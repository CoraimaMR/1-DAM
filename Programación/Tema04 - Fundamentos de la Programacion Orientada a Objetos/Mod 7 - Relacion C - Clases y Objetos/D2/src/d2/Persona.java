
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 14 ene 2026     ⏰ Hora: 13:15:40
 *
 *  Nombre del programa : Persona
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package d2;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 14 ene 2026 ⏰ Hora: 13:15:40
* @version 1.0
*******************************************************************************/

public class Persona {
    //----------- ATRIBUTOS -----------
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    
    //--------- CONSTRUCTURES ---------
    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }  // Constructor
    
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }  // Constructor

    //------- GETTERS Y SETTERS -------
    public String getDni() {return dni;}
    public String getNombre() {return nombre;}
    public String getApellidos() {return apellidos;}
    public int getEdad() {return edad;}

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //------ METODOS DE LA CLASE ------
    public void imprime(){ // Imprime la información del objeto
        System.out.println(this.nombre + " " + this.apellidos + " de " + this.edad + " años con DNI " + this.dni);
    }
    
    public boolean esMayorEdad(){ // Devuelve true si es mayor de edad (false si no)
        return this.edad >= 18;
    }
    
    public boolean esJubilado(){ // Devuelve true si tiene 65 años o más (false si no)
        return this.edad > 65;
    }
    
    public int diferenciaEdad(Persona p){ // Devuelve la diferencia de edad entre ‘this’ y p
        int dedad;
        if (p.edad > this.edad) {
            dedad = p.edad - this.edad;
        } else {
            dedad = this.edad - p.edad;
        }
        return dedad;
    }
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘