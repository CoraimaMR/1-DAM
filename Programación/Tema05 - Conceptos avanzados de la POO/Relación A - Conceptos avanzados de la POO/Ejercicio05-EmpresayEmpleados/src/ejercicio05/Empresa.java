
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicio05;
import java.util.ArrayList;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 12 mar 2026 ⏰ Hora: 13:06:28
* @version 1.0
*******************************************************************************/

public class Empresa {

    // --------- ATRIBUTOS ---------
    private final String nombre;
    private final String CIF;
    ArrayList<Empleado> ListaEmpleados = new ArrayList<>();
    
    // -------- CONSTRUCTOR --------
    public Empresa(String nombre, String CIF) {
        this.nombre = nombre;
        this.CIF = CIF;
    }
    
    // ---------- GETTERS ----------
    public String getNombre() {return nombre;}
    public String getCIF() {return CIF;}
    
    //---- METODOS DE LA CLASE -----
    public void añadirEmpleado(Empleado a){
        ListaEmpleados.add(a);
    } // añadirEmpleado(Empleado a)
    
    public void eliminarEmpleado(Empleado a){
        ListaEmpleados.remove(a);
    } // eliminarEmpleado(Empleado a)
    
    public void listarDatosEmpleados() {
        System.out.println("=== DATOS DE LA LISTA DE EMPLEADOS ===");
        for (int i = 0; i < ListaEmpleados.size(); i++) {
            ListaEmpleados.get(i).mostrar();
            System.out.println();
        }
    } // listarDatosEmpleados()
    
    public void mostrarNominas() {
        System.out.println("=== NOMINAS DE LA LISTA DE EMPLEADOS ===");
        for (int i = 0; i < ListaEmpleados.size(); i++) {
            Empleado e = ListaEmpleados.get(i);
            System.out.printf("DNI: %s | Bruto: %.2f € | Neto: %.2f €\n", 
                e.getDNI(), e.getSueldoBruto(), e.getSueldoNeto());
        }
        System.out.println();
    } // mostrarNominas()
    
    public void sumaSueldosBrutos(){
        double sumaTotal = 0;
        for (int i = 0; i < ListaEmpleados.size(); i++) {
            double cantidad = ListaEmpleados.get(i).getSueldoBruto();
            sumaTotal += cantidad;
        }
        System.out.println("== CANTIDAD TOTAL EN SUELDOS BRUTOS: " + sumaTotal + "€ ==");
    } // sumaSueldosBrutos()
    
    public void sumaSueldosNetos(){
        double sumaTotal = 0;
        for (int i = 0; i < ListaEmpleados.size(); i++) {
            double cantidad = ListaEmpleados.get(i).getSueldoNeto();
            sumaTotal += cantidad;
        }
        System.out.println("== CANTIDAD TOTAL EN SUELDOS NETOS: " + sumaTotal + "€ ==");
    } // sumaSueldosNetos()
    
    public void mostrar() {
        System.out.println("==== DATOS DE LA EMPRESA ====");
        System.out.println("NOMBRE: " + this.nombre);
        System.out.println("CIF: " + this.CIF);
        System.out.println("=============================\n");
    }
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘