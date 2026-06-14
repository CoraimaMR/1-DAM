
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio10;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 20 mar 2026 ⏰ Hora: 8:42:18
* @version 1.0
*******************************************************************************/

public class Coche {

    // --------- ATRIBUTOS ---------
    private final String matricula;
    private final String marca;
    private final String modelo;
    
    // -------- CONSTRUCTOR --------
    public Coche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // ---------- GETTERS ----------
    public String getMatricula() {return matricula;}
    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    
    //---- METODOS DE LA CLASE -----
    public void imprimir() {
        System.out.println("=== DATOS DEL VEHICULO ===");
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    } // imprimir()
    
    //----- METODOS ESTATICOS ------    
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘