
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autoras:    🌟 Coraima Mera Rodríguez 🌟
 *              🌟 Windely Moronta Acosta 🌟
 * 
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 16 dic 2025     ⏰ Hora: 8:33:22
 *
 *  Nombre del programa : StarWars
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Trabajo01;
import java.util.Scanner;

public class StarWars {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        boolean seguir = true, ganador = false;
        int pregunta = 0, respuestaUsuario, respuestaCorrecta;
        int s1, s2, p1, p2, n, p, m, s;
        int calculo1 = 1, calculo2 = 1;
        
        // Creación de variables
        s1 = (int) (Math.random()*10)+1;
        s2 = (int) (Math.random()*11)+20;
        p1 = (int) (Math.random()*7)+1;
        p2 = (int) (Math.random()*5)+8;
        n = (int) (Math.random()*51)+50;
        p = (int) (Math.random()*91)+10;
        m = (int) (Math.random()*11)+5;
        s = (int) (Math.random()*11)+5;
        
        // Inicio programa
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.println("8888888888888   888    88888");
        System.out.println("88       88    88 88   88   88");
        System.out.println("8888     88   88   88  88888");
        System.out.println("    88   88   8888888  88   88");
        System.out.println("88888    88   88   88  88    888888");
        System.out.println();
        System.out.println("88   88   88    888    88888     888888");
        System.out.println("88   88   88   88 88   88   88   88");
        System.out.println("88 8888   88  88   88  88888      8888");
        System.out.println(" 888  888     8888888  88   88       88");
        System.out.println("  88   88     88   88  88    888888888");   
        System.out.println();
        System.out.println("      ___");
        System.out.println("     /() \\");
        System.out.println("  _ |_____| _");
        System.out.println(" |  | === |  |");
        System.out.println(" |_ |  0  | _|");
        System.out.println("   ||  0  ||");
        System.out.println("   ||__*__||");
        System.out.println(" |~ \\____/ ~|");
        System.out.println("   /=\\ /=\\ /=\\");
        System.out.println("___|_]_[_]_[_]");
        System.out.println();
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===");
        System.out.println("Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke\n" +
"Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n" +
"en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n" +
"está construyendo para destruirla. (Presiona Intro para continuar)");

        
        sc.nextLine(); // Saltamos de linias si presionamos INTRO
        
        do {   
            // Prparamos para la pregunta
            pregunta++;
            respuestaCorrecta = 1;
            
            switch (pregunta) {
                case 1: // PREGUNTA 1
                    System.out.println("\n====== NIVEL "+pregunta+" ======");
                    System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al\n" +
"sistema "+s1+" en el sector "+s2+", pero el sistema de navegación está estropeado y el\n" +
"computador tiene problemas para calcular parte de las coordenadas de salto.\n" +
"Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n" +
"Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n" +
"calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n" +
"¿Qué debe introducir?");
                    
                    // Calculamos la respuesta correcta
                    respuestaCorrecta = 0; // inicializamos a 0
                    for (int i = s1; i <= s2; i++) { // Sumamos de s1 a s2 incluido s2 y lo guardamos
                        respuestaCorrecta += i;
                    }
//                    System.out.println("Respuesta correcta: "+respuestaCorrecta); // Mostramos respuesta
                    
                    // Leeemos la respuesta del jugador
                    respuestaUsuario = sc.nextInt(); 
                    
                    // Si la repuesta es incorrecta salimos del bucle
                    if (respuestaUsuario != respuestaCorrecta) {
                        seguir = false;
                    }
                    
                    break;
                case 2: // PREGUNTA 2
                    System.out.println("\n====== NIVEL "+pregunta+" ======");
                    System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n" +
"de la muerte. Como van en una nave imperial robada se aproximan lentamente con\n" +
"la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí\n" +
"agente de espaciopuerto "+p1+" contactando con nave imperial "+p2+". No están destinados\n" +
"en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa.\n" +
"“Eh… tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso\n" +
"para atracar y reparar la nave”. El agente, que no se anda con tonterías, responde\n" +
"“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el\n" +
"manual del piloto que estaba en la guantera y da con la página correcta. El código\n" +
"es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n" +
"¿Cuál es el código?");
                    
                    // Calculamos la respuesta correcta
                    for (int i = p1; i <= p2; i++) { // Multiplicamos de p1 a p2 incluido s2 y lo guardamos
                        respuestaCorrecta *= i;
                    }
//                    System.out.println("Respuesta correcta: "+respuestaCorrecta); // Mostramos la respuesta
                    
                    // Leeemos la respuesta del jugador
                    respuestaUsuario = sc.nextInt(); 
                    
                    // Si la repuesta es incorrecta salimos del bucle
                    if (respuestaUsuario != respuestaCorrecta) {
                        seguir = false;
                    }
                    
                    break;
                case 3: // PREGUNTA 3
                    System.out.println("\n====== NIVEL "+pregunta+" ======");
                    System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se\n" +
"equipan con trajes de soldados imperiales que encuentran en la nave para pasar\n" +
"desapercibidos y bajan. Ahora deben averiguar en qué nivel de los "+n+" existentes se\n" +
"encuentra el reactor principal. Se dirigen al primer panel computerizado que\n" +
"encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita\n" +
"introducir una clave de acceso. Entonces recuerda la información que le proporcionó\n" +
"Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de "+n+"/10\n" +
"(redondeando N hacia abajo), donde "+n+" es el nº de niveles”.\n" +
"¿Cual es el nivel correcto?");
                    
                    // Calculamos la respuesta correcta
                    for (int i = 1; i <= Math.round(n/10); i++) { // Hacemos su factorial
                        respuestaCorrecta *=  i;
                    }
//                    System.out.println("Respuesta correcta: "+respuestaCorrecta); // Mostramos la respuesta
                    
                    // Leeemos la respuesta del jugador
                    respuestaUsuario = sc.nextInt(); 
                    
                    // Si la repuesta es incorrecta salimos del bucle
                    if (respuestaUsuario != respuestaCorrecta) {
                        seguir = false;
                    }
                    
                    break;
                case 4: // PREGUNTA 4
                    System.out.println("\n====== NIVEL "+pregunta+" ======");
                    System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta\n" +
"acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para\n" +
"intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita\n" +
"verificar si el número "+p+" es primo o no. Si es primo introduce un 1, si no lo es\n" +
"introduce un 0.");
                    
                    // Calculamos la respuesta correcta
                    if (p%2 == 0) { // Si el número es par
                        respuestaCorrecta = 1;
                    } else { // Si el número no es par
                        respuestaCorrecta = 0;
                    }
//                    System.out.println("Respuesta correcta: "+respuestaCorrecta); // Mostramos la respuesta
                    
                    // Leeemos la respuesta del jugador
                    respuestaUsuario = sc.nextInt(); 
                    
                    // Comprobamos respuesta
                    if (respuestaUsuario == 0 || respuestaUsuario == 1) { // Si no es un número correspondido
                        // Si la repuesta es incorrecta salimos del bucle
                        if (respuestaUsuario != respuestaCorrecta) {
                        seguir = false;
                        }
                    } else {
                        System.out.println("ERROR. Debe introducir 0 si es impar o 1 si es par.");
                        seguir = false;
                    }
                    
                    break;
                case 5: // PREGUNTA 5
                    System.out.println("\n====== NIVEL "+pregunta+" ======");
                    System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n" +
"programe el temporizador y salir de allí corriendo. Necesita programarlo para que\n" +
"explote en exactamente M minutos y S segundos, el tiempo suficiente para escapar\n" +
"antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y\n" +
"desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto\n" +
"peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar\n" +
"el factorial de "+m+" y el factorial de "+s+". ¿Qué valor debe introducir?");
                    
                    // Calculamos la respuesta correcta
                    // Calculamos el factorial m
                    for (int i = 1; i <= m; i++) {
                        calculo1 *=  i;
                    }
                    // Calculamos el factorial s
                    for (int i = 1; i <= s; i++) {
                        calculo2 *=  i;
                    }
                    respuestaCorrecta = calculo1 + calculo2; // Sumamos los calculos hechos
//                    System.out.println("Respuesta correcta: "+respuestaCorrecta); // Mostramos la respuesta
                    
                    // Leeemos la respuesta del jugador
                    respuestaUsuario = sc.nextInt(); 
                    
                    // Si la repuesta es incorrecta salimos del bucle
                    if (respuestaUsuario != respuestaCorrecta) {
                        seguir = false;
                    }
                    
                    break;
                    default: // Fin de las respuestas
                        ganador = true;
                        seguir = false;
            }
        } while (seguir);
        System.out.println(); // Salto de linea

        // Mostramos el resultado
        if (ganador) { // Si el usuario ha llegado hasta el final
            System.out.println("Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a\n" +
"sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se\n" +
"convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea\n" +
"consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan\n" +
"observan por la ventana la imagen de la colosal estrella de la muerte explotando en\n" +
"el silencio del espacio, desapareciendo para siempre junto a los restos del malvado\n" +
"imperio.\n" +
"¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");
        } else { // SI NO
            System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +
"Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
        }
        System.out.println(); // Salto de linea
        
        // Mensaje final
        System.out.println("Gracias por jugar :D");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘