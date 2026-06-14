/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejemplos;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class EjemploConversionDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota1, nota2, nota3;
        int notaSeneca;
        double media;
        int c='a';
        char caracter=110;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce la nota 1:");
        nota1=sc.nextInt();
        
        System.out.println("Introduce la nota 2:");
        nota2=sc.nextInt();
        
        System.out.println("Introduce la nota 3:");
        nota3=sc.nextInt();
        
        //1. CONVERSIÓN DE ENSANCHAMIENTO (sin pérdida de información)
        //Al dividir por 3.0 estamos indicando que queremos hacer una división
        //con decimales y almacenarla en una variable tipo double
        media=(nota1+nota2+nota3)/3.0;
        
        //2. CONVERSIÓN DE ESTRECHAMIENTO (con pérdida de información)
        //Asignamos la media con decimales a un entero mediante un casting.
        //De esta manera, se truncan los decimales (no se produce un redondeo)
        notaSeneca=(int)media;
        
        System.out.println("CONVERSIÓN DE ENSANCHAMIENTO:");
        System.out.println("media = " + media);
        System.out.println("");
        System.out.println("CONVERSIÓN DE ESTRECHAMIENTO:");
        System.out.println("notaSeneca = " + notaSeneca);
        System.out.println("");
        
        //Sumamos 0.5 a la media y truncamos sus decimales
        System.out.println("REDONDEO DE LA MEDIA AL ENTERO MÁS PRÓXIMO:");
        notaSeneca=(int)(media+0.5);
        System.out.println("notaSeneca = " + notaSeneca);
        
        //3. CASO ESPECIAL: CARACTERES Y ENTEROS
        System.out.println("");
        System.out.println("------------------- CASO ESPECIAL -------------------");
        //CONVERSIÓN DE UN CARÁCTER A UN ENTERO       
        System.out.println("CONVERSIÓN DEL CARÁCTER a A UN ENTERO (VALOR UNICODE)");
        System.out.println("c = " + c);
        
        //CONVERSIÓN DE UN ENTERO A UN CARÁCTER
        System.out.println("CONVERSIÓN DEL VALOR ENTERO 110 A SU CARÁCTER UNICODE");
        System.out.println("caracter = " + caracter);
    }
    
}
