/**************************** PROBLEMAS 6 *****************************/

/*BDD FORMULA1
R1 = TCIRCUITO (CODIGO, ORDEN# , NOMBRE# , LONGITUD,
SENTIDOGIRO, CURVASIZQDA, CURVASDCHA, LOCALIDAD, REGION*, PAIS)
R2 = TPILOTO (NOMBRE, PAIS, FCH_NACIMIENTO * )
R3 = TCARRERA (FECHA, NOMBRE, VUELTAS*, DISTANCIATOTAL*, CODCIRCUITO (FK1))
R4 = TCOMPITE (FECHA (FK3), PUESTOLLEGADA, NUMAUTO ,
 NOMBREPILOTO (FK2), EQUIPO, VUELTAS, TPOCARRERA,
PUESTOPARRILLA, PUNTOSCARRERA )*/

use formula1;

/*6.1.- Listar por orden alfabético los pilotos que nunca han subido al podio en el
campeonato del año 2011.*/
SELECT DISTINCT NOMBREPILOTO
FROM TCOMPITE
WHERE YEAR(FECHA) = 2011 
  AND NOMBREPILOTO NOT IN (
        SELECT DISTINCT NOMBREPILOTO 
        FROM TCOMPITE 
        WHERE PUESTOLLEGADA IN ('1','2','3') 
          AND YEAR(FECHA) = 2011
  )
ORDER BY NOMBREPILOTO;
    
/*6.2.- Listar los nombres de los pilotos y los puntos totales logrados en el 2011 por
aquellos pilotos que han conseguido un total de puntos superior a los conseguidos
por el piloto Fernando Alonso en dicho año.*/
SELECT NOMBREPILOTO, SUM(PUNTOSCARRERA) AS TOTALPTOS
FROM TCOMPITE
WHERE YEAR(FECHA) = 2011
GROUP BY NOMBREPILOTO
HAVING SUM(PUNTOSCARRERA) > (
        SELECT SUM(PUNTOSCARRERA) 
        FROM TCOMPITE
        WHERE YEAR(FECHA) = 2011
          AND NOMBREPILOTO = 'FERNANDO ALONSO'
);
                     
/*6.3.- Teniendo en cuenta las tabla Tcompite, lista los integrantes del equipo que ha
conseguido más puntos en el año 2011.*/
SELECT DISTINCT NOMBREPILOTO AS PILOTO
FROM TCOMPITE
WHERE EQUIPO IN (
    SELECT EQUIPO
    FROM TCOMPITE
    WHERE YEAR(FECHA) = 2011
    GROUP BY EQUIPO
    HAVING SUM(PUNTOSCARRERA) >= ALL (
        SELECT SUM(PUNTOSCARRERA)
        FROM TCOMPITE
        WHERE YEAR(FECHA) = 2011
        GROUP BY EQUIPO
    )
);

/*6.4.- Mejora la solución del ejercicio anterior de modo que también muestre los
puntos totales conseguidos por cada piloto.*/
SELECT NOMBREPILOTO AS PILOTO, SUM(PUNTOSCARRERA) AS TOTAL_PUNTOS
FROM TCOMPITE
WHERE EQUIPO IN (
    SELECT EQUIPO
    FROM TCOMPITE
    WHERE YEAR(FECHA) = 2011
    GROUP BY EQUIPO
    HAVING SUM(PUNTOSCARRERA) >= ALL (
        SELECT SUM(PUNTOSCARRERA)
        FROM TCOMPITE
        WHERE YEAR(FECHA) = 2011
        GROUP BY EQUIPO
    )
)
GROUP BY NOMBREPILOTO;

/*6.5.- Teniendo en cuenta las tablas Tcarrera y Tcircuito, obtén las fechas y los
nombres de los grandes premios que se disputaron en España.*/
SELECT FECHA, NOMBRE
FROM TCARRERA
WHERE CODCIRCUITO IN (
    SELECT CODIGO 
    FROM TCIRCUITO 
    WHERE PAIS = 'ESPANA'
);
    
/*6.6.- Lista el nombre y la longitud de los circuitos cuya longitud es 500 metros
superior a la media.*/
SELECT NOMBRE, LONGITUD
FROM TCIRCUITO
WHERE LONGITUD > (
    500 + (SELECT AVG(LONGITUD) FROM TCIRCUITO)
);

/*6.7.- Obtén el total de kilómetros que tendría que recorrer un piloto para completar
todas las vueltas previstas de todas las carreras celebradas en el año 2011 en
aquellos circuitos con el sentido de giro contrario a las agujas del reloj
(sentidogiro vale 'C').*/
SELECT SUM(DISTANCIATOTAL) AS TOTALKM
FROM TCARRERA
WHERE YEAR(FECHA) = 2011
  AND CODCIRCUITO IN (
        SELECT CODIGO
        FROM TCIRCUITO
        WHERE SENTIDOGIRO = 'C'
);

/*BDD EMPRESA
R1 = TCENTR (NUMCE, NOMCE, SENAS)
R2 = TDEPTO (NUMDE, NUMCE (FK1), DIREC, TIDIR, PRESU, DEPDE (FK2), NOMDE)
R3 = TEMPLE (NUMEM, NUMDE (FK2), EXTEL, FECNA, FECIN, SALAR, COMIS, NUMHI, NOMEM)*/

use empresa;

/*6.8.- Obtener por orden alfabético los nombres de los empleados, su salario y su
número de departamento de todos aquellos cuyo salario supera al máximo del que
obtienen los empleados del departamento 122.*/
SELECT NOMEM AS EMPLEADO,
       SALAR AS SUELDO,
       NUMDE AS NUM_DPTO
FROM TEMPLE
WHERE SALAR > (
    SELECT MAX(SALAR)
    FROM TEMPLE
    WHERE NUMDE = 122
)
ORDER BY NOMEM;

/*6.9.- Obtener por orden alfabético los nombres, el salario y el número de
departamento de los empleados cuyo salario supera en tres veces y media o más
al mínimo salario de los empleados del departamento 122.*/
SELECT NOMEM,
       SALAR,
       NUMDE
FROM TEMPLE
WHERE SALAR > (
    3.5 * (SELECT MIN(SALAR) FROM TEMPLE WHERE NUMDE = 122)
)
ORDER BY NOMEM;

/*6.10.- Obtener los nombres y salarios de los empleados cuyo salario coincide con la
comisión de algún otro o la suya propia.*/
SELECT NOMEM AS EMPLEADO,
       SALAR AS SALARIO
FROM TEMPLE
WHERE SALAR IN (
    SELECT DISTINCT COMIS FROM TEMPLE
);

/*6.11.- Obtener por orden alfabético los nombres y salarios de los empleados cuyo
salario es inferior a la comisión más alta existente.*/
SELECT NOMEM,
       SALAR
FROM TEMPLE
WHERE SALAR < (
    SELECT MAX(COMIS) FROM TEMPLE
)
ORDER BY NOMEM;

/*6.12.- Obtener por orden alfabético los nombres y salarios de los empleados cuyo
salario es inferior al cuádruplo de la comisión más baja existente.*/
SELECT NOMEM AS EMPLEADO,
       SALAR AS SALARIO
FROM TEMPLE
WHERE SALAR < (
    SELECT 4 * MIN(COMIS) FROM TEMPLE
)
ORDER BY NOMEM;

/*6.13.- Obtener por orden alfabético el nombre, salario y comisión de los empleados
que tienen igual salario e igual comisión que el empleado 440.*/
SELECT NOMEM,
       SALAR,
       COMIS,
       NUMEM
FROM TEMPLE
WHERE SALAR = (
    SELECT SALAR FROM TEMPLE WHERE NUMEM = 440
)
AND COMIS = (
    SELECT COMIS 
    FROM TEMPLE 
    WHERE COMIS IS NOT NULL AND NUMEM = 440
)
ORDER BY NOMEM;

/*6.14.- Obtener por orden alfabético los nombres de los empleados cuyos sueldos
igualan o superan el de Carolina Herrera en más del 50%.*/
SELECT NOMEM,
       SALAR
FROM TEMPLE
WHERE SALAR >= (
    SELECT SALAR * 1.5
    FROM TEMPLE
    WHERE NOMEM = 'HERRERA, CAROLINA'
)
ORDER BY NOMEM;

/*6.15.- Hallar por orden de número de empleado el nombre y salario total (salario más
comisión) de los empleados cuyo salario total supera al salario mínimo en 3000
euros mensuales.*/
SELECT NUMEM AS NUMERO,
       NOMEM AS NOMBRE,
       SALAR + COMIS AS SALARIO_TOTAL
FROM TEMPLE
WHERE SALAR + COMIS > (
    SELECT MIN(SALAR) + 3000 FROM TEMPLE
)
ORDER BY NUMEM;

/*6.16.- Obtener por orden alfabético los nombres y salarios de los empleados del
departamento 111 que tienen comisión, si hay alguno de ellos cuya comisión
supere al 15 % de su salario.*/
SELECT NOMEM AS EMPLEADO,
       SALAR AS SALARIO
FROM TEMPLE
WHERE NUMDE = 111
  AND COMIS IS NOT NULL
  AND EXISTS (
        SELECT *
        FROM TEMPLE
        WHERE NUMDE = 111
          AND COMIS IS NOT NULL
          AND COMIS > 0.15 * SALAR
  )
ORDER BY NOMEM;

/*BDD FORMULA1
R1 = TCIRCUITO (CODIGO, ORDEN# , NOMBRE# , LONGITUD,
SENTIDOGIRO, CURVASIZQDA, CURVASDCHA, LOCALIDAD, REGION*, PAIS)
R2 = TPILOTO (NOMBRE, PAIS, FCH_NACIMIENTO * )
R3 = TCARRERA (FECHA, NOMBRE, VUELTAS*, DISTANCIATOTAL*, CODCIRCUITO (FK1))
R4 = TCOMPITE (FECHA (FK3), PUESTOLLEGADA, NUMAUTO ,
 NOMBREPILOTO (FK2), EQUIPO, VUELTAS, TPOCARRERA,
PUESTOPARRILLA, PUNTOSCARRERA )*/

use formula1;

/*6.17.- Lista los pilotos, y también su tiempo de carrera, que en la última carrera de
2013 quedaron a más de una vuelta del vencedor.*/
SELECT NOMBREPILOTO AS PILOTO,
       TPOCARRERA
FROM TCOMPITE
WHERE FECHA = (SELECT MAX(FECHA) FROM TCARRERA WHERE YEAR(FECHA)=2013)
AND (TPOCARRERA LIKE '%LAP%' OR TPOCARRERA LIKE '%LAPS%');

/*6.18.- Listar la fecha de la carrera, el nombre del piloto vencedor, las horas, 
minutos, segundos y milésimas de segundo de las carreras de 2013.*/
SELECT FECHA,
       NOMBREPILOTO AS PILOTO,
       HOUR(TPOCARRERA) AS HORAS,
       MINUTE(TPOCARRERA) AS MIN,
       SECOND(TPOCARRERA) AS SEG,
       MICROSECOND(TPOCARRERA) / 1000 AS MILESIMAS
FROM TCOMPITE
WHERE PUESTOLLEGADA = 1
AND YEAR(FECHA) = 2013;

/*6.19.- Listar la fecha de la carrera, los nombres de los pilotos y los segundos de
retraso, de los 4 primeros pilotos que llegaron detrás del vencedor en 2013.*/
SELECT FECHA,
       NOMBREPILOTO AS PILOTO,
       (TIME_TO_SEC(TPOCARRERA) - (
           SELECT TIME_TO_SEC(T2.TPOCARRERA) 
           FROM TCOMPITE T2 
           WHERE T2.FECHA = TCOMPITE.FECHA AND T2.PUESTOLLEGADA = 1
       )) AS SEGUNDOS_RETRASO
FROM TCOMPITE
WHERE YEAR(FECHA) = 2013 
AND PUESTOLLEGADA BETWEEN 2 AND 5;

/*6.20.- Obtener por orden alfabético el nombre de los circuitos que han acogido 
más de una carrera en el año 2011.*/
SELECT NOMBRE
FROM TCIRCUITO
WHERE CODIGO IN (
    SELECT CODCIRCUITO
    FROM TCARRERA
    WHERE YEAR(FECHA) = 2011
    GROUP BY CODCIRCUITO
    HAVING COUNT(*) > 1
)
ORDER BY NOMBRE;

/*6.21.- Obtener el nombre de los pilotos que han participado en todas las carreras 
disputadas en el año 2011.*/
SELECT NOMBREPILOTO
FROM TCOMPITE
WHERE YEAR(FECHA) = 2011
GROUP BY NOMBREPILOTO
HAVING COUNT(DISTINCT FECHA) = (
    SELECT COUNT(*)
    FROM TCARRERA
    WHERE YEAR(FECHA) = 2011
);

/*6.22.- Listar los nombres de los pilotos que en el año 2011 siempre han terminado 
las carreras en las que han participado.*/
SELECT DISTINCT NOMBREPILOTO
FROM TCOMPITE
WHERE YEAR(FECHA) = 2011
  AND NOMBREPILOTO NOT IN (
    SELECT NOMBREPILOTO
    FROM TCOMPITE
    WHERE YEAR(FECHA) = 2011 AND PUESTOLLEGADA IS NULL
);

/*6.23.- Mostrar el nombre del equipo y el número de pilotos diferentes que han 
competido para dicho equipo durante la temporada 2013.*/
SELECT EQUIPO, COUNT(DISTINCT NOMBREPILOTO) AS NUM_PILOTOS
FROM TCOMPITE
WHERE YEAR(FECHA) = 2013
GROUP BY EQUIPO;

/*6.24.- Obtener la media de puntos por carrera obtenidos por cada piloto en 2011, 
ordenados de mayor a menor.*/
SELECT NOMBREPILOTO, AVG(PUNTOSCARRERA) AS MEDIA_PUNTOS
FROM TCOMPITE
WHERE YEAR(FECHA) = 2011
GROUP BY NOMBREPILOTO
ORDER BY MEDIA_PUNTOS DESC;

/*6.25.- Obtener los nombres de los departamentos que no tienen ningún empleado 
con comisión en la base de datos EMPRESA.*/
use empresa;

SELECT NOMDE
FROM TDEPTO
WHERE NUMDE NOT IN (
    SELECT DISTINCT NUMDE
    FROM TEMPLE
    WHERE COMIS IS NOT NULL AND COMIS > 0
);