/**************** APUNTES STRING *****************
 
 .toLowerCase()      // Convertir a minusculas
 .toUpperCase()      // Conertir a mayusculas
 .replace(" ", "")   // Remplaza los espacios a nada
 .trim()             // Quitar los espacios de inicio y el final
 .length()           // Total de carcater
 .substring(0,3)     // Obtener desde la letra 0 hasta la 3
 .split(" ")         // Dividir la cadena en palabras separadas
 .indexOf(x)         // Buscar x
 .charAt(i)          // Coger la letra numero i

iguales = texto1.equals(texto2);
igualesSinMayus = texto1.equalsIgnoreCase(texto2);

********************* Bstring ********************

1. Dividir la cadena en palabras separadas en el vector palabras
--> String[] palabras = texto.split(" ");

2. Si dos textos son iguales
--> iguales = texto1.equals(texto2);
--> igualesSinMayus = texto1.equalsIgnoreCase(texto2);

3. Obtener las primeras 3 letras de la cadena
--> codNombre = nombre.substring(0, 3);

EXTRA. Sumar y convertir a mayúsculas
codigoFinal = (codNombre + codApe1 + codApe2).toUpperCase();
 
4. Convertimos toda la frase a minúsculas
--> frase = frase.toLowerCase();

EXTRA. Recorrer cada carácter de la frase
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c == 'a') {
                contadorA++;
            } else if (c == 'e') {
                contadorE++;
            } else if (c == 'i') {
                contadorI++;
            } else if (c == 'o') {
                contadorO++;
            } else if (c == 'u') {
                contadorU++;
            }
        }

5. Convertir a minúsculas y eliminar espacios
--> fraseSinEspacios = fraseOriginal.toLowerCase().replace(" ", "");

********************* Drepaso ********************

frase = sc.nextLine().trim();   // quitamos espacios al inicio y final

5. Busca el carácter x dentro de la cadena alfabeto
String alfabeto = "qwertyuiopñlkjhgfdsazxcvbnm";
alfabeto.indexOf(x)

5 EXTRA. Cogemos la letra número i
nombre.charAt(i)

*************************************************/