Java Modifiers

We divide modifiers into two groups:

Access Modifiers - controls the access level
Non-Access Modifiers - do not control access level, but provides other functionality

**************************************************************************************************
Access Modifiers

For classes, you can use either public or default:

Modifier				Description	

public					The class is accessible by any other class	
default					The class is only accessible by classes in the same package. 
						This is used when you don't specify a modifier. 

For attributes, methods and constructors, you can use the one of the following:

Modifier				Description	
public					The code is accessible for all classes	
private					The code is only accessible within the declared class	
default					The code is only accessible in the same package.
protected				The code is accessible in the same package and subclasses.

**************************************************************************************************

Non-Access Modifiers

**************************************************************************************************

For classes, you can use either final or abstract:

Modifier			Description

final				The class cannot be inherited by other classes (Inheritance )	
abstract			The class cannot be used to create objects (it must be inherited from another class)

**************************************************************************************************
For attributes and methods, you can use the one of the following:

Modifier			Description

final				Attributes and methods cannot be overridden/modified
static				Attributes and methods belongs to the class, rather than an object
abstract			Can only be used in an abstract class, and can only be used on methods. 
					The method does not have a body, for example abstract void run();. 
					The body is provided by the subclass (inherited from).
transient			Attributes and methods are skipped when serializing the object containing them
synchronized		Methods can only be accessed by one thread at a time
volatile			The value of an attribute is not cached thread-locally, and is always read from the "main memory"
**************************************************************************************************
Final

If you don't want the ability to override existing attribute values, declare attributes as final:

Example
public class MyClass {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 50; // will generate an error: cannot assign a value to a final variable
    myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x); 
  }
}
**************************************************************************************************
Static

A static method means that it can be accessed without creating an object of the class, unlike public:

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
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error
    MyClass myObj = new MyClass(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
  }
}
**************************************************************************************************
Abstract
An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:

Example
// Code from filename: Person.java 
// abstract class
abstract class Person {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method 
}

// Subclass (inherit from Person)
class Student extends Person {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
// End code from filename: Person.java

// Code from filename: MyClass.java
class MyClass {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Person)
    Student myObj = new Student(); 

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}

/* Output
Name: John
Age: 24
Graduation Year: 2018
Studying all day long
*/


**************************************************************************************************

The scope of access modifiers in tabular form
------------+-------+---------+--------------+--------------+--------
            | Class | Package | Subclass     | Subclass     |Outside|
            |       |         |(same package)|(diff package)|Class  |
————————————+———————+—————————+——————————----+—————————----—+————————
public      | Yes   |  Yes    |    Yes       |    Yes       |   Yes |    
————————————+———————+—————————+—————————----—+—————————----—+————————
protected   | Yes   |  Yes    |    Yes       |    Yes       |   No  |    
————————————+———————+—————————+————————----——+————————----——+————————
default     | Yes   |  Yes    |    Yes       |    No        |   No  |
————————————+———————+—————————+————————----——+————————----——+————————
private     | Yes   |  No     |    No        |    No        |   No  |
------------+-------+---------+--------------+--------------+--------



______________________________________________________________
|           │ Class │ Package │ Subclass │ Subclass │ World  |
|           │       │         │(same pkg)│(diff pkg)│        |
|───────────┼───────┼─────────┼──────────┼──────────┼────────|
|public     │   +   │    +    │    +     │     +    │   +    | 
|───────────┼───────┼─────────┼──────────┼──────────┼────────|
|protected  │   +   │    +    │    +     │     +    │        | 
|───────────┼───────┼─────────┼──────────┼──────────┼────────|
|no modifier│   +   │    +    │    +     │          │        | 
|───────────┼───────┼─────────┼──────────┼──────────┼────────|
|private    │   +   │         │          │          │        |
|___________|_______|_________|__________|__________|________|
 + : accessible         blank : not accessible
































