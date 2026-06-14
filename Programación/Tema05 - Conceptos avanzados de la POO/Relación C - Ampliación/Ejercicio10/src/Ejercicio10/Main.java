
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 20 mar 2026     ⏰ Hora: 8:23:27
 *
 *  Nombre del programa : Ejercicio10
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Ejercicio10;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        //Instanciamos 3 COCHES
       Coche coche1=new Coche("1234ABC", "Mercedes", "VX1");
       Coche coche2=new Coche("3456DLZ", "SEAT", "Toledo");
       Coche coche3=new Coche("6789FGH", "Ford", "Fiesta");
       Coche coche4=new Coche("0876FZC", "Renault", "Megane");
       
       //Creamos 3 CLIENTES
       Cliente cli1=new Cliente("Jorge", "Romero", "1222333C");
       Cliente cli2=new Cliente("Eugenia", "Monroy", "22333444F");
       Cliente cli3=new Cliente("Alberto", "Mate", "5444666T");
       
       //Instanciamos 2 SECRETARIOS
       Secretario secre1=new Secretario("Pepe", "González", "2222222B", 1000, 22, "956445566");
       Secretario secre2=new Secretario("Alicia", "García", "3333333B", 1000, 23, "956445577");
       
       //Creamos 3 VENDEDORES
       Vendedor vende1=new Vendedor("Dolores", "Galiano", "44333222H", 2000, coche2, "654778899", "Jaén", 0.15);
       Vendedor vende2=new Vendedor("Ana", "Salmerón", "66333222J", 2000, coche3, "654756799", "Cádiz", 0.15);
       Vendedor vende3=new Vendedor("Fernando", "Sánchez", "44694822H", 2000, coche4, "654748999", "Córdoba", 0.15);
       
       
       //Instanciamos 1 jefe
       Jefe jefe1=new Jefe("Adolfo", "Sánchez", "1111111A", 4500, secre1, 10, coche1);
       
       //Añadimos el empleado 1 de cada grupo como supervisor
       secre1.setSupervisor(secre1);
       secre2.setSupervisor(secre1);
       
       vende1.setSupervisor(vende1);
       vende2.setSupervisor(vende1);
       vende3.setSupervisor(vende1);
       
       //Creamos un ArrayList de Empleados para gestionarlos de manera más sencilla
        ArrayList<Empleado> lista=new ArrayList<Empleado>();
        
        lista.add(jefe1);
        lista.add(vende1);
        lista.add(vende2);
        lista.add(vende3);
        lista.add(secre1);
        lista.add(secre2);
        
        //Añadimos vendedores al jefe1
        jefe1.altaVendedor(vende1);
        jefe1.altaVendedor(vende2);
        
        //Mostramos la información inicial
        for (Empleado empleado : lista) {
            empleado.imprimir();
            System.out.println();
        }
        
        //Subimos el sueldo a todos los empleados y los mostramos de nuevo
        for (Empleado empleado : lista) {
            empleado.subirSueldo();
        }
        
        System.out.println("\n\n****************************** SEGUNDA RONDA DE EMPLEADOS ********************************");
        for (Empleado empleado : lista) {
            empleado.imprimir();
            System.out.println();
        }
        
        //Borramos vende2 y añadimos vende3
        jefe1.bajaVendedor(vende2);
        jefe1.altaVendedor(vende3);
        
        //Añadimos cli1 y cli2 a vende1 y cli3 a vende3
        vende1.altaCliente(cli1);
        vende1.altaCliente(cli2);
        vende3.altaCliente(cli3);
        
        //Mostramos de nuevo la información: jefe1 ha perdido a vende2 y ha añadido a vende3
        //vende1 incorpora a cli1 y cli2 y vende3 a cli3
        System.out.println("\n\n****************************** TERCERA RONDA DE EMPLEADOS ********************************");
        for (Empleado empleado : lista) {
            empleado.imprimir();
            System.out.println();
        }

    } //main()

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘