/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package principal;
import ej2astros.Astro;
import ej2astros.Planeta;
import ej2astros.Satelite;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jesús Pérez
 */

/* ------------------------------ ENUNCIADO ----------------------------------

*/
public class Ej2Astros {

    public static void main(String[] args) {
        // Creamos una lista
        ArrayList astros = new ArrayList();
        
        Scanner sc = new Scanner(System.in);
       
        // Instanciamos planetas
        Planeta tierra = new Planeta("Tierra", 5.97E24, 12742.0, 1.0, 365.25, 14.05, 9.78, 146600000.0);
        Planeta venus = new Planeta("Venus", 4.869E24, 12103.6, 243.02, 584.0, 463.85, 8.87, 108200000.0);
        Planeta marte = new Planeta("Marte", 6.42E23, 6794.4, 24.62, 686.97, -46.0, 3.711, 227940000.0);
        
        // Instanciamos satélites
        Satelite luna = new Satelite(tierra, "Luna", 7.349E22, 3474.0, 27.5, 27.5, -153.0, 1.62, 384400.0);
        Satelite fobos = new Satelite(marte, "Fobos", 1.072E16, 11000.0, 0.0, 0.319, -40.15, 0.0084, 6000);
        Satelite deimos = new Satelite(marte, "Deimos", 2.244E15, 12400.0, 0.0, 1.262, -40.15, 0.0039, 23460);
        
               
        // Añadimos satélites a planetas
        tierra.agregarSatelite(luna);
        tierra.setTieneSatelites(true);
        
        marte.agregarSatelite(fobos);
        marte.agregarSatelite(deimos);
        marte.setTieneSatelites(true);
        
        
        //Añado un astro nuevo
        Planeta mercurio = new Planeta("Mercurio", 0, 0, 0, 0, 0, 0, 0);
        
        
        // Añadimos planetas y satélites a la lista
        astros.add(tierra);
        astros.add(venus);
        astros.add(marte);
        astros.add(luna);
        astros.add(fobos);
        astros.add(deimos);
        
        astros.add(mercurio);
        
        
        // Menú para elegir astro y mostrar su información. Se repite hasta introducir -1
        int opcion;
        do {
            // Mostramos lista de astros
            mostrarListaAstros(astros);
            
            // Pedimos nº de astro a mostrar
            System.out.print("Elige un nº de astro (-1 para salir): ");
            opcion = sc.nextInt();

            // Si nº válido, mostrar info del astro
            if (opcion >= 0 && opcion < astros.size()) {
                Astro a = (Astro) astros.get(opcion);
                a.muestra();
            } // Si -1, terminar
            else if (opcion == -1) {
                return;
            } // Si no, mensaje de error
            else {
                System.out.println("Opción incorrecta");
            }

            // Pedimos enter para continuar
            System.out.println("Enter para continuar");
            sc.nextLine();
            sc.nextLine();

        } while (true);
        
    }//main
    
    // Imprime la lista de astros (solo sus nombres)
    public static void mostrarListaAstros(ArrayList astros) {
        System.out.println("=== LISTA DE ASTROS ===");
        for (int i = 0; i < astros.size(); i++) {
            Astro a = (Astro) astros.get(i);
            System.out.println("Astro " + i + ": " + a.getNombre());
        }
    }//mostrarListaAstros()

}//class
