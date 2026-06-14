// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio11;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 23 mar 2026 ⏰ Hora: 12:32:39
* @version 1.0
*******************************************************************************/

public class TarjetaGrafica {

    // --------- ATRIBUTOS ---------
    private String marca;
    private String modelo;
    private int memoriaGrafica;
    
    // -------- CONSTRUCTOR --------
    public TarjetaGrafica(String marca, String modelo, int memoriaGrafica) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaGrafica = memoriaGrafica;
    }
    
    // ---------- GETTERS ----------
    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public int getMemoriaGrafica() {    return memoriaGrafica;}

    // ---------- SETTERS ----------
    public void setMarca(String marca) {this.marca = marca;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setMemoriaGrafica(int memoriaGrafica) {this.memoriaGrafica = memoriaGrafica;}
    
    //---- METODOS DE LA CLASE -----
    public void imprimir() {
        System.out.println("DATOS DE LA TARJETA GRÁFICA ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Memoría gráfica: " + this.memoriaGrafica);
    } // imprimir()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘