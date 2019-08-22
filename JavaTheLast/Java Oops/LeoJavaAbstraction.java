Java Abstraction
*****************************************************************************************************************
Java Abstract Classes and Methods
*****************************************************************************************************************
// La abstraccion permite resaltar lo mas representativo de algo sin importar los detalles.
Abstraction allows highlight most reprecentavite of something regardless details.


Data abstraction is the process of hiding certain details and showing only essential information to the user. // best interview

Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods:

abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}
}

From the example above, it is not possible to create an object of the Animal class:

Animal myObj = new Animal(); // will generate an error

To access the abstract class, it must be inherited from another class. Let's convert the Animal class we used in the Polymorphism chapter to an abstract class:

Remember from the Inheritance chapter that we use the extends keyword to inherit from a class.
--------------------------------------------------------------------------
Example
// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
--------------------------------------------------------------------------
*********************************************************************************************************************************
Why And When To Use Abstract Classes and Methods?
	* To achieve security - hide certain details and only show the important details of an object.

Note: Abstraction can also be achieved with Interfaces, which you will learn more about in the next chapter.
*********************************************************************************************************************************

// EN ABSTRACCION TAMBIEN VA LAs INTERFACES en ARCHIVO INDEPENDIENTE LeoJavaIntervaces.java

Rules

Note 1:As we seen in the above example, there are cases when it is difficult or often unnecessary to implement all the methods in parent class. 
	   In these cases, we can declare the parent class as abstract, which makes it a special class which is not complete on its own.

A class derived from the abstract class must implement all those methods that are declared as abstract in the parent class.

Note 2: Abstract class cannot be instantiated which means you cannot create the object of it. To use this class, 
	    you need to create another class that extends this this class and provides the implementation of abstract methods, 
		then you can use the object of that child class to call non-abstract methods of parent class as well as 
		implemented methods(those that were abstract in parent but implemented in child class).

Note 3: If a child does not implement all the abstract methods of abstract parent class, then the child class must need to be declared abstract as well.
-----------------------------------------------------------------------------------------------------------------------------------------
Why can’t we create the object of an abstract class?

	Because these classes are incomplete, they have abstract methods that have no body,An abstract class is like a template, 
	so you have to extend it and build on it before you can use it.
-----------------------------------------------------------------------------------------------------------------------------------------
Ex Abstract con constructor Leo

abstract class MyClass {
	public MyClass() { // CONSTRUCTOR DE LA CLASE ABSTRACTA 
		System.out.println("Abstract constructor");
	}
	public void disp2() {
		System.out.println("Concrete method of parent class");
	}
}

class Demo extends MyClass{
	public void disp2() {
		System.out.println("overriding abstract method");
	}
	public static void main(String[] args) {
		Demo obj=new Demo();
				obj.disp2();
				
	//	MyClass obj1=new  MyClass(); ERROR DE COMPILACION POR SER CLASE ABSTRACTA
	}
}
-----------------------------------------------------------------------------------------------------------------------------------------



















