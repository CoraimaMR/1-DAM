/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jesús Pérez
 */
public class Profesor extends Persona{
    private int codigo;
    private String dpto;
    private ArrayList modulos;
    private String horario;

    public Profesor(String nombre, String dni, String direccion, int telefono, int codigo, String dpto, ArrayList modulos, String horario) {
        super(nombre, dni, direccion, telefono);
        
        this.codigo = codigo;
        this.dpto = dpto;
        this.modulos = modulos;
        this.horario = horario;
    }
    
    public void mostrarPersona(){
        super.mostrarPersona();
        
        System.out.println("Código: "+this.codigo);
        System.out.println("Departamento: "+this.dpto);
        System.out.println("Horario: "+this.horario);
        System.out.println("Módulos: ");
        
        Iterator it=this.modulos.iterator();
        while (it.hasNext()) {
            System.out.println("\tMódulo: "+it.next());
        }
    }//mostrarPersona()

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public ArrayList getModulos() {
        return modulos;
    }

    public void setModulos(ArrayList modulos) {
        this.modulos = modulos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
        
}//class
