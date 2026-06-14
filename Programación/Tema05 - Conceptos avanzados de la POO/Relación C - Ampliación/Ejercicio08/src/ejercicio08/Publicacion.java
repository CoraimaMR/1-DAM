
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicio08;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 18 mar 2026 ⏰ Hora: 12:19:03
* @version 1.0
*******************************************************************************/

public class Publicacion extends Biblioteca {
    
    // -------- CONSTRUCTOR --------
    public Publicacion(String ISBN, String titulo, String añoPublicacion) {
        super(ISBN, titulo, añoPublicacion);
    }
    
    //---- METODOS DE LA CLASE -----
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: Publicación ---");
        System.out.println();
    }  // imprimir()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘