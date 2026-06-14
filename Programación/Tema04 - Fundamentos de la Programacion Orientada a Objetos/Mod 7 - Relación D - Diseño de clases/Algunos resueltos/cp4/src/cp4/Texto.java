/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp4;
import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.util.Date;
//import ejemplo1colores.Ejemplo1ES;

/**
 *
 * @author Jesús Pérez
 */
public class Texto {
    //Variables de Instancia
    private String cadena;
    private LocalDate creacion;
    private Date modificacion;
    
    //Constantes de instancia
    private final int LONGITUD;
    
    //Constantes de clase
    private static final String VOCALES="aeiouáéíóú";
    
    //---------------------- CONSTRUCTOR -----------------------------

    public Texto(int LONGITUD) {
        this.LONGITUD = LONGITUD;
        cadena="";
        creacion=LocalDate.now();
        modificacion=null;
    }
    
    
    //------------------------ MÉTODOS --------------------------------
    public void addInicio(char c){
        if (LONGITUD>cadena.length()) {
            cadena=c+cadena;
            modificacion=new Date();
        } 
    }//adInicio char
    
    public void addInicio(String cad){
        if (LONGITUD>=cad.length()+cadena.length()) {
            cadena=cad+cadena;
            modificacion=new Date();
        }
    }//adInicio String
    
    public void addFinal(char c){
        if (LONGITUD>cadena.length()) {
            cadena=cadena+c;
            modificacion=new Date();
        }
    }
    
    public void addFinal(String cad){
        if (LONGITUD>=cad.length()+cadena.length()) {
            cadena=cadena+cad;
            modificacion=new Date();
        }
    }
    
    public int cuentaVocales(){
        int num=0;
        for (int i = 0; i < cadena.length(); i++) {
            if (esvocal(cadena.charAt(i))) {
                num++;
            }
        }//for
        return num;
    }
    
    public void imprimeCadena(){
        System.out.println("\nCADENA ACTUAL: "+cadena);
        System.out.println("Creación: "+creacion);
        System.out.println("Última modificación: "+modificacion);
    }
    
    //------------------- MÉTODOS PRIVADOS ------------------------------
    private boolean esvocal(char c){
        boolean resultado=false;
        c=Character.toLowerCase(c);
        if (VOCALES.indexOf(c)!=-1) {
            resultado=true;
        }
        return resultado;
    }
}//class
