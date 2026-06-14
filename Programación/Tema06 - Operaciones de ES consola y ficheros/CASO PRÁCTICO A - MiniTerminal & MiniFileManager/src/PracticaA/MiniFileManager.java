
// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package PracticaA;
import java.io.File;
import java.util.Arrays;
import java.util.Date;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 4 may 2026 ⏰ Hora: 16:54:32
* @version 1.0
*******************************************************************************/

public class MiniFileManager {

    // --------- ATRIBUTOS ---------
    private File carpetaActual;
    private final File carpetaMadre;
    
    // -------- CONSTRUCTOR --------
    public MiniFileManager(String nombreCarpeta) {
        this.carpetaMadre = new File(nombreCarpeta);
        this.carpetaActual = carpetaMadre;
        
        // Si la carpeta no existe la creo
        if (!this.carpetaMadre.exists()) {
        this.carpetaMadre.mkdir();
        }
    }
    
    //---- METODOS DE LA CLASE -----
    
    public void getPWD() {
        System.out.println(carpetaActual.getPath());
    } // getPWD()
    
    public void cambiarCarpeta(String nombre) throws Exception {
        switch (nombre) {
            case "..": // OPCIÓN 1: PARA ATRÁS
                File superior = carpetaActual.getParentFile();
                if (superior == null) throw new Exception("ERROR. No hay carpeta superior.\n");
                carpetaActual = superior;
                System.out.println("*** Carpeta cambiada correctamente ***");
                break;
            default: // OTRAS OPCIONES: PARA ADELANTE
                File fl = new File(carpetaActual, nombre);
                if (!(fl.exists() && fl.isDirectory())) throw new Exception("ERROR. La carpeta no ha sido encontrada.\n");
                carpetaActual = fl;
                System.out.println("*** Carpeta cambiada correctamente ***");
        }
    } // cambiarCarpeta(String newCarpeta)
    
    public void mostrarContenido(boolean informacionExtra) throws Exception {
        File[] listado = carpetaActual.listFiles(); 
        if (listado == null) throw new Exception("ERROR. Al entrar al contenido.");
        Arrays.sort(listado); // Ordenamos el array alfabeticamente
        
        System.out.println("\n=== CARPETA ===");
        System.out.println("[D] "+carpetaActual.getName());
        
        System.out.println("=== CONTENIDO ===");
        //Mostramos los directorios
        for (int i = 0; i < listado.length; i++) {
            if (listado[i].isDirectory()) {                    
                imprimirDetalle(listado[i], "[D]", informacionExtra);
            }
        }
        //Mostramos los archivos
        for (int i = 0; i < listado.length; i++) {
            if (listado[i].isFile()) {
                imprimirDetalle(listado[i], "[A]", informacionExtra);
            }                
        }
    } // mostrarContenido(boolean informacionExtra)
    
    private static void imprimirDetalle(File f, String prefijo, boolean informacionExtra) {
        if (informacionExtra) {
            // Mostramos nombre + tamaño + fecha
            System.out.println(prefijo + " " + f.getName() + " - " + f.length() + " bytes - " + new Date(f.lastModified()));
        } else {
            // Mostramos solo el nombre como en el ejercicio anterior
            System.out.println(prefijo + " " + f.getName());
        }
    } // imprimirDetalle(File f, String prefijo, boolean info)
    
    public void borrarContenido(String nombre) throws Exception {
        File fl = new File(carpetaActual, nombre);
        if (!fl.exists()) throw new Exception("ERROR. Archivo no encontrado.");
        if (fl.isDirectory()) { // Si es una carpeta
            File[] contenido = fl.listFiles();
            if (contenido != null) {
                for (int i = 0; i < contenido.length; i++) {
                    if (contenido[i].isDirectory()) {
                        System.out.println("Aviso: contiene subcarpetas, no se eliminaran.");
                    } else {
                        contenido[i].delete();
                    }
                }
            }
        }
        fl.delete();
    } // borrarContenido(String nombre)
    
    public void moverOrenombrar(String viejo, String nuevo) throws Exception {
        File fViejo = new File(carpetaActual, viejo);
        File fNuevo = new File(carpetaActual, nuevo);
        
        if (!fViejo.exists()) throw new Exception("El origen no existe.");
        if (fNuevo.exists()) throw new Exception("El destino ya existe.");
        
        boolean renombrar = fViejo.renameTo(fNuevo);
        if (!renombrar) throw new Exception("No se pudo renombrar/mover.");
        System.out.println("Operación realizada con éxito.");
    } // overOrenombrar(String viejo, String nuevo)
    
    public void mkdir(String nombre) throws Exception {
        File fl = new File (carpetaActual, nombre);
        if (fl.exists()) throw new Exception("ERROR. La carpeta llamada " + fl + " ya existe");
        fl.mkdir();
        System.out.println("*** Carpeta creada correctamente ***");
    } // mkdir(String directorio)
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘