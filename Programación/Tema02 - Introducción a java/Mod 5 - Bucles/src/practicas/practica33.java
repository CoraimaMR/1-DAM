
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 11 nov 2025     ⏰ Hora: 8:39:12
 *
 *  Nombre del programa : practica33
 *
 *******************************************************/

/* Ejercicio 33
Escribe un programa que muestre 20 notas generadas al azar. Las notas deben 
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. 
Al final aparecerá el número de suspensos, el número de suficientes, el número 
de bienes, etc.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;

public class practica33 {

    public static void main(String[] args) {
        int suspenso=0, suficiente=0, bien=0, notable=0, sobresaliente=0;
        
        // Empezamos a crear el interior del programa
        for (int i = 1; i <= 20; i++) {
            int nota = (int) (Math.random()*11);
            System.out.print("Nota número "+i+": "+nota);
            
//            if (nota <= 4) {
//                System.out.println(" --> SUSPENSO");
//                suspenso++;
//            } else {
//                if (nota <= 5) {
//                    System.out.println(" --> SUFICIENTE");
//                    suficiente++;
//                } else {
//                    if (nota <= 7) {
//                    System.out.println(" --> BIEN");
//                    bien++;
//                    } else {
//                        if (nota <= 9) {
//                        System.out.println(" --> NOTABLE");
//                        notable++;
//                        } else {
//                            System.out.println(" --> SOBRESALIENTE");
//                            sobresaliente++;
//                        }
//                    }
//                }
//           }    

            switch (nota) {
            case 0,1,2,3,4: System.out.println(" --> SUSPENSO");
            suspenso++;
            break;
            case 5: System.out.println(" --> SUFICIENTE");
            suficiente++;
            break;
            case 6,7: System.out.println(" --> BIEN");
            bien++;
            break;
            case 8,9: System.out.println(" --> NOTABLE");
            notable++;
            break;
            case 10: System.out.println(" --> SOBRESALIENTE");
            sobresaliente++;
            break;
            }
            
        }
        System.out.println("-------------------------------------------");
        System.out.println("Número de suspensos alcanzados: "+suspenso);
        System.out.println("Número de suficientes alcanzados: "+suficiente);
        System.out.println("Número de bien alcanzados: "+bien);
        System.out.println("Número de notables alcanzados: "+notable);
        System.out.println("Número de sobresalientes alcanzados: "+sobresaliente);
        System.out.println("-------------------------------------------");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘