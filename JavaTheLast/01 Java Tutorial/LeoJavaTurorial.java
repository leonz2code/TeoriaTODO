--------------------------------------------------------------------------------------------------------------------------------
Java Core, Static_Block, Garbage_Collection, String , String_Array ,  Autoboxing_and_Unboxing
--------------------------------------------------------------------------------------------------------------------------------

HAS-A relationship.  Es cuando pasas como parametro una clase (codigo), Ej clase estudiante tiene una clase dirreccion y no al reves asi no tiene sentido
IS-A relationship.   Es herencia cuando se crea una instancia del objeto ej Class pulsar extends Class Bike y tomando esto en HAS-A Class engine. 
Association in java. Association establishes relationship between two separate classes through their objects. The relationship can be one to one, 
					 One to many, many to one and many to many.
					 mas claro con el ejemplo de abajo, el constructor de la clase hija manda con super() los parameters al constructor de la clase padre. 
Association Example
class CarClass{
   String carName;
   int carId;
   CarClass(String name, int id)
   {
	this.carName = name;
	this.carId = id;
   }
}
class Driver extends CarClass{
   String driverName;
   Driver(String name, String cname, int cid){
	super(cname, cid);
	this.driverName=name;
   }
}
class TransportCompany{
   public static void main(String args[])
   {
	Driver obj = new Driver("Andy", "Ford", 9988);
	System.out.println(obj.driverName+" is a driver of car Id: "+obj.carId);
   }
}
Output:

Andy is a driver of car Id: 9988
Composition.        is a restricted form of Aggregation in which two entities (or you can say classes) are highly dependent on each other. 
					For e.g. Human and Heart.
--------------------------------------------------------------------------------------------------------------------------------

public static void main(String[] args) {
  System.out.println("Hello World");
}

int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String

// This is a comment
System.out.println("Hello World");

/* The code below will print the words Hello World
to the screen, and it is amazing */
System.out.println("Hello World");

/* Primitive Data Types
A primitive data type specifies the size and type of variable values, and it has no additional methods. */
byte
short
int
long
float
double
boolean
char
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"

String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7


String Concatenation
// The + operator can be used between strings to add them together to make a new string. This is called concatenation:
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName);

// You can also use the concat() method to concatenate two strings:

String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));


Escape 		character		Result			
\'				'			Single quote
\"				"			Double quote
\\				\			Backslash
\n							New Line	
\r							Carriage Return	
\t							Tab	
\b							Backspace	
\f							Form Feed

Example
String txt = "We are the so-called \"Vikings\" from the north.";

Java Math

Math.max(x,y)
The Math.max(x,y) method can be used to find the highest value of x and y:

Math.min(x,y)
The Math.min(x,y) method can be used to find the lowest value of of x and y:

Math.sqrt(x)
The Math.sqrt(x) method returns the square root of x:

Math.abs(x)
The Math.abs(x) method returns the absolute (positive) value of x:

Math.random()
Math.random() returns a random number between 0 (inclusive), and 1 (exclusive): // output example 0.06611669417206012 
--------------------------------------------------------------------------------------------------------------------------------
Java Booleans
--------------------------------------------------------------------------------------------------------------------------------
Boolean Expression
A Boolean expression is a Java expression that returns a Boolean value: true or false.

You can use a comparison operator, such as the greater than (>) operator to find out if an expression (or a variable) is true:

boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isFishTasty);   // Outputs false

Ex

int x = 10;
int y = 9;
System.out.println(x > y); // returns true, because 10 is higher than 9

System.out.println(10 > 9); // returns true, because 10 is higher than 9

In the examples below, we use the equal to (==) operator to evaluate an expression:

int x = 10;
System.out.println(x == 10); // returns true, because the value of x is equal to 10

System.out.println(10 == 15); // returns false, because 10 is not equal to 15
--------------------------------------------------------------------------------------------------------------------------------
The if Statement
--------------------------------------------------------------------------------------------------------------------------------
if (condition) {
  // block of code to be executed if the condition is true
}

The if - else Statement

if (condition) {
  // block of code to be executed if the condition is true
} else { 
  // block of code to be executed if the condition is false
} 

The else if Statement

if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
--------------------------------------------------------------------------------------------------------------------------------
(Ternary Operator)
--------------------------------------------------------------------------------------------------------------------------------
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);

Java Switch Statements
Use the switch statement to select one of many code blocks to be executed.

Syntax
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
--------------------------------------------------------------------------------------------------------------------------------
Java While Loop
--------------------------------------------------------------------------------------------------------------------------------
while (condition) {
  // code block to be executed
}

The Do/While Loop
//The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
do {
  // code block to be executed
}
while (condition);
--------------------------------------------------------------------------------------------------------------------------------
Java For Loop
--------------------------------------------------------------------------------------------------------------------------------
Syntax
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
--------------------------------------------------------------------------------------------------------------------------------
For-Each Loop
//There is also a "for-each" loop, which is used exclusively to loop through elements in an array or collection

for (type variable : arrayname) {
  // code block to be executed
}
Ex
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
--------------------------------------------------------------------------------------------------------------------------------
Java Break and Continue
--------------------------------------------------------------------------------------------------------------------------------
The break statement can also be used to jump out of a loop.
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
} 

Java Continue
The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

This example skips the value of 4:

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
} 
--------------------------------------------------------------------------------------------------------------------------------
Java Arrays
--------------------------------------------------------------------------------------------------------------------------------
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

int[] myNum = {10, 20, 30, 40};

Multidimensional Arrays
A multidimensional array is an array containing one or more arrays.

To create a two-dimensional array, add each array within its own set of curly braces:

Example
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        int arr1[] =new int[5]; //an empty array

--------------------------------------------------------------------------------------------------------------------------------
Java try and catch
--------------------------------------------------------------------------------------------------------------------------------
The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

The try and catch keywords come in pairs:

try {
  //  Block of code to try
}
catch(Exception e) {
  //  Block of code to handle errors
}
--------------------------------------------------------------------------------------------------------------------------------
Finally
--------------------------------------------------------------------------------------------------------------------------------
The finally statement lets you execute code, after try...catch, regardless of the result:

Example
public class MyClass {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
  }
}
The output will be:

Something went wrong.
The 'try catch' is finished.

The throw keyword
The throw statement allows you to create a custom error.

The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.
The exception type is often used together with a custom method.
--------------------------------------------------------------------------------------------------------------------------------
Example
Throw an exception if age is below 18 (print "Access denied"). If age is 18 or older, print "Access granted":

public class MyClass {
  static void checkAge(int age) { 
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
    }
    else {
      System.out.println("Access granted - You are old enough!"); 
    }
  } 

  public static void main(String[] args) { 
    checkAge(15); // Set age to 15 (which is below 18...)
  } 
}
The output will be:

Exception in thread "main" java.lang.ArithmeticException: Access denied - You must be at least 18 years old.
        at MyClass.checkAge(MyClass.java:4)
        at MyClass.main(MyClass.java:12)
If age was 20, you would not get an exception:

Example
checkAge(20);
The output will be:

Access granted - You are old enough!
--------------------------------------------------------------------------------------------------------------------------------
Static_Block
--------------------------------------------------------------------------------------------------------------------------------
Static block is used for initializing the static variables.This block gets executed when the class is loaded in the memory. 
A class can have multiple Static blocks, which will execute in the same sequence in which they have been written into the program.

Example 1: Single static block
As you can see that both the static variables were intialized before we accessed them in the main method.

class JavaExample{
   static int num;
   static String mystr;
   static{
      num = 97;
      mystr = "Static keyword in Java";
   }
   public static void main(String args[])
   {
      System.out.println("Value of num: "+num);
      System.out.println("Value of mystr: "+mystr);
   }
}
Output:

Value of num: 97
Value of mystr: Static keyword in Java
--------------------------------------------------------------------------------------------------------------------------------
Example 2: Multiple Static blocks
Lets see how multiple static blocks work in Java. They execute in the given order which means the first static block executes before second static block. That’s the reason, values initialized by first block are overwritten by second block.

class JavaExample2{
   static int num;
   static String mystr;
   //First Static block
   static{
      System.out.println("Static Block 1");
      num = 68;
      mystr = "Block1";
  } 
  //Second static block
  static{
      System.out.println("Static Block 2");
      num = 98;
      mystr = "Block2";
  }
  public static void main(String args[])
  {
      System.out.println("Value of num: "+num);
      System.out.println("Value of mystr: "+mystr);
   }
}
Output:

Static Block 1
Static Block 2
Value of num: 98
Value of mystr: Block2
--------------------------------------------------------------------------------------------------------------------------------
Bloques de código
--------------------------------------------------------------------------------------------------------------------------------
Son el principal mecanismo de encapsulamiento y se forman con un grupo de sentencias y de otros bloques de código delimitados por una llave de apertura y una de cierre.

{ }
Por ejemplo:

{

	saludo=”Hola mundo”;

	System.out.println(saludo);//La clase System la importamos de java.lang	

}
--------------------------------------------------------------------------------------------------------------------------------
Static Class
--------------------------------------------------------------------------------------------------------------------------------
A class can be made static only if it is a nested class.

Nested static class doesn’t need reference of Outer class
A static class cannot access non-static members of the Outer class
We will see these two points with the help of an example:

Static class Example
class JavaExample{
   private static String str = "BeginnersBook";

   //Static class
   static class MyNestedClass{
	//non-static method
	public void disp() {

	   /* If you make the str variable of outer class
	    * non-static then you will get compilation error
	    * because: a nested static class cannot access non-
	    * static members of the outer class.
	    */
	   System.out.println(str); 
	}

   }
   public static void main(String args[])
   {
       /* To create instance of nested class we didn't need the outer
	* class instance but for a regular nested class you would need 
	* to create an instance of outer class first
        */
	JavaExample.MyNestedClass obj = new JavaExample.MyNestedClass();
	obj.disp();
   }
}
-----------------------------------------------------------------------------------------------------------------------------------
Garbage_Collection in Java
-----------------------------------------------------------------------------------------------------------------------------------

The process of removing unused objects from heap memory is known as Garbage collection and this is a part of memory management in Java.

	JavaExample a = new JavaExample();
	JavaExample b = new JavaExample();
	b = a;
	System.gc();  // USANDO System.gc(); PARA EXPLICITAMENTE LLAMAR A LIBERAR LA MEMORIA
	
Another example is:

char[] sayhello = { 'h', 'e', 'l', 'l', 'o'};
String str = new String(sayhello);
str = null;  // USANDO null 
Here the reference str of String class was pointing to a string “hello” in the heap memory but since we have assigned the null value to str, the object “hello” present in the heap memory is unusable.	

-----------------------------------------------------------------------------------------------------------------------------------
REPASO String ( in java is an object )
-----------------------------------------------------------------------------------------------------------------------------------
Create string 
String greeting = "Hello world!";

Char Array to String

      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
      String helloString = new String(helloArray);  
      System.out.println( helloString );
-----------------------------------------------------------------------------------------------------------------------------------
String Length
-----------------------------------------------------------------------------------------------------------------------------------
returns the number of characters contained in the string object.

public class StringDemo {

   public static void main(String args[]) {
      String palindrome = "Dot saw I was Tod";
      int len = palindrome.length();
      System.out.println( "String Length is : " + len );
   }
}
This will produce the following result −

Output
String Length is : 17
-----------------------------------------------------------------------------------------------------------------------------------
Concatenating Strings
-----------------------------------------------------------------------------------------------------------------------------------
The String class includes a method for concatenating two strings −

string1.concat(string2);
Strings are more commonly concatenated with the + operator
"Hello," + " world" + "!"
-----------------------------------------------------------------------------------------------------------------------------------
SOME String METHODS
-----------------------------------------------------------------------------------------------------------------------------------
char charAt(int index)
Returns the character at the specified index.

boolean equals(Object anObject)
Compares this string to the specified object.

int indexOf(String str)
Returns the index within this string of the first occurrence of the specified substring.

int length()
Returns the length of this string.

String replace(char oldChar, char newChar)
Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.

String replaceAll(String regex, String replacement
Replaces each substring of this string that matches the given regular expression with the given replacement.

String[] split(String regex)
Splits this string around matches of the given regular expression.

char[] toCharArray()
Converts this string to a new character array.

String toLowerCase()
Converts all of the characters in this String to lower case using the rules of the default locale.

String toUpperCase()
Converts all of the characters in this String to upper case using the rules of the default locale.

String trim()
Returns a copy of the string, with leading and trailing whitespace omitted.
-----------------------------------------------------------------------------------------------------------------------------------
String_Array 
-----------------------------------------------------------------------------------------------------------------------------------
public class JavaStringArrayTests2
{

private String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};

// our constructor; print out the String array here
public JavaStringArrayTests2()
{
// new `for` loop
for (String s: toppings)
{
System.out.println(s);
}
}

// main kicks everything off.
// create a new instance of our class here.
public static void main(String[] args)
{
new JavaStringArrayTests2();
}
}

-----------------------------------------------------------------------------------------------------------------------------------
Java Autoboxing_and_Unboxing
-----------------------------------------------------------------------------------------------------------------------------------
Java 1.5 introduced a special feature of auto conversion of primitive types to the corresponding Wrapper class and vice versa.

Autoboxing PO: Automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. 
			   For example – conversion of int to Integer, long to Long, double to Double etc.

Unboxing   OP: It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing. 
			   For example – conversion of Integer to int, Long to long, Double to double etc.

Few things you should take care:

Do not mix primitives and objects while doing comparisons. You might get unpredictable results for such comparisons. 
Better thing to do is: compare object with objects (using equals() method) and compare primitive with primitives(using logical operators such as “==”, “<” etc).
-----------------------------------------------------------------------------------------------------------------------------------
Difference between Stack vs Heap in Java

STACK - store local variables

HEAP - store objects.

1) The main difference between heap and stack is that stack memory is used to store local variables and function call while 
heap memory is used to store objects in Java. No matter, where the object is created in code e.g. as a member variable, 
local variable or class variable, they are always created inside heap space in Java.

2) Each Thread in Java has their own stack which can be specified using -Xss JVM parameter, similarly, you can also 
specify heap size of Java program using JVM option -Xms and -Xmx where -Xms is starting size of the heap and -Xmx is a maximum size of java heap

-Xms set initial Java heap size
-Xmx set maximum Java heap size
-Xss> set java thread stack size

4) If you are using Recursion, on which method calls itself, You can quickly fill up stack memory. Another difference between stack and heap is 
that size of stack memory is a lot lesser than the size of heap memory in Java.
-----------------------------------------------------------------------------------------------------------------------------------

EXTRA

Value tipes   
int myIntValue = 10;

Reference types  
anotherValue =  myIntValue;













