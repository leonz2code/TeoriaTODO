---------------------------------------------------------------------------------------------------------------------------
Try Catch in Java
---------------------------------------------------------------------------------------------------------------------------
Try block
---------------------------------------------------------------------------------------------------------------------------
The try block contains set of statements where an exception can occur. A try block is always followed by a catch block, 
which handles the exception that occurs in associated try block. A try block must be followed by catch blocks or finally block or both.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Syntax of try block
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
try{
   //statements that may cause an exception
}
While writing a program, if you think that certain statements in a program can throw a exception, enclosed them in try block and handle 
that exception
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Catch block
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
A catch block is where you handle the exceptions, this block must follow the try block. A single try block can have several catch blocks associated with it. 
You can catch different exceptions in different catch blocks. When an exception occurs in try block, the corresponding catch block that handles that 
particular exception executes. For example if an arithmetic exception occurs in try block then the statements enclosed in catch block for 
arithmetic exception executes.
---------------------------------------------------------------
Syntax of try catch in java
try
{
     //statements that may cause an exception
}
catch (exception(type) e(object))‏
{
     //error handling code
}
---------------------------------------------------------------------------------------------------------------------------
Example: try catch block
---------------------------------------------------------------------------------------------------------------------------
If an exception occurs in try block then the control of execution is passed to the corresponding catch block. 
A single try block can have multiple catch blocks associated with it, you should place the catch blocks in such a way that the generic exception handler 
catch block is at the last(see in the example below).
The generic exception handler can handle all the exceptions but you should place is at the end, if you place it at the before all the catch blocks 
then it will display the generic message. You always want to give the user a meaningful message for each type of exception rather then a generic message.
---------------------------------------------------------------------------------------------------------------------------
Example of Multiple catch blocks
---------------------------------------------------------------------------------------------------------------------------
class Example2{
   public static void main(String args[]){
     try{
         int a[]=new int[7];
         a[4]=30/0;
         System.out.println("First print statement in try block");
     }
     catch(ArithmeticException e){
        System.out.println("Warning: ArithmeticException");
     }
     catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Warning: ArrayIndexOutOfBoundsException");
     }
     catch(Exception e){
        System.out.println("Warning: Some Other exception");
     }
   System.out.println("Out of try-catch block...");
  }
}
Output:

Warning: ArithmeticException
Out of try-catch block...
---------------------------------------------------------------------------------------------------------------------------
In the above example there are multiple catch blocks and these catch blocks executes sequentially when an exception occurs in try block. 
Which means if you put the last catch block ( catch(Exception e)) at the first place, just after try block then in case of any exception 
this block will execute as it can handle all exceptions. This catch block should be placed at the last to avoid such situations.














