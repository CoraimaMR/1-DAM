/**************************** PROBLEMAS 5 *****************************/

/*BDD EMPRESA
R1 = TCENTR (NUMCE, NOMCE, SENAS)
R2 = TDEPTO (NUMDE, NUMCE (FK1), DIREC, TIDIR, PRESU, DEPDE (FK2), NOMDE)
R3 = TEMPLE (NUMEM, NUMDE (FK2), EXTEL, FECNA, FECIN, SALAR, COMIS, NUMHI, NOMEM)*/

use empresa;

/*5.1.- Determinar para cada departamento el salario medio.*/
SELECT NUMDE AS DPTO, CAST(AVG(SALAR) AS DECIMAL(7,1)) AS SALARIO_MEDIO
FROM TEMPLE
GROUP BY NUMDE;

/*5.2.- Computar el número de empleados de los departamentos 100
y 110.*/
SELECT NUMDE, COUNT(*) AS TOTAL_EMPLEADOS 
FROM TEMPLE
GROUP BY NUMDE
HAVING NUMDE IN (100,110); 

/*5.3.- Obtener para cada departamento: el salario mínimo, el máximo
y la media aritmética de estos.*/
SELECT NUMDE, MIN(SALAR) AS SALARIO_MIN, MAX(SALAR) AS SALARIO_MAX,
	CAST((MIN(SALAR)+ MAX(SALAR))/2.0 AS DECIMAL(6,1) ) AS MEDIA
FROM TEMPLE
GROUP BY NUMDE;

/*5.4.- Listar, por departamentos, la edad en años cumplidos del
empleado más viejo del departamento que tiene comisión.
Ordenar el resultado por edades, de menor a mayor.*/
SELECT NUMDE, ROUND(MAX(DATEDIFF(CURDATE(), FECNA )/ 365.25)) AS EDAD
FROM TEMPLE
WHERE COMIS IS NOT NULL
GROUP BY NUMDE
ORDER BY 2;

/*5.5.- Conseguir, agrupados por departamento y por número de
hijos, cuántos empleados hay en cada grupo, para los
departamentos 100 y 110.*/
SELECT 	NUMDE AS DEPARTAMENTO, NUMHI AS NUM_HIJOS, COUNT(*) AS TOTAL_EMPLEADOS
FROM TEMPLE
GROUP BY  NUMDE , NUMHI
HAVING NUMDE IN (100,110);

/*5.6.- (MUY COMPLICADO) Mostrar, agrupando los salarios en
tramos de 1000 en 1000 euros, cuantos empleados hay en cada
tramo.*/
SELECT  FLOOR(SALAR/1000)*1000 AS INICIO,
		COUNT(*) AS TOTAL_EMPLEADOS
FROM TEMPLE
GROUP BY INICIO
ORDER BY INICIO;

/*5.7.- (COMPLICADO) Se va a dar una prima de 100 euros a los
empleados del departamento 111 y a los del 121. Agrupando
por salario total (salario+comisión), hallar para cada grupo la
suma del salario total más la prima, y el número de empleados.*/
SELECT SALAR + COALESCE(COMIS,0) AS SALARIO_TOTAL,
       SUM(SALAR + COALESCE(COMIS,0) + 100) AS SUMA_TOTAL,
       COUNT(*) AS NUMERO_EMPLEADOS
FROM TEMPLE
WHERE NUMDE IN (111,121)
GROUP BY SALAR + COALESCE(COMIS,0)
ORDER BY 1;

/*5.8.- Determinar el salario máximo y el mínimo para cada grupo de
empleados con igual número de hijos y que tienen al menos uno,
y sólo si hay más de un empleado en el grupo y el salario
mínimo de este excede a 2500 euros.*/
SELECT  COUNT(*) AS TOTAL_EMPLEADOS, NUMHI AS NUM_HIJOS, 
		MIN(SALAR) AS SALARIO_MIN,
		MAX(SALAR) AS SALARIO_MAX
FROM TEMPLE
WHERE NUMHI > 0
GROUP BY NUMHI
HAVING COUNT(*) > 1 AND MIN(SALAR) > 2500;

/*5.9.- (MUY COMPLICADO) Agrupando los salarios en tramos de 1000
en 1000 euros, hallar cuántos empleados hay en cada tramo.
Descartar los tramos de menos de 2000 euros y que tengan
menos de dos empleados.*/
SELECT FLOOR(SALAR/1000)*1000 AS INICIO,
		COUNT(*) AS TOTAL_EMPLEADOS
FROM TEMPLE
GROUP BY INICIO
HAVING INICIO >= 2000 AND COUNT(*) >= 2;

/*5.10.- Hallar el salario medio y la edad media en años para cada
grupo de empleados con igual comisión y para los que no la
tengan.*/
SELECT  COMIS AS COMISION, AVG(SALAR) AS SALARIO_MEDIO,
	AVG(DATEDIFF(CURDATE(), FECNA)/365.25 ) AS EDAD_MEDIA
FROM TEMPLE
GROUP BY COMIS;

/*5.11.- Para los departamentos en los que hay algún empleado cuyo
salario sea mayor que 4000 euros al mes, hallar el número de
empleados y la suma de sus salarios, comisiones y número de
hijos.*/
SELECT NUMDE, COUNT(*) AS TOTAL_EMPLEADOS, SUM(SALAR) AS TOTAL_SALARIOS,
		SUM(COMIS) AS TOTAL_COMISIONES,
		SUM(NUMHI) AS TOTAL_HIJOS
FROM TEMPLE 
GROUP BY NUMDE
HAVING MAX(SALAR) > 4000 ;

/*5.12.- (SUBCONSULTA) Para los departamentos en los que la
antigüedad media de sus empleados supera a la de la empresa,
hallar el salario mínimo, el medio y el máximo.*/
SELECT NUMDE, ROUND(AVG(DATEDIFF(CURDATE(), FECIN )/365.25)) AS EDAD_MEDIA,
		MIN(SALAR) AS MINIMO,
		ROUND(AVG(SALAR),2) AS MEDIO, 
		MAX(SALAR) AS MAXIMO
FROM TEMPLE
GROUP BY NUMDE
HAVING  AVG(DATEDIFF( CURDATE(), FECIN )/365.25 ) >
	(SELECT (AVG(DATEDIFF( CURDATE(), FECIN )/365.25 )) FROM TEMPLE);

/*5.13.- Para los departamentos en los que haya algún empleado con
más de 10 años de antigüedad y tales que la media de hijos por
cada uno de estos empleados sea superior a 1, hallar el salario
medio de estos empleados.*/
SELECT 	NUMDE AS NUMERO_DPTO, ROUND(DATEDIFF(CURDATE(), MIN(FECIN) )/365.25)
	AS ANTIGUEDAD_MAS_ANTIGUO, ROUND(AVG(NUMHI*1.0),1) AS MEDIA_HIJOS,
	ROUND(AVG(SALAR),2) AS SALARIO_MEDIO
FROM TEMPLE
GROUP BY NUMDE
HAVING DATEDIFF(CURDATE(), MIN(FECIN) )/365.25 > 10 AND AVG(NUMHI*1.0) > 1;

/*5.14.- Agrupando por número de hijos, hallar la media por hijo del
salario y la media por hijo de la comisión.*/
SELECT NUMHI AS NUMHI, ROUND(SUM(SALAR)/SUM(NUMHI),2) AS SALARIO_MEDIO_POR_HIJO,
	ROUND(SUM(COALESCE(COMIS,0))/SUM(NUMHI),2) AS COMISION_MEDIA_POR_HIJO
FROM TEMPLE
WHERE NUMHI <> 0
GROUP BY NUMHI;

/*5.15.- Para cada departamento, calcular la media de la comisión
con respecto a los empleados que la reciben y con respecto al
total de empleados.*/
SELECT 	NUMDE AS NUMERO_DPTO, ROUND(SUM(COMIS) / COUNT(COMIS),2) AS MEDIA_COMISION,
	ROUND(SUM(COMIS) / COUNT(*),2)  AS MEDIA_COMISION_TOTAL
FROM TEMPLE
GROUP BY NUMDE
HAVING COUNT(COMIS) > 0;

/*5.16.- Para cada extensión telefónica, hallar cuántos empleados la
usan y el salario medio de éstos.*/
SELECT EXTEL, COUNT(*) AS USUARIOS, ROUND(AVG(SALAR),2) AS SALARIO_MEDIO
FROM TEMPLE
GROUP BY EXTEL;

/*5.17.- Para cada extensión telefónica y cada departamento, obtener
cuántos empleados la usan y el salario medio de éstos.*/
SELECT EXTEL, NUMDE, COUNT(*) AS USUARIOS, ROUND(AVG(SALAR),2) AS SALARIO_MEDIO
FROM TEMPLE
GROUP BY NUMDE, EXTEL;

/*5.18.- Hallar los números de extensión telefónica mayores de los
diversos departamentos, sin incluir los números de éstos.*/
SELECT MAX(EXTEL) AS MAX_EXTENSION
FROM TEMPLE
GROUP BY NUMDE;

/*5.19.- Para cada extensión telefónica hallar el número de
departamentos a los que sirve.*/
SELECT EXTEL, COUNT(DISTINCT NUMDE)  
FROM TEMPLE 
GROUP BY EXTEL;

/*5.20.- (COMPLICADO) Para los departamentos en los que algún
empleado tiene comisión, hallar cuántos empleados hay en
promedio por cada extensión telefónica.*/
SELECT NUMDE AS NUMERO_DEPARTAMENTO,
	ROUND(CAST(COUNT(*) AS DECIMAL(3,1)) / COUNT(DISTINCT EXTEL),1) AS PROMEDIO
FROM TEMPLE
GROUP BY NUMDE
HAVING COUNT(COMIS) > 0
ORDER BY NUMDE;

/*5.21.- Para los empleados que tienen comisión, hallar para los
departamentos cuántos empleados hay en promedio por cada
extensión telefónica.*/
SELECT   NUMDE, ROUND(CAST( COUNT(*) AS DECIMAL(6, 3)) / COUNT(DISTINCT EXTEL),2)
	AS MEDIA_EMPLEADOS_POR_EXTENSION
FROM TEMPLE
WHERE COMIS IS NOT NULL
GROUP BY NUMDE	
ORDER BY NUMDE;

/*5.22.- (COMPLICADO) Obtener por orden creciente los números de
extensiones telefónicas de los departamentos que tienen más de
dos y que son compartidas por menos de 4 empleados,
excluyendo las que no son compartidas.*/
SELECT EXTEL
FROM TEMPLE
WHERE NUMDE IN (SELECT   NUMDE FROM    TEMPLE GROUP BY NUMDE HAVING  COUNT(DISTINCT EXTEL) > 2)
GROUP BY EXTEL
HAVING COUNT(*) BETWEEN 2 AND 3
ORDER BY EXTEL;

/*5.23.- (COMPLICADO) Para los departamentos cuyo salario medio
supera al de la empresa, hallar cuántas extensiones telefónicas
tienen.*/
SELECT NUMDE, COUNT(DISTINCT EXTEL)
FROM TEMPLE
GROUP BY NUMDE
HAVING AVG(SALAR) > (SELECT AVG(SALAR) FROM TEMPLE )
ORDER BY NUMDE;

/*5.24.- Para cada centro hallar los presupuestos medios de los
departamentos dirigidos en propiedad y en funciones,
excluyendo del resultado el número del centro.*/
SELECT TIDIR, ROUND(AVG(PRESU),2) AS PRESUPUESTO_MEDIO
FROM TDEPTO
GROUP BY TIDIR
ORDER BY TIDIR;

/*5.25.- (COMPLICADO) Hallar el máximo valor de la suma de los
salarios de los departamentos.*/
SELECT NUMDE, SUM(SALAR)
FROM TEMPLE
GROUP BY NUMDE
HAVING SUM(SALAR) >= ALL (SELECT SUM(SALAR) FROM TEMPLE GROUP BY NUMDE)
ORDER BY NUMDE;

/*5.26.- Hallar la suma de presupuestos de la empresa,
desglosándola por centros.*/
SELECT NUMCE AS NUMERO_CENTRO,
       SUM(PRESU) AS TOTAL_PRESUPUESTO
FROM TDEPTO
GROUP BY NUMCE
ORDER BY NUMCE;

/*SUBCONSULTAS*/
/*EJEMPLO 13. Obtener el nombre, el número de departamento y el salario 
de todos los trabajadores que cobren más del 3.5 % del importe del 
presupuesto del departamento 100 .*/
SELECT NOMEM AS NOMBRE, NUMDE AS NUMERO_DPTO,SALAR AS SALARIO 
FROM TEMPLE
WHERE SALAR > .035 * (SELECT PRESU FROM TDEPTO WHERE NUMDE=100) 
ORDER BY 2;

/*BDD FORMULA1
R1 = TCIRCUITO (CODIGO, ORDEN# , NOMBRE# , LONGITUD,
SENTIDOGIRO, CURVASIZQDA, CURVASDCHA, LOCALIDAD, REGION*, PAIS)
R2 = TPILOTO (NOMBRE, PAIS, FCH_NACIMIENTO * )
R3 = TCARRERA (FECHA, NOMBRE, VUELTAS*, DISTANCIATOTAL*, CODCIRCUITO (FK1))
R4 = TCOMPITE (FECHA (FK3), PUESTOLLEGADA, NUMAUTO ,
 NOMBREPILOTO (FK2), EQUIPO, VUELTAS, TPOCARRERA,
PUESTOPARRILLA, PUNTOSCARRERA )*/

use formula1;

/*5.27.- (No necesita agrupar) Calcular de cuántas carreras celebradas
en 2012 tenemos datos (participación de pilotos, clasificación,
etc.).*/

/*5.28.- (No necesita agrupar) Presenta el total de puntos que obtuvo
Fernando Alonso en 2012.*/

/*5.29.- Obtener la clasificación de puntos obtenidos por los pilotos
en el año 2013, ordenados por puntos de mayor a menor. Indicar
también el nombre del equipo al que pertenecía el piloto en ese
año. En la cabecera del listado debe aparecer la siguiente línea:
PILOTO EQUIPO TOTAL_PUNTOS*/

/*5.30.- Listar la clasificación de puntos obtenidos por los distintos
equipos en el año 2013, ordenados por puntos de mayor a
menor. En la cabecera del listado debe aparecer la siguiente
línea: EQUIPO TOTAL_PUNTOS*/

/*5.31.- Imprimir los nombres de los pilotos y la media de puntos por
carrera conseguidas en el año 2012, pero sólo de aquellos que
pertenezcan a equipos que contengan la palabra FERRARI o la
palabra RED BULL.*/

/*5.32.- Confeccionar la clasificación de puntos obtenidos por los pilotos
en los seis primeros meses del año 2013, ordenados por puntos
de mayor a menor. En la cabecera del listado debe aparecer la
siguiente línea: PILOTO EQUIPO PUNTOS_6MESES*/

/*5.33.- (No necesita agrupamiento) Calcular cuántas semanas
transcurrieron entre la primera carrera de 2013 y la última.*/

/*5.34.- Obtener para cada año en que se celebraron carreras, la
diferencia -expresadas en semanas- entre la primera carrera y la
última.*/

/*5.35.- Conseguir para cada año en que se celebraron carreras, la
fecha de la primera carrera y la de la última. Cabecera del
listado: AÑO PRIMERA_CARRERA ULTIMA_CARRERA*/

/*5.36.- (Necesita subconsulta) Componer la clasificación de puntos
obtenidos por los pilotos en el año 2013, ordenados por equipos
-y para el mismo equipo, por orden alfabético-, siempre que su
equipo haya conseguido más de 100 puntos en esa temporada.
En la cabecera del listado debe aparecer la siguiente línea:
PILOTO EQUIPO PUNTOS_TOTALES*/

/*5.37.- (No necesita agrupamiento) Elaborar un listado con los
nombres de los pilotos que compitieron en el año 2013, por
orden alfabético.*/

/*5.38.- (Se puede usar la UNION) Lograr una lista de los nombres de
los pilotos que compitieron en cada una de las temporadas 2011,
2012 y 2013, por ese orden (de menor a mayor) -dentro de cada
temporada, por orden alfabético-. En la cabecera del listado debe
aparecer la siguiente línea: AÑO PILOTO*/

/*5.39.- Listar cuántos pilotos distintos compitieron cada temporada. En
la cabecera del listado debe aparecer la siguiente línea:
AÑO TOTAL_PILOTOS*/

/*5.40.- Imprimir los nombres de los pilotos que en el año 2013 no
consiguieron ningún punto.*/

/*5.41.- Producir un listado con los nombres de los pilotos que en el
año 2013 sí consiguieron puntos. Al lado de cada uno debe
aparecer el total de puntos conseguidos. El listado irá ordenado
por puntos, de mayor a menor. En la cabecera del listado debe
aparecer la siguiente línea: PILOTO TOTAL_PTOS_2013*/

/*5.42.- (No necesita agrupamiento) Listar el nombre y la edad (en
años, con 1 decimal) de los pilotos, desde el más viejo hasta el
más joven.*/

/*5.43.- (No necesita agrupamiento) Hallar la edad media de los
pilotos.*/

/*5.44.- (No necesita agrupamiento, necesita subconsulta) Calcular la
edad media de los pilotos que compitieron en la temporada 2013.*/

/*5.45.- (No necesita agrupamiento, necesita subconsulta) Conseguir la
edad media de los pilotos que compitieron en las temporadas
2012 y 2013.*/

/*5.46.- Obtén un listado con los nombres de los pilotos que ganaron
carreras en el 2013 y con el número de carreras ganadas por
cada uno. El orden lo marcará el número de carreras ganadas, de
mayor a menor. En la cabecera del listado debe aparecer la
siguiente línea: PILOTO GANADAS_2013*/

/*5.47.- La columna PUESTOLLEGADA es de tipo char(3) y contiene
valores (cadenas) de dos clases: Por una parte el orden de
llegada -cadena compuesta por dígitos-, y por otra, las siglas
correspondientes al incidente o motivo que provocó que el piloto
no comenzara o no terminara la carrera (DNQ -Did Not Qualify-,
DNS -Did Not Start-, DSQ -Disqualified-, NC, Ret). Pues bien,
confeccionar un listado en el que se indique para cada piloto
cuántas veces no comenzó o no terminó la carrera en la
temporada 2011, por cualquiera de esos motivos. En la cabecera
del listado debe aparecer la siguiente línea:
PILOTO MOTIVO TOTAL_2011*/