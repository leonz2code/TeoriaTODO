INTERFACES WITH BODY

package leonz2code.org.innerClasses;

// WE CAN USER LAMBDA EXPRESSION ONLY IF INSIDE INTERFACE WE HAVE ONE METHOD
	interface Formula{ /// FUNCTIONAL INTERFACE

	double calculate(int a); // public abstract by default
	default double sqrt(int a)
	{
	return Math.sqrt(a);
	}}

class A implements Formula{

			@Override
			public double calculate(int a) {

			//throw new UnsupportedOperationException("Not supported yet");

			System.out.println("Congrats your interface with body is working ");
			return 0;
			}}

public class Java8interfacesBody {
public static void main(String[] args) {

A obj1 = new A();

obj1.calculate(5);

		// LAMBDA STYLE INTERFACE WITH BODY
		Formula f = (int a) -> {
		System.out.println("Lamnda Style; Interface with body");
		return 5;
		};

System.out.println(f.calculate(3));

}}

--------------------------------------------------------------------------------------------------------------------
Functional Interface Example
--------------------------------------------------------------------------------------------------------------------
Predicate <T> interface is a functional interface with a method test(Object) to return a Boolean value. 
This interface signifies that an object is tested to be true or false.

Create the following Java program using any editor of your choice in, say, C:\> JAVA.

Java8Tester.java
Live Demo
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;   // ONE OF FUNCTIONAL INTERFACE 

public class Java8Tester {

   public static void main(String args[]) {
      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
      // Predicate<Integer> predicate = n -> true
      // n is passed as parameter to test method of Predicate interface
      // test method will always return true no matter what value n has.
		
      System.out.println("Print all numbers:");
		
      //pass n as parameter
      eval(list, n->true);
		
      // Predicate<Integer> predicate1 = n -> n%2 == 0
      // n is passed as parameter to test method of Predicate interface
      // test method will return true if n%2 comes to be zero
		
      System.out.println("Print even numbers:");
      eval(list, n-> n%2 == 0 );
		
      // Predicate<Integer> predicate2 = n -> n > 3
      // n is passed as parameter to test method of Predicate interface
      // test method will return true if n is greater than 3.
		
      System.out.println("Print numbers greater than 3:");
      eval(list, n-> n > 3 );
   }
	
   public static void eval(List<Integer> list, Predicate<Integer> predicate) {

      for(Integer n: list) {

         if(predicate.test(n)) {
            System.out.println(n + " ");
         }
      }
   }
}
Here we've passed Predicate interface, which takes a single input and returns Boolean.


Print all numbers:
1
2
3
4
5
6
7
8
9
Print even numbers:
2
4
6
8
Print numbers greater than 3:
4
5
6
7
8
9


Package java.util.function
Functional interfaces provide target types for lambda expressions and method references.


https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

*******************************************************************
Interface 				Summary
*******************************************************************

Interface							Description
BiConsumer<T,U>						Represents an operation that accepts two input arguments and returns no result.
BiFunction<T,U,R>					Represents a function that accepts two arguments and produces a result.
BinaryOperator<T>					Represents an operation upon two operands of the same type, producing a result of the same type as the operands.
BiPredicate<T,U>					Represents a predicate (boolean-valued function) of two arguments.
BooleanSupplier						Represents a supplier of boolean-valued results.
Consumer<T>							Represents an operation that accepts a single input argument and returns no result.
DoubleBinaryOperator				Represents an operation upon two double-valued operands and producing a double-valued result.
DoubleConsumer						Represents an operation that accepts a single double-valued argument and returns no result.
DoubleFunction<R>					Represents a function that accepts a double-valued argument and produces a result.
DoublePredicate						Represents a predicate (boolean-valued function) of one double-valued argument.
DoubleSupplier						Represents a supplier of double-valued results.
DoubleToIntFunction					Represents a function that accepts a double-valued argument and produces an int-valued result.
DoubleToLongFunction				Represents a function that accepts a double-valued argument and produces a long-valued result.
DoubleUnaryOperator					Represents an operation on a single double-valued operand that produces a double-valued result.
Function<T,R>						Represents a function that accepts one argument and produces a result.
IntBinaryOperator					Represents an operation upon two int-valued operands and producing an int-valued result.
IntConsumer							Represents an operation that accepts a single int-valued argument and returns no result.
IntFunction<R>						Represents a function that accepts an int-valued argument and produces a result.
IntPredicate						Represents a predicate (boolean-valued function) of one int-valued argument.
IntSupplier							Represents a supplier of int-valued results.
IntToDoubleFunction					Represents a function that accepts an int-valued argument and produces a double-valued result.
IntToLongFunction					Represents a function that accepts an int-valued argument and produces a long-valued result.
IntUnaryOperator					Represents an operation on a single int-valued operand that produces an int-valued result.
LongBinaryOperator					Represents an operation upon two long-valued operands and producing a long-valued result.
LongConsumer						Represents an operation that accepts a single long-valued argument and returns no result.
LongFunction<R>						Represents a function that accepts a long-valued argument and produces a result.
LongPredicate						Represents a predicate (boolean-valued function) of one long-valued argument.
LongSupplier						Represents a supplier of long-valued results.
LongToDoubleFunction				Represents a function that accepts a long-valued argument and produces a double-valued result.
LongToIntFunction					Represents a function that accepts a long-valued argument and produces an int-valued result.
LongUnaryOperator					Represents an operation on a single long-valued operand that produces a long-valued result.
ObjDoubleConsumer<T>				Represents an operation that accepts an object-valued and a double-valued argument, and returns no result.
ObjIntConsumer<T>					Represents an operation that accepts an object-valued and a int-valued argument, and returns no result.
ObjLongConsumer<T>					Represents an operation that accepts an object-valued and a long-valued argument, and returns no result.
Predicate<T>						Represents a predicate (boolean-valued function) of one argument.
Supplier<T>							Represents a supplier of results.
ToDoubleBiFunction<T,U>				Represents a function that accepts two arguments and produces a double-valued result.
ToDoubleFunction<T>					Represents a function that produces a double-valued result.
ToIntBiFunction<T,U>				Represents a function that accepts two arguments and produces an int-valued result.
ToIntFunction<T>					Represents a function that produces an int-valued result.
ToLongBiFunction<T,U>				Represents a function that accepts two arguments and produces a long-valued result.
ToLongFunction<T>					Represents a function that produces a long-valued result.
UnaryOperator<T>					Represents an operation on a single operand that produces a result of the same type as its operand.


Package java.util.function Description
Functional interfaces provide target types for lambda expressions and method references. Each functional interface has a single abstract method, 
called the functional method for that functional interface, to which the lambda expression's parameter and return types are matched or adapted. 
Functional interfaces can provide a target type in multiple contexts, such as assignment context, method invocation, or cast context:

     // Assignment context
     Predicate<String> p = String::isEmpty;

     // Method invocation context
     stream.filter(e -> e.getSize() > 10)...

     // Cast context
     stream.map((ToIntFunction) e -> e.getSize())...




