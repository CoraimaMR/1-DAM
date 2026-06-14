/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package texto;

/**
 *
 * @author usuario
 */
/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 26 ene 2026 ⏰ Hora: 11:08:10
* @version 1.0
*******************************************************************************/

public class main {

    public static void main(String[] args) {
        
        Texto tex = new Texto(15);
        tex.addInicio("Hola");
        tex.addFinal(" Mundo");
//        tex.imprimeCadena();
        tex.mostrarInfo();

        tex.addFinal("!");
//        tex.imprimeCadena();
        tex.mostrarInfo();

        tex.addInicio("¡");
//        tex.imprimeCadena();
        tex.mostrarInfo();

        System.out.println("\nNúmero de vocales = " + tex.cuentaVocales());

    } //main()

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘