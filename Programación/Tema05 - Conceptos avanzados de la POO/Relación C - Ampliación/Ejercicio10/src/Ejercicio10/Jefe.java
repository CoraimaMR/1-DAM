
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio10;
import java.util.ArrayList;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 20 mar 2026 ⏰ Hora: 8:41:25
* @version 1.0
*******************************************************************************/

public class Jefe extends Empleado {

    // --------- ATRIBUTOS ---------
    private Secretario secretario;
    private int despacho;
    private Coche coche;
    private ArrayList<Vendedor> listaVendedores = new ArrayList<>();
    
    // -------- CONSTRUCTOR --------
    public Jefe(String nombre, String apellidos, String dni, double salario, Secretario secretario, int despacho, Coche coche) {
        super(nombre, apellidos, dni, salario);
        this.secretario = secretario;
        this.despacho = despacho;
        this.coche = coche;
        setIncremento(0.2); // 20%
    }    

    // ---------- GETTERS ----------
    public int getDespacho() {return despacho;}
    public Secretario getSecretario() {return secretario;}    
    public Coche getCoche() {return coche;}
    
    // ---------- SETTERS ----------
    public void setSecretario(Secretario secretario) {this.secretario = secretario;}    
    public void setDespacho(int despacho) {this.despacho = despacho;}
    public void setCoche(Coche coche) {this.coche = coche;}

    //---- METODOS DE LA CLASE -----
    public void altaVendedor(Vendedor v) {
        listaVendedores.add(v);
    } // altaVendedor(Vendedor v)
    
    public void bajaVendedor(Vendedor v) {
        listaVendedores.remove(v);
    } // bajaVendedor(Vendedor v)
    
    public void listarVendedores() {
        if (listaVendedores.size() > 0) {
            System.out.println("=== LISTADO DE CLIENTES ===");
            for (int i = 0; i < listaVendedores.size(); i++) {
                System.out.println(i + ". " + listaVendedores.get(i).getNombre());
            }
        } else {
            System.out.println("=== NO TIENE CLIENTES ===");
        }
    } // listarVendedores()
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("PUESTO: JEFE DE ZONA ---");
        System.out.println("Número de despacho: " + this.despacho);
        coche.imprimir();
        listarVendedores();
    } // imprimir()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘