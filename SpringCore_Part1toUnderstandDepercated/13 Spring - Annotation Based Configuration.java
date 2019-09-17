*******************************************************************
Spring - Annotation Based Configuration
*******************************************************************

Starting from Spring 2.5 it became possible to configure the dependency injection using annotations. 
So instead of using XML to describe a bean wiring, you can move the bean configuration into the component class itself 
by using annotations on the relevant class, method, or field declaration.

Annotation injection is performed before XML injection. Thus, the latter configuration will override the former for properties wired through both approaches
Annotation wiring is not turned on in the Spring container by default. So, before we can use annotation-based wiring, 
we will need to enable it in our Spring configuration file. So consider the following configuration file in case you want to use any annotation in your Spring application.

--------------------------------------------------------------------------------------------------------
<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xmlns:context = "http://www.springframework.org/schema/context"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
   http://www.springframework.org/schema/context
   http://www.springframework.org/schema/context/spring-context-3.0.xsd">

   <context:annotation-config/>
   <!-- bean definitions go here -->

</beans>
--------------------------------------------------------------------------------------------------------

Once <context:annotation-config/> is configured, you can start annotating your code to indicate that Spring should automatically wire values 
into properties, methods, and constructors. Let us look at a few important annotations to understand how they work −

----------------------------------------------------------------------------------------------------------------------------------------------------------
Sr.No.	Annotation & Description

1	@Required   >>>>>>>>>>>>>>>>>>>>>>>>>>>  DEPRECADO <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
The @Required annotation applies to bean property setter methods.

2	@Autowired					-----------------------> VER  Spring@AutowiredAnnotation.java <------------------------------------------
The @Autowired annotation can apply to bean property setter methods, non-setter methods, constructor and properties.

3	@Qualifier				    -----------------------> VER  Spring@QualifierAnnotation.java <------------------------------------------
The @Qualifier annotation along with @Autowired can be used to remove the confusion by specifiying which exact bean will be wired.

4	JSR-250 Annotations		   -----------------------> DEPRECADO <------------------------------------------
Spring supports JSR-250 based annotations which include @Resource, @PostConstruct and @PreDestroy annotations.
----------------------------------------------------------------------------------------------------------------------------------------------------------
















































