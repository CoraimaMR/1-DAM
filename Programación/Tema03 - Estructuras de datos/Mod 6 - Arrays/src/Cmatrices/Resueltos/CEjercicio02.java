/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
+++++++++++++++++++++++++++++++++ ENUNCIADO +++++++++++++++++++++++++++++++++++
2. Crea un programa que cree una matriz de 10x10 e introduzca los valores de 
las tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará
la matriz por pantalla.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

/**
 *
 * @author Jesús Pérez
 */
public class CEjercicio02 {
    public static void main(String[] args) {
        int tablas[][] = new int[10][10];
        
        //Generación de las tablas de multiplicar recorriendo la matriz
        //por filas. Es lo que pide el ejercicio
        for (int i = 0; i < tablas.length; i++) {
            System.out.print("TABLA DEL "+(i+1)+":\t");
            for (int j = 0; j < tablas[0].length; j++) {
                tablas[i][j]= (i+1)*(j+1);
                System.out.print(tablas[i][j]+ "\t");
            }
            System.out.println("");
        }//for
        
        //RECORRIDO POR COLUMNAS
        //Cabecera de la columna
        System.out.println("\n");
        for (int i = 0; i < tablas.length; i++) {
            System.out.print("T"+(i+1)+"\t");            
        }
        System.out.println("");
        
        //Tablas de multiplicar
        for (int j = 0; j < tablas[0].length; j++) {
            for (int i = 0; i < tablas.length; i++) {
                tablas[i][j]=(i+1)*(j+1);
                System.out.print(tablas[i][j]+ "\t");
            }
            System.out.println("");
        }
    }//main
}
