
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio10;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 20 mar 2026 ⏰ Hora: 8:40:23
* @version 1.0
*******************************************************************************/

public class Empleado extends Persona {

    // --------- ATRIBUTOS ---------
    private int antiguedad;
    private double salario;
    private Empleado supervisor;
    private double incremento;
    
    // -------- CONSTRUCTOR --------
    public Empleado(String nombre, String apellidos, String dni, double salario) {
        super(nombre, apellidos, dni);
        this.salario = salario;
        this.incremento = 0;
    }
    
    // ---------- GETTERS ----------
    public int getAntiguedad() {return antiguedad;}
    public double getSalario() {return salario;}
    public Empleado getSupervisor() {return supervisor;}
    public double getIncremento() {return incremento;}
    
    // ---------- SETTERS ----------
    public void setSupervisor(Empleado supervisor) {this.supervisor = supervisor;}
    public void setIncremento(double incremento) {this.incremento = incremento;}

    //---- METODOS DE LA CLASE -----
    public void subirSueldo() {
        salario += salario * incremento;
        System.out.println("Sueldo incrementado correctamente (" + this.incremento + ")");
    } // subirSueldo()
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("TIPO: EMPLEADO ---");
        System.out.println("Salario: " + salario);
        System.out.println("Antigüedad: " + antiguedad);
        if (supervisor != null) {
            System.out.println("Supervisor: " + supervisor.getNombre());
        }
    } // imprimir()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘