
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

package d4;

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
    private int cuantosQuedan;

    //--------- CONSTRUCTURES ---------
    public Articulo(String nombre, double precio, int iva, int cuantosQuedan) {
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
    public String getNombre() {return nombre;}
    public double getPrecio() {return precio;}
    public int getIva() {return iva;}
    public int getCuantosQuedan() {return cuantosQuedan;}

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
    
    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan < 0) {
            System.out.println("Error: cantidad inválida");
        } else {
            this.cuantosQuedan = cuantosQuedan;
        }
    }
    
    //------ METODOS DE LA CLASE ------
    public void imprimir () { // Imprimo los datos del objeto
          System.out.printf("%s - Precio: %.2f€ - IVA: %d%% - Stock: %d\n",
                this.nombre, this.precio, this.iva, this.cuantosQuedan);
    }
    
    public double getPVP () { // Calculo el PVP
        return this.precio + (this.precio * this.iva / 100);
    }
    
    public double getPVPDescuento (int descuento) { // Calcular el PVP con descuentoa aplicado
        double pvp = getPVP();
        return pvp - (pvp * descuento / 100);
    }
    
    public boolean vender (int vendido) { // Stock del objeto
        if (vendido >  this.cuantosQuedan) {
            return false;
        } else {
            this.cuantosQuedan -= vendido;
            return true;
        }
    }
    
    public boolean almacenar (int cantidadAlmacenar) { // Almacenar objetos
        if (cantidadAlmacenar < 0) {
            return false;
        } else {
            this.cuantosQuedan += cantidadAlmacenar;
            return true;
        }
    }
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘