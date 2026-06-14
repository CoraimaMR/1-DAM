/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2astros;

import java.util.ArrayList;

/**
 *
 * @author Jesús Pérez
 */
public class Planeta extends Astro{
    private boolean tieneSatelites=false;
    private ArrayList<Satelite> listaSatelites=new ArrayList<>();

    /***************************** CONSTRUCTORES ****************************/
    public Planeta(String nombre, double masa, double diametro, double rotacion, double traslacion, double distancia, double temperatura, double gravedad, ArrayList<Satelite> listaSatelites) {    
        super(nombre, masa, diametro, rotacion, traslacion, distancia, temperatura, gravedad);
        this.listaSatelites = listaSatelites;
        this.tieneSatelites = true;
        
    }
    //Constructor sin satélites
    public Planeta(String nombre, double masa, double diametro, double rotacion, double traslacion, double distancia, double temperatura, double gravedad) {    
        super(nombre, masa, diametro, rotacion, traslacion, distancia, temperatura, gravedad);
        
    }

    public ArrayList<Satelite> getListaSatelites() {
        return listaSatelites;
    }

    public void setListaSatelites(ArrayList<Satelite> listaSatelites) {
        this.listaSatelites = listaSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }
    
        
    
    /******************************** MÉTODOS **********************************/
    public void agregarSatelite(Satelite s){
        this.listaSatelites.add(s);
        this.tieneSatelites=true;
    }
    
    
    public void muestra() {
        System.out.println("\n********* PLANETA: "+getNombre());
        super.muestra();        
       
        if (tieneSatelites) {
            for (int i = 0; i < getListaSatelites().size(); i++) {
                System.out.println("Satélite "+(i+1)+" "+getListaSatelites().get(i).getNombre());
            }//for
        }//if
        
    }

//    @Override
//    void relleno() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
        
}//class
