
/*************** PROBLEMAS 7 ***************
Curso: 1º DAM
Nombre: Coraima Mera Rodriguez
*******************************************/

/*BDD EMPRESA
R1 = TCENTR (NUMCE, NOMCE, SENAS)
R2 = TDEPTO (NUMDE, NUMCE (FK1), DIREC, TIDIR, PRESU, DEPDE (FK2), NOMDE)
R3 = TEMPLE (NUMEM, NUMDE (FK2), EXTEL, FECNA, FECIN, SALAR, COMIS, NUMHI, NOMEM)*/

use empresa;

/* 7.1.- Reducir en un 20 % el presupuesto de los departamentos que dependan del
departamento 100. */
UPDATE TDEPTO
SET PRESU = PRESU * 0.80
WHERE DEPDE = 100;

/* 7.2.- Subir un 5% el salario a los trabajadores que tengan 1 hijo, un 6% a los que
tengan 2 hijos y un 7 % a los que tengan 3 o más hijos. */
UPDATE TEMPLE
SET SALAR =
CASE
    WHEN NUMHI = 1 THEN SALAR * 1.05
    WHEN NUMHI = 2 THEN SALAR * 1.06
    WHEN NUMHI >= 3 THEN SALAR * 1.07
    ELSE SALAR
END;

/* 7.3.- Establecer comisión = 300 a todos aquellos que tengan comisión desconocida. */
UPDATE TEMPLE
SET COMIS = 300
WHERE COMIS IS NULL;

/* 7.4.- Anteponerle al nombre de los empleados la cadena “D. “ . El campo NOMEM
contiene en 1º lugar el apellido, seguido de una coma y, al final, el nombre.
Crear en la base de datos "empresa" la tabla TEMPLE2, con la
misma estructura que la tabla TEMPLE. */
UPDATE TEMPLE
SET NOMEM = CONCAT('D. ', NOMEM);

DROP TABLE IF EXISTS mayorDe3;
CREATE TABLE TEMPLE2
( NUMEM INT NOT NULL PRIMARY KEY,
NUMDE SMALLINT NOT NULL,
EXTEL SMALLINT NOT NULL CHECK (EXTEL >=200),
CHECK (EXTEL <=910),
FECNA DATE NOT NULL CHECK (FECNA > '1949-01-01' ),
FECIN DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
SALAR DECIMAL (4,0) NOT NULL,
COMIS DECIMAL (4,0),
NUMHI TINYINT NOT NULL,
NOMEM VARCHAR(100) NOT NULL,
CONSTRAINT fk_tdpto2
FOREIGN KEY (NUMDE) REFERENCES TDEPTO (NUMDE)
ON DELETE CASCADE ON UPDATE CASCADE);

/* 7.5.- Insertar en TEMPLE2 todos los registros de la tabla TEMPLE
correspondientes a los empleados que no tiene comisión.  */
INSERT INTO TEMPLE2
SELECT *
FROM TEMPLE
WHERE COMIS IS NULL;

/* 7.6.- Insertar en TEMPLE2 todos los registros de la tabla TEMPLE
correspondientes a los empleados que tienen comisión y que pertenezcan a un
departamento con un presupuesto superior a 105000.
Supón que TEMPLE2 tiene misma estructura y los mismos datos que TEMPLE. */
INSERT INTO TEMPLE2
SELECT *
FROM TEMPLE
WHERE COMIS IS NOT NULL 
AND NUMDE IN (
SELECT NUMDE 
FROM TDEPTO
WHERE PRESU > 105000
);

/* 7.7.- Borrar de la tabla TEMPLE2 a todos aquellos empleados que tengan más de 4
hijos y que trabajen en un departamento cuyo centro esté situado en la vía (calle o
avenida) 'ALCALA'. Nota: La columna SENAS de la tabla TCENTR contiene el
nombre de la calle, el número y la ciudad. */
DELETE FROM TEMPLE2
WHERE NUMHI > 4
AND NUMDE IN (
SELECT D.NUMDE
FROM TDEPTO D
JOIN TCENTR C ON D.NUMCE = C.NUMCE
WHERE C.SENAS LIKE '%ALCALA%'
);

/* 7.8.- Insertar en la tabla TCENTR un nuevo centro con número de centro 30 y
nombre “PROCESO DE DATOS”. La dirección se establece la que tiene por
defecto en la definición de la tabla. */
INSERT INTO TCENTR (NUMCE, NOMCE)
VALUES (30, 'PROCESO DE DATOS');

/*7.9.- La tabla TEMPLE2 tiene la misma estructura que TEMPLE y está vacía (no
contiene ninguna fila). Insertar en TEMPLE2 una fila por cada empleado cuyo
salario total (salario + comisión) supere al salario total medio de su departamento.
Interpretación 1: Media con respecto a los que tienen comisión.
Interpretación 2: Media con respecto al total de empleados de un departamento. 
NOTA 1: Supón que la tabla TEMPLE2, tiene la misma estructura y los
mismos datos que la tabla TEMPLE. */
INSERT INTO TEMPLE2
SELECT *
FROM TEMPLE E
WHERE (SALAR + NVL(COMIS, 0)) >
(SELECT AVG(SALAR + COMIS)
FROM TEMPLE
WHERE NUMDE = E.NUMDE
AND COMIS IS NOT NULL);

/* 7.10.- (Considerando NOTA 1). Borrar en TEMPLE2 a los empleados cuyo salario
(sin incluir comisión) supere al salario medio de los empleados de su
departamento. */
DELETE FROM TEMPLE2
WHERE SALAR > (
SELECT AVG(SALAR)
FROM TEMPLE
WHERE TEMPLE.NUMDE = TEMPLE.NUMDE
);

/* 7.11.- (Considerando NOTA 1). Borrar en TEMPLE2 a los empleados cuyo salario
(sin incluir comisión) supere al salario medio de los empleados de su
departamento, excluyéndole a él mismo en el cálculo del salario medio. */
DELETE FROM TEMPLE2
WHERE SALAR >
(SELECT AVG(SALAR)
FROM TEMPLE2
WHERE NUMDE = E.NUMDE
AND EMPLE <> E.EMPLE);

/* 7.12.- (Considerando NOTA 1). A los empleados que tengan comisión en TEMPLE2,
actualizar el salario añadiéndole la comisión, y poner luego Nulo en la comisión. */
UPDATE TEMPLE2
SET SALAR = SALAR + NVL(COMIS, 0),
COMIS = NULL
WHERE COMIS IS NOT NULL;

/* 7.13.- (Considerando NOTA 1). Disminuir en TEMPLE2 en un 5% el salario de los
empleados que superan el 50 % del salario máximo de su departamento. */
UPDATE TEMPLE2 E
SET SALAR = SALAR * 0.95
WHERE SALAR >
(SELECT MAX(SALAR) * 0.5
FROM TEMPLE2
WHERE NUMDE = E.NUMDE);

/* 7.14.- (Considerando NOTA 1). Crear una tabla PREJUBIL con la misma estructura
y los mismos datos que TEMPLE2. Implementad una transacción con las
siguientes operaciones: Insertar en PREJUBIL todos las tuplas correspondientes a
los empleados que en el día de hoy tiene más de 50 años. Luego, borrar de
TEMPLE2 las tuplas de dichos empleados. Por último, confirmar la transacción. */
CREATE TABLE PREJUBIL AS
SELECT *
FROM TEMPLE2;

START TRANSACTION;

INSERT INTO PREJUBIL
SELECT *
FROM TEMPLE2
WHERE TIMESTAMPDIFF(YEAR, FECNA, CURDATE()) > 50;

DELETE FROM TEMPLE2
WHERE TIMESTAMPDIFF(YEAR, FECNA, CURDATE()) > 50;

COMMIT;

/* 7.15.- (Considerando NOTA 1). En TEMPLE2, aumentar el salario de los empleados
del departamento 111 en un 10% si no tienen ingresos por comisiones y en un 5%
si cobran comisión. */
UPDATE TEMPLE2
SET SALAR =
CASE
WHEN COMIS IS NULL THEN SALAR * 1.10
ELSE SALAR * 1.05
END
WHERE NUMDE = 111;

/* 7.16.- Lista (de la tabla TTIPOCOCHES) las marcas de coches y el total de ventas
que tiene cada una teniendo en cuenta todos sus modelos. El listado debe ir
ordenado de mayor a menor número de ventas.
En la cabecera debe aparecer (o sea, las columnas a mostrar)
MARCA TOTAL_VENTAS */
SELECT MARCA,
SUM(VENTAS) AS TOTAL_VENTAS
FROM TTIPOCOCHES
GROUP BY MARCA
ORDER BY TOTAL_VENTAS DESC;

/* 7.17.- Muestra cuántos modelos hay en la tabla TTIPOCOCHES de la marca
PEUGEOT. */
SELECT COUNT(*) AS TOTAL_MODELOS
FROM TTIPOCOCHES
WHERE MARCA = 'PEUGEOT';

/* 7.18.- Lista los registros de la tabla TTIPOCOCHES de la marca que tenga el mayor
número de ventas. En la cabecera debe aparecer (o sea, las columnas a mostrar):
MARCA MODELO VENTAS */
SELECT MARCA, MODELO, VENTAS
FROM TTIPOCOCHES
WHERE MARCA = (
SELECT MARCA
FROM TTIPOCOCHES
GROUP BY MARCA
ORDER BY SUM(VENTAS) DESC
LIMIT 1
);

/* 7.19.- Muestra la media de unidades vendidas (matemáticamente se resuelve
dividiendo la suma global de ventas por el número total de registros -o sea, el
número de modelos-). NOTA: Usar la función de columna AVG().
En la cabecera debe aparecer VENTAS_MEDIAS */
SELECT AVG(VENTAS) AS VENTAS_MEDIAS
FROM TTIPOCOCHES;