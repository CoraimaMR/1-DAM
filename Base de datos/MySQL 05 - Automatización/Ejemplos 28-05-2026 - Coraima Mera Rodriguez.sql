/************* AUTOMATIZACIÓN EJEMPLOS 28/05/2026 **************
Curso: 1º DAM
Nombre: Coraima Mera Rodriguez
***************************************************************/

/* Ejemplo ejTrigger02.sql
Para no modificar la tabla original TEMPLE, crearemos una idéntica TEMPLE2 con los mismos datos. Le añadiremos una columna ERROR,
por defecto a 0.
Luego, creamos una tabla idéntica a TEMPLE2 vacía y le llamaremos TEMPLE_ERR .
mysql> CREATE TABLE TEMPLE2 LIKE TEMPLE;
mysql> INSERT TEMPLE2 SELECT * FROM TEMPLE;
mysql> ALTER TABLE TEMPLE2 ADD ERROR TINYINT NOT NULL DEFAULT 0;
mysql> CREATE TABLE TEMPLE_ERR LIKE TEMPLE2;
BDD empresa: Crear un trigger para ANTES de INSERTAR en TEMPLE2 de
modo que:
A) Si el nombre está en minúsculas lo pase a mayúsculas.
b) Si la fecha de nacimiento o la fecha de ingreso es
INCORRECTA se modifique el campo ERROR a 1 y además,
se grabe ese mismo registro en la tabla TEMPLE_ERR
con los mismos valores. */

use empresa;

DROP TABLE IF EXISTS TEMPLE2; 
DROP TABLE IF EXISTS TEMPLE_ERR; 

CREATE TABLE TEMPLE2 LIKE TEMPLE;
INSERT TEMPLE2 SELECT * FROM TEMPLE;
ALTER TABLE TEMPLE2 ADD ERROR TINYINT NOT NULL DEFAULT 0;
CREATE TABLE TEMPLE_ERR LIKE TEMPLE2;

DELIMITER $$
DROP TRIGGER IF EXISTS controlDatos $$

-- Creamos el trigger. Se ejecutará AUTOMÁTICAMENTE "ANTES" (BEFORE) de insertar un fila en la tabla TEMPLE2
CREATE TRIGGER controlDatos BEFORE INSERT ON TEMPLE2
FOR EACH ROW -- Se ejecuta de forma individual por cada fila nueva que intentes registrar
BEGIN
-- Declaramos una variable temporal para guardar el nombre procesado
DECLARE vNombre CHAR(80);
-- Quitamos espacios en blanco (TRIM) y pasamos a mayúsculas (UPPER) el nombre del nuevo empleado
SET vNombre = UPPER(TRIM(NEW.NOMEM));
-- Reemplazamos el nombre original con el nombre ya limpio y en mayúsculas
SET NEW.NOMEM = vNombre;

-- VALIDACIÓN: Revisamos si la fecha de nacimiento (FECNA) O la de ingreso (FECIN) están vacías o son nulas
IF dayofyear(NEW.FECNA) IS NULL or dayofyear(NEW.FECIN) IS NULL
THEN
    -- Si falta alguna fecha, marcamos la columna ERROR de este registro con el número 1
    SET NEW.ERROR = 1;
    -- Copiamos TODOS los datos del empleado fallido y los metemos en la tabla de errores (TEMPLE_ERR)
    INSERT INTO TEMPLE_ERR VALUES
    (NEW.NUMEM, NEW.NUMDE, NEW.EXTEL,
    NEW.FECNA, NEW.FECIN, NEW.SALAR,
    NEW.COMIS, NEW.NUMHI, NEW.NOMEM,
    NEW.ERROR);
    
END IF;
END; $$
DELIMITER ;

-- CONSULTA: Muestra en pantalla el nombre y la acción de todos los triggers creados en el sistema
SELECT trigger_name, action_statement FROM information_schema.triggers;
