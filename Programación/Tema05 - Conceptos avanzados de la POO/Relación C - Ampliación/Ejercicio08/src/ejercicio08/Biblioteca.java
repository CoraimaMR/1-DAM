
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicio08;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 18 mar 2026 ⏰ Hora: 12:19:21
* @version 1.0
*******************************************************************************/

public class Biblioteca {
    
    //--------- ATRIBUTOS ----------
    private final String ISBN;
    private final String titulo;
    private final String añoPublicacion;
    
    // -------- CONSTRUCTOR --------
    public Biblioteca(String ISBN, String titulo, String añoPublicacion) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }
    
    // ---------- GETTERS ----------
    public String getISBN() {return ISBN;}
    public String getTitulo() {return titulo;}
    public String getAñoPublicacion() {return añoPublicacion;}
    
    //---- METODOS DE LA CLASE -----
    public void imprimir() {
        System.out.println("====== DATOS IMPORTANTES =====");
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Año de publicación: " + this.añoPublicacion);
    } // imprimir()
    
    //----- METODOS ESTATICOS ------    
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘