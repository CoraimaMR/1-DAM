/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
****************************** ENUNCIADO ************************************
Escribe un programa que recibe como datos de entrada una hora expresada en 
horas, minutos y segundos que nos calcula y escribe la hora, minutos y segundos 
que serán, transcurrido un segundo.
*****************************************************************************
*/
package solucciones;
import java.util.Scanner;
/**
 *
 * @author Jesús Pérez
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DECLARACIÓN DE VARIABLES
        int horas, min, seg;
        
        //Lectura de los valores de las variables
        Scanner sc=new Scanner(System.in);
        
        //Pedimos la hora y comprobamos que no se sale del rango 0-23
        System.out.println("Introduzca la hora (0-23):");
        horas=sc.nextInt();
        while (horas<0||horas>23) {
            System.err.println("Introduzca una HORA válida (0-23):");
            horas=sc.nextInt();
        }
        
        //Pedimos los minutos y comprobamos que no se sale del rango 0-59
        System.out.println("Introduzca los minutos (0-59):");
        min=sc.nextInt();
        while (min<0||min>59) {
            System.err.println("Introduzca los MINUTOS correctamente (0-59):");
            min=sc.nextInt();
        }
        
        //Pedimos los segundos y comprobamos que no se salen del rango 0-59
        System.out.println("Introduzca los segundos (0-59):");
        seg=sc.nextInt();
        while (seg<0||seg>59) {
            System.err.println("Introduzca los SEGUNDOS correctamente (0-59):");
            seg=sc.nextInt();
        }
                
        //Cálculos
        if (seg==59) {
            seg=0;
            if (min==59) {
                min=0;
                if (horas==23) {
                    horas=0;                    
                } else {
                    horas++;
                }
            } else {
                min++;
            }
        } else {
            seg++;
        }
        
        //System.out.println("La hora actual es "+horas+":"+min+":"+seg);
        
        //https://www.lawebdelprogramador.com/foros/Java/679076-RELLENAR-CON-CEROS-A-LA-IZQUIERDA.html
        System.out.println(String.format("La hora actual es %02d %02d %02d", horas, min, seg ));
    }
    
}
