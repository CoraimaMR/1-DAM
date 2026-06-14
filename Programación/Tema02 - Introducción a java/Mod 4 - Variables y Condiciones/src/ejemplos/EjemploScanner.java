/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
******** EJEMPLO DE USO DE LA ENTRADA ESTÁNDAR ********
*/
package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Jesús Pérez
 */
public class EjemploScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables necesarias para el ejemplo
        String cadena;
        byte octeto;
        short enteroCorto;
        int num;
        long enteroLargo;
        float flotante;
        double doble;
        char caracter;
        boolean logico;
        
        //Declaramos un objeto Scanner y lo instanciamos
        //Previamente hay que importar la clase java.util.Scanner
        Scanner sc=new Scanner(System.in);
        
        //CADENAS DE CARACTERES
        System.out.println("Introduce una cadena");
        cadena=sc.nextLine();
        System.out.println("Ha introducido "+cadena);
        
        //BYTE
        System.out.println("");
        System.out.println("Introduce un número tipo Byte");
        octeto=sc.nextByte();
        System.out.println("Ha introducido "+octeto);
        
        //SHORT
        System.out.println("");
        System.out.println("Introduce un número tipo Short");
        enteroCorto=sc.nextShort();
        System.out.println("Ha introducido "+enteroCorto);
        
        //INT
        System.out.println("");
        System.out.println("Introduce un número tipo Int");
        num=sc.nextInt();
        System.out.println("Ha introducido "+num);
        
        //LONG
        System.out.println("");
        System.out.println("Introduce un número tipo Long");
        enteroLargo=sc.nextLong();
        System.out.println("Ha introducido "+enteroLargo);
        
        //FLOAT
        System.out.println("");
        System.out.println("Introduce un número tipo Float");
        flotante=sc.nextFloat();
        System.out.println("Ha introducido "+flotante);
        
        //DOUBLE
        System.out.println("");
        System.out.println("Introduce un número tipo Double");
        doble=sc.nextDouble();
        System.out.println("Ha introducido "+doble);
                  
        //LECTURA DE UN CARÁCTER
        System.out.println("");
        System.out.println("Introduzca un carácter: ");
        caracter = sc.next().charAt(0);
        System.out.println("Ha introducido "+caracter);
        
        //LECTURA DE UN BOOLEAN
        System.out.println("");
        System.out.println("Introduzca un boolean (True, False)");
        logico=sc.nextBoolean();
        System.out.println("Ha introducido "+logico);
        
        //LECTURA DE UN TOKEN
        System.out.println("");
        System.out.println("Introduce una frase (se lee hasta el espacio)");
        cadena=sc.next();
        System.out.println("Ha introducido "+cadena);
    }
    
}
