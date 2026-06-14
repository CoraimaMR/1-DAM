
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Figuras;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 16 mar 2026 ⏰ Hora: 12:19:58
* @version 1.0
*******************************************************************************/

public class Triangulo implements iFigura2D {

    // --------- ATRIBUTOS ---------
    double base, altura;
    
    // -------- CONSTRUCTOR --------
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // ---------- GETTERS ----------
    public double getBase() {return base; }
    public double getAltura() {return altura;}

    //---- METODOS DE LA CLASE -----
    public double perimetro() {
        return base * 3;
    } // perimetro()

    public double area() {
        return (base * altura) / 2;
    } // area()

    public void escalar(double escala) {
        base *= escala;
        altura *= escala;
    } // escalar(double escala)

    public void imprimir() {
    System.out.printf("Triangulo | Base: %.2f | Altura: %.2f | Perimetro: %.2f | Area: %.2f\n",
            base, altura, perimetro(), area());
    } // imprimir()
    
    
    //----- METODOS ESTATICOS ------   
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘