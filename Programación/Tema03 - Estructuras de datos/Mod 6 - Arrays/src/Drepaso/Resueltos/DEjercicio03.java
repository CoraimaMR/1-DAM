/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
RELACIÓN D - EJERCICIO 3
Realiza un programa que muestre por pantalla un array de 9 filas por 9
columnas relleno con números aleatorios entre 500 y 900. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

/**
 *
 * @author Jesús Pérez
 */
public class DEjercicio03 {
    public static void main(String[] args) {
        int m[][]=new int[9][9];
        int fila, columna;
        int max=500;
        int min=900;
        int suma=0;
        
        //Rellena array con números aleatorios entre 500 y 900
        //La muestro para pode comparar el resultado final
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j]=500+(int)(Math.random()*401);
                System.out.print(m[i][j]+"\t");
            }            
            System.out.println("");
        }//for externo
        
        //Muestra diagonal 
        System.out.println("");
        fila=m.length-1;
        columna=0;
        while (fila>=0) {
            System.out.print(m[fila][columna]+"\t");
            
            if (m[fila][columna]>max) {
                max=m[fila][columna];
            }
            
            if (m[fila][columna]<min) {
                min=m[fila][columna];
            }
            suma+=m[fila][columna];
            fila--;
            columna++;
        }//while
        System.out.println("");
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("Media = "+(suma/m.length));
    }//main
}
