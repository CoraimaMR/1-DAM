/**************************** PROBLEMAS 4 *****************************/
use empresa;

/*4.1.- Determinar el salario máximo para el conjunto de todos los empleados.*/

SELECT MAX(SALAR) AS SALARIO_MAXIMO
FROM temple;

/*4.2.- Averiguar el salario máximo para los empleados del departamento 100.*/

SELECT MAX(SALAR) AS SALARIO_MAXIMO
FROM temple
WHERE NUMDE = 100;

/*4.4.- Hallar el nombre, la fecha de ingreso y los días trabajados hasta la fecha
actual de cada empleado del departamento 110, de mayor a menor.*/

SELECT NOMEM, FECIN, DATEDIFF(CURDATE(), FECIN) AS DIAS_TRABAJADOS
FROM temple
WHERE NUMDE = 110
ORDER BY DIAS_TRABAJADOS DESC;

/*4.5.- Averiguar, de cada empleado del departamento 110: el nombre, la fecha
de ingreso y los días trabajados hasta el 01-11-2010, ordenados de más a
menos antigüedad.*/

SELECT NOMEM, FECIN, DATEDIFF('2010-11-01', FECIN) AS DIAS_TRABAJADOS
FROM temple
WHERE NUMDE = 110
ORDER BY DIAS_TRABAJADOS DESC;

/*4.6.- Obtener el número de semanas de diferencia entre el empleado que entró
primero y el que entró último en 1988.*/

SELECT FLOOR(DATEDIFF(MAX(FECIN), MIN(FECIN))/7) AS SEMANAS_DIFERENCIA
FROM temple
WHERE YEAR(FECIN) = 1988;

/*4.7.- Determinar la edad en años cumplidos del empleado más viejo del
departamento 110.*/

SELECT FLOOR(DATEDIFF(CURDATE(), MIN(FECNA))/365) AS EDAD_MAXIMA
FROM temple
WHERE NUMDE = 110;

/*4.8.- Contar el número de empleados de la empresa.*/

SELECT COUNT(*) AS TOTAL_EMPLEADOS
FROM temple;

/*4.9.- Hallar el número de empleados y de extensiones telefónicas del
departamento 112.*/

SELECT COUNT(*) AS NUM_EMPLEADOS,
       COUNT(DISTINCT EXTEL) AS NUM_EXTENSIONES
FROM temple
WHERE NUMDE = 112;

/*4.10.- Calcular cuántos empleados hay cuya fecha de nacimiento sea anterior al
año 1980.*/

SELECT COUNT(*) AS EMPLEADOS_ANTES_1980
FROM temple
WHERE YEAR(FECNA) < 1980;

/*4.11.- Conseguir del departamento 112: el número de empleados, cuántos
cobran comisión, y la suma y la media de sus comisiones.*/

SELECT COUNT(*) AS NUM_EMPLEADOS,
       COUNT(COMIS) AS COBRAN_COMISION,
       SUM(COMIS) AS SUMA_COMISION,
       AVG(COMIS) AS MEDIA_COMISION
FROM temple
WHERE NUMDE = 112;

/*4.12.- Calcular cuántas comisiones diferentes hay y su valor medio.*/

SELECT COUNT(DISTINCT COMIS) AS COMISIONES_DISTINTAS,
       AVG(COMIS) AS MEDIA_COMISION
FROM temple
WHERE COMIS IS NOT NULL;

/*4.13.- Determinar la edad media de los empleados del departamento 100.*/

SELECT AVG(FLOOR(DATEDIFF(CURDATE(), FECNA)/365)) AS EDAD_MEDIA
FROM temple
WHERE NUMDE = 100;

/*4.14.- Obtener la media del nº de hijos de los empleados del departamento 123.*/

SELECT AVG(NUMHI) AS MEDIA_HIJOS
FROM temple
WHERE NUMDE = 123;

/*4.16.- Hallar cuántos departamentos hay y el presupuesto anual medio de ellos.*/

SELECT COUNT(*) AS NUM_DEPARTAMENTOS,
       AVG(PRESU) AS PRESUPUESTO_MEDIO
FROM tdepto;

/*4.17.- Hallar cuántos departamentos hay que no tienen director
(TIDIR='P') y el presupuesto anual medio de ellos.*/

SELECT COUNT(*) AS NUM_DEPARTAMENTOS,
       AVG(PRESU) AS PRESUPUESTO_MEDIO
FROM tdepto
WHERE TIDIR = 'P';

/*4.18.- Para los departamentos 111 y 112 hallar el total de empleados y los días
de servicio que acumulan todos sus empleados hasta el día de hoy.*/

SELECT NUMDE,
       COUNT(*) AS TOTAL_EMPLEADOS,
       SUM(DATEDIFF(CURDATE(), FECIN)) AS DIAS_SERVICIO
FROM temple
WHERE NUMDE IN (111,112)
GROUP BY NUMDE;

/*4.19.- Para los departamentos 111 y 112 hallar la media de los años de servicio
de sus empleados en el día de hoy.*/

SELECT NUMDE,
       AVG(DATEDIFF(CURDATE(), FECIN)/365) AS MEDIA_ANIOS_SERVICIO
FROM temple
WHERE NUMDE IN (111,112)
GROUP BY NUMDE;

/*4.20.- Para los departamentos 111 y 112 hallar la media de los años de servicio
de sus empleados el día 31.12.2010.*/

SELECT NUMDE,
       AVG(DATEDIFF('2010-12-31', FECIN)/365) AS MEDIA_ANIOS_SERVICIO
FROM temple
WHERE NUMDE IN (111,112)
GROUP BY NUMDE;

/*4.22.- Listar, por orden de ingreso, los empleados que entraron en los 2 años
anteriores al 25-02-2008, junto a su fecha de ingreso y la edad que tenían.*/

SELECT NOMEM, FECIN,
       FLOOR(DATEDIFF('2008-02-25', FECNA)/365) AS EDAD_INGRESO
FROM temple
WHERE FECIN BETWEEN '2006-02-25' AND '2008-02-25'
ORDER BY FECIN;

/*4.23.- Edad media de los empleados que ingresaron en los 2 años anteriores
al 25-02-2008.*/

SELECT AVG(FLOOR(DATEDIFF('2008-02-25', FECNA)/365)) AS EDAD_MEDIA
FROM temple
WHERE FECIN BETWEEN '2006-02-25' AND '2008-02-25';

/*4.24.- Hallar la masa salarial anual (14 pagas).*/

SELECT SUM((SALAR + COALESCE(COMIS,0)) * 14) AS MASA_SALARIAL
FROM temple;

/*4.25.- Hallar cuántos empleados han ingresado en el año 2008.*/

SELECT COUNT(*) AS INGRESOS_2008
FROM temple
WHERE YEAR(FECIN) = 2008;

/*4.27.- Hallar la diferencia entre el salario más alto y el más bajo.*/

SELECT MAX(SALAR) - MIN(SALAR) AS DIFERENCIA_SALARIAL
FROM temple;

/*4.28.- Hallar la edad media de los empleados con más de 2 hijos.*/

SELECT AVG(FLOOR(DATEDIFF(CURDATE(), FECNA)/365)) AS EDAD_MEDIA
FROM temple
WHERE NUMHI > 2;

/*4.30.- Hallar el número medio de hijos de empleados con como máximo 2 hijos.*/

SELECT AVG(NUMHI) AS MEDIA_HIJOS
FROM temple
WHERE NUMHI <= 2;

/**************************** PROBLEMAS 4 (FORMULA 1) *****************************/
use formula1;

/*4.32.- Lista los nombres de los pilotos que compitieron en la temporada 2012.*/

SELECT DISTINCT NOMBREPILOTO
FROM tcompite
WHERE YEAR(FECHA) = 2012;

/*4.33.- Lista el total de puntos conseguido por todos los pilotos cuyo apellido
comienza con “ROS” en la temporada 2011.*/

SELECT SUM(PUNTOSCARRERA) AS TOTAL_PUNTOS
FROM tcompite
WHERE YEAR(FECHA) = 2011
  AND NOMBREPILOTO LIKE '% ROS%';

/*4.34.- Lista cuántas carreras se celebraron en total en las temporadas 2011 y
2012.*/

SELECT COUNT(*) AS TOTAL_CARRERAS
FROM tcarrera
WHERE YEAR(FECHA) IN (2011, 2012);

/***************************************
OPERADOR CONJUNTO IN
WHERE YEAR(FECHA) IN (2011, 2012);

OPERADOR RANGO BETWEEN
WHERE YEAR(FECHA) BETWEEN 2011 AND 2012;
*****************************************/

/*4.35.- Lista cuántos kilómetros tiene el circuito más corto y cuántos el más largo.*/

SELECT MIN(LONGITUD)/1000 AS CIRCUITO_MAS_CORTO_KM,
       MAX(LONGITUD)/1000 AS CIRCUITO_MAS_LARGO_KM
FROM tcircuito;

/*4.36.- Lista la edad del piloto más joven y del más viejo (en años, con 1 decimal).*/

SELECT 
  ROUND(MIN(DATEDIFF(CURDATE(), FCH_NACIMIENTO)/365),1) AS EDAD_MAS_JOVEN,
  ROUND(MAX(DATEDIFF(CURDATE(), FCH_NACIMIENTO)/365),1) AS EDAD_MAS_VIEJO
FROM tpiloto;

/*4.37.- Obtén el total de puntos de los pilotos de equipos RENAULT en 2011.*/

SELECT SUM(PUNTOSCARRERA) AS TOTAL_PUNTOS
FROM tcompite
WHERE YEAR(FECHA) = 2011 AND EQUIPO LIKE '%RENAULT%';

/*4.38.- Para Fernando Alonso en 2012: máximo, mínimo y media de puntos.*/

SELECT 
  MAX(PUNTOSCARRERA) AS MAX_PUNTOS,
  MIN(PUNTOSCARRERA) AS MIN_PUNTOS,
  AVG(PUNTOSCARRERA) AS MEDIA_PUNTOS
FROM tcompite
WHERE YEAR(FECHA) = 2012
  AND NOMBREPILOTO = 'Fernando Alonso';

/*4.39.- Lista en mayúsculas el nombre completo de los pilotos,
omitiendo el primer nombre.*/

SELECT UPPER(SUBSTRING(NOMBRE, LOCATE(' ', NOMBRE)+1)) AS APELLIDOS
FROM tpiloto;

/*4.40.- Lista de cuántos países distintos tenemos circuitos registrados.*/

SELECT COUNT(DISTINCT PAIS) AS PAISES_DISTINTOS
FROM tcircuito;

/*4.41.- Lista los países con más de un circuito registrado.*/

SELECT PAIS
FROM tcircuito
GROUP BY PAIS
HAVING COUNT(*) > 1;

/*4.42.- Lista los circuitos y su longitud que:
a) Giro antihorario (C)
b) Más curvas a la derecha que a la izquierda
c) Longitud superior a 4000 m */

SELECT NOMBRE, LONGITUD
FROM tcircuito
WHERE SENTIDOGIRO = 'C'
  AND CURVASDCHA > CURVASIZQDA
  AND LONGITUD > 4000;

/*4.43.- Fecha y pilotos que en marzo y abril de 2011
salieron entre los 10 primeros y terminaron a una vuelta o más del ganador.*/

SELECT FECHA, NOMBREPILOTO
FROM tcompite
WHERE YEAR(FECHA) = 2011
  AND MONTH(FECHA) IN (3,4)
  AND PUESTOPARRILLA <= 10
  AND VUELTAS < (
      SELECT MAX(VUELTAS)
      FROM tcompite tc2
      WHERE tc2.FECHA = tcompite.FECHA
  );
  
/**************************** PROBLEMAS 4 (BBD Empresa) *****************************/
use empresa;

/*4.44.- Lista la edad media de los que llevan más de 10 años en la empresa.*/

SELECT AVG(FLOOR(DATEDIFF(CURDATE(), FECNA)/365)) AS EDAD_MEDIA
FROM temple
WHERE DATEDIFF(CURDATE(), FECIN)/365 > 10;

/*4.45.- Listar cuántas comisiones distintas se cobran, y cuántos trabajadores
cobran todas esas comisiones. No tener en cuenta aquellos para los que se
desconoce qué comisión cobran.*/

SELECT COUNT(DISTINCT COMIS) AS COMISIONES_DISTINTAS,
       COUNT(*) AS TRABAJADORES_CON_COMISION
FROM temple
WHERE COMIS IS NOT NULL;

/*4.46.- (Necesita agrupamiento) Listar los valores de las distintas comisiones que
se cobran, y el nº de trabajadores que cobran cada una de esas comisiones.
No tener en cuenta aquellos para los que se desconoce la comision que
cobran.*/

SELECT COMIS, COUNT(*) AS NUM_TRABAJADORES
FROM temple
WHERE COMIS IS NOT NULL
GROUP BY COMIS;