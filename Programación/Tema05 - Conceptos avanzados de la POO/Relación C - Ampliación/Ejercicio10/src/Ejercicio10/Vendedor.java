
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio10;
import java.util.ArrayList;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 20 mar 2026 ⏰ Hora: 8:40:46
* @version 1.0
*******************************************************************************/

public class Vendedor extends Empleado {

    // --------- ATRIBUTOS ---------
    private Coche coche;
    private String telefono;
    private String areaVenta;
    private double comision;
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    // -------- CONSTRUCTOR --------
    public Vendedor(String nombre, String apellidos, String dni, double salario, Coche coche, String telefono, String areaVenta, double comision) {
        super(nombre, apellidos, dni, salario);
        this.coche = coche;
        this.telefono = telefono;
        this.areaVenta = areaVenta;
        this.comision = comision;
        setIncremento(0.1); // 10%
    }    

    // ---------- GETTERS ----------
    public Coche getCoche() {return coche;}
    public String getTelefono() {return telefono;}
    public String getAreaVenta() {return areaVenta;}

    // ---------- SETTERS ----------
    public void setCoche(Coche coche) {this.coche = coche;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public void setAreaVenta(String areaVenta) {this.areaVenta = areaVenta;}

    //---- METODOS DE LA CLASE -----
    public void altaCliente(Cliente c) {
        listaClientes.add(c);
    } // altaCliente(Cliente c)
    
    public void bajaCliente(Cliente c) {
        listaClientes.remove(c);
    } // bajaCliente(Cliente c)
    
    public void listarClientes() {
        if (listaClientes.size() > 0) {
            System.out.println("=== LISTADO DE CLIENTES ===");
            for (int i = 0; i < listaClientes.size(); i++) {                
                System.out.println(i + ". " + listaClientes.get(i).getNombre());
            }
            System.out.println();
        } else {
            System.out.println("=== NO TIENE CLIENTES ===");
        }
    } // listarClientes()
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("PUESTO: SECRETARIO ---");
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("Área de venta: " + this.areaVenta);
        coche.imprimir();
        listarClientes();
    } // imprimir()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘