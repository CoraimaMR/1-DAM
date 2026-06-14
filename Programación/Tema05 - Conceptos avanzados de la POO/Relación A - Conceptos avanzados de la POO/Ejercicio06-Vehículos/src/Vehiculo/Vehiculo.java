
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Vehiculo;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 14 mar 2026 ⏰ Hora: 18:19:36
* @version 1.0
*******************************************************************************/

public class Vehiculo {
    
    //--------- ATRIBUTOS ----------
    protected final String matricula;
    protected final String modelo;
    
    // -------- CONSTRUCTOR --------
    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }
    
    // ---------- GETTERS ----------
    public String getMatricula() {return matricula;}
    public String getModelo() {return modelo;}
    
    //---- METODOS DE LA CLASE -----
    public void mostrar() {
        System.out.println("=== DATOS DEL VEHÍCULO ===");
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Modelo: " + this.modelo);
    } // mostrar()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘