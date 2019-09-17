bueno GITLAB me hizo batallar mucho

- cambiar los nombres del ssh como los busca 

id_ed25519
id_ed25519.pub

van en la carpeta

C:\Users\leonz2code\.ssh

y al dar de alta el host ponerle "fingerprint" y luego "yes"

si no , no te da accesso
***********************************************************************************************************
Dependency Injection (DI)
***********************************************************************************************************

es cuando se suministran objetos a una clase en lugar de ser la propia clase la que cree dichos objetos. 

-----> 09 Spring - Dependency Injection.java

En mis palabras

DI  inyeccion de Dependencias

cuando le pasamos a una clase objetos en lugar que la clase los cree hay 2 variantes

1 basado en constructor , le pasamos los objetos al constructor de la clase. 

2 basado en setter , como en la abstraccion el setter se encargara de instanciar nuestro Bean 


***********************************************************************************************************
Inversion of Control (IoC) 
***********************************************************************************************************

Inversion of Control Container
El módulo Core es el más importante de Spring. Es el que provee el Contenedor IoC (Inversion of control). Este contenedor nos permite aplicar 
el patron Dependency Injection en nuestras aplicaciones.

En forma muy resumida, el objetivo del contenedor IoC es encargarse de instanciar los objetos de nuestro sistema, denominados beans, y asignarle sus dependencias. 
Para que el contenedor pueda llevar a cabo esta tarea, debemos, mediante información de configuración, indicarle dónde se encuentran dichos beans.


En mis palabras


IoC   Inversion of Control

lo veo como un container ,   algo que leera un archivo XML por ejemplo "Bean.xml" y de ahi tomara lo que necesite de las clases  , asi lo controla.

https://www.codeproject.com/Articles/592372/Dependency-Injection-DI-vs-Inversion-of-Control-IO?fbclid=IwAR07SsM7wMQ6GJ_61kXdw4vFteUwYBjfXYlt5-abRIPc2GzBYmV2kDZ4RS0

Inversion of Control ( Inversion [como invertir tiempo/diner] o la real Inversion [ Invirtio,  que se invierte]  "Control Invertido"

// LA APLICACION DEJA QUE UN AGENTE EXTERNO TOME EL CONTROL DEL FLUJO DEL PROGRAMA. 



***********************************************************************************************************
Aspect Oriented Programming (AOP)
***********************************************************************************************************


One of the key components of Spring is the Aspect Oriented Programming (AOP)
Que hacer antes, durante y después de la ejecución // segun Martin Bouriel

--------------------------------------------------------------------------------------------------
SPRING ARCHITECTURE

ver imagen spring_architecture.png

-------------------------
Core Container  EN spring_architecture.png
-------------------------

The Core Container consists of the Core, Beans, Context, and Expression Language modules the details of which are as follows −

	- The |Core module| provides the fundamental parts of the framework, including the IoC and Dependency Injection features.

	- The |Bean module| provides BeanFactory, which is a sophisticated implementation of the factory pattern.

	- The |Context module| builds on the solid base provided by the Core and Beans modules and it is a medium to access any objects defined and configured. 
	  The ApplicationContext interface is the focal point of the Context module.

	- The |SpEL module| provides a powerful expression language for querying and manipulating an object graph at runtime.
--------------------------------------------------------------------------------------------------
Data Access/Integration EN spring_architecture.png
--------------------------------------------------------------------------------------------------

The Data Access/Integration layer consists of the JDBC, ORM, OXM, JMS and Transaction modules whose detail is as follows −

	- The |JDBC module| provides a JDBC-abstraction layer that removes the need for tedious JDBC related coding.

	- The |ORM module| provides integration layers for popular object-relational mapping APIs, including JPA, JDO, Hibernate, and iBatis.

	- The |OXM module| provides an abstraction layer that supports Object/XML mapping implementations for JAXB, Castor, XMLBeans, JiBX and XStream.

	- The |Java Messaging| Service JMS module contains features for producing and consuming messages.

	- The |Transaction module| supports programmatic and declarative transaction management for classes that implement special interfaces and for all your POJOs.
	
--------------------------------------------------------------------------------------------------
Web EN spring_architecture.png
--------------------------------------------------------------------------------------------------
The Web layer consists of the Web, Web-MVC, Web-Socket, and Web-Portlet modules the details of which are as follows −

	- The |Web module| provides basic web-oriented integration features such as multipart file-upload functionality and the initialization of the 
	  IoC container using servlet listeners and a web-oriented application context.

	- The |Web-MVC module| contains Spring's Model-View-Controller (MVC) implementation for web applications.

	- The |Web-Socket| module provides support for WebSocket-based, two-way communication between the client and the server in web applications.

	- The |Web-Portlet| module provides the MVC implementation to be used in a portlet environment and mirrors the functionality of Web-Servlet module.

--------------------------------------------------------------------------------------------------
Miscellaneous
--------------------------------------------------------------------------------------------------
There are few other important modules like AOP, Aspects, Instrumentation, Web and Test modules the details of which are as follows −

	- The |AOP module| provides an aspect-oriented programming implementation allowing you to define method-interceptors and pointcuts 
	  to cleanly decouple code that implements functionality that should be separated.

	- The |Aspects module| provides integration with AspectJ, which is again a powerful and mature AOP framework.

	- The |Instrumentation module| provides class instrumentation support and class loader implementations to be used in certain application servers.

	- The |Messaging module| provides support for STOMP as the WebSocket sub-protocol to use in applications. It also supports an annotation programming model 
	  for routing and processing STOMP messages from WebSocket clients.

	- The |Test module| supports the testing of Spring components with JUnit or TestNG frameworks.

******************************************************************************************************************************************************************************************************************

https://www.tutorialspoint.com/spring/spring_hello_world_example.htm

Spring - Hello World Example
1
-----------------------------------------------------------------------------------------------------------------------------------------------------
/-- PARA LA CONFIGURACION TANTO EL commons-logging y todos los Z.Z.Z RELEASE el zip descomprimido de Spring deberan ser agregados en las Libraries 

Add Required Libraries

As a second step let us add Spring Framework and common logging API libraries in our project. To do this, right-click on your project name HelloSpring 
and then follow the following option available in the context menu − Build Path → Configure Build Path
-----------------------------------------------------------------------------------------------------------------------------------------------------

2
-----------------------------------------------------------------------------------------------------------------------------------------------------
Create Source Files
-----------------------------------------------------------------------------------------------------------------------------------------------------

Now let us create actual source files under the HelloSpring project. First we need to create a package called com.tutorialspoint. 
To do this, right click on src in package explorer section and follow the option − New → Package.

Next we will create |HelloWorld.java| and |MainApp.java| files under the com.tutorialspoint package.

-------------------------------------------------------------------------------------------------------
Here is the content of HelloWorld.java file −


package com.tutorialspoint;
				// CLASS
public class HelloWorld {
				// INSTANCE VARIABLE
   private String message;
				// SETTER
   public void setMessage(String message){
      this.message  = message;
   }
				// GETTER
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}

-------------------------------------------------------------------------------------------------------
Following is the content of the second file MainApp.java −

package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
   }
}

-------------------------------------------------------------------------------------------------------

Following two important points are to be noted about the main program −

	The first step is to create an application context where we used framework API |ClassPathXmlApplicationContext().|
	This API loads beans configuration file and eventually based on the provided API, 
	it takes care of creating and initializing all the objects, i.e. beans mentioned in the "configuration file. (Beans.xml) " --- BELOW.- --

	The second step is used to get |"the required bean using getBean() method "| of the created context. 
	This method uses bean ID to return a generic object, which finally can be casted to the actual object. 
	Once you have an object, you can use this object to call any class method.


-------------------------------------------------------------------------------------------------------
-----------------------------------------------------------
Create Bean Configuration File
-----------------------------------------------------------
	You need to create a Bean Configuration file which is an XML file and acts as a cement that glues the beans, i.e. the classes together. 
	This file needs to be created under the src directory 

	Usually developers name this file as Beans.xml, but you are independent to choose any name you like. You have to make sure that this file is available in CLASSPATH 
	and use the same name in the main application while creating an application context as shown in MainApp.java file.


	The Beans.xml is used to assign unique IDs to different beans and to control the creation of objects with different values without impacting any of the Spring source files. 
	For example, using the following file you can pass any value for "message" variable and you can print different values of message without impacting HelloWorld.java and MainApp.java files. 
	Let us see how it works −

-------------------------------------------------------------------------------------------------------
<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

   <bean id = "helloWorld" class = "com.tutorialspoint.HelloWorld">
      <property name = "message" value = "Hello World!"/>
   </bean>

</beans>
-------------------------------------------------------------------------------------------------------

	When Spring application gets loaded into the memory, Framework makes use of the above configuration file |to create all the beans defined and assigns them a unique ID as defined in <bean> tag.|
	You can use <property> tag to pass the values of different variables used at the time of object creation.


















