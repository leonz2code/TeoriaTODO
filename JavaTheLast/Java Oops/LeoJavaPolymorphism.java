**************************************************************************************************************************
Java Polymorphism
**************************************************************************************************************************
Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class. 
Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

For example, think of a superclass called Animal that has a method called animalSound(). Subclasses of Animals could be Pigs, Cats, Dogs, Birds - 
And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):
---------------------------------------------------------------------------------------------------------
Example
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
---------------------------------------------------------------------------------------------------------
Remember from the Inheritance chapter that we use the extends keyword to inherit from a class.

Now we can create Pig and Dog objects and call the animalSound() method on both of them:
---------------------------------------------------------------------------------------------------------
Example
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object

    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
----------------------------------------------------------------------------------------------------------
Why And When To Use "Inheritance" and "Polymorphism"?
	* It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
----------------------------------------------------------------------------------------------------------
Types of polymorphism and method overloading & overriding are covered in the separate tutorials.

1. Method_Overloading, 2. Method_overriding  // EN ARCHIVO APARTE LeoJavaMethods.java as topic

3. Types of Polymorphism – Example 1: Runtime and Example 2: compile time 

----------------------------------------------------------------------------------------------------------
Example 1: Runtime Polymorphism example: // Override
----------------------------------------------------------------------------------------------------------

public class Animal{
   public void sound(){
      System.out.println("Animal is making a sound");   
   }
}
Horse.java

class Horse extends Animal{
    @Override
    public void sound(){
        System.out.println("Neigh");
    }
    public static void main(String args[]){
    	Animal obj = new Horse();
    	obj.sound();
    }
}
Output:

Neigh

Cat.java

public class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
    public static void main(String args[]){
    	Animal obj = new Cat();
    	obj.sound();
    }
}
Output:

Meow
----------------------------------------------------------------------------------------------------------
Example 2: Compile time Polymorphism // Overloading
----------------------------------------------------------------------------------------------------------
Method Overloading on the other hand is a compile time polymorphism example.

class Overload
{
    void demo (int a)
    {
       System.out.println ("a: " + a);
    }
    void demo (int a, int b)
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    double demo(double a) {
       System.out.println("double a: " + a);
       return a*a;
    }
}
class MethodOverloading
{
    public static void main (String args [])
    {
        Overload Obj = new Overload();
        double result;
        Obj .demo(10);
        Obj .demo(10, 20);
        result = Obj .demo(5.5);
        System.out.println("O/P : " + result);
    }
}
Here the method demo() is overloaded 3 times: first method has 1 int parameter, second method has 2 int parameters and third one is having double parameter. 
Which method is to be called is determined by the arguments we pass while calling methods. This happens at runtime compile time so this type of polymorphism 
is known as compile time polymorphism.

Output:

a: 10
a and b: 10,20
double a: 5.5
O/P : 30.25
----------------------------------------------------------------------------------------------------------




























