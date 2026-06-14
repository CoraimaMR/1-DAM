/**************************** PROBLEMAS 7 *****************************/

/*BDD FORMULA1
R1 = TCIRCUITO (CODIGO, ORDEN# , NOMBRE# , LONGITUD,
SENTIDOGIRO, CURVASIZQDA, CURVASDCHA, LOCALIDAD, REGION*, PAIS)
R2 = TPILOTO (NOMBRE, PAIS, FCH_NACIMIENTO * )
R3 = TCARRERA (FECHA, NOMBRE, VUELTAS*, DISTANCIATOTAL*, CODCIRCUITO (FK1))
R4 = TCOMPITE (FECHA (FK3), PUESTOLLEGADA, NUMAUTO ,
NOMBREPILOTO (FK2), EQUIPO, VUELTAS, TPOCARRERA,
PUESTOPARRILLA, PUNTOSCARRERA )*/

use formula1;

/*7.1.- Obtén un listado de la temporada 2013 en el que aparezca el nombre del
piloto, su país de origen y su escudería.*/
SELECT p.NOMBRE, p.PAIS, c.EQUIPO
FROM TPILOTO p
JOIN TCOMPITE c ON p.NOMBRE = c.NOMBREPILOTO
WHERE YEAR(c.FECHA) = 2013;

/*7.2.- Obtén la fecha de cada carrera del año 2012, la distancia total a recorrer y
el nombre del circuito junto al país donde se encuentra.*/
SELECT ca.FECHA, ca.DISTANCIATOTAL, ci.NOMBRE, ci.PAIS
FROM TCARRERA ca
JOIN TCIRCUITO ci ON ca.CODCIRCUITO = ci.CODIGO
WHERE YEAR(ca.FECHA) = 2012;

/*7.3.- Obtén los nombres de los pilotos y su fecha de nacimiento, que
participaron en la carrera del día 4 de Noviembre de 2012, ordenado desde el
más joven al más viejo.*/
SELECT p.NOMBRE, p.FCH_NACIMIENTO
FROM TPILOTO p
JOIN TCOMPITE c ON p.NOMBRE = c.NOMBREPILOTO
WHERE c.FECHA = '2012-11-04'
ORDER BY p.FCH_NACIMIENTO DESC;

/*7.4.- Obtén la fecha de la carrera, los nombres de los pilotos y su fecha de
nacimiento, de los que participaron en la última carrera del mes de
Noviembre de 2012, ordenado desde el más joven al más viejo.*/
SELECT c.FECHA, p.NOMBRE, p.FCH_NACIMIENTO
FROM TPILOTO p
JOIN TCOMPITE t ON p.NOMBRE = t.NOMBREPILOTO
JOIN TCARRERA c ON t.FECHA = c.FECHA
WHERE c.FECHA = (
    SELECT MAX(FECHA)
    FROM TCARRERA
    WHERE YEAR(FECHA)=2012 AND MONTH(FECHA)=11
)
ORDER BY p.FCH_NACIMIENTO DESC;

/*7.5.- Obtén la fecha de la carrera y el nombre de la misma, y los nombres de los
pilotos y su fecha de nacimiento, de los que participaron en la primera
carrera de 2012, ordenado alfabéticamente por nombre de piloto.*/
SELECT c.FECHA, c.NOMBRE, p.NOMBRE, p.FCH_NACIMIENTO
FROM TPILOTO p
JOIN TCOMPITE t ON p.NOMBRE = t.NOMBREPILOTO
JOIN TCARRERA c ON t.FECHA = c.FECHA
WHERE c.FECHA = (
    SELECT MIN(FECHA)
    FROM TCARRERA
    WHERE YEAR(FECHA)=2012
)
ORDER BY p.NOMBRE;

/*7.6.- Obtén la fecha de la carrera, el nombre de la carrera, las vueltas a dar, la
distancia total y el nombre del circuito de la última carrera de 2012.*/
SELECT c.FECHA, c.NOMBRE, c.VUELTAS, c.DISTANCIATOTAL, ci.NOMBRE
FROM TCARRERA c
JOIN TCIRCUITO ci ON c.CODCIRCUITO = ci.CODIGO
WHERE c.FECHA = (
    SELECT MAX(FECHA)
    FROM TCARRERA
    WHERE YEAR(FECHA)=2012
);

/*7.7.- Obtén la fecha de la carrera, el nombre del circuito y los nombres de los
pilotos que participaron en la última carrera de 2012, ordenado
alfabéticamente por nombre de piloto.*/
SELECT c.FECHA, ci.NOMBRE, p.NOMBRE
FROM TPILOTO p
JOIN TCOMPITE t ON p.NOMBRE = t.NOMBREPILOTO
JOIN TCARRERA c ON t.FECHA = c.FECHA
JOIN TCIRCUITO ci ON c.CODCIRCUITO = ci.CODIGO
WHERE c.FECHA = (
    SELECT MAX(FECHA)
    FROM TCARRERA
    WHERE YEAR(FECHA)=2012
)
ORDER BY p.NOMBRE;

/*7.8.- Lista la fecha, el puesto de llegada, la distancia que recorrió, y el nombre
del circuito, respecto a las carreras en las que participó Fernando Alonso en
el 2012.*/
SELECT t.FECHA, t.PUESTOLLEGADA, t.VUELTAS, ci.NOMBRE
FROM TCOMPITE t
JOIN TCARRERA c ON t.FECHA = c.FECHA
JOIN TCIRCUITO ci ON c.CODCIRCUITO = ci.CODIGO
WHERE t.NOMBREPILOTO = 'Fernando Alonso'
AND YEAR(t.FECHA)=2012;

/*BDD EMPRESA
R1 = TCENTR (NUMCE, NOMCE, SENAS)
R2 = TDEPTO (NUMDE, NUMCE (FK1), DIREC, TIDIR, PRESU, DEPDE (FK2), NOMDE)
R3 = TEMPLE (NUMEM, NUMDE (FK2), EXTEL, FECNA, FECIN, SALAR, COMIS, NUMHI, NOMEM)*/

use empresa;

/*7.9.- Determinar los nombres de los departamentos que tienen un presupuesto
superior a 100.000 euros, así como el nombre del centro de trabajo donde se
encuentran ubicados, clasificados por orden alfabético.*/
SELECT d.NOMDE, c.NOMCE
FROM TDEPTO d
JOIN TCENTR c ON d.NUMCE = c.NUMCE
WHERE d.PRESU > 100000
ORDER BY d.NOMDE;

/*7.10.- Para cada departamento con presupuesto inferior a 60.000 euros, mostrar
su número y su nombre junto con el nombre del centro donde está ubicado y
el máximo salario de sus empleados, si éste excede a 2000 euros. Clasificar
alfabéticamente por nombre de departamento.*/
SELECT d.NUMDE, d.NOMDE, c.NOMCE, MAX(e.SALAR) AS MAX_SALARIO
FROM TDEPTO d
JOIN TCENTR c ON d.NUMCE = c.NUMCE
JOIN TEMPLE e ON d.NUMDE = e.NUMDE
WHERE d.PRESU < 60000
GROUP BY d.NUMDE, d.NOMDE, c.NOMCE
HAVING MAX(e.SALAR) > 2000
ORDER BY d.NOMDE;

/*7.11.- Obtener los departamentos que dependen de los que tienen un
presupuesto inferior a 50.000 euros. Incluir en el listado: los números y los
nombres de los departamentos (ordenados alfabéticamente) que se piden, así
como el número y el nombre del que dependen, además del presupuesto de
éstos.*/
SELECT d1.NUMDE, d1.NOMDE, d2.NUMDE AS DEPENDE_DE, d2.NOMDE AS NOMBRE_DEP, d2.PRESU
FROM TDEPTO d1
JOIN TDEPTO d2 ON d1.DEPDE = d2.NUMDE
WHERE d2.PRESU < 50000
ORDER BY d1.NOMDE;

/*7.12.- Si es verdad que el departamento 112 está ubicado en la calle Atocha,
listar el nombre de dicho departamento, el número de su centro y su
presupuesto.*/
SELECT NOMDE, NUMCE, PRESU
FROM TDEPTO
WHERE NUMDE = 112
AND DIREC = 'Atocha';

/*7.13.- Si es verdad que el departamento 122 está ubicado en la calle de Alcalá,
obtener por orden alfabético los nombres de aquellos de sus empleados cuyo
salario supere al salario medio de su departamento.*/
SELECT e.NOMEM
FROM TEMPLE e
WHERE e.NUMDE = 122
AND e.SALAR > (
    SELECT AVG(SALAR)
    FROM TEMPLE
    WHERE NUMDE = 122
)
ORDER BY e.NOMEM;

/*7.14.- Obtener por orden alfabético los nombres y salarios medios de los
departamentos cuyo salario medio supera al salario medio de la empresa.*/
SELECT d.NOMDE, AVG(e.SALAR) AS SALARIO_MEDIO
FROM TDEPTO d
JOIN TEMPLE e ON d.NUMDE = e.NUMDE
GROUP BY d.NOMDE
HAVING AVG(e.SALAR) > (
    SELECT AVG(SALAR)
    FROM TEMPLE
)
ORDER BY d.NOMDE;

/*7.15.- Mostrar por orden alfabético los nombres de los departamentos ubicados
en la calle Atocha.*/
SELECT NOMDE
FROM TDEPTO
WHERE DIREC = 'Atocha'
ORDER BY NOMDE;

/*7.16.- Obtener por orden alfabético los nombres y el correspondiente
presupuesto de los departamentos cuyo presupuesto es inferior a la mitad de
la suma de los salarios anuales (14 pagas del salario) de sus empleados.*/
SELECT d.NOMDE, d.PRESU
FROM TDEPTO d
JOIN TEMPLE e ON d.NUMDE = e.NUMDE
GROUP BY d.NOMDE, d.PRESU
HAVING d.PRESU < (SUM(e.SALAR * 14) / 2)
ORDER BY d.NOMDE;

/*7.17.- Obtener por orden alfabético los nombres de los empleados cuyo salario
supera en un 40% al salario medio de su departamento.*/
SELECT e.NOMEM
FROM TEMPLE e
WHERE e.SALAR > (
    SELECT AVG(SALAR) * 1.4
    FROM TEMPLE
    WHERE NUMDE = e.NUMDE
)
ORDER BY e.NOMEM;

/*7.18.- Obtener los números de empleado, salario y media de salarios del
departamento al que pertenecen, para aquellos empleados cuya comisión sea
de 1.100 €.*/
SELECT e.NUMEM, e.SALAR,
(
    SELECT AVG(SALAR)
    FROM TEMPLE
    WHERE NUMDE = e.NUMDE
) AS MEDIA_DEP
FROM TEMPLE e
WHERE e.COMIS = 1100;

/*7.19.- Obtener un listado de los empleados del departamento 100, mostrando
nombre, salario y salario acumulado, por orden de salario.*/
SELECT NOMEM, SALAR,
SUM(SALAR) OVER (ORDER BY SALAR) AS SALARIO_ACUMULADO
FROM TEMPLE
WHERE NUMDE = 100
ORDER BY SALAR;

/*BDD TENIS
R1 = TENISTA ( NUMTEN, APELLIDO, NOMBRE, NACION, CIUDAD, PUESTO,
DESCRIPCION, FCHNAC )
R2 = ENTRENADOR (NUMENTR, APELLIDO, NOMBRE, NACION, FCHNAC,
CODTENISTA (FK1) )
R3 = NOMBRES_TORNEO ( CODIGO, NOMBRE, CATEGORIA )
R4 = TORNEO ( FECHA, CODTORNEO (FK3) , PREMIO )
R5 = PARTICIPA ( NUMTEN (FK1) , FECHA (FK4) , ORDEN )
*/

use tenis;

/*7.20.- Obtener información de los torneos en los que los tenistas
NADAL y VERDASCO se hayan enfrentado.
Mostrar: FECHA_TORNEO, NOMBRE_TORNEO, CATEGORIA
Ordenado por nombre del torneo*/
SELECT DISTINCT t.FECHA AS FECHA_TORNEO,
       nt.NOMBRE AS NOMBRE_TORNEO,
       nt.CATEGORIA
FROM TORNEO t
JOIN NOMBRES_TORNEO nt ON t.CODTORNEO = nt.CODIGO
JOIN PARTICIPA p1 ON t.FECHA = p1.FECHA
JOIN TENISTA te1 ON p1.NUMTEN = te1.NUMTEN
JOIN PARTICIPA p2 ON t.FECHA = p2.FECHA
JOIN TENISTA te2 ON p2.NUMTEN = te2.NUMTEN
WHERE te1.APELLIDO = 'NADAL'
  AND te2.APELLIDO = 'VERDASCO'
ORDER BY nt.NOMBRE;

/*7.21.- Lista información de los tenistas (de apellidos) NADAL y FEDERER y de los
torneos en que ambos se hayan enfrentado. Mostrar: TENISTA ORDEN FECHA
NOMBRE_TORNEO CATEGORÍA*/
SELECT CONCAT(te.APELLIDO, ' ', te.NOMBRE) AS TENISTA,
       p.ORDEN,
       t.FECHA,
       nt.NOMBRE AS NOMBRE_TORNEO,
       nt.CATEGORIA
FROM TENISTA te
JOIN PARTICIPA p ON te.NUMTEN = p.NUMTEN
JOIN TORNEO t ON p.FECHA = t.FECHA
JOIN NOMBRES_TORNEO nt ON t.CODTORNEO = nt.CODIGO
WHERE te.APELLIDO IN ('NADAL','FEDERER')
AND t.FECHA IN (
    SELECT t2.FECHA
    FROM TORNEO t2
    JOIN PARTICIPA p1 ON t2.FECHA = p1.FECHA
    JOIN TENISTA te1 ON p1.NUMTEN = te1.NUMTEN
    JOIN PARTICIPA p2 ON t2.FECHA = p2.FECHA
    JOIN TENISTA te2 ON p2.NUMTEN = te2.NUMTEN
    WHERE te1.APELLIDO='NADAL' AND te2.APELLIDO='FEDERER'
)
ORDER BY nt.NOMBRE;


/*7.22.- Lista información de los tenistas que participaron en los torneos en los
que ganó NADAL. Mostrar: TENISTA ORDEN FECHA NOMBRE_TORNEO CATEGORÍA*/
SELECT CONCAT(te.APELLIDO, ' ', te.NOMBRE) AS TENISTA,
       p.ORDEN,
       t.FECHA,
       nt.NOMBRE AS NOMBRE_TORNEO,
       nt.CATEGORIA
FROM TENISTA te
JOIN PARTICIPA p ON te.NUMTEN = p.NUMTEN
JOIN TORNEO t ON p.FECHA = t.FECHA
JOIN NOMBRES_TORNEO nt ON t.CODTORNEO = nt.CODIGO
WHERE t.FECHA IN (
    SELECT p2.FECHA
    FROM PARTICIPA p2
    JOIN TENISTA te2 ON p2.NUMTEN = te2.NUMTEN
    WHERE te2.APELLIDO = 'NADAL' AND p2.ORDEN = 1
)
ORDER BY t.FECHA, p.ORDEN;


/*7.23.- Lista información de los tenistas que han ganado los torneos, pero sólo
aquellos en los que NADAL terminó en segunda posición. Mostrar:
TENISTA FECHA NOMBRE_TORNEO CATEGORÍA*/
SELECT CONCAT(te.APELLIDO, ' ', te.NOMBRE) AS TENISTA,
       t.FECHA,
       nt.NOMBRE AS NOMBRE_TORNEO,
       nt.CATEGORIA
FROM TENISTA te
JOIN PARTICIPA p ON te.NUMTEN = p.NUMTEN
JOIN TORNEO t ON p.FECHA = t.FECHA
JOIN NOMBRES_TORNEO nt ON t.CODTORNEO = nt.CODIGO
WHERE p.ORDEN = 1
AND t.FECHA IN (
    SELECT p2.FECHA
    FROM PARTICIPA p2
    JOIN TENISTA te2 ON p2.NUMTEN = te2.NUMTEN
    WHERE te2.APELLIDO='NADAL' AND p2.ORDEN=2
)
ORDER BY t.FECHA;


/*7.24.- Lista los nombres completos de los actuales entrenadores de los
tenistas que alguna vez ganaron un torneo, así como el número de torneos
que ganaron. Mostrar: ENTRENADOR TENISTA TOTAL_GANADOS*/
SELECT CONCAT(e.APELLIDO, ' ', e.NOMBRE) AS ENTRENADOR,
       CONCAT(te.APELLIDO, ' ', te.NOMBRE) AS TENISTA,
       COUNT(*) AS TOTAL_GANADOS
FROM TENISTA te
JOIN ENTRENADOR e ON te.NUMTEN = e.CODTENISTA
JOIN PARTICIPA p ON te.NUMTEN = p.NUMTEN
WHERE p.ORDEN = 1
GROUP BY e.APELLIDO, e.NOMBRE, te.APELLIDO, te.NOMBRE;


/*7.25.- Lista la posición media de los puestos que ha alcanzado cada tenista.
Mostrar: TENISTA DISPUTADOS PUESTO_MEDIO*/
SELECT CONCAT(te.APELLIDO, ' ', te.NOMBRE) AS TENISTA,
       COUNT(*) AS DISPUTADOS,
       AVG(p.ORDEN) AS PUESTO_MEDIO
FROM TENISTA te
JOIN PARTICIPA p ON te.NUMTEN = p.NUMTEN
GROUP BY te.APELLIDO, te.NOMBRE
ORDER BY PUESTO_MEDIO;