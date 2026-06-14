/***************************************** Ejemplo 1: verCentros.sql *****************************************/
DELIMITER $$
DROP PROCEDURE IF EXISTS empresa.vercentros
$$
CREATE PROCEDURE empresa.vercentros()
BEGIN
select * from empresa.TCENTR;
END;
$$

/* • Para incorporar esta rutina al servidor:*/
use empresa;
source /ruta/verCentros.sql;

/* • Para ejecutar el procedimiento se usa la orden CALL (en cualquiera de las dos formas siguientes):*/
use empresa;
call vercentros();
call empresa.vercentros();


/* • Para ver una rutina almacenada:
SHOW CREATE { PROCEDURE | FUNCTION } nombre_rutina;
SHOW { PROCEDURE | FUNCTION } STATUS;*/
use empresa;
show create procedure vercentros;

/* • Para borrar una rutina:
DROP { PROCEDURE | FUNCTION } [IF EXISTS] nombre_rutina;*/
USE empresa;
DROP PROCEDURE IF EXISTS verCentros;

/* • La sintaxis de las instrucciones condicionales:
SintaxisIF-THEN-ELSE
IF expr1 THEN
	...
[ELSEIF expr2 THEN
	...]
[ELSE
	...]
END IF;
NOTA:Se pueden encadenar varios ELSEIF consecutivos.
SintaxisCASE
CASE expr1
	WHEN valor THEN ...
	[WHEN valor THEN ...]
	[ELSE ...]
END CASE;
•Nota:Los puntos suspensivos representan órdenes o sentencias. */

/***************************************** Ejemplo 2: verSalarios.sql *****************************************/
CREATE FUNCTION empresa.verSalarios (paramEntrada CHAR(1))
RETURNS INT
DETERMINISTIC
READS SQL DATA
BEGIN
    DECLARE gastoTotal INT;
    IF paramEntrada ='S' THEN
        SELECT SUM(salar) INTO gastoTotal FROM empresa.TEMPLE;
    ELSEIF paramEntrada = 'C' THEN
        SELECT SUM(comis) INTO gastoTotal FROM empresa.TEMPLE;
    ELSEIF paramEntrada = 'T' THEN
        SELECT SUM(comis + salar) INTO gastoTotal FROM empresa.TEMPLE;
    ELSE
        SET gastoTotal = -1;
    END IF;
    RETURN gastoTotal;
END;

/*•Para ejecutar la función anterior:*/
use empresa;
select verSalarios('S');

/*•La sintaxis de las instrucciones condicionales:
SintaxisIF-THEN-ELSE*/
IF expr1 THEN sentencias;
ELSEIF expr2 THEN sentencias;
ELSE sentencias;
END IF;

/*SintaxisCASE*/
CASE expr1
	WHEN valor1 THEN sentencias;
	WHEN valor2 THEN sentencias;
	ELSE sentencias;
END CASE;

/***************************************** Ejemplo 3: esNumPar.sql *****************************************/
DELIMITER $$
CREATE FUNCTION esNumPar (numero INT)
RETURNS INT
DETERMINISTIC
NO SQL
BEGIN
    DECLARE esPar INT;
    IF MOD(numero, 2) = 0 THEN SET esPar = 1;
    ELSE SET esPar = 0;
    END IF;
    RETURN esPar;
END $$

DELIMITER ;

/***************************************** Ejemplo 4: paridadFrase.sql *****************************************/
DELIMITER $$
DROP PROCEDURE IF EXISTS paridadFrase; $$
CREATE PROCEDURE paridadFrase(in numero INT)
BEGIN
	IF ( esNumPar (numero) ) THEN
	select concat (numero, " es par.");
	ELSE select concat (numero, " es impar.");
	END IF;
END; $$

/***************************************** Ejemplo 5: creaFestivos.sql *****************************************/
DROP DATABASE IF EXISTS FESTIVOS;
CREATE DATABASE FESTIVOS;
use FESTIVOS;
CREATE TABLE festividad
( 
	DIA TINYINT UNSIGNED NOT NULL,
	MES TINYINT UNSIGNED NOT NULL,
	ANIO SMALLINT UNSIGNED NOT NULL,
	DIASEM CHAR(15) NOT NULL,
	NOMFIESTA VARCHAR(50) NOT NULL,
	PRIMARY KEY(ANIO, MES, DIA)
) engine=InnoDB;

/***************************************** Ejemplo 6: insertaFiesta.sql *****************************************/
DELIMITER $$
DROP PROCEDURE IF EXISTS insertaFiesta $$
CREATE PROCEDURE insertaFiesta
(IN dia TINYINT UNSIGNED,
IN mes TINYINT UNSIGNED,
IN fiesta VARCHAR(50))
BEGIN
	DECLARE nombreDia CHAR(15);
	DECLARE diaSemana TINYINT;
	DECLARE anio SMALLINT;
	DECLARE fecha CHAR(20);
	/* anio 4 DIGITOS */
	SET anio = DATE_FORMAT ( CURRENT_DATE(), '%Y');
	IF dia > 0 AND dia < 32 AND mes > 0 AND mes < 13 THEN
	SET fecha = CONCAT (anio, "-", mes, "-", dia);
	SET diaSemana = DATE_FORMAT( TIMESTAMP(fecha), '%w');
	CASE diaSemana
		WHEN 0 THEN SET nombreDia ="Domingo";
		WHEN 1 THEN SET nombreDia ="Lunes";
		WHEN 2 THEN SET nombreDia ="Martes";
		WHEN 3 THEN SET nombreDia ="Miercoles";
		WHEN 4 THEN SET nombreDia ="Jueves";
		WHEN 5 THEN SET nombreDia ="Viernes";
		WHEN 6 THEN SET nombreDia ="Sabado";
	END CASE;
	INSERT INTO festividad
	values (dia, mes, anio, nombreDia, fiesta);
	select * from festividad;
	ELSE SELECT 'DIA INCORRECTO';
	END IF;
END;$$
