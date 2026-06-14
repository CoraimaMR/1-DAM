/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5interfaces;

/**
 *
 * @author Jesús Pérez
 */
public class Circulo implements Figura{
    private float diametro;
    
    public Circulo(float diametro){
        this.diametro=diametro;
    }
    
    public float area(){
        return (PI*diametro*diametro/4f);
    }
}
