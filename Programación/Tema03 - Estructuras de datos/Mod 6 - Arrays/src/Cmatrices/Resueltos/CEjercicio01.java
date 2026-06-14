 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
+++++++++++++++++++++++++++++++++ ENUNCIADO +++++++++++++++++++++++++++++++++++
1. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números 
del 1 al 25 y luego muestre la matriz por pantalla.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

/**
 *
 * @author Jesús Pérez
 */
public class CEjercicio01 {
    public static void main(String[] args) {
        int m[][] = new int[5][5];
        int num=1;
        
        System.out.println("Filas: "+m.length);
        System.out.println("Columnas: "+m[0].length);
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j]=num;
                num++;
                System.out.print(m[i][j]+"\t");
            }            
            System.out.println("");
        }
    }//main
}//class
