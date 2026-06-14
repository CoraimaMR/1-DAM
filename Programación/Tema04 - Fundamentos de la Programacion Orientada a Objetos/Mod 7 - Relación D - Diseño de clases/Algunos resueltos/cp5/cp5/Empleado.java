/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp5;

/**
 *
 * @author Jesús Pérez
 */
public class Empleado {
    //Clase
    public static final String EMPRESA="Programadores Anónimos";
    public static final double IRPF=0.07;
    public static final double SS=0.025;
    
    //Instancia
    private String nombre;
    private int edad;
    private double sueldoBruto;
    private double sueldoNeto;
    private double incentivos;
    private String puesto;
           
    //Constructores
    public Empleado(String nombre, int edad, double sueldoBruto, double incentivos, String puesto) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldoBruto = sueldoBruto;
        this.incentivos = incentivos;
        this.puesto = puesto;
        
        //Calculo sueldo neto
        this.sueldoNeto=sueldoBruto-sueldoBruto*IRPF-sueldoBruto*SS+incentivos;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public double getSueldoNeto() {
        return sueldoNeto;
    }

    public double getIncentivos() {
        return incentivos;
    }

    public String getPuesto() {
        return puesto;
    }

    //Imprimimos los valores del objeto
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", sueldoBruto=" + sueldoBruto + ", sueldoNeto=" + sueldoNeto + ", incentivos=" + incentivos + ", puesto=" + puesto + '}';
    }
    
    //Generamos una línea csv
    public String lineaCSV(){
        return nombre+";"+edad+";"+sueldoBruto+";"+sueldoNeto+";"+incentivos+";"+puesto+"\n";
    }//lineaCSV()
        
}//class
