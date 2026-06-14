
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Banco;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 11 mar 2026 ⏰ Hora: 12:43:41
* @version 1.0
*******************************************************************************/

public class CuentaAhorro extends CuentaBancaria {

    // --------- ATRIBUTOS ---------    
    private static final double SALDO_MINIMO = 10;
    
    // -------- CONSTRUCTOR --------
    public CuentaAhorro(String numerocuenta) {
        super(numerocuenta);
    }
    
    //---- METODOS DE LA CLASE -----
    public void calcularIntereses(int años) {
        if (this.saldo >= SALDO_MINIMO) {
            System.out.println("Sus intereses son: " + (this.saldo * IAB * años) + "€");
        }
    } // calcularIntereses(int años)    
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘