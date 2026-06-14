
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicio08;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 18 mar 2026 ⏰ Hora: 12:18:45
* @version 1.0
*******************************************************************************/

public class Libro extends Biblioteca implements Prestable {
    
    //--------- ATRIBUTOS ----------
    private boolean estaPrestado;
    
    // -------- CONSTRUCTOR --------
    public Libro(String ISBN, String titulo, String añoPublicacion) {
        super(ISBN, titulo, añoPublicacion);
        this.estaPrestado = false;
    }
     
    //---- METODOS DE LA CLASE -----
    public void presta() {
        if (estaPrestado) {
            System.out.println("Error. El libro ya esta prestado.");
        } else {
            estaPrestado = true;
        }
    } // presta()
    
    public void devuelve() {
        if (!estaPrestado) {
            System.out.println("Error. El libro no esta prestado.");
        } else {
            estaPrestado = false;
        }
    } // devuelve()
    
    public void estaPrestado() {
        if (estaPrestado) {
            System.out.println("El libro esta prestado.");
        } else {
            System.out.println("El libro no esta prestado.");
        }
    } // estaPrestado()
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: Libro ---");
        System.out.println("Está prestado: " + this.estaPrestado);
        System.out.println();
    }  // imprimir()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘