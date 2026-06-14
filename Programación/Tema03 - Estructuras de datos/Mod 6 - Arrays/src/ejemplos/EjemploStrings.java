/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplostrings;

/*
*******************************************************************************
+++++++++++++++++++ EJEMPLO DE USO DE CADENAS DE CARACTERES++++++++++++++++++++
*******************************************************************************
*/

/**
 *
 * @author Jesús Pérez
 */
public class EjemploStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Los String son inmutables. Toda operación que hagamos con ellos,
        //darán como resultado uno nuevo: proceso altamente eficiente
        
        //DECLARACIÓN 
        String nombre = "Fernando";//Inicializado con un literal. 
        String apellido = " Martín";//No hace falta usar new()
        String completo, alReves;
        String str1, str2;
        String starWars;
             
        //**********************************************************************
        //CONCATENACIÓN. 
        //Operador + 
        completo = nombre+apellido;
        System.out.println(completo);
        
        //Método concat
        completo="";//Le asigno la cadena vacía
        completo= nombre.concat(apellido);
        System.out.println(completo);
        
        alReves=(apellido.concat(", ")).concat(nombre);
        System.out.println(alReves);
                
        //**********************************************************************
        //LONGITUD DE UNA CADENA 
        //Se incluyen todos los caracteres: espacios, tabuladores, signos de puntuación...
        System.out.println("");
        System.out.println("Longitud de completo = "+completo.length());
        System.out.println("Longitud de alReves = "+alReves.length());
                
        //**********************************************************************
        //MAY a min y Viceversa
        System.out.println("");
        System.out.println(completo.toUpperCase());
        System.out.println(completo.toLowerCase());
        
        //**********************************************************************
        //FORMATEO
        //String.format
        System.out.println("");
        str2="en jugar en la NBA";
        str1=String.format("Hola, soy %s %s y fui el primer español %s",nombre, apellido, str2);
        System.out.println(str1);
        
        //Método "hermano": System.out.printf()
        //Hace lo mismo que las dos líneas anteriores juntas
        System.out.printf("Hola, soy %s %s y fui el primer español %s",nombre, apellido, str2);
        
        //**********************************************************************
        //COMPARACIÓN
        System.out.print("\n\n");
        starWars="Hace mucho tiempo, en una galaxia muy, muy lejana";
        
        System.out.println(starWars.endsWith("muy lejana"));
        System.out.println(starWars.startsWith("Hace mucho tiempo"));
        System.out.println(starWars.contains("galaxia"));
        //otros métodos de comparación: 
        //equals(), equalsToIgnoreCase(), compareTo(), compareToIgnoreCase()...
        
        //**********************************************************************
        //OTROS. 
        //valueOf(). Convierte valores a cadena
        System.out.println("");
        System.out.println("Convertimos un número a cadena: ");
        System.out.println(String.valueOf(47251));

        //charAt(). Extrae el carácter cuyo índice se indica en el argumento
        System.out.println("Uso de charAt(): ");
        System.out.println(starWars.charAt(5));
        
        //substring(). Extrae una subcadena 
        System.out.println(starWars.substring(26,33));
        
        //indexOf(). Busca la posición de una subcadena
        System.out.println(starWars.indexOf("muy"));
        System.out.println(starWars.indexOf("muy",35));//Busca desde 35
        
        //replace(). Reemplaza un argumento por otro.
        System.out.println(str1.replace('N', 'Ñ'));
        //Recuerda que las cadenas son inmutables. El resultado anterior no modifica str
    }//main
    
}//class
