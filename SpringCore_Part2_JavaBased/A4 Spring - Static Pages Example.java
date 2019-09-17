Spring - Static Pages Example


The following example shows how to write a simple web-based application using Spring MVC Framework, which can access static pages along with dynamic pages with the help of <mvc:resources> tag. 
To start with, let us have a working Eclipse IDE in place and take the following steps to develope a Dynamic Form based Web Application using Spring Web Framework −

Step	Description

1		Create a Dynamic Web Project with a name HelloWeb and create a package com.tutorialspoint under the src folder in the created project.
2		Drag and drop below mentioned Spring and other libraries into the folder WebContent/WEB-INF/lib.
3		Create a Java class WebController under the com.tutorialspoint package.
4		Create Spring configuration files Web.xml and HelloWeb-servlet.xml under the WebContent/WEB-INF folder.
5		Create a sub-folder with a name jsp under the WebContent/WEB-INF folder. Create a view file index.jsp under this sub-folder.
6		Create a sub-folder with a name pages under the WebContent/WEB-INF folder. Create a static file final.htm under this sub-folder.
7		The final step is to create the content of all the source and configuration files and export the application as explained below.

Here is the content of WebController.java file

package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
   @RequestMapping(value = "/index", method = RequestMethod.GET)
   public String index() {
      return "index";
   }
   @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
   public String redirect() {
      return "redirect:/pages/final.htm";
   }
}
Following is the content of Spring Web configuration file web.xml

<web-app id = "WebApp_ID" version = "2.4"
   xmlns = "http://java.sun.com/xml/ns/j2ee" 
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://java.sun.com/xml/ns/j2ee 
   http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">
 
   <display-name>Spring Page Redirection</display-name>
 
   <servlet>
      <servlet-name>HelloWeb</servlet-name>
      <servlet-class>
         org.springframework.web.servlet.DispatcherServlet
      </servlet-class>
      <load-on-startup>1</load-on-startup>
   </servlet>
   
   <servlet-mapping>
      <servlet-name>HelloWeb</servlet-name>
      <url-pattern>/</url-pattern>
   </servlet-mapping>
  
</web-app>
Following is the content of another Spring Web configuration file HelloWeb-servlet.xml

<?xml version = "1.0" encoding = "UTF-8"?>
<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance" 
   xmlns:context = "http://www.springframework.org/schema/context"
   xmlns:mvc = "http://www.springframework.org/schema/mvc"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-2.5.xsd
   http://www.springframework.org/schema/mvc
   http://www.springframework.org/schema/mvc/spring-mvc-3.0.xsd
   http://www.springframework.org/schema/context
   http://www.springframework.org/schema/context/spring-context-3.0.xsd">
 
   <context:component-scan base-package="com.tutorialspoint" />
     
   <bean id = "viewResolver" 
      class = "org.springframework.web.servlet.view.InternalResourceViewResolver">
      
      <property name = "prefix" value = "/WEB-INF/jsp/" />
      <property name = "suffix" value = ".jsp" />
   </bean>
    
   <mvc:resources mapping = "/pages/**" location = "/WEB-INF/pages/" />
   <mvc:annotation-driven/>
    
</beans>
Here <mvc:resources..../> is being used to map static pages. The mapping attribute must be an Ant pattern that specifies the URL pattern of an http requests. The location attribute must specify one or more valid resource directory locations 
having static pages including images, stylesheets, JavaScript, and other static content. Multiple resource locations may be specified using a comma-seperated list of values.

Following is the content of Spring view file WEB-INF/jsp/index.jsp. This will be a landing page; this page will send a request to access staticPage service method, which will redirect this request to a static page available in WEB-INF/pages folder.

<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring Landing Page</title>
   </head>

   <body>
      <h2>Spring Landing Pag</h2>
      <p>Click below button to get a simple HTML page</p>
      
      <form:form method = "GET" action = "/HelloWeb/staticPage">
         <table>
            <tr>
               <td>
                  <input type = "submit" value = "Get HTML Page"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
   
</html>
Following is the content of Spring view file WEB-INF/pages/final.htm.

<html>
   <head>
      <title>Spring Static Page</title>
   </head>

   <body>
      <h2>A simple HTML page</h2>
   </body>
</html>
Finally, following is the list of Spring and other libraries to be included in your web application. You simply drag these files and drop them in WebContent/WEB-INF/lib folder.

commons-logging-x.y.z.jar
org.springframework.asm-x.y.z.jar
org.springframework.beans-x.y.z.jar
org.springframework.context-x.y.z.jar
org.springframework.core-x.y.z.jar
org.springframework.expression-x.y.z.jar
org.springframework.web.servlet-x.y.z.jar
org.springframework.web-x.y.z.jar
spring-web.jar
Once you are done creating the source and configuration files, export your application. Right-click on your application and use Export > WAR File option and save your HelloWeb.war file in Tomcat's webapps folder.

Now start your Tomcat server and make sure you are able to access other web pages from webapps folder using a standard browser. Now try to access the URL http://localhost:8080/HelloWeb/index. If everything is fine with your Spring Web Application, you should see the following result −

ver spring_static_page.png

Click the "Get HTML Page" button to access a static page mentioned in staticPage service method. If everything is fine with your Spring Web Application, you should see the following result.

ver spring_static_page_result.png







































