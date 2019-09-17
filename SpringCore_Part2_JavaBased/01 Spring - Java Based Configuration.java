*****************************************************************
Spring - Java Based Configuration
*****************************************************************

So far you have seen how we configure Spring beans using XML configuration file. If you are comfortable with XML configuration, 
then it is really not required to learn how to proceed with Java-based configuration as you are going to achieve the same result using either of the configurations available.

/*Java-based*/ configuration option enables you to write most of your Spring configuration without XML but with the help of few Java-based annotations explained in this chapter.

===============================================================
@Configuration & @Bean Annotations
===============================================================

Annotating a class with the @Configuration indicates that the class can be used by the Spring IoC container as a source of bean definitions. 
The @Bean annotation tells Spring that a method annotated with @Bean will return an object that should be registered as a bean in the Spring application context. 
The simplest possible @Configuration class would be as follows −

----------------------------------------------------------------------------------------------------------------
package com.tutorialspoint;
import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {
   @Bean 
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}
----------------------------------------------------------------------------------------------------------------

//The above code will be equivalent to the following XML configuration −

<beans>
   <bean id = "helloWorld" class = "com.tutorialspoint.HelloWorld" />
</beans>

----------------------------------------------------------------------------------------------------------------

Here, the method name is annotated with @Bean works as bean ID and it creates and returns the actual bean. 
Your configuration class can have a declaration for more than one @Bean. Once your configuration classes are defined,
you can load and provide them to Spring container using 


//AnnotationConfigApplicationContext as follows −

public static void main(String[] args) {
   ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
   
   HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
   helloWorld.setMessage("Hello World!");
   helloWorld.getMessage();
}

----------------------------------------------------------------------------------------------------------------

You can load various configuration classes as follows −

public static void main(String[] args) {
   AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

   ctx.register(AppConfig.class, OtherConfig.class);
   ctx.register(AdditionalConfig.class);
   ctx.refresh();

   MyService myService = ctx.getBean(MyService.class);
   myService.doStuff();
}
----------------------------------------------------------------------------------------------------------------
Example

Let us have a working Eclipse IDE in place and take the following steps to create a Spring application −

Steps	Description

1		Create a project with a name SpringExample and create a package com.tutorialspoint under the src folder in the created project.
2		Add required Spring libraries using Add External JARs option as explained in the Spring Hello World Example chapter.
3		Because you are using Java-based annotations, so you also need to add CGLIB.jar from your Java installation directory and ASM.jar library which can be downloaded from asm.ow2.org.
4		Create Java classes HelloWorldConfig, HelloWorld and MainApp under the com.tutorialspoint package.
5		The final step is to create the content of all the Java files and Bean Configuration file and run the application as explained below.

----------------------------------------------------------------------------------------------------------------

Here is the content of HelloWorldConfig.java file

package com.tutorialspoint;
import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {
   @Bean 
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}
----------------------------------------------------------------------------------------------------------------
Here is the content of HelloWorld.java file

package com.tutorialspoint;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}

----------------------------------------------------------------------------------------------------------------

Following is the content of the MainApp.java file

package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext ctx = 
         new AnnotationConfigApplicationContext(HelloWorldConfig.class);
   
      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
      helloWorld.setMessage("Hello World!");
      helloWorld.getMessage();
   }
}

----------------------------------------------------------------------------------------------------------------

Once you are done creating all the source files and adding the required additional libraries, let us run the application. You should note that there is no configuration file required. 
If everything is fine with your application, it will print the following message −

Your Message : Hello World!

----------------------------------------------------------------------------------------------------------------






























