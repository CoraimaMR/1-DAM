
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Banco;
import java.util.ArrayList;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 11 mar 2026 ⏰ Hora: 12:43:11
* @version 1.0
*******************************************************************************/

public class CuentaBancaria {

    // --------- ATRIBUTOS ---------
    protected final String IBAN;
    protected double saldo;
    protected static final double IAB = 0.9; // Interes Anual Basico
    ArrayList<CuentaBancaria> cuenta = new ArrayList<>();
    
    // -------- CONSTRUCTOR --------
    public CuentaBancaria(String numerocuenta) {
        this.IBAN = numerocuenta;
        this.saldo = 0;
    }
    
    // ---------- GETTERS ----------
    public String getIBAN() {return IBAN;}
    public double getSaldo() {return saldo;}
    
    //---- METODOS DE LA CLASE -----
    public void ingresar(double ingreso) {
        añadir(ingreso);
        System.out.println("INGRESO HECHA CON ÉXITO +" + ingreso);
    } // ingresar(double ingreso)
    
    public void retirar(double retirada) {        
        if (this.saldo >= retirada) {
            añadir(-retirada);
            System.out.println("RETIRADA HECHA CON ÉXITO -" + retirada);
        } else {
            System.out.println("ERROR DE RETIRADA. Dinero insuficiente.");
        }
    } // retirar(double retirada)
    
    public void traspaso(CuentaBancaria a, CuentaBancaria b, double cantidad) {
        if (a.saldo >= cantidad) {
            a.retirar(cantidad);
            b.ingresar(cantidad);
        } else {
            System.out.println("ERROR DE TRASPASO. Dinero insuficiente.");
        }
    } // traspaso(CuentaBancaria a, CuentaBancaria b, double cantidad)
    
    private void añadir(double cantidad) {
        this.saldo += cantidad;
    } // añadir(double cantidad)
    
    public void mostrar() {
        System.out.println("==== DATOS DE LA CUENTA ====");
        System.out.println("IBAN: " + this.IBAN);
        System.out.println("Saldo: " + this.saldo + "€");
        System.out.println("");
    } // toString()    
       
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘