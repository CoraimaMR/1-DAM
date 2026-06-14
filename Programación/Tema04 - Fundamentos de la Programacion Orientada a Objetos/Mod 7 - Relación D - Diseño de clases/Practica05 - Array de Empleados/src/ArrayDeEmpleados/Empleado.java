
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ArrayDeEmpleados;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 26 ene 2026 ⏰ Hora: 12:55:38
* @version 1.0
*******************************************************************************/

public class Empleado {

    // VARIABLES DE INSTANCIAS
    private String nombre;
    private int edad;
    private double sueldoBruto;
    private double incentivos;
    private String puestoTrabajo;
    private double sueldoNeto;
    
    // CONSTANTES ESTATICAS
    private static final double IRPF = 0.07;
    private static final double SS = 0.025;
    
    // CONSTRUCTOR
    public Empleado(String nombre, int edad, double sueldoBruto, double incentivos, String puestoTrabajo){
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("ERROR. Nombre no válido.");
        }
        if (edad < 16) {
            System.out.println("ERROR. Edad no válida.");
        }
        if (sueldoBruto < 0) {
            System.out.println("ERROR. Sueldo bruto no válido.");
        }
        if (incentivos < 0) {
            System.out.println("ERROR. Incenntivos no válidos.");
        }
        this.nombre = nombre;
        this.edad = edad;
        this.sueldoBruto = sueldoBruto;
        this.incentivos = incentivos;
        this.puestoTrabajo = puestoTrabajo;
        
        // Cálculo del sueldo neto
        double descuentoIRPF = sueldoBruto * IRPF;
        double descuentoSS = sueldoBruto * SS;

        this.sueldoNeto = sueldoBruto - descuentoIRPF - descuentoSS + incentivos;
    }
    
    // GETTERS
    public String getNombre() {return nombre;}
    public int getEdad() {return edad;}
    public double getSueldoBruto() {return sueldoBruto;}
    public double getIncentivos() {return incentivos;}
    public String getPuestoTrabajo() {return puestoTrabajo;}
    public double getsueldoNeto() {return sueldoNeto;}
    
    // METODOS DE CLASES
    
    @Override
    public String toString() {
        return ("Nombre: "+this.nombre+"\nEdad: "+this.edad+" años\nPuesto de Trabajo: "+this.puestoTrabajo+""
                + "\nSueldo Neto: "+this.sueldoNeto+"€ (Bruto: "+this.sueldoBruto+"€, Incentivos: "+this.incentivos+"€)");
    }
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘