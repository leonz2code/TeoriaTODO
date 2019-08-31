********************************************************************************************************
Java AutoCloseable Interface Example
********************************************************************************************************
Posted by: Sotirios-Efstathios Maneas  in Core Java October 22nd, 2014 0 2816 Views

In this tutorial we will discuss about the AutoCloseable interface in Java. This interface represents an object 
that holds its resources until it is closed. Examples of such resources are a file handler and a socket handler.

The close() method of an Object that implements the AutoCloseable interface is called automatically, 
when exiting a try-with-resources block and that object has been declared in the resource specification header.

The AutoCloseable interface exists since the 1.7 version of Java.

---------------------------------------------------------------------------------------------------------------------------------
The try-with-resources statement
---------------------------------------------------------------------------------------------------------------------------------
The try-with-resources statement is a try statement, introduced in Java 1.7, which declares a number of resources. The resources are objects that must be closed, 
once an application stops processing them, in order to be collected by the Garbage Collector and for memory space to be reclaimed. 
A try-with-resources statement makes sure that all declared resources will be closed at the end of the statement. 
Thus, this statement aims to ensure proper release of resources, avoiding memory exhaustion and possible errors that may occur.

-Using try-with-resources
Simply put, to be auto-closed, a resource must be both declared and initialized inside the try, as shown below:


try (PrintWriter writer = new PrintWriter(new File("test.txt"))) {
    writer.println("Hello World");
}
--------------------------------------------
PrintStream example
--------------------------------------------
In this example, we will copy the contents of one source file to another destination file, but instead of using an instance of the BufferedWriter class, 
we will use an instance of the PrintStream class:













