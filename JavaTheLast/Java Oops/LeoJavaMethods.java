----------------------------------------------------------------------------------------------------------------------------------
Java_Methods,Java_Class_Methods,Method_Overloading,Method_overriding,Advantage_of_method_overriding,Rules_of_method_overriding
Covariant_return_type (override)
----------------------------------------------------------------------------------------------------------------------------------
A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.

Why use methods? To reuse code: define the code once, and use it many times.

**********************************************************************************************************************************
Notas.-

metodo return en este caso el metodo sera del tipo de retorno Ex public static int myNum(){  return [int b]  }
public static String myFulldata(){  return [String str]  }

**********************************************************************************************************************************
Create a Method

A method must be declared within a class. It is defined with the name of the method, followed by parentheses (). Java provides some pre-defined methods, such as System.out.println(), but you can also create your own methods to perform certain actions:

Example
Create a method inside MyClass:

public class MyClass {
  static void myMethod() {
    // code to be executed
  }
}

Example Explained
myMethod() is the name of the method
static means that the method belongs to the MyClass class and not an object of the MyClass class.
void means that this method does not have a return value. You will learn more about return values later in this chapter

Call a Method

  public static void main(String[] args) {
    myMethod();
  }
----------------------------------------------------------------------------------------------------------------------------------
Method Parameters
----------------------------------------------------------------------------------------------------------------------------------
Information can be passed to functions as parameter. Parameters act as variables inside the method.
Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.
The following example has a method that takes a String called fname as parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name:

Example
public class MyClass {
  static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }

  public static void main(String[] args) {
    myMethod("Liam");
    myMethod("Jenny");
    myMethod("Anja");
  }
}
// Liam Refsnes
// Jenny Refsnes
// Anja Refsnes
----------------------------------------------------------------------------------------------------------------------------------
Return Values
----------------------------------------------------------------------------------------------------------------------------------
The void keyword, used in the examples above, indicates that the method should not return a value. If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
instead of void, and use the return keyword inside the method:

This example returns the sum of a method's two parameters:

Example
public class MyClass {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(5, 3));
  }
}
// Outputs 8 
//(5 + 3)

**********************************************************************************************************************************
----------------------------------------------------------------------------------------------------------------------------------
Java_Class_Methods
----------------------------------------------------------------------------------------------------------------------------------
and that they are used to perform certain actions:

Example
Create a method named myMethod() in MyClass:

public class MyClass {
  static void myMethod() {
    System.out.println("Hello World!");
  }
}
To call a method, write the method's name followed by two parentheses () and a semicolon;

Example
Inside main, call the myMethod() method:

public class MyClass {
  static void myMethod() {
    System.out.println("Hello World!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

// Outputs "Hello World!"

Static or Public
we created a static method, which means that it can be accessed without creating an object of the class
unlike public, which can only be accessed by objects:


**********************************************************************************************************************************
Example
An example to demonstrate the differences between static and public methods:

public class MyClass {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    MyClass myObj = new MyClass(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method on the object
  }
}

**********************************************************************************************************************************
Access Methods With an Object
Example
Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program:

// Create a Car class
public class Car {
 
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Car myCar = new Car();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}

// The car is going as fast as it can!
// Max speed is: 200

Example explained
1) We created a custom Car class with the class keyword.

2) We created the fullThrottle() and speed() methods in the Car class.

3) The fullThrottle() method and the speed() method will print out some text, when they are called.

4) The speed() method accepts an int parameter called maxSpeed - we will use this in 8).

5) In order to use the Car class and its methods, we need to create an object of the Car Class.

6) Then, go to the main() method, which you know by now is a built-in Java method that runs your program (any code inside main is executed).

7) By using the new keyword we created a Car object with the name myCar.

8) Then, we call the fullThrottle() and speed() methods on the myCar object, and run the program using the name of the object (myCar), followed by a dot (.), followed by the name of the method (fullThrottle(); and speed(200);). Notice that we add an int parameter of 200 inside the speed() method.

Remember that..
The dot (.) is used to access the object's attributes and methods.

To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).

A class must have a matching filename (Car and Car.java).

**********************************************************************************************************************************

Using Multiple Classes

it is a good practice to create an object of a class and access it in another class.

In this example, we have created two files in the same directory:

Car.java
OtherClass.java

Car.java
public class Car {
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
}

OtherClass.java
class OtherClass {
  public static void main(String[] args) {
    Car myCar = new Car();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}
**********************************************************************************************************************************
----------------------------------------------------------------------------------------------------------------------------------
Method_Overloading 
----------------------------------------------------------------------------------------------------------------------------------
Method Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.
similar to constructor overloading in Java,

Three ways to overload a method

In order to overload a method, the argument lists of the methods must differ in either of these:
1. Number of parameters.
For example: This is a valid case of overloading

add(int, int)
add(int, int, int)
2. Data type of parameters.
For example:

add(int, int)
add(int, float)
3. Sequence of Data type of parameters/arguments.
For example:

add(int, float)
add(float, int)
**********************************************************************************************************************************
1.
Example 1: Overloading – Different Number of parameters in argument list
This example shows how method overloading is done by having different number of parameters

class DisplayOverloading
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
class Sample
{
   public static void main(String args[])
   {
       DisplayOverloading obj = new DisplayOverloading();
       obj.disp('a');
       obj.disp('a',10);
   }
}
Output:

a
a 10
**********************************************************************************************************************************
2.
Example 2: Overloading – Difference in data type of parameters
In this example, method disp() is overloaded based on the data type of parameters – We have two methods with the name disp(), 
one with parameter of char type and another method with the parameter of int type.

class DisplayOverloading2
{
    public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(int c)
    {
       System.out.println(c );
    }
}

class Sample2
{
    public static void main(String args[])
    {
        DisplayOverloading2 obj = new DisplayOverloading2();
        obj.disp('a');
        obj.disp(5);
    }
}
Output:

a
5
**********************************************************************************************************************************
3.
Example3: Overloading – Sequence of data type of arguments/parameters
Here method disp() is overloaded based on sequence of data type of parameters – Both the methods have different sequence of data type in argument list. 
First method is having argument list as (char, int) and second is having (int, char). Since the sequence is different, the method can be overloaded without any issues.

class DisplayOverloading3
{
   public void disp(char c, int num)
   {
       System.out.println("I’m the first definition of method disp");
   }
   public void disp(int num, char c)
   {
       System.out.println("I’m the second definition of method disp" );
   }
}
class Sample3
{
   public static void main(String args[])
   {
       DisplayOverloading3 obj = new DisplayOverloading3();
       obj.disp('x', 51 );
       obj.disp(52, 'y');
   }
}
Output:

I’m the first definition of method disp
I’m the second definition of method disp
----------------------------------------------------------------------------------------------------------------------------------
**********************************************************************************************************************************
Method_overriding

Declaring a method(same name, same parameters/arguments, different statements)in sub class which is already present in parent class is known as method overriding. 
Overriding is done so that a child class can give its own implementation to a method which is already provided by the parent class
----------------------------------------------------------------------------------------------------------------------------------
Method Overriding Example

Lets take a simple example to understand this. We have two classes: A child class Boy and a parent class Human. The Boy class extends Human class. 
Both the classes have a common method void eat(). Boy class is giving its own implementation to the eat() method or in other words it is overriding the eat() method.

The purpose of Method Overriding is clear here. Child class wants to give its own implementation so that when it calls this method, it prints Boy is eating instead of Human is eating.

class Human{
   //Overridden method
   public void eat()
   {
      System.out.println("Human is eating");
   }
}
class Boy extends Human{
   //Overriding method
   public void eat(){
      System.out.println("Boy is eating");
   }
   public static void main( String args[]) {
      Boy obj = new Boy();
      //This will call the child class version of eat()
      obj.eat();
   }
}
Output:

Boy is eating
----------------------------------------------------------------------------------------------------------------------------------
Advantage_of_method_overriding
----------------------------------------------------------------------------------------------------------------------------------
The main advantage of method overriding is that the class can give its own specific implementation to a inherited method without even modifying the parent class code.

This process in which call to the overridden method is resolved at runtime is known as dynamic method dispatch. Lets see an example to understand this:

class ABC{
   //Overridden method
   public void disp()
   {
	System.out.println("disp() method of parent class");
   }	   
}
class Demo extends ABC{
   //Overriding method
   public void disp(){
	System.out.println("disp() method of Child class");
   }
   public void newMethod(){
	System.out.println("new method of child class");
   }
   public static void main( String args[]) {
	/* When Parent class reference refers to the parent class object
	 * then in this case overridden method (the method of parent class)
	 *  is called.
	 */
	ABC obj = new ABC();
	obj.disp();

	/* When parent class reference refers to the child class object
	 * then the overriding method (method of child class) is called.
	 * This is called dynamic method dispatch and runtime polymorphism
	 */
	ABC obj2 = new Demo();
	obj2.disp();
   }
}
Output:

disp() method of parent class
disp() method of Child class
In the above example the call to the disp() method using second object (obj2) is runtime polymorphism (or dynamic method dispatch).
----------------------------------------------------------------------------------------------------------------------------------
Rules_of_method_overriding in Java

1)Argument list: The argument list of overriding method (method of child class) must match the Overridden method(the method of parent class). 
The data types of the arguments and their sequence should exactly match.

2)Access Modifier of the overriding method (method of subclass) cannot be more restrictive than the overridden method of parent class. 

3)private, static and final methods cannot be overridden as they are local to the class. 

4)Overriding method (method of child class) can throw unchecked exceptions, regardless of whether the overridden method(method of parent class) 
throws any exception or not. However the overriding method should not throw checked exceptions 
that are new or broader than the ones declared by the overridden method. 

5)Binding of overridden methods happen at runtime which is known as dynamic binding.

6)If a class is extending an abstract class or implementing an interface then it has to override all the abstract methods 
unless the class itself is a abstract class.
----------------------------------------------------------------------------------------------------------------------------------
Super keyword in Method Overriding
----------------------------------------------------------------------------------------------------------------------------------
The super keyword is used for calling the parent class method/constructor. super.myMethod() calls the myMethod() method of base class while super() 
calls the constructor of base class. 

class ABC{
   public void myMethod()
   {
	System.out.println("Overridden method");
   }	   
}
class Demo extends ABC{
   public void myMethod(){
	//This will call the myMethod() of parent class
	super.myMethod();
	System.out.println("Overriding method");
   }
   public static void main( String args[]) {
	Demo obj = new Demo();
	obj.myMethod();
   }
}
Output:

Class ABC: mymethod()
Class Test: mymethod()
As you see using super keyword, we can access the overriden method.
-------------------------------------------------------------------------------------------------------------------------------------------------------
Covariant_return_type
-------------------------------------------------------------------------------------------------------------------------------------------------------
Before Java 5.0, when you override a method, both parameters and return type must match exactly. 

In Java 5.0, it introduces covariant return type
This means an overridden method may have a more specific return type.
That is, as long as the new return type is assignable to the return type of the method you are overriding, 
it's allowed.












