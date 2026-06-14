
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
    
    public static boolean validarEntero(String s){
        
        try {
            int n;
            n=Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
        
    }//validaEntero()
    
    public static boolean validarDNI(String nif) {
        
        // Comprobamos que tenga 9 caracteres
        if (nif.length() != 9) return false;

        // Obtenemos los 8 primeros números y la letra
        int numero = Integer.parseInt(nif.substring(0, 8));
        char letra = nif.charAt(8);

        // Comprobamos si la letra es la correcta
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(numero % 23) == Character.toUpperCase(letra);
        
    }//calculaDNI()
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘