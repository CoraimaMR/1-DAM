/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2astros;

/**
 *
 * @author Jesús Pérez
 */
public abstract class Astro {
    /********************* VARIABLES DE INSTANCIA *****************************/
    protected String nombre;
    protected double masa;
    protected double diametro;
    protected double rotacion;
    protected double traslacion;
    protected double distancia;
    protected double temperatura;
    protected double gravedad;

    /*******************************CONSTRUCTOR*********************************/
    
    public Astro(String nombre, double masa, double diametro, double rotacion, double traslacion, double distancia, double temperatura, double gravedad) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.rotacion = rotacion;
        this.traslacion = traslacion;
        this.distancia = distancia;
        this.temperatura = temperatura;
        this.gravedad = gravedad;
    }

       
    /*********************** GETTERS Y SETTERS *******************************/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRotacion() {
        return rotacion;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    public double getTraslacion() {
        return traslacion;
    }

    public void setTraslacion(double traslacion) {
        this.traslacion = traslacion;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }
    
        
   /******************************** MÉTODOS **********************************/
   
    //abstract void relleno();
    
    public void muestra(){
        System.out.println("Masa = "+getMasa());
        System.out.println("Diámetro = "+getDiametro());
        System.out.println("Rotación = "+getRotacion());
        System.out.println("Traslación = "+getTraslacion());
        System.out.println("Distancia al sol = "+getDistancia());
        System.out.println("Temperatura media = "+getTemperatura());
        System.out.println("Gravedad = "+getGravedad());
    }
   
}//class
