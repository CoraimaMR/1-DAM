/*******************************************************************************
* VALIDACIONES
*
* Ej2: Validar nombre propio con tildes y nombres compuestos.
* return nombre.matches("^([A-ZÁÉÍÓÚ]{1}[a-záéíóú]+\\s?){1,2}$");
* 
* Ej3: Valida un DNI.
* return DNI.matches("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]{1}$");
* 
* Ej4: Validar número entero (+, -).
* return entero.matches("^[-,+]?\\d+$");
* 
* Ej5: Validar un binario, octal y hexadecimal.
* return binario.matches("^[01]+$");
* return octal.matches("^[0-7]+$");
* return hexadecimal.matches("^[0-9ABCDEF]+$");
* 
* Ej6: Validar número real (+, -, decimal).
* return real.matches("^[-,+]?\\d+([\\.,]\\d+)?$");
* 
* Ej7: Validar una matrícula y una fecha.
* return matricula.matches("^\\d{4}\\s?[BCDFGHJKLMNPRSTVWXYZ]{3}$");
* return fecha.matches("^(0[1-9]|[12][0-9]|3[01])[/,-](0?[1-9]|1[0-2])[/,-](\\d{4})$");
* 
* Ej8: Validar una dirección IP.
* return IP.matches("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
* 
* Ej09: Validar un usuario de Twitter.
* return usuarioTwitter.matches("^@[A-Za-z0-9_]+$");
* 
* Ej11: Buscar en el texto macs, correos y telefonos.
* return direccionesMACs.matches("^([0-9A-Fa-f]{2}[:,-]){5}[0-9A-Fa-f]{2}$");
* return correos.matches("^[a-zA-Z0-9._%+-]+(@)[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,3}$");
* return telefonos.matches("^\\d{9}|\\d{3}(-)\\d{6}$"); 
* 
* Validar Files
* return file.matches("^[a-zA-Z0-9_\\-]+\\.txt$");
* 
*******************************************************************************/