
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 14 ene 2026     ⏰ Hora: 12:57:43
 *
 *  Nombre del programa : Punto
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package e1;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 14 ene 2026 ⏰ Hora: 12:57:43
* @version 1.0
*******************************************************************************/

public class Punto {
    //----------- ATRIBUTOS -----------
    private int x;
    private int y;
    
    //--------- CONSTRUCTURES ---------
    public Punto (int x){
        this.x = x;
    }  // Constructor
    
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }  // Constructor
    
    //------- GETTERS Y SETTERS -------
    public int getX(){return x;}
    public int getY(){return y;}
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    //------ METODOS DE LA CLASE ------
    public void imprime(){ // Imprime por pantalla las coordenadas
        System.out.println ("x=" + this.x + " y=" + this.y);
    }
    
    public void setXY(int x, int y){ // Modifica ambas coordenadas
        this.x = x;
        this.y = y;
    }
    
    public void desplaza(int dx, int dy){ // Desplaza el punto la cantidad(dx,dy) indicada
       this.x = this.x + dx;
       this.y = this.y +dy;
    }
    
    public int distancia(Punto p) {
        int dx = p.x - this.x;
        int dy = p.y - this.y;
        return (int) Math.sqrt(dx * dx + dy * dy);
    }
    
    @Override
    public String toString() { // Calcula y devuelve la distancia entre el propio objeto (this) y otro objeto (Punto p) que se pasa como parámetro
        return "x=" + this.x + " y=" + this.y;
    }
    
    //------ METODOS ESTATICOS ------
    public static Punto creaPuntoAleatorio() {
        int x = (int) (Math.random() * 201) - 100;
        int y = (int) (Math.random() * 201) - 100;

        return new Punto(x, y);
    }
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘