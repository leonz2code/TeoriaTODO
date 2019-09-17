*****************************************************************
Spring JSR-250 Annotations
*****************************************************************

Spring also supports JSR-250 based annotations which include @PostConstruct, @PreDestroy and @Resource annotations.
hough these annotations are not really required because you already have other alternates, yet let us get a brief idea about them.

--------------------------------------------------------------------------------
@PostConstruct and @PreDestroy Annotations
--------------------------------------------------------------------------------

To define the setup and teardown for a bean, we simply declare the <bean> with init-method and/or destroy-method parameters.
The init-method attribute specifies a method that is to be called on the bean immediately upon instantiation.
Similarly, the destroy-method specifies a method that is called just before a bean is removed from the container.

You can use @PostConstruct annotation as an alternate of initialization callback and @PreDestroy annotation as an alternate of destruction callback as explained in the below example.
----------------------------
Example
----------------------------
Let us have a working Eclipse IDE in place and take the following steps to create a Spring application −

Step	Description

1		Create a project with a name SpringExample and create a package com.tutorialspoint under the src folder in the created project.
2		Add required Spring libraries using Add External JARs option as explained in the Spring Hello World Example chapter.
3		Create Java classes HelloWorld and MainApp under the com.tutorialspoint package.
4		Create Beans configuration file Beans.xml under the src folder.
5		The final step is to create the content of all the Java files and Bean Configuration file and run the application as explained below.
	
-----------------------------------------------------------------------------------------
Here is the content of HelloWorld.java file −

package com.tutorialspoint;
import javax.annotation.*;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public String getMessage(){
      System.out.println("Your Message : " + message);
      return message;
   }
   
   @PostConstruct
   public void init(){
      System.out.println("Bean is going through init.");
   }
   
   @PreDestroy
   public void destroy(){
      System.out.println("Bean will destroy now.");
   }
}
-----------------------------------------------------------------------------------------

Following is the content of the MainApp.java file. Here, you need to register a shutdown hook registerShutdownHook()
method that is declared on the AbstractApplicationContext class. This will ensure a graceful shutdown and call the relevant destroy methods.

package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      context.registerShutdownHook();
   }
}

-----------------------------------------------------------------------------------------

Following is the configuration file Beans.xml required for init and destroy methods −

<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xmlns:context = "http://www.springframework.org/schema/context"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
   http://www.springframework.org/schema/context
   http://www.springframework.org/schema/context/spring-context-3.0.xsd">

   <context:annotation-config/>
   <bean id = "helloWorld" class = "com.tutorialspoint.HelloWorld"
      init-method = "init" destroy-method = "destroy">
      <property name = "message" value = "Hello World!"/>
   </bean>

</beans>
-----------------------------------------------------------------------------------------
Once you are done creating the source and bean configuration files, let us run the application. If everything is fine with your application, 
it will print the following message −

Bean is going through init.
Your Message : Hello World!
Bean will destroy now.

-----------------------------------------------------------------------------------------
















































