
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio10;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 20 mar 2026 ⏰ Hora: 8:39:56
* @version 1.0
*******************************************************************************/

public class Cliente extends Persona {
    
    // -------- CONSTRUCTOR --------
    public Cliente(String nombre, String apellidos, String dni) {
        super(nombre, apellidos, dni);
    }
    
    //---- METODOS DE LA CLASE -----
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("TIPO: CLIENTE ---");
    }  // imprimir()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘.