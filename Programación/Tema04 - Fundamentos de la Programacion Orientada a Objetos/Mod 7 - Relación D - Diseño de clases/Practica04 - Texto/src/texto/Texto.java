
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package texto;
import java.time.LocalDate;
import java.util.Date;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 26 ene 2026 ⏰ Hora: 11:08:10
* @version 1.0
*******************************************************************************/

public class Texto {
    
    // ---- VARIABLES ESTATICAS ----
    private final int maxLongitud;
    private final LocalDate fechaCreacion;

    // -- VARIABLES DE INSTANCIA --
    private String cadena;
    private Date fechaUltimaModificacion;
    
    //---- CONSTANTES ESTATICAS ----
    private static final String VOCALES="aeiouáéíóú";
    
    // -------- CONSTRUCTOR --------
    public Texto(int maxLongitud){
        this.maxLongitud = maxLongitud;
        this.cadena = "";
        
        this.fechaCreacion = LocalDate.now();
        this.fechaUltimaModificacion = null;
    }
    
    //---- METODOS DE LA CLASE -----
    
    public void addInicio(String texto) {
        if (cadena.length() + texto.length() <= maxLongitud) {
            cadena = texto + cadena;
            fechaUltimaModificacion = new Date();
        }
    }

    public void addFinal(String texto) {
        if (cadena.length() + texto.length() <= maxLongitud) {
            cadena = cadena + texto;
            fechaUltimaModificacion = new Date();
        }
    }
    
    public int cuentaVocales() {
        int contador = 0;
        String texto = cadena.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (VOCALES.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }
    
    public void imprimeCadena() {
        System.out.println(cadena);
    }
    
    public void mostrarInfo() {
        System.out.println("\nTexto: " + cadena);
        System.out.println("Longitud máxima: " + maxLongitud);
        System.out.println("Longitud actual: " + cadena.length());
        System.out.println("Fecha de creación: " + fechaCreacion);
        System.out.println("Última modificación: " + fechaUltimaModificacion);
    }
    
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘