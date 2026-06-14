/* BDD banco */
DROP DATABASE IF EXISTS banco;
CREATE DATABASE banco;

use banco;
DROP TABLE IF EXISTS TCLIENTE;
CREATE TABLE TCLIENTE (
	DNI INT NOT NULL PRIMARY KEY,
    LETRA CHAR(1) NULL,
    NOMBRE CHAR(80) NOT NULL,
    FCH_ALTA TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FCH_ULTIMO_ACCESO TIMESTAMP,
    SALDO DECIMAL(8,2) NOT NULL
) ENGINE = InnoDB;

DROP TABLE IF EXISTS TCUENTA;
CREATE TABLE TCUENTA (
	NUMCTA CHAR(10) NOT NULL,
    MOV DECIMAL(8,2) NOT NULL,
    FCH_MOV TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    DNI INT,
    PRIMARY KEY (NUMCTA, FCH_MOV),
    CONSTRAINT fk_CLIENTE
    FOREIGN KEY (DNI) REFERENCES TCLIENTE (DNI)
    ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE = InnoDB;

/* EJERCICIO 4 */
USE banco;
DROP FUNCTION IF EXISTS esMultiplo;

DELIMITER $$
CREATE FUNCTION esMultiplo(n1 INT, n2 INT)
RETURNS INT
DETERMINISTIC

BEGIN
    IF n1 <= 0 OR n2 <= 0 THEN
        RETURN -1;
    ELSEIF MOD(n1, n2) = 0 THEN
        RETURN 1;
    ELSE
        RETURN 0;
    END IF;
END $$
DELIMITER ;

/* EJECUCIÓN */
SELECT esMultiplo(10, 2);
SELECT esMultiplo(10, 3);
SELECT esMultiplo(-5, 2);

/* EJERCICIO 6 */
USE empresa;
DROP PROCEDURE IF EXISTS mostrarEmpleados;

DELIMITER $$
CREATE PROCEDURE mostrarEmpleados()
BEGIN
    DECLARE v_nombre VARCHAR(100);
    DECLARE v_salario DECIMAL(10,2);
    DECLARE fin INT DEFAULT 0;
    DECLARE cursorEmpleados CURSOR FOR
        SELECT NOMEM, SALAR
        FROM TEMPLE;
    DECLARE CONTINUE HANDLER FOR NOT FOUND
        SET fin = 1;
    OPEN cursorEmpleados;
    bucle: LOOP
        FETCH cursorEmpleados
        INTO v_nombre, v_salario;
        IF fin = 1 THEN
            LEAVE bucle;
        END IF;
        SELECT
            v_nombre AS Nombre,
            v_salario AS Salario;
    END LOOP;
    CLOSE cursorEmpleados;
END $$
DELIMITER ;

/* EJECUCIÓN */
/* CALL mostrarEmpleados(); */

/* EJERCICIO 7 */
USE banco;
DROP PROCEDURE IF EXISTS insertarCliente;

DELIMITER $$
CREATE PROCEDURE insertarCliente(
    IN p_dni INT,
    IN p_nombre VARCHAR(80),
    IN p_saldo DECIMAL(8,2)
)
BEGIN
    DECLARE errorDuplicado INT DEFAULT 0;
    DECLARE CONTINUE HANDLER FOR 1062
        SET errorDuplicado = 1;
    INSERT INTO TCLIENTE (
        DNI,
        NOMBRE,
        SALDO
    )
    VALUES (
        p_dni,
        p_nombre,
        p_saldo
    );
    IF errorDuplicado = 1 THEN
        SELECT 'Cliente duplicado' AS Mensaje;
    ELSE
        SELECT 'Cliente insertado correctamente' AS Mensaje;
    END IF;
END $$
DELIMITER ;

/* EJECUCIÓN */
CALL insertarCliente(1, 'Inma Mera', 1500.50);  -- Rocio cuidado aqui con las keys que da error si repites el mismo número :)
CALL insertarCliente(1, 'Coraima Mera', 1500.50);

/* EJERCICIO 8 */
USE banco;
DROP TRIGGER IF EXISTS controlNombreCliente;

DELIMITER $$
CREATE TRIGGER controlNombreCliente
BEFORE INSERT ON TCLIENTE
FOR EACH ROW
BEGIN
    SET NEW.NOMBRE = UPPER(TRIM(NEW.NOMBRE));
END $$
DELIMITER ;

/* EJECUCIÓN */
INSERT INTO TCLIENTE (DNI,NOMBRE,SALDO)
VALUES (2,'	maria lopez',2000); -- Rocio cuidado aqui con las keys que da error si repites el mismo número :)
SELECT * FROM TCLIENTE;