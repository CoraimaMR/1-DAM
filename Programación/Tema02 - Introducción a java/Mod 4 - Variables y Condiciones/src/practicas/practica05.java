/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class practica05 {
    
/*
    5. Escribe un programa que toma como dato de entrada un número que corresponde a la longitud
de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el volumen de la
esfera que corresponden con dicho radio.
*/
    public static void main(String[] args) {
       
        final int RADIO;
        double longitud,area,volumen;
       
        RADIO=5;
        
        longitud = 2*PI*RADIO;
        area = PI*(RADIO^2);
        volumen = (4/3)*PI*(RADIO^3);
                
        System.out.println("-------------------------------------------");
        System.out.println("Radio de la circuferencia: "+RADIO);
        System.out.println("Longitud de la circuferencia: "+longitud);
        System.out.println("Área de la circuferencia: "+area);
        System.out.println("Volumen de la circuferencia: "+volumen);
        System.out.println("-------------------------------------------");
    }
}
