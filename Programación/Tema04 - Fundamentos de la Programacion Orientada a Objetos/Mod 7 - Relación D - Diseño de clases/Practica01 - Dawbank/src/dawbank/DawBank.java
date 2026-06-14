/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dawbank;
import java.util.Scanner;
/**
 *
 * @author coram
 */
public class DawBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaración de variables
        int opcion;
        boolean seguir = true;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el IBAN: ");
        String iban = sc.nextLine();

        System.out.print("Introduce el nombre y apellidos del titular: ");
        String titular = sc.nextLine();
        
        // Creamos la cuenta bancaria
        CuentaBancaria cuenta1 = new CuentaBancaria(iban,titular);
        
        // Comenzamos con el menu
        do {            
            mostrarMenu(); // Mostramos el menu
            opcion = sc.nextInt(); // Leemos la opcion escogida
            System.out.println(); // Salto de linea
            switch (opcion) {
                case 1: // OPCIÓN 1
                    cuenta1.imprimir(); // Mostramos los datos de la cuenta1
                    break;
                case 2: // OPCIÓN 2
                    System.out.println("IBAN: " + cuenta1.getIban());
                    break;
                case 3: // OPCIÓN 3
                    System.out.println("TITULAR: " + cuenta1.getTitular());
                    break;
                case 4: // OPCIÓN 4
                    System.out.println("SALDO: " + cuenta1.getSaldo() + " €");
                    break;
                case 5: // OPCIÓN 5
                    System.out.print("Cantidad a ingresar: ");
                    if (!cuenta1.ingreso(sc.nextDouble())) {
                        System.out.println("ERROR. Ingreso invalido.");
                    }
                    break;
                case 6: // OPCIÓN 6
                    System.out.print("Cantidad a retirar: ");
                    if (!cuenta1.retirar(sc.nextDouble())) {
                        System.out.println("ERROR. Retirada invalida.");
                    }
                    break;
                case 7: // OPCIÓN 7
                    String[] mov = cuenta1.getHistorial();
                    System.out.println("----------- HISTORIAL -----------");
                    for (int i = 0; i < cuenta1.getNumMovimientos(); i++) {
                        System.out.println(mov[i]);
                    }
                    break;
                case 8: // OPCIÓN 8
                    seguir = false; // Salimos del menu
                    System.out.println("Saliendo...");
                    break;
                default: // OTRA OPCIÓN
                    System.out.println("ERROR. Opcion incorrecta seleccione un número del 1 al 8.");
            }
        } while (seguir);
        
    } // main()
    
    // MENU DE DAWBANK
    private static void mostrarMenu() {
        System.out.println("\n--- DAWBANK ---");
        System.out.println("1. Datos de la cuenta");
        System.out.println("2. IBAN");
        System.out.println("3. Titular");
        System.out.println("4. Saldo");
        System.out.println("5. Ingreso");
        System.out.println("6. Retirada");
        System.out.println("7. Movimientos");
        System.out.println("8. Salir");
        System.out.print("Elige opción: ");
    } // mostrarMenu()
    
} // class
