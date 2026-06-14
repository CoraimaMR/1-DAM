/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5interfaces;

/**
 *
 * @author Jesús Pérez
 */
public class Rectangulo implements Figura{
    private float lado;
    private float altura;
    
    public Rectangulo(float lado, float altura){
        this.lado=lado;
        this.altura=altura;
        
    }
    
    public float area(){
        return lado*altura;
    }
}
