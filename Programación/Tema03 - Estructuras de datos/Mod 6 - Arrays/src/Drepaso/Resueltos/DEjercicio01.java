/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
+++++++++++++++++++++++++++++++ ENUNCIADO +++++++++++++++++++++++++++++++++++++
1D. Se desean guardar y representar las notas de 5 alumnos en 4 asignaturas 
(números aleatorios con decimales entre 0 y 10) en una matriz. Además, tanto 
para cada asignatura como para cada alumno, se precisa obtener y almacenar la 
nota máxima, mínima y la media aritmética.
Diseña una estructura de datos y un algoritmo adecuados para ello.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

/*
++++++++++++++++++++++++++++++ EXPLICACIÓN ++++++++++++++++++++++++++++++++++++
Se diseña una matriz (5+3)x(4+3), es decir de 8x7, que corresponde a los 5 alumnos
mas 3 filas (max, min y media) y a las 4 asignaturas más otras 3 filas (max, min y media).
De esta forma, en las filas representamos a los alumnos y en las columnas a las 
asignaturas.
1. Rellenamos de forma aleatoria las filas y las columnas menos 3 respectivamente.
2. Recorremos la matriz por filas para calcular la nota máxima, mínima y media
de cada alumno.
3. Recorremos la matriz por columnas para calcular la nota máxima, mínima y media
de cada asignatura.
4. Mostramos la matriz completa utilizando printf para mostrar 2 decimales solamente
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

/**
 *
 * @author Jesús Pérez
 */
public class DEjercicio01 {
    public static void main(String[] args) {
        final int ASIGNATURAS=4;
        final int ALUMNOS=5;
        
        final int FILAS=ALUMNOS+3;
        final int COLUMNAS=ASIGNATURAS+3;
        
        double max, min, suma;
        
        //Se añaden 3 filas y 3 columnas para calcular MAX, MIN y MEDIA
        double notas[][]=new double[FILAS][COLUMNAS];
        
        //Relleno con notas aleatorias entre 0 y 10
        //Dejo libres las tres filas y columnas finales
        for (int i = 0; i < notas.length-3; i++) {
            for (int j = 0; j < notas[0].length-3; j++) {
                notas[i][j]=Math.random()*10;                
            }//for interno            
        }//for externo
        
        //Calculamos MAX, MIN y MEDIA de los ALUMNOS
        //Recorremos la matriz por filas
        
        for (int i = 0; i < notas.length-3; i++) {
            suma=0.0;
            max=0.0;
            min=10.0;
            for (int j = 0; j < notas[0].length-3; j++) {
                suma+=notas[i][j];
                if (notas[i][j]>max) {
                    notas[i][COLUMNAS-3]=notas[i][j];
                    max=notas[i][j];
                }
                
                if (notas[i][j]<min) {
                    notas[i][COLUMNAS-2]=notas[i][j];
                    min=notas[i][j];
                }                
            }
            notas[i][COLUMNAS-1]=suma/ASIGNATURAS;
        }//for externo
        
        //Calculamos MAX, MIN y MEDIA de las ASIGNATURAS
        //Recorremos la matriz por columnas
        for (int j = 0; j < notas[0].length-3; j++) {
            suma=0.0;
            max=0.0;
            min=10.0;
            for (int i = 0; i < notas.length-3; i++) {
                suma+=notas[i][j];
                if (notas[i][j]>max) {
                    notas[FILAS-3][j]=notas[i][j];
                    max=notas[i][j];
                }
                
                if (notas[i][j]<min) {
                    notas[FILAS-2][j]=notas[i][j];
                    min=notas[i][j];
                }                
            }
            notas[FILAS-1][j]=suma/ALUMNOS;
                                  
        }//for externo
        
        //Listado de la matriz completa
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                System.out.printf("%.2f", notas[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }//main
}
