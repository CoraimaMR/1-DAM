
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 6 abr 2026     ⏰ Hora: 12:08:30
 *
 *  Nombre del programa : Formatos
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package formatos;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------
Ejemplo de uso de salida de texto por pantalla, utilizando colores de texto y
de fondo, así como el método printf que proporciona una salida formateada
*/

public class Formatos {
    
    //Constantes para definir colores ANSI    
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static final String ANSI_RESET = "\u001B[0m";
    
    //Constantes para definir colores de fondo (Background)
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    //Borrar la pantalla en la terminal
    //------ NO FUNCIONA en Linux. Sin probar en Windows ------
    public static final String BORRAR_PANTALLA = "\033[H\033[2J";
    
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("\n---- MENÚ PRINCIPAL ----");
            System.out.println("1. (Libro LJS) Mostrar palabras coloreadas");
            System.out.println("2. (Libro LJS) Mostrar tabla");
            System.out.println("3. Colores usando Unicode");
            System.out.println("4. Caracteres especiales (copiar-pegar)");
            System.out.println("5. Caracteres especiales (unicode)");
            System.out.println("6. Salida formateada usando printf");
            System.out.println("7. Tabla unicode");
            System.out.println("8. Salir");
            System.out.print("Introduzca una opción: ");
            opcion=sc.nextInt();
            System.out.println(BORRAR_PANTALLA);
            
            switch (opcion) {
                case 1:
                    palabras();
                    break;
                case 2:
                    imprimirTabla();
                break;
                case 3:
                    coloresAnsi();
                break;
                case 4:
                    caracteresEspeciales1();
                break;
                case 5:
                    caracteresEspeciales2();
                break;
                case 6:
                    salidaFormateada();
                break;
                case 7:
                    tablaUnicode();
                break;
                case 8:
                    System.out.println("Hasta luego, Lucas.");
                break;
                default:
                    System.out.println("Opción incorrecta...");
            }
        } while (opcion!=8);
    }//main
    
    public static void palabras(){
        System.out.println("\033[33m mandarina");
        System.out.println("\033[32m hierba");
        System.out.println("\033[31m tomate");
        System.out.println("\033[37m sábanas");
        System.out.println("\033[36m cielo");
        System.out.println("\033[35m nazareno");
        System.out.println("\033[34m mar" + ANSI_RESET);
        
    }//palabras()
    
    public static void imprimirTabla(){
        System.out.println("┌────────┬───────────┬────────┬────────────────┐");
    System.out.println("│ Código │   Color   │ Código │     Color      │");
    System.out.println("├────────┼───────────┼────────┼────────────────┤");
    System.out.print("│   30   │\033[30m negro \033[39;49m    │");
    System.out.println("   90   │\033[90m negro claro \033[39;49m   │");
    System.out.print("│   31   │\033[31m rojo \033[39;49m     │");
    System.out.println("   91   │\033[91m rojo claro \033[39;49m    │");
    System.out.print("│   32   │\033[32m verde \033[39;49m    │");
    System.out.println("   92   │\033[92m verde claro \033[39;49m   │");
    System.out.print("│   33   │\033[33m amarillo \033[39;49m │");
    System.out.println("   93   │\033[93m amarillo claro \033[39;49m│");
    System.out.print("│   34   │\033[34m azul \033[39;49m     │");
    System.out.println("   94   │\033[94m azul claro \033[39;49m    │");
    System.out.print("│   35   │\033[35m morado \033[39;49m   │");
    System.out.println("   95   │\033[95m morado claro \033[39;49m  │");
    System.out.print("│   36   │\033[36m cian \033[39;49m     │");
    System.out.println("   96   │\033[96m cian claro \033[39;49m    │");
    System.out.print("│   37   │\033[37m blanco \033[39;49m   │");
    System.out.println("   97   │\033[97m blanco claro \033[39;49m  │");
    System.out.println("└────────┴───────────┴────────┴────────────────┘");
    }//tabla()
    
    
    //---------- Ejemplo de uso de colores tomado de: ----------------
    //https://www.campusmvp.es/recursos/post/como-cambiar-los-colores-de-la-consola-con-java-y-system-out-println.aspx
    public static void coloresAnsi(){
        
        //Ejemplo de uso del color rojo. Después de usarlo, hay que desactivarlo
        System.out.println("\nTexto en color por defecto");
        System.out.println(ANSI_RED + "Texto de color rojo" + ANSI_RESET);
        System.out.println("Volvemos al color por defecto\n");
        
        //Uso de colores de fondo
        System.out.println("Uso de colores de fondo");
        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLUE + "Texto de color azul sobre fondo verde");
        System.out.println("Como no lo he resetado sigue igual.");
        System.out.println("¡Reseteo ahora!" + ANSI_RESET);
        System.out.println("FIN");
        
    }//coloresAnsi()
    
    //Caracteres especiales copiando y pegando
    public static void caracteresEspeciales1(){
        System.out.println("\nCopiar y pegar del Apéndice C del libro de LJS");
        System.out.println("Cuando programo ⌨ estoy");
        System.out.print(" muy 😆 y me siento como un ♔.");
        System.out.println("");
    }//caracteresEspeciales1()
    
    //Caracteres especiales usando unicode en hexadecimal
    public static void caracteresEspeciales2(){
        System.out.println("\nUna corchea: \u266A");
        System.out.println("Dos corcheas: \u266B");
        System.out.println("");
    }//caracteresEspeciales2()
            
    //Uso de la función System.out.printf()
    //Más información:
    //https://www.it.uc3m.es/pbasanta/asng/course_notes/input_output_printf_es.html
    public static void salidaFormateada(){
        double veintiuno=21.0;
        
        System.out.println(ANSI_GREEN_BACKGROUND+"\nUn par de ejemplos de LJS:"+ANSI_RESET);
        
        System.out.println(ANSI_RED+"\nEJEMPLO 1:"+ANSI_RESET);
        System.out.printf("El entero %d no tiene decimales.\n", 21);
        System.out.printf("El double %f sale con decimales.\n",  veintiuno);
        System.out.printf("El double %.3f sale exactamente con 3 decimales.\n", veintiuno);
        System.out.printf("El double %.0f sale exactamente con 0 decimales.\n", veintiuno);
        
        System.out.println(ANSI_RED+"\nEJEMPLO 2:"+ANSI_RESET);
        System.out.println("  Artículo      Precio/caja    Nº cajas");
        System.out.println("-----------------------------------------");
        System.out.printf("%-10s      %8.2f      %6d\n",  "manzanas", 4.5, 10);
        System.out.printf("%-10s      %8.2f      %6d\n",  "peras", 2.75, 120);
        System.out.printf("%-10s      %8.2f      %6d\n",  "aguacates", 10.0, 6);
    }//salidaFormateada()
    
    
    //Muestra la tabla de caracteres unicode utilizando 2 Bytes
    //Tabla completa en: https://symbl.cc/es/unicode-table/
    public static void tablaUnicode(){
        for (int codepoint = 0x0000; codepoint <= 0xffff; codepoint++) {
            System.out.println("DEC:"+codepoint+" HEX:\\u"+Integer.toHexString(codepoint)+" CARÁCTER: "+(char)codepoint );
        }//for
    }//tablaUnicode()
    

}//class

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘