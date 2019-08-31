Inicio Curso
SOURCE C:/Estudio19/MySQLCourseUdemy/test_db-master/employee.sql
BEST PRACTICES

SELECT actor_id, 
	   first_name,
	   lastname

FROM
	actor;


rules sentences with CAPITAL fields with minus

para ver las tablas de una db SHOW 'FULL TABLES FROM dbname'

--------------------------------------------------------------------------------------------------------------------
other form of Select

SELECT * FROM actor; // this * is for select everithing 
SELECT * FROM rental; // other example

--------------------------------------------------------------------------------------------------------------------
Select specific column names


				//	SELET  Colum,column ,     FROM table
SELECT rental_id, 
	   customer_id, 
	   rental_date,  
	   
FROM rental; 

--------------------------------------------------------------------------------------------------------------------

COUNT  Function


SELECT COUNT(*)
FROM customer
WHERE email LIKE 


SELECT COUNT(*)
FROM actor
WHERE first_name = 'PENELOPE'; 


SELECT COUNT(PENELOPE)
FROM actor
WHERE first_name = 'PENELOPE'; 

SELECT COUNT(*)
FROM actor
GROUP BY lastname; 
( en el result set vemos la columna last_name y COUNT(*) con las coincidencias )


aggregate funcion 

that returns the count of matches ( a number )

--------------------------------------------------------------------------------------------------------------------

DISTINCT 

remover duplicados 

SELECT DISTINCT  first_name
FROM actor;


SELECT DISTINCT actor_id, first_name // buscar match entre columnas , raro no funciona con aggretate funcions como suma count etc etc
FROM actor;

--------------------------------------------------------------------------------------------------------------------

ORDER BY  keyword

SELECT actor_id, first_name, last_name
FROM actor
ORDER BY actor_id;

// asending by default

SELECT actor_id, first_name, last_name
FROM actor
ORDER BY actor_id ASC;

SELECT actor_id, first_name, last_name
FROM actor
ORDER BY actor_id DESC;

ordena SORT por la columna seleccionada

SELECT actor_id, first_name, last_name
FROM actor
ORDER BY first_name ASC, lastname DESC;
// aqui pone los nombres que coinciden en orden asendente y el apellido en desencendente

Ex.-

actor_id	first_name	last_name
132			ADAM		HOPPER
71			ADAM		GRANT

// si utilizas un numerico como actor_id no se va a ver la diferencia por que es numberico

SELECT actor_id, first_name, last_name // si consideramos como pociciones actor_id seria la numero 1 first_name 2 y last_name 3
FROM actor
ORDER BY 1 DESC;


SELECT actor_id, first_name, last_name // si consideramos como pociciones actor_id seria la numero 1 first_name 2 y last_name 3
FROM actor
ORDER BY 2, 3 DESC;

--------------------------------------------------------------------------------------------------------------------

La sentencia SQL UNION es utilizada para acumular los resultados de dos sentencias SELECT.

Las dos sentencias SELECT tienen que tener el mismo número de columnas, con el mismo tipo de dato y en el mismo orden.

Sintaxis SQL UNION

SELECT columna1, columna2 FROM tabla1 
UNION 
SELECT columna1, columna2 FROM tabla2

--------------------------------------------------------------------------------------------------------------------
FULL JOIN

La sentencia FULL JOIN combina los valores de la primera tabla con los valores de la segunda tabla. 
Siempre devolverá las filas de las dos tablas, aunque no cumplan la condición.

La sentencia FULL JOIN es la unión de LEFT JOIN y RIGHT JOIN

SELECT * FROM tabla1 FULL JOIN tabla2 WHERE tabla1.columna1 = tabla2.columna1

--------------------------------------------------------------------------------------------------------------------
INNER JOIN

La sentencia INNER JOIN es el sentencia JOIN por defecto, y consiste en combinar cada fila de una tabla con cada fila de la otra tabla, 
seleccionado aquellas filas que cumplan una determinada condición.

SELECT * FROM tabla1 INNER JOIN tabla2 WHERE tabla1.columna1 = tabla2.columna1
--------------------------------------------------------------------------------------------------------------------
WHERE


La cláusula WHERE se utiliza para hacer filtros en las consultas, es decir, seleccionar solamente algunas filas de la tabla que cumplan una determinada condición.

El valor de la condición debe ir entre comillas simples ''.

Por ejemplo:

Seleccionar las personas cuyo nombre sea ANTONIO

SELECT * FROM personas 
WHERE nombre = 'ANTONIO'

tam bien funciona con u n rango por ejemplo  si le ponemos 

>= 1  o puede ser <=3 si le pones   WHERE actor_id <> 3 no vemos el 3 es como !=

OPERADORES LOGICOS

OR

WHERE emp_name = 'Leonardo '  OR last_name = "Zepeda"

--------------------------------------------------------------------------------------------------------------------
SQL IN

El operador IN permite seleccionar múltiples valores en una cláusula WHERE

Sintaxis SQL IN

SELECT columna 
FROM tabla 
WHERE columna 
IN (valor1, valor2, valor3, .)

Ejemplo SQL IN

Dada la siguiente tabla 'personas'

nombre	apellido1	apellido2
ANTONIO	PEREZ	GOMEZ
ANTONIO	GARCIA	RODRIGUEZ
PEDRO	RUIZ	GONZALEZ
Queremos seleccionar a las personas cuyo apellido1 sea 'PEREZ' o 'RUIZ'

SELECT * FROM personas 
WHERE apellido1 
IN ('PEREZ','RUIZ')

nombre	apellido1	apellido2
ANTONIO	PEREZ	GOMEZ
PEDRO	RUIZ	GONZALEZ

SQL NOT IN

WHERE  district NOT IN ( 'asdsd', 'ddsdfsd','dedeede')   AND
	addres_in <> 8 AND  ...  so on so on so on 


--------------------------------------------------------------------------------------------------------------------
SQL BETWEEN

El operador BETWEEN se utiliza en la cláusula WHERE para seleccionar valores entre un rango de datos.

Sintaxis de SQL BETWEEN

SELECT columna 
FROM tabla WHERE columna 
BETWEEN valor1 AND valor2

Ejemplo de SQL BETWEEN

Dada la siguiente tabla 'personas'

nombre	apellido1	apellido2
ANTONIO	PEREZ	GOMEZ
ANTONIO	GARCIA	RODRIGUEZ
PEDRO	RUIZ	GONZALEZ
Seleccionar personas cuyo apellido1 esté entre 'FERNANDEZ y 'HUERTAS'

SELECT * 
FROM personas 
WHERE apellido1 
BETWEEN 'FERNANDEZ' AND 'HUERTAS'

nombre	apellido1	apellido2
ANTONIO	GARCIA	RODRIGUEZ
Seleccionar personas cuyo apellido1 no esté entre 'FERNANDEZ y 'HUERTAS'

SELECT * 
FROM personas 
WHERE apellido1 
NOT BETWEEN 'FERNANDEZ' AND 'HUERTAS'

nombre	apellido1	apellido2
ANTONIO	PEREZ	GOMEZ
PEDRO	RUIZ	GONZALEZ

--------------------------------------------------------------------------------------------------------------------
LAS PELIGROSAS        BEGIN
--------------------------------------------------------------------------------------------------------------------
SQL DELETE

La sentencia DELETE sirve para borrar filas de una tabla.

La sintaxis de SQL DELETE es:

DELETE FROM nombre_tabla 
WHERE nombre_columna = valor

Si queremos borrar todos los registros o filas de una tabla, se utiliza la sentencia:

DELETE * FROM nombre_tabla;

Ejemplo de SQL DELETE para borrar una fila de la tabla personas

nombre	apellido1	apellido2
ANTONIO	PEREZ	GOMEZ
LUIS	LOPEZ	PEREZ
ANTONIO	GARCIA	RODRIGUEZ
PEDRO	RUIZ	GONZALEZ
Si queremos borrar a la persona LUIS LOPEZ PEREZ, podemos ejecutar el comando:

DELETE FROM personas 
WHERE nombre = 'LUIS' 
AND apellido1 = 'LOPEZ' 
AND apellido2 = 'PEREZ' 
La tabla 'personas' resultante será:

nombre	apellido1	apellido2
ANTONIO	PEREZ	GOMEZ
ANTONIO	GARCIA	RODRIGUEZ
PEDRO	RUIZ	GONZALEZ
--------------------------------------------------------------------------------------------------------------------
SQL TRUNCATE 

Este comando SQL TRUNCATE se utiliza para eliminar o borrar los datos que contiene una tabla.

Es útil cuando sólo se quiere borrar los datos, pero no se quiere borrar la tabla.

Este comando deja vacía una tabla, es decir, sin datos.

TRUNCATE TABLE nombretabla

--------------------------------------------------------------------------------------------------------------------
SQL DROP

La sentencia DROP se utiliza para borrar definitivamente un índice, tabla o base de datos.

DROP INDEX

Sintaxis DROP INDEX para MySQL

ALTER TABLE nombretabla 
DROP INDEX nombreindice

Sintaxis DROP INDEX para DB2 y ORACLE

DROP INDEX nombreindice

Sintaxis DROP INDEX para ACCESS

DROP INDEX nombreindice 
ON nombretabla

Sintaxis DROP INDEX para SQLSERVER

DROP INDEX nombretabla.nombreindice

DROP TABLE

Se utiliza DROP TABLE para borrar definitivamente una tabla

DROP TABLE nombretabla

DROP DATABASE

Se utiliza para borrar una base de datos definitivamente.

DROP DATABASE nombrebasededatos

--------------------------------------------------------------------------------------------------------------------
LAS PELIGROSAS        END
--------------------------------------------------------------------------------------------------------------------

DATE function

DateAdd Funtion

TIMESTAMP Function

SELECT SUM

GROUP BY

MIN AND MAX

AVG 







