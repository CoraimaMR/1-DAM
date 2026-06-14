
import java.util.Scanner;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jesús Pérez 
 */

/* ------------------------------- ENUNCIADO ----------------------------------
Escribe un programa que genere n números enteros aleatorios entre 0 y 100 (donde n
es un número solitado por teclado) y que los almacene en un array. El programa 
debe ser capaz de pasar todos los números pares a las primeras posiciones del array 
(del 0 en adelante) y todos los números impares a las celdas restantes. Tanto los 
números pares como los impares, deben de estar ordenados de menor a mayor.
*/
public class DEjercicio10b {
    public static void main(String[] args) {
        int n;
        int numPares=0, numImpares=0;
        Scanner sc = new Scanner(System.in);
        
        //Solicito el valor de n
        System.out.println("Introduzca cuántos números aleatorios desea: ");
        n=sc.nextInt();
        
        //Declaro el vector principal y los dos auxiliares que voy a utilizar
        int[] numeros = new int[n];
        int[] pares = new int[n];
        int[] impares = new int[n];
        
        //Relleno el vector principal con valores aleatorios.
        //El valor generado se almacena también en el vector auxiliar correspondiente
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int)(Math.random()*101);
            if (numeros[i]%2==0) {
                pares[numPares]=numeros[i];
                numPares++;
            } else {
                impares[numImpares]=numeros[i];
                numImpares++;
            }//if
        }//for
        
//        //Ordeno los vectores
//        Arrays.sort(pares);
//        Arrays.sort(impares);
        
        //Muestro el vector generado
        System.out.println("Este es el vector original: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }//for
        System.out.print(" --- VECTOR ORIGINAL\n");
        
        //Pongo los pares al principio
        for (int i = 0; i < numPares; i++) {
            numeros[i]=pares[i];
        }
        
        //Pongo los impares a continuación, es decir donde me quedé: numPares
        for (int i = numPares; i < numeros.length; i++) {
            numeros[i]=impares[i-numPares];
        }
        
        //Muestro el vector final
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }//for
        System.out.print(" --- VECTOR FINAL\n");
        
    }//main
}//class
