
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

package e2;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 14 ene 2026 ⏰ Hora: 13:15:40
* @version 1.0
*******************************************************************************/

public class Persona {
    //----------- ATRIBUTOS -----------
    private String nombre;
    private String apellidos;
    private int edad;
    
    //------- CONSTANTES DE CLASE -------
    private final String DNI;
    public final int MAYORIA_EDAD = 18;
    
    //--------- CONSTRUCTURES ---------
    public Persona(String DNI, String nombre, String apellidos, int edad) {
        if (validarDNI(DNI)) {
            this.DNI = DNI;
        } else {
            System.out.println("ERROR: DNI no válido");
            this.DNI = null; // o lanzar una excepción
        }
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.DNI = null;
    }  // Constructor

    //------- GETTERS Y SETTERS -------
    public String getDni() {return DNI;}
    public String getNombre() {return nombre;}
    public String getApellidos() {return apellidos;}
    public int getEdad() {return edad;}

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
        System.out.println(this.nombre + " " + this.apellidos + " de " + this.edad + " años con DNI " + this.DNI);
    }
    
    public boolean esMayorEdad(){ // Devuelve true si es mayor de edad (false si no)
        return this.edad >= MAYORIA_EDAD;
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
    
    //------ METODOS ESTATICOS ------
    public static boolean validarDNI(String DNI) {
        if (DNI == null || DNI.length() != 9) {
        return false;
        }

        // Comprobar que los primeros 8 caracteres son números
        for (int i = 0; i < 8; i++) {
            char c = DNI.charAt(i);
            if (c < '0' || c > '9') { // no es un número
                return false;
            }
        }

        // Comprobar que el último carácter es una letra
        char letra = DNI.charAt(8);
        if (!((letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z'))) {
            return false;
        }
        
        return true;
    }
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘