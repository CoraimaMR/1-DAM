/************* AUTOMATIZACIÓN **************
Curso: 1º DAM
Nombre: Coraima Mera Rodriguez
*******************************************/

DROP FUNCTION IF EXISTS mayorDe3;
DROP FUNCTION IF EXISTS esDivisible;

/* 1.mayoreDe3() que devuelva el mayor de 3 números pasados como
parámetros. */

DELIMITER $$
CREATE FUNCTION mayorDe3(a INT, b INT, c INT)
RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE mayor INT;
    SET mayor = a;
    IF b > mayor THEN
        SET mayor = b;
    END IF;
    IF c > mayor THEN
        SET mayor = c;
    END IF;
    RETURN mayor;
END $$
DELIMITER ;

SELECT mayorDe3(10, 25, 7);

/* 2.esDivisible() que reciba dos números enteros, mayores que cero, y
devuelva 1 si uno cualquiera de ellos es divisible por el otro, y
devuelva 0 si no son divisibles. Si alguno de los números, o los dos,
no son mayores que 0, la función devuelve -1. */

DELIMITER $$
CREATE FUNCTION esDivisible(a INT, b INT)
RETURNS INT
DETERMINISTIC
BEGIN
    IF a <= 0 OR b <= 0 THEN
        RETURN -1;
    END IF;
    IF MOD(a,b) OR MOD(b,a)  THEN
        RETURN 1;
    ELSE
        RETURN 0;
    END IF;
END $$
DELIMITER ;

SELECT esDivisible(10, 5);