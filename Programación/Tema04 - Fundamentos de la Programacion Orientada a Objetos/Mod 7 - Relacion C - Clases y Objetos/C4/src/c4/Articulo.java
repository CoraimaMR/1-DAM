
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

package c4;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 15 ene 2026 ⏰ Hora: 15:53:17
* @version 1.0
*******************************************************************************/

public class Articulo {
    //----------- ATRIBUTOS -----------
    private String nombre;
    private double precio;
    private int iva;
    private double cuantosQuedan;

    //--------- CONSTRUCTURES ---------
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

        if (iva != 21) {
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

    //------- GETTERS Y SETTERS -------
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getIva() {
        return iva;
    }

    public double getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("Error: nombre inválido");
        } else {
            this.nombre = nombre;
        }
    }
    
    public void setPrecio(double precio) {
        if (precio <= 0) {
            System.out.println("Error: precio inválido");
        } else {
            this.precio = precio;
        }
    }
    
    public void setIva(int iva) {
        if (iva != 21) {
            System.out.println("Error: IVA inválido");
        } else {
            this.iva = iva;
        }
    }
    
    public void setCuantosQuedan(double cuantosQuedan) {
        if (cuantosQuedan < 0) {
            System.out.println("Error: cantidad inválida");
        } else {
            this.cuantosQuedan = cuantosQuedan;
        }
    }
    
    //------ METODOS DE LA CLASE ------
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘