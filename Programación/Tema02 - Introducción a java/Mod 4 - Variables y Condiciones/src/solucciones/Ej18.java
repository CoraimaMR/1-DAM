/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
********************************* ENUNCIADO *********************************
Escribe un programa que calcula el salario neto semanal de un trabajador en 
función del número de horas trabajadas y la tasa de impuestos de acuerdo a 
las siguientes hipótesis:
• Las primeras 35 horas se pagan a tarifa normal.
• Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
• Las tasas de impuestos son:
    • Los primeros 500 euros son libres de impuestos.
    • Los siguientes 400 tienen un 25% de impuestos.
    • Los restantes un 45% de impuestos.
Escribir nombre, salario bruto, tasas y salario neto.
*******************************************************************************
*/
package solucciones;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float horas, precio;
        float bruto, neto;
        String nombre;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduzca el nombre del trabajador:");
        nombre=sc.nextLine();
        System.out.println("Introduzca el número de horas trabajadas:");
        horas=sc.nextFloat();
        
        System.out.println("Introduzca el precio de la hora:");
        precio=sc.nextFloat();
        
        //Calculamos el salario bruto
        if (horas<=35) {
            bruto=horas*precio;
        } else {
            bruto=(horas-35f)*precio*1.5f+35f*precio;
        }
        
        //Calculamos los impuestos
        if (bruto<=500) {
            neto=bruto;
        } else {
            if (bruto>900) {
                neto=500f+400f*0.75f+(bruto-900f)*0.55f;
            } else {
                neto=500f+(bruto-400f)*0.75f;
            }
        }
        
        System.out.println("");
        System.out.println(nombre+" ha cobrado:");
        System.out.println("\tBruto = " + bruto);
        System.out.println("\tNeto = " + neto);
       
    }
    
}
