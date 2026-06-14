
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 24 ene 2026     ⏰ Hora: 19:08:07
 *
 *  Nombre del programa : CuentaBancaria
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package dawbank;

public class CuentaBancaria {
    
    // --------- ATRIBUTOS ---------
    private final String iban;
    private final String titular;
    private double saldo;
    
    private String[] historial = new String [100];
    private int numMovimientos;
    
    //---- CONSTANTES ESTATICAS ----
    private static final int MAX_MOVIMIENTOS = 100;
    private static final double SALDO_MINIMO = -50;
    private static final double AVISO_HACIENDA = 3000;
    
    // -------- CONSTRUCTOR --------
    public CuentaBancaria (String iban, String titular) {
        if (iban == null || iban.isEmpty()) {
            System.out.println("ERROR. Ivan no valido.");
        }
        
        if (titular == null || titular.trim().isEmpty()) {
            System.out.println("ERROR. Titular no valido.");
        }
        
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
        
        this.historial = new String[MAX_MOVIMIENTOS];
        this.numMovimientos = 0;
    }
    
    // ---------- GETTERS ----------
    public String getIban() {return iban;}
    public String getTitular() {return titular;}
    public double getSaldo() {return saldo;}
    public String[] getHistorial() {return historial;}
    public int getNumMovimientos() {return numMovimientos;}
    
    // ---------- SETTERS ----------
    // No tiene porque el usuario no puede cambiar ningun dato.
    
    //---- METODOS DE LA CLASE -----    
    public void imprimir() {
        System.out.println("-------- DATOS DE LA CUENTA --------");
        System.out.println("IBAN: " + this.iban);
        System.out.println("TITAL: " + this.titular);
        System.out.println("SALDO: " + this.saldo + " €");
    } // imprimir()
    
    public boolean ingreso(double cantidad) {
        if (cantidad > 0) {
            registrarMovimientos("Ingreso: +" + cantidad + " €");
            System.out.println("\n--------- DATOS INGRESO ---------");
            System.out.println("Saldo anterior: " + this.saldo + " €");
            this.saldo += cantidad;
            System.out.println("Saldo actual: " + this.saldo + " €");
            if (cantidad >= AVISO_HACIENDA) {
                System.out.println("AVISO. Su ingreso se notifiara a hacienda.");
            }
            return true;
        } else {
            return false;
        }
    } // ingreso(cantidad)
    
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && (this.saldo - cantidad) >= SALDO_MINIMO) {
            registrarMovimientos("Retirada: -" + cantidad + " €");
            System.out.println("\n--------- DATOS RETIRADA ---------");
            System.out.println("Saldo anterior: " + this.saldo + " €");
            this.saldo -= cantidad;
            System.out.println("Saldo actual: " + this.saldo + " €");
            if (this.saldo < 0) {
                System.out.println("AVISO. Saldo en negativo.");
            }
            return true;
        } else {
            return false;
        }
    } // retirar(canntidad)
    
    private void registrarMovimientos(String texto) {
        if (numMovimientos < MAX_MOVIMIENTOS) {
            this.historial[numMovimientos] = texto;
            numMovimientos++;
        }
    } // registrarMovimientos(texto)
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘