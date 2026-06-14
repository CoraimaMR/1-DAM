/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2astros;

/**
 *
 * @author Jesús Pérez
 */
public class Satelite extends Astro{
    private Planeta planet;
    
    //CONSTRUCTOR

    public Satelite(Planeta planet, String nombre, double masa, double diametro, double rotacion, double traslacion, double distancia, double temperatura, double gravedad) {
        super(nombre, masa, diametro, rotacion, traslacion, distancia, temperatura, gravedad);
        this.planet = planet;
    }
    
    //Método muestra() heredado como abstracto

    public void muestra() {
        System.out.println("\n********* SATÉLITE: "+getNombre());
        System.out.println("PLANETA AL QUE PERTENECE: "+getPlanet().getNombre());
        super.muestra();
    }

    public Planeta getPlanet() {
        return planet;
    }

    public void setPlanet(Planeta planet) {
        this.planet = planet;
    }

//    @Override
//    void relleno() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
    
    
}
