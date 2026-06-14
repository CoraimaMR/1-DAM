/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp1;

/**
 *
 * @author Jesús Pérez
 */
public class CuentaBancaria {
    //Constantes de clase (estáticas)
    private static final int MOV=100;
    private static final int DESCUBIERTO=-50;
    private static final int HACIENDA=3000;

    //Constantes de instancia
    private final String iban;
    private final String titular;

    //Variables de instancia
    private double saldo;
    private double[] movimientos;
    private int nMov;

    //-------------------Constructor -----------------------
    public CuentaBancaria(String iban, String titular) {
        //Inicializamos atributos constantes: iban y titular
        this.iban = iban;//Suponemos formato válido IBAN
        this.titular = titular;

        //Inicializamos saldo y número de movimientos
        this.saldo=0;
        this.nMov=0;
        this.movimientos=new double[MOV];        
    }//CuentaBanco()
    

    //------------------- - GETTERS  -------------------------
    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getnMov() {
        return nMov;
    }


    //--------------------- MÉTODOS ----------------------------
    public boolean ingreso(double cantidad){
        boolean resultado=true;
        
        if (cantidad<=0) {
            resultado=false;
        } else {
            resultado=operar(cantidad);
        }
        return resultado;
    }//ingreso()
    
    public boolean retirada(double cantidad){
        boolean resultado=true;
        
        if (cantidad<=0) {
            resultado=false;
        } else {
            resultado=operar(-cantidad);
        }
        return resultado;
    }//cantidad()
    
    public boolean operar(double cantidad){
        //OPERACIÓN NO VÁLIDA:
        //-Saldo inferior a -50 euros
        //-Número de movimientos mayor a MOV
        
        if(saldo+cantidad<DESCUBIERTO||nMov==MOV){
            return false;
        }
        
        //Operación permitida
        saldo+=cantidad;
        movimientos[nMov]=cantidad;
        nMov++;
        
        //Avisos
        if (saldo<0.0) {
            System.out.println("AVISO: Saldo inferior a 0 euros.");
        }
        if (cantidad>3000) {
            System.out.println("AVISO: Movimiento superior a 3000 euros. Se notificará a HACIENDA.");
        }
        
        //Aunque se haya notificado algún aviso, la operación ha sido posible
        return true;        
    }//operar
    
    public void imprimirDatos(){
        System.out.println("\n------ DATOS DE LA CUENTA -------");
        System.out.println("IBAN: "+getIban()); 
        System.out.println("Titular: "+getTitular());
        System.out.println("Saldo = "+getSaldo());
        System.out.println("");
    }
    
    public void movimientos(){
        System.out.println("Nº movimientos = "+getnMov());
        for (int i = 0; i < nMov; i++) {
            System.out.println((i+1)+". "+movimientos[i]);            
        }
        System.out.println("");
    }//movimientos()
    
        
}//class
