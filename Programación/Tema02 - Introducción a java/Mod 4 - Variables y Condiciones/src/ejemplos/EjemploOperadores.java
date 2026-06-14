/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos;

/**
 *
 * @author usuario
 */
public class EjemploOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Variables enteras tipo short
        int a=5, b=9, c=0;
       
        
        // Constantes lógicas
        final boolean V=true; 
        final boolean F=false;
        
        /*
        ********* OPERADORES ARITMÉTICOS ********
        */
        //Operaciones aritméticas básicas
//        c=a+b;
//        System.out.println("La suma es "+c);
//        System.out.println("La resta es "+(a-b));
//        System.out.println("La multiplicación es "+(a*b));
//        System.out.println("La división entera es "+(a/b));
//        System.out.println("El resto de la división entera es "+(a%b));
//        System.out.println("La variable a cambiada de signo es "+(-a));
//        
        //Incremento con ++
        System.out.println("");
        System.out.println("Incremento con el operador ++");
        System.out.println(a++); //Imprime 5
        System.out.println(++a); //Imprime 7
        
        //Decremento con --
        System.out.println("");
        System.out.println("Decremento con el operador --");
        System.out.println(b--); //Imprime 9
        System.out.println(--b); //Imprime 7
        
        /*
        ******** OPERADORES RELACIONALES ********
        */
        System.out.println("");
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.println("");
        System.out.println("a>b "+(a>b));
        System.out.println("a<b "+(a<b));
        System.out.println("a>=b "+(a>=b));
        System.out.println("a<=b "+(a<=b));
        System.out.println("a==b "+(a==b));
        System.out.println("a!=b "+(a!=b));
        
        /*
        ******** OPERADORES LÓGICOS *********
        */
        System.out.println("");
        System.out.println("AND Tabla de verdad");
        System.out.println("0 and 0 "+(F&&F));
        System.out.println("0 and 1 "+(F&&V));
        System.out.println("1 and 0 "+(V&&F));
        System.out.println("1 and 1 "+(V&&V));
        
        System.out.println("");
        System.out.println("OR Tabla de verdad");
        System.out.println("0 or 0 "+(F||F));
        System.out.println("0 or 1 "+(F||V));
        System.out.println("1 or 0 "+(V||F));
        System.out.println("1 or 1 "+(V||V));
        
        System.out.println("");
        System.out.println("NOT 0 "+(!F));
        System.out.println("NOT 1 "+(!V));
        
        System.out.println("");
        System.out.println("(a>b-1) AND 1 "+(a>b-1&&V));
        System.out.println("a=b AND 0 "+(a==b&&F));
        System.out.println("a=b OR 0 "+(a==b||F));
        
        /*
        ******** OPERADORES DE ASIGNACIÓN ********
        */
        System.out.println("");
        System.out.println("a="+a+" b="+b);
        System.out.println("a+=b "+(a+=b)); // a=a+b
        System.out.println("a-=b "+(a-=b)); // a=a-b
        System.out.println("a*=b "+(a*=b)); //  a=a*b
        System.out.println("a/=b "+(a/=b)); // a=a/b
        System.out.println("a%=b "+(a%=b)); // a=a%b
        
    }
    
}
