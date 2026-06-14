
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package logica;

/*******************************************************************************
* PLANTILLA CON TODOS MIS MÉTODOS DE VALIDACIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @version 1.0
*******************************************************************************/

public class Lectura {
    
    public static String validaEntero(String s){
        try {
            int n;
            n=Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return "ERROR";
        }
        return s;
    }//validaEntero()
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘