
/*******************************************************
 
📌 Métodos principales de String

📏 1) length(): longitud de la cadena

Devuelve el número de caracteres.

String saludo = "Hola Mundo";
int longitud = saludo.length(); // 10

✨ 2) equals(...): comparar contenido

Compara si dos String tienen el mismo texto.

String a = "Hola";
String b = "hola";

boolean iguales = a.equals(b); // false (distingue mayúsculas)

📂 3) equalsIgnoreCase(...): comparar sin mayúsculas/minúsculas
boolean iguales2 = a.equalsIgnoreCase("hola"); // true

🔍 4) contains(...): ¿incluye un texto?
String frase = "Java en NetBeans";
boolean tieneJava = frase.contains("Java"); // true

✂️ 5) substring(...): parte de la cadena
String palabra = "NetBeans";
String sub = palabra.substring(3);     // "Beans"
String sub2 = palabra.substring(0, 3); // "Net"

🔄 6) toUpperCase() / toLowerCase()
String s = "Hola";
System.out.println(s.toUpperCase()); // "HOLA"
System.out.println(s.toLowerCase()); // "hola"

🔁 7) replace(...): reemplazar partes del texto
String original = "a-b-c";
String cambiado = original.replace("-", "*"); // "a*b*c"

🔢 8) indexOf(...): posición de texto
String palabra = "hola";
int pos = palabra.indexOf("l"); // 2 (empezando en 0)

🧱 9) split(...): dividir por separador
String lista = "manzana,pera,uva";
String[] partes = lista.split(",");

for (String p : partes) {
    System.out.println(p);
}

🧪 Ejemplo completo en NetBeans

Abre NetBeans y crea un proyecto Java con una clase Main:

public class Main {
    public static void main(String[] args) {
        String saludo = "Hola NetBeans";

        // longitud
        System.out.println("Longitud: " + saludo.length());

        // mayúsculas
        System.out.println("Mayúsculas: " + saludo.toUpperCase());

        // comparación
        System.out.println("Es igual a 'hola netbeans'? " +
            saludo.equalsIgnoreCase("hola netbeans"));

        // contiene
        System.out.println("Contiene 'Net': " +
            saludo.contains("Net"));
    }
}


Cuando ejecutes, verás resultados como:

Longitud: 12
Mayúsculas: HOLA NETBEANS
Es igual a 'hola netbeans'? true
Contiene 'Net': true

*******************************************************/
