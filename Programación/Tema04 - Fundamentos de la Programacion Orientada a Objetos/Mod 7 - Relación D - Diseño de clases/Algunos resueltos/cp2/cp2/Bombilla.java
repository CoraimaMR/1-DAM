/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp2;

/**
 *
 * @author Jesús Pérez
 */

/*
'general' es una variable de clase, que controlará para todas las bombillas si
reciben luz o no, es decir, si el interruptor general está encendido o apagado.

FORMAS DE IMPLEMENTARLO:
  - private static boolean general
    Por tanto, para gestionarla, necesitará un método estático para ON y otro para OFF.
    (yo considero más adecuada esta opción)
  - public static boolean general.
    Por tanto, se gestiona directamente llamando al atributo desde la clase principal.
*/
public class Bombilla {
    //---------------- Variables de clase
    private static boolean general;
    
    //---------------- Variables de instancia
    private boolean interruptor;

    //--------------- CONSTRUCTOR ---------------------
    public Bombilla() {    
        general=true;
        interruptor=false;        
    }

    //---------------- MÉTODOS ----------------------
    public static void darLuz(){
        general=true;
    }
    
    public static void cortarLuz(){
        general=false;
    }
    public void bombillaON(){
        interruptor=true;
    }
    
    public void bombillaOFF(){
        interruptor=false;
    }
    
    public boolean estado(){
        if (general&&interruptor) {
            return true;
        } else {
            return false;
        }
    }
    
    public String imprimeEstado(){
//        if (estado()) {
//            return "Encendida";
//        } else {
//            return "Apagada";
//        }
        return estado() ? "Encendida" : "Apagada";
    }
    
}//class
