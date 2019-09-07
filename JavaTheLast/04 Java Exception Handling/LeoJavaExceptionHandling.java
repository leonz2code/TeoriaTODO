----------------------------------------------------------------------------------------------------------------------------------------------------
Exception handling in java  Custom_Exception
----------------------------------------------------------------------------------------------------------------------------------------------------
handle the runtime errors caused by exceptions.

What is an exception?

An Exception is an unwanted event that interrupts the normal flow of the program. 

Why an exception occurs?

There can be several reasons that can cause a program to throw exception. For example: Opening a non-existing file in your program, 
Network connection problem, bad input data provided by user etc.
----------------------------------------------------------------------------------------------------------------------------------------------------
Exception Handling
----------------------------------------------------------------------------------------------------------------------------------------------------
If an exception occurs, which has not been handled by programmer then program execution gets terminated and a system generated error message is shown to the user.

Advantage of exception handling

Exception handling ensures that the flow of the program doesn’t break when an exception occurs. 
----------------------------------------------------------------------------------------------------------------------------------------------------
Difference between error and exception
----------------------------------------------------------------------------------------------------------------------------------------------------
Errors       - indicate that something severe enough has gone wrong, the application should crash rather than try to handle the error.

Exceptions   - are events that occurs in the code. A programmer can handle such conditions and take necessary corrective actions. 

Few examples:
				
NullPointerException				 – When you try to use a reference that points to null.
ArithmeticException					 – When bad data is provided by user, for example, when you try to divide a number by zero this exception occurs 
									   because dividing a number by zero is undefined.
ArrayIndexOutOfBoundsException 		 – When you try to access the elements of an array out of its bounds, for example array size is 5 
									   (which means it has five elements) and you are trying to access the 10th element.
----------------------------------------------------------------------------------------------------------------------------------------------------
Types of exceptions
----------------------------------------------------------------------------------------------------------------------------------------------------
There are two types of exceptions in Java:

1)Checked exceptions
2)Unchecked exceptions

----------------------------------------------------------------------------------------------------------------------------------------------------
Checked exceptions
----------------------------------------------------------------------------------------------------------------------------------------------------
All exceptions the compiler checks during compilation to see whether the programmer has handled them or not. 
If these exceptions are not handled/declared in the program, you will get compilation error. For example, SQLException, IOException, ClassNotFoundException etc.
----------------------------------------------------------------------------------------------------------------------------------------------------
Unchecked Exceptions
----------------------------------------------------------------------------------------------------------------------------------------------------
Runtime Exceptions are also known as Unchecked Exceptions. it’s the responsibility of the programmer to handle these exceptions and provide a safe exit. 
For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc.

 - "Compiler will never force you to catch such exception or force you to declare it in the method using throws keyword"
----------------------------------------------------------------------------------------------------------------------------------------------------
Difference between throw and throws in java
----------------------------------------------------------------------------------------------------------------------------------------------------
1. Throws clause is used to declare an exception, which means it works similar to the try-catch block.
   throw keyword is used to throw an exception explicitly.

2. If we see syntax wise than throw is followed by an instance of Exception class and throws is followed by exception class names.
----------------------------------------------------------------------------------------------------------------------------------------------------
For example:

throw new ArithmeticException("Arithmetic Exception");
and

throws ArithmeticException;
----------------------------------------------------------------------------------------------------------------------------------------------------
3. Throw keyword is used in the method body to throw an exception, while throws is used in method signature to declare the exceptions that can occur 
   in the statements present in the method.

For example:
Throw:

...
void myMethod() {
   try {
      //throwing arithmetic exception using throw
      throw new ArithmeticException("Something went wrong!!");
   } 
   catch (Exception exp) {
      System.out.println("Error: "+exp.getMessage());
   }
}
...
----------------------------------------------------------------------------------------------------------------------------------------------------
Throws:

...
//Declaring arithmetic exception using throws
void sample() throws ArithmeticException{
   //Statements
}
...
4. You can throw one exception at a time but you can handle multiple exceptions by declaring them using throws keyword.
For example:
Throw:

void myMethod() {
   //Throwing single exception using throw
   throw new ArithmeticException("An integer should not be divided by zero!!");
}
..
Throws:

//Declaring multiple exceptions using throws
void myMethod() throws ArithmeticException, NullPointerException{
   //Statements where exception might occur
}
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Example of THROW Keyword
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

/* In this program we are checking the Student age
 * if the student age<12 and weight <40 then our program 
 * should return that the student is not eligible for registration.
 */
public class ThrowExample {
   static void checkEligibilty(int stuage, int stuweight){ 
      if(stuage<12 && stuweight<40) {
         throw new ArithmeticException("Student is not eligible for registration"); 
      }
      else {
         System.out.println("Student Entry is Valid!!"); 
      }
   } 

   public static void main(String args[]){ 
     System.out.println("Welcome to the Registration process!!");
     checkEligibilty(10, 39); 
     System.out.println("Have a nice day.."); 
 } 
}
Output:

Welcome to the Registration process!!Exception in thread "main" 
java.lang.ArithmeticException: Student is not eligible for registration
at beginnersbook.com.ThrowExample.checkEligibilty(ThrowExample.java:9)
at beginnersbook.com.ThrowExample.main(ThrowExample.java:18)
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Example of throws Keyword
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
In this example the method myMethod() is throwing two checked exceptions so we have declared these exceptions in the method signature using throws Keyword. 
If we do not declare these exceptions then the program will throw a compilation error.

import java.io.*;
class ThrowExample { 
  void myMethod(int num)throws IOException, ClassNotFoundException{ 
     if(num==1)
        throw new IOException("IOException Occurred");
     else
        throw new ClassNotFoundException("ClassNotFoundException");
  } 
} 

public class Example1{ 
  public static void main(String args[]){ 
   try{ 
     ThrowExample obj=new ThrowExample(); 
     obj.myMethod(1); 
   }catch(Exception ex){
     System.out.println(ex);
    } 
  }
}
Output:

java.io.IOException: IOException Occurred
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
EJEMPLO  CLASE QUE MANEJA EXCEPTION CREADA POR NOSOTROS Custom_Exception
public class JavaException {
public static void main(String args[]){
try{
throw new MyException(2);
// throw is used to create a new exception and throw it.
}
catch(MyException e){
System.out.println(e) ;
}
}
} // AQUI ESTA HEREDANDO DE LA CLASE Exception PARA CREAR NUESTRA PROPIA EXCEPTION
class MyException extends Exception{
int a;
MyException(int b) {
a=b;
}
public String toString(){
return ("Exception Number = "+a) ;
}
}




























