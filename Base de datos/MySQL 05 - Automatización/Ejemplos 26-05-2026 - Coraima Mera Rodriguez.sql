/************* AUTOMATIZACIÓN EJEMPLOS 26/05/2026 **************
Curso: 1º DAM
Nombre: Coraima Mera Rodriguez
***************************************************************/

/* Ejemplo 14: ejemploCursor2.sql */

DELIMITER $$
/* Si el procedimiento ya existe, lo elimina para evitar duplicados o conflictos */
DROP PROCEDURE IF EXISTS ejemploCursor2 ; $$
/* Crea el procedimiento almacenado llamado ejemploCursor2 */
CREATE PROCEDURE ejemploCursor2()
BEGIN
/* Declaración de variables locales para control del bucle y almacenamiento de datos */
/* ultimaFila se inicializa en 0 (Falso) por defecto */
DECLARE ultimaFila BOOL DEFAULT 0;
DECLARE vNombre VARCHAR(50);
DECLARE vLongitud SMALLINT;
DECLARE vPais VARCHAR(30);

/* Declaración del cursor: Selecciona el nombre, longitud y país de todos los circuitos ordenados alfabéticamente */
DECLARE cursorCircuito CURSOR FOR
SELECT NOMBRE, LONGITUD, PAIS FROM TCIRCUITO ORDER BY 1;

/* Manejador de error: Cuando el cursor se queda sin filas (NOT FOUND), cambia ultimaFila a -1 */
DECLARE CONTINUE HANDLER FOR NOT FOUND SET ultimaFila = -1;

/* Abre el cursor de circuitos para cargar el conjunto de resultados en memoria */
OPEN cursorCircuito;

/* Inicia un bucle de tipo LOOP sin condición de salida interna directa */
bucleCircuito: LOOP
/* Extrae los datos de la fila actual y los almacena en las variables correspondientes */
FETCH cursorCircuito INTO vNombre, vLongitud, vPais;
/* Condición de salida: Si el manejador detecta que no hay más filas (-1), rompe y sale del bucle */
IF ultimaFila = -1 THEN
LEAVE bucleCircuito;
END IF;
/* Muestra los datos de la fila actual. Convierte la longitud de metros a kilómetros dividiendo entre 1000 */
select vNombre, vLongitud/1000, vPais;
END LOOP bucleCircuito;

/* Cierra el cursor para liberar los recursos del sistema */
CLOSE cursorCircuito;

/* Realiza una consulta directa final que muestra los circuitos con longitud superior a 5000 metros */
SELECT NOMBRE,LONGITUD FROM TCIRCUITO WHERE LONGITUD >5000;
END;$$


/* Ejemplo 17: insertaPilotoV2.sql */

DELIMITER $$
/* Si el procedimiento ya existe, lo elimina para evitar duplicados o conflictos */
DROP PROCEDURE IF EXISTS insertaPilotoV2; $$
/* Crea el procedimiento almacenado llamado insertaPilotoV2 con parámetros de entrada y uno de salida */
CREATE PROCEDURE insertaPilotoV2( nombrePiloto VARCHAR(30),
nombrePais VARCHAR(30) ,
fchNac CHAR(10),
OUT estado VARCHAR(45) )
/* Indica que el procedimiento realizará operaciones de escritura o modificación en la base de datos */
MODIFIES SQL DATA
BEGIN
/* Manejador de error: Si ocurre el error 1062 (clave duplicada), asigna el mensaje 'Duplicate Entry' a la variable estado */
DECLARE CONTINUE HANDLER FOR 1062 SET estado ='Duplicate Entry';
/* Inicializa el parámetro de salida con el valor 'OK' por defecto */
SET estado='OK';
/* Inserta los datos del piloto. Convierte la cadena de texto de la fecha a formato DATE usando la máscara de día/mes/año */
INSERT INTO TPILOTO (NOMBRE, PAIS, FCH_NACIMIENTO)
VALUES (nombrePiloto, nombrePais,
str_to_date ( fchNac, '%d/%m/%Y') );
/* Condicional: Evalúa si el manejador interceptó una inserción duplicada durante la ejecución */
IF estado ='Duplicate Entry' THEN
/* Si está duplicado, muestra un mensaje de advertencia personalizado con el nombre del piloto */
SELECT CONCAT ('Aviso: Piloto repetido ', nombrePiloto)
AS warning;
/* Si la inserción fue exitosa, realiza una consulta para mostrar la tabla completa de pilotos actualizada */
ELSE SELECT * FROM TPILOTO;
END IF;
END; $$
DELIMITER ;

call insertaPilotoV2("PALOMA PERE","CUBA","01/01/2000", @estado);
call insertaPilotoV2 ("FERNANDO ALONSO", "CUBA","01/01/1990", @estado);