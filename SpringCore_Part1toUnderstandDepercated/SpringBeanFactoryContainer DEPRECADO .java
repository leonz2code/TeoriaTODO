------------------------------------------------------------------------------------------
Spring BeanFactory Container
------------------------------------------------------------------------------------------

This is the simplest container providing the basic support for DI (Dependency Injection) and defined by the org.springframework.beans.factory.BeanFactory interface. 
The BeanFactory and related interfaces, such as BeanFactoryAware, InitializingBean, DisposableBean (Bean (classe) disponible), 
are still present in Spring for the purpose of backward compatibility with a large number of third-party frameworks that integrate with Spring.


There are a number of implementations of the BeanFactory interface that are come straight out-of-the-box with Spring. 
The most commonly used BeanFactory implementation is the XmlBeanFactory class. This container reads the configuration metadata from 
an XML file and uses it to create a fully configured system or application.

------ UTILIZAR BeanFactory CUANDO LOS RECURSOS SON LIMITADOS COMO LOS DE LOS DISPOSITIVOS MOVILES --------------------
The BeanFactory is usually preferred where the resources are limited like mobile devices or applet-based applications. 
Thus, use an ApplicationContext unless you have a good reason for not doing so.

***************************************
Example
***************************************
Let us take a look at a working Eclipse IDE in place and take the following steps to create a Spring application −

Steps	Description

1		Create a project with a name SpringExample and create a packagecom.tutorialspoint under the src folder in the created project.
2		Add the required Spring libraries using Add External JARs option as explained in the Spring Hello World Example chapter.
3		Create Java classes HelloWorld and MainApp under the com.tutorialspointpackage.
4		Create Beans configuration file Beans.xml under the src folder.
5		The final step is to create the content of all the Java files and Bean Configuration file. Finally, run the application as explained below.

Cimport org.springframework.beans.factory.InitializingBean; 
import org.springframework.beans.factory.xml.XmlBeanFactory;  -- ESTA CLASE ESTA DREPECADA
import org.springframework.core.io.ClassPathResource;  

public class MainApp { 
   public static void main(String[] args) { 
   
		---------------DEPRECADA DESDE 2011 EN SU LUGAR USAR  ApplicationContext context= new ClassPathXmlApplicationContext---------------
      XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beans.xml")); ("SpringHelloWorld.xml");
      HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");    
      obj.getMessage();    
   }
}   


































