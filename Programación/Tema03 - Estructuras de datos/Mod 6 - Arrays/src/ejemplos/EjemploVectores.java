/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplovectores;

/**
 *
 * @author Jesús Pérez
 */
public class EjemploVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro un array unidimensional de enteros
        int[] v1;
        
        //Lo instancio. En este momento se crea el vector
        //Se trata de un vector de tamaño 5
        v1=new int[5];
        
        //Inicialización elemento a elemento. Método poco eficiente.
        v1[0]=20;
        v1[1]=30;
        v1[2]=40;
        v1[3]=50;
        v1[4]=60;
        
        //Creamos un segundo array y lo inicializamos con el atajo {}
        //El tamaño se determina con la cantidad de valores introducidos
        int v2[]={100, 150, 200, 250, 300, 350, 400, 450, 500};
        
        System.out.println("El array v2 tiene tamaño "+v2.length);
        System.out.println("");
        
        //Podemos crear e instanciar un array en la misma línea
        int[] v3=new int[10];
        
        //Inicializamos v3 con un bucle FOR
        //atajo netbeans fori TAB
        for (int i = 0; i < v3.length; i++) {
            v3[i]=(int)(Math.random()*100); //Número aleatorio entre 0 y 99
            
        }
        
        //Imprimimos v3 con un bucle FOR MEJORADO
        //atajo netbeans fore TAB
        System.out.println("Valores aleatorios de v3:");
        for (int i : v3) {
            System.out.print(i+" ");
        }
        System.out.println("");
        
        
    }
           
}
