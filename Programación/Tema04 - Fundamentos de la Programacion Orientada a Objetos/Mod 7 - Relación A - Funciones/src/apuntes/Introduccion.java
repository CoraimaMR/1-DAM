/****************************** INTRODUCCIÓN ***********************************
1. CLASE. 
    - Molde que se utiliza para crear un objeto.
    - No es un objeto.
    - Determina el comportamiento y la estructura de un objeto.

2. OBJETO. 
    - Cualquier cosa sobre la que podemos emitir un concepto. 
    - No tiene por qué ser tangible. 
    - A nivel de programación, se pueden crear representaciones de ese objeto.
    - Consta de una parte ESTRUCTURAL (propiedades o atributos) 
    - Y otra de COMPORTAMIENTO (métodos).
    - Los objetos siguen la notación camelCase.

3. PROGRAMACIÓN ORIENTADA A OBJETOS
    - Paradigma de programación que nos sirve para estructurar un programa.
    - Los objetos interaccionan entre ellos mediante un paso de mensajes.
    - En Java, la declaración e implementación de una clase estará en un mismo fichero.
    - Las clases siguen notación UpperCamelCase.

4. ENCAPSULACIÓN.
    - Un objeto conoce solamente su propia estructura, no la de los demás.

5. INSTANCIACIÓN.
    - Proceso mediante el cual se utiliza una clase para construir un objeto.
    - Sintasis:        
        Clase nombreObjeto = new Clase();            
            new: operador de instanciación
            Clase(): constructor

6. PASO DE MENSAJES.
    - Forma de interacción de objetos.
    - Un método invoca a otro perteneciente a otra clase:
        objeto.metodo1();
        objeto.metodo2();
        etc

7. MODIFICADORES DE ACCESO.
    - Nos permiten indicar quién puede hacer uso de una clase, atributos o métodos.
    - public: cualquiera.
    - private: sólo la propia clase.
    - protected: la propia clase y sus derivados (herencia).
    - por defecto: las clases cercanas (las que están en el mismo paquete)

*******************************************************************************/