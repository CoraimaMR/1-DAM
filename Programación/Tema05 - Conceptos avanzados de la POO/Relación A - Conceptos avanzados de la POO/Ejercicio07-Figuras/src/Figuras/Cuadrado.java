
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Figuras;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 16 mar 2026 ⏰ Hora: 12:19:40
* @version 1.0
*******************************************************************************/

public class Cuadrado implements iFigura2D {

    // --------- ATRIBUTOS ---------
    double lado;
    
    // -------- CONSTRUCTOR --------
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    // ---------- GETTERS ----------
    public double getLado() {return lado;}

    //---- METODOS DE LA CLASE -----
    public double perimetro() {
        return lado * 4;
    } // perimetro()

    public double area() {
        return lado * lado;
    } // area()

    public void escalar(double escala) {
        lado = lado * escala;
    } // escalar(double escala)

    public void imprimir() {
    System.out.printf("Cuadrado | Lado: %.2f | Perimetro: %.2f | Area: %.2f\n",
            lado, perimetro(), area());
    } // imprimir()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘