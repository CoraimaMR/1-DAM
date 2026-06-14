
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Figuras;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 16 mar 2026 ⏰ Hora: 12:20:12
* @version 1.0
*******************************************************************************/

public class Circulo implements iFigura2D {

    // --------- ATRIBUTOS ---------
    double radio;
    
    // -------- CONSTRUCTOR --------
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    // ---------- GETTERS ----------
    public double getRadio() {return radio;}

    //---- METODOS DE LA CLASE -----
    public double perimetro() {
        return 2 * Math.PI * radio;
    } // perimetro()

    public double area() {
        return Math.PI * radio * radio;
    } // area()

    public void escalar(double escala) {
        radio *= escala;
    } // escalar(double escala)

    public void imprimir() {
    System.out.printf("Circulo | Radio: %.2f | Perimetro: %.2f | Area: %.2f\n",
            radio, perimetro(), area());
    } // imprimir()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘