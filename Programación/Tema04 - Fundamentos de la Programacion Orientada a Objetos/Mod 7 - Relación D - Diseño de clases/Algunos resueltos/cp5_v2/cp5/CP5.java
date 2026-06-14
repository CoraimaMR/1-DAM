/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cp5;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.IIOException;

/*------------------------------- ENUNCIADO ------------------------------------
------------------Caso Práctico 5: Array de Empleados---------------------------
“Programadores Anónimos” es una empresa que consta de 6 empleados y desea gestionar 
la información sobre ellos, de manera que para cada uno necesita guardar:
- nombre 
- edad
- sueldo neto
- incentivos 
- puesto de trabajo (programador o analista). 

Se necesita crear un método que recorra el array completo y liste los valores de 
cada empleado. 

Además, se desea averiguar:
- Cuál es el empleado que tiene el sueldo neto más alto. 
- El empleado que más incentivos ha cobrado. 
- Cuál es la cantidad total de dinero gastado en salarios. 
- El sueldo neto, que se obtendrá restando un 7% de IRPF y un 2,5% de SS al sueldo 
bruto y sumándole los incentivos. Realiza esta operación en el constructor.

Finalmente, se desea generar el fichero ‘programador.csv’ y el fichero ‘analista.csv’ 
para almacenar de forma separada los datos correspondientes a cada colectivo en 
formato csv, de manera que cada línea corresponda a un empleado y sus campos estén 
separados por ‘;’. Los datos de cada empleado tendrán que introducirse por teclado.

Para realizar el ejercicio, deberás crear la clase Empleado con su correspondiente 
estructura. En segundo lugar, crearás la clase CP5 que contendrá el método main, 
así como los métodos necesarios para realizar todos los cálculos solicitados.
*/

/**
 * @author Jesús Pérez 
 */
public class CP5 {
    
    
    //----------------MAIN------------------
    public static void main(String[] args) {
        int p;
        
        //Creamos el Array de empleados
        VectorEmpleados plantilla = new VectorEmpleados(3);
        
        //Damos valores al vector de empleados
        plantilla.instancia();
        
        //Calculamos el de mayor sueldo bruto
        p=plantilla.masSueldo();
        System.out.printf("\nEl de mayor sueldo es %s y cobra %.2f euros.\n", plantilla.v[p].getNombre(), plantilla.v[p].getSueldoBruto());
        
        //Calculamos el de mayor incentivos
        p=plantilla.masIncentivos();
        System.out.printf("El que más incentivos ha cobrado es %s con %.2f euros.\n",plantilla.v[p].getNombre(),plantilla.v[p].getIncentivos());
        
        //Indicamos el gasto total en sueldos
        System.out.printf("El gasto total en salarios es %.2f\n",plantilla.sumaSalarios());
        
        //Listo empleados
        plantilla.listaEmpleados();
        
        
    }//main()--------------------------------

           
}//class
