
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 10 dic 2025     ⏰ Hora: 12:29:17
 *
 *  Nombre del programa : Ejercicio11
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Arrays de 3 dimensiones. La cadena de restaurantes Roteña Fast, se dedica a la 
elaboración y venta de comida rápida (arranque, tortilla de patatas con cebolla,
tortilla de patatas sin cebolla y pescaíto frito variado) y cuenta con 3 
establecimientos repartidos por el término municipal de la localidad: uno en la
Costilla, otro en el Molino y otro en Costa Ballena. El dueño de la misma te 
contrata como programador y te pide que diseñes un algoritmo que represente las 
ventas de cada uno de sus establecimientos durante cada uno de los meses del 
último trimestre del año que estamos finalizando. Para cada uno de ellos necesita
saber qué cantidad ha vendido de cada una de las cuatro elaboraciones que tiene 
a la venta.

De esta manera, se pide:
Diseñar un array de 3 dimensiones que represente de manera adecuada el 
planteamiento anterior.
Dibujar la estructura de datos diseñada a mano en un papel, indicando el 
significado de los datos representados.
Rellenarlo con valores monetarios aleatorios (tipo double) entre 5000 y 9000 euros.
Indicar el total de ventas de cada establecimiento.
La media total de ventas de cada establecimiento.
El total de ventas de la empresa.
El total de ventas del mes de diciembre de la empresa.
¿Te atreves a calcular algún otro resultado? Te animo a que lo intentes.
Por otro lado, el algoritmo quedaría mejor con un menú del tipo:
    1. Listado de todas las ventas por establecimiento
    2. Mostrar el total de ventas de cada establecimiento.
    3. Mostrar la media de cada establecimiento.
    4. Mostrar el total de ventas de la empresa.
    5. Mostrar las ventas del mes de diciembre.

*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Arrays3Dimensiones;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        final int ESTABLECIMIENTOS = 3, MESES = 3, PRODUCTOS = 4;
        int opcionMenu;
        boolean  terminar = true;
        double sumaTotalLocal = 0, sumaTotal = 0, ventasDiciembre = 0;
        
        // Creación de arrays
        double[][][] Restaurante = new double[ESTABLECIMIENTOS][MESES][PRODUCTOS]; // 3 capas, 3 filas, 4 columnas
        
        String[] local = {"COSTILLA", "MOLINO", "COSTA BALLENA"};
        String[] mes = {"octuble", "noviembre", "diciembre"};
        
        double[] ventasLocal = new double[ESTABLECIMIENTOS]; // Vector de tamaño ESTABLECIMIENTOS
        
        // Rellenamos el array
        for (int i = 0; i < ESTABLECIMIENTOS; i++) {
            for (int j = 0; j < MESES; j++) {
                for (int k = 0; k < PRODUCTOS; k++) {
                    Restaurante[i][j][k] = (Math.random()*4000)+5000;
                    sumaTotalLocal += Restaurante[i][j][k];
                    if (j == 2) {
                        ventasDiciembre += Restaurante[i][j][k];
                    }
                }
            }
            sumaTotal += sumaTotalLocal;
            ventasLocal[i] = sumaTotalLocal;
            sumaTotalLocal = 0;
        }
                
        // Creamos un menu
        do {    
            // Lectura y comprobación de datos introducidos por teclado
            Scanner sc = new Scanner(System.in);
            System.out.println("------------------------- MENÚ -------------------------\n" +
            "1. Listado de todas las ventas por establecimiento.\n" +
            "2. Mostrar el total de ventas de cada establecimiento.\n" +
            "3. Mostrar la media de cada establecimiento.\n" +
            "4. Mostrar el total de ventas de la empresa.\n" +
            "5. Mostrar las ventas del mes de diciembre de la empresa.\n" +
            "6. Terminar programa.\n" +
            "---------------------------------------------------------");
            opcionMenu = sc.nextInt();
            
            switch (opcionMenu) {
                case 1: // Listado de todas las ventas por establecimiento
                    for (int i = 0; i < ESTABLECIMIENTOS; i++) {
                        System.out.println("ESTABLECIMIENTO: "+local[i]);
                        System.out.println("------------------- P1 ------ P2 -------"
                                + " P3 ------- P4 ----");
                        for (int j = 0; j < MESES; j++) {
                            System.out.print(mes[j]+" -->\t");
                             for (int k = 0; k < PRODUCTOS; k++) {
                                System.out.printf("%,.2f€ ",Restaurante[i][j][k]);
                            }
                            System.out.println();  // Salto de fila
                        }
                        System.out.println();  // Salto de establecimiento
                    }
                    break;
                case 2: // Mostrar el total de ventas de cada establecimiento
                    for (int i = 0; i < ESTABLECIMIENTOS; i++) {
                        System.out.printf("VENTAS TOTALES DE %s: %,.2f€\n", local[i], ventasLocal[i]);
                    }
                    System.out.println();  // Salto de linea
                    break;
                case 3: // Mostrar la media de cada establecimiento
                    for (int i = 0; i < ESTABLECIMIENTOS; i++) {
                        System.out.printf("VENTAS MEDIAS DE %s: %,.2f€\n", local[i], ventasLocal[i]/(MESES*PRODUCTOS));
                    }
                    System.out.println();  // Salto de linea
                    break;
                case 4: // Mostrar el total de ventas de la empresa
                    System.out.println("--- EL TOTAL DE LAS VENTAS DE LA EMPRESA ---");
                    System.out.printf("                %,.2f€\n\n", sumaTotal);
                    break;
                case 5: // Mostrar las ventas del mes de diciembre del restaurante
                    System.out.println("--- EL TOTAL DE LAS VENTAS EN DICIEMBRE ---");
                    System.out.printf("                %,.2f€\n\n", ventasDiciembre);
                    break;
                case 6: // Terminar programa
                    terminar = false;
                    System.out.println("HASTA LUEGO :)");
                    break;
                default: System.out.println("ERROR. Número introducido incorrecto (1-6).");
            }
        } while (terminar);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘