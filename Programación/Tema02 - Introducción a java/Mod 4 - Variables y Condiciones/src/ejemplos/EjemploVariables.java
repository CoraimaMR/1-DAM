/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos;

/**
 *
 * @author usuario
 */
public class EjemploVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
          ******** CONDICIONES Y CARACTERÍSTICAS ********
        - El nombre de la variable debe ser AUTODESCRIPTIVO
        - Case-sensitive, notación camelCase
        - No usar ñ
        - Deben comenzar por una letra
        - No pueden ser palabras reservadas del sistema
        - CONSTANTES en MAYUSCULAS separadas por _
        */
        
        //Variables numéricas ENTEROS
        byte octeto=-128;
        short enteroCorto = 32767;
        int numero =7;
        long numeroDeTarjeta=1234_1234_4567_4567L;
        long billones=12_000_000_000_000L;
        
        //En binario y hexadecimal
        int binario =0b1010;
        int hexadecimal=0xFA3;
        
        //Variables numéricas DECIMALES
        float flotante=25.56f;
        double doble=3467.2345678905;
        
        //Carácter
        char letra ='a';
        
        //Variable de tipo lógico
        boolean seguir=true;
        
        //Constante que expresa las horas diarias de clase
        final int HORAS_CLASE = 6;
        
        //Cadena de caracteres
        String cadena="En un lugar de La Mancha...";
        
        System.out.println("--- NÚMEROS ENTEROS ---");
        System.out.println("octeto = " + octeto);
        System.out.println("enteroCorto = " + enteroCorto);
        System.out.println("numero = " + numero);
        System.out.println("numeroDeTarjeta = " + numeroDeTarjeta);
        System.out.println("billones = " + billones);
        System.out.println("binario = " + binario);
        System.out.println("hexadecimal = " + hexadecimal);
        
        System.out.println("");
        System.out.println("--- NÚMEROS REALES ---");
        System.out.println("flotante = " + flotante);
        System.out.println("doble = " + doble);
        
        System.out.println("");
        System.out.println("--- CARÁCTER Y CADENA ---");
        System.out.println("letra = " + letra);
        System.out.println("cadena = " + cadena);
        
        System.out.println("");
        System.out.println("--- CONSTANTES ---");
        System.out.println("HORAS_CLASE = " + HORAS_CLASE);
        System.out.println("Cada jornada lectiva tiene "+HORAS_CLASE+ " horas");
        
        //Sumamos 1 a la variable enteroCorto
        //Al estar en el límite superior de su rango, 
        //el resultado será el límite inferior
        System.out.println("");
        System.out.println("--- Los RANGOS DE LAS VARIABLES son cíclicos ---");
        System.out.println("enteroCorto = " + enteroCorto);
        System.out.println("Le sumamos 1");
        enteroCorto++;
        System.out.println("El resultado es enteroCorto = " + enteroCorto);
    
        
        //Ambito de la variable i
        System.out.println("");
        System.out.println("--- ÁMBITO DE LAS VARIABLES ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            
        }
        
//        System.out.println("No puedo imprimir el valor de i fuera del bucle");       
//        System.out.println("i = " + i);
       
    }
    
}
