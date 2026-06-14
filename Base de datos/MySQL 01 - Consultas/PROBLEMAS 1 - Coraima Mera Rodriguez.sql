 /**************************** PROBLEMAS 1 *****************************/

/*1.1 Obtener los nombres de todos los centros de trabajo de la empresa
clasificados por orden alfabético.*/

SELECT NOMCE
FROM tcentr
ORDER BY NOMCE;

/*1.2 Obtener los nombres y las fechas de nacimiento de los empleados que
trabajan en el departamento 121, ordenados por fecha de nacimiento.*/

SELECT NOMEM, FECNA
FROM temple
WHERE NUMDE = 121
ORDER BY FECNA;

/*1.3 Listar todos los datos del departamento 121.*/

SELECT *
FROM tdepto
WHERE NUMDE = 121;

/*1.4 Obtener, por orden alfabético, los nombres y sueldos de los empleados 
con más de tres hijos.*/

SELECT NOMEM, SALAR
FROM temple
WHERE NUMHI > 3
ORDER BY 1;

/*1.5 Obtener la comisión, departamento, nombre y salario de los empleados cuyo
salario es inferior a 1900 euros, clasificándolos por departamento en orden
creciente, y por comisión -en orden decreciente- dentro de cada
departamento.*/

SELECT COMIS, NUMDE, NOMEM, SALAR
FROM temple
WHERE SALAR < 1900
ORDER BY 2, 1 desc;

/*1.6 Establecer el enunciado que corresponde a la siguiente consulta.*/

SELECT DISTINCT NUMDE
FROM TEMPLE
WHERE SALAR<2500
ORDER BY 1 ;

/*1.7 Obtener, por orden alfabético, los nombres de los departamentos y los
correspondientes números de los centros a los que pertenecen de aquellos
departamentos cuyo presupuesto es superior a 100.000 euros. En la salida
deberán aparecer, en lugar de los correspondientes nombres de columnas,
las inscripciones ‘DEPARTAMENTO’, ‘CENTRO’.*/

SELECT NOMDE AS DEPARTAMENTO, NUMCE AS CENTRO
FROM TDEPTO
WHERE PRESU>100000
ORDER BY NOMDE ;

/*1.8 Obtener los nombres, número de hijos y salarios de los empleados que
cobren 3000 euros o menos y con dos hijos o más. El listado debe ir
ordenado por salario (de mayor a menor), y a igual salario, por número de
hijos (de más a menos).*/

SELECT NOMEM, NUMHI, SALAR
FROM TEMPLE
WHERE NUMHI > 1 AND SALAR <=3000
ORDER BY SALAR DESC, NUMHI DESC;

/*1.9 Obtener los nombres, número de departamento y salarios de los empleados
que cobren 3000 euros o menos y que pertenezcan al departamento 111, o
bien, al 112. El listado debe ir ordenado por número de departamento, y
dentro de éste, por salario (de menor a mayor).*/

SELECT NOMEM, NUMDE, SALAR
FROM TEMPLE
WHERE (NUMDE=111 OR NUMDE = 112) AND SALAR <= 3000
ORDER BY NUMDE,SALAR;

/*1.10Obtener los nombres, número de departamento y salarios de todos los
empleados excepto los del departamento 111 que ganen menos de 3000 euros.*/

SELECT NOMEM, NUMDE, SALAR
FROM TEMPLE
WHERE NOT (NUMDE=111 AND SALAR < 3000);

/*1.11Obtener los nombres, número de departamento y comisión de todos los
empleados excepto los de los departamentos 110 , 111 y 130, ordenado por
número de departamento (ascendente).*/

SELECT NOMEM, NUMDE, COMIS
FROM TEMPLE
WHERE NUMDE !=130 AND NUMDE!=110 AND NUMDE!=111
ORDER BY 2;
