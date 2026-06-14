/**************************** PROBLEMAS 3 *****************************/
use empresa;

/*BDD EMPRESA
R1 = TCENTR (NUMCE, NOMCE, SENAS)
R2 = TDEPTO (NUMDE, NUMCE (FK1), DIREC, TIDIR, PRESU, DEPDE (FK2), NOMDE)
R3 = TEMPLE (NUMEM, NUMDE (FK2), EXTEL, FECNA, FECIN, SALAR, COMIS, NUMHI, NOMEM)*/

/*3.1 Hallar el nombre del empleado, su comisión y su número de
departamento para aquellos que tienen una comisión conocida (no
nula) inferior a 1000 euros. El listado de estar ordenado de mayor a
menor comisión.*/

SELECT NOMEM, COMIS, NUMDE
FROM temple
WHERE COMIS IS NOT NULL AND COMIS  < 1000
ORDER BY COMIS DESC;

/*3.2 Listar el nombre, la comisión y el número de departamento para
aquellos empleados cuya comisión es igual o inferior a 1000 euros y
también para los que tienen comisión nula. El listado de estar
ordenado de mayor a menor comisión, y a igual comisión, por orden
alfabético.*/

SELECT NOMEM AS EMPLEADO, COMIS, NUMDE
FROM temple
WHERE COMIS <= 1000 OR COMIS IS NULL
ORDER BY COMIS DESC, NOMEM;

/*3.3 Para todos los empleados cuyo salario es superior a 3000 euros y que
además tienen comisión, listar: nombre, salario, comisión, sueldo total
mensual (salario más comisión) y el porcentaje que de su sueldo total
mensual supone la comisión (con dos decimales). Obtenerlos por orden
alfabético.*/

SELECT NOMEM, SALAR, COMIS, SALAR + COMIS AS SALARIO_TOTAL, 
CAST(COMIS/(SALAR + COMIS)*100 AS DECIMAL(4,2)) AS PORCENTAJE_COMISION
FROM temple
WHERE SALAR > 3000 AND COMIS IS NOT NULL
ORDER BY NOMEM;

/*3.4 Obtener todos los datos de los departamentos que no dependen de
otro.*/

SELECT *
FROM tdepto
WHERE DEPDE IS NULL;

/*3.5 Listar nombre, salario, comisión, sueldo total mensual (salario más
comisión) de todos los empleados cuyo salario esté entre 4200 y 5300
euros, ordenado por sueldo total mensual, de mayor a menor. No usar
operadores relacionales.*/

SELECT NOMEM AS EMPLEADO, SALAR, COMIS, SALAR + COALESCE(COMIS, 0) AS SUELDO_MENSUAL
FROM temple
WHERE SALAR BETWEEN 4200 AND 5300
ORDER BY SUELDO_MENSUAL DESC;

/*3.6 Listar nombre, salario, comisión, sueldo total mensual (salario más
comisión) de todos los empleados cuya comisión esté entre 500 y 800
euros, ordenado de menor a mayor comisión. No usar operadores
relacionales.*/

SELECT NOMEM, SALAR, COMIS, SALAR + COALESCE(COMIS, 0) AS SUELDO_MENSUAL
FROM temple
WHERE COMIS BETWEEN 500 AND 800
ORDER BY COMIS;

/*3.7 Listar nombre, salario, comisión y número de hijos de todos los
empleados cuyo salario sea igual o superior a dos veces su comisión (o
bien, tengan comisión desconocida -nula-) pero inferior o igual al
número de hijos por 1000 euros.*/

SELECT NOMEM, SALAR, COMIS, NUMHI
FROM temple
WHERE (COMIS IS NULL OR SALAR >= COMIS * 2) AND SALAR <= NUMHI * 1000;

/*3.8 Obtener por orden alfabético los nombres y salarios de los empleados
que tengan hijos cuyo salario dividido por su número de hijos cumpla
una o ambas de las condiciones siguientes:
• Que sea inferior a 1200 euros.
• Que sea superior al doble de su comisión.*/

SELECT NOMEM, SALAR
FROM temple
WHERE SALAR/NUMHI < 1200 OR SALAR/NUMHI > COMIS * 2
ORDER BY NOMEM;

/*3.9 Obtener el nombre de los empleados junto a su número de
departamento, de todos aquellos que pertenezcan al 111, al 121 o al
130 y que su comisión sea desconocida (NULA). El listado debe ir
ordenado por número de departamento, de menor a mayor.*/

SELECT NOMEM, NUMDE
FROM temple
WHERE NUMDE NOT IN (121, 130, 111)  AND COMIS IS NULL
ORDER BY NUMDE;

/*3.10 Obtener los nombres de los empleados y sus fechas de
nacimiento de los nacidos entre el año 1966 y el año 1980, ordenado
por edad, de menor a mayor.*/

SELECT NOMEM, FECNA
FROM temple
WHERE YEAR(FECNA) BETWEEN 1966 AND 1980
ORDER BY FECNA DESC;

/*3.11 Obtener los nombres de los empleados cuyo apellido comience
por 'S'.*/

SELECT NOMEM
FROM temple
WHERE NOMEM LIKE 'S%';

/*3.12 Obtener por orden alfabético los nombres de los empleados cuyo
apellido o cuyo nombre comience por 'C'.*/

SELECT NOMEM AS EMPLEADO 
FROM temple
WHERE NOMEM LIKE "C%" OR NOMEM LIKE "%, C%"
ORDER BY 1;

/*3.13 Obtener por orden alfabético los nombres de los empleados cuyo
nombre termine en 'O' y tenga sólo 5 letras, y también, aquellos cuyo
nombre comience y termine por 'A'.*/

SELECT NOMEM AS EMPLEADO
FROM temple
WHERE NOMEM LIKE "%, ___O" OR NOMEM LIKE "%, A%A"
ORDER BY 1;

/*3.14 Obtener los nombres, la comisión y el número de hijos de aquellos
empleados que tienen hijos y en los que se cumplen que la comisión
dividida por el número de hijos es inferior a 500 (incluidos los que
tienen comisión desconocida). El listado debe ir ordenado por número
de hijos, de mayor a menor, y a igual número de hijos, por comisión
ascendentemente.*/

/* EJERCICIO TIPO EXAMEN */

SELECT NOMEM, COMIS, NUMHI
FROM temple
WHERE NUMHI > 0 AND (COMIS/NUMHI < 500 OR COMIS IS NULL)
ORDER BY NUMHI DESC, COMIS ASC;

/*3.15 Obtener por orden alfabético los nombres de los empleados cuyo
salario está entre 2500 y 3000 euros.*/

/* EJERCICIO TIPO EXAMEN */

SELECT NOMEM, SALAR
FROM temple
WHERE SALAR BETWEEN 2500 AND 3000
ORDER BY 1;

/*3.16 Para los empleados que no tienen comisión conocida obtener por
orden alfabético el nombre, y además el cociente entre su salario y el
número de hijos.*/

SELECT NOMEM, CAST(SALAR/NUMHI AS DECIMAL (6,0)) AS SALARIO_POR_HIJOS
FROM temple
WHERE COMIS IS NULL AND NUMHI <> 0
ORDER BY NOMEM;

/*3.17 Se desea hacer un regalo de un 1 % del salario a los empleados
en el día de su onomástica. Hallar por orden alfabético los nombres y
cuantía de los regalos en euros para los que celebren su santo el día de
San Juan.*/

SELECT NOMEM, SALAR*0.1  AS REGALO
FROM temple
WHERE NOMEM LIKE "%, JUAN%"
ORDER BY 1;

/* OTRO CASO */

SELECT NOMEM, SALAR*0.1  AS REGALO
FROM temple
WHERE DAY (FECNA) = 27 AND MONTH (FECNA) = 10
ORDER BY 1;

/*3.18 En la fiesta de Reyes se desea organizar un espectáculo para los
empleados (tengan o no hijos) y para los hijos de los empleados, que
se representará en dos días diferentes. El 1º día asistirán los
empleados cuyo apellido empiece por las letras desde A hasta L,
ambas inclusive. El 2º día se cursarán invitaciones para el resto.
A cada empleado se le asignarán tantas invitaciones gratuitas como
hijos tenga más otras dos de regalo; en consecuencia, si un empleado
no tiene hijos se le entrengan sólo 2 invitaciones. Además en la fiesta
se entregará a cada empleado un obsequio por hijo.
Obtener una lista por orden alfabético de los nombres a quienes hay
que invitar el 1º día de la representación, incluyendo también cuántas
invitaciones corresponden a cada nombre y cuántos regalos hay que
preparar para él.*/

SELECT NOMEM, NUMHI +2 AS INVITACIONES, NUMHI AS OBSEQUIO
FROM temple
WHERE NOMEM BETWEEN "A%" AND "L%"
ORDER BY NOMEM;

/*3.20 Hallar por orden alfabético los nombres de departamentos que
cumplen una o varias de las siguientes:
• o bien tienen directores en funciones (columna TIDIR vale F)
• o bien el puesto de director lo posee en propiedad (columna
TIDIR vale P) y el presupuesto anual del departamento excede a
50 000 euros
• o bien es un departamento que no dependen de ningún otro.*/

SELECT NOMDE
FROM tdepto
WHERE TIDIR = "F" OR ( TIDIR = "P" AND PRESU > 50000 ) OR DEPDE IS NULL
ORDER BY 1;

/*3.21 Listar los nombres de los empleados y los días totales que llevan de
servicio en la empresa, ordenado desde el empleado con menos
antigüedad hasta el de más antigüedad. (Usar la función DATEDIFF)*/

SELECT NOMEM, DATEDIFF(curdate(),FECIN) AS DIAS_DE_SERVICIOS
FROM temple
ORDER BY DIAS_DE_SERVICIOS;

/*3.22 Listar los nombres de los empleados y la edad en la que
ingresaron en la empresa, ordenado desde el empleado que ingresó
más joven hasta el que ingresó con más edad. (Usar la función
DATEDIFF)*/

SELECT NOMEM, FLOOR(DATEDIFF(FECIN, FECNA)/365) AS EDAD_INGRESO
FROM temple
ORDER BY EDAD_INGRESO;

/**************************************************************/
SELECT NOMEM AS EMPLEADO, 
	DATEDIFF(FECIN, FECNA)/365 AS EDAD_INGRESO, 
    ROUND(DATEDIFF(FECIN, FECNA)/365, 1) AS USA_ROUND,
    FLOOR(DATEDIFF(FECIN, FECNA)/365) AS USA_FLOOR,
    CEILING(DATEDIFF(FECIN, FECNA)/365) AS USA_TRUNCATE,
    TRUNCATE(DATEDIFF(FECIN, FECNA)/365, 1) AS USA_TRUNCATE
    FROM TEMPLE
    ORDER BY EDAD_INGRESO;
/**************************************************************/

/*3.23 Listar los nombres de los empleados y su fecha de nacimiento en
formato “dia/mes/año” . (Usar la función DATE_FORMAT)*/

SELECT NOMEM, DATE_FORMAT(FECNA,'%d/%m/%Y') AS FECHA_NACIMIENTO
FROM temple;

/*3.24 Listar los nombres de los centros seguido de la dirección de cada
uno. (Usar la función CONCAT).*/

SELECT CONCAT(NOMCE,' - ',SENAS) AS CENTRO_DIRECCION
FROM tcentr;

/*3.25 Listar el salario, la comisión y la suma del salario más la comisión de
cada empleado (Usar la función COALESCE).*/

SELECT SALAR, COMIS, SALAR + COALESCE(COMIS,0) AS TOTAL
FROM temple;

/*3.26 Hallar los días transcurridos desde principio de año hasta el día
actual.*/

SELECT DATEDIFF(CURDATE(), CONCAT(YEAR(CURDATE()),'-01-01')) AS DIAS_TRANSCURRIDOS;

/*BDD FORMULA1
R1 = TCIRCUITO ( CODIGO, ORDEN# , NOMBRE# , LONGITUD,
SENTIDOGIRO, CURVASIZQDA, CURVASDCHA, LOCALIDAD, REGION*, PAIS)
R2 = TPILOTO (NOMBRE, PAIS, FCH_NACIMIENTO * )
R3 = TCARRERA ( FECHA, NOMBRE, VUELTAS*, DISTANCIATOTAL*, CODCIRCUITO (FK1) )
R4 = TCOMPITE ( FECHA ( FK3 ), PUESTOLLEGADA, NUMAUTO ,
 NOMBREPILOTO ( FK2), EQUIPO, VUELTAS, TPOCARRERA,
PUESTOPARRILLA, PUNTOSCARRERA )*/

/*3.27 Listar los nombres de los pilotos que han ganado al menos una
carrera.*/

SELECT DISTINCT NOMBREPILOTO
FROM tcompite
WHERE PUESTOLLEGADA = 1;

/*3.28 Listar los nombres de los pilotos que no son alemanes.*/

SELECT NOMBRE
FROM tpiloto
WHERE PAIS <> 'ALEMANIA';

/*3.29 Listar los nombres de los pilotos que han subido alguna vez al
podium.*/

SELECT DISTINCT NOMBREPILOTO
FROM tcompite
WHERE PUESTOLLEGADA BETWEEN 1 AND 3;

/*3.30 Listar los nombres de los pilotos italianos y españoles, y su fecha de
nacimiento, ordenados desde el más joven al más viejo.*/

SELECT NOMBRE, FCH_NACIMIENTO
FROM tpiloto
WHERE PAIS IN ('ITALIA','ESPAÑA')
ORDER BY FCH_NACIMIENTO DESC;

/*3.31 Listar los nombres de los pilotos y su edad, desde el mayor al más
joven.*/

SELECT NOMBRE, FLOOR(DATEDIFF(CURDATE(),FCH_NACIMIENTO)/365) AS EDAD
FROM tpiloto
ORDER BY EDAD DESC;

/*3.32 Listar los resultados de la carreras celebrados en Abril del 2012,
ordenados por fecha (desde la más antigua a la más reciente) y, para
cada carrera, por orden de llegada.*/

SELECT c.FECHA, c.NOMBRE, co.NOMBREPILOTO, co.PUESTOLLEGADA
FROM tcarrera c
JOIN tcompite co ON c.FECHA = co.FECHA
WHERE MONTH(c.FECHA)=4 AND YEAR(c.FECHA)=2012
ORDER BY c.FECHA, co.PUESTOLLEGADA;