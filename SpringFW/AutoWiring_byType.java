********************************************************************
Spring Autowiring 'byType'
********************************************************************

This mode specifies autowiring by property type. "Spring container looks at the beans on which autowire attribute is set to byType in the XML configuration file."
It then tries to match and "wire a property if its type matches with exactly one of the beans name in the configuration file."
If matches are found, it will inject those beans. Otherwise, bean(s) will not be wired.

For example, if a bean definition is set to autowire byType in the configuration file, and it contains a spellChecker property of SpellChecker type,
Spring looks for a bean definition named SpellChecker, and uses it to set the property. Still you can wire the remaining properties using <property> tags.

The following example will illustrate the concept where you will find no difference with the above example except XML configuration file has been changed.

Let us have a working Eclipse IDE in place and take the following steps to create a Spring application −

Steps Description

1 Create a project with a name SpringExample and create a package com.tutorialspoint under the src folder in the created project.
2 Add required Spring libraries using Add External JARs option as explained in the Spring Hello World Example chapter.
3 Create Java classes TextEditor, SpellChecker and MainApp under the com.tutorialspoint package.
4 Create Beans configuration file Beans.xml under the src folder.
5 The final step is to create the content of all the Java files and Bean Configuration file and run the application as explained below.

--------------------------------------------------------------------------------
package com.tutorialspoint;

public class TextEditor {
private SpellChecker spellChecker;
private String name;

public void setSpellChecker( SpellChecker spellChecker ){
this.spellChecker = spellChecker;
}
public SpellChecker getSpellChecker() {
return spellChecker;
}
public void setName(String name) {
this.name = name;
}
public String getName() {
return name;
}
public void spellCheck() {
spellChecker.checkSpelling();
}
}
--------------------------------------------------------------------------------
Following is the content of another dependent class file SpellChecker.java

package com.tutorialspoint;

public class SpellChecker {
public SpellChecker() {
System.out.println("Inside SpellChecker constructor." );
}
public void checkSpelling() {
System.out.println("Inside checkSpelling." );
}
}
--------------------------------------------------------------------------------
package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
TextEditor te = (TextEditor) context.getBean("textEditor");
te.spellCheck();
}
}
--------------------------------------------------------------------------------
Following is the configuration file Beans.xml in normal condition −

<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation = "http://www.springframework.org/schema/beans
  http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

<!-- Definition for textEditor bean -->
<bean id = "textEditor" class = "com.tutorialspoint.TextEditor">
<property name = "spellChecker" ref = "spellChecker" />
<property name = "name" value = "Generic Text Editor" />
</bean>

<!-- Definition for spellChecker bean -->
<bean id = "spellChecker" class = "com.tutorialspoint.SpellChecker"></bean>

</beans>
-------------------------------------------------------------------------------------
But if you are going to use autowiring 'byType', then your XML configuration file will become as follows −

<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation = "http://www.springframework.org/schema/beans
  http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

<!-- Definition for textEditor bean -->
<bean id = "textEditor" class = "com.tutorialspoint.TextEditor" autowire = "byType">
<property name = "name" value = "Generic Text Editor" />
</bean>

<!-- Definition for spellChecker bean -->
<bean id = "SpellChecker" class = "com.tutorialspoint.SpellChecker"></bean>

</beans>
-----------------------------------------------------------------------------------------
Once you are done creating the source and bean configuration files, let us run the application. If everything is fine with your application, it will print the following message −

Inside SpellChecker constructor.
Inside checkSpelling.