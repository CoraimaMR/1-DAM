
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
    
    public static boolean validarDecimal(String s) {
        
        try {
            double d;
            d=Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
        
    }//validarDecimal()
    
    public static boolean esPar(int numero) {
        
        // Devuelve true si el residuo de dividir entre 2 es cero
        return numero % 2 == 0;
        
    }//esPar()
    
    public static boolean validarTelefono(String tlf) {
        
        // Comprobamos que tenga 9 dígitos numéricos y empiece por 6, 7, 8 o 9
        if (tlf == null) return false;
        return tlf.matches("^[6-9]\\d{8}$");
        
    }//validarTelefono()
    
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
    
    public static boolean validarTextoNoVacio(String s) {
        
        // Comprobamos que la cadena no sea nula ni contenga solo espacios
        if (s == null) return false;
        return !s.trim().isEmpty();
        
    }//validarTextoNoVacio()
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘