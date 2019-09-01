****************************************************************************************************************************************************
Java Classes/Objects    instanceof
****************************************************************************************************************************************************

Cuando se crea un objeto ocurren 3 cosas:

1.- Se asigna memoria para el objeto
2.- Se inicializan los atributos de ese objeto.
3.- Se invoca al constructor de la clase que puede ser uno entre varios.
Indice.- Java_Class_Attributes,Java_Packages_API,Java_Enums,Java_User_Input,Java_Wrapper_Classes,super_keyword

Java_Class_Methods // EN ARCHIVO APARTE LeoJavaMethods.java
Java_Constructors // EN ARCHIVO APARTE LeoJavaConstructors.java
Java_Singleton_Private_Contructor // EN ARCHIVO APARTE LeoJavaSingleton_Private_Constructor
Java_Modifiers // EN ARCHIVO APARTE LeoJavaModifiers.java
Java_Encapsulation // EN ARVHIVO APARTE LeoJavaEncapsulation.java
Java_Inheritance // EN ARCHIVO APARTE LeoJavaInheritance
Java_Polymorphism // EN ARCHIVO APARTE LeoJavaPolymorphism
Java_Abstraction // EN ARCHIVO APARTE LeoJavaAbstraction.java
Java_Interface // EN ARVHIVO APARTE LeoJavaInterface.java
----------------------------------------------------------------------------------------------------------
Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, 
a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.

Create a Class

MyClass.java
Create a class called "MyClass" with a variable x:

public class MyClass {
  int x = 5;
}

Create an Object

Example
Create an object called "myObj" and print the value of x:

public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
  }
}
******************************************************************************************************************************************************
Java_Class_Attributes
******************************************************************************************************************************************************
Example
Create a class called "MyClass" with two attributes: x and y:

public class MyClass {
  int x = 5;
  int y = 3;
}
-------------------------------------------------------
Accessing Attributes
-------------------------------------------------------
You can access attributes by creating an object of the class, and by using the dot syntax (.):
The following example will create an object of the MyClass class, with the name myObj. We use the x attribute on the object to print its value:

Example
Create an object called "myObj" and print the value of x:

public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
  }
}
-------------------------------------------------------
Modify Attributes
-------------------------------------------------------
You can also modify attribute values:  // NEW 
--------------------------------------------------------------------------------------------------------------
Example
Set the value of x to 40:

public class MyClass {
  int x;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}
--------------------------------------------------------------------------------------------------------------
Or override existing values:  // NEW 
--------------------------------------------------------------------------------------------------------------
Example
Change the value of x to 25:

public class MyClass {
  int x = 10;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x); 
  }
}
--------------------------------------------------------------------------------------------------------------
If you don't want the ability to override existing values, declare the attribute as final:
--------------------------------------------------------------------------------------------------------------
Example
public class MyClass {
  final int x = 10;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x); 
  }
}
--------------------------------------------------------------------------------------------------------------
********************************************************
Multiple Objects
********************************************************
If you create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other:
--------------------------------------------------------------------------------------------------------------
Example
Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:

public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj1 = new MyClass();  // Object 1
    MyClass myObj2 = new MyClass();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}
--------------------------------------------------------------------------------------------------------------
Java_Class_Methods // EN ARCHIVO APARTE LeoJavaMethods.java

Java_Constructors // EN ARCHIVO APARTE LeoJavaConstructors.java

Java_Modifiers // EN ARCHIVO APARTE LeoJavaAccessModifiers.java

Java_Encapsulation // EN ARVHIVO APARTE LeoJavaEncapsulation.java
--------------------------------------------------------------------------------------------------------------
**************************************************************************************************************************************************************
Java_Packages_API
**************************************************************************************************************************************************************
A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, 
and to write a better maintainable code. 
Packages are divided into two categories:

Built-in Packages (packages from the Java API)
User-defined Packages (create your own packages)
----------------------------------------------------------------------
Built-in Packages
----------------------------------------------------------------------
The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment.

The library contains components for managing input, database programming, and much much more. 
The complete list can be found at Oracles website: https://docs.oracle.com/javase/8/docs/api/.

The library is divided into packages and classes. Meaning you can either import a single class (along with its methods and attributes), 
or a whole package that contain all the classes that belong to the specified package.

To use a class or a package from the library, you need to use the import keyword:

Syntax
import package.name.Class; // Import a single class 
import package.name.*; // Import the whole package
----------------------------------------------------------------------
Import a Class
----------------------------------------------------------------------
If you find a class you want to use, for example, the Scanner class, which is used to get user input, write the following code:

Example
import java.util.Scanner;

In the example above, java.util is a package, while Scanner is a class of the java.util package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, 
which is used to read a complete line:

Example
Using the Scanner class to get user input:

import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine(); 
    System.out.println("Username is: " + userName); 
  }
}
-------------------------------------------------------------------------
Import a Package 
-------------------------------------------------------------------------
There are many packages to choose from. In the previous example, we used the Scanner class from the java.util package. 
This package also contains date and time facilities, 
random-number generator and other utility classes.

To import a whole package, end the sentence with an asterisk sign (*). The following example will import ALL the classes in the java.util package:
--------------------------------------------------------------------------------------------------------------
Example
import java.util.*;
--------------------------------------------------------------------------------------------------------------
User-defined Packages
To create your own package, you need to understand that Java use a file system directory to store them. Just like folders on your computer:

Example
 └── root
  └── mypack
    └── MyPackageClass.java
To create a package, use the package keyword:
--------------------------------------------------------------------------------------------------------------
MyPackageClass.java
package mypack;

class MyPackageClass { 
  public static void main(String[] args) { 
    System.out.println("This is my package!"); 
  } 
}
--------------------------------------------------------------------------------------------------------------
Java_Inheritance // EN ARCHIVO APARTE LeoJavaInheritance
Java_Polymorphism // EN ARCHIVO APARTE LeoJavaPolymorphism
Java_inner_Class  // EN ARCHIVO APARTE LeoJavaInnerClass
Java_Abstraction // EN ARCHIVO APARTE LeoJavaAbstraction.java
Java_Interface // EN ARVHIVO APARTE LeoJavaInterface.java
-----------------------------------------------------------------------
***********************************************************************************************************************************
Java_Enums
***********************************************************************************************************************************
An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. 
Note that they should be in uppercase letters:
Example
-----------------------------------------------------------------------
enum Level {
  LOW,
  MEDIUM,
  HIGH
}
-----------------------------------------------------------------------
You can access enum constants with the dot syntax:

Level myVar = Level.MEDIUM;

Enum is short for "enumerations", which means "specifically listed".
Enum inside a Class
You can also have an enum inside a class:
-----------------------------------------------------------------------
Example
public class MyClass { 
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) { 
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar); 
  } 
}
-----------------------------------------------------------------------
The output will be:

MEDIUM

Enum in a Switch Statement
Enums are often used in switch statements to check for corresponding values:

Example
enum Level {
  LOW,
  MEDIUM,
  HIGH
}
-----------------------------------------------------------------------
public class MyClass { 
  public static void main(String[] args) {
    Level myVar = Level.MEDIUM; 

    switch(myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
         System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }
  }
}
-----------------------------------------------------------------------
The output will be:

Medium level

Loop Through an Enum
The enum type has a values() method, which returns an array of all enum constants. This method is useful when you want to loop through the constants of an enum:
-----------------------------------------------------------------------
Example
for (Level myVar : Level.values()) {
  System.out.println(myVar);
}
-----------------------------------------------------------------------
The output will be:

LOW
MEDIUM
HIGH
-----------------------------------------------------------------------
Difference between Enums and Classes
	* An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

	* An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
-----------------------------------------------------------------------
****************************************************************************************************************************************************
Why And When To Use Enums?
	* Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
****************************************************************************************************************************************************

****************************************************************************************************************************************************
Java_User_Input (Scanner)
****************************************************************************************************************************************************
The Scanner class is used to get user input, and it is found in the java.util package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. 
In our example, we will use the nextLine() method, which is used to read Strings:
----------------------------------------------------------------------------------------
Example
import java.util.Scanner;  // Import the Scanner class

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input 
  }
}
----------------------------------------------------------------------------------------
Input Types
----------------------------------------------------------------------------------------
In the example above, we used the nextLine() method, which is used to read Strings. To read other types, look at the table below:

Method					Description
	* nextBoolean()			Reads a boolean value from the user
	* nextByte()			Reads a byte value from the user
	* nextDouble()			Reads a double value from the user
	* nextFloat()			Reads a float value from the user
	* nextInt()				Reads a int value from the user
	* nextLine()			Reads a String value from the user
	* nextLong()			Reads a long value from the user
	* nextShort()			Reads a short value from the user
----------------------------------------------------------------------------------------
Example
----------------------------------------------------------------------------------------
import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name); 
    System.out.println("Age: " + age); 
    System.out.println("Salary: " + salary); 
  }
}
----------------------------------------------------------------------------------------

Java Date and Time // No agregado , ver en internet si se necesita

****************************************************************************************
Java_Wrapper_Classes
****************************************************************************************
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

The table below shows the primitive type and the equivalent wrapper class:
------------------------------------------------------------
Primitive Data Type					Wrapper Class

	* byte							Byte
	* short							Short
	* int							Integer
	* long							Long
	* float							Float
	* double						Double
	* boolean						Boolean
	* char							Character
------------------------------------------------------------

Sometimes you must use wrapper classes, for example when working with Collection objects, 
such as ArrayList, where primitive types cannot be used (the list can only store objects):
------------------------------------------------------------------------------------------------------------------------
Example
ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
------------------------------------------------------------------------------------------------------------------------
Creating Wrapper Objects
------------------------------------------------------------
To create a wrapper object, use the wrapper class instead of the primitive type. To get the value, you can just print the object:
------------------------------------------------------------
Example
public class MyClass { 
  public static void main(String[] args) { 
    Integer myInt = 5; 
    Double myDouble = 5.99; 
    Character myChar = 'A'; 
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);
  }
}
------------------------------------------------------------
Since you're now working with objects, you can use certain methods to get information about the specific object.

For example, the following methods are used to get the value associated with the corresponding wrapper object: intValue(), byteValue(), 
shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().
------------------------------------------------------------
This example will output the same result as the example above:
------------------------------------------------------------
Example
public class MyClass { 
  public static void main(String[] args) { 
    Integer myInt = 5; 
    Double myDouble = 5.99; 
    Character myChar = 'A'; 
    System.out.println(myInt.intValue());
    System.out.println(myDouble.doubleValue());
    System.out.println(myChar.charValue());
  }
}
------------------------------------------------------------
Another useful method is the toString() method, which is used to convert wrapper objects to strings. // NEW

In the following example, we convert an Integer to a String, and use the length() method of the String class to output the length of the "string":

Example
public class MyClass { 
  public static void main(String[] args) { 
    Integer myInt = 100; 
    String myString = myInt.toString();
    System.out.println(myString.length());
  }
}
------------------------------------------------------------

Java Files // NO AGREGADO SI SE NECESITA VER DESPUES 
------------------------------------------------------------
super_keyword


1) To access the data members of parent class when both parent and child class have member with same name
2) To explicitly call the no-arg and parameterized constructor of parent class
3) To access the method of parent class when child class has overridden that method.

------------------------------------------------------------
1) To access the data members of parent class when both parent and child class have member with same name
class Superclass
{
   int num = 100;
}
class Subclass extends Superclass
{
   int num = 110;
   void printNumber(){
	/* Note that instead of writing num we are
	 * writing super.num in the print statement
	 * this refers to the num variable of Superclass
	 */
	System.out.println(super.num);
   }
   public static void main(String args[]){
	Subclass obj= new Subclass();
	obj.printNumber();	
   }
}
------------------------------------------------------------
2) To explicitly call the no-arg and parameterized constructor of parent class
class Parentclass
{
   Parentclass(){
	System.out.println("Constructor of parent class");
   }
}
class Subclass extends Parentclass
{
   Subclass(){
	/* Compile implicitly adds super() here as the
	 *  first statement of this constructor.
	 */
	System.out.println("Constructor of child class");
   }
   Subclass(int num){
	/* Even though it is a parameterized constructor.
	 * The compiler still adds the no-arg super() here
	 */
	System.out.println("arg constructor of child class");
   }
   void display(){
	System.out.println("Hello!");
   }
   public static void main(String args[]){
	/* Creating object using default constructor. This 
	 * will invoke child class constructor, which will 
	 * invoke parent class constructor
	 */
	Subclass obj= new Subclass();
	//Calling sub class method 
	obj.display();
	/* Creating second object using arg constructor
	 * it will invoke arg constructor of child class which will
	 * invoke no-arg constructor of parent class automatically 
	 */
	Subclass obj2= new Subclass(10);
	obj2.display();
   }
}
Output:

Constructor of parent class
Constructor of child class
Hello!
Constructor of parent class
arg constructor of child class
Hello!
------------------------------------------------------------
Parameterized super() call to invoke parameterized constructor of parent class

We can call super() explicitly in the constructor of child class, but it would not make any sense because it would be redundant.
However when we have a constructor in parent class that takes arguments then we can use parameterized super, like super(100); 
to invoke parameterized constructor of parent class from the constructor of child class.

class Parentclass
{
   //no-arg constructor
   Parentclass(){
	System.out.println("no-arg constructor of parent class");
   }
   //arg or parameterized constructor
   Parentclass(String str){
	System.out.println("parameterized constructor of parent class");
   }
}
class Subclass extends Parentclass
{
   Subclass(){
       /* super() must be added to the first statement of constructor 
	* otherwise you will get a compilation error. Another important 
	* point to note is that when we explicitly use super in constructor
	* the compiler doesn't invoke the parent constructor automatically.  INCLUSO SIN EL SUPER JALA IGUAL TESTED
	*/
	super("Hahaha");
	System.out.println("Constructor of child class");

   }
   void display(){
	System.out.println("Hello");
   }
   public static void main(String args[]){		
	Subclass obj= new Subclass();
	obj.display();	 
   }
}
Output:

parameterized constructor of parent class
Constructor of child class
Hello
There are few important points to note in this example:
--- super()(or parameterized super must be the first statement in constructor otherwise you will get the compilation error: “Constructor call must be the first statement in a constructor”
--- When we explicitly placed super in the constructor, the java compiler didn’t call the default no-arg constructor of parent class.

------------------------------------------------------------
3) To access the method of parent class when child class has overridden that method.

When a child class declares a same method which is already present in the parent class then this is called method overriding.
However by using super keyword like this: super.method_name you can call the method of parent class.

class Parentclass
{
   //Overridden method
   void display(){
	System.out.println("Parent class method");
   }
}
class Subclass extends Parentclass
{
   //Overriding method
   void display(){
	System.out.println("Child class method");
   }
   void printMsg(){
	//This would call Overriding method
	display();
	//This would call Overridden method
	super.display();
   }
   public static void main(String args[]){		
	Subclass obj= new Subclass();
	obj.printMsg(); 
   }
}
Output:

Child class method
Parent class method

------------------------------------------------------------
What if the child class is not overriding any method: No need of super
When child class doesn’t override the parent class method then we don’t need to use the super keyword to call the parent class method. 
This is because in this case we have only one version of each method and child class has access to the parent class methods 
so we can directly call the methods of parent class without using super.

class Parentclass
{
   void display(){
	System.out.println("Parent class method");
   }
}
class Subclass extends Parentclass
{
   void printMsg(){
	/* This would call method of parent class,
	 * no need to use super keyword because no other
	 * method with the same name is present in this class
	 */
	display();
   } 
   public static void main(String args[]){
		
	Subclass obj= new Subclass();
        obj.printMsg(); 
   }
}
Output:

Parent class method

Static and dynamic binding begginersbook.com // PENDIENTE SOLO VER SI LO PREGUNTAN. 13/07/2019

Static import // se refiere a la clase que contiene el main 

Java static constructor – Is it really Possible to have them in Java? //EL HECHO ES QUE NO ESTAN PERMITIDOS EN JAVA, 

java doesn’t support static constructor?
----------------------------------------------------------------------------------------------------------------------------------
JAVA RECURSION
----------------------------------------------------------------------------------------------------------------------------------
public class RecursionExample2 {  
static int count=0;  
static void p(){  
count++;  
if(count<=5){  
System.out.println("hello "+count);  
p();  
}  
}  
public static void main(String[] args) {  
p();  
}  
}  
Output:

hello 1
hello 2
hello 3
hello 4
hello 5

----------------------------------------------------------------------------------------------------------------------------------

instanceof 


The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).

class Simple1{  
 public static void main(String args[]){  
 Simple1 s=new Simple1();  
 System.out.println(s instanceof Simple1);//true  
 }  
}  


----------------------------------------------------------------------------------------------------------------------------------































