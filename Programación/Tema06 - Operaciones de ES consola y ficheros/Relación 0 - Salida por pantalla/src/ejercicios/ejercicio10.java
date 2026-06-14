
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 10 abr 2026     ⏰ Hora: 8:51:37
 *
 *  Nombre del programa : ejercicio10
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Se proporciona el siguiente texto:
"Febrero es un mes curioso, ya que para cuadrar el calendario, un año bisiesto 
debe ser divisible entre 4, salvo que sea año secular -el último de cada siglo, 
terminado en 00- en cuyo caso también ha de ser divisible entre 400. De esta 
manera, nunca existirá el 30/02/ de cualquier año, pero sí el 29/02/2024. En 
consecuencia, este año no hay 29/02/2026, ni existió el 29/02/1900, pero sí el 
29/02/2000. Por otro lado, hay meses que no tienen 31 días, y por eso no existe 
el 31/09/2025, al igual que no existió el 31/11/2024, pero sí el 30/11/2014. 
Adicionalmente, hay fechas que no cumplen el formato que nosotros hemos diseñado, 
por ejemplo el 13-2-2025, aunque conceptualmente sea una fecha válida. Por cierto, 
hoy es 13/02/2025.

Diseña un programa en Java que sea capaz de examinar el texto anterior y de 
mostrar por pantalla las fechas que además de cumplir el formato, sean correctas.

Pautas para la autocorrección del ejercicio 10:

Puntos                        Criterio
  5          Detecta correctamente las fechas según su formato
 6-7         Excluye los días 31 en los meses que tienen 30 días
 7-8         Comprueba años bisiestos de 4 en 4 años
  10         Comprueba los años bisiestos seculares (terminados en -00)

*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicios;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio10 {

    public static void main(String[] args) {
        
        String texto = "Febrero es un mes curioso, ya que para cuadrar el calendario,\n"
                + "un año bisiesto debe ser divisible entre 4, salvo que sea año\n"
                + "secular -el último de cada siglo, terminado en 00- en cuyo caso\n"
                + "también ha de ser divisible entre 400. De esta manera, nunca\n"
                + "existirá el 30/02/ de cualquier año, pero sí el 29/02/2024.\n"
                + "En consecuencia, este año no hay 29/02/2026, ni existió el\n"
                + "29/02/1900, pero sí el 29/02/2000. Por otro lado, hay meses\n"
                + "que no tienen 31 días, y por eso no existe el 31/09/2025, al\n"
                + "igual que no existió el 31/11/2024, pero sí el 30/11/2014.\n"
                + "Adicionalmente, hay fechas que no cumplen el formato que\n"
                + "nosotros hemos diseñado, por ejemplo el 13-2-2025, aunque\n"
                + "conceptualmente sea una fecha válida. Por cierto, hoy es\n"
                + "13/02/2025.";

        // Identificamos las fechas y las mostramos
        identificarFechas(texto);

    } //main()
    
    public static void identificarFechas(String texto) {        
        String regexFecha = "(0[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/(\\d{4})";
        
        Pattern patron = Pattern.compile(regexFecha); // Pattern: Patron que buscamos
        Matcher matcher = patron.matcher(texto); // Matcher: Donde lo buscamos
        
        System.out.println("===== FECHAS VÁLIDAS =====");
        
        while (matcher.find()) {
            String fecha = matcher.group();

            // Separar día, mes y año
            String[] partes = fecha.split("/"); // Divide en grupos
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int año = Integer.parseInt(partes[2]);

            // Validar fecha
            if (fechaValida(dia, mes, año)) {
                System.out.println(fecha);
            }
        }       
    } // identificarFechas(String texto)
    
    public static boolean fechaValida(int dia, int mes, int año) {
        // Meses con 31 días
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
            mes == 8 || mes == 10 || mes == 12) {
            return dia <= 31;
        }
        // Meses con 30 días
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        }
        // Febrero
        if (mes == 2) {
            if (esBisiesto(año)) {
                return dia <= 29;
            } else {
                return dia <= 28;
            }
        }
        return false;
    } // fechaValida(int dia, int mes, int año)
    
    public static boolean esBisiesto(int año) {
        if (año % 4 == 0) {
            if (año % 100 == 0) {
                return año % 400 == 0;
            }
            return true;
        }
        return false;
    } // esBisiesto(int año)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘