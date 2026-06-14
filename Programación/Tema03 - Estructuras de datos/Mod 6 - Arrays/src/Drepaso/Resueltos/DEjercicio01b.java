/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */

/* --------------- ENUNCIADO O DESCRIPCIÓN DEL PROGRAMA ----------------------
Se desean guardar y representar las notas de 5 alumnos en 4 asignaturas (números 
aleatorios con decimales entre 0 y 10) en una matriz. Además, tanto para cada 
asignatura como para cada alumno, se precisa obtener y almacenar la nota máxima, 
mínima y la media aritmética.
Diseña una estructura de datos (represéntala primero en un papel) y un algoritmo 
adecuado para ello.
*/

/* --------------------------- MODO DE RESOLVER
Creación de tres estructuras de datos:
  - notas[4][5]. 4x5
    En donde se guardarán la notas aleatorias de los 5 alumnos y las 4 asignaturas
  - asignaturasCalculos[3][ASIGNATURAS]. 3x4
    En donde se guardarán el max, min y media de cada asignatura
  - alumnosCalculos[ALUMNOS][3] 5x3
    En donde se guardarán el max, min y media de cada alumno.

1. Se generan aleatoriamente las notas y se muestran por pantalla.
2. Se calcula el max, min y media de cada alumno, guardando cada dato en su matriz.
3. Se muestran por pantalla los cálculos anteriores.
   Este paso se podría haber evitado incluyéndolo en el bucle anterior. Se hace así
   por motivos didácticos y de formato.
4. Se calcula el max, min y media de cada asignatura, guardando cada dato en su matriz.
5. Se muestran por pantalla los cálculos anteriores.
   Este paso se podría haber evitado incluyéndolo en el bucle anterior. Se hace así
   por motivos didácticos y de formato.
*/

/* ----------------EJEMPLO (REPRESENTACIÓN GRÁFICA) ----------------------------

notas[4][5]                                alumnosCalculos[5][3]                                           
                                         max     min    media
Alumno 0 : 8,16	  5,33	 2,92	4,58  |  8,16	 2,92	5,25
Alumno 1 : 6,95	  6,02	 2,23	4,50  |  6,95	 2,23	4,93	
Alumno 2 : 1,48	  4,90	 9,02	6,55  |  9,02	 1,48	5,49	
Alumno 3 : 0,78	  9,61	 4,98	3,13  |  9,61	 0,78	4,62	
Alumno 4 : 4,12	  8,42	 1,24	9,60  |  9,60	 1,24	5,84	
           -------------------------
      max  8,16	  9,61	 9,02	9,60	
      min  0,78	  4,90	 1,24	3,13
      med  4,30	  6,86	 4,08	5,67	
      asignaturasCalculos[3][5]
*/
public class DEjercicio01b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // CONSTANTES
        final int ALUMNOS=5;
        final int ASIGNATURAS=4;
        
        //Variables locales
        double min=10.0, max=0.0;
        double suma=0;
        
        double notas[][]=new double[ALUMNOS][ASIGNATURAS];
        double asignaturasCalculos[][]=new double[3][ASIGNATURAS];
        double alumnosCalculos[][]=new double[ALUMNOS][3];
        
        //Genero aleatoriamente las notas de los alumnos
        //Las muestro para comprobación
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Alumno "+i+" : ");
            for (int j = 0; j < notas[0].length; j++) {
                notas[i][j]= Math.random()*10;   
                System.out.printf("%.2f\t", notas[i][j]);
            }//for interno
            System.out.println("");
        }//for externo
        
        //Calculo las estadísticas de los alumnos
        //(Recorrido por filas de la matriz de notas)
        for (int i = 0; i < notas.length; i++) {
            min=notas[i][0];
            max=notas[i][0];
            suma=0.0;
            for (int j = 0; j < notas[0].length; j++) {
                if (notas[i][j]>max) {
                    max=notas[i][j];
                }
                
                if (notas[i][j]<min) {
                    min=notas[i][j];
                }
                
                suma+=notas[i][j];
                
            }//for interno
            alumnosCalculos[i][0]=max;
            alumnosCalculos[i][1]=min;
            alumnosCalculos[i][2]=suma/4;
        }//for externo
        
        //Muestro las estadísticas de los alumnos
        System.out.println("\nEstadísticas de alumnos: ");
        System.out.println("Máximo\tMínimo\tMedia");
        for (int i = 0; i < alumnosCalculos.length; i++) {
            for (int j = 0; j < alumnosCalculos[0].length; j++) {
                System.out.printf("%.2f\t",alumnosCalculos[i][j]);
            }//for interno
            System.out.println("");
        }//for externo
        
        
        //Calculo las estadísticas de las asignaturas
        //(Recorrido por columnas de la matriz de notas)
        for (int j = 0; j < notas[0].length; j++) {
            min=notas[0][j];
            max=notas[0][j];
            suma=0.0;
            for (int i = 0; i < notas.length; i++) {
                if (notas[i][j]>max) {
                    max=notas[i][j];
                }
                
                if (notas[i][j]<min) {
                    min=notas[i][j];
                }
                
                suma+=notas[i][j];
                
            }//for interno
            asignaturasCalculos[0][j]=max;
            asignaturasCalculos[1][j]=min;
            asignaturasCalculos[2][j]=suma/5;
            
        }//for externo
        
        
        //Muestro las estadísticas de las asignaturas
        System.out.println("\nEstadísticas de asignaturas: ");
        for (int i = 0; i < asignaturasCalculos.length; i++) {
            for (int j = 0; j < asignaturasCalculos[0].length; j++) {
                System.out.printf("%.2f\t",asignaturasCalculos[i][j]);
            }//for interno
            System.out.println("");
        }//for externo
        
    }//main

}//class
