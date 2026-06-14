
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio11;

import java.util.ArrayList;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 23 mar 2026 ⏰ Hora: 13:42:37
* @version 1.0
*******************************************************************************/

public class Sala {

    // --------- ATRIBUTOS ---------
    private int numSala;
    private int numPuestos;
    private ArrayList<Ordenador> listaOrdenadores = new ArrayList<>();
    
    // -------- CONSTRUCTOR --------
    public Sala(int numSala, int numPuestos) {
        this.numSala = numSala;
        this.numPuestos = numPuestos;
    }
    
    // ---------- GETTERS ----------
    public int getNumSala() {return numSala;}
    public int getNumPuestos() {return numPuestos;}
    
    //---- METODOS DE LA CLASE -----
    public void añadirOrdenador(Ordenador o) {
        if (listaOrdenadores.size() < this.numPuestos) {
          listaOrdenadores.add(o); 
            System.out.println("ORDENADOR AÑADIDO CORRECTAMENTE");
        }else{
            System.out.println("NO SE HA PODIDO AÑADIR EL ORDENADOR");
        }
    } // añadirOrdenador(Ordenador o)
    
    public void eliminarOrdenador(Ordenador o) {
        listaOrdenadores.remove(o);
    } // eliminarOrdenador(Ordenador o)
    
    public void listarOrdenadores() {
        for (int i = 0; i < listaOrdenadores.size(); i++) {
            listaOrdenadores.get(i).imprimir();
            listaOrdenadores.get(i).listarIncidencias();
            System.out.println();
        }
    }  // listarOrdenadores()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘