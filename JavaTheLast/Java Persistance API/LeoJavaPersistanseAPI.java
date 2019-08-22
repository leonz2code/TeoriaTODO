---------------------------------------------------------------------------------------------------------------------------
JPA Tutorial
---------------------------------------------------------------------------------------------------------------------------
Este tutorial ofrece una comprensión básica de cómo almacenar una copia de objetos de base de datos en memoria temporal 
utilizando JAVA Persistence API (JPA).

Audiencia
programación Java Database Connectivity, utilizando API de persistencia.

Requisitos previos
JDK 1.6 o posterior asumimos que los lectores están familiarizados con los conceptos de JDBC en Java.


---------------------------------------------------------------------------------------------------------------------------
JPA, la carga de interactuar con la base de datos reduce considerablemente. 
Constituye un puente entre los modelos de objetos (programa Java) y modelos relacionales (programa de base de datos).

-----------------------------------------------------------------------------------------------------
Las discordancias entre los modelos relacionales y objeto

Objetos relacionales están representados en un formato tabular, mientras que modelos de objetos 
son representados en un gráfico de interconexión formato de objeto. Al almacenar y recuperar un modelo de objetos 
a partir de una base de datos relacional, alguna incongruencia se produce debido a las siguientes razones:

Granularidad: 			- modelo de objetos tiene mayor nivel de detalle del modelo relacional.

Los subtipos:			- subtipos (significa herencia) no son compatibles con todos los tipos de bases de datos relacionales.

Identidad : 			- como modelo de objetos, modelo relacional no identidad, a la vez que exponer por escrito la igualdad.

Asociaciones : 			- modelos relacionales no puede determinar relaciones múltiples mientras se mira a un objeto modelo de dominio.

Navegación de datos: 	- Los datos de navegación entre objetos en un objeto red es diferente en ambos modelos.
-----------------------------------------------------------------------------------------------------
¿Qué es JPA?
Java Persistence API es un conjunto de clases y métodos que persistentemente almacenar 
la gran cantidad de datos a una base de datos que es proporcionada por Oracle Corporation.
-----------------------------------------------------------------------------------------------------
¿Dónde usar JPA?
Para reducir la carga de escribir códigos relacionales para gestión de objetos, un programador sigue el "Proveedor" marco JPA, 
que permite la fácil interacción con instancia de la base de datos. Aquí el marco necesario se realiza a través de JPA.

vease jpa_provide.jpg en la capteta de este documento

------------------------------------------------------------------------------------------------------
JPA Proveedores

APP es una API open source, por lo tanto distintos proveedores como Oracle, Redhat, Eclipse, etc. proporcionar nuevos productos 
mediante la adición de la persistencia JPA sabor en ellas. Algunos de estos productos incluyen:

Hibernate, Eclipselink, Toplink, Muelle Datos JPA, etc.


Java Persistence API es una fuente para almacenar las entidades empresariales entidades relacionales. 
Muestra cómo definir un Plain Oriented Java Object (POJO) como una entidad y la forma de gestionar las relaciones con las entidades.
------------------------------------------------------------------------------------------------------
Nivel de clase Arquitectura

La siguiente imagen muestra el nivel de clase arquitectura de JPA. Muestra las clases principales y las interfaces de JPA.

jpa_class_level_architecture.jpg en el folder de este documento

Unidades								  Descripción
EntityManagerFactory					- Esta es una clase de fábrica de EntityManager. Crea y gestiona múltiples instancias EntityManager.
EntityManager.							- Es una interfaz, que gestiona la persistencia de objetos. Funciona como instancia de consulta.
Entidad									- Las entidades son los objetos de persistencia, tiendas como registros en la base de datos.
EntityTransaction						- Tiene una relación de uno a uno con EntityManager. Para cada método EntityManager, 
										  se mantienen las operaciones de EntityTransaction clase.
Persistencia							- Esta clase contiene métodos estáticos para obtener EntityManagerFactory.
Consulta								- Esta interfaz es implementada por cada proveedor JPA relacional para obtener objetos que cumplan los criterios.
------------------------------------------------------------------------------------------------------
Las relaciones entre las clases JPA.

En la arquitectura, las relaciones entre las clases e interfaces pertenecen a la clase javax.persistence paquete. 
El siguiente diagrama muestra la relación entre ellos.

jpa_class_relationships.jpg en este folder

La relación entre EntityManagerFactory EntityManager y es de uno a varios. 
Se trata de una clase de fábrica a instancias EntityManager.

La relación entre método EntityManager y EntityTransaction es uno a uno. 
EntityManager para cada operación, hay un ejemplo EntityTransaction.

La relación entre EntityManager y consulta es de uno a varios. 
Número de consultas puede ejecutar mediante una instancia EntityManager.

La relación entre Entidad y EntityManager es uno de muchos. 
Un EntityManager instancia puede administrar varias entidades.

La mayoría de las aplicaciones utilizan bases de datos relacionales para almacenar datos. 

Recientemente, muchos proveedores de base de datos de objeto de reducir su carga de mantenimiento de datos. 
Esto significa Object Relational Mapping de base de datos o las tecnologías están al cuidado de 
almacenar, recuperar, actualizar y mantener los datos. La parte principal de este objeto es tecnología relacional 
orm mapeo.xml files. Como xml no necesitan compilación, podemos realizar cambios fácilmente a 
varias fuentes de datos con menos administración.
-------------------------------------------------------------------------------------------------------------------------------------------------------------
Object Relational Mapping
-------------------------------------------------------------------------------------------------------------------------------------------------------------
Object Relational Mapping (ORM) informa brevemente sobre lo que es ORM y cómo funciona. ORM es una capacidad de programación 
para convertir los datos de tipo de objeto de tipo relacional y viceversa.

La principal característica de ORM es de cartografía o enlazar un objeto a sus datos en la base de datos. Si bien la cartografía, 
tenemos que tener en cuenta los datos, el tipo de datos, y sus relaciones con la entidad o entidades en cualquier otra tabla.

--------------------------------------------------------------------------
Arquitectura ORM
--------------------------------------------------------------------------

El ORM arquitectura es similar al siguiente.

object_relational_mapping.jpg  En el folder de este documento

La arquitectura se explica cómo datos del objeto se almacenan en bases de datos relacionales en tres fases.
------------------------------------------------
Fase1
------------------------------------------------
La primera fase, denominada fase de datos del objeto, contiene las clases POJO, interfaces y clases. Es el principal componente de empresa de capa, 
que tiene lógica de negocios operaciones y atributos.

Por ejemplo, vamos a tener una base de datos de empleados como esquema.

	- POJO empleado clase contiene atributos como ID, nombre, salario, y designación. También contiene métodos setter y getter de esos atributos.

	- Empleado DAO/clases de servicio contienen métodos de servicio tales como crear empleado, encontrar los empleados y eliminar empleado.

Fe de Erratas ( Acronimo DAO ) EL PATRÓN DATA ACCES OBJECT (DAO) 

https://www.ecodeup.com/patrones-de-diseno-en-java-mvc-dao-y-dto/
------------------------------------------------
Fase 2
------------------------------------------------
La segunda fase, denominada fase de mapeo o persistencia JPA proveedor, contiene, archivo de mapas (ORM.xml), JPA Cargadora y rejilla de objeto.

	JPA Provider : 				- es el producto de proveedor que contiene el JPA sabor (javax.persistence). 
								  Por ejemplo Eclipselink, Toplink, hibernación, etc.

	Archivo de asignación : 	- El archivo de asignación (ORM.xml) contiene configuración de la asignación entre los datos de un 
								  POJO clase y los datos en una base de datos relacional.

	JPA Cargador cargador : 	- La APP funciona como una memoria caché. Puede cargar los datos relacionales. 
								  Funciona como una copia de base de datos para interactuar con las clases 
								  de servicio de datos POJO POJO (atributos de clase).

	Rejilla de Objeto : 		- es una ubicación temporal que puede almacenar una copia de los datos relacionales, como una memoria caché. 
								- Todas las consultas en la base de datos se efectuará, primero en los datos del objeto grid. 
								  Sólo después de que se ha comprometido, que afecta a la base de datos principal.
------------------------------------------------
Fase 3
------------------------------------------------
La tercera fase es la fase de datos relacionales. Contiene los datos relacionales que lógicamente está conectado al componente comercial. 
Como se ha indicado anteriormente, sólo cuando el componente comercial se compromete los datos, que se almacenan en la base de datos físicamente. 
Hasta entonces, los datos modificados se almacenan en una memoria caché como un formato de cuadrícula. 
El proceso de obtención de los datos es idéntica a la de almacenar los datos.

El mecanismo de la interacción mediante programación por encima de tres fases se denomina asignación objeto-relacional.

Mapping.xml
La asignación de archivo.xml es el de instruir a la JPA proveedor mapa las clases de entidad con las tablas de la base de datos.

Tomemos un ejemplo del Empleado entidad que contiene cuatro atributos. El POJO entidad clase de empleados Employee.java es la siguiente:

ver Employee.java en el folder de este archivo


El código anterior es la entidad Employee clase POJO. Contiene cuatro atributos b>eid, ename, salary, and deg. 
Considerar estos atributos como los campos de tabla en una tabla y eid como clave principal de la tabla. 
Ahora tenemos que tener en cuenta en el diseño del archivo de asignación para hibernar. 
Nombre del archivo de mapas mapping.xml es el siguiente:





















https://www.tutorialspoint.com/es/jpa/index.htm