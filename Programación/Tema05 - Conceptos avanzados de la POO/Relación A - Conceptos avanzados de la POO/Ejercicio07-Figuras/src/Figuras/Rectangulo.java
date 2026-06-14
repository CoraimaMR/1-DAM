
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Figuras;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 16 mar 2026 ⏰ Hora: 12:19:48
* @version 1.0
*******************************************************************************/

public class Rectangulo implements iFigura2D {

    // --------- ATRIBUTOS ---------
    double ancho, alto;

    // -------- CONSTRUCTOR --------
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    // ---------- GETTERS ----------
    public double getAncho() {return ancho;}
    public double getAlto() {return alto;}
    
    //---- METODOS DE LA CLASE -----
    public double perimetro() {
        return 2 * (ancho + alto);
    } // perimetro()

    public double area() {
        return ancho * alto;
    } // area()

    public void escalar(double escala) {
        ancho *= escala;
        alto *= escala;
    } // escalar(double escala)

    public void imprimir() {
    System.out.printf("Rectangulo | Ancho: %.2f | Alto: %.2f | Perimetro: %.2f | Area: %.2f\n",
            ancho, alto, perimetro(), area());
    } // imprimir()
    
    //----- METODOS ESTATICOS ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘