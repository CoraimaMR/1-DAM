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
public class Alumno extends Persona {
    private int exp;
    private String ciclo;
    private int curso;
    private ArrayList notas;

    public Alumno(String nombre, String dni, String direccion, int telefono, int exp, String ciclo, int curso, ArrayList notas) {
        super(nombre, dni, direccion, telefono);
        this.exp = exp;
        this.ciclo = ciclo;
        this.curso = curso;
        this.notas = notas;
    }
    
    //El método mostrarPersona sobreescribe al heredado de la clase padre
    public void mostrarPersona(){
        super.mostrarPersona();
        
        System.out.println("Expediente: "+this.exp);
        System.out.println("Ciclo: "+this.ciclo);
        System.out.println("Curso: "+this.curso);
        System.out.println("Notas: ");
        
        for (Iterator it = this.notas.iterator(); it.hasNext();) {
            System.out.println("\tNota: "+it.next());
        }
    }//mostrarPersona()

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public ArrayList getNotas() {
        return notas;
    }

    public void setNotas(ArrayList notas) {
        this.notas = notas;
    }
    
}//class
