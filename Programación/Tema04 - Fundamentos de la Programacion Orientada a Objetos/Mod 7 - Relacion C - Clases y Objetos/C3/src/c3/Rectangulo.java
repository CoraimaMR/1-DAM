
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 15 ene 2026     ⏰ Hora: 14:00:02
 *
 *  Nombre del programa : Rectangulo
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package c3;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 15 ene 2026 ⏰ Hora: 14:00:02
* @version 1.0
*******************************************************************************/

public class Rectangulo {
    //----------- ATRIBUTOS -----------
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    //--------- CONSTRUCTURES ---------
    public Rectangulo (int x1, int y1, int x2, int y2) {
        // Comprobamos si es un rectangulo valido
        if ((x1 < x2) && (y1 <y2)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.out.println("ERROR. Instanciar el Rectángulo");
        } 
    }  // Constructor

    //------- GETTERS Y SETTERS -------
    public int getX1() {
        return x1;
    }
    
    public int getY1() {
        return y1;
    }
    
    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
    
    public void setX1(int x1) {
        if (x1 < this.x2) {
            this.x1 = x1;
        } else {
            System.out.println("ERROR. LA coordenada x1 tiene que ser menor a x2.");
        }
    }

    public void setY1(int y1) {
        if (y1 < this.y2) {
            this.y1 = y1;
        } else {
            System.out.println("ERROR. LA coordenada y1 tiene que ser menor a y2.");
        }
    }
    
    public void setX2(int x2) {
        if (x2 > this.x1) this.x2 = x2;
        else System.out.println("ERROR: x2 debe ser mayor que x1.");
    }

    public void setY2(int y2) {
        if (y2 > this.y1) this.y2 = y2;
        else System.out.println("ERROR: y2 debe ser mayor que y1.");
    }
    
    //------ METODOS DE LA CLASE ------

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘