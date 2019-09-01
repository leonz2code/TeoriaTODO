----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Programación multi-thread en Java. Procesos asíncronos usando hilos
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Cuando se crea una aplicación que puede ser utilizada por múltiples instancias (personas, máquinas y demás) simultáneamente (típico caso de un cliente - servidor) 
es muy común la creación de hilos para cada una de las instancias que ingresa o interactúa con nuestro sistema permitiendo así evitar problemas con lo que se conoce como código bloqueante. 
El código bloqueante, es un segmento de código (un método o función) que tarda una cantidad considerable de tiempo en ejecutarse(5s Ex)y que de no ser por tener diferentes hilos 
asignados para cada usuario ejecutándose independientemente uno del otro, bloquearía la aplicación para los demás mientras alguno realiza el proceso bloqueante.
++++++++++++++++++++++++++++++++++
Síncrono ---- En palabras más simples, si es sincronizado, las transacciones hacen fila para ser atendidas, como en las dependencias de gobierno, pasan de 1 por 1
++++++++++++++++++++++++++++++++++
A envía mensaje a B y se detiene
A espera respuesta de B
A recibe respuesta de B
A continua con su ejecución
++++++++++++++++++++++++++++++++++
Asíncrono --- Si no es sincronizado, es como los carros en los semáforos de Gdl, todos pasan sin un orden
++++++++++++++++++++++++++++++++++
A envía mensaje a B y continua su ejecución
A recibe respuesta de B
Diferencias
***************************************************************************************************************************************************************************************************
básicamente la diferencia es que
***************************************************************************************************************************************************************************************************
sincrono  :  la invocacion espera el resultado, o sea invocas a un metodo y te quedas en ese punto esperando hasta tanto se devuelva un resultado (o un error)

asincrono : realzias la invocacion pero continuas con la ejecucion, la invocacion continua y por lo general se define un callback (o sea algun metodo o funcion) 
		    que recibira la respuesta o el error para toamr alguna accion pero en este ultimo la ejecucion no se queda esperando la respuesta continua sin bloquear la ejecucion del hilo actual
			
***************************************************************************************************************************************************************************************************			
The process of executing multiple threads simultaneously is known as multithreading.
***************************************************************************************************************************************************************************************************
Let’s summarize the discussion in points:
1. The main purpose of multithreading is to provide simultaneous execution of two or more parts of a program to maximum utilize the CPU time. 
   A multithreaded program contains two or more parts that can run concurrently. Each such part of a program called thread.
2. Threads are lightweight sub-processes, they share the common memory space. In Multithreaded environment, programs that are benefited from multithreading, 
   utilize the maximum CPU time so that the idle time can be kept to minimum.
3. A thread can be in one of the following states:

NEW  				– A thread that has not yet started is in this state.                                 NERUTEBLOWATI
RUNNABLE 			– A thread executing in the Java virtual machine is in this state.
BLOCKED 			– A thread that is blocked waiting for a monitor lock is in this state.
WAITING 			– A thread that is waiting indefinitely for another thread to perform a particular action is in this state.
TIMED_WAITING 		– A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state.
TERMINATED 			– A thread that has exited is in this state.

A thread can be in only one state at a given point in time.			
***************************************************************************************************************************************************************************************************
What are Java Threads?
***************************************************************************************************************************************************************************************************
A thread is a:

 - Facility to allow multiple activities within a single process
 - Referred as lightweight process
 - A thread is a series of executed statements
 - Each thread has its own program counter, stack and local variables
 - A thread is a nested sequence of method calls
 - Its shares memory, files and per-process state
 
Whats the need of a thread or why we use Threads?

 - To perform asynchronous or background processing
 - Increases the responsiveness of GUI applications
 - Take advantage of multiprocessor systems
 - Simplify program logic when there are multiple independent entities
***************************************************************************************************************************************************************************************************
What happens when a thread is invoked?
***************************************************************************************************************************************************************************************************
When a thread is invoked, there will be two paths of execution. One path will execute the thread and the other path will follow the statement after the thread invocation. 
There will be a separate stack and memory space for each thread.
***************************************************************************************************************************************************************************************************
Risk Factor
***************************************************************************************************************************************************************************************************
 - Proper co-ordination is required between threads accessing common variables [use of synchronized and volatile] for consistence view of data
 - overuse of java threads can be hazardous to program’s performance and its maintainability.
***************************************************************************************************************************************************************************************************
Threads in Java
***************************************************************************************************************************************************************************************************
Java threads facility and API is deceptively simple:
Every java program creates at least one thread [ main() thread ]. Additional threads are created through the Thread constructor or by instantiating classes that extend the Thread class.
***************************************************************************************************************************************************************************************************
Thread creation in Java
***************************************************************************************************************************************************************************************************
Thread implementation in java can be achieved in two ways:

Extending the java.lang.Thread class
Implementing the java.lang.Runnable Interface
Note: The Thread and Runnable are available in the   java.lang.* package

// ARCHIVO APARTE LeoJavaThreadCreation.java

Before we begin with the programs(code) of creating threads, let’s have a look at these methods of Thread class. We have used few of these methods in the example below.

getName(): 			It is used for Obtaining a thread’s name
getPriority():	 	Obtain a thread’s priority
isAlive(): 			Determine if a thread is still running
join():				Wait for a thread to terminate
run(): 				Entry point for the thread
sleep(): 			suspend a thread for a period of time
start(): 			start a thread by calling its run() method



