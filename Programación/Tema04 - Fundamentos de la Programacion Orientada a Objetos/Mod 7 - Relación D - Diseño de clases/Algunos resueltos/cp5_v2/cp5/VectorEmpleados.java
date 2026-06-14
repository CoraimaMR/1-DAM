/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp5;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class VectorEmpleados {
    //Variables y Constantes de Instancia
    private final int LONGITUD;
    static Empleado v[];

    public VectorEmpleados(int LONGITUD) {
        if (LONGITUD>0) {
            this.LONGITUD=LONGITUD;
            this.v=new Empleado[LONGITUD];               
        } else {
            this.LONGITUD=0;
            System.out.println("No se puede crear array de empleados");
        }
    }//constructor
    
    
    //-------MÉTODOS
    public void instancia(){
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
    
    public void listaEmpleados(){
        for (int i = 0; i < v.length; i++) {
            System.out.println("\nEmpleado "+i);
            System.out.println(v[i].toString());      
        }//for
    }//listaEmpleados()
    
    
    
    public int masSueldo(){
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
    
    public int masIncentivos(){
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
    
    public double sumaSalarios(){
        double suma=0;
        
        for (int i = 0; i < v.length; i++) {
            suma+=v[i].getSueldoBruto();            
        }
        
        return suma;
    }//sumaSalarios()
    
    
    
}//class
