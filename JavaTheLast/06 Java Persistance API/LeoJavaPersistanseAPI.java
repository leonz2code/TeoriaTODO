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

******************
Mapping.xml
******************

La asignación de archivo.xml es el de instruir a la JPA proveedor mapa las clases de entidad con las tablas de la base de datos.

Tomemos un ejemplo del Empleado entidad que contiene cuatro atributos. El POJO entidad clase de empleados Employee.java es la siguiente:

-----------------------------------------------
ver Employee.java en el folder de este archivo
-----------------------------------------------

El código anterior es la entidad Employee clase POJO. Contiene cuatro atributos b>eid, ename, salary, and deg. 
Considerar estos atributos como los campos de tabla en una tabla y eid como clave principal de la tabla. 
Ahora tenemos que tener en cuenta en el diseño del archivo de asignación para hibernar. 
Nombre del archivo de mapas mapping.xml es el siguiente:
****************************************************************************************
<? xml version="1.0" encoding="UTF-8" ?>

<entity-mappings xmlns="http://java.sun.com/xml/ns/persistence/orm"
   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation="http://java.sun.com/xml/ns/persistence/orm    
   http://java.sun.com/xml/ns/persistence/orm_1_0.xsd"
   version="1.0">
   
   <description> XML Mapping file</description>
   
   <entity class="Employee">        
      <table name="EMPLOYEETABLE"/>
      
      <attributes>
         <id name="eid">
            <generated-value strategy="TABLE"/>
         </id>
         
         <basic name="ename">
            <column name="EMP_NAME" length="100"/>
         </basic>
         
         <basic name="salary">
         </basic>
         
         <basic name="deg">
         </basic>
      </attributes>
      
   </entity>
</entity-mappings>
****************************************************************************************
La secuencia de comandos anterior se utiliza para la cartografía de la clase de entidad con la tabla de la base de datos. En este archivo


<entity-mappings> :		 etiqueta define la definición de esquema para permitir etiquetas de entidad en archivo xml.

<description> :			 etiqueta ofrece una descripción acerca de la aplicación.

<entity> : 				 etiqueta define la clase de entidad que desea convertir en una tabla en una base de datos. Clase de atributo POJO define el nombre de la clase de entidad.

<table> : 				 etiqueta define el nombre de la tabla. Si desea tener nombres idénticos tanto para la clase, así como la tabla y, a continuación, esta etiqueta no es necesario.

<attributes> : 			 etiqueta define los atributos (campos de una tabla).

<id> :					 etiqueta define la clave principal de la tabla. El <genera valor de etiqueta> define cómo asignar el valor de la clave principal como automática, manual o de secuencia.

<basic> : 				 etiqueta se utiliza para definir los atributos de la tabla.

<column-name> :			 etiqueta se usa para definir tabla definidas por el usuario nombres de campo en la tabla.

--------------------------------------------------------------------------------------
Las anotaciones
--------------------------------------------------------------------------------------

Por lo general se utilizan archivos xml para configurar los componentes específicos, o asignación de dos diferentes especificaciones de los componentes. En nuestro caso, tenemos que mantener archivos xml 
por separado en un marco. Eso significa que al escribir un archivo de asignación xml, necesitamos comparar los atributos de clase POJO con las etiquetas de la entidad en el archivo mapping.xml.

Aquí está la solución. En la definición de la clase, podemos escribir la configuración con anotaciones. Las anotaciones se utilizan para las clases, propiedades y métodos. 
Las anotaciones comienzan con " @" el símbolo. Las anotaciones son declarados antes de una clase, propiedad o método. Todas las anotaciones de JPA se definen en el javax.persistence paquete

Aquí lista de anotaciones utilizadas en nuestros ejemplos se dan a continuación.


Anotación					 Descripción

@Entidad                     Declara la clase como una entidad o una tabla.					
@Tabla                       Declara nombre de la tabla.					
@Basic                       Especifica no campos de restricción explícita.	
@Embedded                    Especifica las propiedades de la clase o de una entidad cuyo valor es una instancia de una clase se puede incrustar.
@Id                          Especifica la propiedad, el uso de la identidad (la clave principal de una tabla de la clase.
@GeneratedValue              Especifica el modo en que la identidad se puede inicializar atributo como automática, manual o valor tomado de la tabla de secuencias.
@Transitorios                Especifica la propiedad que no es constante, es decir, el valor nunca se almacena en la base de datos.
@Columna                     Especifica el atributo de columna para la propiedad persistence.
@SequenceGenerator           Especifica el valor de la propiedad que se especifica en la anotación @GeneratedValue. Crea una secuencia.
@TableGenerator              Especifica el generador de valor para la propiedad especificada en la anotación @GeneratedValue. Crea una tabla de generación de valor.
@AccessType                  Este tipo de anotación se utiliza para establecer el tipo de acceso. Si establece el valor de @métodos Accesstype() y formattype() CAMPO), 
							 luego se produce acceso Campo sabio.Si establece el valor de @métodos Accesstype() y formattype() PROPIEDAD), a continuación,
@JoinColumn                  Especifica la entidad asociación o entidad colección. Esto se utiliza en muchos a uno y uno a muchas asociaciones.
@UniqueConstraint            Especifica los campos y las restricciones unique para la primaria o la secundaria.
@ColumnResult                Hace referencia al nombre de una columna de la consulta SQL que utiliza cláusula select.
@ManyToMany                  Define una relación many_to_many entre el unir tablas.
@ManyToOne                   Define una relación de many_to_one entre el unir tablas.
@OneToMany                   Define una relación one_to_many entre los unir tablas.
@OneToOne                    Define una relación one_to_one entre los unir tablas.
@NamedQueries                Especifica la lista de consultas con nombre.
@NamedQuery                  Especifica una consulta con nombre está

---------------------------------
Estándar Java Bean
---------------------------------

La clase Java encapsula los valores de instancia y sus comportamientos en una sola unidad llamada objeto. Java Bean es un almacenamiento temporal y componentes reutilizables o de un objeto. 
Se trata de una clase serializable que tiene un constructor predeterminado y métodos get y set para inicializar los atributos de la instancia individual.

--------------------
Bean Convenios
--------------------

Frijol contiene su constructor predeterminado o un archivo que contiene serializa la instancia. Por lo tanto, un frijol puede crear una instancia de otro grano.
==========================================================================================================================================================================================================================
Las propiedades de un frijol pueden ser segregadas en propiedades booleanas o no booleano.
==========================================================================================================================================================================================================================
Propiedad booleanos no contiene getter y setter métodos.
==========================================================================================================================================================================================================================
Propiedad booleana contienen setter y es método.
==========================================================================================================================================================================================================================
Getter método de cualquier propiedad debe comenzar con pequeñas Letras get (java method convention) y continuó con un nombre de campo que comienza con mayúscula. 
Por ejemplo, el nombre del campo es salario por tanto el método getter de este campo es getSalary ().
==========================================================================================================================================================================================================================
Setter método de cualquier propiedad debe comenzar con pequeñas Letras set (java method convention), continuó con un nombre de campo que comienza con letra mayúscula y el argument value para establecer en campo. 
or ejemplo, el nombre del campo es salario por tanto el método setter de este campo es setSalary ( double sal ).
==========================================================================================================================================================================================================================
Para propiedad booleana, is método para comprobar si es verdadero o falso. Por ejemplo la propiedad booleana vacío, el es método de este campo es isEmpty ().


AL ENTENDER EL EJEMPLO SEGUIR EN 

JPA - JPQL


VER EJEMPLO JPA EN 

REPOSITORIO TestandPractices/IntroductionToJPA
\IntroductionToJPA\src\leonz2dbcode\org\intro 



https://www.tutorialspoint.com/jpa/jpa_installation.htm