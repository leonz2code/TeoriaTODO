----------------------------------------------------------------------------------------------------------------
Java - Generics
----------------------------------------------------------------------------------------------------------------

Java Generic methods and generic classes enable programmers to specify, with a single method declaration, 
a set of related methods, or with a single class declaration, a set of related types, respectively.

Generics also provide compile-time type safety that allows programmers to catch invalid types at compile time.

Using Java Generic concept, we might write a generic method for sorting an array of objects, 
then invoke the generic method with Integer arrays, Double arrays, String arrays and so on, to sort the array elements.

Generic Methods
You can write a single generic method declaration that can be called with arguments of different types. 
Based on the types of the arguments passed to the generic method, the compiler handles each method call appropriately. 
Following are the rules to define Generic Methods −

	- All generic method declarations have a type parameter section delimited by angle brackets (< and >) 
	  that precedes the method's return type ( < E > in the next example).

	- Each type parameter section contains one or more type parameters separated by commas. A type parameter, 
	  also known as a type variable, is an identifier that specifies a generic type name.

	- The type parameters can be used to declare the return type and act as placeholders for the types of 
	  the arguments passed to the generic method, which are known as actual type arguments.

	- A generic method's body is declared like that of any other method. Note that type parameters can represent 
	  only reference types, not primitive types (like int, double and char).

----------------------------------------------------------------------------------------------------------------

public class GenericMethodTest {
   // generic method printArray
   public static < E > void printArray( E[] inputArray ) {
      // Display array elements
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }

   public static void main(String args[]) {
      // Create arrays of Integer, Double and Character
      Integer[] intArray = { 1, 2, 3, 4, 5 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

      System.out.println("Array integerArray contains:");
      printArray(intArray);   // pass an Integer array

      System.out.println("\nArray doubleArray contains:");
      printArray(doubleArray);   // pass a Double array

      System.out.println("\nArray characterArray contains:");
      printArray(charArray);   // pass a Character array
   }
}
This will produce the following result −

Output
Array integerArray contains:
1 2 3 4 5 

Array doubleArray contains:
1.1 2.2 3.3 4.4 

Array characterArray contains:
H E L L O

----------------------------------------------------------------------------------------------------------------
Bounded Type Parameters
----------------------------------------------------------------------------------------------------------------
There may be times when you'll want to restrict the kinds of types that are allowed to be passed to a type parameter. 
For example, a method that operates on numbers might only want to accept instances of Number or its subclasses. 
This is what bounded type parameters are for.

To declare a bounded type parameter, list the type parameter's name, followed by the extends keyword, followed by its upper bound.

Example
Following example illustrates how extends is used in a general sense to mean either "extends" (as in classes) or "implements" (as in interfaces). 
This example is Generic method to return the largest of three Comparable objects −
----------------------------------------------------------------------------------------------------------------
public class MaximumTest {
   // determines the largest of three Comparable objects
   
   public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
      T max = x;   // assume x is initially the largest
      
      if(y.compareTo(max) > 0) {
         max = y;   // y is the largest so far
      }
      
      if(z.compareTo(max) > 0) {
         max = z;   // z is the largest now                 
      }
      return max;   // returns the largest object   
   }
   
   public static void main(String args[]) {
      System.out.printf("Max of %d, %d and %d is %d\n\n", 
         3, 4, 5, maximum( 3, 4, 5 ));

      System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
         6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));

      System.out.printf("Max of %s, %s and %s is %s\n","pear",
         "apple", "orange", maximum("pear", "apple", "orange"));
   }
}
This will produce the following result −

Output
Max of 3, 4 and 5 is 5

Max of 6.6,8.8 and 7.7 is 8.8

Max of pear, apple and orange is pear
----------------------------------------------------------------------------------------------------------------
Generic Classes
----------------------------------------------------------------------------------------------------------------
A generic class declaration looks like a non-generic class declaration, except that the class name is 
followed by a type parameter section.

As with generic methods, the type parameter section of a generic class can have one or more type parameters separated by commas. 
These classes are known as parameterized classes or parameterized types because they accept one or more parameters.

Example
Following example illustrates how we can define a generic class −
----------------------------------------------------------------------------------------------------------------
public class Box<T> {
   private T t;

   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }

   public static void main(String[] args) {
      Box<Integer> integerBox = new Box<Integer>();
      Box<String> stringBox = new Box<String>();
    
      integerBox.add(new Integer(10));
      stringBox.add(new String("Hello World"));

      System.out.printf("Integer Value :%d\n\n", integerBox.get());
      System.out.printf("String Value :%s\n", stringBox.get());
   }
}
This will produce the following result −

Output
Integer Value :10
String Value :Hello World
----------------------------------------------------------------------------------------------------------------

https://www.tutorialspoint.com/java/java_generics.htm

================================================================================================================
Los generics permiten usar tipos para parametrizar las clases, interfaces y métodos al definirlas. Los beneficios son:

Comprobación de tipos más fuerte en tiempo de compilación.
Eliminación de casts aumentando la legibilidad del código.
Posibilidad de implementar algoritmos genéricos, con tipado seguro.

public interface Pair<K, V> {
  public K getKey();
  public V getValue();
}

public class OrderedPair<K, V> implements Pair<K, V> {

  private K key;
  private V value;

  public OrderedPair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() { return key; }
  public V getValue() { return value; }
}
----------------------------------------------------------------------------------------------------------------
Según las convenciones los nombres de los parámetros de tipo usados comúnmente son los siguientes:

E: elemento de una colección.
K: clave.
N: número.
T: tipo.
V: valor.
S, U, V etc: para segundos, terceros y cuartos tipos.

En el momento de la instanciación de un tipo genérico indicaremos el argumento para el tipo, en este caso Box contendrá una referencia a un tipo Integer. 
Con Java 7 se puede usar el operador diamond y el compilador inferirá el tipo según su definición para mayor claridad en el código. 
Podemos usar cualquiera de esta dos maneras prefiriendo usar el operador diamond por ser más clara.


A veces querremos limitar los tipos que pueden ser usados empleando lo que se denomina bounded type. Con <U extends Number> el tipo U debe extender la clase Number.
----------------------------------------------------------------------------------------------------------------
public class BoxBounds<T> {

  private T t;

  public void set(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }

  public <U extends Number> void inspect(U u){
    System.out.println("T: " + t.getClass().getName());
    System.out.println("U: " + u.getClass().getName());
  }

  public static void main(String[] args) {
    Box<Integer> integerBox = new Box<Integer>();
    integerBox.set(new Integer(10));
    integerBox.inspect("some text"); // error: this is still String!
  }
}
----------------------------------------------------------------------------------------------------------------
Una clase puede tener múltiples limitaciones, si una es una clase debe ser la primera y el resto de argumentos interfaces.

<T extends B1 & B2 & B3>

Class A { /* ... */ }
interface B { /* ... */ }
interface C { /* ... */ }

class D <T extends A & B & C> { /* ... */ }

Los generics tiene algunas restricciones:

No se pueden instanciar tipos genéricos con tipos primitivos.
No se pueden crear instancias de los parámetros de tipo.
No se pueden declarar campos static cuyos tipos son parámetros de tipo.
No se pueden usar casts o instanceof con tipos parametrizados.
No se pueden crear arrays de tipos parametrizados.
No se pueden crear, capturar o lanzar tipos parametrizados que extiendan de Throwable.
No se puede sobrecargar un método que tengan la misma firma que otro después del type erasure.

https://picodotdev.github.io/blog-bitix/2016/04/tutorial-sobre-los-tipos-genericos-de-java/

======================================================================================================================================================
Pair Class in Java

In C++, we have std::pair in the utility library which is of immense use if we want to keep a pair of values together. 
We were looking for an equivalent class for pair in Java but Pair class did not come into existence till Java 7. JavaFX 2.2 has the 
javafx.util.Pair class which can be used to store a pair. We need to store the values into Pair using the parameterized constructor provided by the javafx.util.Pair class.


/* Java program to find a Pair which has maximum score*/
import javafx.util.Pair; 
import java.util.ArrayList; 

class Test 
{ 
	/* This method returns a Pair which hasmaximum score*/
	public static Pair <String,Integer> 
			getMaximum(ArrayList < Pair <String,Integer> > l) 
	{ 
		// Assign minimum value initially 
		int max = Integer.MIN_VALUE; 

		// Pair to store the maximum marks of a 
		// student with its name 
		Pair <String, Integer> ans = 
						new Pair <String, Integer> ("", 0); 

		// Using for each loop to iterate array of 
		// Pair Objects 
		for (Pair <String,Integer> temp : l) 
		{ 
			// Get the score of Student 
			int val = temp.getValue(); 

			// Check if it is greater than the previous 
			// maximum marks 
			if (val > max) 
			{ 
				max = val; // update maximum 
				ans = temp; // update the Pair 
			} 
		} 
		return ans; 
	} 

	// Driver method to test above method 
	public static void main (String[] args) 
	{ 
		int n = 5;//Number of Students 

		//Create an Array List 
		ArrayList <Pair <String,Integer> > l = new ArrayList <Pair <String,Integer> > ();
		/* Create pair of name of student with their 
			corresponding score and insert into the 
			Arraylist */
		l.add(new Pair <String,Integer> ("Student A", 90)); 
		l.add(new Pair <String,Integer> ("Student B", 54)); 
		l.add(new Pair <String,Integer> ("Student C", 99)); 
		l.add(new Pair <String,Integer> ("Student D", 88)); 
		l.add(new Pair <String,Integer> ("Student E", 89)); 

		// get the Pair which has maximum value 
		Pair <String,Integer> ans = getMaximum(l); 

		System.out.println(ans.getKey() + " is top scorer " + 
						"with score of " + ans.getValue()); 
	} 
} 





