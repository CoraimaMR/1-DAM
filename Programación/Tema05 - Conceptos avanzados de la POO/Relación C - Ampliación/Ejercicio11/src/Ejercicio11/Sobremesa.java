
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio11;
import java.util.ArrayList;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 23 mar 2026 ⏰ Hora: 12:32:08
* @version 1.0
*******************************************************************************/

public class Sobremesa extends Ordenador {
    
    // --------- ATRIBUTOS ---------
    private ArrayList<TarjetaGrafica> listaTarjetaGrafica = new ArrayList<>();
    
    // -------- CONSTRUCTOR --------
    public Sobremesa(int almacenamiento, int ram, String microprocesador) {
        super(almacenamiento, ram, microprocesador);
        this.setConexionCable(true);
        this.setConexionInalambrica(false);
    }
    
    //---- METODOS DE LA CLASE -----
    public void añadirTarjetaGrafica(TarjetaGrafica t) {
        listaTarjetaGrafica.add(t);
    } // añadirTarjetaGrafica(TarjetaGrafica t)
    
    public void eliminarTarjetaGrafica(TarjetaGrafica t) {
        listaTarjetaGrafica.remove(t);
    } // eliminarTarjetaGrafica(TarjetaGrafica t)
    
    public void listarTarjetaGrafica() {
        if (listaTarjetaGrafica.size() > 0) {
            System.out.println("\n===== LISTA TARJETAS GRÁFICAS =====");
            for (int i = 0; i < listaTarjetaGrafica.size(); i++) {
                System.out.print((i+1) + ". ");
                listaTarjetaGrafica.get(i).imprimir();
            }
        }else{
            System.out.println("=== NO HAY TARJETAS GRÁFICAS ===");
        }
    } // listarTarjetaGrafica()
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("TIPO: SOBREMESA ---");
        listarTarjetaGrafica();
    } // imprimir()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘