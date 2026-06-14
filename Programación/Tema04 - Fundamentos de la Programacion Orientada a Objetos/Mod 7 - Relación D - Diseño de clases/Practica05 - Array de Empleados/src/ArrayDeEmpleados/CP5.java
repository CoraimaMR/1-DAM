/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArrayDeEmpleados;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class CP5 {
    
    // VARIABLES Y CONSTANTES ESTATICAS DE INSTANCIA
    private static final int NUM_EMLEADOS = 6;
    private static Empleado[] empleados = new Empleado[NUM_EMLEADOS];
//    private static String[] puestoTrabajo = {"Programador", "Analista"};
    
    public static void main(String[] args) {
        
        // Creamos 6 instancias nuevas del objeto Empleados
        instancia();
        
//        empleados[0] = new Empleado("Ana", 30, 2000, 200, puestoTrabajo[0]);
//        empleados[1] = new Empleado("Luis", 45, 2500, 150, puestoTrabajo[1]);
//        empleados[2] = new Empleado("Marta", 28, 1800, 300, puestoTrabajo[0]);
//        empleados[3] = new Empleado("Carlos", 35, 2200, 100, puestoTrabajo[1]);
//        empleados[4] = new Empleado("Sofía", 40, 2600, 250, puestoTrabajo[0]);
//        empleados[5] = new Empleado("Javier", 50, 3000, 50, puestoTrabajo[1]);
        
        System.out.println("\nEMPLEADO CON MAS SUELDO NETO");
        System.out.println(empleadoMayorSueldoNeto(empleados));
        
        System.out.println("\nEMPLEADO CON MAS INCENTIVO");
        System.out.println(empleadoMayorIncentivo(empleados));
        
        System.out.println("\nDINERO TOTAL GASTADO EN SUELDOS");
        System.out.println(totalSueldos(empleados)+"€");
        
        System.out.println("\nDATOS RECOLECTADOS DEL EMPLEDO");
        listarEmpleados(empleados);
        
    } // main()
    
    public static void instancia(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < empleados.length; i++) {
            System.out.print("\nIntroduzca el nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Introduzca la edad: ");
            int edad = sc.nextInt();
            System.out.print("Introduzca el sueldo bruto: ");
            double sueldoBruto = sc.nextDouble();
            System.out.print("Introduzca los incentivos: ");
            double incentivo = sc.nextDouble();
            sc.nextLine();
            System.out.print("Introduzca el puesto de trabajo (1.Programador, 2.Analista): ");
            String puestoTrabajo = sc.nextLine();
            empleados[i] = new Empleado(nombre, edad, sueldoBruto, incentivo, puestoTrabajo);
        }
    }
    
    public static void listarEmpleados(Empleado[] empleados) {
        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i]+"\n");
        }
    } // listarEmpleados(empleados)
    
    public static Empleado empleadoMayorSueldoNeto(Empleado[] empleados) {
        int mayor = 0;
        for (int i = 1; i < empleados.length; i++) {
            if (empleados[i].getsueldoNeto() > empleados[mayor].getsueldoNeto()) {
                mayor = i;
            }
        }
        return empleados[mayor];
    } // empleadoMayorSueldo(empleados)
    
    public static Empleado empleadoMayorIncentivo(Empleado[] empleados) {
        int mayor = 0;
        for (int i = 1; i < empleados.length; i++) {
            if (empleados[i].getIncentivos()> empleados[mayor].getIncentivos()) {
                mayor = i;
            }
        }
        return empleados[mayor];
    } // empleadoMayorIncentivo(empleados)
    
    public static double totalSueldos(Empleado[] empleados) {
        double total = 0;
        for (int i = 1; i < empleados.length; i++) {
            total += empleados[i].getSueldoBruto() + empleados[i].getIncentivos();
        }
        return total;
    } // totalSueldos(empleados)

} // clase principal
