use employees;

/* Tablas */
/* employees , departments , salaries , titles , dept_emp , dept_manager , hay dos views luego ver ese peks */
/* tabla - columnas */
/* employees  - ( emp_no , bith_date , first_name , last_name , gender , hire_date ) */
/* salaries - ( emp_no, salary , from_date, to_date )*/

/*Excerise - IN & NOT IN Operator - Order by*/

SELECT actor_id, first_name, last_name
FROM actor
WHERE actor_id IN (1,2,3,4,5)
ORDER BY last_name ASC;

/* query hecha por leo*/
SELECT DISTINCT *
FROM employees
WHERE gender = 'F'
GROUP BY emp_no

;



-------------------------------------------------------------------------------------------------------------
SELECT *
FROM employees
WHERE gender = 'F';


/* EJERCICIO TRIPLE INNER JOIN Y ORDER BY*/

SELECT *
FROM payment;

SELECT *
FROM customer;

SELECT *
FROM addess;


/* EJERCICO INNER JOIN */

SELECT * 
FROM employees
INNER JOIN departments;

/*LEFT JOIN Ex1* ombina los valores de la primera tabla con los valores de la segunda tabla. 
Siempre devolverá las filas de la primera tabla, incluso aunque no cumplan la condición./*/
SELECT * FROM employees
LEFT JOIN salaries
ON  salary;
/********************************************************************/

/*La sentencia SQL UNION es utilizada para acumular los resultados de dos sentencias SELECT.

Las dos sentencias SELECT tienen que tener el mismo número de columnas, con el mismo tipo de dato y en el mismo orden.*/

-- UNION ALL, UNION (DINSTINCT)

-- UNION DINSTINCT
SELECT columna1, columna2 FROM tabla1 
UNION DISTINCT
SELECT columna1, columna2 FROM tabla2;
---------------------------------------------------------------------------------------------------------
-- UNION ALL
SELECT columna1, columna2 FROM tabla1 
UNION 
SELECT columna1, columna2 FROM tabla2;
/* RIGHT JOIN Ex2*/
/*La sentencia RIGHT JOIN combina los valores de la primera tabla con los valores de la segunda tabla. 
Siempre devolverá las filas de la segunda tabla, incluso aunque no cumplan la condición.*/

/********************************************************************/
SELECT *
FROM employees emp
RIGHT JOIN salaries sal
ON emp.emp_no = sal.emp_no
WHERE emp.emp_no  IS NOT NULL ;
/********************************************************************/
SELECT *
FROM employees emp
RIGHT JOIN salaries sal
ON emp.emp_no = sal.emp_no;
/********************************************************************/

/* INNER JOIN Ex2*/
SELECT emp.first_name , 
	   emp.last_name , 
       emp.emp_no , 
       emp.gender ,
       sal.salary
FROM employees emp
INNER JOIN salaries sal
ON emp.emp_no = sal.emp_no ;
/********************************************************************/
/* INNER JOIN*/
SELECT * FROM employees
INNER JOIN salaries
ON salary;
/********************************************************************/
SELECT first_name , last_name , emp_no , gender
FROM employees;
/********************************************************************/
SELECT salary FROM salaries;
/********************************************************************/

/*
SELECT first_name , last_name , emp_no , gender
FROM employees
WHERE gender = 'F' 
GROUP BY first_name
HAVING 
ORDER BY
*/
/********************************************************************/
SELECT  *
FROM employees
ORDER BY first_name ASC;
/********************************************************************/
SELECT DISTINCT first_name, emp_no
FROM employees
ORDER BY first_name;
/********************************************************************/
SELECT count(*)
FROM departments;
/********************************************************************/
SELECT emp_no, 
	   first_name, 
       last_name, 
       hire_date

FROM employees;
/********************************************************************/
SHOW FULL TABLES FROM employees;

/********************************************************************/
SELECT * FROM employees
WHERE gender = 'M';
/********************************************************************/
SELECT * FROM departments;
/********************************************************************/


