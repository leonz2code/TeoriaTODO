**********************************************************************************************
Spring - Beans Auto-Wiring
**********************************************************************************************

You have learnt how to declare beans using the <bean> element and inject <bean> using <constructor-arg> and <property> elements in XML configuration file.

The Spring container can autowire relationships between collaborating beans without using <constructor-arg> and <property> elements,
which helps cut down on the amount of XML configuration you write for a big Spring-based application.

************************
Autowiring Modes
************************

Following are the "autowiring modes", which can be used to instruct the Spring container to use autowiring for dependency injection.
You use the autowire attribute of the <bean/> element to specify autowire mode for a bean definition.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Sr.No Mode & Description

1 no --------> no special info no is no <-----------
This is default setting which means no autowiring and you should use explicit bean reference for wiring. You have nothing to do special for this wiring.
This is what you already have seen in Dependency Injection chapter.

2 byName --------> VER AutoWiring_byName.java <---------
Autowiring by property name. "Spring container looks at the properties of the beans on which autowire attribute is set to byName in the XML configuration file."
It then tries to match and wire its properties with the beans defined by the same names in the configuration file.

3 byType --------> VER AutoWiring_byType.java <--------
Autowiring by property datatype. "Spring container looks at the properties of the beans on which autowire attribute is set to byType in the XML configuration file."
It then tries to match and wire a property if its type matches with exactly one of the beans name in configuration file. If more than one such beans exists,
a fatal exception is thrown.

4 constructor --------> VER AutoWiring_constructor.java <----
"Similar to byType, but type applies to constructor arguments." If there is not exactly one bean of the constructor argument type in the container, a fatal error is raised.

5 autodetect
"Spring first tries to wire using autowire by constructor, if it does not work, Spring tries to autowire by byType."

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
You can use byType or constructor autowiring mode to wire arrays and other typed-collections
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*****************************************************
Limitations with autowiring
*****************************************************

Autowiring works best when it is used consistently across a project. If autowiring is not used in general, it might be confusing
for developers to use it to wire only one or two bean definitions.
Though, autowiring can significantly reduce the need to specify properties or constructor arguments
but you should consider the limitations and disadvantages of autowiring before using them.

------------------------------------------------------------------------------------------------------------------------------
Sr.No. Limitations & Description
1
"Overriding possibility"

You can still specify dependencies using <constructor-arg> and <property> settings which will always override autowiring.

2
"Primitive data types"

You cannot autowire so-called simple properties such as primitives, Strings, and Classes.

3
"Confusing nature"

Autowiring is less exact than explicit wiring, so if possible prefer using explict wiring.
------------------------------------------------------------------------------------------------------------------------------