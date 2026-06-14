/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej33;

/*
******************************** ENUNCIADO ************************************
33. Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.
*******************************************************************************
*/
/**
 *
 * @author Jesús Pérez
 */
public class Ej33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        int suspensos = 0;
        int suficientes = 0;
        int bienes = 0;
        int notables = 0;
        int sobresalientes = 0;
    
        for(int i = 1; i <= 20; i++) {

          nota = (int)(Math.random() * 5);

          switch(nota) {
            case 0:
              System.out.println(i+". Suspenso ");
              suspensos++;
              break;
            case 1:
              System.out.println(i+". Suficiente ");
              suficientes++;
              break;
            case 2:
              System.out.println(i+". Bien ");
              bienes++;
              break;
            case 3:
              System.out.println(i+". Notable ");
              notables++;
              break;
            case 4:
              System.out.println(i+". Sobresaliente ");
              sobresalientes++;
              break;
            default:
          }

        }

        System.out.println("\nNº de suspensos: " + suspensos);
        System.out.println("Nº de suficientes: " + suficientes);
        System.out.println("Nº de bienes: " + bienes);
        System.out.println("Nº de notables: " + notables);
        System.out.println("Nº de sobresalientes: " + sobresalientes);
    }
    
}
