
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 18 mar 2026     ⏰ Hora: 12:14:38
 *
 *  Nombre del programa : Ejercicio08
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package ejercicio08;

public class Main {

    public static void main(String[] args) {
        
        // Crear objetos
        Libro libro1 = new Libro("123456789", "El Quijote", "1605");
        Revista revista1 = new Revista("987654321", "National Geographic", "2024");
        Publicacion pub1 = new Publicacion("111222333", "Enciclopedia", "2010");
        
        // Imprimir datos iniciales
        System.out.println("=== ESTADO INICIAL ===");
        libro1.imprimir();
        revista1.imprimir();
        pub1.imprimir();
        
        System.out.println("\n=== PRUEBA DE PRÉSTAMOS ===");
        
        // Prestar libro
        libro1.presta();
        libro1.estaPrestado();
        
        // Intentar prestar otra vez (error)
        libro1.presta();
        
        // Devolver libro
        libro1.devuelve();
        libro1.estaPrestado();
        
        // Devolver otra vez (error)
        libro1.devuelve();
        
        System.out.println("\n=== PRUEBA REVISTA ===");
        
        // Prestar revista
        revista1.presta();
        revista1.estaPrestado();
        
        // Imprimir estado final
        System.out.println("\n=== ESTADO FINAL ===");
        libro1.imprimir();
        revista1.imprimir();
        pub1.imprimir();

    } //main()

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘