Java 8 - Default Methods

Java 8 introduces a new concept of default method implementation in interfaces. This capability is added for backward compatibility 
so that old interfaces can be used to leverage the lambda expression capability of Java 8.

For example, ‘List’ or ‘Collection’ interfaces do not have ‘forEach’ method declaration. Thus, adding such method will simply break the collection 
framework implementations. Java 8 introduces default method so that List/Collection interface can have a default implementation of forEach method, 
and the class implementing these interfaces need not implement the same.

Syntax
public interface vehicle {

   default void print() {
      System.out.println("I am a vehicle!");
   }
}
Multiple Defaults
With default functions in interfaces, there is a possibility that a class is implementing two interfaces with same default methods. 
The following code explains how this ambiguity can be resolved.

public interface vehicle {

   default void print() {
      System.out.println("I am a vehicle!");
   }
}

public interface fourWheeler {

   default void print() {
      System.out.println("I am a four wheeler!");
   }
}
First solution is to create an own method that overrides the default implementation.

public class car implements vehicle, fourWheeler {

   public void print() {
      System.out.println("I am a four wheeler car vehicle!");
   }
}
Second solution is to call the default method of the specified interface using super.

public class car implements vehicle, fourWheeler {

   default void print() {
      vehicle.super.print();
   }
}
Static Default Methods
An interface can also have static helper methods from Java 8 onwards.

public interface vehicle {

   default void print() {
      System.out.println("I am a vehicle!");
   }
	
   static void blowHorn() {
      System.out.println("Blowing horn!!!");
   }
}
Default Method Example
Create the following Java program using any editor of your choice in, say, C:\> JAVA.

Java8Tester.java
Live Demo
public class Java8Tester {

   public static void main(String args[]) {
      Vehicle vehicle = new Car();
      vehicle.print();
   }
}

interface Vehicle {

   default void print() {
      System.out.println("I am a vehicle!");
   }
	
   static void blowHorn() {
      System.out.println("Blowing horn!!!");
   }
}

interface FourWheeler {

   default void print() {
      System.out.println("I am a four wheeler!");
   }
}

class Car implements Vehicle, FourWheeler {

   public void print() {
      Vehicle.super.print();
      FourWheeler.super.print();
      Vehicle.blowHorn();
      System.out.println("I am a car!");
   }
}
Verify the Result
Compile the class using javac compiler as follows −

C:\JAVA>javac Java8Tester.java
Now run the Java8Tester as follows −

C:\JAVA>java Java8Tester
It should produce the following output −

I am a vehicle!
I am a four wheeler!
Blowing horn!!!
I am a car!



