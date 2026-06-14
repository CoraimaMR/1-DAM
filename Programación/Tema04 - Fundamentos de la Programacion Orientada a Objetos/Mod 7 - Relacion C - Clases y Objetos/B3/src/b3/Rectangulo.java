
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

package b3;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 15 ene 2026 ⏰ Hora: 14:00:02
* @version 1.0
*******************************************************************************/

public class Rectangulo {

    int x1;
    int y1;
    int x2;
    int y2;
    
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
    
    
    
    

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘