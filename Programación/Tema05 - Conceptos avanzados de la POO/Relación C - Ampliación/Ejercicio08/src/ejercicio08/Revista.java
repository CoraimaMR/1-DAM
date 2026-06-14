
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicio08;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 18 mar 2026 ⏰ Hora: 12:19:30
* @version 1.0
*******************************************************************************/

public class Revista extends Biblioteca implements Prestable {
    
    //--------- ATRIBUTOS ----------
    private boolean estaPrestado;
    
    // -------- CONSTRUCTOR --------
    public Revista(String ISBN, String titulo, String añoPublicacion) {
        super(ISBN, titulo, añoPublicacion);
        this.estaPrestado = false;
    }
    
    //---- METODOS DE LA CLASE -----
    public void presta() {
        if (estaPrestado) {
            System.out.println("Error. La revista ya esta prestado.");
        } else {
            estaPrestado = true;
        }
    } // presta()
    
    public void devuelve() {
        if (!estaPrestado) {
            System.out.println("Error. La revista no esta prestado.");
        } else {
            estaPrestado = false;
        }
    } // devuelve()
    
    public void estaPrestado() {
        if (estaPrestado) {
            System.out.println("La revista esta prestado.");
        } else {
            System.out.println("La revista no esta prestado.");
        }
    } // estaPrestado()
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: Revista ---");
        System.out.println("Está prestado: " + this.estaPrestado);
        System.out.println();
    }
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘