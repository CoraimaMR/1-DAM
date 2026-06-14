
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 15 ene 2026     ⏰ Hora: 15:53:17
 *
 *  Nombre del programa : Articulo
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package b4;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 15 ene 2026 ⏰ Hora: 15:53:17
* @version 1.0
*******************************************************************************/

public class Articulo {

    String nombre;
    double precio;
    int iva;
    double cuantosQuedan;

    public Articulo(String nombre, double precio, int iva, double cuantosQuedan) {
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("Error: nombre inválido");
        } else {
            this.nombre = nombre;
        }

        if (precio <= 0) {
            System.out.println("Error: precio inválido");
        } else {
            this.precio = precio;
        }

        if (iva < 0 || iva > 100) {
            System.out.println("Error: IVA inválido");
        } else {
            this.iva = iva;
        }

        if (cuantosQuedan < 0) {
            System.out.println("Error: cantidad inválida");
        } else {
            this.cuantosQuedan = cuantosQuedan;
        }
    } // Constructor

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘