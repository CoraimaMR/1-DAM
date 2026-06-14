/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp3;

/**
 *
 * @author usuario
 */
public class SintonizadorFM {
    //Constantes de clase
    public static final double LIMITE_INFERIOR=80.0;
    public static final double LIMITE_SUPERIOR=108.0;
    public static final double SALTO=0.5;
    
    //Variables de instancia
    private double frecuencia;
    
    //------------------ CONSTRUCTORES

    public SintonizadorFM() {
        frecuencia=SintonizadorFM.LIMITE_INFERIOR;
    }//constructor

    public SintonizadorFM(double frecuencia) {
        if (frecuencia<LIMITE_INFERIOR) {
            this.frecuencia=LIMITE_INFERIOR;
        } else {
            if (frecuencia>LIMITE_SUPERIOR) {
                this.frecuencia=LIMITE_SUPERIOR;
            } else {
                this.frecuencia=frecuencia;
            }//else
        }//else
        
   }//constructor
    
    //------------------- MÉTODOS 
    public double subir(){
        frecuencia+=SintonizadorFM.SALTO;
        rango();
        return frecuencia;
    }
    
    public double bajar(){
        frecuencia-=SintonizadorFM.SALTO;
        rango();
        return frecuencia;
    }
    
    public void imprimirFrecuencia(){
        
        System.out.println("Frecuencia actual = "+frecuencia+" MHz");
    }
    
    private void rango(){
        if (frecuencia<80) {
            frecuencia=108;
        }
        if (frecuencia>108) {
            frecuencia=80;
        }
    }//rango()
    
    
    //MEJORA: implementar dos métodos que permitan subir o bajar varios saltos de golpe:
    
    public void subirSaltos(int saltos){
        for (int i = 0; i < saltos; i++) {
            this.subir();            
        }
    }//subirSaltos()
    
    public void bajarSaltos(int saltos){
        for (int i = 0; i < saltos; i++) {
            this.bajar();            
        }
    }//bajarSaltos
    
}//class
