
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Banco;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 11 mar 2026 ⏰ Hora: 12:43:26
* @version 1.0
*******************************************************************************/

public class CuentaCorriente extends CuentaBancaria {
    
    // -------- CONSTRUCTOR --------
    public CuentaCorriente(String numerocuenta) {
        super(numerocuenta);
    }
    
    //---- METODOS DE LA CLASE -----
    public void calcularIntereses(int años) {
        System.out.println("Sus intereses son: " + (this.saldo * IAB * años) + "€");
    } // calcularIntereses(int años)
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘