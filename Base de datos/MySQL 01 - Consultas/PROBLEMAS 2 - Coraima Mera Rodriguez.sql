/**************************** PROBLEMAS 2 *****************************/
use empresa;

/*2.1. Obtener, de todos los empleados, los números de departamento
correspondientes, los nombres y los sueldos mensuales (expresados en
euros), presentados por orden decreciente de sueldos.
A continuación, obtener los nombres y sueldos anuales (expresados
en euros) de los empleados del departamento 100, presentados por el
mismo orden.*/

SELECT NUMDE, NOMEM, SALAR
FROM TEMPLE
ORDER BY 3 DESC;

SELECT NOMEM AS EMPLEADO, SALAR*12 AS SALARIO_ANUAL
FROM TEMPLE
WHERE NUMDE =100
ORDER BY 2 DESC;

/*2.2. Obtener la comisión, el salario y los nombres de los empleados
cuya comisión es superior al 50% de su salario, por orden alfabético.*/

SELECT COMIS AS COMISION, SALAR AS SALARIO, NOMEM AS EMPLEADO
FROM TEMPLE
WHERE COMIS > 0.5 * SALAR
ORDER BY EMPLEADO;

/*2.3. En una campaña de ayuda familiar se ha decidido dar a los empleados
una paga extra de 30 euros por hijo, a partir del cuarto inclusive. Obtener
por orden alfabético para estos empleados: nombre y salario total que van a
cobrar incluyendo esta paga extra.*/

SELECT NOMEM AS NOMBRE_EMPLEADO, SALAR + 30*(NUMHI-3) AS SALARIO
FROM TEMPLE
WHERE NUMHI > 3
ORDER BY NOMEM;

/*2.4. Hallar los presupuestos de los departamentos 111 y 112, mostrando
el número de departamento, su nombre y su presupuesto.
A continuación, mostrar sólo los nombres de los departamentos y
su presupuesto, pero de modo que aparezcan en una sola fila.*/

SELECT NUMDE, NOMDE AS NOMBRE_DEP, PRESU AS PRESUPUESTO
FROM TDEPTO
WHERE NUMDE = 111 OR NUMDE = 112;

/*2.5. Deseamos obtener una lista ordenada alfabéticamente de los
nombres de los departamentos y su respectivo presupuesto. Sólo se deben
listar aquellos departamentos cuyo presupuesto supere los 100.000 euros.
El número de departamento debe aparecer incorporado al nombre*/

SELECT CONCAT(NOMDE,"-",(CAST(NUMDE AS CHAR(3)))) AS DEPARTAMENTO_NUMERO, PRESU
FROM TDEPTO
WHERE PRESU > 100000
ORDER BY DEPARTAMENTO_NUMERO;

/*2.6. Los empleados del departamento 100 deciden donar el 3,55% de su
salario a una ONG. Se desea obtener un listado de los empleados y las
cantidades que dona cada uno, con dos decimales (céntimos de euro). El
listado irá ordenado según el importe donado, de mayor a menor.*/

SELECT NOMEM AS NOMBRE_EMPLEADO, CAST(SALAR*0.0355 AS DECIMAL (6,2)) AS DONACION
FROM TEMPLE
WHERE NUMDE = 100
ORDER BY DONACION DESC;
