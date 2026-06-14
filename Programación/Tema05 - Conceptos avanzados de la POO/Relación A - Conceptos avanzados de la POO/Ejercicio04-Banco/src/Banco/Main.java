
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 11 mar 2026     ⏰ Hora: 12:41:02
 *
 *  Nombre del programa : Main
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Banco;

public class Main {

    public static void main(String[] args) {
        
        // Creamos varias cuentas bancarias
        CuentaCorriente c1 = new CuentaCorriente("ES01");
        CuentaAhorro a1 = new CuentaAhorro("ES02");
        
        // Ingresamos dinero
        c1.ingresar(1000);
        c1.mostrar();
        a1.ingresar(100);       
        a1.mostrar();
        
        // Retiramos dinero
        c1.retirar(20);
        c1.mostrar();
        a1.retirar(1000);        
        a1.mostrar();
        
        // Ingresamos dinero
        c1.ingresar(200);
        c1.mostrar();
        a1.ingresar(50);        
        a1.mostrar();
        
        // Traspasamos dinero
        c1.traspaso(c1, a1, 50);
        c1.mostrar();
        a1.mostrar();
        
    } //main()

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘