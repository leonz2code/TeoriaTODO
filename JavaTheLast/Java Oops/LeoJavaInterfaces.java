************************************************************************************************************************
Java Interface
************************************************************************************************************************
Another way to achieve abstraction in Java, is with interfaces.

An interface is a completely "abstract class" that is used to group related methods with empty bodies:

Example
// interface

POR NOMENCLATURA STANDAR SE CREA UNA INTERFACE "CLASS" CON UNA "I" AL INICIO ex.- "ITelephone"

interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void run(); // interface method (does not have a body)
}

To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends).
The body of the interface method is provided by the "implement" class:
-----------------------------------------------------------------------------------------
Example
// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
-----------------------------------------------------------------------------------------

********************************************************************************************************************************
Notes on Interfaces:
	* Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
	* Interface methods do not have a body - the body is provided by the "implement" class
	* On implementation of an interface, you must override all of its methods
	* Interface methods are by default abstract and public
	* Interface attributes are by default public, static and final
	* An interface cannot contain a constructor (as it cannot be used to create objects)
********************************************************************************************************************************	
Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, 
because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below).
********************************************************************************************************************************
------------------------------------------------------------------------------------------
Multiple Interfaces
------------------------------------------------------------------------------------------
To implement multiple interfaces, separate them with a comma:

Example
interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

// DemoClass "implements" FirstInterface and SecondInterface
class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}
------------------------------------------------------------------------------------------------------------------------------
Nested interfaces
------------------------------------------------------------------------------------------------------------------------------
An interface which is declared inside another interface or class is called nested interface. They are also known as inner interface. 
For example Entry interface in collections framework is declared inside Map interface, that’s why we don’ use it directly, 
rather we use it like this: Map.Entry.

Key points: Here are the key points to remember about interfaces:

1) We can’t instantiate an interface in java. That means we cannot create the object of an interface
2) Interface provides full abstraction as none of its methods have body. On the other hand abstract class provides partial abstraction 
as it can have abstract and concrete(methods with body) methods both.
3) implements keyword is used by classes to implement an interface.
4) While providing implementation in class of any method of an interface, it needs to be mentioned as public.
5) Class that implements any interface must implement all the methods of that interface, else the class should be declared abstract.
6) Interface cannot be declared as private, protected or transient.
7) All the interface methods are by default abstract and public.
8) Variables declared in interface are public, static and final by default.
9) Interface variables must be initialized at the time of declaration otherwise compiler will throw an error.
10) Inside any implementation class, you cannot change the variables declared in interface because by default, they are public, static and final.

interface Try
{
   int x=10;
   public int x=10;
   public static final int x=10;
   final int x=10;
   static int x=0;
}
All of the above statements are identical.

class Sample implements Try
{
  public static void main(String args[])
  {
     x=20; //compile time error
  }
}
11) An interface can extend any interface but cannot implement it. Class implements interface and interface extends interface.
	si ponemos , se adieren interfaces y se deben poner todos sus metodos.
12) A class can implement any number of interfaces.
14) A class cannot implement two interfaces that have methods with same name but different return type.
15) Variable names conflicts can be resolved by interface name.
interface A
{
    int x=10;
}
interface B
{
    int x=100;
}
class Hello implements A,B
{
    public static void Main(String args[])
    {
       /* reference to x is ambiguous both variables are x
        * so we are using interface name to resolve the 
        * variable
        */
       System.out.println(x); 
       System.out.println(A.x);
       System.out.println(B.x);
    }
}




























