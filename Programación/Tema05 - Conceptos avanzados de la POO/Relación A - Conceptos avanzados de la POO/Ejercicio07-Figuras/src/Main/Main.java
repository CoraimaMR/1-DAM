
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 16 mar 2026     ⏰ Hora: 12:20:51
 *
 *  Nombre del programa : Main
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Main;
import Figuras.Circulo;
import Figuras.Cuadrado;
import Figuras.Rectangulo;
import Figuras.Triangulo;
import Figuras.iFigura2D;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
      // Crea un ArrayList figuras
      ArrayList<iFigura2D> figuras = new ArrayList<>();      
      
      // Creamos las figuras
      Cuadrado cuad1 = new Cuadrado(2);
      Rectangulo rec1 = new Rectangulo(2, 3);
      Triangulo trian1 = new Triangulo(3, 4);
      Circulo cir1 = new Circulo(1);
      
      // Añadir figuras
      figuras.add(cuad1);
      figuras.add(rec1);
      figuras.add(trian1);
      figuras.add(cir1);
      
      // Mostrar figuras
      mostrarFiguras(figuras);
      
      // Escalar x2
      escalarFiguras(figuras, 2);
      mostrarFiguras(figuras);
      
      // Escalar x0.1
      escalarFiguras(figuras, 0.1);
      mostrarFiguras(figuras);
      
    } //main()
    
    public static void mostrarFiguras(ArrayList<iFigura2D> figuras) {
        System.out.println("===== LISTA DE FIGURAS =====");
        for (int i = 0; i < figuras.size(); i++) {
            figuras.get(i).imprimir();
        }
        System.out.println();
    } // mostrarFiguras(ArrayList<iFigura2D> figuras) 
    
    public static void escalarFiguras(ArrayList<iFigura2D> figuras, double escala) {
        for (int i = 0; i < figuras.size(); i++) {
            figuras.get(i).escalar(escala);
        }
    } // escalarFiguras(ArrayList<iFigura2D> figuras, double escala)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘