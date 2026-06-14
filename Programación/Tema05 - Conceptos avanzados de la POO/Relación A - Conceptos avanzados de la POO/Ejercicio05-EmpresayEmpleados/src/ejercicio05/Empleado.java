
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicio05;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 12 mar 2026 ⏰ Hora: 13:06:37
* @version 1.0
*******************************************************************************/

public class Empleado {

    // --------- ATRIBUTOS ---------
    private final String nombre;
    private final String DNI;
    private double sueldoBruto;
    private double sueldoNeto;
    private int edad;
    private String telefono;
    private String direccion;
    private static double IRPF;
    
    // -------- CONSTRUCTOR --------
    public Empleado(String nombre, String DNI, double sueldoBruto) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldoBruto = sueldoBruto;
        calcularSueloNeto();
    }
    
    // ---------- GETTERS ----------
    public String getNombre() {return nombre;}
    public String getDNI() {return DNI;}
    public double getSueldoBruto() {return sueldoBruto;}
    public int getEdad() {return edad;}
    public String getTelefono() {return telefono;}
    public String getDireccion() {return direccion;}
    public double getSueldoNeto() {return sueldoNeto;}
    
    
    // ---------- SETTERS ----------
    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
        calcularSueloNeto();
    }
    public void setEdad(int edad) {this.edad = edad;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    
    //---- METODOS DE LA CLASE -----
    public void mostrar() {
        System.out.println("==== DATOS DEL EMPLEADO ====");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("DNI: " + this.DNI);
        if (this.edad != 0) System.out.println("Edad: " + this.edad + " años");
        if (this.telefono != null) System.out.println("Teléfono: " + this.telefono);
        if (this.direccion != null) System.out.println("Dirección: " + this.direccion);
        System.out.println("Sueldo en bruto: " + this.sueldoBruto + " €");
        System.out.println("Sueldo neto: " + this.sueldoNeto + " €");
    } // mostrar()
    
    public void calcularSueloNeto() {
        double anual = this.sueldoBruto * 12;
        if (anual < 12000) IRPF = 0.2;
        else if (anual < 25000) IRPF = 0.3;
        else IRPF = 0.4;
        this.sueldoNeto = this.sueldoBruto * (1 - IRPF);
    } // calcularSueloNeto()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘