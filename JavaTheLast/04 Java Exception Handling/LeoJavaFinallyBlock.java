---------------------------------------------------------------------------------------------------------------------------
Java Finally block
---------------------------------------------------------------------------------------------------------------------------
A finally block contains all the crucial statements that must be executed whether exception occurs or not. The statements present in this block 
will always execute regardless of whether exception occurs in try block or not such as closing a connection, stream etc.
---------------------------------------------------------------------------------------------------------------------------
Syntax of Finally block
---------------------------------------------------------------------------------------------------------------------------
try {
    //Statements that may cause an exception
}
catch {
   //Handling exception
}
finally {
   //Statements to be executed
}
---------------------------------------------------------------------------------------------------------------------------
A Simple Example of finally block
---------------------------------------------------------------------------------------------------------------------------
Here you can see that the exception occurred in try block which has been handled in catch block, after that finally block got executed.

class Example
{
   public static void main(String args[]) {
      try{  
	 int num=121/0;  
	 System.out.println(num);  
      }  
      catch(ArithmeticException e){
         System.out.println("Number should not be divided by zero");
      }  
      /* Finally block will always execute
       * even if there is no exception in try block
       */
      finally{
	 System.out.println("This is finally block");
      }  
      System.out.println("Out of try-catch-finally");  
   }   
}
Output:

Number should not be divided by zero
This is finally block
Out of try-catch-finally
---------------------------------------------------------------------------------------------------------------------------
Few Important points regarding finally block
---------------------------------------------------------------------------------------------------------------------------
1. A finally block must be associated with a try block, you cannot use finally without a try block. You should place those statements in this block that must be executed always.

2. Finally block is optional, a try-catch block is sufficient for exception handling, however if you place a finally block then it will always run after the execution of try block.

3. In normal case when there is no exception in try block then the finally block is executed after try block. However if an exception occurs then the catch block is executed before finally block.

4. An exception in the finally block, behaves exactly like any other exception.

5. The statements present in the finally block execute even if the try block contains control transfer statements like return, break or continue.
---------------------------------------------------------------------------------------------------------------------------
Cases when the finally block doesn’t execute
---------------------------------------------------------------------------------------------------------------------------
The circumstances that prevent execution of the code in a finally block are 3:
1– The death of a Thread
2– Using of the System.exit() method.
3– Due to an exception arising in the finally block.
---------------------------------------------------------------------------------------------------------------------------
Finally and Close()
---------------------------------------------------------------------------------------------------------------------------
close() statement is used to close all the open streams in a program. Its a good practice to use close() inside finally block. 
Since finally block executes even if exception occurs so you can be sure that all input and output streams are closed properly regardless of whether the exception occurs or not.










