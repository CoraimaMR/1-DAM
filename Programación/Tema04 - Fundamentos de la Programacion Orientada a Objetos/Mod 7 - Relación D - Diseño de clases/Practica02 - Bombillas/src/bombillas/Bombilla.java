
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 24 ene 2026     ⏰ Hora: 21:20:06
 *
 *  Nombre del programa : Bombilla
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package bombillas;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 24 ene 2026 ⏰ Hora: 21:20:06
* @version 1.0
*******************************************************************************/

public class Bombilla {

    // -- VARIABLES DE INSTANCIA --
    private boolean encendida;
    
    //---- VARIABLES ESTATICAS ----
    private static boolean luzGeneral;
    
    // -------- CONSTRUCTOR --------
    public Bombilla() {
        this.encendida = false;
        this.luzGeneral = true;
    }
    
    //---- METODOS DE LA CLASE -----
    public String estadoBombilla() {
        if (encendida && luzGeneral) {
            return "Encendida";
        } else {
            return "Apagada";
        }
//        return estadoBombilla() ? "encendida" : "Apagada";
    } // estadoBombilla()
    
    public void apagarBombilla() {
        this.encendida = false;
    } // apagarBombilla()
    
    public void encenderBombilla() {
        this.encendida = true;
    } // encenderBombilla()
    
    //------ METODOS ESTATICOS ------
    public static void apagarLuz() {
        luzGeneral = false;
    } // apagarLuz()
    
    public static void encenderLuz() {
        luzGeneral = true;
    } // encenderLuz()
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘