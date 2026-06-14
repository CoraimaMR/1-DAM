/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 9 mar 2026
 *
 *  Nombre del programa : main
 *
 *******************************************************/

package ejercicio02;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // Instanciamos planetas
        Planeta tierra = new Planeta("Tierra", 5.97E24, 12742.0, 1.0, 365.25, 14.05, 9.78, 146600000.0);
        Planeta venus = new Planeta("Venus", 4.869E24, 12103.6, 243.02, 584.0, 463.85, 8.87, 108200000.0);
        Planeta marte = new Planeta("Marte", 6.42E23, 6794.4, 24.62, 686.97, -46.0, 3.711, 227940000.0);

        // Instanciamos satélites
        Satelite luna = new Satelite(tierra, "Luna", 7.349E22, 3474.0, 27.5, 27.5, -153.0, 1.62, 384400.0);
        Satelite fobos = new Satelite(marte, "Fobos", 1.072E16, 11000.0, 0.0, 0.319, -40.15, 0.0084, 6000);
        Satelite deimos = new Satelite(marte, "Deimos", 2.244E15, 12400.0, 0.0, 1.262, -40.15, 0.0039, 23460);

        // Lista de astros
        ArrayList<Astro> lista = new ArrayList<>();
        
        lista.add(tierra);
        lista.add(venus);
        lista.add(marte);
        lista.add(luna);
        lista.add(fobos);
        lista.add(deimos);
        
        // Creación de menú
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarLista(lista);
            System.out.print("Selecciona un planeta (-1 para salir): ");
            opcion = sc.nextInt();

            if (opcion >= 0 && opcion < lista.size()) {
                Astro astro = lista.get(opcion);
                if (astro instanceof Planeta) {
                    Planeta planeta = (Planeta) astro;
                    mostrarPlaneta(planeta);
                    mostrarSatelites(planeta, lista);
                } else {
                    System.out.println("Debes seleccionar un planeta.\n");
                }

                System.out.println("Pulsa ENTER para continuar...");
                sc.nextLine();
                sc.nextLine();
            }
        } while (opcion != -1);
    } // main

    public static void mostrarLista(ArrayList<Astro> lista){
        System.out.println("\n======== LISTADO DE ASTROS ========");
        for(int i = 0; i < lista.size(); i++){
            Astro astro = lista.get(i);
            if(astro instanceof Planeta){
                Planeta p = (Planeta) astro;
                System.out.println(i + ". Planeta: " + p.getNombre());
            } else {
                Satelite s = (Satelite) astro;
                System.out.println(i + ". Satélite: " + s.getNombre());
            }
        }
    } // mostrarLista()
    
    public static void mostrarPlaneta(Astro astro){
    System.out.println("\n----- DATOS DEL PLANETA -----");
    astro.muestraAstro();
    } // mostrarPlaneta()
    
    public static void mostrarSatelites(Planeta planeta, ArrayList<Astro> lista){
    System.out.println("\n--------- SATÉLITES ---------");
    boolean tiene = false;
    for(Astro a : lista){
        if(a instanceof Satelite){
            Satelite s = (Satelite) a;
            if(s.getPlaneta() == planeta){
                a.muestraAstro();
                System.out.println();
                tiene = true;
            }
        }
    }
    if(!tiene){
        System.out.println("Este planeta no tiene satélites.\n");
    }
    } // mostrarSatelites()
    
} // clase principal