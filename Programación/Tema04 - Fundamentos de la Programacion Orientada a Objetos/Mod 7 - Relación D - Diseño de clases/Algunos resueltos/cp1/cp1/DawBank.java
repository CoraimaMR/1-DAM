/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cp1;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------
DawBank. DawBank
*/

/**
 * @author Jesús Pérez 
 */
public class DawBank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titular, iban;
        int opcion;
        double cantidad;

        System.out.println(" ------ CREANDO CUENTA BANCARIA ------");
        System.out.println("Introduzca el titular: ");
        titular=sc.nextLine();
        System.out.println("Introduzca un IBAN válido: ");
        iban=sc.nextLine();
        
        CuentaBancaria cuenta = new CuentaBancaria(iban, titular);
        
        //MENÚ PRINCIPAL
        do {
            System.out.println("1. Datos de la cuenta.");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingreso");
            System.out.println("6. Retirada");
            System.out.println("7. Movimientos");
            System.out.println("8. Salir");
            System.out.print("INTRODUZCA OPCIÓN: ");
            opcion=sc.nextInt();
            
            switch (opcion) {
                case 1:
                    cuenta.imprimirDatos();
                    break;
                case 2:
                    System.out.println("IBAN: "+cuenta.getIban());                    
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Titular: "+cuenta.getTitular());
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Saldo: "+cuenta.getSaldo());
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Introduzca la cantidad: ");
                    cantidad=sc.nextDouble();
                    if (cuenta.ingreso(cantidad)) {
                        System.out.println("OPERACIÓN VÁLIDA");
                    } else {
                        System.out.println("OPERACIÓN NO PERMITIDA");
                    }
                    break;
                case 6:
                    System.out.println("Introduzca la cantidad: ");
                    cantidad=sc.nextDouble();
                    if (cuenta.retirada(cantidad)) {
                        System.out.println("OPERACIÓN VÁLIDA");
                    } else {
                        System.out.println("OPERACIÓN NO PERMITIDA");
                    }
                    break;
                case 7:
                    cuenta.movimientos();
                    break;
                case 8:
                    System.out.println("¡¡Hasta luego, Lucas!!");
                    break;
                default:
                    System.out.println("Introduzca una opción válida");;
            }
            
        } while (opcion!=8);
    }//main

}//class
