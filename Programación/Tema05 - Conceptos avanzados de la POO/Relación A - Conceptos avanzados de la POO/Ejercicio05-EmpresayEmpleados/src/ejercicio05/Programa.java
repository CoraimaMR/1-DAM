
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 12 mar 2026     ⏰ Hora: 12:56:04
 *
 *  Nombre del programa : Ejercicio05EmpresayEmpleados
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicio05;

public class Programa {

    public static void main(String[] args) {
        // Creamos las instancias para la PRIMERA EMPRESA ========
        Empresa empresa = new Empresa("Tech Solutions", "B12345678");

        Empleado e1 = new Empleado("Ana Lopez", "11111111A", 900);   // Anual < 12k (20%)
        Empleado e2 = new Empleado("Juan Perez", "22222222B", 1500); // Anual 18k (30%)
        Empleado e3 = new Empleado("Marta Sanz", "33333333C", 2500); // Anual 30k (40%)
        
        // Añadimes los empleados al arraylist
        empresa.añadirEmpleado(e1);
        empresa.añadirEmpleado(e2);
        empresa.añadirEmpleado(e3);
        
        // Mostramos los datos de la empresa
        empresa.mostrar();
        
        // Mostramos todos los datos de los empleados
        empresa.listarDatosEmpleados();
        
        // Mostrar Solo las nominas de los empleados
        empresa.mostrarNominas();
        
        // Añadimos más datos a los empleados y lo mostramos
        System.out.println("--- CAMBIAMOS ALGUNOS DATOS DE LOS EMPLEADOS ---\n");
        e1.setEdad(19);
        e1.setTelefono("+34 655 84 92 51");
        e2.setTelefono("+32 087 65 89 37");
        e2.setDireccion("Calle Lordos 24");
        e3.setSueldoBruto(3200);
        
        empresa.listarDatosEmpleados();
        
        // Suma totales de los sueldos brutos y netos
        empresa.sumaSueldosBrutos();
        empresa.sumaSueldosNetos();
        System.out.println();
        
        // Mostrar Solo las nominas de los empleados
        empresa.mostrarNominas();
        
        // Creamos las instancias para la SEGUNDA EMPRESA ========
        Empresa empresa2 = new Empresa("Lolota", "E184466");

        Empleado e4 = new Empleado("Carlos Ruiz", "44444444D", 1100);  // 13.200€ anuales (30% IRPF)
        Empleado e5 = new Empleado("Lucia Gomez", "55555555E", 2200);  // 26.400€ anuales (40% IRPF)
        Empleado e6 = new Empleado("Diego Torres", "66666666F", 800);   // 9.600€ anuales (20% IRPF)
        
        // Añadimes los empleados al arraylist
        empresa2.añadirEmpleado(e4);
        empresa2.añadirEmpleado(e5);
        empresa2.añadirEmpleado(e6);
        
        // Mostramos los datos de la empresa
        empresa2.mostrar();
        
        // Mostramos todos los datos de los empleados
        empresa2.listarDatosEmpleados();
        
        // Mostrar Solo las nominas de los empleados
        empresa2.mostrarNominas();
        
        // Añadimos más datos a los empleados y lo mostramos
        System.out.println("--- CAMBIAMOS O AÑADIMOS ºALGUNOS DATOS DE LOS EMPLEADOS ---\n");
        e4.setEdad(20);
        e4.setDireccion("Los mares 36");
        e4.setSueldoBruto(3200);
        e5.setTelefono("+34 689 95 36 82");
        e6.setSueldoBruto(1600);
        
        empresa.listarDatosEmpleados();
        
        // Suma totales de los sueldos brutos y netos
        empresa2.sumaSueldosBrutos();
        empresa2.sumaSueldosNetos();
        System.out.println();
        
        // Mostrar Solo las nominas de los empleados
        empresa2.mostrarNominas();
    } //main()

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘