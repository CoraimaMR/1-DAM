/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5interfaces;

/**
 *
 * @author Jesús Pérez
 */
public class Cuadrado implements Figura{
    private float lado;
    
    public Cuadrado(float lado){
        this.lado=lado;
    }
    
    public float area(){
        return lado*lado;
    }
}
