
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Main;
import Mascota.Aves.Canario;
import Mascota.Aves.Loro;
import Mascota.Gato;
import Mascota.Mascota;
import Mascota.Perro;
import java.util.ArrayList;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 10 mar 2026 ⏰ Hora: 10:01:00
* @version 1.0
*******************************************************************************/

public class Inventario {    

    // --------- ATRIBUTOS ---------
    private ArrayList<Mascota> animales;
    
    // -------- CONSTRUCTOR --------    
    public Inventario() {
        animales = new ArrayList<>();
    }
    
    //---- METODOS DE LA CLASE -----
    public void insertarAnimal(Mascota animal) {
        animales.add(animal);
    } // insertarAnimal(Mascota animal)
    
    public void eliminarAnimal(int i) {
        if (i >= 0 && i < animales.size()) {
            animales.remove(i);            
        }else{
            System.out.println("ERROR. Posición de eliminación no válida.");
        }
    } // eliminarAnimal(int i)
    
    public void mostrarListaAnimales() {
        System.out.println("\n===== LISTADO DE ANIMALES =====");
        for (int i = 0; i < animales.size(); i++) {
            Mascota m = animales.get(i);
            System.out.print(i + ". " + m.getNombre());
            System.out.print(" (" +getTipoMascota(m) + ")\n");
        }
    } // mostrarListaAnimales()
    
    private String getTipoMascota(Mascota m){
        if (m instanceof Perro) {
            return "Perro";
        } else {
            if (m instanceof Gato) {
                return "Gato";
            } else {
               if (m instanceof Loro) {
                    return "Loro";
                } else {
                   if (m instanceof Canario) {
                        return "Canario";
                    } else {
                       return null;
                    }
                } 
            }
        }
    } // getTipoMascota (Mascota)

    public void mostrarTodosAnimales() {
       for (int i = 0; i < animales.size(); i++) {
            Mascota m = animales.get(i);
            m.muestra();
        } 
    } // mostrarTodosAnimales()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘