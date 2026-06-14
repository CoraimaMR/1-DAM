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
    //Variables y Constantes de Instancia
    public static final int LONGITUD=3;
    public static Empleado v[];
    public static File programador;
    public static File analista;
    
    //----------------MAIN------------------
    public static void main(String[] args) {
        int p;
        
        //Creamos el Array de empleados
        v=new Empleado[LONGITUD];
        
        //Damos valores al vector de empleados
        instancia();
        
        //Calculamos el de mayor sueldo bruto
        p=masSueldo();
        System.out.printf("\nEl de mayor sueldo es %s y cobra %.2f euros.\n",v[p].getNombre(),v[p].getSueldoNeto());
        
        //Calculamos el de mayor incentivos
        p=masIncentivos();
        System.out.printf("El que más incentivos ha cobrado es %s con %.2f euros.\n",v[p].getNombre(),v[p].getIncentivos());
        
        //Indicamos el gasto total en sueldos
        System.out.printf("El gasto total en salarios es %.2f\n",sumaSalarios());
        
        //Listo empleados
        listaEmpleados();
        
        //Genero ficheros csv
        try {
            programador=new File("programador.csv");
            analista=new File("analista.csv");
            generarCSV();
            
        } catch (FileNotFoundException e){
            System.out.println("Error al crear el fichero");
            System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }//main()--------------------------------

    public static void listaEmpleados(){
        for (int i = 0; i < v.length; i++) {
            System.out.println("\nEmpleado "+i);
            System.out.println(v[i].toString());      
        }//for
    }//listaEmpleados()
    
    public static void instancia(){
        Scanner sc = new Scanner(System.in);
        
        String nombre, puesto;
        int edad;
        double sueldo_bruto, incentivos;
        
        //Instanciamos las posiciones del vector de empleados pidiendo los valores
        //por pantalla
        for (int i = 0; i < v.length; i++) {
            System.out.print("Nombre: ");
            nombre=sc.next();
            System.out.print("Edad: ");
            edad=sc.nextInt();
            System.out.print("Sueldo Bruto: ");
            sueldo_bruto=sc.nextDouble();
            System.out.print("Incentivos: ");
            incentivos=sc.nextDouble();
            System.out.print("Puesto: ");
            puesto=sc.next();
            System.out.println("");
            
            v[i]=new Empleado(nombre, edad, sueldo_bruto, incentivos, puesto);
            
        }//for
        
    }//instancia()
    
    public static int masSueldo(){
        double max=0;
        int posicion=0;
        
        for (int i = 0; i < v.length; i++) {
            if (v[i].getSueldoNeto()>max) {
                max=v[i].getSueldoNeto();
                posicion=i;
            }//if            
        }//for
        
        return posicion;
    }//calculaSueldo()
    
    public static int masIncentivos(){
        double max=0;
        int posicion=0;
        
        for (int i = 0; i < v.length; i++) {
            if (v[i].getIncentivos()>max) {
                max=v[i].getIncentivos();
                posicion=i;
            }//if            
        }//for
        
        return posicion;
    }//masIncentivos()
    
    public static double sumaSalarios(){
        double suma=0;
        
        for (int i = 0; i < v.length; i++) {
            suma+=v[i].getSueldoBruto();            
        }
        
        return suma;
    }//sumaSalarios()
    
    public static void generarCSV() throws IOException{
        try {
            FileWriter fwp=new  FileWriter(programador);
            FileWriter fwa=new  FileWriter(analista); 
            for (int i = 0; i < v.length; i++) {
                if (v[i].getPuesto().equalsIgnoreCase("analista")) {
                    fwa.write(v[i].lineaCSV());
                }
                if (v[i].getPuesto().equalsIgnoreCase("programador")) {
                    fwp.write(v[i].lineaCSV());
                }
            }//for
            fwa.close();
            fwp.close();
        } catch (IOException e) {
            throw new IOException("Error de escritura");
        }
    }//generaCSV()
    
}//class
